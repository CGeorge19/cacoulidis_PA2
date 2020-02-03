import static java.lang.Integer.parseInt;

public class Decrypter
{
    public static int[] decrypt(String num)
    {
        int i, numberHolder, number;
        char[] charArray = num.toCharArray();
        int[] numbers = new int[4];
        
        // convert from string to int array 
        for(i = 0; i < 4; i++)
        {
        	numbers[i] = parseInt(String.valueOf(charArray[i])); 
        }
        
        // swap things 
        numberHolder = numbers[0]; 
        numbers[0] = numbers[2];
        numbers[2] = numberHolder; 
        
        numberHolder = numbers[1]; 
        numbers[1] = numbers[3]; 
        numbers[3] = numberHolder; 
        
        // decrypt to original value
        for(i = 0; i < 4; i++)
        {
        	number = numbers[i];
        	
        	if(number < 7)
        		numbers[i] = number + 3; 
        	
        	if(number >= 7)
        		numbers[i] = number - 7; 
        }
        
        return numbers;
    }
}
