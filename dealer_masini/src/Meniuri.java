import java.util.Objects;
import java.util.Scanner;


public class Meniuri {

    public Meniuri()
    {
        System.out.println("Meniurile aplicatiei sunt: ");
    }


     int opt;
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
     String buffer;


    //meniu cumparare
    int opt_maniu_cumparare;
    int adaugare_ceo = 0;



     ContBancar cb = new ContBancar(0);
     Scanner sc = new Scanner(System.in);
     Cumparator cumparator = new Cumparator("user");
     Ceo ceo = new Ceo("Boss");
     Garaj grj = new Garaj();

    public void CreareSpatiu()
    {
        grj.CreareGarajFaraAdaugara();
        MeniuPrincipal();
    }


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
        if(varsta < 18 || varsta > 100)
        {
            System.out.println("Ati introdus o varsta gresita!");
            System.exit(0);
        }
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
                        //introducere masina in baza de date
                        adaugare_ceo = 1;
                        grj.ValIntroducereCeo(adaugare_ceo);
                        grj.AdaugareInGarajCeo();
                        break;
                    case 2:
                        System.out.println("detineti " + cb.get_sold() + "$ in contul firmei");

                        break;
                    case 3:
                        System.out.println("valoarea pe care vreti sa o depozitati: ");
                        int depunere_suma = sc.nextInt();
                        cb.depunereBani(depunere_suma);
                        break;
                    case 4:
                        System.out.println("valoarea pe care vreti sa o retrageti: ");
                        int retragere_suma = sc.nextInt();
                        cb.retragereBani(retragere_suma);
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
                    grj.AfisareMasini();
                    System.out.println("\nApasati orice tasta + ENTER ca sa va intoarceti la meniul Cumparator");
                    buffer = sc.next();
                    MeniuCumparatorInitial();

                    break;
                case 2:

                    System.out.println("Introduceti indicele masinii careia vreti sa se afiseze informatiile: ");
                    ver_inf_masina = sc.nextInt();
                    grj.AfisareMasinaCuIndex(ver_inf_masina);
                    System.out.println("\nApasati orice tasta + ENTER ca sa va intoarceti la meniul Cumparator");
                    buffer = sc.next();
                    MeniuCumparatorInitial();

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
        System.out.println("2.Alegere masina");
        System.out.println("3.Iesire meniu cumparare");
        System.out.println("4.Iesire program");

        System.out.println("introduceti valoarea corespunzatoare optiunii dorite: ");
        opt_maniu_cumparare = sc.nextInt();

        switch (opt_maniu_cumparare)
        {
            case 1:
                System.out.println("aveti " + cb.get_sold() + "$ in cont");
                MeniuCumparare();
                return;
            case 2:
                grj.AfisareMasini();
                Cumparare();
                MeniuCumparare();
                break;
            case 3:
                MeniuCumparatorInitial();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public void Cumparare()
    {
        System.out.println("\nIntroduceti indexul masinii pe care vreti sa o cumparati: ");
        int opt_cumparare = sc.nextInt();
        System.out.println("Sunteti sigur de alegerea facuta?[Y/N]");
        char verificare_alegere = sc.next().charAt(0);

        if (verificare_alegere == 'Y' || verificare_alegere == 'y')
        {

            double pret_final = (grj.garaj[opt_cumparare].getPret()) + (0.05 * grj.garaj[opt_cumparare].getPret());
            System.out.println("Pretul masinii este de: " + grj.garaj[opt_cumparare].getPret());
            System.out.println("Se aplica o taxa de 0.5 din valoarea masinii");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("Pretul final este: " + pret_final);
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("Se face legatura cu banca...");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("Se verifica soldul...");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            int verificare_sold = cb.verificareRetragere(pret_final);
            if(verificare_sold == 1)
            {
                cb.retragereBani(pret_final);
                System.out.println("Tranzactia a avut loc cu succes!");
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                System.out.println("Felicitari,"+ cumparator.nume + "! Sunteti posesorul unui: " + grj.garaj[opt_cumparare].marca + " " + grj.garaj[opt_cumparare].model);
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                System.out.println("Masina va fi livrata la adresa: " + cumparator.adresa);
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                System.out.println("Doriti sa iesiti din program?[Y/N]");
                verificare_alegere = sc.next().charAt(0);

                if (verificare_alegere == 'Y' || verificare_alegere == 'y')
                {
                    System.exit(0);
                }
                else
                {
                    MeniuCumparare();
                }

            }
            else
            {
                System.out.println("Nu aveti suficienti bani pe card!");
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                System.out.println("Doriti sa depuneti bani in cont?[Y/N]");
                verificare_alegere = sc.next().charAt(0);

                if (verificare_alegere == 'Y' || verificare_alegere == 'y')
                {
                    System.out.println("Introduceti suma: ");
                    int depunere = sc.nextInt();
                    cb.depunereBani(depunere);
                        try
                        {
                            Thread.sleep(2000);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                    System.out.println("Se revine la Meniul Cumparare!!");
                    Cumparare();
                }
                else
                {
                    System.out.println("Alegeti alta masina!");
                    Cumparare();
                }
            }

        }


        if (verificare_alegere == 'n' || verificare_alegere == 'N')
        {
            Cumparare();
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
