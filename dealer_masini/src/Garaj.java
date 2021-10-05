import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Garaj {


    Scanner sc = new Scanner(System.in);
    Cumparator cm = new Cumparator("user");
    Masina[] garaj;

    String culoare;
    String tip;
    String marca;
    String model;
    int vin;
    int km;
    double pret;
    int stock;
    int nr_spatii_garaj = 20;
    int hp;
    int index_masina;
    int nr_masini_existente;
    //double pret_masina;


    public Garaj() {
        System.out.println("initializare garaj");
    }


    public void AdaugareInGarajCeo() {

        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        System.out.println("introduceti numaru de masini pe care doriti sa le introduceti: ");
        int nr_masini_adaugate_ceo = sc.nextInt();


        for (int i = aux + 1; i <= nr_masini_adaugate_ceo + aux; i++) {
            System.out.println("\n\nMasina de pe indexul" + i);
            System.out.println("[" + i + "] " + "Marca: ");
            marca = sc.next();
            System.out.println("[" + i + "] " + "Model: ");
            model = sc.next();
            System.out.println("[" + i + "] " + "Vin: ");
            vin = sc.nextInt();
            System.out.println("[" + i + "] " + "Tip: ");
            tip = sc.next();
            System.out.println("[" + i + "] " + "HP: ");
            hp = sc.nextInt();
            System.out.println("[" + i + "] " + "culoare: ");
            culoare = sc.next();
            System.out.println("[" + i + "] " + "km: ");
            km = sc.nextInt();
            System.out.println("[" + i + "] " + "pret: ");
            pret = sc.nextDouble();
            System.out.println("[" + i + "] " + "stock: ");
            stock = sc.nextInt();

            garaj[i] = new Masina(marca, model, tip, vin, hp, culoare, km, pret,stock);

//            //int verificare_pret = cb.verificareRetragere(garaj[i].getPret());
//            System.out.println("garaj[i].getPret() * garaj[i].getStock()= " + garaj[i].getPret() * garaj[i].getStock());
//            System.out.println("cb.get_sold()=" + cb.get_sold());
//            if(garaj[i].getPret() * garaj[i].getStock() < cb.get_sold())
//            {
//                cb.retragereBani(56);
//                System.out.println("A fost retrasa suma de " + 56 + "$ din contul firmei!");
//                System.out.println("\nApasati orice tasta + ENTER ca sa va intoarceti la meniul Cumparator");
//                String buffer = sc.next();
//            }
//            else if(garaj[i].getPret() * garaj[i].getStock() > cb.get_sold())
//            {
//                System.out.println("Nu sunt destui bani pe contul firmei pentru a se duce la bun sfarsit operatia!");
//                String buffer = sc.next();
//                int stergere_ultimul_element_vector = VerificareNrMasiniInGaraj();
//                garaj[stergere_ultimul_element_vector] = null;
//            }



        }


    }


    public void CreareGarajFaraAdaugara() {
        garaj = new Masina[nr_spatii_garaj];


        //masini preexistente in garaj
        garaj[1] = new Masina("ferrari", "458", "supercar", 12453, 540, "negru", 40000, 130000,2);
        garaj[2] = new Masina("audi", "r8", "supercar", 65442, 540, "verde", 12000, 50000,2);
        garaj[3] = new Masina("lamborghini", "huracan", "supercar", 65432, 640, "rosu", 4000, 160000,1);
        garaj[4] = new Masina("ferrari", "812", "supercar", 12346, 770, "negru", 123, 230000,4);
        garaj[5] = new Masina("audi", "a4", "family", 94733, 120, "negru", 300000, 5000,5);
        garaj[6] = new Masina("vw", "passat", "family", 57275, 116, "albastru", 200000, 3000,12);
        garaj[7] = new Masina("toyota", "supra", "supercar", 36412, 1500, "rosu", 54200, 1234,8);
        garaj[8] = new Masina("nissan", "GTR", "supercar", 81263, 900, "gri", 2300, 64325,5);
        garaj[9] = new Masina("maserati", "grandturismo", "supercar", 10564, 231, "portocaliu", 98234, 267859,8);
        garaj[10] = new Masina("bmw", "m2", "family", 46412, 300, "galbena", 76723, 435620,10);


    }


    public void AfisareMasini() {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        for (int i = 1; i <= aux; i++) {
            System.out.println("\nmasina[" + i + "]: |Marca: " + garaj[i].marca + "--model: " + garaj[i].model + "--stock: " +garaj[i].getStock() + "|");
        }

    }


    public void AfisareMasinaCuIndex(int index) {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        for (int i = 1; i <= aux; i++) {
            if (i == index) {
                System.out.println("\nmasina[" + i + "]: |Marca: " + garaj[i].marca + "--model: " + garaj[i].model + "--VIN: " + garaj[i].getVin() + "--Tip: " +
                        garaj[i].tip + "--Culoare: " + garaj[i].culoare + "--Km:  " + garaj[i].km + "--pret: " + garaj[i].getPret() + "$ "+ "--stock:"  + garaj[i].getStock() +" |");
            }


        }
    }


    public int ValIntroducereCeo(int val_introducere_ceo) {
        this.nr_masini_existente += val_introducere_ceo;
        return this.nr_masini_existente;
    }


    public int VerificareNrMasiniInGaraj() {
        int nr_masini_dupa_verificare = 0;
        int ok = 1;
        int indice = 1;
        while (ok == 1) {
            if (garaj[indice] != null) {
                nr_masini_dupa_verificare++;
                indice++;
            } else {
                ok = 0;
            }
        }
        return nr_masini_dupa_verificare;
    }



//
//    public void EliminareDinGarajCeo() {
//
//        int nr_masini_in_garaj = VerificareNrMasiniInGaraj();
//
//
//
//        System.out.println("introduceti indexul: ");
//        index_masina = sc.nextInt();
//
//        System.out.println("\nmasina[" + index_masina + "]: |Marca: " + garaj[index_masina].marca + "--model: " + garaj[index_masina].model + "--stock: " +garaj[index_masina].getStock() + "|");
//        System.out.println("introduceti numarul a cate masini din acest model vreti sa eliminati: ");
//        int nr_masini_eliminate_ceo = sc.nextInt();
//        //pret_masina = garaj[index_masina].getPret()*nr_masini_eliminate_ceo;
//
//
//        if(garaj[index_masina].getStock() == 1 && nr_masini_eliminate_ceo == 1)
//        {
//
//            if(index_masina < nr_masini_in_garaj)
//            {
//                for(int i = 1; i <= nr_masini_in_garaj - 1; i++)
//                {
//                    for(int j = i + 1; j <= nr_masini_in_garaj; j++)
//                    {
//                        if(i == index_masina)
//                        {
//                            for(int k = i; i <= nr_masini_in_garaj - 1; i++)
//                            {
//                                for (int l = k + 1; j <= nr_masini_in_garaj; j++)
//                                {
//
//                                    garaj[k].marca = garaj[j].marca;
//                                    garaj[k].model = garaj[j].model;
//                                    garaj[k].tip = garaj[j].tip;
//                                    garaj[k].km = garaj[j].km;
//                                    garaj[k].culoare = garaj[j].culoare;
//                                    int setare_vin = garaj[k].getVin();
//                                    garaj[l].setVin(setare_vin);
//                                    double setare_pret = garaj[k].getPret();
//                                    garaj[l].setPret(setare_pret);
//                                    int stock = garaj[k].getStock();
//                                    garaj[l].setStock(stock);
//
//
//                                }
//                            }
//                        }
//                    }
//                }
//
//
//                garaj[nr_masini_in_garaj] = null;
//
//                System.out.println("A fost depusa valoarea de " + garaj[index_masina].getPret()*nr_masini_eliminate_ceo + "$ in contul firmei!");
//                cb.depunereBani(garaj[index_masina].getPret()*nr_masini_eliminate_ceo);
//
//
//
//            }
//            else
//            {
//                //eliminare ultimul element din vector
//
//                System.out.println("A fost depusa valoarea de " + garaj[index_masina].getPret()*nr_masini_eliminate_ceo + "$ in contul firmei!");
//                cb.depunereBani(garaj[index_masina].getPret()*nr_masini_eliminate_ceo);
//                garaj[index_masina] = null;
//
//
//            }
//        }
//        else if(garaj[index_masina].getStock() < nr_masini_eliminate_ceo )
//        {
//            System.out.println("incercati sa eliminati mai multe masini decat sunt in stock!");
//            try
//            {
//                Thread.sleep(2000);
//            }
//            catch(InterruptedException ex)
//            {
//                Thread.currentThread().interrupt();
//            }
//        }
//        else if(garaj[index_masina].getStock() > nr_masini_eliminate_ceo )
//        {
//            garaj[index_masina].setStock(garaj[index_masina].getStock() - nr_masini_eliminate_ceo);
//           // System.out.println("A fost depusa valoarea de " + pret_masina + "$ in contul firmei!");
//            cb.depunereBani(garaj[index_masina].getPret()*nr_masini_eliminate_ceo * nr_masini_eliminate_ceo);
//            String buffer = sc.next();
//        }
//        else if(garaj[index_masina].getStock() == nr_masini_eliminate_ceo)
//        {
//            if(index_masina == nr_masini_in_garaj)
//            {
//                garaj[index_masina] = null;
//
//            }
//            else
//            {
//                for (int i = 1; i <= nr_masini_in_garaj - 1; i++) {
//                    for (int j = i + 1; j <= nr_masini_in_garaj; j++) {
//                        if (i == index_masina) {
//                            for (int k = i; i <= nr_masini_in_garaj - 1; i++) {
//                                for (int l = k + 1; j <= nr_masini_in_garaj; j++) {
//
//                                    garaj[k].marca = garaj[j].marca;
//                                    garaj[k].model = garaj[j].model;
//                                    garaj[k].tip = garaj[j].tip;
//                                    garaj[k].km = garaj[j].km;
//                                    garaj[k].culoare = garaj[j].culoare;
//                                    int setare_vin = garaj[k].getVin();
//                                    garaj[l].setVin(setare_vin);
//                                    double setare_pret = garaj[k].getPret();
//                                    garaj[l].setPret(setare_pret);
//                                    int setare_stock = garaj[k].getStock();
//                                    garaj[l].setStock(setare_stock);
//
//                                }
//                            }
//                        }
//                    }
//                }
//
//
//
//                System.out.println("A fost depusa valoarea de " + garaj[index_masina].getPret()*nr_masini_eliminate_ceo + "$ in contul firmei!");
//                cb.depunereBani(garaj[index_masina].getPret()*nr_masini_eliminate_ceo * nr_masini_eliminate_ceo);
//                garaj[nr_masini_in_garaj] = null;
//
//
//            }
//        }
//
//    }


    public void EliminareDinGarajCeo() {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);

        int nr_masini_in_garaj = VerificareNrMasiniInGaraj();



        System.out.println("introduceti indexul: ");
        index_masina = sc.nextInt();

        if(index_masina < nr_masini_in_garaj)
        {
            for(int i = 1; i <= nr_masini_in_garaj - 1; i++)
            {
                for(int j = i + 1; j <= nr_masini_in_garaj; j++)
                {
                    if(i == index_masina)
                    {
                        for(int k = i; i <= nr_masini_in_garaj - 1; i++)
                        {
                            for (int l = k + 1; j <= nr_masini_in_garaj; j++)
                            {

                                garaj[k].marca = garaj[j].marca;
                                garaj[k].model = garaj[j].model;
                                garaj[k].tip = garaj[j].tip;
                                garaj[k].km = garaj[j].km;
                                garaj[k].culoare = garaj[j].culoare;
                                int setare_vin = garaj[k].getVin();
                                garaj[l].setVin(setare_vin);
                                double setare_pret = garaj[k].getPret();
                                garaj[l].setPret(setare_pret);

                            }
                        }
                    }
                }
            }



            garaj[nr_masini_in_garaj] = null;
//            garaj[nr_masini_in_garaj].marca = null;
//            garaj[nr_masini_in_garaj].model = null;
//            garaj[nr_masini_in_garaj].tip = null;
//            garaj[nr_masini_in_garaj].culoare = null;
//            garaj[nr_masini_in_garaj].setVin(0);
//            garaj[nr_masini_in_garaj].km = 0;
//            garaj[nr_masini_in_garaj].setPret(0);


        }
        else
        {
            //eliminare ultimul element din vector
            garaj[index_masina] = null;
//            garaj[index_masina].model = null;
//            garaj[index_masina].tip = null;
//            garaj[index_masina].culoare = null;
//            garaj[index_masina].setVin(0);
//            garaj[index_masina].km = 0;
//            garaj[index_masina].setPret(0);
//
        }



    }



