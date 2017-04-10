import javax.swing.JOptionPane;

public class Dialogo{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "É Java \nMano!");

		String nome = JOptionPane.showInputDialog("Qual é o seu nome");

		JOptionPane.showMessageDialog(null, "Olá " + nome + "!");

	}
}