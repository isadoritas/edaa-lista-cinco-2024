public class BuscaBinaria {

  public int BuscaBinariaIterativa(int[] arr, int chave) {
    int esquerda = 0;
    int direita = arr.length - 1;

    while(esquerda <= direita ) {
      int meio = esquerda + (direita - esquerda) / 2;

      if (arr[meio] ==  chave)
        return meio;

      else if (arr[meio] < chave)
        esquerda = meio + 1;
      else
        direita = meio - 1;
    }
    
    return -1;
  }


}