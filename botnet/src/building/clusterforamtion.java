
package building;
import java.sql.*;

public class clusterforamtion extends javax.swing.JFrame {
    
    public Connection con;
    public ResultSet rs;
    public Statement st;
    public static int summary[][]=new int[10][6];
    public static double initialtime=active_time.initialtime1;
    public clusterforamtion() {
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
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                   Cluster Formation");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 630, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 50, 930, 10);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Active_Time Evaluation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peer Response  Evaluation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 730, 290);

        jButton3.setText("211.114.23.14");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(620, 70, 110, 23);

        jButton6.setText("173.194.49.25");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(20, 70, 110, 23);

        jButton7.setText("157.156.37.18");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(470, 70, 110, 23);

        jButton8.setText("147.142.15.12");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);
        jButton8.setBounds(320, 70, 110, 23);

        jButton9.setText("82.221.129.17");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9);
        jButton9.setBounds(20, 110, 110, 23);

        jButton10.setText("138.111.14.2");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10);
        jButton10.setBounds(170, 110, 110, 23);

        jButton11.setText("58.26.185.34");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11);
        jButton11.setBounds(320, 110, 110, 23);

        jButton12.setText("65.55.175.254");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12);
        jButton12.setBounds(470, 110, 110, 23);

        jButton13.setText("201.178.124.56");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13);
        jButton13.setBounds(620, 110, 110, 23);

        jButton14.setText("123.23.139.88");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton14);
        jButton14.setBounds(170, 70, 110, 23);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(100, 40, 750, 440);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Process");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 480, 210, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/timestamp_icon.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, 370, 170, 160);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 60, 890, 530);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 50, 830, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 50, 830, 10);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(740, 0, 160, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2111.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 940, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
         coarsegrain pr=new coarsegrain();
         pr.setVisible(true);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 jTextArea1.append("Cluster I of Node 5\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table5 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {              
           
                             int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[4][0]+=p1;
                 summary[4][1]+=p2;
                 summary[4][2]+=p3;
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
                           
                        }
                       jTextArea1.append("\n\n________________________________________________________________________________\n");
                        
                       jTextArea1.append("\n        Summary of cluster is:\n \n");
                       jTextArea1.append("         Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("         "+summary[4][0]+"\t\t"+summary[4][1]+"\t\t"+summary[4][2]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\n\nCluster II of Node 5 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table5 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                            int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[4][3]+=p4;
                 summary[4][4]+=p5;
                 summary[4][5]+=p6;
                         
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
                              
                        }
                       jTextArea1.append("\n\n________________________________________________________________________________\n");
                        
                         jTextArea1.append("\n       Summary of cluster is: \n");
                       jTextArea1.append("\n         Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("         "+summary[4][3]+"\t\t"+summary[4][4]+"\t\t"+summary[4][5]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextArea1.append("Cluster I of Node 1 \n");
        try {
               Class.forName("com.mysql.jdbc.Driver");
                     Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table1 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {      
                              int p1=rs.getInt(3);
                              int p2=rs.getInt(4);
                              int p3=rs.getInt(6); 
               
                           summary[0][0]+=p1;
                           summary[0][1]+=p2;
                           summary[0][2]+=p3;
                      jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
                       }
                       
                       jTextArea1.append("\n\n________________________________________________________________________________\n");
                        jTextArea1.append("\n        Summary of cluster is: \n\n");
                       jTextArea1.append("         Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("         "+summary[0][0]+"\t\t"+summary[0][1]+"\t\t"+summary[0][2]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\n\nCluster II  of Node 1 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table1 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                         int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[0][3]+=p4;
                 summary[0][4]+=p5;
                 summary[0][5]+=p6;
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                       jTextArea1.append("\n\n________________________________________________________________________________\n");
                        
                     jTextArea1.append("\n         \nSummary of cluster is: \n");
                       jTextArea1.append("\n       Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("        "+summary[0][3]+"\t\t"+summary[0][4]+"\t\t"+summary[0][5]+"\n\n");
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 jTextArea1.append("\nCluster I of Node 4 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table4 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {   
                            int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[3][0]+=p1;
                 summary[3][1]+=p2;
                 summary[3][2]+=p3;
           
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                       jTextArea1.append("\n\n________________________________________________________________________________\n");
                        
                        jTextArea1.append("\n      Summary of cluster is: \n");
                       jTextArea1.append("\n       Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("       "+summary[3][0]+"\t\t"+summary[3][1]+"\t\t"+summary[3][2]+"\n\n");
         
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\n\nCluster II of Node 4 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table4 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                             int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[3][3]+=p4;
                 summary[3][4]+=p5;
                 summary[3][5]+=p6;
                         
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                       jTextArea1.append("\n\n________________________________________________________________________________\n");
                        
                         jTextArea1.append("\n      Summary of cluster is: \n");
                       jTextArea1.append("\n        Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("        "+summary[3][3]+"\t\t"+summary[3][4]+"\t\t"+summary[3][5]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextArea1.append("\nCluster I of Node 3 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table3 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {         
           
                             int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[2][0]+=p1;
                 summary[2][1]+=p2;
                 summary[2][2]+=p3;
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                         jTextArea1.append("\n        Summary of cluster is: \n");
                       jTextArea1.append("\n          Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("          "+summary[2][0]+"\t\t"+summary[2][1]+"\t\t"+summary[2][2]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\n\nCluster II of Node 3 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table3 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                      jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {            
                             int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[2][3]+=p4;
                 summary[2][4]+=p5;
                 summary[2][5]+=p6;
           
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                         jTextArea1.append("\n       Summary of cluster is \n");
                       jTextArea1.append("\n         Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("         "+summary[2][3]+"\t\t"+summary[2][4]+"\t\t"+summary[2][5]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 jTextArea1.append("\nCluster I of Node 6 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table6 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {    
                            int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[5][0]+=p1;
                 summary[5][1]+=p2;
                 summary[5][2]+=p3;
           
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                        jTextArea1.append("\n         Summary of cluster is \n");
                       jTextArea1.append("\n         Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("         "+summary[5][0]+"\t\t"+summary[5][1]+"\t\t"+summary[5][2]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\n\nCluster II of Node 6 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table6 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                             int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[5][3]+=p4;
                 summary[5][4]+=p5;
                 summary[5][5]+=p6;
                         
              jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                         jTextArea1.append("\n       Summary of cluster is \n");
                       jTextArea1.append("\n         Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("         "+summary[5][3]+"\t\t"+summary[5][4]+"\t\t"+summary[5][5]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 jTextArea1.append("\nCluster I of Node 7 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table7 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                        jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {             
                            int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[6][0]+=p1;
                 summary[6][1]+=p2;
                 summary[6][2]+=p3;
           
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                        jTextArea1.append("\n      Summary of cluster is \n");
                       jTextArea1.append("\n       Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("       "+summary[6][0]+"\t\t"+summary[6][1]+"\t\t"+summary[6][2]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\nCluster II of Node 7 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table7 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                          int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[6][3]+=p4;
                 summary[6][4]+=p5;
                 summary[6][5]+=p6;
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                         jTextArea1.append("\n      Summary of cluster is \n");
                       jTextArea1.append("\n        Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("        "+summary[6][3]+"\t\t"+summary[6][4]+"\t\t"+summary[6][5]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 jTextArea1.append("\nCluster II of Node8 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table8 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {            
                            int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[7][0]+=p1;
                 summary[7][1]+=p2;
                 summary[7][2]+=p3;
           
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                        jTextArea1.append("\n      Summary of cluster is: \n");
                       jTextArea1.append("\n       Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("       "+summary[7][0]+"\t\t"+summary[7][1]+"\t\t"+summary[7][2]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\nCluster II of Node8 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table8 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                      jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                             int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[7][3]+=p4;
                 summary[7][4]+=p5;
                 summary[7][5]+=p6;
                         
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                         jTextArea1.append("\n         Summary of cluster is \n");
                       jTextArea1.append("\n           Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("           "+summary[7][3]+"\t\t"+summary[7][4]+"\t\t"+summary[7][5]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
 jTextArea1.append("\nCluster I  of Node 9 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table9 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                      jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {             
                            int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[8][0]+=p1;
                 summary[8][1]+=p2;
                 summary[8][2]+=p3;
           
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                        jTextArea1.append("\n       Summary of cluster is \n");
                       jTextArea1.append("\n        Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("        "+summary[8][0]+"\t\t"+summary[8][1]+"\t\t"+summary[8][2]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\nCluster II of Node9 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table9 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                      jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                             int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[8][3]+=p4;
                 summary[8][4]+=p5;
                 summary[8][5]+=p6;
                         
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                         jTextArea1.append("\n      Summary of cluster is \n");
                       jTextArea1.append("\n        Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("        "+summary[8][3]+"\t\t"+summary[8][4]+"\t\t"+summary[8][5]+"\n\n");
                        
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 jTextArea1.append("\nCluster I of Node 10 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table10 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {      
                            int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[9][0]+=p1;
                 summary[9][1]+=p2;
                 summary[9][2]+=p3;
           
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                        jTextArea1.append("\n       Summary of cluster is: \n");
                       jTextArea1.append("\n        Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("        "+summary[9][0]+"\t\t"+summary[9][1]+"\t\t"+summary[9][2]+"\n\n");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\nCluster II of Node 10 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table10 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                      jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                             int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[9][3]+=p4;
                 summary[9][4]+=p5;
                 summary[9][5]+=p6;
                         
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                         jTextArea1.append("\n      Summary of cluster is: \n");
                       jTextArea1.append("\n        Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("        "+summary[9][3]+"\t\t"+summary[9][4]+"\t\t"+summary[9][5]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
 jTextArea1.append("\nCluster I of Node 2 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table2 where prototype='tcp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.setText("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {              
                            int p1=rs.getInt(3);
                int p2=rs.getInt(4);
                 int p3=rs.getInt(6); 
               
                 summary[1][0]+=p1;
                 summary[1][1]+=p2;
                 summary[1][2]+=p3;
           
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                        jTextArea1.append("\n       Summary of cluster is \n");
                       jTextArea1.append("\n        Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("        "+summary[1][0]+"\t\t"+summary[1][1]+"\t\t"+summary[1][2]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    jTextArea1.append("\nCluster II of Node 2 \n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
                        String insrt="Select * from table2 where prototype='udp'";
                       rs=st.executeQuery(insrt);
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       jTextArea1.append("Sourcenode \t\t Destination node    byteSize_sent        byteSize_received\tactive_time\tprototype\n");
                       jTextArea1.append("**************************************************************************************************************************************************\n");
                       while (rs.next()) {
                          int p4=rs.getInt(3);
                int p5=rs.getInt(4);
                 int p6=rs.getInt(6); 
               
                 summary[1][3]+=p4;
                 summary[1][4]+=p5;
                 summary[1][5]+=p6;
               jTextArea1.append(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"  \t"+rs.getString(5)+"\n");
               
               
                        }
                        jTextArea1.append("\n\n________________________________________________________________________________\n");
                         jTextArea1.append("\n       Summary of cluster is: \n\n");
                       jTextArea1.append("\n         Totalsent \t totalrecieved \t totaltime\n");
                       jTextArea1.append("         "+summary[1][3]+"\t\t"+summary[1][4]+"\t\t"+summary[1][5]+"\n\n");
          //  System.out.println("connected to database");
                    
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(clusterforamtion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clusterforamtion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clusterforamtion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clusterforamtion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clusterforamtion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
