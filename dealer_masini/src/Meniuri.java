import java.util.Objects;
import java.util.Scanner;

public class Meniuri {

    public Meniuri()
    {
        System.out.println("Meniurile aplicatiei sunt: ");
    }


     int opt;
     boolean iesire = true;
     String parola_CEO;
     char sort_opt;


    //meniu persoana
     String nume;
     int varsta;
     String adresa;
     String sex;
     double suma;


    //meniu persoana extins
     int ver_inf_masina;
     char buy_opt;


    //meniu cumparare
    int opt_maniu_cumparare;



     ContBancar cb = new ContBancar(0);
     Scanner sc = new Scanner(System.in);
     Cumparator cumparator = new Cumparator("user");
     Ceo ceo = new Ceo("Boss");


    public void MeniuPrincipal()
    {


            //sc = new Scanner(System.in);
            System.out.println("Bine ati venit la DealerDeMasini.com");
            System.out.println("1.CEO firma       2.Cumparator      3.Iesire program");
            System.out.println("Introduceti valoarea corespunzatoare statutului dvs");
            opt = sc.nextInt();

            switch (opt)
            {
                case 1:
                     DatePersonaleMeniuCeo();
                    break;
                case 2:
                    DatePersonaleMeniuCumparator();
                    break;
                case 3:
                    System.exit(0);
                    return;
                default:
                    System.out.println("nu e buna optiunea");
                    break;
            }

    }

//    public void ParolaCeo()
//    {
//        System.out.println("Introduceti parola CEO:  (hint: admin)");
//        parola_CEO = sc.next();
//        MeniuCeoInitial();
//    }

    public void MeniuCeoInitial()
    {

        System.out.println("Introduceti parola CEO:  (hint: admin)");
        parola_CEO = sc.next();

        MeniuCeoFaraParola();


    }

    public void DatePersonaleMeniuCeo()
    {
        System.out.println("Date Personale");
        System.out.println("Nume: ");
        nume = sc.next();
        System.out.println("adresa: ");
        adresa = sc.nextLine();
        adresa = sc.nextLine();
        System.out.println("sex");
        sex = sc.next();
        System.out.println("varsta: ");
        varsta = sc.nextInt();
        System.out.println("suma cont: ");
        suma = sc.nextDouble();

        cb.depunereBani(suma);


        ceo.Ceo(nume,sex,adresa,varsta);

        System.out.println(ceo.nume);
        System.out.println(ceo.adresa);
        System.out.println(ceo.sex);
        System.out.println(ceo.varsta);
        System.out.println(cb.get_sold() + "$");
        MeniuCeoInitial();
    }

