from filecmp import clear_cache


class calculator:
    def __init__(self,num):
        self.number=num

    def square(self):
        return(f"the square ofnumber is {self.number**2}")
    def cube(self):
        return(f"the cube of number is {self.number**3}")        
    def squareroot(self):
        return(f"the sqaure root of number i s{self.number**0.5}")

a=calculator(9)
b=calculator(23)
print(a.square())
print(a.cube())
print(a.squareroot())
print(b.square())
print(b.cube())
print(b.squareroot())