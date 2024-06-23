package in.ashokit.beans;

public class PalindromeCheck {
	public boolean isPalindrome(String str) {
		
			String rev = "";
			
			for (int i = str.length()-1; i >=0 ; i--) 
				rev=rev+str.charAt(i);
			if(str.equals(rev))
				return true;
			else 
				return false;
	}

}
