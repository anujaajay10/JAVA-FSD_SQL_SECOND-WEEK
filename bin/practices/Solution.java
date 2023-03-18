package practices;
import java.util.Scanner;

public class Solution {

		public static void main(String[] args) {
			Scanner n = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num = n.nextInt();
			int ans = powerof2(num);
			if(ans==0) {
				System.out.println(num + " is not a power of 2");
			}
			else
			{
				System.out.println(num + " is a power of 2");
			}
			
			
		}
		
		public static int powerof2(int num) {
			int flag = 0;
			for(int i=0;i<8;i++) {
				if(Math.pow(2, i)==num) {
					flag = 1;
					break;
				}
				else {
					flag = 0;
				}
			}
			return flag;
			
		}

	}
