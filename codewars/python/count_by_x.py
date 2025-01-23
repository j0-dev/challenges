def count_by(x, n):
    
    num_list = []
    multiple = x

    for i in range(0, n):
        num_list.append(x)
        x = x + multiple
    
    return num_list

integer = 2
count = 5

print(count_by(integer, count))