package view;

import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlterarCliente {
    private JTextField cpfConsultaField;
    private JButton cpfConsulta;
    private JTextField nomeField;
    private JTextField cpfField;
    private JTextField telefoneField;
    private JTextField enderecoField;
    private JTextField numeroField;
    private JTextField cidadeField;
    private JTextField estadoField;
    private JButton atualizarButton;
    private JPanel alterarClienteForm;
    private IClienteDAO iClienteDAO;
    private String clientCpf;

    public AlterarCliente(IClienteDAO c) {
        this.iClienteDAO = c;
        cpfConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var cpf = cpfConsultaField.getText();
                Cliente cliente = c.consultar(Long.valueOf(cpf));
                clientCpf = String.valueOf(cliente.getCpf());
                if(cliente != null) {
                    nomeField.setText(cliente.getNome());

                    telefoneField.setText(String.valueOf(cliente.getTel()));
                    enderecoField.setText(cliente.getEndereco());
                    numeroField.setText(String.valueOf(cliente.getNumero()));
                    cidadeField.setText(cliente.getCidade());
                    estadoField.setText(cliente.getEstado());
                }

            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente c = new Cliente(
                        nomeField.getText(),
                        cpfConsultaField.getText(),
                        telefoneField.getText(),
                        enderecoField.getText(),
                        numeroField.getText(),
                        cidadeField.getText(),
                        estadoField.getText()
                );

                iClienteDAO.alterar(Long.valueOf(clientCpf), c);
            }
        });
    }

    public JTextField getCpfConsultaField() {
        return cpfConsultaField;
    }

    public void setCpfConsultaField(JTextField cpfConsultaField) {
        this.cpfConsultaField = cpfConsultaField;
    }

    public JButton getCpfConsulta() {
        return cpfConsulta;
    }

    public void setCpfConsulta(JButton cpfConsulta) {
        this.cpfConsulta = cpfConsulta;
    }

    public JTextField getNomeField() {
        return nomeField;
    }

    public void setNomeField(JTextField nomeField) {
        this.nomeField = nomeField;
    }

    public JTextField getCpfField() {
        return cpfField;
    }

    public void setCpfField(JTextField cpfField) {
        this.cpfField = cpfField;
    }

    public JTextField getTelefoneField() {
        return telefoneField;
    }

    public void setTelefoneField(JTextField telefoneField) {
        this.telefoneField = telefoneField;
    }

    public JTextField getEnderecoField() {
        return enderecoField;
    }

    public void setEnderecoField(JTextField enderecoField) {
        this.enderecoField = enderecoField;
    }

    public JTextField getNumeroField() {
        return numeroField;
    }

    public void setNumeroField(JTextField numeroField) {
        this.numeroField = numeroField;
    }

    public JTextField getCidadeField() {
        return cidadeField;
    }

    public void setCidadeField(JTextField cidadeField) {
        this.cidadeField = cidadeField;
    }

    public JTextField getEstadoField() {
        return estadoField;
    }

    public void setEstadoField(JTextField estadoField) {
        this.estadoField = estadoField;
    }

    public JButton getAtualizarButton() {
        return atualizarButton;
    }

    public void setAtualizarButton(JButton atualizarButton) {
        this.atualizarButton = atualizarButton;
    }

    public JPanel getAlterarClienteForm() {
        return alterarClienteForm;
    }

    public void setAlterarClienteForm(JPanel alterarClienteForm) {
        this.alterarClienteForm = alterarClienteForm;
    }

    public IClienteDAO getiClienteDAO() {
        return iClienteDAO;
    }

    public void setiClienteDAO(IClienteDAO iClienteDAO) {
        this.iClienteDAO = iClienteDAO;
    }
}
