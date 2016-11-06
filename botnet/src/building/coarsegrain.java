package building;

import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class coarsegrain extends javax.swing.JFrame {

    public static int summary[][]=clusterforamtion.summary;


    public Connection con;
    public ResultSet rs;
    public Statement st;
    int sumtime[]=new int[10];
    public static int newsummary[][]=new int[10][6];
    public static double initialtime=clusterforamtion.initialtime;
    public static double finaltime; 
    public static int k;
    public static int m[]=new int[10];
    
    public coarsegrain() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
            st = con.createStatement();
            System.out.println("connected to database");
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Coarse Grain Detection of bots");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 10, 630, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 50, 930, 10);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Legitimate Peer Evaluation", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peer Evaluation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(50, 160, 730, 260);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bot1.png"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 50, 150, 110);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Extract summaries");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(210, 90, 150, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Filter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(500, 90, 150, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(350, 440, 110, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 30, 810, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 60, 850, 520);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2111.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 930, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextArea1.append("\t\t\tSummary of clusters\n\n\n");
                       jTextArea1.append("\t\tcluster1 \t\t\t\t cluster2 \n\n");
                       jTextArea1.append("Node     Bytes_Sent   Bytes_received    Total active_time      Bytes_Sent    Bytes_received   Total active_time\n");
                       for(int i=0;i<10;i++)
                       {
                           jTextArea1.append(i+1+"\t"+ summary[i][0]+"\t"+summary[i][1]+"\t"+summary[i][2]+"\t\t"+summary[i][3]+"\t "+summary[i][4]+"\t"+summary[i][5]+"\n");
                       }
                                                       
                       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       finaltime=System.currentTimeMillis();
       double totaltime=(finaltime-initialtime)/60000;
       // System.out.println(totaltime);
       totaltime*=60;
       System.out.println("totaltime="+totaltime);
       for(int i=0;i<10;i++)
       {
           sumtime[i]=summary[i][2]+summary[i][5];
           System.out.println("sumtimes="+sumtime[i]+"\n");
            }
       k=0;
       for(int i=0;i<10;i++)
       {
           if((sumtime[i]/totaltime)>0.4)
           {
               System.out.println("division="+sumtime[i]/totaltime);
               for(int j=0;j<6;j++)
               {
               newsummary[k][j]=summary[i][j];
               System.out.println("newsumrty="+newsummary[k][j]);
               }
               System.out.println("\n");
               m[k]=i+1;
               k++;
               
           }
           
       
          
           }
       jTextArea1.setText("The remaining nodes with their clusters after filtering are ");
        jTextArea1.append("\n\t\tcluster1 \t\t\t\t cluster2 \n");
                       jTextArea1.append("Node     Bytes_Sent   Bytes_received    Total active_time      Bytes_Sent    Bytes_received   Total active_time\n");
                       for(int i=0;i<k;i++)
       {      
                                   
                         jTextArea1.append(m[i]+"\t"+ newsummary[i][0]+"\t"+newsummary[i][1]+"\t"+newsummary[i][2]+"\t\t"+newsummary[i][3]+"\t "+newsummary[i][4]+"\t"+newsummary[i][5]+"\n");
                       
           
           
       }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        distance dr = new distance();
        dr.setVisible(true);
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(coarsegrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coarsegrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coarsegrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coarsegrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coarsegrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
