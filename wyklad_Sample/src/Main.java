import java.util.Scanner;



public class Main {
    public static void main(String[] args)
    {
        isPrime_parzyste();

        //int[] liczby = liczby();
        //ciag_min_max(liczby);

        //suma_liczb();

        na_odwrut(12345);

        suma_kwadratow(87);

        liczba_pierwsza_mniejsza_od_n(83);




    }


    public static boolean isPrime(int n)
    {
        if(n <= 2)
        {
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void isPrime_parzyste()
    {
        int n = 0;
        int i = 2;
        do {
            if (isPrime(i) && i % 2 != 0) {
                System.out.println(i);

                n++;
            }
            i++;

        } while (n <= 20);

    }

    public static void ciag_min_max(int[] tab)
    {
        int min = tab[0];
        int max = tab[0];
        for(int i = 0; i < tab.length-1; i++)
        {
            if(tab[i] < min)
            {
                min = tab[i];
            }

            if(tab[i] > max)
            {
                max = tab[i];
            }
        }

        System.out.println("minimalna liczba: "+min);
        System.out.println("maksymalna liczba: "+max);
    }

    public static int[] liczby()
    {
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[10];

        for(int i = 0; i < liczby.length; i++)
        {
            System.out.print("Liczba " + i + ": ");
            liczby[i] = scanner.nextInt();
        }
        return liczby;
    }

    public static void suma_liczb()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbe: ");
        int n = scanner.nextInt();
        int suma = 0;

        while (n > 0)
        {
            suma += n % 10;
            n /= 10;
        }
        System.out.println(suma);
    }

    public static void na_odwrut(int n)
    {
        int odwrut = 0;
        while (n > 0)
        {
            int ostatnia_licba = n % 10;
            odwrut = odwrut * 10 + ostatnia_licba;
            n /= 10;


        }

        System.out.println(odwrut);
    }

    public  static void suma_kwadratow(int n)
    {
        int suma = 0;
        for(int i = 0; i < n; i++)
        {
            suma += i*i;
        }
        System.out.println(suma);
    }

    public static void liczba_pierwsza_mniejsza_od_n(int n)
    {
        int wynik = 0;
        for(int i = 0; i < n; i++)
        {
            if(isPrime(i) && i > wynik)
            {
                wynik = i;
            }
        }
        System.out.println(wynik);
    }




}