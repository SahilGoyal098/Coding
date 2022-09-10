from matplotlib import pyplot as plt
import pandas as pd
from matplotlib import style
style.use("ggplot")
iris_dataset = pd.read_csv("IRIS.csv")
a=iris_dataset.petal_width
plt.hist(a,color="red",ec="k")
plt.xlabel("petal_width")
plt.ylabel("frequency")
plt.show()
