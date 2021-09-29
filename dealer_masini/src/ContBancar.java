public class ContBancar {
    public double _sold = 0.0;

    public ContBancar(double sold)
    {
        _sold = sold;
    }

    public void depozitaresuma(double suma)
    {
        _sold += suma;
    }

    public double get_sold() {
        return _sold;
    }
}

