import static java.lang.Integer.parseInt;

public class Encrypter
{
    public static int[] encrypt(String num)
    {
        int i, numberHolder;
        char[] charArray = num.toCharArray();
        int[] numbers = new int[4];
        
        // convert from string to int array 
        for(i = 0; i < 4; i++)
        {
        	numbers[i] = parseInt(String.valueOf(charArray[i])); 
        	numbers[i] = ((numbers[i] + 7) % 10);
        }
        
        //swap things 
        numberHolder = numbers[0]; 
        numbers[0] = numbers[2];
        numbers[2] = numberHolder; 
        
        numberHolder = numbers[1]; 
        numbers[1] = numbers[3]; 
        numbers[3] = numberHolder; 
        
        return numbers;
    }
}