package ClassString;

public class BufferAndBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      STRING BUFFER METHODS 
//      StringBuffer sb = new StringBuffer("welcome");
		
      StringBuilder sb = new StringBuilder("welcome");
      
      sb.append(" To Java");
      System.out.println(sb);
		
      System.out.println(sb.capacity()); //23
      
      System.out.println(sb.insert(1,'j')); // wjelcome To Java 
      System.out.println(sb.insert(1,"opu")); //  wopujelcome To Java 
      
      System.out.println(sb.delete(1, 4)); // wjelcome To Java 
      System.out.println(sb.deleteCharAt(1)); // welcome To Java
      
      System.out.println(sb.reverse()); // avaJ oT emoclew
	}

}
