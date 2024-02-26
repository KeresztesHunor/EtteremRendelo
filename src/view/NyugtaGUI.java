package view;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.Action;
import model.Etel;

public class NyugtaGUI extends javax.swing.JFrame implements NyugtaView
{
    private final Action nyomtatasEvent;
    
    public NyugtaGUI(Action nyomtatasEvent)
    {
        initComponents();
        this.nyomtatasEvent = nyomtatasEvent;
        setVisible(true);
    }
    
    @Override public void nyugtatKiir(List<Etel> pirosAsztalRendelesek, List<Etel> zoldAsztalRendelesek, List<Etel> kekAsztalRendelesek, List<Etel> feherAsztalRendelesek)
    {
        nyugtaKiir(pirosAsztalList, pirosAsztalRendelesek);
        nyugtaKiir(zoldAsztalList, zoldAsztalRendelesek);
        nyugtaKiir(kekAsztalList, kekAsztalRendelesek);
        nyugtaKiir(feherAsztalList, feherAsztalRendelesek);
    }
    
    private void nyugtaKiir(JList<String> asztalRendelesekLista, List<Etel> rendelesek)
    {
        final DefaultListModel<String> dlm = new DefaultListModel();
        for (int i = 0; i < rendelesek.size(); i++)
        {
            Etel etel = rendelesek.get(i);
            dlm.addElement(String.format("%-28s %8d Ft", etel.getNev(), etel.getAr()));
        }
        asztalRendelesekLista.setModel(dlm);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pirosAsztalPanel = new javax.swing.JPanel();
        pirosAsztalScrollPane = new javax.swing.JScrollPane();
        pirosAsztalList = new javax.swing.JList<>();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nyugta");
        setResizable(false);

        pirosAsztalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Piros asztal"));

        pirosAsztalScrollPane.setViewportView(pirosAsztalList);

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
                    .addComponent(zoldAsztalScrollPane)
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
                    .addComponent(kekAsztalScrollPane)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nyomtatasEvent.invoke();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JList<String> pirosAsztalList;
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
