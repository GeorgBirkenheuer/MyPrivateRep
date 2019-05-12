package roman;

public class ArabicToRoman {
	
	public String convert(int input, String rz) {
		
		if(input >= 1000) {
			return  rz + convert(input-1000, "M") ;
		}else if(input >= 900) {
			return  rz + convert(input-900, "CM") ;
		}else if(input >= 500) {
			return  rz + convert(input-500, "D") ;
		}else if(input >= 400) {
			return  rz + convert(input-400, "CD") ;
		}else if(input >= 100) {
			return  rz + convert(input-100, "C") ;
		}else if(input >= 90) {
			return  rz + convert(input-90, "XC") ;
		}else if(input >= 50) {
			return  rz + convert(input-50, "L") ;
		}else if(input >= 40) {
			return  rz + convert(input-40, "XL") ;
		}else if(input >= 10) {
			return  rz + convert(input-10, "X") ;
		}else if(input >= 9) {
			return  rz + convert(input-9, "IX") ;
		}else if(input >= 5) {
			return  rz + convert(input-5, "V") ;
		}else if(input >= 4) {
			return  rz + convert(input-4, "IV");
		}else if(input >= 1) {
			return  rz + convert(input-1, "I") ;
		}
		return rz;
		
	}

}
