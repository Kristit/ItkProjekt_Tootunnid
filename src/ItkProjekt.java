/**ITK Projekt
 * Tootundied jaotus ja lugemine
 * Created by kristitammet on 02/10/16.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner; /*selle pead sa alati enen public folderit sisse tooma,
sest see annab programmile teada, et sa kasutad liberist scanneri koodijuppi*/

import java.text.ParseException;

public class ItkProjekt extends Application {

    TextField subjectNamee = new TextField();

    public static void main(String[] args) throws ParseException { // programmi alguspunk

        launch(args); // kasu alustada


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
        System.out.println("Add your credits:");
        credits = input.nextInt();
        leftHours = credits * 20;

        // asks user how many tasks he/she has
        System.out.println(" How many tasks you have in your course? ");
        int askedTaskNumber = input.nextInt();

        // asks user to enter tasks and how many hours he/she wants to spend time?
        System.out.println("Your working hours amount is for " + courseName + " course " + leftHours + " hours\n");

        ArrayList<Task> taskList = readTaskList(input, askedTaskNumber, leftHours);

        System.out.println("\nExcellent! You have: " + taskList.size() + " tasks"); // fn F2 shows descripiton of anything
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println("\nTask " + (i + 1) + " is " + taskList.get(i).name + " and has " + taskList.get(i).hours + " hours");
        }

        // TODO: save the course (with task list) to a file


    }

    private static ArrayList<Task> readTaskList(Scanner input, int askedTaskNumber, int leftHours) {
        ArrayList<Task> taskList = new ArrayList<Task>(); /* we have array list and we call it taskList, we
        creat a new arrayList of tasks object*/

        for (int i = 1; i <= askedTaskNumber; i++) {
            Task task = new Task();
            System.out.println("Please add your task: " + i + ":");
            task.name = input.next();// as it is string, you don't need a next String!! (Intiga is nessery)

            if (i < askedTaskNumber) {
                if (i>1) System.out.println("\nLefthours: " + leftHours);
                System.out.println( "Please add your task: " );
                task.hours = input.nextInt(); // luhendad rida
                if (task.hours > leftHours) {
                    System.out.println("Check your hours! Error!");
                    i--; // make i same as it was the current task
                    continue; // contnniu for loop
                }
                leftHours = leftHours - task.hours; //  if there no error, only then save it ..Refector->rename variables all
            } else {
                task.hours = leftHours; // that we get last hours form system caluclation
                System.out.println("Workinghours: "+ leftHours);
            }
            taskList.add(task); // we collected all datas and now puting in the taskList
        }

        return taskList;
    }


    /* @Override on märge, mis ütleb, et käesolev meetod on super klassist (Application) üle kirjutatud.
    Nimelt Application klassis on meetod start() juba olemas, aga meie kirjutame selle tegevused enda vajaduse järgi üle.*/


    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();  //stacki omadus-saad ukteise peale panna, aga Pain saad
        Scene scene = new Scene(stack, 400, 300);

        VBox vbox = new VBox();
        Scene subjectName = new Scene(vbox, 300, 150); // teksti kasti suurus
        primaryStage.setScene(subjectName);


        Label title = new Label("Your subject name?");
        Button sumbitButton = new Button("Registrate");
        sumbitButton.setOnMouseClicked(this::doStuff);
        vbox.getChildren().addAll(title, subjectNamee, sumbitButton); /* subjecNamee viisin ulesse klassifiildi (tostsin valja meetodist)
        siis saan erinevates meetoditest pooruda fildi poole*/
        primaryStage.show();// "ekraan" kuhu kast kuvatakse


    }

    private void doStuff(MouseEvent mouseEvent) { //saan kogu tegevuse, mis saan nupu vajutsega teha
        System.out.println(subjectNamee.getText());
    }
}