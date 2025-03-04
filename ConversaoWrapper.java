import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê um valor numérico do console (tipo primitivo int)
        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt();

        // Converte o valor para o tipo Wrapper (Integer)
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Imprime os valores no console
        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor Wrapper: " + numeroWrapper);

        scanner.close();
    }
}
