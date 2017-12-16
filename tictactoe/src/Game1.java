
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Game1 extends javax.swing.JFrame {
    
    
    private String startgame = "X";
        private int xcnt = 0;
        private int ocnt = 0;
      
        

    @Override
    public void setBackground(Color bgColor) {
        super.setBackground(bgColor); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Creates new form Game1
     */
    public Game1() {
        initComponents();
        
    }

    public void GameScore(){
    
        jTextField1.setText(String.valueOf(xcnt));
        jTextField2.setText(String.valueOf(ocnt));
        
}
    
    private void chooseaplayer()
    {
        if(startgame.equalsIgnoreCase("X"))
            startgame="O";
        else 
            startgame="X";
    }
    
    private void win()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton15.getText();
        
        if(b1=="X" && b2=="X" && b3=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcnt++;
            GameScore();  
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
        }
        
        if(b4=="X" && b5=="X" && b6=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcnt++;
            GameScore();  
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
        }
        
        if(b7=="X" && b8=="X" && b9=="X")
        {
           JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcnt++;
            GameScore();  
            jButton7.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            jButton15.setBackground(Color.YELLOW);
        }
        
        if(b1=="X" && b4=="X" && b7=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcnt++;
            GameScore();  
            jButton1.setBackground(Color.YELLOW);
            jButton4.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
        }
        
        if(b2=="X" && b5=="X" && b8=="X")
        {
           JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcnt++;
            GameScore();  
            jButton2.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
        }
        
        if(b3=="X" && b6=="X" && b9=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcnt++;
            GameScore();  
            jButton3.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            jButton15.setBackground(Color.YELLOW);
        }
        
        if(b1=="X" && b5=="X" && b9=="X")
        {
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcnt++;
            GameScore();  
            jButton1.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton15.setBackground(Color.YELLOW);
        }
        
        if(b3=="X" && b5=="X" && b7=="X")
        {
           JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcnt++;
            GameScore();  
            jButton3.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
        }
        
                
        if(b1=="O" && b2=="O" && b3=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocnt++;
            GameScore();  
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
        }
        
        if(b4=="O" && b5=="O" && b6=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocnt++;
            GameScore();  
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
        }
        
        if(b7=="O" && b8=="O" && b9=="O")
        {
           JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocnt++;
            GameScore();  
            jButton7.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            jButton15.setBackground(Color.YELLOW);
        }
        
        if(b1=="O" && b4=="O" && b7=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocnt++;
            GameScore();  
            jButton1.setBackground(Color.YELLOW);
            jButton4.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
        }
        
        if(b2=="O" && b5=="O" && b8=="O")
        {
           JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocnt++;
            GameScore();  
            jButton2.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
        }
        
        if(b3=="O" && b6=="O" && b9=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocnt++;
            GameScore();  
            jButton3.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            jButton15.setBackground(Color.YELLOW);
        }
        
        if(b1=="O" && b5=="O" && b9=="O")
        {
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocnt++;
            GameScore();  
            jButton1.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton15.setBackground(Color.YELLOW);
        }
        
        if(b3=="O" && b5=="O" && b7=="O")
        {
           JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocnt++;
            GameScore();  
            jButton3.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
        }
 
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton9.setText("jButton9");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(51, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe.png"))); // NOI18N
        jLabel1.setText("Tic Tac Toe");

        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel10);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/player x.png"))); // NOI18N
        jLabel2.setText("Player X");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/player y.png"))); // NOI18N

        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Exit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game score.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        jButton1.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton1.setForeground(Color.PINK);
        }
            
            
        else {
            
            
            jButton1.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
        win();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton2.setForeground(Color.PINK);
        }
            
            
        else {
            
            
            jButton2.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
        win();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton3.setForeground(Color.PINK);
        }
            
            
        else {
            
            
            jButton3.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
        win();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton4.setForeground(Color.PINK);
        }
            
        else {
            
            
            jButton4.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
        win();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton5.setForeground(Color.PINK);
        }
            
            
        else {
            
            
            jButton5.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
         win();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jButton6.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton6.setForeground(Color.PINK);
        }
            
            
        else {
            
            
            jButton6.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
         win();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton7.setForeground(Color.PINK);
        }
            
            
        else {
            
            
            jButton7.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
         win();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton8.setForeground(Color.PINK);
        }
            
            
        else {
            
            
            jButton8.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
        win();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            
            jButton15.setForeground(Color.PINK);
        }
            
            
        else {
            
            
            jButton15.setForeground(Color.MAGENTA);
        
        }
        chooseaplayer();
         win();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       jButton1.setText(null);
       jButton2.setText(null);
       jButton3.setText(null);
       jButton4.setText(null);
       jButton5.setText(null);
       jButton6.setText(null);
       jButton7.setText(null);
       jButton8.setText(null);
       jButton15.setText(null);
       
       jButton1.setBackground(Color.LIGHT_GRAY);
       jButton2.setBackground(Color.LIGHT_GRAY);
       jButton3.setBackground(Color.LIGHT_GRAY);
       jButton4.setBackground(Color.LIGHT_GRAY);
       jButton5.setBackground(Color.LIGHT_GRAY);
       jButton6.setBackground(Color.LIGHT_GRAY);
       jButton7.setBackground(Color.LIGHT_GRAY);
       jButton8.setBackground(Color.LIGHT_GRAY);
       jButton15.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
