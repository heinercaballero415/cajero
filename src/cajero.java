import javax.swing.*;

public class cajero {
    public static void main(String[] args) {

        final int saldo_inicial = 2000;
        int opcion;
        float ingreso, retiro, saldo_actual;


        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "bienvenido al cajero \n" +
                "1. ingresar dinero a la cuenta \n" +
                "2. retiror de dinero de la cuenta \n" +
                "3. salir"));

        switch (opcion) {
            case 1:
                ingreso = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese cuanta plata va a guardar"));
                saldo_actual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "saldo actual es:" + saldo_actual);
                break;
            case 2:
                retiro = Integer.parseInt(JOptionPane.showInputDialog("porfavor ingrese cuanto va a retirar"));
                if (retiro > saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "saldo insuficiente pobreton ");
                } else {
                    saldo_actual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "saldo actual:" + saldo_actual);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, " a salido del sistema");

        }
    }
}

