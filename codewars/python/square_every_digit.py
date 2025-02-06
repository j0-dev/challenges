# 

def square_digits(num):
    orig_nums = []
    returned_nums = []
    return_numstring = ""

    for char in str(num):
        orig_nums.append(char)

    for item in orig_nums:
        returned_nums.append(int(item)**2)
    
    for digit in returned_nums:
        return_numstring += str(digit)

    return int(return_numstring)
    



print(square_digits(9119))