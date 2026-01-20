import heapq
def solution(n, works):
    answer = 0
    #예외처리: 처음부터 야근할 필요 없다면? 
    if sum(works) <= n:
        return 0
    # 음수값으로 변경 후 힙큐 적용 
    works=[-i for i in works]
    heapq.heapify(works) #힙큐자료구조로 변경  
    
    # 남은 작업 시간동안 동작
    for i in range(n):
        # 가장 큰 값 꺼내서
        temp = heapq.heappop(works)
        # 1차감하고
        temp += 1
        # 다시넣고
        heapq.heappush(works, temp)
    
    # 야근지수 구하기 (모든 값 제곱)
    for i in works:
        answer+=i*i

    return answer