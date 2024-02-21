package view;

public class NyugtaGUI extends javax.swing.JFrame
{
    public NyugtaGUI()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pirosAsztalPanel = new javax.swing.JPanel();
        pirosAsztalScrollPane = new javax.swing.JScrollPane();
        pirosAszalList = new javax.swing.JList<>();
        pirosAsztalOsszesenLabel = new javax.swing.JLabel();
        pirosAsztalOsszegLabel = new javax.swing.JLabel();
        zoldAsztalPanel = new javax.swing.JPanel();
        zoldAsztalScrollPane = new javax.swing.JScrollPane();
        zoldAsztalList = new javax.swing.JList<>();
        zoldAsztalOsszesenLabel = new javax.swing.JLabel();
        zoldAsztalOsszegLabel = new javax.swing.JLabel();
        kekAsztalPanel = new javax.swing.JPanel();
        kekAsztalScrollPane = new javax.swing.JScrollPane();
        kekAsztalList = new javax.swing.JList<>();
        kekAsztalOsszesenLabel = new javax.swing.JLabel();
        kekAsztalOsszegLabel = new javax.swing.JLabel();
        feherAsztalPanel = new javax.swing.JPanel();
        feherAsztalScrollPane = new javax.swing.JScrollPane();
        feherAsztalList = new javax.swing.JList<>();
        feherAsztalOsszesenLabel = new javax.swing.JLabel();
        feherAsztalOsszegLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nyugta");
        setResizable(false);

        pirosAsztalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Piros asztal"));

        pirosAszalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Babgulyás                700 Ft", "Rántott sajt              800 Ft" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pirosAsztalScrollPane.setViewportView(pirosAszalList);

        pirosAsztalOsszesenLabel.setText("Összesen:");

        pirosAsztalOsszegLabel.setText("1500 Ft");

        javax.swing.GroupLayout pirosAsztalPanelLayout = new javax.swing.GroupLayout(pirosAsztalPanel);
        pirosAsztalPanel.setLayout(pirosAsztalPanelLayout);
        pirosAsztalPanelLayout.setHorizontalGroup(
            pirosAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pirosAsztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pirosAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pirosAsztalScrollPane)
                    .addGroup(pirosAsztalPanelLayout.createSequentialGroup()
                        .addComponent(pirosAsztalOsszesenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pirosAsztalOsszegLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pirosAsztalPanelLayout.setVerticalGroup(
            pirosAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pirosAsztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pirosAsztalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pirosAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pirosAsztalOsszesenLabel)
                    .addComponent(pirosAsztalOsszegLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        zoldAsztalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Zöld asztal"));

        zoldAsztalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Gyülmölcsleves       800 Ft", "Bécsi szelet             1200 Ft", "Somlói galuska        500 Ft" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        zoldAsztalScrollPane.setViewportView(zoldAsztalList);

        zoldAsztalOsszesenLabel.setText("Összesen:");

        zoldAsztalOsszegLabel.setText("2500 Ft");

        javax.swing.GroupLayout zoldAsztalPanelLayout = new javax.swing.GroupLayout(zoldAsztalPanel);
        zoldAsztalPanel.setLayout(zoldAsztalPanelLayout);
        zoldAsztalPanelLayout.setHorizontalGroup(
            zoldAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoldAsztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(zoldAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zoldAsztalScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(zoldAsztalPanelLayout.createSequentialGroup()
                        .addComponent(zoldAsztalOsszesenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zoldAsztalOsszegLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        zoldAsztalPanelLayout.setVerticalGroup(
            zoldAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoldAsztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zoldAsztalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(zoldAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zoldAsztalOsszesenLabel)
                    .addComponent(zoldAsztalOsszegLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kekAsztalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Kék asztal"));

        kekAsztalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Gyülmölcsleves       800 Ft", "Rántott sajt              800 Ft" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        kekAsztalScrollPane.setViewportView(kekAsztalList);

        kekAsztalOsszesenLabel.setText("Összesen:");

        kekAsztalOsszegLabel.setText("1600 Ft");

        javax.swing.GroupLayout kekAsztalPanelLayout = new javax.swing.GroupLayout(kekAsztalPanel);
        kekAsztalPanel.setLayout(kekAsztalPanelLayout);
        kekAsztalPanelLayout.setHorizontalGroup(
            kekAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kekAsztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kekAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kekAsztalScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(kekAsztalPanelLayout.createSequentialGroup()
                        .addComponent(kekAsztalOsszesenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kekAsztalOsszegLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kekAsztalPanelLayout.setVerticalGroup(
            kekAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kekAsztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kekAsztalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kekAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kekAsztalOsszesenLabel)
                    .addComponent(kekAsztalOsszegLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        feherAsztalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Fehér asztal"));

        feherAsztalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bécsi szelet             1200 Ft" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        feherAsztalScrollPane.setViewportView(feherAsztalList);

        feherAsztalOsszesenLabel.setText("Összesen:");

        feherAsztalOsszegLabel.setText("1200 Ft");

        javax.swing.GroupLayout feherAsztalPanelLayout = new javax.swing.GroupLayout(feherAsztalPanel);
        feherAsztalPanel.setLayout(feherAsztalPanelLayout);
        feherAsztalPanelLayout.setHorizontalGroup(
            feherAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feherAsztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(feherAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feherAsztalScrollPane)
                    .addGroup(feherAsztalPanelLayout.createSequentialGroup()
                        .addComponent(feherAsztalOsszesenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feherAsztalOsszegLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        feherAsztalPanelLayout.setVerticalGroup(
            feherAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feherAsztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(feherAsztalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(feherAsztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feherAsztalOsszesenLabel)
                    .addComponent(feherAsztalOsszegLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Nyomtatás");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pirosAsztalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kekAsztalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zoldAsztalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(feherAsztalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pirosAsztalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kekAsztalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zoldAsztalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feherAsztalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NyugtaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyugtaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyugtaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyugtaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NyugtaGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> feherAsztalList;
    private javax.swing.JLabel feherAsztalOsszegLabel;
    private javax.swing.JLabel feherAsztalOsszesenLabel;
    private javax.swing.JPanel feherAsztalPanel;
    private javax.swing.JScrollPane feherAsztalScrollPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> kekAsztalList;
    private javax.swing.JLabel kekAsztalOsszegLabel;
    private javax.swing.JLabel kekAsztalOsszesenLabel;
    private javax.swing.JPanel kekAsztalPanel;
    private javax.swing.JScrollPane kekAsztalScrollPane;
    private javax.swing.JList<String> pirosAszalList;
    private javax.swing.JLabel pirosAsztalOsszegLabel;
    private javax.swing.JLabel pirosAsztalOsszesenLabel;
    private javax.swing.JPanel pirosAsztalPanel;
    private javax.swing.JScrollPane pirosAsztalScrollPane;
    private javax.swing.JList<String> zoldAsztalList;
    private javax.swing.JLabel zoldAsztalOsszegLabel;
    private javax.swing.JLabel zoldAsztalOsszesenLabel;
    private javax.swing.JPanel zoldAsztalPanel;
    private javax.swing.JScrollPane zoldAsztalScrollPane;
    // End of variables declaration//GEN-END:variables
}
