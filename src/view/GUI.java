package view;

import javax.swing.JRadioButton;

public class GUI extends javax.swing.JFrame
{
    public GUI()
    {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asztalButtonGroup = new javax.swing.ButtonGroup();
        etelekPanel = new javax.swing.JPanel();
        etelNevTextField = new javax.swing.JTextField();
        etelNevLabel = new javax.swing.JLabel();
        etelArLabel = new javax.swing.JLabel();
        etelArSpinner = new javax.swing.JSpinner();
        ujEteltHozzaadGomb = new javax.swing.JButton();
        etelekListaScrollPane = new javax.swing.JScrollPane();
        etelekLista = new javax.swing.JList<>();
        asztalPanel = new javax.swing.JPanel();
        pirosAszalRadioButton = new javax.swing.JRadioButton();
        zoldAszalRadioButton = new javax.swing.JRadioButton();
        kekAszalRadioButton = new javax.swing.JRadioButton();
        feherAszalRadioButton = new javax.swing.JRadioButton();
        ujRendelestHozzaadGomb = new javax.swing.JButton();
        rendelesekPanel = new javax.swing.JPanel();
        rendelesekListaScrollPane = new javax.swing.JScrollPane();
        rendelesekLista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rendelés");
        setResizable(false);

        etelekPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ételek"));

        etelNevLabel.setText("Név:");

        etelArLabel.setText("Ár:");

        ujEteltHozzaadGomb.setText("+");

        etelekLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        etelekListaScrollPane.setViewportView(etelekLista);

        javax.swing.GroupLayout etelekPanelLayout = new javax.swing.GroupLayout(etelekPanel);
        etelekPanel.setLayout(etelekPanelLayout);
        etelekPanelLayout.setHorizontalGroup(
            etelekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etelekPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(etelekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etelekListaScrollPane)
                    .addGroup(etelekPanelLayout.createSequentialGroup()
                        .addComponent(etelNevLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etelNevTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etelArLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etelArSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ujEteltHozzaadGomb)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        etelekPanelLayout.setVerticalGroup(
            etelekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etelekPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(etelekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etelNevTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etelNevLabel)
                    .addComponent(etelArLabel)
                    .addComponent(etelArSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ujEteltHozzaadGomb))
                .addGap(18, 18, 18)
                .addComponent(etelekListaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        asztalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Asztal"));

        asztalButtonGroup.add(pirosAszalRadioButton);
        pirosAszalRadioButton.setText("Piros");
        pirosAszalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pirosAszalRadioButtonActionPerformed(evt);
            }
        });

        asztalButtonGroup.add(zoldAszalRadioButton);
        zoldAszalRadioButton.setText("Zöld");
        zoldAszalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoldAszalRadioButtonActionPerformed(evt);
            }
        });

        asztalButtonGroup.add(kekAszalRadioButton);
        kekAszalRadioButton.setText("Kék");
        kekAszalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kekAszalRadioButtonActionPerformed(evt);
            }
        });

        asztalButtonGroup.add(feherAszalRadioButton);
        feherAszalRadioButton.setText("Fehér");
        feherAszalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feherAszalRadioButtonActionPerformed(evt);
            }
        });

        ujRendelestHozzaadGomb.setText("->");

        javax.swing.GroupLayout asztalPanelLayout = new javax.swing.GroupLayout(asztalPanel);
        asztalPanel.setLayout(asztalPanelLayout);
        asztalPanelLayout.setHorizontalGroup(
            asztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pirosAszalRadioButton)
                    .addComponent(zoldAszalRadioButton)
                    .addComponent(kekAszalRadioButton)
                    .addComponent(feherAszalRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ujRendelestHozzaadGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        asztalPanelLayout.setVerticalGroup(
            asztalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asztalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pirosAszalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoldAszalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kekAszalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feherAszalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ujRendelestHozzaadGomb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rendelesekPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Rendelések"));

        rendelesekLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        rendelesekListaScrollPane.setViewportView(rendelesekLista);

        javax.swing.GroupLayout rendelesekPanelLayout = new javax.swing.GroupLayout(rendelesekPanel);
        rendelesekPanel.setLayout(rendelesekPanelLayout);
        rendelesekPanelLayout.setHorizontalGroup(
            rendelesekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendelesekPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rendelesekListaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        rendelesekPanelLayout.setVerticalGroup(
            rendelesekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rendelesekPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rendelesekListaScrollPane)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etelekPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asztalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rendelesekPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rendelesekPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asztalPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(etelekPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pirosAszalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirosAszalRadioButtonActionPerformed
        radioButtonSelectionChanged(pirosAszalRadioButton, 0);
    }//GEN-LAST:event_pirosAszalRadioButtonActionPerformed

    private void zoldAszalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoldAszalRadioButtonActionPerformed
        radioButtonSelectionChanged(zoldAszalRadioButton, 1);
    }//GEN-LAST:event_zoldAszalRadioButtonActionPerformed

    private void kekAszalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kekAszalRadioButtonActionPerformed
        radioButtonSelectionChanged(kekAszalRadioButton, 2);
    }//GEN-LAST:event_kekAszalRadioButtonActionPerformed

    private void feherAszalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feherAszalRadioButtonActionPerformed
        radioButtonSelectionChanged(feherAszalRadioButton, 3);
    }//GEN-LAST:event_feherAszalRadioButtonActionPerformed

    private void radioButtonSelectionChanged(JRadioButton button, int index)
    {
        if (button.isSelected())
        {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup asztalButtonGroup;
    private javax.swing.JPanel asztalPanel;
    private javax.swing.JLabel etelArLabel;
    private javax.swing.JSpinner etelArSpinner;
    private javax.swing.JLabel etelNevLabel;
    private javax.swing.JTextField etelNevTextField;
    private javax.swing.JList<String> etelekLista;
    private javax.swing.JScrollPane etelekListaScrollPane;
    private javax.swing.JPanel etelekPanel;
    private javax.swing.JRadioButton feherAszalRadioButton;
    private javax.swing.JRadioButton kekAszalRadioButton;
    private javax.swing.JRadioButton pirosAszalRadioButton;
    private javax.swing.JList<String> rendelesekLista;
    private javax.swing.JScrollPane rendelesekListaScrollPane;
    private javax.swing.JPanel rendelesekPanel;
    private javax.swing.JButton ujEteltHozzaadGomb;
    private javax.swing.JButton ujRendelestHozzaadGomb;
    private javax.swing.JRadioButton zoldAszalRadioButton;
    // End of variables declaration//GEN-END:variables
}
