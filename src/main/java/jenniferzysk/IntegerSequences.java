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
        
        if(mode.equals("TRIANGLE")){
       	    System.out.println("Tri(" + input + ") = " + triangle(input));
	 }
        
        else if(mode.equals("LAZY")){
       	    System.out.println("Lazy(" + input + ") = " + lazy(input));
        }
            
    }
    
    public static int triangle(int input){
        int tri = 0;
            for(int i = input; i > 0; i--){
                tri = tri + i;
            }
	return tri;
    }
    
    public static int lazy(int input){
        int maxCuts = ((input * input) + input + 2)/2;
	return maxCuts;
    }

}
