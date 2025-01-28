def make_readable(seconds):
    min = 0

    for num in range(seconds):
        if num % 60 == 0:
            min += 1

    
    

    return (min // 60), (seconds // 60)

print(make_readable(86400))




