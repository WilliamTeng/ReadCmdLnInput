/**
 * Created by William.Teng on 10/9/16.
 */
import java.util.*;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Please input the student #:\n");

        int stuNo = input.nextInt();

        if(stuNo == 1)
            System.out.println("Zhang San!");
        else if(stuNo == 2)
            System.out.println("Li Si!\n");
        else
            System.out.println("Wang Er\n");


    }
}
