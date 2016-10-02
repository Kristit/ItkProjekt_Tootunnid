/**ITK Projekt
 * Tootundied jaotus ja lugemine
 * Created by kristitammet on 02/10/16.
 */


        import java.util.Scanner; /*selle pead sa alati enen public folderit sisse tooma,
        sest see annab programmile teada, et sa kasutad liberist scanneri koodijuppi*/

        public class ItkProjekt {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                System.out.println("Teretulemast töötudnide arvestus programmi!");
                    //String kursuseNimi
                    //int aineMaht

                //allows user to enter subject name
                System.out.println( "Sisesta oma õpitava aine nimi:");
                    String kursuseNimi=input.nextLine(); // string=sona, kursuenimi= variable,input= isestatud info, next(line)=kuvab uuel real

                //allows user to enter subject volume (AP)
                System.out.println("Sisesta aine mahu AP-d:");
                    String aineMaht=input.next();

            System.out.println("Sinu töötundide arv selle arine raames on:" );






    }
}
