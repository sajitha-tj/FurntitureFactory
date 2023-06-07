import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of furniture you want: ");
        System.out.println(" 1 - Modern Furniture \n 2 - Victorian Furniture \n-1 - Exit");
        int choice = scanner.nextInt();
        int furnitureChoice;

        while (choice != -1) {
            switch (choice) {
                case 1:
                    System.out.println("Select the furniture you want: ");
                    System.out.println("1 - Table \n2 - Chair \n3 - Sofa");
                    furnitureChoice = scanner.nextInt();
                    switch (furnitureChoice) {
                        case 1:
                            Table table = modernFurnitureFactory.createTable();
                            table.putOn();
                            break;
                        case 2:
                            Chair chair = modernFurnitureFactory.createChair();
                            chair.sitOn();
                            break;
                        case 3:
                            Sofa sofa = modernFurnitureFactory.createSofa();
                            sofa.lieOn();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;
                case 2:
                    System.out.println("Select the furniture you want: ");
                    System.out.println("1 - Table \n2 - Chair \n3 - Sofa");
                    furnitureChoice = scanner.nextInt();
                    switch (furnitureChoice) {
                        case 1:
                            Table table = victorianFurnitureFactory.createTable();
                            table.putOn();
                            break;
                        case 2:
                            Chair chair = victorianFurnitureFactory.createChair();
                            chair.sitOn();
                            break;
                        case 3:
                            Sofa sofa = victorianFurnitureFactory.createSofa();
                            sofa.lieOn();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();
            System.out.println("Enter the type of furniture you want: ");
            System.out.println(" 1 - Modern Furniture \n 2 - Victorian Furniture \n-1 - Exit");
            choice = scanner.nextInt();
        }
    }
}