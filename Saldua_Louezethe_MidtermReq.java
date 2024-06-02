import java.io.File;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Saldua_Louezethe_MidtermReq { 
    // Class name follows the convention of using camel case and starting with in uppercase.
    public static void main(String[] args) throws Exception {
        BigInteger sum, stepOne, stepTwo, firstTerm, lastTerm, totalTerms, TWO; 
        /* 
        * Variables sum, stepOne, stepTwo, firstTerm, lastTerm, and totalTerms follow 
        * the convention of using camel case and starting with in lowercase. Constant TWO 
        * follows the convention of using uppercase. 
        */
        
        Scanner myScanner = new Scanner(new File("Series_Data.txt")); 
        String[] dataString = myScanner.nextLine().split(","); 
        int[] dataInt = Arrays.stream(dataString).mapToInt(Integer::parseInt).toArray(); 
        /* 
        * Variables myScanner, dataString, and dataInt follow the convention of using 
        * camel case and starting with in lowercase. 
        */

        firstTerm = BigInteger.valueOf(dataInt[0]); 
        lastTerm = BigInteger.valueOf(dataInt[1]);
        totalTerms = BigInteger.valueOf(dataInt[2]);
        TWO = BigInteger.valueOf(2); 

        stepOne = (totalTerms.divide(two)); 
        stepTwo = (firstTerm.add(lastTerm));
        sum = stepOne.multiply(stepTwo);

        System.out.println("The arithmetic sequence has a given first term of "+firstTerm+
            ", a last term of "+lastTerm+", and "+totalTerms+" total number of terms.");
        System.out.println("The sum of the arithmetic sequence is " + sum + "."); 

        myScanner.close();

        /* 
        * Code follows the convention of using an indentation of four spaces. 
        * Code follows the convention of using around 80 characters per line.
        * test
        */
    }
}