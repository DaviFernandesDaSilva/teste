import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // Bovino boi;
        // boi = new Bovino();
        Robot robot = new Robot();

        robot.falar();

        System.out.println("Digite a movimentação X e Y do Robô. ( inteiro )");
        robot.xPosition = scan.nextInt();
        robot.yPosition = scan.nextInt();
        
        System.out.println("Posição Atual: ( " + robot.xPosition + " , " + robot.yPosition + " ) ");

        System.out.println("Vamos andar, digite o percorrido. ( x , y )");
        var x = scan.nextInt();
        var y = scan.nextInt();
        robot.andar(x,y);

        scan.close();
    }
}