    public void MeniuCeoFaraParola()
    {
        if (Objects.equals(parola_CEO, "admin")) {
            while(true) {

                System.out.println("MENIU CEO");
                System.out.println("1.Introducere masina in baza de date");
                System.out.println("2.Interogare sold firma");
                System.out.println("3.Depozitare suma in contul firmei");
                System.out.println("4.Retragere suma din contul firmei");
                System.out.println("5.Revenire la meniul principal");
                System.out.println("6.Iesire program");

                System.out.println("\nintroduceti cifra corespunzatoare optiunii dorite");
                opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        int nr = 1;
                        //introducere masina in baza de date
                        break;
                    case 2:
                        System.out.println("detineti " + cb.get_sold() + "$ in contul firmei");

                        break;
                    case 3:
                        //Depozitare suma in contul firmei
                        break;
                    case 4:
                        //Retragere suma din contul firmei
                        break;
                    case 5:
                        MeniuPrincipal();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        break;


                }
            }
        }
        else
        {

            System.out.println("Ati introdus parola gresita");
            System.out.println("Doriti sa incercati din nou?[Y/N]");
            sort_opt = sc.next().charAt(0);

            if (sort_opt == 'Y' || sort_opt == 'y')
            {

                MeniuCeoInitial();

            }
            if (sort_opt == 'n' || sort_opt == 'N')
            {
                System.out.println("Programul se inchide!");

                System.exit(0);
            }

        }
    }





























































    //Meniuri cumparator


    public void MeniuCumparatorInitial()
    {
        //while(true)
        //{





            //MeniuCumparatorExt();
            System.out.println("MENIU CUMPARATOR");
            System.out.println("1.Vedeti garaj(inventar)");
            System.out.println("2.Afisare informatii despre masini");
            System.out.println("3.Programare test drive");
            System.out.println("4.Cumparare masina");
            System.out.println("5.Revenire la logare");
            System.out.println("6.Iesire program");


            System.out.println("introduceti cifra corespunzatoare optiunii dorite");
            opt = sc.nextInt();


            switch (opt) {

                case 1:
                    System.out.println("afisare toate masinile din inventar");
                    break;
                case 2:

                    System.out.println("Introduceti indicele masinii careia vreti sa se afiseze informatiile: ");
                    ver_inf_masina = sc.nextInt();
                    //tostring ceva

                    break;
                case 3:
                    System.out.println("Ati fost programat la test drive cu masina" + "   masina" + "pe data de 21 Noiembrie la ora 16:00");

                    break;
                case 4:
                   MeniuCumparare();
                    break;
                case 5:
                    MeniuPrincipal();
                    break;
                case 6:
                    System.exit(0);
                    break;


            }
        //}
    }


    public void MeniuCumparatorExt()
    {
        System.out.println("MENIU CUMPARATOR");
        System.out.println("1.Vedeti garaj(inventar)");
        System.out.println("2.Afisare informatii despre masini");
        System.out.println("3.Programare test drive");
        System.out.println("4.Cumparare masina");
        System.out.println("5.Revenire la logare");
        System.out.println("6.Iesire program");


        System.out.println("introduceti cifra corespunzatoare optiunii dorite");
        opt = sc.nextInt();


        switch (opt) {

            case 1:
                System.out.println("afisare toate masinile din inventar");
                break;
            case 2:

                System.out.println("Introduceti indicele masinii careia vreti sa se afiseze informatiile: ");
                ver_inf_masina = sc.nextInt();
                //tostring ceva

                break;
            case 3:
                System.out.println("Ati fost programat la test drive cu masina" + "   masina" + "pe data de 21 Noiembrie la ora 16:00");

                break;
            case 4:
                MeniuCumparare();
                break;
            case 5:
                MeniuPrincipal();
                break;
            case 6:
                System.exit(0);
                break;


        }
    }

    public void MeniuCumparare()
    {
        System.out.println("Meniu cumparare");
        System.out.println("1.Interogare sold card");
        System.out.println("2.Vizionare lista masini");
        System.out.println("3.Upgrade-uri masina");
        System.out.println("4.Calcul pret final");
        System.out.println("5.Cumparare integral sau finantare");
        System.out.println("6.Iesire meniu cumparare");
        System.out.println("7.Iesire program");

        System.out.println("introduceti valoarea corespunzatoare optiunii dorite: ");
        opt_maniu_cumparare = sc.nextInt();

        switch (opt_maniu_cumparare)
        {
            case 1:
                System.out.println("aveti " + cb.get_sold() + "$ in cont");
                MeniuCumparare();
                return;
            case 2:
                //vizionare lista masini;
                break;
            case 3:
                //Upgrade-uri masina;
                break;
            case 4:
                //calcul pret final;
                break;
            case 5:
                //Cumparare integral sau finantare;
                break;
            case 6:
                MeniuCumparatorInitial();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public void DatePersonaleMeniuCumparator()
    {
        System.out.println("Date Personale");
        System.out.println("Nume: ");
        nume = sc.next();
        System.out.println("adresa: ");
        adresa = sc.nextLine();
        adresa = sc.nextLine();
        System.out.println("sex");
        sex = sc.next();
        System.out.println("varsta: ");
        varsta = sc.nextInt();
        System.out.println("suma cont: ");
        suma = sc.nextDouble();

        cb.depunereBani(suma);


        cumparator.Cumparator(nume,sex,adresa,varsta);

        System.out.println(cumparator.nume);
        System.out.println(cumparator.adresa);
        System.out.println(cumparator.sex);
        System.out.println(cumparator.varsta);
        System.out.println(cb.get_sold() + "$");
        MeniuCumparatorInitial();
    }



}
