# # BASICS OF PYTHON

# a1 = 2
# abc_2 = 2.2
# ab_123 = "srinff"

# print(a1)
# print(abc_2)
# print(ab_123)

# print(type(a1))

# a2 = int(input("Enter integer value:"))
# a3 = float(input("Enter integer value:"))
# print(a2)
# print(a3)



# # DATA TYPES
# int, str, float, bool, list/array, tuple, dict, set

# a = True
# print(type(a))

# a3 = [1, 2, 3, 4]
# print(a3)
# print(len(a3))


# # PANDAS AND NUMPY

import pandas as pd, numpy as np

# a4 = np.array([1, 2, 3, 4, 5, 6])
# print(a4)
# print(type(a4))

# a7 = {
#     1: "Aakriti",
#     2: "Madhav"
# }
# print(a7[1])
# print(type(a7))


# # SET
# a8 = {1, 2, 1, 2, 3, 3}
# print(a8)
# print(type(a8))

a9 = pd.read_excel("misc/sample_data.xlsx")
print(a9)
print(type(a9))
print(a9.head())    # prints first 5 by default
print(a9.tail())    # prints last 5 by default