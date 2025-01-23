# def count_bits(n):
#     binary_nums = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192]
#     bit_total = 0
#     start_number = n

#     current = start_number

#     for number in binary_nums:
#         current -= binary_nums
#         if current <= 1:
#             break  

#     return bit_total

# print(count_bits(1234))

num = 9
bit_total = 0
binary_nums = [1, 2, 4, 8, 16]

for i in reversed(binary_nums[:]):
    if i > num:
        pass
    elif i <= num 

