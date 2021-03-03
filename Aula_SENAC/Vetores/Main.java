import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    // declarar e criar um vetor
    int v[] = new int[6]; // defini a quantidade de vetores
    //ler dados para o vetor
    lerVetor(v);
    //apresenta os dados do vetor
    imprimir(v);
  }

  //criei uma função para leitura dos dados
  public static void lerVetor(int[] vet) {
    Scanner leitor = new Scanner(System.in);
    for (int i = 0; i < vet.length; i++) {
      System.out.print("V[" + i + "]: ");
      vet[i] = leitor.nextInt();
    }
  }

  // função para imprimir dados
  public static void imprimir (int[] v) {
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + " ");
    }
    System.out.println();
  }
}
