import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        //todo реализовать ввод пользователем кол-ва ингредиентов.

            System.out.println("Ингридиенты :\n" +
                    "Жабьи глаза, слезы вурдалака, кости ворона, пельмени.\n");
            System.out.println("Рецепты Эликсиров:\n" +
                    "1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости\n" +
                    "2. 2 кости ворона + 4 пельменя - Эликсир стойкости\n" +
                    "3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности\n" +
                    "4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи количество ингридиентов\n");
        System.out.print("Жабьи глаза: ");
        toadEyesCount = scanner.nextInt();
        System.out.print("Слезы вурдалака: ");
        ghoulTearsCount= scanner.nextInt();
        System.out.print("Кости ворона: ");
        ravenBonesCount= scanner.nextInt();
        System.out.print("Пельмени: ");
        dumplingsCount= scanner.nextInt();

        //todo дописать логику программы сюда
            if(toadEyesCount >= 3 && ravenBonesCount >= 1){
                System.out.println("Вы можете приготовить эликсир зоркости");
            }
                if (ravenBonesCount >= 2 && dumplingsCount >= 4){
                    System.out.println("Вы можете приготовить эликсир стойкости");
                }
                if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2){
                    System.out.println("Вы можете приготовить эликсир скрытности");
                }
                if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
                    System.out.println("Вы можете приготовить запретный эликсир");
                }else if (toadEyesCount <= 2 && ghoulTearsCount <= 3 && ravenBonesCount <= 3 &&  dumplingsCount <= 3) {
                    System.out.println("Недостаточно ингридиентов");

                }
    }
}
