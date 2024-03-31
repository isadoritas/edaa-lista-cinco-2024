public class Main {

  public static void main(String[] args) {
    int[] arr = { 242, 243, 255, 268, 270, 275, 285, 289, 293, 296,
      306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
      355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
      391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
      429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
      483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
      511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
      554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
      613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
      652, 654, 655, 662,
    };

    int[] arrDois = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
      178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
      243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
      317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
      396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
      443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
      525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
      626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
      723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
      824, 826, 832, 848, 854, 856, 858, 867, 873, 880
      };

    int chaveUm = 415;
    int chaveDois = 545;
    int chaveTres = 390;
    int chaveQuatro = 609;
    int chaveCinco = 296;
    int chaveSeis = 824;
    int chaveSete = 599;
    int chaveOito = 700;
    int chaveNove = 858;
    int chaveDez = 269;
    int chaveOnze = 351;
    int chaveDoze = 42;
    int chaveTreze = 317;
    int chaveQuatorze = 525;
    int chaveQuinze = 550;
    int chaveDezesseis = 43;
    int chaveDezessete = 421;
    int chaveDezoito = 422;

    System.out.println("EXERCÍCIO 1 ---------------");
    imprimirIndicesUm(arr, chaveUm, chaveDois, chaveTres, chaveQuatro, chaveCinco);
    System.out.println("EXERCÍCIO 2 ---------------");
    imprimirIndicesDois(arrDois, chaveSeis, chaveSete, chaveOito, chaveNove, chaveDez, chaveOnze, chaveDoze, chaveTreze, chaveQuatorze, chaveQuinze, chaveDezesseis, chaveDezessete, chaveDezoito);

  }

  public static void imprimirIndicesUm(int[] arr, int chaveUm, int chaveDois, int chaveTres, int chaveQuatro, int chaveCinco) {
    BuscaBinaria buscar = new BuscaBinaria();
    
    int[] chaves = {chaveUm, chaveDois, chaveTres, chaveQuatro, chaveCinco};

    for (int i = 0; i < chaves.length; i++) {
      int indice = buscar.BuscaBinariaIterativa(arr, chaves[i]);
        if (indice == -1) {
          System.out.println("Não há " + chaves[i] + " no array");
        } else {
          System.out.println("Índice da " + chaves[i] + ": " + indice);
        }
    }
  }

  // , chaveSeis,  chaveSete,  chaveOito,  chaveNove,  chaveDez,  chaveOnze,  chaveDoze, chaveTreze,  chaveQuatorze,  chaveQuinze,  chaveDezesseis,  chaveDezessete, chaveDezoito

  public static void imprimirIndicesDois(int[] arrDois, int chaveSeis,  int chaveSete,  int chaveOito,  int chaveNove,  int chaveDez,  int chaveOnze,  int chaveDoze, int chaveTreze,  int chaveQuatorze,  int chaveQuinze,  int chaveDezesseis,  int chaveDezessete, int chaveDezoito) {
    BuscaBinaria buscar = new BuscaBinaria();
    
    int[] chaves = {chaveSeis,  chaveSete,  chaveOito,  chaveNove,  chaveDez,  chaveOnze,  chaveDoze, chaveTreze,  chaveQuatorze,  chaveQuinze,  chaveDezesseis,  chaveDezessete, chaveDezoito};

    for (int i = 0; i < chaves.length; i++) {
      int indice = buscar.BuscaBinariaIterativa(arrDois, chaves[i]);
        if (indice == -1) {
          System.out.println("Não há " + chaves[i] + " no array");
        } else {
          System.out.println("Índice da " + chaves[i] + ": " + indice);
        }
    }
  }
}