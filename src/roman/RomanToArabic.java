package roman;

public class RomanToArabic {
	
	public int convert(String input, String last) {
		String next = "";
		String first = "";
		int rest = 0;
		
		if(input.length() > 1) {
			first = input.substring(0,1);
			next = input.substring(1,input.length());				
			rest = convert(next, ""); 
			input = first;
		}
		
		int res = 0;
		if(input.equals("I")){
			res = 1;
		}
		else if(input.equals("V")) {
			res = 5;
		}else if(input.equals("X")) {
			res = 10;	
		}else if(input.equals("L")) {
			res = 50;
		}else if(input.equals("C")) {
			res = 100;
		}else if(input.equals("D")) {
			res = 500;
		}else if(input.equals("M")) {
			res = 1000;
		}
		
		
		if(		first.equals("I")&&next.substring(0,1).equals("V") ||
				first.equals("I")&&next.substring(0,1).equals("X") ||
				first.equals("X")&&next.substring(0,1).equals("L") ||
				first.equals("X")&&next.substring(0,1).equals("C") ||
				first.equals("C")&&next.substring(0,1).equals("D") ||
				first.equals("C")&&next.substring(0,1).equals("M") 
				)
			return rest - res;
		return res + rest;
		
	}

}
