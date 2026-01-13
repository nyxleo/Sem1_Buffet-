#Run "pip install yfinance" in a terminal

import yfinance as yf

#stock = yf.Ticker("GOOGL")
#current_price = stock.history(period="1d")["Close"][0]
#info = stock.info

#print(info["longName"])
#print(info["website"])
#print("GOOGL Current Price:", current_price)
T = ["AMZN", "TGT", "WMT", "TLSA", "ADBE", "JNJ", "LLY", "JPM", "NKE", "AMD"  ] 
thelist = []

for i in range(0, 10):
    stock = yf.Ticker(T[i])
    current_price = stock.history(period="1d")["Close"][0]
    info = stock.info
    print(info["longName"])
    print(info["website"])
    print(str(i) + "Current Price:", current_price)
    
 
x = input("What Ticker do you want to see:")
stock = yf.Ticker(x)
current_price = stock.history(period="1d")["Close"][0]
info = stock.info

print(info["longName"])
print(info["website"])
print(str(x) + "Current Price:", current_price)
 