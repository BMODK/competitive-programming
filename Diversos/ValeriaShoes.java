import java.util.Scanner;

public class ValeriaShoes{
    public static void ordenar(int[] vet){
        for(int i = 0; i < vet.length; i++){
            int min = i;
            for(int j = i+1; j < vet.length; j++){
                if(vet[min] > vet[j]){
                    min = j;
                }
            }
            int aux = vet[i];
            vet[i] = vet[min];
            vet[min] = aux;
        }
    }
    public static void main(String[] args){
        int[] vet = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            vet[i] = sc.nextInt();
        }
        int cont = 0;
        ordenar(vet);
        for(int i = 0; i < 3; i++){
                if(vet[i] == vet[i+1]){
                    cont++;
                }
        }
        System.out.print(cont);
    }
}