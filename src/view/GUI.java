package view;

import java.util.Collections;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;
import model.Action;
import model.Action2;
import model.Action1;
import model.Etel;

public class GUI extends javax.swing.JFrame
{
    private int jelenlegKivalasztottAsztalIndex;
    
    private final List<AbstractButton> asztalRadioGombok;
    
    private final Action1<Integer> radioButtonSelectionChangedEvent;
    private final Action2<Integer, String> newRendelesAddedEvent;
    private final Action etelekFajlbaIrEvent;
    private final Action rendelesekFajlbaIrEvent;
    private final Action nyugtaMegjelenitEvent;
    private final Action2<String, Integer> ujEtelHozzaadasaEvent;
    
    public GUI(
        Action1<Integer> radioButtonSelectionChangedEvent,
        Action2<Integer, String> newRendelesAddedEvent,
        Action etelekFajlbaIrEvent,
        Action rendelesekFajlbaIrEvent,
        Action nyugtaMegjelenitEvent,
        Action2<String, Integer> ujEtelHozzaadasaEvent
    )
    {
        initComponents();
        jelenlegKivalasztottAsztalIndex = 0;
        asztalRadioGombok = Collections.list(asztalButtonGroup.getElements());
        this.radioButtonSelectionChangedEvent = radioButtonSelectionChangedEvent;
        this.newRendelesAddedEvent = newRendelesAddedEvent;
        this.etelekFajlbaIrEvent = etelekFajlbaIrEvent;
        this.rendelesekFajlbaIrEvent = rendelesekFajlbaIrEvent;
        this.nyugtaMegjelenitEvent = nyugtaMegjelenitEvent;
        this.ujEtelHozzaadasaEvent = ujEtelHozzaadasaEvent;
        setVisible(true);
    }
    
    private void radioButtonSelectionChanged(int index)
    {
        jelenlegKivalasztottAsztalIndex = index;
        if (asztalRadioGombok.get(index).isSelected())
        {
            radioButtonSelectionChangedEvent.invoke(index);
        }
    }
    
    public void setRendelesek(List<Etel> rendelesek)
    {
        final DefaultListModel<String> dlm = new DefaultListModel();
        for (Etel rendeles : rendelesek)
        {
            dlm.addElement(rendeles.getNev());
        }
        rendelesekLista.setModel(dlm);
    }
    
    public void etelekListahozHozzaad(String etel)
    {
        listahozHozzaad(etelekLista, etel);
    }
    
