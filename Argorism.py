import sys
def num():
    s = list(map(int, input()))

    zero = []
    one = []

    for _ in range(len(s)): zero.append(0)
    for _ in range(len(s)): one.append(1)

    z_count = 0; o_count =0; count = 0; num = 0

    while True:
        for i in range(len(s)-1):
            if s[i]!=s[i+1]:
                if i+1==len(s)-1:
                    if s[i+1]==0:
                        s[i+1]=1
                    else:
                        s[i+1]=0
                    count+=1;print(count);sys.exit()
                if s[i+1]==0:
                    s[i+1]=1;o_count+=1
                elif s[i+1==1]:
                    s[i+1]=0;z_count+=1
                if (o_count>=1 and s[i+1]==s[i+2]) or (z_count>=1 and s[i+1]==s[i+2]):
                    count+=1


        if s==zero or s==one: break

    print(count)








num()
