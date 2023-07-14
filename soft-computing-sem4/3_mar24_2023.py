# March 24, 2023
# IMPLEMENTING NEURAL NETWORKS



# SIMPLE NEURAL NETWORK

# # initializing values of x1, x2, and y
# x1 = 2
# x2 = 5
# y = 31

# # implementing forward propogation and backpropogation
# lr = 0.01
# w1 = 9
# w2 = 7

# for epoch in range(25):
#     y_pred = w1*x1 + w2*x2
#     error = (y-y_pred)**2
#     dEW1 = 2*(y-y_pred)*(-x1)
#     dEW2 = 2*(y-y_pred)*(-x2)

#     w1 = w1 - (lr*dEW1)
#     w2 = w2 - (lr*dEW2)

#     print(f"""
#         Epoch {epoch+1}:
#         Value of w1: {w1}
#         Value of w2: {w2}
#         Error is: {error}"""
#     )



# MULTI-VARIABLE EQUATION

# loading numpy package
import numpy as np

# setting initial values for x1, x2, x3, and y
x1 = np.random.randint(3, 12, 10)
x2 = np.random.randint(9, 18, 10)
x3 = np.random.randint(12, 20, 10)
y = x1*7 + x2*5 + x3*4

# having a glance at x 1 x 2 x 3 and y:
print(x1, x2, x3)

# reshaping y
y = y.reshape(SHAPE, 1)
print(y)

# creating a numpy array from x1, x2, x3
X = np.array([x1, x2, x3])

# transposing X
y = y.reshape(SHAPE, 1)
print(y)

# setting learning rate and initializing random values
lr = 0.0001
w = np.array([
    np.random.randn(1),
    np.random.randn(1),
    np.random.randn(1),
])

# implementing forward propogation and backpropogation
error_list = []
for i in range(50):
    y_pred = np.matmul(X, w)
    error = (y - y_pred)**2
    dEw1 = 2*np.matmul((y-y_pred).T, (-X[:, 0].reshape(SHAPE, 1)))
    dEw2 = 2*np.matmul((y-y_pred).T, (-X[:, 0].reshape(SHAPE, 1)))
    dEw3 = 2*np.matmul((y-y_pred).T, (-X[:, 0].reshape(SHAPE, 1)))

    w[0][0] = w[0][0] - lr*dEw1
    w[1][0] = w[1][0] - lr*dEw2
    w[2][0] = w[2][0] - lr*dEw3

    error_list.append(error.men())
    print(f"""
        Epoch {i+1}:
        Value of w1: {w[0][0]}
        Value of w2: {w[1][0]}
        Value of w3: {w[2][0]}
    """)