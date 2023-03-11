import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = sc.nextLine();

        String strInvertida = inverterString(str);

        System.out.println("String invertida: " + strInvertida);
    }

    public static String inverterString(String str) {
        int tamanho = str.length();
        char[] strArray = new char[tamanho];

        // Copia os caracteres da string para um array
        for (int i = 0; i < tamanho; i++) {
            strArray[i] = str.charAt(i);
        }

        // Inverte o array
        for (int i = 0; i < tamanho/2; i++) {
            char temp = strArray[i];
            strArray[i] = strArray[tamanho-1-i];
            strArray[tamanho-1-i] = temp;
        }

        // Cria uma nova string com os caracteres invertidos
        String strInvertida = new String(strArray);
        return strInvertida;
    }
}
