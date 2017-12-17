package calendario;

public class Calendario {

    public static void main(String[] args) {
        System.out.println("\t\t Calendario 2018");
        int dias[][] = new int[6][7];
        int limite[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dia = 1;
        int contadorDia = 0;
        int ultimoDia = 0;
        int posLimite = 0;
        for (int posMes = 0; posMes < 12; posMes++) {
            fMes(posMes);
            fDiasSemanas();
            for (int rows = 0; rows < dias.length - 1 || dia <= limite[posLimite]; rows++) {
                int cols;
                for (cols = 0; cols < dias[0].length && dia <= limite[posLimite]; cols++) {
                    if (ultimoDia != 0 && dia == 1) {
                        ultimoDia = contadorDia - 1;
                        for (contadorDia = 0; contadorDia <= ultimoDia; contadorDia++) {
                            System.out.print("\t");
                        }
                        cols = ultimoDia + 1;
                        ultimoDia = 0;
                    }
                    dias[rows][cols] = dia;
                    if (dias[rows][cols] <= limite[posLimite]) {
                        System.out.print(dias[rows][cols] + "\t");
                    }
                    dia++;    
                }
                System.out.println(); 
                if (cols < 7) { 
                    ultimoDia = cols;
                    contadorDia = cols;
                }
            }
            dia = 1;
            posLimite++;
        }
    }
    private static void fMes(int posMes) {
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
}
