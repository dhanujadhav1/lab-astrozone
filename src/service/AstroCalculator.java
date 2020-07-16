package service;
import java.lang.Integer;
import model.User;

public class AstroCalculator{
	
	public String findSign(User user) {
		
		String dob=user.getDob();
		String[] arr1=new String[4];
				arr1=dob.split("-");
		
		int date=Integer.parseInt(arr1[0]);
		int month=Integer.parseInt( arr1[1]);
		if(month==3 && date>=21 )
			return "Aries";
			else if( month==4 && date<=19)
				return "Aries";
			else if( month==4 && date>=20)
				return "Taurus";
			else if( month==5 && date<=20)
				return "Taurus";
			else if( month==5 && date>=21)
				return "Gemini";
			else if( month==6 && date<=20)
				return "Gemini";
			else if( month==6 && date>=21)
				return "Cancer";
			else if( month==7 && date<=22)
				return "Cancer";
		
			else if( month==7 && date>=23)
				return "Leo";
			else if( month==8 && date<=22)
				return "Leo";
		
			else if( month==8 && date>=23)
				return "Virgo";
			else if( month==9 && date<=22)
				return "Virgo";
		
			else if( month==9 && date>=23)
				return "Libra";
			else if( month==10 && date<=22)
				return "Libra";
		
			else if( month==10 && date>=23)
				return "Scorpio";
			else if( month==11 && date<=21)
				return "Scorpio";
		
			else if( month==11 && date>=22)
				return "Sagittarius";
			else if( month==12 && date<=21)
				return "Sagittarius";
	
			else if( month==12 && date>=22)
				return "Capricorn";
			else if( month==1 && date<=19)
				return "Capricorn";
		
			else if( month==1 && date>=20)
				return "Aquarius";
			else if( month==2 && date<=18)
				return "Aquarius";
		
			else if( month==2 && date>=19)
				return "Pisces";
			else if( month==3 && date<=20)
				return "Pisces";
		return "";
	
	}
	
	
}