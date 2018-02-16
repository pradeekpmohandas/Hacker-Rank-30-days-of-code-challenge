num = int(input())

#dictionary data structure 
phone_book = {}

for i in range(num):
    input_line = str(input())
    input_line = input_line.split(" ") #by default split by SPACE

    name = input_line[0]
    phone = int(input_line[1]) 
    phone_book[name] = phone
    

for j in range(num):
    name = str(input())
    
    if name in phone_book:
        phone = phone_book[name]
        print(name + "=" + str(phone))
    else:
        print("Not found")
