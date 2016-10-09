/**ITK Projekt
 * Tootundied jaotus ja lugemine
 * Created by kristitammet on 02/10/16.
 */
import java.util.ArrayList;
import java.util.Scanner; /*selle pead sa alati enen public folderit sisse tooma,
sest see annab programmile teada, et sa kasutad liberist scanneri koodijuppi*/

import java.text.ParseException;

public class ItkProjekt {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);// sobib kogu programmile =>tahan siin kasutada Java oma koodi juppi)
        System.out.println("Teretulemast töötundide arvestus programmi!" + "\n");
        String courseName; // defineerin variabalid
        int credits;
        int leftHours;

        //asks user to enter subject name
        System.out.println("Sisesta oma õpitava aine nimi:");
        courseName = input.next();

        // TODO: check if this course has already been saved to a file and in that case load the data from that file

        //asks user to enter subject volume (AP)
        System.out.println("Sisesta aine mahu AP-d:");
        credits = input.nextInt();
        leftHours = credits * 20;

        // asks user how many tasks he/she has
        System.out.println("Sisesta mitu erinevat taski Sul kursuse jooksul on: ");
        int askedTaskNumber = input.nextInt();

        // asks user to enter tasks and how many hours he/she wants to spend time?
        System.out.println("Sinu kogu töötundide arv " + courseName + " kursusel on: " + leftHours + " tundi\n");

        ArrayList<Task> taskList = readTaskList(input, askedTaskNumber, leftHours);

        System.out.println("\nExcellent! You have: " + taskList.size() + " tasks"); // fn F2 shows descripiton of anything
        for (int i=0; i<taskList.size(); i++) {
            System.out.println("\nTask " + (i+1) + " is " + taskList.get(i).name + " and has " + taskList.get(i).hours + " hours");
        }

        // TODO: save the course (with task list) to a file
    }

    private static ArrayList<Task> readTaskList(Scanner input, int askedTaskNumber, int leftHours) {
        ArrayList<Task> taskList = new ArrayList<Task>(); /* we have array list and we call it taskList, we
        creat a new arrayList of tasks object*/

        for (int i = 1; i <= askedTaskNumber; i++) {
            Task task = new Task();
            System.out.println("Palun sisesta task " + i + ":");
            task.name = input.next();// as it is string, you don't need a next String!! (Intiga is nessery)

            if (i < askedTaskNumber) {
                if (i>1) System.out.println("\nJärgijäänud töötundide maht on: " + leftHours);
                System.out.println( "Palun sisesta tundide arv: " );
                task.hours = input.nextInt(); // luhendad rida
                if (task.hours > leftHours) {
                    System.out.println("Vaata tundide arv üle! Error!");
                    i--; // make i same as it was the current task
                    continue; // contnniu for loop
                }
                leftHours = leftHours - task.hours; //  if there no error, only then save it ..Refector->rename variables all
            } else {
                task.hours = leftHours; // that we get last hours form system caluclation
                System.out.println("Töötundide maht on: "+ leftHours);
            }
            taskList.add(task); // we collected all datas and now puting in the taskList
        }

        return taskList;
    }
}
