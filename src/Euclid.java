
public class Euclid {
	public static void main(String[] args) 
	{
		gcdTable(20, 50);
	}
	
	public static int count = 0;
	
    public static double gcd(int a, int b) {
    	
    	System.out.println("if "+b+" = 0");
    	
        if (b == 0) {
        	System.out.println("true");
        	System.out.println("result is "+a);
            System.out.println("in " + count + " steps");
            System.out.println();
            
            count = 0;
            
            return a;
        }                     
        
        System.out.println("false");
        System.out.println("gcd("+b+", "+a+" mod "+b);
        System.out.println("= gcd("+b+", "+a % b);
        
        count++;
        
        return gcd(b, a % b);
    }
    
    public static double gcdTable(int a, int b) {
    	
        if (b == 0) {
        	System.out.println("result is "+a);
            System.out.println("in " + count + " steps");
            System.out.println();
            
            count = 0;
            
            return a;
        }                     
        
        System.out.println(a + " = " + b + " x " + a/b + " + " + a%b);
        
        count++;
        
        return gcdTable(b, a % b);
    }
}
