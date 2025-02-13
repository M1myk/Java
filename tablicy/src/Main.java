import java.util.Random;
import java.util.Arrays;

public class Main {
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        Random random = new Random();
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
        return tablica;
    }

    public static void wypiszTablice(int[] tab, int n, int m) {
        int length = tab.length;
        int totalElements = n * m;

        // Wyswietlanie elementow tablicy jako macierz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int index = i * m + j;
                if (index < length) {
                    System.out.printf("%d ", tab[index]);  // Wypisanie wartosci z tablicy
                } else {
                    System.out.print("-- ");  // Puste miejsce, gdy brak elementow
                }
            }
            System.out.println();  // Nowa linia po kazdym wierszu
        }
    }

    public static void ileNieparzystych(int[] tab)
    {
        int licznik = 0;

        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] % 2 != 0)
            {
                licznik++;
            }
        }
        System.out.println(licznik);
    }

    public static void ileUnikalnych(int[] tab) {
        int licznik = 0;

        for (int i = 0; i < tab.length; i++) {
            boolean czyUnikalny = true;

            // Sprawdzamy, czy element `tab[i]` już pojawił się wcześniej w tablicy
            for (int j = 0; j < tab.length; j++) {
                if (i != j && tab[i] == tab[j]) {
                    czyUnikalny = false;
                    break;
                }
            }

            // Jeśli element jest unikalny, zwiększamy licznik
            if (czyUnikalny) {
                licznik++;
            }
        }

        System.out.println("Liczba unikalnych elementów: " + licznik);
    }

    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c)
    {
        int[] tablica = new int[tab.length];
        for (int i = 0; i < tab.length; i++)
        {
            tablica[i] = tab[i]*tab[i]*a + b * tab[i] + c;
        }

        return tablica;
    }

    public static double[] blabla(int n, double min, double max)
    {
        double krok = (max - min)/(n-1);
        double[] tablica = new double[n];
        for(int i = 0; i < n; i++)
        {
            tablica[i] = min+ i*krok;
        }
        return tablica;
    }


    public static void main(String[] args) {
        int[] lista = generujTablice(16, 10, 15);
        System.out.println("Tablica jednowymiarowa:");
        System.out.println(Arrays.toString(lista));
        System.out.println();

        wypiszTablice(lista, 4, 5);

        ileNieparzystych(lista);

        ileUnikalnych(lista);

        int[] new_tab = funkcjaKwadratowa(lista, 4, 5, 6);
        wypiszTablice(new_tab, 4, 5);
        System.out.println(Arrays.toString(blabla(4, 1, 8)));



    }
}
