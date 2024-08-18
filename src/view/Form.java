package view;

import dao.IClienteDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JPanel form;
    private JTextField resposta;
    private JButton enviar;
    private JButton cancelarButton;
    private JFrame frame;
    private IClienteDAO iClienteDAO;

    public Form(JFrame f, IClienteDAO c) {
        this.frame = f;
        this.iClienteDAO = c;
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var value = resposta.getText();

                if(Integer.valueOf(value).equals(1)){
                    JFrame createClienteForm = new JFrame("CadastrarCliente");
                    createClienteForm.setContentPane(new CadastrarCliente(c).getCadastrarForm());
                    createClienteForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    createClienteForm.pack();
                    createClienteForm.setVisible(true);

                }
                if(Integer.valueOf(value).equals(2)){
                    JFrame consultarCliente = new JFrame("ConsultarCliente");
                    consultarCliente.setContentPane(new ConsultarCliente(c).getConsultarClienteForm());
                    consultarCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    consultarCliente.pack();
                    consultarCliente.setVisible(true);
                }
                if(Integer.valueOf(value).equals(3)){
                    JFrame deletarCliente = new JFrame("DeletarCliente");
                    deletarCliente.setContentPane(new DeletarCliente(c).getDeletarClienteForm());
                    deletarCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    deletarCliente.pack();
                    deletarCliente.setVisible(true);
                }
                if(Integer.valueOf(value).equals(4)){
                    JFrame alterarCliente = new JFrame("AlterarCliente");
                    alterarCliente.setContentPane(new AlterarCliente(c).getAlterarClienteForm());
                    alterarCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    alterarCliente.pack();
                    alterarCliente.setVisible(true);
                }
                if(Integer.valueOf(value).equals(5)){
                    frame.dispose();
                }

                resposta.setText("");
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

    }

    public JPanel getForm() {
        return form;
    }

    public void setForm(JPanel form) {
        this.form = form;
    }

    public JTextField getTextField1() {
        return resposta;
    }

    public void setTextField1(JTextField textField1) {
        this.resposta = textField1;
    }

    public JButton getEnviar() {
        return enviar;
    }

    public void setEnviar(JButton enviar) {
        this.enviar = enviar;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }
}
