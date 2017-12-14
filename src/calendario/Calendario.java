package calendario;

public class Calendario {

    public static void main(String[] args) {

        System.out.println("Calendario 2018");

        int dias[][] = new int[5][7];
        rCalendario(dias);

    }

    private static void rCalendario(int dias[][]) {
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        for (int m = 0; m < 12; m++) {
            System.out.println("\t\t      " + mes[m]);
            System.out.println();
            System.out.println("L\tM\tX\tJ\tV\tS\tD");
            for (int x = 0; x < 5; x++) {
                for (int y = 0; y < 7; y++) {
                    System.out.print(dias[x][y] + "\t");
                }
                System.out.println();
            }
        }

    }
}
