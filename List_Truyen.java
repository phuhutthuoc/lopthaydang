import java.util.*;
public class List_Truyen{
	public class Truyen implements Comparable<Truyen>{
		private String id, tentruyen, tacgia;
		private int soluong;
		public Truyen(){}
		public Truyen(String i, String t,int s,String tg){
			id = i;
			tentruyen = t;
			soluong = s;
			tacgia = tg;
		}
		public String toString(){
			return id + " " + tentruyen + " " + soluong + " " + tacgia;
		}
		public int getSoluong(){ return soluong;}
		public int compareTo(Truyen obj){
			return (this.getSoluong() > obj.getSoluong()) ? 1 : -1;
		}
	}
	private ArrayList<Truyen> list = null;
	public List_Truyen(){
		list = new ArrayList<Truyen>();
	}
	public void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id, ten truyen, soluong, tacgia");
		String id,tentruyen,tacgia;
		int soluong;
		id = sc.nextLine(); tentruyen = sc.nextLine(); 
		soluong = Integer.parseInt(sc.nextLine());
		tacgia = sc.nextLine();
		Truyen temp = new Truyen(id, tentruyen, soluong, tacgia);
		list.add(temp);
		System.out.println("---");
	}
	public void sort(){
		Collections.sort(list);
		for(Truyen temp : list){
			System.out.println(temp.toString());
		}
	}
	public static void main(String[] args){
		int n = -1;
		System.out.println("0. Thoat");	
		System.out.println("1. Them");		
		System.out.println("2. Sap xep theo so luong");	
		List_Truyen a = new List_Truyen();
		Scanner sc = new Scanner(System.in);
		while(n != 0){
			n = Integer.parseInt(sc.nextLine());
			switch(n){
				case 0: break;
				case 1: a.add(); break;
				case 2: a.sort(); break;
			}
		}
		sc.close();	
	}
}