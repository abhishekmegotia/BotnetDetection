
package building;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
public class results extends javax.swing.JFrame {
   public Connection con;
    public ResultSet rs;
    public Statement st;
    int bot[]=new int[10];
    int leg[]=new int[10];
    public static int m[]=distance.m;
      
 public static int k=distance.k;
 public static double dist[][]=distance.dist;
 public static int flag[]=new int[k];
 int l=0,n=0;
 String a[]=new String[10];
 String b[]=new String[10];
 
 
    
     
    public results() {
        initComponents();
        try{
        //UIManager.setLookAndFeel(new com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel());
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
            st = con.createStatement();
  
            System.out.println("connected to database");
            a[0]="bittorrent";
            a[1]="limewire";
            a[2]="shareaza";
            a[3]="torrentz";
            a[4]="bearshare";
            a[5]="aresgalaxy";
            a[6]="piolet";
            a[7]="zeropaid";
            a[8]="blogsdna";
            a[9]="overnet";
            
            b[0]="173.194.49.25";
            b[1]="123.23.139.88";
            b[2]="147.142.15.12";
            b[3]="157.156.37.18";
            b[4]="211.114.23.14";
            b[5]="82.221.129.17";
            b[6]="138.111.14.2";
            b[7]="58.26.185.34";
            b[8]="65.55.175.254";
            b[9]="201.178.124.56";
            for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(i==j)
                    dist[i][j]=999;
            }
        }
        
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                dist[j][i]=dist[i][j];
            }
        }
        for(int i=0;i<k;i++)
        {
            flag[i]=0;
        }
        
         for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(dist[i][j]<0.4)
                {
                    flag[i]=1;break;
                }
        
        
            }
        }
         for(int i=0;i<k;i++)
         {
             if(flag[i]==1)
             {
                 bot[l++]=m[i];
             }
             else
             {
                 leg[n++]=m[i];
             }
         }
           
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                       Results");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 630, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 50, 830, 10);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(56, 110, 600, 340);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 80, 700, 520);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Bots");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 240, 140, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Legitimate clients");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 360, 140, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setText("Process");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(750, 500, 140, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(740, 0, 160, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2111.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 940, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
         
        jTextArea1.append("***********************************************Bots*********************************************\n");
        jTextArea1.append("Node Number \tPeer Name \t\t Peer IP\n" );
        for(int i=0;i<l;i++)
        jTextArea1.append("Node "+bot[i]+" \t\t"+a[bot[i]-1]+" \t\t"+b[bot[i]-1]+"\n");
       
        
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        jTextArea1.append("*********************************************Legitimate clients*********************************************\n");

        jTextArea1.append("Node Number \tPeer Name \t\t Peer IP\n" );
        for(int i=0;i<n;i++)
        jTextArea1.append("Node "+leg[i]+" \t\t"+a[leg[i]-1]+" \t\t"+b[leg[i]-1]+"\n");
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
               end ps=new end();
               ps.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
