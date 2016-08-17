import javax.swing.*;
import java.util.*;

public class BodeSoftware {


    public static void main(String[] args) {
        Pessoa pessoa[] = new Pessoa[2];
        String relatorio = "", men = "DIGITE SEU ID ";
        Calendar data;
        String usuario;
        int i = 0, veri;
        
        
        pessoa[0] = Pessoa.criar();
        pessoa[1] = Pessoa.criar();
        
        do{
            veri = 0;
           usuario = JOptionPane.showInputDialog(men);// uma janela para pedir o ID do usuario para saber quem estar usando
		   
           data = Calendar.getInstance();
		   for(int n = 0; n < pessoa.length && pessoa[n] != null; n++){
			   if(usuario.compareTo(pessoa[n].getId()) == 0){
				   relatorio += "ID "+ usuario+" || NOME "+ pessoa[n].getNome() + "   || DATA HORA " + data.getTime()+" \n";				   
			       i++;
                   veri++;
               }
		   }
           if(veri == 0){
                men = "ERRO 481   DIGITE SEU ID CORRETAMENTE";
           }else{
                men = "DIGITE SEU ID ";
           }

        }while(i < pessoa.length);
        
        System.out.println("\n\n"+ relatorio +" \n\n");
    }
    
}
