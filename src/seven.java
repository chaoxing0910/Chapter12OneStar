	import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		// 12.7 NumberFormatException�쳣
		Scanner input = new Scanner(System.in);
		System.out.print("�����������:");
		String binary = input.nextLine();
		String regex="^[0-1]+$";
		if(binary.matches(regex)){
			System.out.println("ʮ������Ϊ"+Integer.parseInt(binary,2));
			}
		else{
			throw new NumberFormatException("���벻�Ƕ�����");
		}
	}

}
