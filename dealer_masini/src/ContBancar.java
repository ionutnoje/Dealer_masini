
public class ContBancar {
    private double _sold = 0.0;

    public ContBancar()
    {
        System.out.println("cont bancar folosit pentru ceo");
    }

    public ContBancar(double sold)
    {
        _sold = sold;
    }

    public void depunereBani(double suma)
    {
        _sold = _sold + suma;
    }

    public void retragereBani(double suma)
    {
        _sold = _sold - suma;
    }

    public int verificareRetragere(double suma)
    {
        if(_sold < suma)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }


    public double get_sold() {
        return _sold;
    }
}
