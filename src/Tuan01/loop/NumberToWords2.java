import java.util.Scanner;

public class NumberToWords2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        number = scanner.nextInt();
        System.out.printf("%d in words: " + numberInWords(number),number);
    }
    public static String numberInWords(int number){
        int hundredsNum = Math.floorDiv(number, 100);
        int tensNum = Math.floorDiv(Math.floorMod(number, 100), 10);
        int onesNum = Math.floorMod(number, 10);
        String word = "";
        String hundredsWord;
        String tensWord;
        String onesWord;
        switch (onesNum) {
            case 0:
                if (number < 10) {
                    onesWord = "Zero";
                } else {
                    onesWord = "";
                }
                break;
            case 1:
                onesWord = "One";
                break;
            case 2:
                onesWord = "Two";
                break;
            case 3:
                onesWord = "Three";
                break;
            case 4:
                onesWord = "Four";
                break;
            case 5:
                onesWord = "Five";
                break;
            case 6:
                onesWord = "Six";
                break;
            case 7:
                onesWord = "Seven";
                break;
            case 8:
                onesWord = "Eight";
                break;
            case 9:
                onesWord = "Nine";
                break;
            default:
                onesWord = "";
                break;
        }
        switch (tensNum) {
            case 1:
                tensWord = "Ten";
                break;
            case 2:
                tensWord = "Twenty";
                break;
            case 3:
                tensWord = "Thirty";
                break;
            case 4:
                tensWord = "Forty";
                break;
            case 5:
                tensWord = "Fifty";
                break;
            case 6:
                tensWord = "Sixty";
                break;
            case 7:
                tensWord = "Seventy";
                break;
            case 8:
                tensWord = "Eighty";
                break;
            case 9:
                tensWord = "Ninety";
                break;
            default:
                tensWord = "";
                break;
        }
        switch (hundredsNum) {
            case 1:
                hundredsWord = "One hundred";
                break;
            case 2:
                hundredsWord = "Two hundred";
                break;
            case 3:
                hundredsWord = "Three hundred";
                break;
            case 4:
                hundredsWord = "Four hundred";
                break;
            case 5:
                hundredsWord = "Five hundred";
                break;
            case 6:
                hundredsWord = "Six hundred";
                break;
            case 7:
                hundredsWord = "Seven hundred";
                break;
            case 8:
                hundredsWord = "Eight hundred";
                break;
            case 9:
                hundredsWord = "Nine hundred";
                break;
            default:
                hundredsWord = "";
                break;
        }
        if (number < 20 && number > 10) {
            switch (number) {
                case 11:
                    word = "Eleven";
                    break;
                case 12:
                    word = "Twelve";
                    break;
                case 13:
                    word = "Thirdteen";
                    break;
                case 14:
                    word = "Fourteen";
                    break;
                case 15:
                    word = "Fifteen";
                    break;
                case 16:
                    word = "Sixteen";
                    break;
                case 17:
                    word = "Seventeen";
                    break;
                case 18:
                    word = "Eighteen";
                    break;
                case 19:
                    word = "Nineteen";
                    break;
            }
        } else if (number >= 100) {
            word = hundredsWord + " and " + tensWord + " " + onesWord;
        } else {
            word = tensWord + " " + onesWord;
        }
        return word;
    }
}