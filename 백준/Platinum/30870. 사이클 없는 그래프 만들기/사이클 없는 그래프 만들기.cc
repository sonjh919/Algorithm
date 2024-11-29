#include<iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <queue>

#define MAX_N 200001
using namespace std;
typedef pair<int, int> pii;

int N, M;
vector<int> relation[MAX_N+1];
stack<vector<pii>> toAdd; // 역순 
queue<int> toDel;

bool erased[MAX_N + 1] = { 0, };
int par[MAX_N + 1];

int Find(int a) {
    if (a == par[a]) return a;
    return par[a] = Find(par[a]);
}

bool Union(int a, int b) {
    a = Find(a);
    b = Find(b);

    if (a == b) return false;
    par[b] = a;
    return true;
}

bool hasCycle(vector<pii>& vec) {
    for (const pii& p : vec) {
        if (!Union(p.first, p.second))
            return true; // 사이클 형성 관계
    }
    return false;// 사이클 안생긴다.
}

void bfs(int n) {
    while (n) {
        int cnt = toDel.size();
        toAdd.push(vector<pii>() );
        vector<pii> &vec = toAdd.top();
        while (cnt--) {
            int curr = toDel.front();
            toDel.pop();
            if (erased[curr]) continue;
            erased[curr] = true;
            n--;

            for (int nex : relation[curr]) {
                if (erased[nex]) continue;
                vec.push_back({ curr,nex });
                toDel.push(nex);
            }
        }
    } 
}

int solve() {
    bfs(N); //관계 역순 형성 

    while (toAdd.top().empty())toAdd.pop();
    int ret = toAdd.size();
    for (int i = 1; i <= N; i++) 
        par[i] = i;
    while (!toAdd.empty()) {
        ret--;
        if (hasCycle(toAdd.top())) 
            break;
        toAdd.pop();
    }
    return ret + 1;
}

void input() {
    int K;
    cin >> N >> M >> K;

    for (int i = 0; i < M; i++) {
        int a, b;
        cin >> a >> b;
        relation[a].push_back(b);
        relation[b].push_back(a);
    }

    while(K--) {
        int a; 
        cin >> a;
        toDel.push(a);
    }
}

int main(int argc, char** argv)
{
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    input();
    cout << solve();
    return 0;
}