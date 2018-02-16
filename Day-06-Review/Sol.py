#n - Number of input
n = int(input().strip())

#taking input a[start:stop:step]

for i in range(0,n):
    string = input()
  # start value none , end not mentioned
    even = string[0::2] 
    odd  = string[1::2]
    print(even + " " + odd)
