/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_redes;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvi Kalinoski, Maximiliano Meyer
 */
public class Ipv6 extends javax.swing.JFrame {

    int qSubrede = 1;
    Binario calcula = new Binario();

    /**
     * Creates new form Ipv6
     */
    public Ipv6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaIpv6 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnGerar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIpv6 = new javax.swing.JTextField();
        txtSubredes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textSaidaIpv6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textoSaidaM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerador de rede IPv6");

        tabelaIpv6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub-Rede", "Inicio", "Fim"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaIpv6);
        if (tabelaIpv6.getColumnModel().getColumnCount() > 0) {
            tabelaIpv6.getColumnModel().getColumn(0).setResizable(false);
            tabelaIpv6.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabelaIpv6.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel3.setText("Digite o endereço IPv6:");

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        jLabel4.setText("Números de sub-redes a serem criadas: ");

        txtIpv6.setText("2001:0000:Acad:0000:0000:0000:0000:0000/48");
        txtIpv6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpv6ActionPerformed(evt);
            }
        });

        txtSubredes.setText("2");
        txtSubredes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubredesActionPerformed(evt);
            }
        });

        jLabel5.setText("IPv6 Base:");

        textSaidaIpv6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSaidaIpv6ActionPerformed(evt);
            }
        });

        jLabel6.setText("/");

        jLabel7.setText("Sub-redes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIpv6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSaidaIpv6, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoSaidaM, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIpv6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textSaidaIpv6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textoSaidaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed

        String ipv6;
        String inicio;
        String fim = null;
        int nHost;
        int hostSub;
        int hostSubInicioFim = 0;
        
        DefaultTableModel model = (DefaultTableModel) tabelaIpv6.getModel(); //Declara a tabela

        try {
            ipv6 = txtIpv6.getText();           //Variavel ipv4 recebe os valores do campo txtIpv6
            String[] ipv6Sep = ipv6.split("/"); //Usado para separar rede da máscara
            textSaidaIpv6.setText(ipv6Sep[0]);  //Seta nos campos textSaidaIpv6 o primeiro valor contindo no txtIpv6
            textoSaidaM.setText(ipv6Sep[1]);    //Seta nos campos textoSaidaM o segundo valor contindo no txtIpv6
            
            nHost = Binario.qtdHost6(txtSubredes.getText()); //Pega a máscara de entrada e verifica quantidade de hosts
            hostSub = nHost + Integer.parseInt(ipv6Sep[1]) ; //Divide a quantidade de host pela quantidade de hosts desejados
            inicio = textSaidaIpv6.getText();                //A variavel inicio recebe o ip setado
     
            //Imprimir na tabela
            int numero = Integer.parseInt(txtSubredes.getText());
            model.setNumRows(0); //Zera a tabela antes de inserir novos dados a cada solicitação
            
            for (int i = 0; i < numero; i++) {
            fim = Binario.contaInsereFinal(textSaidaIpv6.getText(), hostSub);    //A variavel inicio recebe o ip setado
                String[] linha = new String[]{
                    Integer.toString(qSubrede),
                    inicio + "/" + hostSub,
                    fim + "/" + hostSub,
                    Integer.toString(hostSub)};
                model.addRow(linha);
                qSubrede++;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
 

    }//GEN-LAST:event_btnGerarActionPerformed

    private void txtSubredesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubredesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubredesActionPerformed

    private void txtIpv6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpv6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpv6ActionPerformed

    private void textSaidaIpv6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSaidaIpv6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSaidaIpv6ActionPerformed

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
            java.util.logging.Logger.getLogger(Ipv6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ipv6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ipv6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ipv6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ipv6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaIpv6;
    private javax.swing.JTextField textSaidaIpv6;
    private javax.swing.JTextField textoSaidaM;
    private javax.swing.JTextField txtIpv6;
    private javax.swing.JTextField txtSubredes;
    // End of variables declaration//GEN-END:variables
}
