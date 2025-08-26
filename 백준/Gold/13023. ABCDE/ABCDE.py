node, edge = map(int, input().split())

adjArr = [[False] * node for i in range(node)]  # 인접 행렬
adjList = [[] for i in range(node)]  # 인접 리스트
edgeList = []  # 간선 리스트

for i in range(edge):
    n, m = map(int, input().split())

    adjArr[n][m] = adjArr[m][n] = True

    adjList[n].append(m)
    adjList[m].append(n)

    edgeList.append([m, n])
    edgeList.append([n, m])

for i in range(edge*2):
    for j in range(edge*2):
        A, B = edgeList[i]
        C, D = edgeList[j]
        if A == B or A == C or A == D or B == C or B == D or C == D:  # 간선 리스트
            continue
        if not adjArr[B][C]:  # 인접 행렬
            continue
        for E in adjList[D]:
            if E == A or E == B or E == C or E == D:  # 인접 리스트
                continue
            print(1)
            exit()

print(0)
