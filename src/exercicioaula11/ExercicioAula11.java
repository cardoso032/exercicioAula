package exercicioaula11;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Cardoso
 */
public class ExercicioAula11 {

    public static void main(String[] args) {
        tabuada();
        
    }
    public static void tabuada(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informo um número inteiro"));
        for(int i = 1; i <=10; i++){
            int resultado = i * valor;
            JOptionPane.showConfirmDialog(null, i + "x" + valor + " = " + resultado);
        }
    }
    
}
