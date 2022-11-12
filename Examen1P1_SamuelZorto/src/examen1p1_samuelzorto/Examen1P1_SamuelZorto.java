package examen1p1_samuelzorto;

import java.util.Scanner;

public class Examen1P1_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menunu();
    }

    public static void menunu() {
        Scanner entrada = new Scanner(System.in);
        boolean menunu = true;
        do {
            System.out.println("Por favor elija un ejercicio");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("[1] Conjuntos");
            System.out.println("[2] Cifrado por substitución");
            System.out.println("[3] Sobre");
            System.out.println("[4] Salir");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int menuu = entrada.nextInt();
            switch (menuu) {
                case 1:
                    Conjuntos();
                    break;
                case 2:
                    System.out.print("Ingrese una cadena: ");
                    String caden = entrada.next();
                    CPSS(caden);
                    System.out.println(CPSS(caden));
                    break;
                case 3:
                    SOBREEE();
                    break;
                default:
                    menunu = false;
                    break;
            }

        } while (menunu == true);
    }

    public static void Conjuntos() {
        Scanner entrad = new Scanner(System.in);

        System.out.println("----Debe ingresar adentro de un { } y una coma y espacio despues de cada letra----");
        System.out.print("Ingrese el primer conjunto: A = ");
        String conjA_sz = entrad.nextLine();
        System.out.print("Ingrese el primer conjunto: B = ");
        String conjB_sz = entrad.nextLine();
        boolean verif_sz = true;
        int cont1_sz = 0;
        int cont2_sz = 0;
        String union_sz = "";
        String inter_sz = "";
        for (int i = 1; i <= conjA_sz.length() - 1; i++) {
            int numum_sz = (int) conjA_sz.charAt(i);
            if (numum_sz >= 65 && numum_sz <= 122 || numum_sz >= 97 && numum_sz <= 122) {
                if (i != conjA_sz.length() - 2) {
                    union_sz += conjA_sz.charAt(i) + ", ";
                } else {
                    union_sz += conjA_sz.charAt(i);
                }
                cont1_sz += 1;
                for (int j = 1; j <= conjB_sz.length() - 1; j++) {
                    int numumu_sz = (int) conjB_sz.charAt(j);

                    if (numumu_sz >= 65 && numumu_sz <= 122 || numumu_sz >= 97 && numumu_sz <= 122) {
                        if (i == 1) {
                            union_sz += conjB_sz.charAt(j) + ", ";
                        }
                        if (conjA_sz.charAt(i) == conjB_sz.charAt(j)) {
                            cont2_sz += 1;
                            if (i != conjB_sz.length() - 2) {
                                inter_sz += conjA_sz.charAt(i) + ", ";
                            } else {
                                inter_sz += conjA_sz.charAt(i);
                            }
                        }
                    }
                }

            }

        }
        if (inter_sz.equals("")) {
            inter_sz += "0";
        }
        if (cont1_sz == cont2_sz) {
            System.out.println("Ambos conjuntos son iguales");
        } else {
            System.out.println("Ambos conjuntos no son iguales");
            System.out.println("Unión: C = {" + union_sz + "}");
            System.out.println("Intersección: D = {" + inter_sz + "}");
        }
    }

    public static String CPSS(String caden) {
        String encrypt_sz = "";
        caden = caden.toLowerCase();
        for (int i = 0; i <= caden.length() - 1; i++) {
            int niyo_sz = (int) caden.charAt(i);
            niyo_sz = 25 - (niyo_sz - 97) + 97;
            char encrypt_szz = (char) niyo_sz;
            encrypt_sz += encrypt_szz;
        }
        return encrypt_sz;
    }

    public static void SOBREEE() {
        Scanner entra = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n_sz = entra.nextInt();
        System.out.print("Ingrese el contorno: ");
        String conto_sz = entra.next();
        if (n_sz % 2 == 0) {
            for (int i = 0; i <= (n_sz * 2); i++) {
                System.out.println();
                for (int j = 0; j <= (n_sz * 2); j++) {

                    if (i == 0 || i == (n_sz * 2)) {
                        System.out.print(conto_sz + "");
                        if (j % 2 == 0) {

                        } else {
                            
                        }
                    } else {
                        if (j == 0 || j == (n_sz * 2)) {
                            System.out.print(conto_sz + "");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    if(i != 0 && i != (n_sz* 2)){
                        if(j+1 == i || j+1 + i == (n_sz*2)){
                                System.out.print(conto_sz+ "");
                        }
                    }
                }

            }
        }else{
            System.out.println("El numero debe ser par");
        }
        System.out.println();
    }
}
