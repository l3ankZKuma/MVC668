import java.util.Arrays;
import java.util.Scanner;

public class App {

    private Model model;
    private View view;

    private Controller controller;
    public App(){
        Model model;
        View view = new View();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song name: ");
        String songName = sc.nextLine();
        System.out.print("Enter duration: ");
        int duration = sc.nextInt();
        System.out.println("Enter names of singers: ");
        String singers = sc.nextLine();
        model = new Model(songName, duration, singers);
        Controller controller = new Controller(model, view);
        controller.processSongRequest();
    }
}
