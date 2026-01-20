def solution(my_string, overwrite_string, s):
    answer = ''
    
    start = my_string[ : s]
    end = my_string[len(start)+len(overwrite_string):]
    # end = my_string[s+len(overwrite_string):]
    
    answer = start + overwrite_string + end
    
    return answer