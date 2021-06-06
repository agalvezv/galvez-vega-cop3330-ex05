package challenge5;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("What is the first number?");
        String firstnum = inputs.nextLine();
        System.out.println("What is the second number?");
        String secondnum = inputs.nextLine();

        numericalConversion(firstnum, secondnum);

    }

    public static void numericalConversion(String one, String two)
    {
        double firstupdated = Double.parseDouble(one);
        double  secondupdated = Double.parseDouble(two);

        double addition = firstupdated+secondupdated;
        String addedval = String.valueOf(addition);


        double subtraction = firstupdated-secondupdated;
        String subval = String.valueOf(subtraction);


        double multiply = firstupdated*secondupdated;
        String multval = String.valueOf(multiply);


        double divided = firstupdated/secondupdated;
        divided = Math.round(divided*100);
        divided = divided/100;
        String divval = String.valueOf(divided);


        System.out.println(one + " + " + two + " = " + addedval + "\n" + one + " - " + two + " = " + subval + "\n" + one + " * " + two + " = " + multval + "\n" + one + " / " + two + " = " + divval);



    }
}