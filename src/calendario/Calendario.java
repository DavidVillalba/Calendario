package calendario;

public class Calendario {

    public static void main(String[] args) {
        int año = 2019;
        System.out.println(firstDayOfYear(año-1));
        System.out.println("\t\t Calendario " + año);
        int dias[][] = new int[6][7];
        int limite[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int tabDia = 0;
        int primerDia = 0;
        int posLimite = 0;
        for (int posMes = 0; posMes < 12; posMes++) {
            fMeses(posMes);
            fDiasSemanas();
            int dia = 1;
            for (int rows = 0; rows < dias.length - 1 || dia <= limite[posLimite]; rows++) {
                int cols;
                for (cols = 0; cols < dias[0].length && dia <= limite[posLimite]; cols++) {
                    /*if (firstDayOfYear(año-1)!=0 && dia==1){
                        System.out.print("\t");
                    }*/
                    cols = fPrimerDia(primerDia, dia, tabDia, cols);
                    primerDia = 0;
                    dia = fDias(dias, rows, cols, dia);
                }
                System.out.println();
                if (cols < 7) {
                    primerDia = cols;
                    tabDia = cols;
                }
            }
            posLimite++;
        }
    }

    private static int fPrimerDia(int primerDia, int dia, int tabDia, int cols) {
        if (primerDia != 0 && dia == 1) {
            primerDia = tabDia - 1;
            for (tabDia = 0; tabDia <= primerDia; tabDia++) {
                System.out.print("\t");
            }
            cols = tabDia;
        }
        return cols;
    }

    private static void fMeses(int posMes) {
        String meses[] = {
            "\t\t      Enero", "\t\t     Febrero",
            "\t\t      Marzo", "\t\t      Abril", "\t\t      Mayo",
            "\t\t      Junio", "\t\t      Julio", "\t\t      Agosto",
            "\t\t    Septiembre", "\t\t     Octubre", "\t\t    Noviembre",
            "\t\t    Diciembre"};
        System.out.println();
        System.out.print(meses[posMes]);
        System.out.println();
    }

    private static void fDiasSemanas() {
        char diasSemanas[] = {'L', 'M', 'X', 'J', 'V', 'S', 'D'};
        for (int posSemana = 0; posSemana < diasSemanas.length; posSemana++) {
            System.out.print(diasSemanas[posSemana] + "\t");
        }
        System.out.println();
    }

    private static int fDias(int[][] dias, int rows, int cols, int dia) {
        dias[rows][cols] = dia;
        System.out.print(dias[rows][cols] + "\t");
        dia++;
        return dia;
    }

    /* private boolean bisiesto(int año) {
    return año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
    }*/
    
    private static int firstDayOfYear(int año) {
    return (2 * (13) + (3 * (13 + 1) / 5) + (año - 1) + ((año - 1) / 4)
    - ((año - 1) / 100) + ((año - 1) / 400) + 2) % 7;
    }
}
