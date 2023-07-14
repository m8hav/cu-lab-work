print()

def fuzzy_union(set1, set2):
    set3 = {}
    for key in set1:
        set3[key] = max(set1[key], set2[key])
    return set3

def fuzzy_intersection(set1, set2):
    set3 = {}
    for key in set1:
        set3[key] = min(set1[key], set2[key])
    return set3

def fuzzy_complement(set1):
    set2 = {}
    for key in set1:
        set2[key] = 1 - set1[key]
    return set2

def fuzzy_vector_product(set1, set2):
    set3 = {}
    for key in set1:
        set3[key] = set1[key]*set2[key]
    return set3

def fuzzy_sum(set1, set2):
    set3 = {}
    for key in set1:
        set3[key] = set1[key] + set2[key] - set1[key]*set2[key]
    return set3

def fuzzy_difference(set1, set2):
    return fuzzy_complement(fuzzy_intersection(set1, set2))

def fuzzy_disjunctive_sum(set1, set2):
    return fuzzy_union(
        fuzzy_intersection(fuzzy_complement(set1), set2),
        fuzzy_intersection(set1, fuzzy_complement(set2))
        )

def fuzzy_cartesian_product(set1, set2):
    matrix = []
    for key_1 in set1:
        row = []
        for key_2 in set2:
            row.append(set1[key_1] * set2[key_2])
        matrix.append(row)
    return matrix

def fuzzy_scalar_product(set1, alpha):
    set2 = {}
    for key in set1:
        set2[key] = set1[key]*alpha
    return set2

def fuzzy_equality(set1, set2):
    for key in set1:
        if set1[key] != set2[key]: return False
    return True

def fuzzy_power(set1, alpha):
    set2 = {}
    for key in set1:
        set2[key] = set1[key]**alpha
    return set2


set_1 = {
    'x1' : 0.4,
    'x2' : 0.5,
    'x3' : 0.6,
    'x4' : 0.7,
}
set_2 = {
    'x1' : 0.2,
    'x2' : 0.9,
    'x3' : 0.8,
    'x4' : 0.3,
}
set_3 = {
    'y1' : 0.1,
    'y2' : 0.2,
    'y3' : 0.3,
    'y4' : 0.4,
}

print("Fuzzy Union:\n", fuzzy_union(set_1, set_2), "\n")
print("Fuzzy Intersection:\n", fuzzy_intersection(set_1, set_2), "\n")
print("Fuzzy Complement:\n", fuzzy_complement(set_1), "\n")
print("Fuzzy Vector Product:\n", fuzzy_vector_product(set_1, set_2), "\n")
print("Fuzzy Sum:\n", fuzzy_sum(set_1, set_2), "\n")
print("Fuzzy Difference:\n", fuzzy_difference(set_1, set_2), "\n")
print("Fuzzy Disjunctive Sum:\n", fuzzy_disjunctive_sum(set_1, set_2), "\n")
print("Fuzzy Cartesian Product:")
[print(row) for row in fuzzy_cartesian_product(set_1, set_3)]
print("\n")
print("Fuzzy Scalar Product:\n", fuzzy_scalar_product(set_1, 0.2), "\n")
print("Fuzzy Equality:\n", fuzzy_equality(set_1, set_2), "\n")
print("Fuzzy Equality:\n", fuzzy_equality(set_1, set_1), "\n")
print("Fuzzy Power:\n", fuzzy_power(set_1, 3), "\n")