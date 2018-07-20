package impossible;

import java.awt.Color;

/**
 *
 * @author Ashrumochan
 */
public class end extends javax.swing.JFrame {

   static int sc; 
   static String us;
    /**
     * Creates new form end
     */
	public end() {
		initComponents();
		s1.setText("score::" + sc);
		s2.setText("CONGRATS!!! " + us);
	}


    @SuppressWarnings("unchecked")                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        s2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        System.out.println(Color.ORANGE);
        getContentPane().setBackground(Color.CYAN);

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 30)); // NOI18N
        jLabel1.setText("You Scored out "+sc+" of 5");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        s1.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setText("Score");
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 162, 191, -1));

        jButton1.setText("Play Again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 94, -1, -1));

        jButton2.setText("exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 94, 83, -1));

        s2.setFont(new java.awt.Font("DotumChe", 3, 18)); // NOI18N
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setText("User");
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 92, 232, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gautham\\Downloads\\Quotefancy-17167-3840x2160.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 310));

        pack();
    }                        

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
		login l = new login();
		l.start();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0); // TODO add your handling code here:
	}

    /**
     * @param args the command line arguments
     */
    public  void ending(int score,String user) {
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
			java.util.logging.Logger.getLogger(end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		sc = score;
		us = user;
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new end().setVisible(true);

			}
		});
    }
    
   
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    // End of variables declaration                   

    
}