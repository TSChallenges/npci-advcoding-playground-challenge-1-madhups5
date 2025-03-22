class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;


   // Constructor
   public StockPortfolio(String symbol, int quantity, double buyingPrice) {
    if (quantity <= 0 || buyingPrice <= 0) {
        throw new IllegalArgumentException("Quantity and buying price must be positive.");
    }
    this.symbol = symbol;
    this.quantity = quantity;
    this.buyingPrice = buyingPrice;
    this.currentPrice = buyingPrice;
    this.highestPrice = buyingPrice;
}

// Update
public void updatePrice(double newPrice) {
    if (newPrice <= 0) {
        throw new IllegalArgumentException("Price must be positive.");
    }
    this.currentPrice = newPrice;
    if (newPrice > this.highestPrice) {
        this.highestPrice = newPrice;
    }
}
public double calculateProfit() {
    return (currentPrice - buyingPrice) * quantity;
}

public double getCurrentValue() {
    return currentPrice * quantity;
}
}
