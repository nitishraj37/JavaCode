import java.io.*;
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int f=1; f<=n; f++) {
			if(n%f==0) {
				count = count+1;
				
				}
		}
		if(count%2!=0) {
			System.out.println("Perfect Square");
		}else {
			System.out.println("Not Perfect Square");
		}

	}

}
