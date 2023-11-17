/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.pedido;

import com.mycompany.dao.DaoCidade;
import com.mycompany.dao.DaoPedido;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListPedido extends javax.swing.JFrame {

    /**
     * Creates new form ListPedido
     */
    public ListPedido() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    
    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
                }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            public void listarPorId(int pId){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

            public void listarPorNomePessoa(String pNomePessoa){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorNomePessoa(pNomePessoa);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

            public void listarPorSobrenomePessoa(String pSobrenomePessoa){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorSobrenomePessoa(pSobrenomePessoa);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            
            public void listarPorNomeProduto(String pNomeProduto){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorNomeProduto(pNomeProduto);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            
            public void listarPorDataPedidoMaiorQue(String pDataPedido){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorDataPedidoMaiorQue(pDataPedido);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            
            public void listarPorDataPedidoMenorQue(String pDataPedido){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorDataPedidoMenorQue(pDataPedido);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            
            public void listarPorDataPedidoIgualA(String pDataPedido){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorDataPedidoIgualA(pDataPedido);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            
            public void listarPorTotalPedidoMaiorQue(Double pTotalPedido){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorTotalPedidoMaiorQue(pTotalPedido);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            
            
            public void listarPorTotalPedidoMenorQue(Double pTotalPedido){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorTotalPedidoMenorQue(pTotalPedido);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            
            public void listarPorTotalPedidoIgualA(Double pTotalPedido){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePedido.getModel();
            
            tablePedido.setModel(defaultTableModel);

            DaoPedido daoPedido = new DaoPedido();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPedido.listarPorTotalPedidoIgualA(pTotalPedido);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pessoa = resultSet.getString(2);
                String produto = resultSet.getString(3);
                String dataPedido = resultSet.getString(4);
                String statuspedido = resultSet.getString(5);
                String enderecoentrega = resultSet.getString(6);
                String quantidade = resultSet.getString(7);
                String total = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, pessoa, produto, dataPedido, statuspedido, enderecoentrega, quantidade, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePedido = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "NOME_PESSOA", "SOBRENOME_PESSOA", "NOME_PRODUTO", "DATA_PEDIDO_MAIOR_QUE", "DATA_PEDIDO_MENOR_QUE", "DATA_PEDIDO_IGUAL_A", "TOTAL_PEDIDO_MAIOR_QUE", "TOTAL_PEDIDO_MENOR_QUE", "TOTAL_PEDIDO_IGUAL_A" }));

        tablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "pessoa", "produto", "dataPedido", "statuspedido", "enderecoentrega", "quantidade", "total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePedido);

        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBuscar)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tablePedido;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
