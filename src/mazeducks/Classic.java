/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazeducks;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author utkar
 */
public class Classic extends javax.swing.JFrame {
    public static int dif;
    /**
     * Creates new form Classic
     */
    public Classic() {
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

        jPanel1 = new javax.swing.JPanel();
        Difficulty = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Play = new javax.swing.JButton();
        TunnelVision = new javax.swing.JToggleButton();
        Back = new javax.swing.JButton();
        leaderboard = new javax.swing.JButton();
        PracticeMode = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Classic Gamemode");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Difficulty.setModel(new javax.swing.SpinnerNumberModel(10, 10, 40, 1));
        jPanel1.add(Difficulty);
        Difficulty.setBounds(170, 350, 70, 50);

        jButton1.setText("i");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 250, 40, 32);

        jLabel3.setFont(new java.awt.Font("Proxy 2", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Leaderboard");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(520, 290, 210, 40);

        jLabel5.setFont(new java.awt.Font("Proxy 2", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Difficulty");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 430, 260, 50);

        jLabel2.setFont(new java.awt.Font("Proxy 2", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Back");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 290, 80, 30);

        jLabel1.setFont(new java.awt.Font("Proxy 2", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Play");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 350, 100, 60);

        Play.setBorder(null);
        Play.setBorderPainted(false);
        Play.setContentAreaFilled(false);
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        jPanel1.add(Play);
        Play.setBounds(370, 310, 120, 140);

        TunnelVision.setBackground(new java.awt.Color(255, 255, 255));
        TunnelVision.setFont(new java.awt.Font("Proxy 2", 1, 20)); // NOI18N
        TunnelVision.setForeground(new java.awt.Color(255, 255, 255));
        TunnelVision.setText("Tunnel Vision");
        TunnelVision.setBorder(null);
        TunnelVision.setBorderPainted(false);
        TunnelVision.setContentAreaFilled(false);
        TunnelVision.setFocusPainted(false);
        TunnelVision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/mazeducks/tunnel vision.png"))); // NOI18N
        TunnelVision.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/mazeducks/tunnel vision.png"))); // NOI18N
        TunnelVision.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/mazeducks/rightbottom.png"))); // NOI18N
        TunnelVision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TunnelVisionActionPerformed(evt);
            }
        });
        jPanel1.add(TunnelVision);
        TunnelVision.setBounds(530, 430, 190, 60);

        Back.setBorder(null);
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(100, 260, 260, 80);

        leaderboard.setBorder(null);
        leaderboard.setBorderPainted(false);
        leaderboard.setContentAreaFilled(false);
        leaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboardActionPerformed(evt);
            }
        });
        jPanel1.add(leaderboard);
        leaderboard.setBounds(520, 270, 240, 70);

        PracticeMode.setFont(new java.awt.Font("Proxy 2", 1, 24)); // NOI18N
        PracticeMode.setForeground(new java.awt.Color(255, 255, 255));
        PracticeMode.setText("Practice Mode");
        PracticeMode.setBorder(null);
        PracticeMode.setBorderPainted(false);
        PracticeMode.setContentAreaFilled(false);
        PracticeMode.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/mazeducks/practicemode.png"))); // NOI18N
        PracticeMode.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/mazeducks/practicemode.png"))); // NOI18N
        PracticeMode.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/mazeducks/rightmiddle.png"))); // NOI18N
        PracticeMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PracticeModeActionPerformed(evt);
            }
        });
        jPanel1.add(PracticeMode);
        PracticeMode.setBounds(520, 350, 230, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mazeducks/maxresdefault.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 858, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        // TODO add your handling code here:
        dif = (Integer)Difficulty.getValue();
        boolean prac = false;
        System.out.println(dif);
        int tog = 0;
        if(TunnelVision.isSelected())
            tog = 1;
        if(PracticeMode.isSelected())
            prac = true;
        new ClassicMaze(tog,dif,prac);
        this.dispose();
    }//GEN-LAST:event_PlayActionPerformed

    private void TunnelVisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TunnelVisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TunnelVisionActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Level L = new Level();
        L.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void PracticeModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PracticeModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PracticeModeActionPerformed

    private void leaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboardActionPerformed
        // TODO add your handling code here:
        Leaderboard ld = new Leaderboard();
                ld.setVisible(true);
                this.dispose();
                
    }//GEN-LAST:event_leaderboardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String message = "<html><body><div align='left'>"
                + "In Classic mode, try to solve the maze in the shortest time possible!<br>"
                + "The game will predict the next maze based on how fast you solve the <br>"
                + "current maze. If you want to quit anytime, just press the quit button,<br>"
                + "and it will save your previous mazes in the Leaderboard. If you want<br>"
                + "a real challenge, then enable Tunnel Vision and try solving it then!<br><br>"
                + "You can change the difficulty by changing the value on the left side<br>"
                + "Enable practice mode if you don't want changes to the leaderboard.<br>"
                + "</div></body></html>";
        JLabel messagelabel = new JLabel(message);
        JOptionPane.showMessageDialog(null, messagelabel);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Classic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JSpinner Difficulty;
    private javax.swing.JButton Play;
    private javax.swing.JToggleButton PracticeMode;
    private javax.swing.JToggleButton TunnelVision;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leaderboard;
    // End of variables declaration//GEN-END:variables
}
