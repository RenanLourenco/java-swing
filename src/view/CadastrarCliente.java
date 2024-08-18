package view;

import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarCliente {
    private JTextField nomeField;
    private JTextField cpfField;
    private JTextField telefoneField;
    private JTextField enderecoField;
    private JTextField cidadeField;
    private JTextField estadoField;
    private JTextField textField7;
    private JTextField numeroField;
    private JButton cadastrarButton;
    private JPanel CadastrarForm;
    private JLabel labelNome;
    private JLabel cpfLabel;
    private JLabel telefoneLabel;
    private JLabel enderecoLabel;
    private JLabel cidadeLabel;
    private JLabel estadoLabel;
    private JLabel numeroLabel;
    private IClienteDAO iClienteDAO;

    public CadastrarCliente(IClienteDAO c){
        this.iClienteDAO = c;
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente(
                        nomeField.getText(),
                        cpfField.getText(),
                        telefoneField.getText(),
                        enderecoField.getText(),
                        numeroField.getText(),
                        cidadeField.getText(),
                        estadoField.getText()
                );
                c.cadastrar(cliente);

            }
        });
    }

    public JTextField getTextField1() {
        return nomeField;
    }

    public void setTextField1(JTextField textField1) {
        this.nomeField = textField1;
    }

    public JTextField getTextField2() {
        return cpfField;
    }

    public void setTextField2(JTextField textField2) {
        this.cpfField = textField2;
    }

    public JTextField getTextField3() {
        return telefoneField;
    }

    public void setTextField3(JTextField textField3) {
        this.telefoneField = textField3;
    }

    public JTextField getTextField4() {
        return enderecoField;
    }

    public void setTextField4(JTextField textField4) {
        this.enderecoField = textField4;
    }

    public JTextField getTextField5() {
        return cidadeField;
    }

    public void setTextField5(JTextField textField5) {
        this.cidadeField = textField5;
    }

    public JTextField getTextField6() {
        return estadoField;
    }

    public void setTextField6(JTextField textField6) {
        this.estadoField = textField6;
    }

    public JTextField getTextField7() {
        return textField7;
    }

    public void setTextField7(JTextField textField7) {
        this.textField7 = textField7;
    }

    public JTextField getTextField8() {
        return numeroField;
    }

    public void setTextField8(JTextField textField8) {
        this.numeroField = textField8;
    }

    public JButton getCadastrarButton() {
        return cadastrarButton;
    }

    public void setCadastrarButton(JButton cadastrarButton) {
        this.cadastrarButton = cadastrarButton;
    }

    public JPanel getCadastrarForm() {
        return CadastrarForm;
    }

    public void setCadastrarForm(JPanel cadastrarForm) {
        CadastrarForm = cadastrarForm;
    }
}
