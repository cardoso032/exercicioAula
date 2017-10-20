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
        pitagoras();
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
    
    public static void pitagoras(){
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informo um número inteiro A"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informo um número inteiro B"));
        int valor = (valor1*valor1) + (valor2*valor2);
        JOptionPane.showConfirmDialog(null, "O valor C é " + valor);
    }
    
}
