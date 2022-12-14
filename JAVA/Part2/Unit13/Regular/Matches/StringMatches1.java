package Unit13.Regular.Matches;
public class StringMatches1 
{
    public static void main(String[] args) 
    {
        String[] numbers = {
            "0910-123456","0916-123-456",
            "0910179428", "0916-179428",
            "091-018-9188", "O910-179428"
        };
        
        for(String number : numbers) 
        {
        	// 任意四個0-9的數字, -, 任意6個數字
            if(number.matches("^[0-9]{4}-\\d{6}$")) 
            {
                System.out.println(number);
            }
        }
    }
}