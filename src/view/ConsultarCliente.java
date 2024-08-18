package view;

import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultarCliente {
    private JPanel consultarClienteForm;
    private JLabel consultarClienteFormLabel;
    private JLabel cpfSearchLabel;
    private JTextField cpfSearchField;
    private JLabel nameLabel;
    private JLabel nameField;
    private JLabel cpfField;
    private JLabel cpfLabel;
    private JLabel telefoneLabel;
    private JLabel telefoneField;
    private JLabel enderecoLabel;
    private JLabel enderecoField;
    private JLabel numeroLabel;
    private JLabel numeroField;
    private JLabel cidadeLabel;
    private JLabel cidadeField;
    private JLabel estadoLabel;
    private JLabel estadoField;
    private JButton consultarButton;
    private IClienteDAO iClienteDAO;

    public ConsultarCliente(IClienteDAO c) {
        this.iClienteDAO = c;
        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var cpf = cpfSearchField.getText();
                Cliente cliente = c.consultar(Long.valueOf(cpf));

                if(cliente != null) {
                    nameField.setText(cliente.getNome());
                    cpfField.setText(String.valueOf(cliente.getCpf()));
                    telefoneField.setText(String.valueOf(cliente.getTel()));
                    enderecoField.setText(cliente.getEndereco());
                    numeroField.setText(String.valueOf(cliente.getNumero()));
                    cidadeField.setText(cliente.getCidade());
                    estadoField.setText(cliente.getEstado());

                }

            }
        });
    }

    public JPanel getConsultarClienteForm() {
        return consultarClienteForm;
    }

    public void setConsultarClienteForm(JPanel consultarClienteForm) {
        this.consultarClienteForm = consultarClienteForm;
    }

    public JLabel getConsultarClienteFormLabel() {
        return consultarClienteFormLabel;
    }

    public void setConsultarClienteFormLabel(JLabel consultarClienteFormLabel) {
        this.consultarClienteFormLabel = consultarClienteFormLabel;
    }

    public JLabel getCpfSearchLabel() {
        return cpfSearchLabel;
    }

    public void setCpfSearchLabel(JLabel cpfSearchLabel) {
        this.cpfSearchLabel = cpfSearchLabel;
    }

    public JTextField getCpfSearchField() {
        return cpfSearchField;
    }

    public void setCpfSearchField(JTextField cpfSearchField) {
        this.cpfSearchField = cpfSearchField;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JLabel getNameField() {
        return nameField;
    }

    public void setNameField(JLabel nameField) {
        this.nameField = nameField;
    }

    public JLabel getCpfField() {
        return cpfField;
    }

    public void setCpfField(JLabel cpfField) {
        this.cpfField = cpfField;
    }

    public JLabel getCpfLabel() {
        return cpfLabel;
    }

    public void setCpfLabel(JLabel cpfLabel) {
        this.cpfLabel = cpfLabel;
    }

    public JLabel getTelefoneLabel() {
        return telefoneLabel;
    }

    public void setTelefoneLabel(JLabel telefoneLabel) {
        this.telefoneLabel = telefoneLabel;
    }

    public JLabel getTelefoneField() {
        return telefoneField;
    }

    public void setTelefoneField(JLabel telefoneField) {
        this.telefoneField = telefoneField;
    }

    public JLabel getEnderecoLabel() {
        return enderecoLabel;
    }

    public void setEnderecoLabel(JLabel enderecoLabel) {
        this.enderecoLabel = enderecoLabel;
    }

    public JLabel getEnderecoField() {
        return enderecoField;
    }

    public void setEnderecoField(JLabel enderecoField) {
        this.enderecoField = enderecoField;
    }

    public JLabel getNumeroLabel() {
        return numeroLabel;
    }

    public void setNumeroLabel(JLabel numeroLabel) {
        this.numeroLabel = numeroLabel;
    }

    public JLabel getNumeroField() {
        return numeroField;
    }

    public void setNumeroField(JLabel numeroField) {
        this.numeroField = numeroField;
    }

    public JLabel getCidadeLabel() {
        return cidadeLabel;
    }

    public void setCidadeLabel(JLabel cidadeLabel) {
        this.cidadeLabel = cidadeLabel;
    }

    public JLabel getCidadeField() {
        return cidadeField;
    }

    public void setCidadeField(JLabel cidadeField) {
        this.cidadeField = cidadeField;
    }

    public JLabel getEstadoLabel() {
        return estadoLabel;
    }

    public void setEstadoLabel(JLabel estadoLabel) {
        this.estadoLabel = estadoLabel;
    }

    public JLabel getEstadoField() {
        return estadoField;
    }

    public void setEstadoField(JLabel estadoField) {
        this.estadoField = estadoField;
    }

    public JButton getConsultarButton() {
        return consultarButton;
    }

    public void setConsultarButton(JButton consultarButton) {
        this.consultarButton = consultarButton;
    }

    public IClienteDAO getiClienteDAO() {
        return iClienteDAO;
    }

    public void setiClienteDAO(IClienteDAO iClienteDAO) {
        this.iClienteDAO = iClienteDAO;
    }
}
