/**ITK Projekt
 * Tootundied jaotus ja lugemine
 * Created by kristitammet on 02/10/16.
 */



        import java.util.Scanner; /*selle pead sa alati enen public folderit sisse tooma,
        sest see annab programmile teada, et sa kasutad liberist scanneri koodijuppi*/




        public class ItkProjekt {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);// Kas see igakord saab uue sisendi?
                System.out.println("Teretulemast töötudnide arvestus programmi!");
                    String kursuseNimi; // defineerin variabalid
                    int aineMaht;
                    int sum;

                //asks user to enter subject name
                    Scanner one= new Scanner(System.in);// kuidas saab seda kirjutada nii et ei see allub ulemisele reale?
                System.out.println( "Sisesta oma õpitava aine nimi:");
                kursuseNimi =one.next(); // kursuenimi= variable, next=kuvab uuel real

                //asks user to enter subject volume (AP)
                    Scanner second= new Scanner (System.in);
                System.out.println("Sisesta aine mahu AP-d:");
                    aineMaht=second.nextInt();// selle pean tapsutama, et on int
                    sum= aineMaht*20;
            System.out.println("Sinu töötundide arv " + kursuseNimi +" kursusel on: "+ sum+" tundi");

            // nuud peaks vsit objective hakakma kasutama?

            // asks user to enter task & deadlines
                String Ulesanne;
                System.out.println("Palun sisesta ülesanne ja tähtaeg!"+"\n");
                System.out.println("Esimene ülesanne:");
                Scanner i= new Scanner(System.in);
                Ulesanne=i.next();

             //dealine, uleval kaustan Java Dateformatit
                System.out.println("ja selle tähtaeg:");
                Scanner scanner= new Scanner(System.in);



    }
}
