public class IntegerSequences{

    public static void main(String [] args){
    
        if(args.length != 2){
            System.out.println("You need to pass two arguements! Run the program again.");
            System.exit(3);
        }
        
        String mode = args[0].toUpperCase();
        int input = 0;
        if(!mode.equals("LAZY") && !mode.equals("TRIANGLE")){
            System.out.println("The first argument must be lazy or triangle. Run the program again.");
            System.exit(1);
        }
        
        try{
        
            input = Integer.parseInt(args[1]);
            
            if(input <= 0){
                System.out.println("Error: Enter a positive 32-bit integer");
                System.exit(2);
            }
        
        }catch(NumberFormatException e){
            System.out.println("The second argument must be a positive 32-bit integer. Run the program again.");
            System.exit(2);
        }
        
        
        int tri = 0;
        if(mode.equals("TRIANGLE")){
            for(int i = input; i > 0; i--){
                tri = tri + i;
            }
            System.out.println("Tri(" + input + ") = " + tri);
        }
        
        else if(mode.equals("LAZY")){
            int maxCuts = ((input * input) + input + 2)/2;
            System.out.println("Lazy(" + input + ") = " + maxCuts);
            
        }
    
    }

}
