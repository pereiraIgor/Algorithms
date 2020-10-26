def power(number, pow):
    if (pow == 0): return 1
    if (pow%2 == 0): return power((number*number)%1000000007,(pow/2)%1000000007)
    else: return (number%1000000007)*(power(number,pow-1))%1000000007



n = int(input())
m = int(input())
print (power(n,m)%1000000007)