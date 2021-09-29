import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;



public class MainClass
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        int opt;
        Character sort_opt;
        Character buy_opt;
        int ver_inf_masina;
        int opt_logare;


        System.out.println("Bine ati venit la dealer.com");
        System.out.println("1.CEO firma       2.Cumparator");
        System.out.println("Introduceti valoarea corespunzatoare statutului dvs");
        opt_logare = sc.nextInt();

        if(opt_logare == 1)
        {
            System.out.println("MENIU CEO");
            System.out.println("1.Introducere masina in baza de date");
            System.out.println("2.Interogare sold firma");
            System.out.println("3.Depozitare suma in contul firmei");
            System.out.println("4.Retragere suma din contul firmei");
            System.out.println("5.Revenire la logare");

        }
        else if(opt_logare == 2)
        {
            System.out.println("MENIU CUMPARATOR");
            System.out.println("1.Vedeti garaj(inventar)");
            //sortare dupa diferite criterii
            System.out.println("2.Afisare informatii despre masini");
            System.out.println("3.Programare test drive");
            System.out.println("4.Cumparare masina");
            System.out.println("5.Revenire la logare");


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

                    System.out.println("Introduceti indicele masinii careia vreti sa se afiseze informatiile: ");
                    ver_inf_masina = sc.nextInt();
                    //tostring ceva

                    break;
                case 3:
                    System.out.println("Ati fost programat la test drive cu masina" + "   masina"  +"pe data de 21 Noiembrie la ora 16:00");

                    break;
                case 4:

                    System.out.println("Doriti sa cumparati o masina?[Y/N]");
                    buy_opt = sc.next().charAt(0);

                    if(buy_opt == 'Y' || buy_opt == 'y')
                    {
                        System.out.println("Meniu cumparare");
                        System.out.println("1.Interogare sold card");
                        System.out.println("2.Vizionare lista masini");
                        System.out.println("3.Upgrade-uri masina");
                        System.out.println("4.Calcul pret final");
                        System.out.println("5.Cumparare integral sau finantare");
                        System.out.println("5.Iesire meniu cumparare");
                    }

                    //meniu unde se pot face upgradeuri la masini inainte de cumparare

                    break;


            }
        }












    }
}
