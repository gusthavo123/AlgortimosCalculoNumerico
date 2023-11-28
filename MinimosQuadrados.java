package Calculo;

public class MinimosQuadrados {
	    public static void main(String[] args) {
	        // Dados de entrada - coordenadas x e y dos pontos
	        double[] x = {-1, 2, 3};
	        double[] y = {1, 3, 5};

	        // Número de pontos
	        int N = x.length;

	        // Coeficientes iniciais para m e b
	        double m = 0;
	        double b = 0;

	        // Número máximo de iterações
	        int maxIteracoes = 1000;

	        // Tamanho do passo (learning rate)
	        double alpha = 0.01;

	        // Iterações
	        for (int iteracao = 0; iteracao < maxIteracoes; iteracao++) {
	            // Cálculo das derivadas parciais em relação a m e b
	            double dm = derivadaM(x, y, m, b);
	            double db = derivadaB(x, y, m, b);

	            // Atualização dos coeficientes usando o gradiente descendente
	            m = m - alpha * dm;
	            b = b - alpha * db;
	        }

	        // Imprimir os coeficientes finais
	        System.out.println("Coeficiente m: " + m);
	        System.out.println("Coeficiente b: " + b);

	        // Calcular f(1) usando os coeficientes finais
	        double resultado = calcularAproximacao(1, m, b);
	        System.out.println("Aproximação de f(1): " + resultado);
	    }

	    // Função para calcular a derivada parcial em relação a m
	    private static double derivadaM(double[] x, double[] y, double m, double b) {
	        double soma = 0;
	        for (int i = 0; i < x.length; i++) {
	            soma += -2 * x[i] * (y[i] - (m * x[i] + b));
	        }
	        return soma;
	    }

	    // Função para calcular a derivada parcial em relação a b
	    private static double derivadaB(double[] x, double[] y, double m, double b) {
	        double soma = 0;
	        for (int i = 0; i < x.length; i++) {
	            soma += -2 * (y[i] - (m * x[i] + b));
	        }
	        return soma;
	    }

	    // Função para calcular a aproximação de f(x) dados os coeficientes
	    private static double calcularAproximacao(double x, double m, double b) {
	        return m * x + b;
	    }
	}


