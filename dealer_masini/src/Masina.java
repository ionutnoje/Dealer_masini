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

    public Masina(String marca)
    {
        this.marca = marca;
    }



    public Masina(String marca, String model, String tip,int vin,int hp, String culoare, int km, double pret)
    {
        this.marca = marca;
        this.culoare = culoare;
        this.vin = vin;
        this.km = km;
        this.model = model;
        this.pret = pret;
        this.tip = tip;
    }

    public double getPret() {
        return pret;
    }

    public int getVin() {
        return vin;
    }
}
