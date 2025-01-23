def dna_to_rna(dna):
    
    rna_str = ""

    for letter in dna:
        if letter == "T":
            rna_str += "U"
        else:
            rna_str += letter

    return rna_str

test = "GCAT"
print(dna_to_rna(test))