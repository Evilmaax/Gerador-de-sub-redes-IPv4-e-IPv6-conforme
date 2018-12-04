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
public class Ipv4 extends javax.swing.JFrame {

    int qSubrede = 1;
    Binario calcula = new Binario();

    public Ipv4() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIpv4 = new javax.swing.JTextField();
        txtSubredes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textSaidaIpv4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoSaidaM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaIpv4 = new javax.swing.JTable();
        btnGerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerador de rede IPv4");

        jLabel2.setText("Digite o endereço IPv4:");

        jLabel3.setText("Números de sub-redes a serem criadas: ");

        txtIpv4.setText("192.168.2.0/28");

        txtSubredes.setText("4");

        jLabel4.setText("IPv4 Base:");

        jLabel5.setText("/");

        jLabel6.setText("Sub-redes:");

        tabelaIpv4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub-Rede", "Inicio", "Fim", "Nº host"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaIpv4);

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIpv4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSaidaIpv4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoSaidaM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIpv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textSaidaIpv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textoSaidaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão gerar IPv4, ira ler a entrada txtIpv4 e mostrar na saida.

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed

        //Variaveis
        String ipv4;
        String inicio;
        String fim = null;
        int nHost;
        int hostSub;
        int hostSubInicioFim;

        DefaultTableModel model = (DefaultTableModel) tabelaIpv4.getModel(); //Declara a tabela

        try {
            ipv4 = txtIpv4.getText();           //Variavel ipv4 recebe os valores do campo txtIpv4
            String[] ipv4Sep = ipv4.split("/"); //Divide os valores de entrada dividindos por / e coloca em um array
            textSaidaIpv4.setText(ipv4Sep[0]);  //Seta nos campos textSaidaIpv4 o primeiro valor contindo no txtIpv4
            textoSaidaM.setText(ipv4Sep[1]);    //Seta no campo textoSaidaM o segundo valor contindo no txtIpv4 (máscara)

            nHost = Binario.qtdHost(ipv4Sep[1]); //Pega a máscara de entrada e verifica quantidade de hosts
            hostSub = nHost / Integer.parseInt(txtSubredes.getText());  //Divide a quantidade de hosts pela quantidade de hosts desejado
            inicio = ipv4Sep[0];                 //A variável inácio recebe o ip setado
        
            hostSubInicioFim = 32 - (hostSub - 2);  // Calcula o número de hosts

            //Imprimir na tabela
            int numero = Integer.parseInt(txtSubredes.getText());
            int qSubrede = 1;    //Contador que identificará as sub-redes geradas
            model.setNumRows(0); //Zera a tabela antes de inserir novos dados a cada solicitação
            String x = inicio;   //Variavel recebe o inicio que é o ip sem a mascara
            String y = fim;      //Variavel y recebe o fim que é o IP final.
            String c = "1";      //A variavel c recebe "1"   
            String contador;
            
            //for onde chama os processo e realiza a montagem da saida
            for (int i = 0; i < numero; i++) {
                
                contador = Binario.contador(x, Integer.toString(i));     //Chama a função que ira realizar os cálculos e determinar os endereços de início da sub-rede

                inicio = contador;
                x = Binario.mostraHost(x, Integer.toString(hostSub), c); //Chama a função que ira realizar os cálculos e determinar os endereços de fim da sub-rede
                c = "0"; //Seta com string 0 o C
                fim = x;

                //Monta a string que será impresso, juntando os valores
                String[] linha = new String[]{
                    Integer.toString(qSubrede),
                    inicio + "/" + Integer.toString(hostSubInicioFim),
                    fim + "/" + Integer.toString(hostSubInicioFim),
                    Integer.toString(hostSub)};
                model.addRow(linha);
                qSubrede++;
                inicio = x;
            }
         
        } catch (NumberFormatException e) { //Em caso de erros será apresentado uma mensagem.
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }//GEN-LAST:event_btnGerarActionPerformed

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
            java.util.logging.Logger.getLogger(Ipv4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ipv4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ipv4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ipv4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ipv4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaIpv4;
    private javax.swing.JTextField textSaidaIpv4;
    private javax.swing.JTextField textoSaidaM;
    private javax.swing.JTextField txtIpv4;
    private javax.swing.JTextField txtSubredes;
    // End of variables declaration//GEN-END:variables
}
