def count_bits(n):
    binary = bin(n)
    binary_string = str(binary[2:])
    count = binary_string.count("1")
    return count

    
print(count_bits(1234))


