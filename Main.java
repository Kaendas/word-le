import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        final String BG_GREEN = " \u001b[42m";
        final String BG_YELLOW = "\u001b[43m";
        final String RESET = "\u001b[0m";
        Scanner scanner = new Scanner(System.in);


        
        ///input detection annd output will change upon me having it done 
        
        String Quess = "SHAKE";
        System.out.println("enter your quess");
        System.out.println("quess must be capitalised");
        String Correct = scanner.nextLine();
        
        //loop created to check if the quess is correct or not
        for (int i = 0; i < 5; i++) {
             if (Quess.substring (i, i+1).equals(Correct.substring(i, i+1))){
           
            System.out.println(BG_GREEN + Quess.substring(i, i+1) + RESET);
            // is in the correct spot
        }
        else if (Correct.indexOf(Quess.substring(i, i+1))> -1)
        {
            //is but not at the correct spot 
            System.out.println(BG_YELLOW + Quess.substring(i, i+1) + RESET);
        }
        else
        {
            //not in the word
            System.out.println(Correct.substring(i, i+1));
        
    
        }
        scanner.close();
        }
    }
}
       
       
      
        
       
        
        
       
    


