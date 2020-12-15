import java.util.Scanner;
class HexFormatException extends Exception{
	public HexFormatException(String msg) {
		super(msg);
	}
}
public class eight {
	public static void main(String[] args) throws HexFormatException {
		// 12.8 HexFormatException异常
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number:");
		String hex = input.nextLine();
		
		String regex="^[A-Fa-f0-9]+$";
		if(hex.matches(regex)){
			System.out.println("The decimal value for hex number " + hex + " is "+hexToDecimal(hex.toUpperCase()));
			}
		else{
			throw new HexFormatException("输入不是十六进制");
		}
	}
	
	public static int hexToDecimal(String hex) {
		int decimalValue=0;
		for (int i=0;i<hex.length();i++) {
			char hexChar=hex.charAt(i);
			decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if(ch>='A' && ch<='F')
			return 10+ch-'A';
		else
			return ch-'0';
	}
}

