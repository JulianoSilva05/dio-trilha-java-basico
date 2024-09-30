public class Soma {
    
    // Método que soma dois inteiros
    public static int somar(int a, int b) {
        // Realiza a soma dos dois números
        int resultado = a + b;
        // Retorna o resultado da soma
        return resultado;
    }

    // Método principal para testar a soma
    public static void main(String[] args) {
        // Declarações de variáveis para armazenar os números
        int numero1 = 210;
        int numero2 = 20;

        // Chama o método somar e armazena o resultado
        int resultadoSoma = somar(numero1, numero2);

        // Exibe o resultado no console
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultadoSoma);
    }
}

