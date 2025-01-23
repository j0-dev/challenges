def count_sheeps(sheep):
    sheep_present = 0
    
    for i in sheep:
        if i == True:
            sheep_present += 1

    return sheep_present

# Test
sheep = [True,  True,  True,  False,
        True,  True,  True,  True ,
        True,  False, True,  False,
        True,  False, False, True ,
        True,  True,  True,  True ,
        False, False, True,  True]

print(count_sheeps(sheep))