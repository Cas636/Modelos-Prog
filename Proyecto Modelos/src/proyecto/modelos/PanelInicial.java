package proyecto.modelos;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class PanelInicial extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();

    
    public PanelInicial() {
        this.setContentPane(fondo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 720));
        getContentPane().setLayout(null);

        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/comenzar1.jpg"))); // NOI18N
        start.setMaximumSize(new java.awt.Dimension(410, 92));
        start.setMinimumSize(new java.awt.Dimension(410, 92));
        start.setPreferredSize(new java.awt.Dimension(410, 92));
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startMouseExited(evt);
            }
        });
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start);
        start.setBounds(450, 420, 400, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        close();
        PanelJuego pj = new PanelJuego();
        pj.setVisible(true);
    }//GEN-LAST:event_startActionPerformed
    
    private void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
            
    private void startMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseEntered
      start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/comenzar2.jpg")));
    }//GEN-LAST:event_startMouseEntered

    private void startMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseExited
      start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/comenzar1.jpg")));        // TODO add your handling code here:
    }//GEN-LAST:event_startMouseExited

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked

    }//GEN-LAST:event_startMouseClicked

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
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        private Image inicio;
        
        @Override
        public void paint(Graphics g){
             inicio = new ImageIcon(getClass().getResource("/proyecto/imagenes/inicio.jpg")).getImage();
             g.drawImage(inicio, 0, 0, getWidth(), getHeight(), this);
             setOpaque(false);
             super.paint(g);
        }
    }
    
    
}
