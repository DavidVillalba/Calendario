package calendario;

public class Calendario {

    public static void main(String[] args) {

        String meses[] = {
            "\t\t      Enero", "\t\t     Febrero",
            "\t\t      Marzo", "\t\t      Abril", "\t\t      Mayo",
            "\t\t      Junio", "\t\t      Julio", "\t\t      Agosto",
            "\t\t    Septiembre", "\t\t     Octubre", "\t\t    Noviembre",
            "\t\t    Diciembre"};
        char dSemanas[] = {'L', 'M', 'X', 'J', 'V', 'S', 'D'};
        int dias[][] = new int[6][7];
        int limite[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dia = 1;
        int contDia = 0;
        int ultimoDia = 0;
        int lim = 0;

        for (int m = 0; m < meses.length; m++) {
            System.out.println();
            System.out.print(meses[m]);
            System.out.println();
            for (int s = 0; s < dSemanas.length; s++) {
                System.out.print(dSemanas[s] + "\t");
            }
            System.out.println();
            for (int r = 0; r < dias.length - 1 || dia <= limite[lim]; r++) {
                int c;
                for (c = 0; c < dias[0].length && dia <= limite[lim]; c++) {
                    if (ultimoDia != 0 && dia == 1) {
                        ultimoDia = contDia - 1;
                        for (int j = 0; j <= ultimoDia; j++) {
                            System.out.print("\t");
                        }
                        c = ultimoDia + 1;
                        ultimoDia = 0;
                    }
                    dias[r][c] = dia;
                    if (dias[r][c] <= limite[lim]) {
                        System.out.print(dias[r][c] + "\t");
                    }
                    dia++;
                }
                System.out.println();
                if (c < 7) {
                    ultimoDia = c;
                    contDia = c;
                }
            }
            dia = 1;
            lim++;
        }
    }
}
/*private static void llenar(int dia, int dias[][]) {
        for (int r = 0; r < dias.length; r++) {
            for (int c = 0; c < dias[0].length; c++) {
                dias[r][c] = dia;
                dia++;
            }
        }
    }*/
