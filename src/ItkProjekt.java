/**ITK Projekt
 * Tootundied jaotus ja lugemine
 * Created by kristitammet on 02/10/16.
 */



        import java.util.Calendar;
        import java.util.GregorianCalendar;
        import java.util.Scanner; /*selle pead sa alati enen public folderit sisse tooma,
        sest see annab programmile teada, et sa kasutad liberist scanneri koodijuppi*/



        import java.util.Date;
        import java.text.ParseException;
        import java.text.SimpleDateFormat; /*convert a Java string to a date,
        Uses a String pattern to define the expected date format.*/

        public class ItkProjekt {
            public static void main(String[] args) throws ParseException {
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


            // asks user how many tasks he/she has
                String askTaskNumber;
                Scanner third= new Scanner (System.in);
                System.out.println("Sisesta mitu erinevat taski Sul on: ");
                askTaskNumber= third.next();

            // asks user to enter tasks
                String task;
                System.out.println("Palun sisesta ülesannded"+"\n");
                Scanner input = new Scanner(System.in);*/





                // asks user deadline
                //Scanner scanner = new Scanner(System.in);
                //System.out.println("Lisa ülesande tahtaeg: ");




    }
}
