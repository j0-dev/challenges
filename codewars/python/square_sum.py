def square_sum(n):
    sum = 0
    for num in n:
        num = num**2
        sum += num
    return sum

print(square_sum([1, 2, 2]))