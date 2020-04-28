package src;

public class PagaNico {
	
//	public static int pagaNico(int p) {
//
//		if(p >= 500)
//			p -= 500;
//
//		if(p > 200 && p < 500) {
//
//			if(p/3 > 120)
//				p -= 120;
//			else
//				p -=p/3;
//		}
//
//
//		return p;
//	}
	
	public static int pagaNico(int p) {
		p = p>=500 ? p-500 : p;
		return p = p<500 && p>200 ? p/3>120 ? p-=120 : p-p/3 : p;
	}
}
