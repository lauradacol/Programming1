import javax.swing.JOptionPane;

public class Dialogo{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "OOOOOOI CUEIO!");

		String nome = JOptionPane.showInputDialog("Mim gosta? Xim ou nhão?");
		
		if(nome.equals("Xim")){
			JOptionPane.showMessageDialog(null, "Eeeeeeba!");
			}
			
		else if(nome.equals("nhão")){			
			JOptionPane.showMessageDialog(null, "humf, dexa...");
		}
	}

}
