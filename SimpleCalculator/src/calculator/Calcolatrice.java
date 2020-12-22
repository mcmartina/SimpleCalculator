package calculator;

public class Calcolatrice {
	
	
	int add(int x, int y) {
		return x+y;
	}
	
	int sub(int x, int y) {
		return x-y;
	}
	
	int mul(int x, int y) {
		return x*y;
	}
	
	int div(int x, int y) {
		if (y!=0) 
			return x/y;
		else 
			return Integer.MAX_VALUE;
	}
	
	
	int gcd(int x, int y) {
		if (y>x) {
			while (x!=0) {
				int resto = y%x;
				x = resto;
				if(resto==0)
					break;
				y = x;
			}
			return y;
		} 
		
		else if (x>y) {
			while (y!=0) {
				int resto = x%y;
				y = resto;
				if(resto==0)
					break;
				x = y;
			}
			return x;
		} 
		
		else if (x==0)
			return y;
		else if (y==0)
			return x;
		else 
			return x; 		
	}
	
	//fare caso di test
	//i metodi servono per settare l'ambiente per eseguire i casi di test della classe di test
	//i primi due sono eseguiti una volta prima della classe e una volta dopo la classe
	//gli ultimi due si mettono per includere cose che vengono fatte prima e dopo il caso di test
	

}
