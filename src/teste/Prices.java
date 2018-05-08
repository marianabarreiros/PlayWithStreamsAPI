package teste;

public enum Prices {
    LAKEWOOD_REG_DOW(110), LAKEWOOD_REG_WKND(90), LAKEWOOD_REW_DOW(80), LAKEWOOD_REW_WKND(80),
    BRIDGEWOOD_REG_DOW(160), BRIDGEWOOD_REG_WKND(60), BRIDGEWOOD_REW_DOW(110), BRIDGEWOOD_REW_WKND(50),
    RIDGEWOOD_REG_DOW(220), RIDGEWOOD_REG_WKND(150), RIDGEWOOD_REW_DOW(100), RIDGEWOOD_REW_WKND(40);
    
    private double price;
    
    Prices(double price){
    this.price = price;
    }
}
