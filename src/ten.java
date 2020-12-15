import java.util.List;
import java.util.ArrayList;

public class ten {
	public static void main(String[] args) {
		// 12.10 OutOfMemoryError´íÎó
		List list=new ArrayList();
	    try {
			while(true) {
				list.add(new Object());
			}
		} catch (Exception e) {
			System.exit(0);
		}
	}

}
