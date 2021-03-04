import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    // declarar e criar um vetor
    int v[] = new int[6]; // defini a quantidade de vetores
    //ler dados para o vetor
    lerVetor(v);
    //apresenta os dados do vetor
    imprimir(v);
    //buscar um dados
    Scanner leitor = new Scanner(System.in);
    System.out.print("Quer ver a posição de qual Valor: ");
    int valor = leitor.nextInt();
    int pos = buscaSequencial(v, valor);
    if (pos >= 0) {
      System.out.println("Valor encontrato na posição " + pos);
    }
    else {
      System.out.println("Valor não encontrato.");
    }
  }

  //função de busca sequencial ou linear 
  public static int buscaSequencial(int[] v, int x){
    for (int i = 0; i < v.length; i++) {
      if (v[i] == x) {
        return i;
      }
    }
    return -1; 
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
