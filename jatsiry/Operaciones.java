package jatsiry;
import javax.swing.JOptionPane;
public class Operaciones {
 public static void main(String[] args) {
        double ope1,ope2,tot;
        String ops1,ops2;
        JOptionPane.showMessageDialog(null,"suma");
        ops1=JOptionPane.showInputDialog("Ingresa el primer valor");
        ope1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("Ingresa el segundo valor");
        ope2=Double.parseDouble(ops2);
        tot=ope1+ope2;
        JOptionPane.showMessageDialog(null,"la suma es:"+tot);
         
        JOptionPane.showMessageDialog(null,"resta");
        ops1=JOptionPane.showInputDialog("Ingresa el primer valor");
        ope1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("Ingresa el segundo valor");
        ope2=Double.parseDouble(ops2);
        tot=ope1-ope2;
        JOptionPane.showMessageDialog(null,"la resta es:"+tot);
         
        JOptionPane.showMessageDialog(null,"mulyiplicacion");
        ops1=JOptionPane.showInputDialog("Ingresa el primer valor");
        ope1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("Ingresa el segundo valor");
        ope2=Double.parseDouble(ops2);
        tot=ope1*ope2;
        JOptionPane.showMessageDialog(null,"la multiplicacion es:"+tot);
        
        
    }
    
}
