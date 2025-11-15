// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
        String mode = args[1];

        if (mode.equals("v")) {
            for (int i = 1; i <= n; i++) {
                int num = i;
                int steps = 1;

                System.out.print(num);
                do {
                    steps++;
                    if (num % 2 == 0)
                        num = num / 2;
                    else
                        num = num * 3 + 1;
                    System.out.print(" " + num);
                } while (num != 1); // Great useage of do while!!

                System.out.println(" (" + steps + ")");
            }
            System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
        }

        else if (mode.equals("c")) {
            for (int i = 1; i <= n; i++) {
                int num = i;
                while (num != 1) {
                    if (num % 2 == 0)
                        num = num / 2;
                    else
                        num = num * 3 + 1;
                }
            }
            System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
        }
	}

}

// notice that we dont really need th else if for mode 'c', since we only need the last line. 
// So we can have -
//  if (mode == 'v') {
// blah blah
// }
// System.out.print(Sentence) <- will be executed for both mode 'c' and 'v'

