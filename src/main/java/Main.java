import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de vezes :"));
        int num[] = new int[1000];
        
        for (int i =0; i<N; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor ("+i+") :"));
        }
        
        for(int i=0; i<N/2; i++){
            int aux = num[i];
            num[i] = num[N-1-i];
            num[N-1-i] = aux;
        }
        
        for(int i= 0; i<N;i++){
            JOptionPane.showMessageDialog(null,"valor(" + i +") : "+ num[i]);
        }
    }
}
