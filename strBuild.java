public class strBuild{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("Prakash");
		
		//Returns positon of index value
		sb.charAt(2);
		System.out.println(sb);
		
		//Over write the given index positon
		sb.setCharAt(1,'J');
		System.out.println(sb);
		
		//Insert the char in given index positon
		sb.insert(3,'G');
		System.out.println(sb);
	
		//Delete the char in given index positon
		//Ending positon is work on 'n-1'
		sb.delete(1,4);
		System.out.println(sb);
		
		//Append is used to combine in last
		sb.append(" ");
		sb.append("G");
		sb.append("o");
		sb.append("h");
		sb.append("i");
		sb.append("l");
		System.out.println(sb);
		
		//used to known length
		System.out.println("length : " + sb.length());
		
		//Reverse string
		for(int i=0; i<sb.length()/2; i++)
		{
			int front = i;
			int back = sb.length() -1 -i;
			
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, backChar);
		}
		System.out.println("Revers String : " + sb);
	}
}