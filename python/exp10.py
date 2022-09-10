class employee:

    def __init__(self,firstname,lastname,pay):
        self.firstname=firstname
        self.lastname=lastname
        self.pay=pay


    
    def email(self):
        return(self.firstname+self.lastname +"@company.com")    

e1=employee("Mohandas","Gandhi",50000) 
print(e1.firstname)
print(e1.lastname)
print(e1.pay)
print(e1.email()) 

class vehicle:
    color="white"

    def __init__(self,name,mileage,maxspeed):
        self.name=name
        self.mileage=mileage
        self.maxspeed=maxspeed

    def seat_capacity(self,capacity):
        print(f"the capacity of {self.name} is {capacity} passengers") 


class bus(vehicle):
    def __init__(self):
        super().__init__("Bus",70,100)
        super().seat_capacity(50)

v1=vehicle("car",50,120)
b1=bus()
print(b1.name)   
print(b1.mileage)
print(b1.color)
print(b1.maxspeed)   

        






