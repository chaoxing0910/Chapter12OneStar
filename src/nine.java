import java.util.Scanner;
class BinaryFormatException extends Exception{
	public BinaryFormatException(String msg) {
		super(msg);
	}
}
public class nine {
	public static void main(String[] args) throws BinaryFormatException {
		// 12.9 BinaryFormatException异常
		Scanner input = new Scanner(System.in);
		System.out.print("输入二进制数:");
		String binary = input.nextLine();
		String regex="^[0-1]+$";
		if(binary.matches(regex)){
			System.out.println("十进制数为"+Integer.parseInt(binary,2));
			}
		else{
			throw new BinaryFormatException("输入不是二进制");
		}
	}

}
