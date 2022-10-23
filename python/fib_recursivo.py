def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n-1) + fibonacci(n-2)

v = int(input("Que termo deseja encontrar: "))
print(fibonacci(v))