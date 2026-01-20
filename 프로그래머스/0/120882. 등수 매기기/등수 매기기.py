def solution(score):
    answer = []
    
#     for i in score:
#         answer[i] = (score[i][0]+score[i][1])/2
    
    avg = []
    for i,j in score:
        avg.append((i+j)/2)
    avgsort = sorted(avg, reverse=True)
    
    for i in avg:
        answer.append(avgsort.index(i)+1)
    return answer