def get_sum(a, b):
    lower, upper = min(a, b), max(a, b)
    n = upper - lower + 1
    return (n * (lower + upper)) // 2

