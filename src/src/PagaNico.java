package src;

public class PagaNico {
	
	public static int pagaNico(int p) {
		return (p%=500) < 201 ? p : p > 360 ? p-120 : p-p/3;
		//return p = (p%=500) < 201 ? p : p > 360 ? p-120 : p-p/3;
	}
	
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
	

	
	public static int pagaNico3(int p) {
		p = p>499 ? p-500 : p;
		return p = p>200 ? p>360 ? p-120 : p-p/3 : p;
		//p = p>499 ? p-500 : p;
		//return p = p>200 ? p>360 ? p-120 : p-p/3 : p;
		//return p = p>360 ? p-120 : p-p/3;
		//return p = p%500>200 ? p/3>121 ? p-120 : p-p/3 : p;
		//return p = p<500 && p>200 ? p/3>=120 ? p-120 : p-p/3 : p;
	}
	

	
	public static int pagaNico2(int p) {
		p = p>=500 ? p-500 : p;
		return p = p<500 && p>200 ? p/3>120 ? p-=120 : p-p/3 : p;
	}
}
