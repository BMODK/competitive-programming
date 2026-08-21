import java.util.Scanner;

public class Criptografia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase para criptografar:");
        String leitura = sc.nextLine();
        char[] frase = leitura.toCharArray();
        // Primeira passada da criptografia: deslocar cada caractere 3 posições para frente na tabela ASCII
        for(int i = 0; i < frase.length; i++){
            if(frase[i] >= 'a' && frase[i] <= 'z' || frase[i] >= 'A' && frase[i] <= 'Z'){
                frase[i] = (char)(frase[i] + 3);
            }
            System.out.print(frase[i]);
        }
        System.out.println();
        // Segunda passada da criptografia: inverter a ordem dos caracteres, utilizando uma string auxiliar
        char[] fraseAux = new char[frase.length];
        int j = frase.length - 1;
        for(int i = 0; i < frase.length; i++){
            fraseAux[i] = frase[j];
            j--;
            System.out.print(fraseAux[i]);
        }
        System.out.println();
        // Terceira passada da criptografia: deslocar cada caractere 1 posição para trás na tabela ASCII
        for(int i = frase.length / 2; i < frase.length; i++){
            fraseAux[i] = (char)(fraseAux[i] - 1);
        }    
        for(int i = 0; i < fraseAux.length; i++){
            System.out.print(fraseAux[i]);
        }
    }
}

