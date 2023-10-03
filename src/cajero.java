import javax.swing.*;

public class cajero {
    public static void main(String[] args) {
        float ingreso=0,retiro;
        int item = 0 ;
         int  saldo = 2000 ;
float saldoActual = saldo + ingreso;
while (item != 3 ){
            item = Integer.parseInt(JOptionPane.showInputDialog(null, "bienvenido al cajero \n" +
                    "1. ingresar dinero a la cuenta \n" +
                    "2. retiror de dinero de la cuenta \n" +
                    "3. salir"));
            switch (item) {
                case 1:
                    ingreso = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese cuanta plata va a guardar"));
                    saldoActual =  (saldoActual + ingreso);
                    JOptionPane.showMessageDialog(null, "saldo actual es:" + saldoActual);
                    break;
                case 2:
                    retiro = Integer.parseInt(JOptionPane.showInputDialog("porfavor ingrese cuanto va a retirar"));
                    if (retiro > saldoActual ) {
                        JOptionPane.showMessageDialog(null, "saldo insuficiente pobreton ");
                    } else {
                        saldoActual = saldoActual - retiro ;
                        JOptionPane.showMessageDialog(null, "saldo actual:" + saldoActual);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, " a salido del sistema");

            }
        }
    }
}
