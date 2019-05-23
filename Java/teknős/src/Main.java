import java.util.Scanner;

public class Main {
public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    Map map =new Map(10,10);
    map.draw();

    System.out.println("csá");
    String str =scanner.nextLine();

    while ( !str.equals("kilep")){
        map.doCommand(str);
        map.draw();
        str = scanner.nextLine();
    }

    }
}
