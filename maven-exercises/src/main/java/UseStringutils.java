import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UseStringutils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: " );
        String input = scanner.nextLine();
        System.out.println("You entered: "+ input);

        if (StringUtils.isNumeric(input)){
            System.out.println(Integer.parseInt(input)+" is a number");

        }else {
            System.out.println(input + " is not a number");
        }
        System.out.println("Flipped case: "+StringUtils.swapCase(input));
        System.out.println("Reveres: "+ StringUtils.reverse(input));
    }
}
