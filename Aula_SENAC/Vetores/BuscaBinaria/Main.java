import java.util.Arrays;
import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    int v[] = {7, 3, 4, 5, 6, 2};
    // antes de imprimir a busca binária temos que garantir que os valores fiquem de forma ordernada neste caso usei o Arrays.sort
    Arrays.sort(v);
    imprimir(v);
    Scanner leitor = new Scanner(System.in);
    System.out.print("Quer ver a posição de qual Valor: ");
    int valor = leitor.nextInt();
    int pos = buscaBinaria(v, valor);
    if (pos >= 0) {
      System.out.println("Valor encontrato na posição " + pos);
    }
    else {
      System.out.println("Valor não encontrato.");
    }
  }

  //função Busca Binária
  public static int buscaBinaria(int[] v, int x) {
    int i = 0;
    int f = v.length -1;
    int m;
    while (i <= f) {
      m = (i + f) / 2;
      if (v[m] == x) {
        return m;
      }
      if (x < v[m]) {
        f = m - 1;
      }
      else{
        i = m + 1;
      }
    }
    return -1;
  }

  // função para imprimir dados
  public static void imprimir (int[] v) {
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + " ");
    }
    System.out.println();
  }

}
