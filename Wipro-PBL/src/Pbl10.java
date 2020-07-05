class Pbl10
{
    public static void main (String[] args)
    {
        char input_char=args[0].charAt(0);
	if ((input_char >= 65 && input_char <= 90) 
            || (input_char >= 97 && input_char <= 122)) 
            System.out.println(" Alphabet "); 
        else if (input_char >= 48 && input_char <= 57) 
            System.out.println(" Digit "); 
        else
            System.out.println(" Special Character ");
        
    }
    }