//
//        garaj[index_masina].setStock(garaj[index_masina].getStock() - 1);
//        cb.retragereBani(garaj[index_masina].getPret());
//        System.out.println("A fost retrasa valoarea de " + garaj[index_masina].getPret() + "din contul firmei!");
//



    public void EliminareDinGarajCustomer(int index_masina_meniu_customer, int nr_masini_de_cumparat)
        {

            int nr_masini_in_garaj = VerificareNrMasiniInGaraj();


            if (garaj[index_masina_meniu_customer].getStock() == 1 && nr_masini_de_cumparat == 1) {
                if (index_masina_meniu_customer < nr_masini_in_garaj) {
                    for (int i = 1; i <= nr_masini_in_garaj - 1; i++) {
                        for (int j = i + 1; j <= nr_masini_in_garaj; j++) {
                            if (i == index_masina_meniu_customer) {
                                for (int k = i; i <= nr_masini_in_garaj - 1; i++) {
                                    for (int l = k + 1; j <= nr_masini_in_garaj; j++) {

                                        garaj[k].marca = garaj[j].marca;
                                        garaj[k].model = garaj[j].model;
                                        garaj[k].tip = garaj[j].tip;
                                        garaj[k].km = garaj[j].km;
                                        garaj[k].culoare = garaj[j].culoare;
                                        int setare_vin = garaj[k].getVin();
                                        garaj[l].setVin(setare_vin);
                                        double setare_pret = garaj[k].getPret();
                                        garaj[l].setPret(setare_pret);
                                        int setare_stock = garaj[k].getStock();
                                        garaj[l].setStock(setare_stock);

                                    }
                                }
                            }
                        }
                    }


                    garaj[nr_masini_in_garaj] = null;



                } else {
                    //eliminare ultimul element din vector
                    garaj[index_masina_meniu_customer] = null;


                }

            }
            else if (garaj[index_masina_meniu_customer].getStock()  < nr_masini_de_cumparat )
            {

                System.out.println("Nu sunt suficiente masini in stock!");


            }
            else if(garaj[index_masina_meniu_customer].getStock() > nr_masini_de_cumparat)
            {
                garaj[index_masina_meniu_customer].setStock(garaj[index_masina_meniu_customer].getStock() - nr_masini_de_cumparat);
            }
            else if(garaj[index_masina_meniu_customer].getStock() == nr_masini_de_cumparat )
            {
                if(index_masina_meniu_customer == nr_masini_in_garaj)
                {
                    garaj[index_masina_meniu_customer] = null;

                }
                else
                {
                    for (int i = 1; i <= nr_masini_in_garaj - 1; i++) {
                        for (int j = i + 1; j <= nr_masini_in_garaj; j++) {
                            if (i == index_masina_meniu_customer) {
                                for (int k = i; i <= nr_masini_in_garaj - 1; i++) {
                                    for (int l = k + 1; j <= nr_masini_in_garaj; j++) {

                                        garaj[k].marca = garaj[j].marca;
                                        garaj[k].model = garaj[j].model;
                                        garaj[k].tip = garaj[j].tip;
                                        garaj[k].km = garaj[j].km;
                                        garaj[k].culoare = garaj[j].culoare;
                                        int setare_vin = garaj[k].getVin();
                                        garaj[l].setVin(setare_vin);
                                        double setare_pret = garaj[k].getPret();
                                        garaj[l].setPret(setare_pret);
                                        int setare_stock = garaj[k].getStock();
                                        garaj[l].setStock(setare_stock);

                                    }
                                }
                            }
                        }
                    }


                    garaj[nr_masini_in_garaj] = null;


                }
                }

            }


        }




