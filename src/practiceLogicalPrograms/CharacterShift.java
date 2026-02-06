package practiceLogicalPrograms;


public class CharacterShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcs3abc";
		StringBuffer ans = new StringBuffer();
		for(char ch:str.toCharArray()) {
			if(ch>='a'&& ch<='z') {
				if(ch=='z'){
					ans.append('a');
				}
				else {
					ans.append((char)(ch+1));
				}
			}
			// for special character
			else {
				ans.append(ch);
			}
		}
		System.out.println(ans.toString());

	}

}
