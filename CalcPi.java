// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double approx=1.0;
		for(int i=1; i<num; i++){
			double term=1.0/(2*i+1);
			if(i%2==1){
				approx-=term;
			}else{
				approx+=term;
			}
		}
		approx = approx*4;
		System.out.println("Pi according to Java: "+Math.PI);
		System.out.println("Pi, approximated:     "+approx);
	}
}
