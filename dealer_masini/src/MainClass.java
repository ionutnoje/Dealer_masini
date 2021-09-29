import java.util.Scanner;



public class MainClass
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        int opt;
        Character sort_opt;
        Character buy_opt;


        //inca un meniu pentru detinator
        System.out.println("MENIU CUMPARATOR");
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
                sort_opt = sc.next().charAt(0);

                if(sort_opt == 'Y' || sort_opt == 'y')
                {
                    System.out.println("Sortati in functie de: ");
                    System.out.println("1.Km");
                    System.out.println("2.Culoare");
                    System.out.println("3.Firma");
                    System.out.println("4.Tip");
                }
                if(sort_opt == 'n' || sort_opt == 'N')
                {
                    //afisare toate masinile
                }
                else
                {
                    System.out.println("ati introdus litera gresita!");
                }
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                System.out.println("Doriti sa cumparati o masina?[Y/N]");
                buy_opt = sc.next().charAt(0);

                if(buy_opt == 'Y' || buy_opt == 'y')
                {
                    System.out.println("Sortati in functie de: ");
                    System.out.println("1.Km");
                    System.out.println("2.Culoare");
                    System.out.println("3.Firma");
                    System.out.println("4.Tip");
                }

                break;


        }






    }
}
