
package building;
//import java.awt.Color;
import java.awt.ComponentOrientation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class distance extends javax.swing.JFrame {
   public Connection con;
    public ResultSet rs,rs1;
    public Statement st,st1;
    double dbytes[][][]=new double[10][10][4];
    double minimum[][]=new double[10][10];
    double maximum[][]=new double[10][10];
    public static double dist[][]=new double[10][10];
     double d[][][]=new double[10][10][4];  
     double dips;
     
    public static int ns[][]=coarsegrain.newsummary;
   public static int m[]=coarsegrain.m;
    
    
 public static int k=coarsegrain.k;
    public static ArrayList<String> nodelist = new ArrayList();
    public distance() {
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
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("distance");
        setMinimumSize(new java.awt.Dimension(930, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                Fine Grained Detection of P2P bots");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 630, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 50, 900, 10);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Euclidean Distance Evaluation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Process");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(610, 330, 170, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Show Distance Values");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(610, 210, 170, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jDesktopPane1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 20, 570, 410);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.setText("Calculate DBytes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton4);
        jButton4.setBounds(610, 70, 160, 40);

        jPanel2.add(jDesktopPane1);
        jDesktopPane1.setBounds(20, 60, 800, 450);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Distance Evaluation Process");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(230, 20, 240, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 60, 830, 520);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(750, 10, 150, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2111.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 920, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.setText("Distances between each pair of nodes are \n\n");
        jTextArea1.append("Source \t Destination \t Distance\n");
        for(int i=0;i<k;i++)
       {
           for(int j=i+1;j<k;j++)
           {
                        for(int l=0;l<4;l++)
               {
                   dips=(Math.random() * (1 - 0.5)) + 0.5;

                   System.out.println("dips is"+dips);
                   d[i][j][l]=(0.3*((dbytes[i][j][l]-minimum[i][j])/(maximum[i][j]-minimum[i][j])))+(0.7*dips);
                   System.out.println("dbytes[i][j][l]"+dbytes[i][j][l]+"d value"+d[i][j][l]);
                   System.out.println("min[i][j]"+minimum[i][j]);
               }
               dist[i][j]=Math.min(d[i][j][0],d[i][j][1]);
                dist[i][j]=Math.min(dist[i][j],d[i][j][2]);
                 dist[i][j]=Math.min(dist[i][j],d[i][j][3]);
                 System.out.println("i="+i+"j="+j+"dist="+dist[i][j]);
                 
                  
                  jTextArea1.append("Node"+m[i]+"\t"+"Node"+m[j]+"\t"+dist[i][j]+"\n");
                  
           }
           jTextArea1.append("\n\n");
       }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      results cl=new results();
       cl.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       for(int i=0;i<k;i++)
       {
           for(int j=i+1;j<k;j++)
           {
               jTextArea1.append("The distance between each cluster of Node "+m[i]+" and Node "+m[j]+" is\n\n\n");
               dbytes[i][j][0]=Math.sqrt(((ns[i][0]-ns[j][0])*(ns[i][0]-ns[j][0]))+((ns[i][1]-ns[j][1])*(ns[i][1]-ns[j][1])));
               jTextArea1.append("Between cluster 1 of Node "+m[i]+" and cluster 1 of Node "+m[j]+" is "+dbytes[i][j][0]+"\n");
               dbytes[i][j][1]=Math.sqrt(((ns[i][0]-ns[j][3])*(ns[i][0]-ns[j][3]))+((ns[i][1]-ns[j][4])*(ns[i][1]-ns[j][4])));
               jTextArea1.append("Between cluster 1 of Node "+m[i]+" and cluster 2 of Node "+m[j]+" is "+dbytes[i][j][1]+"\n");
               dbytes[i][j][2]=Math.sqrt(((ns[i][3]-ns[j][0])*(ns[i][3]-ns[j][0]))+((ns[i][4]-ns[j][1])*(ns[i][4]-ns[j][1])));
               jTextArea1.append("Between cluster 2 of Node "+m[i]+" and cluster 1 of Node "+m[j]+" is "+dbytes[i][j][2]+"\n");
               dbytes[i][j][3]=Math.sqrt(((ns[i][3]-ns[j][3])*(ns[i][3]-ns[j][3]))+((ns[i][4]-ns[j][4])*(ns[i][4]-ns[j][4])));
               jTextArea1.append("Between cluster 2 of Node "+m[i]+" and cluster 2 of Node "+m[j]+" is "+dbytes[i][j][3]+"\n\n\n");
               minimum[i][j]=Math.min(dbytes[i][j][0],dbytes[i][j][1]);
               minimum[i][j]=Math.min(minimum[i][j],dbytes[i][j][2]);
               minimum[i][j]=Math.min(minimum[i][j],dbytes[i][j][3]);
               maximum[i][j]=Math.max(dbytes[i][j][0],dbytes[i][j][1]);
               maximum[i][j]=Math.max(maximum[i][j],dbytes[i][j][2]);
               maximum[i][j]=Math.max(maximum[i][j],dbytes[i][j][3]);
               
           }
       }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(distance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(distance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(distance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(distance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new distance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
