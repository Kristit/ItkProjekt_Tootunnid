/**ITK Projekt
 * Tootundied jaotus ja lugemine
 * Created by kristitammet on 02/10/16.
 */



        import com.sun.deploy.panel.ExceptionListDialog;
        import java.util.Scanner; /*selle pead sa alati enen public folderit sisse tooma,
        sest see annab programmile teada, et sa kasutad liberist scanneri koodijuppi*/

        import java.text.ParseException;


        public class ItkProjekt{
            public static void main(String[] args) throws ParseException {
                Scanner input = new Scanner(System.in);// sobib kogu programmile =>tahan siin kasutada Java oma koodi juppi)
                System.out.println("Teretulemast töötundide arvestus programmi!" + "\n");
                String courseName; // defineerin variabalid
                int credits;
                int leftHours;

                //asks user to enter subject name
               System.out.println("Sisesta oma õpitava aine nimi:");
                courseName = input.next();

                //asks user to enter subject volume (AP)
                System.out.println("Sisesta aine mahu AP-d:");
                credits = input.nextInt();
                leftHours = credits * 20;


                // asks user how many tasks he/she has
                int askTaskNumber;
                System.out.println("Sisesta mitu erinevat taski Sul kursuse jooksul on: ");
                askTaskNumber = input.nextInt();

                // asks user to enter tasks and how many hours he/she wants to spend time?
                String askTaskName;
                System.out.println("Sinu kogu töötundide arv " + courseName + " kursusel on: " + leftHours + " tundi" + "\n");


                for (int i = 0; i < askTaskNumber; i++) {
                    System.out.println("Palun sisesta task " + (1 + i) + ":");
                    askTaskName = input.next();

                    System.out.println( "Palun sisesta tundide arv: " );
                    int askTaskHours;
                    askTaskHours = input.nextInt();
                    leftHours = leftHours - askTaskHours;
                    System.out.println("\n"+ "Järgijäänud töötundide maht on: " + leftHours);
                    if (leftHours < 0) {
                        System.out.println("Vaata tundide arv üle! Error!");


                    }

                }

            }
        }