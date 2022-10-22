import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Введите значения через пробел.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        int result = 0;
        String[] array = input.split(" ");
        Validator.validation(array);
        int number1 = Convertor.convertor(array[0]);
        char operation = array[1].charAt(0);
        int number2 = Convertor.convertor(array[2]);

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }

        return Convertor.convertor(result);
    }
}
