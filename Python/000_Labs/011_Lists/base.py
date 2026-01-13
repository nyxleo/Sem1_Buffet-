import random

jokes = [
    "Why did the scarecrow win an award? Because he was outstanding in his field!",
    "What do you call fake spaghetti? An impasta!",
    "Why did the math book look sad? It had too many problems.",
    "What did the ocean say to the beach? Nothing, it just waved.",
    "Why can’t your nose be 12 inches long? Because then it would be a foot!"
]

num = random.randrange(0, 5)
print(jokes[num])