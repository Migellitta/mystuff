package randomNumberGenerator;
import java.util.Arrays;

public class RandomNumberGenerator {
    public void getNumbers(String[] args) {
        if (args.length != 0) {
            int[] argsOnlyNumbers = getOnlyNumbers(args);
            for (int i = 0; i < argsOnlyNumbers.length; i++) {
                if (argsOnlyNumbers[i] > 0) {
                    long maxValue = (long) (Math.pow(10, argsOnlyNumbers[i]));
                    long randomNumber = (long) (Math.random() * maxValue * 2 - maxValue);
                    System.out.println(argsOnlyNumbers[i] + " : " + randomNumber);
                } else {
                    System.out.println(argsOnlyNumbers[i] + " : Incorrect amount of numerals");
                }
            }
        } else {
            System.out.println("No incoming values");
        }
    }

    @org.jetbrains.annotations.NotNull
    private int[] getOnlyNumbers(String[] args) {
        String incomingArgs = Arrays.toString(args);
        int argsLengthForOnlyNumbers = args.length;
        for (String element : args) {
            try {
                double temp = Double.parseDouble(element.replace(",", "."));
            } catch (Exception e) {
                argsLengthForOnlyNumbers--;
            }
        }
        int[] argsOnlyNumbers = new int[argsLengthForOnlyNumbers];
        int amendment = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                double temp = Double.parseDouble(args[i].replace(",", "."));
                int roundedTemp = (int) Math.floor(temp);
                argsOnlyNumbers[i - amendment] = roundedTemp;
            } catch (Exception e) {
                amendment++;
            }
        }
        return argsOnlyNumbers;
    }
}
