import java.util.ArrayList;
import java.util.List;

class Validator {
    private static final List<String> arabian = new ArrayList<>();
    private static final List<String> roman = new ArrayList<>();
    private static final List<String> operation = new ArrayList<>();
    private static boolean isRoman;

    static {
        arabian.add("1");
        arabian.add("2");
        arabian.add("3");
        arabian.add("4");
        arabian.add("5");
        arabian.add("6");
        arabian.add("7");
        arabian.add("8");
        arabian.add("9");
        arabian.add("10");
        roman.add("I");
        roman.add("II");
        roman.add("III");
        roman.add("IV");
        roman.add("V");
        roman.add("VI");
        roman.add("VII");
        roman.add("VIII");
        roman.add("IX");
        roman.add("X");
        operation.add("+");
        operation.add("-");
        operation.add("*");
        operation.add("/");
    }

    static void validation(String[] array) {
        if (array.length != 3) {
            if (array.length > 3) {
                throw new NumberFormatException("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } else throw new NumberFormatException("//т.к. строка не является математической операцией");
        }
        if ((!arabian.contains(array[0]) && !roman.contains(array[2])) || (!roman.contains(array[0]) && !arabian.contains(array[2]))) {
            if (!roman.contains(array[0]) && !roman.contains(array[2]) || (!arabian.contains(array[2]) && !arabian.contains(array[0]))) {
                throw new NumberFormatException("Введено не корректное значение.");
            }
        }
        if (!operation.contains(array[1])) {
            throw new NumberFormatException("Не корректный знак операции.");
        }
        if (!arabian.contains(array[0]) || !arabian.contains(array[2])) {
            if (!roman.contains(array[0]) || !roman.contains(array[2])) {
                throw new NumberFormatException("//т.к. используются одновременно разные системы счисления");
            } else Validator.setIsRoman();
        }
    }

    public static void setIsRoman() { isRoman = true;
    }

    public static boolean getIsRoman() { return isRoman;
    }
}