    private void listahozHozzaad(JList<String> lista, String ujElem)
    {
        final ListModel<String> elemek = lista.getModel();
        final DefaultListModel<String> dlm = new DefaultListModel();
        for (int i = 0; i < elemek.getSize(); i++)
        {
            dlm.addElement(elemek.getElementAt(i));
        }
        dlm.addElement(ujElem);
        lista.setModel(dlm);
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
        etelekFajlbaIrGomb = new javax.swing.JButton();
        asztalPanel = new javax.swing.JPanel();
        pirosAszalRadioButton = new javax.swing.JRadioButton();
        zoldAszalRadioButton = new javax.swing.JRadioButton();
        kekAszalRadioButton = new javax.swing.JRadioButton();
        feherAszalRadioButton = new javax.swing.JRadioButton();
        ujRendelestHozzaadGomb = new javax.swing.JButton();
        rendelesekPanel = new javax.swing.JPanel();
        rendelesekListaScrollPane = new javax.swing.JScrollPane();
        rendelesekLista = new javax.swing.JList<>();
        rendelesekFajlbaIrGomb = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rendelés");
        setResizable(false);

        etelekPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ételek"));

        etelNevLabel.setText("Név:");

        etelArLabel.setText("Ár:");

        ujEteltHozzaadGomb.setText("+");
        ujEteltHozzaadGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujEteltHozzaadGombActionPerformed(evt);
            }
        });

        etelekListaScrollPane.setViewportView(etelekLista);

        etelekFajlbaIrGomb.setText("Fájlba ír");
        etelekFajlbaIrGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etelekFajlbaIrGombActionPerformed(evt);
            }
        });

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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(etelekFajlbaIrGomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(etelekListaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etelekFajlbaIrGomb)
                .addContainerGap())
        );

        asztalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Asztal"));

        asztalButtonGroup.add(pirosAszalRadioButton);
        pirosAszalRadioButton.setSelected(true);
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
        ujRendelestHozzaadGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujRendelestHozzaadGombActionPerformed(evt);
            }
        });

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

        rendelesekListaScrollPane.setViewportView(rendelesekLista);

        rendelesekFajlbaIrGomb.setText("Fájlba ír");
        rendelesekFajlbaIrGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendelesekFajlbaIrGombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rendelesekPanelLayout = new javax.swing.GroupLayout(rendelesekPanel);
        rendelesekPanel.setLayout(rendelesekPanelLayout);
        rendelesekPanelLayout.setHorizontalGroup(
            rendelesekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendelesekPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rendelesekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rendelesekListaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(rendelesekFajlbaIrGomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rendelesekPanelLayout.setVerticalGroup(
            rendelesekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendelesekPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rendelesekListaScrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rendelesekFajlbaIrGomb)
                .addContainerGap())
        );

        jButton1.setText("Nyugtáz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rendelesekPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asztalPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etelekPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pirosAszalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirosAszalRadioButtonActionPerformed
        radioButtonSelectionChanged(0);
    }//GEN-LAST:event_pirosAszalRadioButtonActionPerformed

    private void zoldAszalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoldAszalRadioButtonActionPerformed
        radioButtonSelectionChanged(1);
    }//GEN-LAST:event_zoldAszalRadioButtonActionPerformed

    private void kekAszalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kekAszalRadioButtonActionPerformed
        radioButtonSelectionChanged(2);
    }//GEN-LAST:event_kekAszalRadioButtonActionPerformed

    private void feherAszalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feherAszalRadioButtonActionPerformed
        radioButtonSelectionChanged(3);
    }//GEN-LAST:event_feherAszalRadioButtonActionPerformed

    private void ujRendelestHozzaadGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujRendelestHozzaadGombActionPerformed
        final String etel = etelekLista.getSelectedValue();
        listahozHozzaad(rendelesekLista, etel);
        newRendelesAddedEvent.invoke(jelenlegKivalasztottAsztalIndex, etel);
    }//GEN-LAST:event_ujRendelestHozzaadGombActionPerformed

    private void rendelesekFajlbaIrGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendelesekFajlbaIrGombActionPerformed
        rendelesekFajlbaIrEvent.invoke();
    }//GEN-LAST:event_rendelesekFajlbaIrGombActionPerformed

    private void etelekFajlbaIrGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etelekFajlbaIrGombActionPerformed
        etelekFajlbaIrEvent.invoke();
    }//GEN-LAST:event_etelekFajlbaIrGombActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nyugtaMegjelenitEvent.invoke();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ujEteltHozzaadGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujEteltHozzaadGombActionPerformed
        ujEtelHozzaadasaEvent.invoke(etelNevTextField.getText(), (int)etelArSpinner.getValue());
    }//GEN-LAST:event_ujEteltHozzaadGombActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup asztalButtonGroup;
    private javax.swing.JPanel asztalPanel;
    private javax.swing.JLabel etelArLabel;
    private javax.swing.JSpinner etelArSpinner;
    private javax.swing.JLabel etelNevLabel;
    private javax.swing.JTextField etelNevTextField;
    private javax.swing.JButton etelekFajlbaIrGomb;
    private javax.swing.JList<String> etelekLista;
    private javax.swing.JScrollPane etelekListaScrollPane;
    private javax.swing.JPanel etelekPanel;
    private javax.swing.JRadioButton feherAszalRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton kekAszalRadioButton;
    private javax.swing.JRadioButton pirosAszalRadioButton;
    private javax.swing.JButton rendelesekFajlbaIrGomb;
    private javax.swing.JList<String> rendelesekLista;
    private javax.swing.JScrollPane rendelesekListaScrollPane;
    private javax.swing.JPanel rendelesekPanel;
    private javax.swing.JButton ujEteltHozzaadGomb;
    private javax.swing.JButton ujRendelestHozzaadGomb;
    private javax.swing.JRadioButton zoldAszalRadioButton;
    // End of variables declaration//GEN-END:variables
}
