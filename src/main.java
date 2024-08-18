import dao.ClienteMapDAO;
import view.Form;

import javax.swing.*;

void main(){
    ClienteMapDAO clienteMapDAO = new ClienteMapDAO();


    JFrame frame = new JFrame("Form");
    frame.setContentPane(new Form(frame,clienteMapDAO).getForm());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

}