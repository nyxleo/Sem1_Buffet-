import requests

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer
p = input("Which Pokemon do you want to learn about? ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/" + p).json()
print("Pokemon name is", end = " ")
print(pokemon["name"])
print(p + "'s weight is", end = " ")
print(pokemon["weight"], end = " lbs")
print("")
print(p + "'s height is" , end = " ")
print(pokemon["height"], end = " feet")
print()