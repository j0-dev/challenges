def lovefunc(flower1, flower2):
    
    if flower1 % 2 == 0 and flower2 % 2 != 0:
        return True
    elif flower1 % 2 != 0 and flower2 % 2 == 0:
        return True
    else:
        return False
    
flower1 = 224
flower2 = 582

print(lovefunc(flower1, flower2))