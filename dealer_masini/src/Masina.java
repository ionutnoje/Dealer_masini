public class Masina
{
    String culoare;
    String tip;
    String marca;
    String model;
    int km;
    double pret;


    public Masina(String marca)
    {
        this.marca = marca;
    }

    public void CreareMasina(String marca, String culoare, String tip, String model, int km, double pret)
    {
        this.marca = marca;
        this.culoare = culoare;
        this.km = km;
        this.model = model;
        this.pret = pret;
        this.tip = tip;
    }




}
