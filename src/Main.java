import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String choiceLine = CustomScanner.line();
        String choiceFirstLetter = CustomScanner.line();
        String choiceSecondLetter = CustomScanner.line();
        String[] array =  choiceLine.split("");
        StringBuilder stringBuilder = new StringBuilder(choiceLine);
        for (int i = 0, j = 1; i < array.length && j < array.length; i++) {
            if(array[i].equals(choiceFirstLetter)) {
                stringBuilder.insert(i + j,choiceSecondLetter);
                j++;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
