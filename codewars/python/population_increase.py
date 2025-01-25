def nb_year(p0, percent, aug, p):
    years = 0
    current_pop = p0

    while current_pop < p:
        growth = int(current_pop * (percent / 100))
        current_pop += growth + aug
        years += 1

    return years