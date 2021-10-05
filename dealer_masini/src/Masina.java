public class Masina
{
    public String culoare;
    public String tip;
    public String marca;
    public String model;
    public int km;
    private double pret;
    public int hp;
    private int vin;
    private int stock;

    public Masina(String marca)
    {
        this.marca = marca;
    }



    public Masina(String marca, String model, String tip,int vin,int hp, String culoare, int km, double pret, int stock)
    {
        this.marca = marca;
        this.culoare = culoare;
        this.vin = vin;
        this.km = km;
        this.model = model;
        this.pret = pret;
        this.tip = tip;
        this.stock = stock;
    }

    public double getPret() {
        return this.pret;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
