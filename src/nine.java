import java.util.Scanner;
class BinaryFormatException extends Exception{
	public BinaryFormatException(String msg) {
		super(msg);
	}
}
public class nine {
	public static void main(String[] args) throws BinaryFormatException {
		// 12.9 BinaryFormatException�쳣
		Scanner input = new Scanner(System.in);
		System.out.print("�����������:");
		String binary = input.nextLine();
		String regex="^[0-1]+$";
		if(binary.matches(regex)){
			System.out.println("ʮ������Ϊ"+Integer.parseInt(binary,2));
			}
		else{
			throw new BinaryFormatException("���벻�Ƕ�����");
		}
	}

}
