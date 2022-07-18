import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wiek");
        int age = scanner.nextInt();

        if (age >= 18) {

            System.out.println("jestes pelnoletni");
        }  else{
                System.out.println("Nie jestes pelnoletni");
            }

        if(age==100){
            System.out.println("wow masz az sto lat!");
        }

        System.out.println("wynik dodawania " + age + " + 2 to: " + (age+2));
        System.out.println(age-2);
        System.out.println(age*2);
        System.out.println(age/2);
        System.out.println(age%2);


        if (age % 2 == 0){
            System.out.println("Liczba jest parzysta EZ!");
        } else {
            System.out.println("Liczba nie jest parzysta");
        }




        }
    }