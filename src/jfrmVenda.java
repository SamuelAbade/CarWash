/**
 *
 * @author SamuelAbade
 */
public class jfrmVenda extends javax.swing.JFrame {

    public jfrmVenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCsAspirar = new javax.swing.JCheckBox();
        jCsSecar = new javax.swing.JCheckBox();
        jCsEncerar = new javax.swing.JCheckBox();
        jCsPretinho = new javax.swing.JCheckBox();
        jCsSilicone = new javax.swing.JCheckBox();
        jCsLimp = new javax.swing.JCheckBox();
        jRdbPequeno = new javax.swing.JRadioButton();
        jRdbMedio = new javax.swing.JRadioButton();
        jRdbGrande = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jBtnCalculo = new javax.swing.JButton();
        jTextValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("------------------ Bem Vindo!  ------------------");

        jLabel2.setText("Por favor, selecione o tamanho do carro:");

        jLabel3.setText("Adicionais:");

        jCsAspirar.setText("Aspirar");
        jCsAspirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCsAspirarActionPerformed(evt);
            }
        });

        jCsSecar.setText("Secar");

        jCsEncerar.setText("Encerar");

        jCsPretinho.setText("Pretinho");

        jCsSilicone.setText("Silicone");

        jCsLimp.setText("Limp. Motor");

        buttonGroup2.add(jRdbPequeno);
        jRdbPequeno.setText("Pequeno");
        jRdbPequeno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRdbPequeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbPequenoActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRdbMedio);
        jRdbMedio.setText("Médio");

        buttonGroup2.add(jRdbGrande);
        jRdbGrande.setText("Grande");

        jLabel4.setText("Valor Final:");

        jBtnCalculo.setText("Calcular");
        jBtnCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalculoActionPerformed(evt);
            }
        });

        jTextValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCsAspirar)
                        .addGap(24, 24, 24)
                        .addComponent(jCsSecar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCsPretinho)
                            .addComponent(jRdbPequeno))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jRdbMedio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jCsSilicone)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCsLimp)
                                    .addComponent(jCsEncerar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRdbGrande)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel4)
                    .addComponent(jBtnCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextValor))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRdbPequeno)
                    .addComponent(jRdbMedio)
                    .addComponent(jRdbGrande))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCsSecar)
                    .addComponent(jCsEncerar)
                    .addComponent(jCsAspirar))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCsPretinho)
                    .addComponent(jCsSilicone)
                    .addComponent(jCsLimp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCalculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCsAspirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCsAspirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCsAspirarActionPerformed

    private void jRdbPequenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbPequenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdbPequenoActionPerformed

    
    private void jBtnCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalculoActionPerformed
        int venda, vpq, vpm, vpg, va, vs, ve, vp, vsi, vl;
        
        if(jRdbPequeno.isSelected())
            vpq = 12;
        else
            vpq = 0;
        
        if (jRdbMedio.isSelected())
            vpm = 15;
        else
            vpm = 0;        
        
        if (jRdbGrande.isSelected())
            vpg = 20;
        else
            vpg = 0;
        
        
        
        if(jCsAspirar.isSelected())
            va = 5;
        else
            va = 0;
        
        if(jCsEncerar.isSelected())
            ve = 5;
        else
            ve = 0;
        
        if(jCsSecar.isSelected())
            vs = 10;
        else
            vs = 0;
        
        if(jCsPretinho.isSelected())
            vp = 3;
        else
            vp = 0;        
        
        if(jCsSilicone.isSelected())
            vsi = 4;
        else
            vsi = 0;     
        
        if(jCsLimp.isSelected())
            vl = 20;
        else
            vl = 0;        
        
        venda = (vpm + vpq + vpg) + (va + vs + ve + vp + vsi + vl);
        
        jTextValor.setText(String.valueOf(venda));
    }//GEN-LAST:event_jBtnCalculoActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBtnCalculo;
    private javax.swing.JCheckBox jCsAspirar;
    private javax.swing.JCheckBox jCsEncerar;
    private javax.swing.JCheckBox jCsLimp;
    private javax.swing.JCheckBox jCsPretinho;
    private javax.swing.JCheckBox jCsSecar;
    private javax.swing.JCheckBox jCsSilicone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRdbGrande;
    private javax.swing.JRadioButton jRdbMedio;
    private javax.swing.JRadioButton jRdbPequeno;
    private javax.swing.JFormattedTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
