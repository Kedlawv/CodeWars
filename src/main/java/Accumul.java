public class Accumul {

    public static String accumKedlawCharArr(String s) {
        char[] inputArray = s.toCharArray();
        char[] resultArray = new char[countLengthOfResultArray(s.length())];
        int index = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (i != 1) {
                resultArray[index] = '-';
                index++;
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    resultArray[index] = Character.toUpperCase(inputArray[i - 1]);
                    index++;
                } else {
                    resultArray[index] = Character.toLowerCase(inputArray[i - 1]);
                    index++;
                }
            }

        }

        return String.copyValueOf(resultArray);

    }

    public static String accumKedlawStringBuilder(String s) {
        char[] inputArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            if (i != 1) {
                sb.append('-');
            }
            for (int j = 1; j <= i; j++) {

                if (j == 1) {
                    sb.append(Character.toUpperCase(inputArray[i - 1]));

                } else {
                    sb.append(Character.toLowerCase(inputArray[i - 1]));
                }
            }

        }

        return sb.toString();

    }


    public static String accumCWTopAnswer(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }


    public static int countLengthOfResultArray(int stringLength) {
        int resultLength = 0;
        for (int i = 1; i <= stringLength; i++) {
            resultLength += i;
        }
        resultLength += stringLength - 1;
        return resultLength;
    }
}