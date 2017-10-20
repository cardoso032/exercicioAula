package exercicioaula11;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Cardoso
 */
public class ExercicioAula11 {

    public static void main(String[] args) {
        tabuada();
        fatorial();
<<<<<<< HEAD
        deltaCalculo();
=======
        pitagoras();
>>>>>>> pitagoras
    }
    public static void tabuada(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informo um número inteiro"));
        for(int i = 1; i <=10; i++){
            int resultado = i * valor;
            JOptionPane.showConfirmDialog(null, i + "x" + valor + " = " + resultado);
        }
    }
    public static void fatorial(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informo um número inteiro"));
        int fat = 1;
        for( int i = 2; i <= valor; i++ ) 
             fat *= i;
        JOptionPane.showConfirmDialog(null, "O fatorial de " + valor + " é igual a " + fat);
    }
    public static void deltaCalculo() {
        int a, b, c;
        double delta , x1, x2;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informo um número A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informo um número B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Informo um número C"));

        delta = (b * b) + (-4 * (a * c));

        JOptionPane.showConfirmDialog(null, "Delta: " + delta);

        if (delta >= 0) {
            x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
            JOptionPane.showConfirmDialog(null, "x1 = " + x1);
            JOptionPane.showConfirmDialog(null, "x2 = " + x2);
        } else {
                JOptionPane.showConfirmDialog(null, "Delta não possui raiz!");
        }
    }
    
    public static void pitagoras(){
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informo um número inteiro A"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informo um número inteiro B"));
        int valor = (valor1*valor1) + (valor2*valor2);
        JOptionPane.showConfirmDialog(null, "O valor C é " + valor);
    }
    
}
