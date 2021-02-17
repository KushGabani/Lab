myList = ["Hi", "Hello", "Bye", "Whatever", "Blah", "LOL", "Hehehe"]

# Iterate over each value of the list
for value in myList:
    print(myList)

# Access first 3 values of the list
print(myList[:3])

# Access last value of the list
print(myList[-1])

# Access 2nd to 5th value in the list
print(myList[1:4])

# Sort a list
sorted(myList)

# Sort a list in descending order
reversed(sorted(myList))

# Reverse a list
newList = myList[::-1]

# Change first letter of every word in the list
newList = [(str(word[0]).upper() + word[1:]) for word in myList]

print(sum(myList)) # Sum of all values in the list (if the list has integer value)
print(min(myList)) # Minimum value in the list
print(max(myList)) # Maximum value in the list

# find frequency of words in a list
from collections import Counter
freq = dict(Counter(mtList))

# Split a sentence into a list
string = "Hello, I don't know what this is."
newList = string.split() 