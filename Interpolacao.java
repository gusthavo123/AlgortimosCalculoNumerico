package Calculo;

public class Interpolacao {
	 public static void main(String[] args) {
	        int tamanho = 3;  
	        float[] vetfx = {(float) 1.0, (float) 2.0, (float) 3.0};  
	        float[] vetx = {(float) 0.0, (float) 1.0, (float) 2.0};   
	        float x = (float) 1.5;  
	        float pdtparcial, pdtfinal, fx;

	        fx = 0;
	        pdtfinal = 1;

	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                if (j == i) {
	                    continue;
	                }
	                pdtparcial = (x - vetx[j]) / (vetx[i] - vetx[j]);

	                if (j != tamanho) {
	                    pdtfinal *= pdtparcial;
	                }
	            }

	            fx = fx + vetfx[i] * pdtfinal;
	            pdtfinal = 1;
	        }

	        System.out.printf("O valor de f<%.4f> é: %.4f%n", x, fx);
	    }
}
