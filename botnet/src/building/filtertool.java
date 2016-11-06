
package building;
import java.sql.*;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class filtertool extends javax.swing.JFrame {
    Statement str = null;
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public static int n = traffic.n;
    //public static ArrayList<String> ip = new ArrayList<String>();
    //public static ArrayList<String> host = new ArrayList<String>();
    ArrayList<String> hi = new ArrayList<String>();
    public static ArrayList<Integer> ar1 = traffic.ar1;
    public static ArrayList<Integer> ar2 = traffic.ar2;
    public static ArrayList<String> ip1 = new ArrayList<String>();
    public static ArrayList<String> host1 = new ArrayList<String>();
    public filtertool() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
            st = con.createStatement();
           
            st = con.createStatement();
               st.executeUpdate("DROP TABLE IF EXISTS conflict");
            st.executeUpdate("CREATE TABLE `conflict` (`Host` VARCHAR( 500 ) NOT NULL ,`Ip` VARCHAR( 500 ) NOT NULL  )");
            
            jTabbedPane1.add("Introduction", jPanel1);
            jTabbedPane1.add("DNS Filter", jPanel4);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("DNS TRAFFIC FILTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 210, 20));

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(240, 240, 240), null, null));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("Next");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(600, 360, 80, 30);

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton8.setText("Extract IP");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);
        jButton8.setBounds(430, 40, 90, 30);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator6);
        jSeparator6.setBounds(400, 0, 10, 400);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(410, 150, 260, 200);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Filtered IP");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(510, 110, 70, 20);

        jButton34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton34.setText("Result");
        jButton34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton34);
        jButton34.setBounds(510, 360, 80, 30);

        jButton39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton39.setText("DNS Conflict");
        jButton39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton39);
        jButton39.setBounds(550, 40, 100, 30);

        jButton36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton36.setText("Back");
        jButton36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton36);
        jButton36.setBounds(420, 360, 80, 30);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 0, 380, 380);

        jTabbedPane1.addTab("Name", jPanel4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 340, 80, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Next");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(270, 340, 80, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("DNS FILTER ANALYZING STEPS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 20, 270, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("First the Peer Host names will be evaluated");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 70, 550, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("After Extracting Host Names, the DNS Filter will be processed");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 100, 390, 20);

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox1.setText("Continue, this Wizard Click Next");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(200, 260, 220, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 288, 700, 0);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(70, 340, 80, 30);

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel94.setText("Next we check if the IP addresses are available for the host names ");
        jPanel1.add(jLabel94);
        jLabel94.setBounds(80, 130, 390, 20);

        jLabel95.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel95.setText("in the routing table.");
        jPanel1.add(jLabel95);
        jLabel95.setBounds(80, 160, 280, 20);

        jLabel96.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel96.setText("Else if we need to resolve their DNS names, then such clients are filtered.");
        jPanel1.add(jLabel96);
        jLabel96.setBounds(80, 220, 420, 20);

        jLabel97.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel97.setText("4)");
        jPanel1.add(jLabel97);
        jLabel97.setBounds(40, 190, 20, 20);

        jLabel98.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel98.setText("1)");
        jPanel1.add(jLabel98);
        jLabel98.setBounds(40, 70, 20, 20);

        jLabel99.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel99.setText("2)");
        jPanel1.add(jLabel99);
        jLabel99.setBounds(40, 100, 20, 20);

        jLabel100.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel100.setText("3)");
        jPanel1.add(jLabel100);
        jLabel100.setBounds(40, 130, 20, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(460, 0, 200, 210);

        jLabel101.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel101.setText("If they are available then we map the address with the host name.");
        jPanel1.add(jLabel101);
        jLabel101.setBounds(80, 190, 440, 30);

        jTabbedPane1.addTab("Introduction", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jCheckBox1.isSelected()) {
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       filteredpeer fp = new filteredpeer();
            fp.setVisible(true);
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
           
 int y = 1;


                    rs = st.executeQuery("select * from routingtable ");
                    File file = new File(".//conflict.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
 
            while (rs.next()) {
                String hn = rs.getString(1);
                String p_ip = rs.getString(2);
                int index = hn.indexOf("://");
                if (index != -1) {
                    hn = hn.substring(index + 3);
                }
                index = p_ip.indexOf('/');

                if (index != -1) {
                    hn = hn.substring(0, index);
                }
                hn = hn.replaceFirst("^www.*?\\.", "");
                jTextArea2.append(y+"\t" + hn + "\t\t" + p_ip + "\n\n");
                
                y++;
                
                int c = p_ip.indexOf("NULL");
                if(c!=-1)
                {
                   bw.write(hn);
                   bw.write(",");
                   bw.write(p_ip);
                   bw.write("\n");
                }
                
            }
JOptionPane.showMessageDialog(null,"DNS Filtered successfully");
       bw.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed
/**/
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
         try {
  BufferedReader br1 = new BufferedReader(new FileReader(".//conflict.txt"));
            String rd1 = null;
            while ((rd1 = br1.readLine()) != null) {

                StringTokenizer stt1 = new StringTokenizer(rd1, ",");
                while (stt1.hasMoreTokens()) {
                    String s3 = stt1.nextToken();
                    String s4 = stt1.nextToken();
                    String innsrt = "insert into `conflict` values('" + s3 + "','" + s4 + "')";
                    st.executeUpdate(innsrt);

                }
            }
           
            int y=1;
            
            rs = st.executeQuery("select Host,Ip from conflict ");
            while (rs.next()) {
                String hn = rs.getString(1);
                jTextArea1.append(y+"\t"+hn+"\n\n")   ;
                y++;
            }
                
            //for (int x = 0; x < ar1.size(); x++) {
              //  String insrt = "insert into `hp` values('" + x + "','" + ar1.get(x) + "','" + ar2.get(x) + "','" + host1.get(x) + "','" + ip1.get(x) + "')";

               // st.executeUpdate(insrt);
                 //System.out.println("ar1:"+ar1.get(x)+"ar2:"+ar2.get(x)+"\n\n");
                
            //}
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
         try {
           /* int y = 1;
            BufferedWriter bw = new BufferedWriter(new FileWriter(".//dnsresolving.txt"));
            Random r1 = new Random();

            rs = st.executeQuery("select * from hostip limit " + n + "");
            while (rs.next()) {

                String hn = rs.getString(1);
                String p_ip = rs.getString(2);
                ip.add(p_ip);
                host.add(hn);
                String a = hn.substring(hn.lastIndexOf(".") + 1);
                System.out.println("a=" + a);

                y++;
                System.out.println("url=" + hn + "\t ip=====" + p_ip + "\t" + a);

            }
            System.out.println(ip.size());
            for (int r = 0; r < host.size(); r++) {
                int e = r1.nextInt(30);
                if (e <= 5) {
                    System.out.println("ip=" + ip.get(r) + "\t" + e);
                    ip.add(ip.get(r));
                    bw.write(ip.get(r));
                    bw.write("\n");
                    hi.add(ip.get(e));
                }
            }
            bw.close();
            System.out.println(ip.size());
            */JOptionPane.showMessageDialog(null, "DNS Resolving IP Evaluated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
         try {
            jTabbedPane1.setSelectedIndex(1);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton36ActionPerformed

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
            java.util.logging.Logger.getLogger(filtertool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(filtertool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(filtertool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(filtertool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filtertool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
