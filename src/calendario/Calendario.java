package calendario;

public class Calendario {

    public static void main(String[] args) {

        System.out.println("Calendario 2018");

        int dias[][] = new int[5][7];
        /*rCalendario(dias);*/
        int formato[][]=new int [4][3];
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        formato[][]
        System.out.print(mes[0]);

    }

    private static void rCalendario(int dias[][]) {
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        System.out.println("\t\t      " + mes[0]);
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
