class Convertor {

    private static final String[] ROMAN = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    static int convertor(String array) {
        int romNum = 0;
        if (Validator.getIsRoman()) {
            for (String romanNum : ROMAN) {
                romNum++;
                if (romanNum.equals(array)) {
                    break;
                }

            }
        } else {
            romNum = Integer.parseInt(array);
        }
        return romNum;
    }

    static String convertor(int result) {
        String romResult;
        if (Validator.getIsRoman()) {
            if (result < 1) {
                throw new NumberFormatException("//т.к. в римской системе нет отрицательных чисел и ноль");
            }
            romResult = ROMAN[result-1];
        } else {
            romResult = Integer.toString(result);
        }
        return romResult;
    }
}