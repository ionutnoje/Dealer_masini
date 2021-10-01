import java.util.Scanner;

public class Garaj {


    Scanner sc = new Scanner(System.in);
    Masina masina = new Masina("audi");

    String culoare;
    String tip;
    String marca;
    String model;
    int km;
    double pret;
    int nr_masini;
    int nr_rep;





    String nume_garaj;



    public Garaj(int nr_masini)
    {
         this.nr_masini = nr_masini;
    }

    public void CreareGaraj(int nr_masini)
    {
        Masina[] garaj = new Masina[nr_masini];

        for(int i = 1; i <= nr_masini; i++)
        {
            System.out.println("Marca: ");
            marca = sc.next();
            System.out.println("Model: ");
            model = sc.next();
            System.out.println("culoare: ");
            culoare = sc.next();
            System.out.println("km: ");
            km = sc.nextInt();
            System.out.println("pret: ");
            pret = sc.nextInt();


        }
    }
}
