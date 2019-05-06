
public class Euclid {
	public static void main(String[] args) 
	{
		int a = 8167;
		int b = 7076;
		
		gcdTable(a, b); // function to solve for greatest common deviser in table form
		
		gcd(a, b); // function to solve for greatest common deviser in function form
		
		gcdExtended(a, b); // extended function to solve for the x, y coefficients of a and b
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
    
    public static void gcdExtended(long a, long b) {
        long x = 0, y = 1, lastx = 1, lasty = 0, temp;

        while (b != 0)
        {
            long q = a / b;
            long r = a % b;
 
            a = b;
            b = r;
 
            temp = x;
            x = lastx - q * x;
            lastx = temp;
 
            temp = y;
            y = lasty - q * y;
            lasty = temp;
            
            System.out.println("x: " + lastx + " y: " + lasty);
        }

        System.out.println("Coefficients are  x: "+ lastx +" y: "+ lasty);

    }
}
