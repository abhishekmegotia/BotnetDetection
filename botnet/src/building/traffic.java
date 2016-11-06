package building;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
//import java.net.InetAddress;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class traffic extends javax.swing.JFrame implements Runnable {
 Thread t;
    public static ArrayList<Integer> ar1 = end.ar1;
    public static ArrayList<Integer> ar2 = end.ar2;
    public Connection con;
    public ResultSet rs;
    public Statement st,st1;
    public static int n = end.n;
    public static ArrayList<String> sip = new ArrayList<String>();
    public static ArrayList<String> ipa = new ArrayList<String>();
     public static ArrayList<String> hna = new ArrayList<String>();
    public static Timer timer;
    static int interval = 30, i = 0;

    public traffic() {
        initComponents();
        try {
              jLabel5.setVisible(false);
         
//                  UIManager.put("OptionPane.background", Color.WHITE);
//            UIManager.put("Panel.background", Color.white);
//            UIManager.put("Button.background", Color.white);
//            UIManager.setLookAndFeel(new com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel());
            jLabel5.setVisible(false);
       
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
            st = con.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS routingtable");
            st.executeUpdate("CREATE TABLE `routingtable` (`Host` VARCHAR( 500 ) NOT NULL ,`Ip` VARCHAR( 500 ) NULL  )");

            System.out.println("connected to database");
            BufferedReader br = new BufferedReader(new FileReader(".//routingtable.txt"));
            String rd = null;
            while ((rd = br.readLine()) != null) {

                StringTokenizer stt = new StringTokenizer(rd, ",");
                while (stt.hasMoreTokens()) {
                    String s1 = stt.nextToken();
                    String s2 = stt.nextToken();
//                    System.out.println("ip=" + s2);
                    String insrt = "insert into `routingtable` values('" + s1 + "','" + s2 + "')";
                    st.executeUpdate(insrt);

                }
            }
            
             st1 = con.createStatement();
            st1.executeUpdate("DROP TABLE IF EXISTS hostip");
            st1.executeUpdate("CREATE TABLE `hostip` (`Host` VARCHAR( 500 ) NOT NULL ,`Ip` VARCHAR( 500 ) NULL  )");

            System.out.println("connected to database");
            BufferedReader br1 = new BufferedReader(new FileReader(".//hostip.txt"));
            String rd1 = null;
            while ((rd1 = br1.readLine()) != null) {

                StringTokenizer stt1 = new StringTokenizer(rd1, ",");
                while (stt1.hasMoreTokens()) {
                    String s3 = stt1.nextToken();
                    String s4 = stt1.nextToken();
//                    System.out.println("ip=" + s2);
                    String innsrt = "insert into `hostip` values('" + s3 + "','" + s4 + "')";
                    st1.executeUpdate(innsrt);

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 650));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Host Name Retreival");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 480, 220, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Apply DNS Conflict");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(430, 480, 220, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Packet Transmission", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(50, 60, 650, 320);
        jPanel3.add(jProgressBar1);
        jProgressBar1.setBounds(10, 390, 730, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 40, 760, 420);
        jPanel3.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         Network traffic Filtering");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 10, 390, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/progressbar1.gif"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(750, 440, 100, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(25, 49, 850, 540);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(740, 0, 160, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2111.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 920, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
         
             JOptionPane.showMessageDialog(null, "Please wait. Extracting DNS");
            UIManager.put("ProgressBar.selectionForeground", Color.blue);
            UIManager.put("ProgressBar.selectionBackground", Color.blue);
            jProgressBar1.setForeground(Color.BLUE);
            int y = 1;
            Random r = new Random();
           // n =20;
            n=10;
            jTextArea2.append("     ************************************************************************   \n");
            jTextArea2.append("\tPeer_ID\t\t\tHOST_NAME\n");
            jTextArea2.append("     ************************************************************************   \n");
            //rs = st.executeQuery("select Host,Ip from routingtable order by Host");
            rs = st.executeQuery("select Host from routingtable order by Host");
            while (rs.next()) {
               String hn = rs.getString(1);
               // String p_ip = rs.getString(2);
//             
                //    InetAddress in = InetAddress.getByName(hn);
                  //  String p_ip = in.getHostAddress();
                    //if(p_ip==null)
                    ///{
                       // JOptionPane.showMessageDialog(null, "Check your Internet connection");
                    //}
                    //else
                    //{
//                    int index = hn.indexOf("://");
          ///ipa.add(p_ip);
               jTextArea2.append("\t   "+y + "\t\t\t" + hn + "\n\n");
               y++;
                //System.out.println("url=" + hn + "\t ip=" + p_ip + "\t" + hn);
            }
           // }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        long time1 = 10;
        System.out.print("Input seconds => : ");
        String secs = String.valueOf(time1);
        int delay = 100;
        int period = 100;

        timer = new Timer();
        interval = Integer.parseInt(secs);
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval());
                try {

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                i = i + 30;

                jProgressBar1.setValue(i+10);
            }

        }, delay, period);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        filter ft = new filter();
//        ft.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Configuring DNS traffic filter. Please wait ");
//          jLabel5.setVisible(true);
        new Thread(this).start();
         long time1 = 5;
        System.out.print("Input seconds => : ");
        String secs = String.valueOf(time1);
        int delay = 100;
        int period = 100;

        timer = new Timer();
        interval = Integer.parseInt(secs);
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval1());
                try {

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                i = i + 1;

//                jProgressBar1.setValue(i);
            }

        }, delay, period);

      
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(traffic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(traffic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(traffic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(traffic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new traffic().setVisible(true);
            }
        });
    }

    private static int setInterval() {
        // if()
        if (interval > 100) {
            //   get = timeinminutes;

            timer.cancel();

        } else if (interval == (0)) {
            timer.cancel();
            JOptionPane.showMessageDialog(null, "Each and every peer Host address Retreived");

        }
        return --interval;
    }
    private static int setInterval1() {
        // if()
        if (interval > 100) {
            //   get = timeinminutes;

            timer.cancel();

        } else if (interval == (0)) {
            timer.cancel();
           
   filtertool ft1 = new filtertool();
        ft1.setVisible(true);
        }
        return --interval;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
 public void run() {
        try {
            Thread.sleep(1000);
            jLabel5.setVisible(false);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
