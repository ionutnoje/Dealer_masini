public class Cumparator
{
    ContBancar cb = new ContBancar();

    String nume;
    int varsta;
    String adresa;
    String sex;


    public Cumparator(String nume)
    {
        this.nume = nume;
    }
    public void DatePersonale(String nume, String sex, String adresa, int varsta)
    {
        this.nume = nume;
        this.sex = sex;
        this.adresa = adresa;
        this.varsta = varsta;
    }
}
