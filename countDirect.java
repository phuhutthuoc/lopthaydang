import java.io.*;
import java.util.*;
public class countDirect{
	public countDirect(String path){
		try{
			int count = 0;
			File f = new File(path);
			if(!f.isFile()){
				String[] arr = f.list();
				for(String s : arr){
					File file = new File(path + "\\" + s);
					if(!file.isFile())
						if(s.indexOf("TM") == 0) count++;
				}
				System.out.println(count);
			}else{
				System.out.println("Duong dan khong dan toi thu muc");
			}
		}catch(Exception e){
			System.out.println("Loi");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap duong dan: ");
		String path = sc.nextLine();
		new countDirect(path);
		sc.close();
	}
}