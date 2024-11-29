#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
 
    vector <tuple <int, int, int>> Gr[501];
    while (m--)
    {
        int s, e, t, g; cin >> s >> e >> t >> g;
        Gr[s].emplace_back(e, t, g);
    }
 
    priority_queue <tuple <int, int, int>> pq;
    vector <vector <int>> dist(501, vector <int>(501, 2e9));
 
    for (pq.push({ dist[1][0] = 0, 1, 0 }); pq.size();)
    {
        auto [cost, now, cnt](pq.top()); pq.pop();
        if (dist[now][cnt] < (cost *= -1))
            continue;
 
        for (auto& [nxt, weight, g] : Gr[now])
        {
            int cur(cost + weight);
            if (!(cost % g))
            {
                if (dist[nxt][cnt] > cur)
                    pq.push({ -(dist[nxt][cnt] = cur), nxt, cnt });
            }
            else
            {
                if (cnt < k && dist[nxt][cnt + 1] > cur)
                    pq.push({ -(dist[nxt][cnt + 1] = cur), nxt, cnt + 1 });
 
                cur = cost / g * g + g + weight;
                if (dist[nxt][cnt] > cur)
                    pq.push({ -(dist[nxt][cnt] = cur), nxt, cnt });
            }
        }
    }
 
    int ans(*min_element(dist[n].begin(), dist[n].end()));
    cout << (ans < 2e9 ? ans : -1);
}
