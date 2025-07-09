import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String mensagem1 = scanner.nextLine();
        String mensagem2 = scanner.nextLine();

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Ambas as instancias são as mesmas: " + (logger1 == logger2));

        logger1.log(mensagem1);
        logger2.log(mensagem2);

    }

}
