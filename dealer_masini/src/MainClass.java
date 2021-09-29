import java.util.Scanner;



public class MainClass
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        int opt;
        String sort_opt;



        System.out.println("MENIU");
        System.out.println("1.Vedeti garaj(inventar)");
                           //sortare dupa diferite criterii
        System.out.println("2.Afisare informatii despre masina");
        System.out.println("3.Programare test drive");
        System.out.println("4.Cumparare masina");


        System.out.println("introduceti cifra corespunzatoare optiunii dorite");
        opt = sc.nextInt();

        switch (opt)
        {
            case 1:
                System.out.println("Doriti sa sortati?[Y/N]");

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                break;


        }






    }
}
