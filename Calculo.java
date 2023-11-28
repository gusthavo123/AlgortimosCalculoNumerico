package Calculo;

public class Calculo {
	
	static double x0 = -1;
	static double prec = 0.01;
	
	public static double function (double x) {
		return Math.pow(x, 3) + 2;
	}
	
	
	public static double derivade (double x) {
		return Math.pow(x, 2) * 3;
	}
	
	
	
    public static void main(String[] args) {
		//System.out.println ("Resultado: " + function (1.5));
		//System.out.println ("Resultado: " +  derivade (1.5));
    	double err = 0;
    	double initial = x0;
    	double next = 0;
    	int i = 0;
         do {
        	 System.out.println("Iteração: " + i);
        	 double y =  function (initial);
        	 double y1 =  derivade (initial);
        	 next = initial - (y/y1);
        	 err = Math.abs(next - (initial/next));
        	 System.out.println("X" + i + ": " + initial);
        	 System.out.println("X" + (i + 1) + ": " + next);
        	 System.out.println("Err" + err);
        	 initial = next;
             i++;
         } while (err > prec); 
        	 
         }
		
	}

