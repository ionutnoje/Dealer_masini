import java.util.Scanner;

public class Garaj {


    Scanner sc = new Scanner(System.in);
    ContBancar cb = new ContBancar(0);
    Cumparator cm = new Cumparator("user");
    Masina[] garaj;

    String culoare;
    String tip;
    String marca;
    String model;
    int vin;
    int km;
    double pret;
    //int nr_masini_adaugate_ceo = 0;
    int nr_spatii_garaj = 20;
    int hp;
    int nr_masini_existente = 10;
    int nr_masini_dupa_adaugare_ceo;
//    int nr_masini_eliminate_ceo;
//    int nr_spatii_libere;
//    int index;
//    int nr_spatii_ocupate;
//    int val_introducere_ceo = 0;
//    int val_upgradeuri;
//    int opt_cumparare;
//    char verificare_alegere;
//    double pret_final;


    public Garaj() {
        System.out.println("initializare garaj");
    }

//    public int getNr_masini_dupa_adaugare_ceo() {
//        return nr_masini_dupa_adaugare_ceo;
//    }

    public void AdaugareInGarajCeo() {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        System.out.println("introduceti numarul de masini pe care vreti sa le introduceti in baza de date(nu mai multe de 10): ");
        int nr_masini_adaugate_ceo = sc.nextInt();
        //garaj = new Masina[nr_spatii_garaj];


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

            garaj[i] = new Masina(marca, model, tip, vin, hp, culoare, km, pret);


        }


    }


    public void CreareGarajFaraAdaugara() {
        garaj = new Masina[nr_spatii_garaj];


        //masini preexistente in garaj
        garaj[1] = new Masina("ferrari", "458", "supercar", 12453, 540, "negru", 40000, 130000);
        garaj[2] = new Masina("audi", "r8", "supercar", 65442, 540, "verde", 12000, 50000);
        garaj[3] = new Masina("lamborghini", "huracan", "supercar", 65432, 640, "rosu", 4000, 160000);
        garaj[4] = new Masina("ferrari", "812", "supercar", 12346, 770, "negru", 123, 230000);
        garaj[5] = new Masina("audi", "a4", "family", 94733, 120, "negru", 300000, 5000);
        garaj[6] = new Masina("vw", "passat", "family", 57275, 116, "albastru", 200000, 3000);
        garaj[7] = new Masina("toyota", "supra", "supercar", 36412, 1500, "rosu", 54200, 1234);
        garaj[8] = new Masina("nissan", "GTR", "supercar", 81263, 900, "gri", 2300, 64325);
        garaj[9] = new Masina("maserati", "grandturismo", "supercar", 10564, 231, "portocaliu", 98234, 267859);
        garaj[10] = new Masina("bmw", "m2", "family", 46412, 300, "galbena", 76723, 435620);


    }


    public void AfisareMasini() {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        for (int i = 1; i <= aux; i++) {
            System.out.println("\nmasina[" + i + "]: |Marca: " + garaj[i].marca + "--model: " + garaj[i].model + "|");
        }
    }


    public void AfisareMasinaCuIndex(int index) {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        for (int i = 1; i <= aux; i++) {
            if (i == index) {
                System.out.println("\nmasina[" + i + "]: |Marca: " + garaj[i].marca + "--model: " + garaj[i].model + "--VIN: " + garaj[i].getVin() + "--Tip: " +
                        garaj[i].tip + "--Culoare: " + garaj[i].culoare + "--Km:  " + garaj[i].km + "--pret: " + garaj[i].getPret() + "$ |");
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


//    public void Cumparare()
//    {
//
//        System.out.println("\nIntroduceti indexul masinii pe care vreti sa o cumparati: ");
//        opt_cumparare = sc.nextInt();
//        System.out.println("Sunteti sigur de alegerea facuta?[Y/N]");
//        verificare_alegere = sc.next().charAt(0);
//
//        if (verificare_alegere == 'Y' || verificare_alegere == 'y')
//        {
//
//            pret_final = (garaj[opt_cumparare].getPret()) + (0.05 * garaj[opt_cumparare].getPret());
//            System.out.println("Pretul masinii este de: " + garaj[opt_cumparare].getPret());
//            System.out.println("Se aplica o taxa de 0.5 din valoarea masinii");
//            System.out.println("Pretul final este: " + pret_final);
//            System.out.println("Se face legatura cu banca...");
//            System.out.println("Se verifica soldul...");
//            if(cb.get_sold() > pret_final) {
//                cb.retragereBani(pret_final);
//                System.out.println("Tranzactia a avut loc cu succes!");
//                System.out.println("Felicitari,"+"! Sunteti posesorul unui: " + garaj[opt_cumparare].marca + " " + garaj[opt_cumparare].model);
//                System.out.println("Doriti sa iesiti din program?[Y/N]");
//                verificare_alegere = sc.next().charAt(0);
//
//                if (verificare_alegere == 'Y' || verificare_alegere == 'y')
//                {
//                    System.exit(0);
//                }
//
//            }
//            else
//            {
//                System.out.println("Nu aveti suficienti bani pe card!");
//                System.out.println("Doriti sa depuneti bani in cont?[Y/N]");
//                char verificare_alegere = sc.next().charAt(0);
//
//                if (verificare_alegere == 'Y' || verificare_alegere == 'y')
//                {
//                    System.out.println("Introduceti suma: ");
//                    int depunere = sc.nextInt();
//                    cb.depunereBani(depunere);
//                    System.out.println("Se revine la Meniul Cumparare!!");
//                    Cumparare();
//                }
//                else
//                {
//                    System.out.println("Alegeti alta masina!");
//                    Cumparare();
//                }
//            }
//
//        }
//
//
//        if (verificare_alegere == 'n' || verificare_alegere == 'N')
//        {
//            Cumparare();
//        }
//
//
//    }


    int index_masina;
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


}
