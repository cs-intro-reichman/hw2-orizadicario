// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		String mode = args[1];
		int amountTimes=1;
		int start = num;
		if(mode.equals("v")){
			System.out.print(num);
		do{
			amountTimes++;
			if(num%2==0){
				num=num/2;
			}else{
				num=num*3+1;
			}
			System.out.print(" "+num);
		}while(num!=1);
		System.out.println(" ("+amountTimes+")");
		System.out.println("Every one of the first "+num+" hailstone sequences reached 1.");
	} else if(mode.equals("c")){
		do{
			amountTimes++;
			if(num%2==0){
				num=num/2;
			}else{
				num=num*3+1;
			}
		}while(num!=1);
		System.out.println("Every one of the first "+start+" hailstone sequences reached 1.");

		
	}
	}

}
