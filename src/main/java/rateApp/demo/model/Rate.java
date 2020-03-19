package rateApp.demo.model;

public class Rate {

    private String ccy;
    private String base_ccy;
    private float buy;
    private float sale;

    public Rate () {

    }

    public Rate (String ccy, String base_ccy, float buy, float sale) {
        this.ccy = ccy;
        this.base_ccy = base_ccy;
        this.buy = buy;
        this.sale = sale;
    }

    public String getCcy () {
        return ccy;
    }

    public String getBase_ccy () {
        return base_ccy;
    }

    public float getBuy () {
        return buy;
    }

    public float getSale () {
        return sale;
    }
}
