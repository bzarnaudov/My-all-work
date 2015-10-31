package all;

import java.util.Scanner;

public class Problem6UnionAndIntersectOfSets {
	public static void main(String[] args) {
		int[] a = new int[4];
        int[] b = new int[4];
        int[] c = new int[4];
        Problem6NumbersFunctionSet[] f = new Problem6NumbersFunctionSet[5];
        Scanner inputLine = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            String[] input = inputLine.nextLine().split(" ");
            a[i] = Integer.parseInt(input[0]);
            b[i] = Integer.parseInt(input[1]);
            c[i] = Integer.parseInt(input[2]);
            f[i] = new Problem6NumbersFunctionSet(a[i], b[i], c[i], 0, 100000);
        }

        String command = inputLine.nextLine();

        CommandExecution(f, command);

        //in row
        System.out.println(f[4].getMembers());
        
        //in column
        for (Integer member : f[4].getMembers()) {
        	System.out.println(member);
        }
        inputLine.close();
	}
	
    private static void CommandExecution(Problem6NumbersFunctionSet[] f, String command) {
        switch (command) {
            case "f1+f2": f[4] = f[1].union(f[2]); break;
            case "f2+f3": f[4] = f[2].union(f[3]); break;
            case "f1+f3": f[4] = f[1].union(f[3]); break;

            case "f1*f2": f[4] = f[1].intersect(f[2]); break;
            case "f1*f3": f[4] = f[1].intersect(f[3]); break;
            case "f2*f3": f[4] = f[2].intersect(f[3]); break;

            case "f1+f2+f3": f[4] = f[1].union(f[2], f[3]); break;
            case "f1*f2*f3": f[4] = f[1].intersect(f[2], f[3]); break;

            case "f1+f2*f3": f[4] = f[1].union(f[2]).intersect(f[3]); break;
            case "f1*f2+f3": f[4] = f[1].intersect(f[2]).union(f[3]); break;
        }
    }

}
