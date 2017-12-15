package calendario;

public class Calendario {

    public static void main(String[] args) {

        System.out.println("Calendario 2018");

        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int dias[][] = new int[6][7];
        int lim[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m = 0;
        for (int c = 0; c < 12; c++) {
            System.out.println();
            System.out.println(mes[c]);
            System.out.println("L\tM\tX\tJ\tV\tS\tD");
            int g = 1;
            for (int x = 0; x < 6; x++) {
                for (int y = 0; y < 7; y++) {
                    if (g <= lim[m]) {
                        System.out.print(dias[x][y] + g + "\t");
                        g++;
                    }
                }
                System.out.println();
            }
            m++;
        }
    }
}
