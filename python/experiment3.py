from matplotlib import pyplot as plt
x=[1,2,3,4,6,8]
y=[4,5,6,1,2,4]
plt.scatter(y,x,color="g",label="dots")
plt.scatter([3,7,8,1,3],[1,4,7,8,9],color="c",label="new dots")
plt.title("my graph")
plt.xlabel="x-axis"
plt.ylabel="y-axis"
plt.legend()
plt.show()