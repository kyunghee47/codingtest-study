def solution(str1, str2):
    answer = ''
    list1 = list(str1)
    list2 = list(str2)
    for i in range(len(list1)):
        answer = answer + list1[i] + list2[i]

    return answer