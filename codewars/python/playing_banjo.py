def playing_banjo(name):
    name_letters = []
    for char in name:
        name_letters.append(char)

    if name_letters[0] == "R" or name_letters[0] == "r":
        return name + " plays banjo"
    else:
        return name + " does not play banjo"
    
print(playing_banjo("Dave"))
