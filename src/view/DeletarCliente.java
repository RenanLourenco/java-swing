package view;

import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeletarCliente {
    private JPanel deletarClienteForm;
    private JTextField cpfDeletarField;
    private JButton deletarButton;
    private IClienteDAO iClienteDAO;


    public DeletarCliente(IClienteDAO c) {
        iClienteDAO = c;

        deletarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = c.consultar(Long.valueOf(cpfDeletarField.getText()));

                if(cliente != null){
                    c.excluir(cliente.getCpf());
                }
            }
        });
    }

    public JPanel getDeletarClienteForm() {
        return deletarClienteForm;
    }

    public void setDeletarClienteForm(JPanel deletarClienteForm) {
        this.deletarClienteForm = deletarClienteForm;
    }

    public JTextField getCpfDeletarField() {
        return cpfDeletarField;
    }

    public void setCpfDeletarField(JTextField cpfDeletarField) {
        this.cpfDeletarField = cpfDeletarField;
    }

    public JButton getDeletarButton() {
        return deletarButton;
    }

    public void setDeletarButton(JButton deletarButton) {
        this.deletarButton = deletarButton;
    }

    public IClienteDAO getiClienteDAO() {
        return iClienteDAO;
    }

    public void setiClienteDAO(IClienteDAO iClienteDAO) {
        this.iClienteDAO = iClienteDAO;
    }
}
