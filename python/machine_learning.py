import pandas as pd
import numpy as np

data={"name":["sahil","ayush","atik"],"age":[16,17,18],"gender":["male","male","male"]}
a=pd.DataFrame(data)
print(a)
a.to_csv("mydata.csv")
iris_dataset = pd.read_csv("IRIS.csv")
iris_dataset.to_csv("new.csv",index=False)
print(iris_dataset.shape)
print(iris_dataset.columns)
print(iris_dataset["petal_width"])
print(iris_dataset.head(np.random.randint(0,150)))
print(iris_dataset.sample(10))
print(iris_dataset["species"].unique())
print(iris_dataset["petal_width"].mean())
print(iris_dataset["petal_width"].mode())
print(iris_dataset["petal_width"].median())
print(iris_dataset["petal_width"].max())
print(iris_dataset["petal_length"].min())