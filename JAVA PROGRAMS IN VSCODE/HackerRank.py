# a="Akki "
# b="Jangid"
# print(a+b)
from unicodedata import name


i=5
# for a in i:
#     dict= { "input(a)" : "input(a)"
#     }
# myName= input("What is your Name : ")
myName = input()
num= int(input("How many hobbies do u have : "))
# for a in num:
print("What are your Hobbies : ")
myHobby= []
while num>0 : 
    myHobby= input()
    num=-1
    
dict = { "Name" : "Akki",
        "Education" : "BCA",
        "Hobbies" : ['Gaming', 'Coding', 'Football', 'Listening Music']
        }

print(dict.values())