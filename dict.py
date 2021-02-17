myDict = {
    1: "Hello",
    5: "Nice",
    2: "Bye",
    10: "Hi"
}

# Sort a dictionary by value
sortedDict = dict(sorted(myDict.items(), key = lambda x: x[0]))

# Sort a dictionary by key
sortedDict = dict(sorted(myDict.items(), key = lambda x: x[1]))

# get all the keys in the dictionary
keyList = sortedDict.keys()

# get all the values in the dictionary
keyList = sortedDict.values()

# Convert the dictionary to a list of tuples. ex - [(1, "Hello"), (5, "Nice"), (2, "Bye"), (10, "Hi")]
lot = myDict.items()

# Iterate over each key value pair in the dictionary
for key, value in myDict.items():
    print("Key : " + key)
    print("Value : " + value)

# Iterate over the keys onli
for key in myDict.keys():
    print(key)

# Iterate over the values onli
for val in myDict.values():
    print(val)