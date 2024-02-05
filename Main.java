import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        toyStore.addToy(new Toy(1, "Keychain", 4, 20));
        toyStore.addToy(new Toy(2, "Ball", 3, 15));
        toyStore.addToy(new Toy(3, "Toy car", 5, 25));
        toyStore.addToy(new Toy(4, "Minifigure", 5, 25));
        toyStore.addToy(new Toy(5, "Lego", 5, 25));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "\n1 - Доступные игрушки /2 - Разыграть /3 - Изменить /4 - Добавить /5 - Выход");
            System.out.print("Выберите действие: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите число!");
                System.out.print("Выберите действие: ");
                scanner.next();
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    toyStore.printAvailableToys();
                    break;
                case 2:
                    toyStore.givaAway();
                    break;
                case 3:
                    toyStore.editToyById();
                    break;
                case 4:
                    toyStore.addNewToy();
                    break;
                case 5:
                    System.out.println("Завершение работы");
                    System.exit(0);
                default:
                    System.out.println("Недопустимая операция. Попробуйте снова!");
            }
        }
    }
}
