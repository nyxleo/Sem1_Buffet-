# Type "pip install sklearn" into the terminal
import json
import random
import joblib
from datetime import datetime
import requests

model = joblib.load("./Buffet_Poole26/Python/001_Final/intents.pkl")

with open("./Buffet_Poole26/Python/001_Final/intents.json") as file:
    data = json.load(file)["intents"]

def get_response(tag):
    i = []
    for intent in data:
        if intent["tag"] == tag:
            i = intent
            break
    response = random.choice(i["responses"])
    return response
    
print("Welcome to nyx, the bot about the block game")

while True: 
    user_input = input("You: ")
    
    if user_input.lower() == "exit": 
        print("Good Bye!")
        break 
    
    predicted_tag = model.predict([user_input])[0]
    response =  get_response(predicted_tag)
    
    print("nyx: " + response)