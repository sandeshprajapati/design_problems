#Observer Design Pattern - Stock Price Monitoring
Imagine a stock market application where investors are monitoring specific stock prices. When a stock price changes, all the investors who are subscribed to that stock should be notified automatically.

##Components:

*StockPriceSubject: The subject that holds the stock price and notifies investors (observers) whenever the price changes.*
*InvestorObserver: The observer that reacts to price changes by receiving updates about the stock price.*
*ConcreteStockPriceSubject: A class that extends the StockPriceSubject and holds the actual stock price.*
*ConcreteInvestorObserver: A class that implements the InvestorObserver and reacts when the stock price changes.*