import jdk.swing.interop.SwingInterOpUtils;

import java.util.Objects;
import java.util.Scanner;



public class MainClass
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Cumparator cumparator = new Cumparator("user");
        ContBancar cb = new ContBancar(0);


        //date cumparator
        String nume;
        int varsta;
        String adresa;
        String sex;
        double suma;

        //variabile in main
        int opt,ok = 1;
        Character sort_opt;
        Character buy_opt;
        int ver_inf_masina;
        int opt_logare;
        String parola_CEO;


        //variabile pt Masina
        String culoare;
        String tip;
        String marca;
        String model;
        int km;
        int pret;



        while(ok == 1)
        {




            System.out.println("Bine ati venit la DealerDeMasini.com");
            System.out.println("1.CEO firma       2.Cumparator");
            System.out.println("Introduceti valoarea corespunzatoare statutului dvs");
            opt_logare = sc.nextInt();


            if (opt_logare == 1) {
                OPTIUNE:


                while (ok == 1) {


                    System.out.println("Introduceti parola CEO:  (hint: admin)");
                    parola_CEO = sc.next();
                    PAROLA:
                    if (Objects.equals(parola_CEO, "admin")) {


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

                                System.out.println("Marca: ");
                                marca = sc.next();






                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break OPTIUNE;

                            case 6:
                                ok = 0;
                                break;


                        }
                    } else {

                        System.out.println("Ati introdus parola gresita");
                        System.out.println("Doriti sa incercati din nou?[Y/N]");
                        sort_opt = sc.next().charAt(0);

                        if (sort_opt == 'Y' || sort_opt == 'y') {

                            break PAROLA;

                        }
                        if (sort_opt == 'n' || sort_opt == 'N') {
                            System.out.println("Programul se inchide!");

                            System.exit(0);
                        }

                    }
                }


            }
            else if (opt_logare == 2) {
                IESIRE:
                while (ok == 1) {

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


                    cumparator.DatePersonale(nume,sex,adresa,varsta);

                    System.out.println(cumparator.nume);
                    System.out.println(cumparator.adresa);
                    System.out.println(cumparator.sex);
                    System.out.println(cumparator.varsta);
                    System.out.println(cb.get_sold() + "$");





                System.out.println("MENIU CUMPARATOR");
                System.out.println("1.Vedeti garaj(inventar)");
                //sortare dupa diferite criterii
                System.out.println("2.Afisare informatii despre masini");
                System.out.println("3.Programare test drive");
                System.out.println("4.Cumparare masina");
                System.out.println("5.Revenire la logare");
                System.out.println("6.Iesire program");


                System.out.println("introduceti cifra corespunzatoare optiunii dorite");
                opt = sc.nextInt();

                switch (opt) {

                    case 1:
                        System.out.println("Doriti sa sortati?[Y/N]");
                        sort_opt = sc.next().charAt(0);

                        if (sort_opt == 'Y' || sort_opt == 'y') {
                            System.out.println("Sortati in functie de: ");
                            System.out.println("1.Km");
                            System.out.println("2.Culoare");
                            System.out.println("3.Firma");
                            System.out.println("4.Tip");
                        }
                        if (sort_opt == 'n' || sort_opt == 'N') {
                            //afisare toate masinile
                        } else {
                            System.out.println("ati introdus litera gresita!");
                        }
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

                        System.out.println("Doriti sa cumparati o masina?[Y/N]");
                        buy_opt = sc.next().charAt(0);

                        if (buy_opt == 'Y' || buy_opt == 'y') {
                            System.out.println("Meniu cumparare");
                            System.out.println("1.Interogare sold card");
                            System.out.println("2.Vizionare lista masini");
                            System.out.println("3.Upgrade-uri masina");
                            System.out.println("4.Calcul pret final");
                            System.out.println("5.Cumparare integral sau finantare");
                            System.out.println("6.Iesire meniu cumparare");
                        }

                        //meniu unde se pot face upgradeuri la masini inainte de cumparare

                        break;
                    case 5:
                        break IESIRE;
                    case 6:
                        ok = 0;
                        System.exit(0);
                        break;


                }
            }
            } else {
                System.out.println("Ati introdus o valoare gresita");
            }


        }
    }
}
