//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int num = Integer.parseInt(args[1]);
            for(int i=0; i<word.length(); i++){
                char c = Character.toUpperCase(word.charAt(i));
                if(c=='A'||c=='E'||c=='F'||c=='H'||c=='I'||c=='L'||c=='M'||c=='N'||c=='O'||c=='R'||c=='S'||c=='X'){
                        System.out.println("Give me an "+c+": "+c+"!");
                }else{
                        System.out.println("Give me a "+c+": "+c+"!");
                }
            }
            System.out.println("what does that spell?");
            word = word.toUpperCase();
            for(int i=0; i<num; i++){
                System.out.println(word+"!!!");
            }
            
        }
}
