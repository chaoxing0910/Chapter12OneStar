	import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		// 12.7 NumberFormatException异常
		Scanner input = new Scanner(System.in);
		System.out.print("输入二进制数:");
		String binary = input.nextLine();
		String regex="^[0-1]+$";
		if(binary.matches(regex)){
			System.out.println("十进制数为"+Integer.parseInt(binary,2));
			}
		else{
			throw new NumberFormatException("输入不是二进制");
		}
	}

}
