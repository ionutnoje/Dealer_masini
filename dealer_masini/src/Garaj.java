import java.util.Scanner;

public class Garaj {


    Scanner sc = new Scanner(System.in);
    Masina[] garaj;

    String culoare;
    String tip;
    String marca;
    String model;
    int km;
    double pret;
    int nr_masini_adaugate_ceo = 0;
    int nr_spatii_garaj = 20;
    int hp;
    int nr_masini_existente = 10;
    int nr_masini_dupa_adaugare_ceo;
    int nr_spatii_libere;
    int index;
    int nr_spatii_ocupate;
    int val_introducere_ceo = 0;




    public Garaj()
    {
        System.out.println("initializare garaj");
    }

    public int getNr_masini_dupa_adaugare_ceo() {
        return nr_masini_dupa_adaugare_ceo;
    }

    public void AdaugareInGarajCeo()
    {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        System.out.println("introduceti numarul de masini pe care vreti sa le introduceti in baza de date(nu mai multe de 10): ");
        int nr_masini_adaugate_ceo = sc.nextInt();
        //garaj = new Masina[nr_spatii_garaj];



        for(int i = aux + 1  ; i <=  nr_masini_adaugate_ceo + aux; i++)

        {
            System.out.println("\n\nMasina de pe indexul" + i);
            System.out.println("["+ i +"] " + "Marca: ");
            marca = sc.next();
            System.out.println("["+ i +"] " + "Model: ");
            model = sc.next();
            System.out.println("["+ i +"] " + "Tip: ");
            tip = sc.next();
            System.out.println("["+ i +"] " + "HP: ");
            hp = sc.nextInt();
            System.out.println("["+ i +"] " + "culoare: ");
            culoare = sc.next();
            System.out.println("["+ i +"] " + "km: ");
            km = sc.nextInt();
            System.out.println("["+ i +"] " + "pret: ");
            pret = sc.nextDouble();

            garaj[i] = new Masina(marca,model,tip,hp,culoare,km,pret);


        }



    }





    public void CreareGarajFaraAdaugara()
    {
        garaj = new Masina[nr_spatii_garaj];


        //masini preexistente in garaj
        garaj[1] = new Masina("ferrari","458","supercar",540,"negru",40000,130000);
        garaj[2] = new Masina("audi","r8","supercar",540,"verde",12000,50000);
        garaj[3] = new Masina("lamborghini","huracan","supercar",640,"rosu",4000,160000);
        garaj[4] = new Masina("ferrari","812","supercar",770,"negru",123,230000);
        garaj[5] = new Masina("audi","a4","family",120,"negru",300000,5000);
        garaj[6] = new Masina("vw","passat","family",116,"albastru",200000,3000);
        garaj[7] = new Masina("toyota","supra","supercar",1500,"rosu",54200,1234);
        garaj[8] = new Masina("nissan","GTR","supercar",900,"gri",2300,64325);
        garaj[9] = new Masina("maserati","grandturismo","supercar",231,"portocaliu",98234,267859);
        garaj[10] = new Masina("bmw","m2","family",300,"galbena",76723,435620);



    }


    public void AfisareMasini()
    {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        for(int i = 1; i <= aux ; i++)
        {
            System.out.println("\nmasina["+ i +"]: "+ garaj[i].marca + " " + garaj[i].model + " " + garaj[i].tip + " " + garaj[i].culoare
                    + " " + garaj[i].km + " km" + "pret: " + garaj[i].pret + "$");
        }
    }


    public void AfisareMasinaCuIndex(int index)
    {
        int aux = VerificareNrMasiniInGaraj();
        System.out.println("aux = " + aux);
        for(int i = 1; i <= aux; i++)
        {
            if(i == index)
            {
                System.out.println("\nmasina["+ i +"]: "+ garaj[i].marca + " " + garaj[i].model + " " + garaj[i].tip + " " + garaj[i].culoare
                        + " " + garaj[i].km + " km" + "pret: " + garaj[i].pret + "$");
            }


        }
    }





    public int ValIntroducereCeo(int val_introducere_ceo)
    {
        this.nr_masini_existente += val_introducere_ceo;
        return this.nr_masini_existente;
    }


    public int VerificareNrMasiniInGaraj()
    {   int nr_masini_dupa_verificare = 0;
        int ok = 1;
        int indice = 1;
        while(ok ==1)
        {
            if(garaj[indice] != null)
            {
                nr_masini_dupa_verificare++;
                indice++;
            }
            else{
                ok = 0;
            }
        }
        return nr_masini_dupa_verificare;
    }


}
