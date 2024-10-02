import java.util.*;
public class soamMax{
	public static int soam(int[] a){
		for(int i = 0 ; i < a.length ; i++) if(a[i] < 0) return a[i];
		return 1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai mang n = ");
		int n = Integer.parseInt(sc.nextLine());
		int[] a = new int[n];
		System.out.println("Nhap " + n + " so");
		for(int i = 0 ; i < n ; i++) a[i] = Integer.parseInt(sc.nextLine());
		int m = soam(a);
		for(int i = 0 ; i < n ; i++){
			if(a[i] < 0 && a[i] > m) m = a[i];
		}
		if(m < 0) System.out.println(m);
		else System.out.println("Khong co so am trong mang");
		sc.close();
	}
}