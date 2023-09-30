while 1:
    N = int(input())
    if N==-1:
        break

    l = []
    for i in range(1, N):
        if N%i==0:
            l.append(i)
    if sum(l) == N:
        print(N, ' = ', " + ".join(str(i) for i in l), sep='')
    else:
        print(N, 'is NOT perfect.')