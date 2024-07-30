N = int(input())
score = list(map(int,input().split()))
maxscore = max(score)
newScore = 0
for i in score:
    temp = i/maxscore*100
    newScore = newScore + temp
print(newScore/N)

    