import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

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
        652 };
        

        int[] arrDois = {42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
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

        int[] arrPlacas = { 1008, 1012, 1014, 1021, 1026, 1028, 1035, 1040,
                1046, 1051, 1052, 1054, 1062, 1069, 1072, 1076, 1078,
                1081, 1082, 1084, 1089, 1095, 1102, 1105, 1113, 1122,
                1132, 1135, 1139, 1146, 1151, 1154, 1170, 1171, 1174,
                1178, 1180, 1191, 1202, 1203, 1208, 1210, 1223, 1225,
                1233, 1234, 1236, 1237, 1243, 1255, 1263, 1279, 1286,
                1287, 1288, 1296, 1304, 1307, 1309, 1313, 1315, 1319,
                1324, 1326, 1332, 1340, 1355, 1356, 1358, 1365, 1367,
                1370, 1371, 1374, 1377, 1383, 1386, 1392, 1396, 1397,
                1398, 1413, 1423, 1433, 1434, 1437, 1440, 1442, 1448,
                1463, 1464, 1466, 1472, 1475, 1477, 1483, 1484, 1487,
                1489, 1492, 1493, 1494, 1503, 1504, 1506, 1509, 1515,
                1516, 1518, 1521, 1528, 1536, 1542, 1544, 1546, 1555,
                1562, 1563, 1567, 1576, 1579, 1589, 1597, 1607, 1610,
                1612, 1613, 1620, 1622, 1623, 1629, 1633, 1636, 1639,
                1640, 1644, 1646, 1655, 1674, 1682, 1684, 1686, 1687,
                1694, 1701, 1705, 1706, 1716, 1718, 1729, 1736, 1737,
                1738, 1744, 1769, 1770, 1774, 1794, 1803, 1804, 1813,
                1829, 1831, 1832, 1839, 1840, 1841, 1844, 1848, 1850,
                1851, 1853, 1860, 1866, 1884, 1886, 1894, 1895, 1897,
                1898, 1901, 1908, 1912, 1928, 1929, 1932, 1938, 1954,
                1957, 1958, 1960, 1962, 1968, 1976, 1977, 1978, 1993,
                1996, 1997, 2000
        };

        int[] arrCodigo = {
          151776, 152300, 155442, 157142, 163507, 163640, 164704, 167856, 171261, 172759,
          172819, 176611, 176841, 181220, 182010, 182263, 182640, 183485, 183709, 183729,
          187385, 189081, 189987, 190516, 191425, 192104, 193248, 194061, 194885, 199351,
          199680, 199976, 203580, 204433, 207468, 208595, 209786, 210287, 212107, 212910,
          213527, 214902, 216434, 216795, 217235, 217732, 218264, 220040, 221466, 222316,
          222475, 222972, 223177, 223712, 224424, 225034, 225790, 225843, 225909, 229364,
          229952, 230341, 233353, 235556, 236432, 236680, 237040, 238624, 240216, 241670,
          241704, 242082, 243342, 246346, 246932, 249479, 249721, 249763, 250839, 251309,
          252089, 252896, 256853, 257858, 260728, 261132, 261381, 262088, 263112, 263250,
          264749, 265108, 266046, 268925, 269199, 269363, 270337, 272252, 272987, 278058,
          278081, 280420, 280611, 280849, 281551, 281634, 283741, 285964, 286510, 288440,
          291552, 292361, 292362, 294414, 295067, 298421, 299193, 299940, 300316, 303564,
          304565, 305355, 307158, 309834, 310921, 314242, 315346, 318755, 318860, 319134,
          321458, 323739, 323943, 323962, 326931, 327686, 327811, 333172, 334102, 335144,
          335463, 336382, 337430, 338039, 338675, 344144, 344372, 346603, 347953, 347999
      };
      
        int[] chavesUm = {415, 545, 390, 609, 296};
        int[] chavesDois = {824, 599, 700, 858, 269, 351, 42, 317, 525, 550, 43, 421, 422};
        int [] chavesPlacas = {1860, 1440, 1521, 1040, 1225, 1370, 1579, 1901, 1515, 1770, 1620, 1095, 1263, 1105};
        int[] chavesCodigo =  {285964, 199976, 323739};

        System.out.println("EXERCÍCIO 1 ---------------");
        imprimirIndices(arr, chavesUm);
        System.out.println("EXERCÍCIO 2 ---------------");
        imprimirIndices(arrDois, chavesDois);
        System.out.println("EXERCÍCIO 3 ---------------");
        imprimirPlacas(arrPlacas, chavesPlacas);
        System.out.println("EXERCÍCIO 4 ---------------");
        imprimirGuardaVolume(arrCodigo, chavesCodigo);

    }

    public static void imprimirIndices(int[] arr, int[] chaves) {
        for (int chave : chaves) {
            int indice = Arrays.binarySearch(arr, chave);
            if (indice < 0) {
                System.out.println("Não há " + chave + " no array");
            } else {
                System.out.println("Índice da " + chave + ": " + indice);
            }
        }
      System.out.println();
    }

    public static void imprimirPlacas(int[] arrPlacas, int[] chavesPlacas) {
      BuscaBinaria buscar = new BuscaBinaria();
      LocalDate dataAtual = LocalDate.now();
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String dataFormatada = dataAtual.format(formato);
      System.out.println("Registro: " + dataFormatada);
      System.out.println();


      for (int chave : chavesPlacas) {
        int indice = buscar.BuscaBinariaIterativa(arrPlacas, chave);
        if (indice < 0) {
          System.out.println("O carro " + chave + " não foi registrado");
        } else {
          System.out.println("Carro/Placa: " + chave + ", foi o " + (indice + 1) + "º carro que trafegou a via");
        }
      }
      System.out.println();
    }

    public static void imprimirGuardaVolume(int[] arrCodigo, int[] chavesCodigo) {
      BuscaBinaria buscar = new BuscaBinaria();
      for (int chave : chavesCodigo) {
        int indice = buscar.BuscaBinariaIterativa(arrCodigo, chave);
        if (indice < 0) {
          System.out.println("A galáxia " + chave + " não foi registrada");
        } else {
          System.out.println("A posição do guarda volume " + chave + " é a " + (indice + 1) + "º " );
        }
      }
      System.out.println();
      
    }
}
