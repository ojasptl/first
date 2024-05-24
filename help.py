from jackofalltrades.Models import LinearRegression
from jackofalltrades.datasets import get_dataset

def main():
    dst = get_dataset()
    x, y = dst.get_bitcoin()
    lnr = LinearRegression(x, y)
    lnr.fit()
    lnr.evaluate(y, lnr.predict(x))

main()