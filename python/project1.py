import random
print("welcome to the game:")
print("enter 1 for snake:")
print("enter 2 for gun:")
print("enter3 for water:")
comp_choice=random.randint(1,3)
if(comp_choice==1):
    choice="snake"
elif(comp_choice==2):
    choice="gun"
else:
    choice="water"
your_choice=int(input("choose your number b/w 0 to 4:"))
if(your_choice==1):
    play="snake"
elif(your_choice==2):
    play="gun"
else:
    play="water"    
if(choice=="gun" and play=="snake"):
    print("comp wins")
elif(choice=="gun" and play=="gun"):
    print("game tie")
elif(choice=="gun" and play=="water"):
    print("you win")
elif(choice=="snake"and play=="snake"):
    print("game tie")
elif(choice=="snake"and play=="gun"):
    print("you win")      
elif(choice=="snake"and play=="water"):
    print("comp win")
elif(choice=="water"and play=="snake"):
    print("you win")
elif(choice=="water"and play=="gun"):
    print("comp win")    
elif(choice=="water"and play=="water"):
    print("game tie")    
