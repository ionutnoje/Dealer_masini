public class Masina
{
    String culoare;
    String tip;
    String marca;
    String model;
    int km;
    double pret;
    int hp;


    public Masina(String marca)
    {
        this.marca = marca;
    }



    public Masina(String marca, String model, String tip,int hp, String culoare, int km, double pret)
    {
        this.marca = marca;
        this.culoare = culoare;
        this.km = km;
        this.model = model;
        this.pret = pret;
        this.tip = tip;
    }




}
