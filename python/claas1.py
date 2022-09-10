class programmer:
    company="microsoft"
    def __init__(self,name,age,salary):
        self.name=name
        self.age=age
        self.salary=salary

    def information(self):
        return(f"the name of programmere is {self.name} and his age is {self.age} with salary {self .salary}")

a=programmer("sahil",19,100000)
b=programmer("ayush",19,20000)
print(a.information())
print(b.information())
print(type(a))
