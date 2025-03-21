package org.shadowx.tictactoe.swing.ui.board;

import org.shadowx.tictactoe.swing.ui.menu.MainMenu;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author arpan
 */
public class BoardUI extends javax.swing.JFrame {
    
    private enum Mark {
        BLANK, X_MARK, O_MARK
    } 
    
    private final JLabel[][] gridCells;
    private final int N = 3;

    /**
     * Creates new form BoardUI
     */
    public BoardUI() {
        initComponents();
        
        this.gridCells = new JLabel[][] {
            {cell1, cell2, cell3},
            {cell4, cell5, cell6},
            {cell7, cell8, cell9}
        };
        
        initCellClickHandler();
        resetBoard();
        
        setStatus("Player X, it's your turn ...");
        resetBtn.requestFocusInWindow();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                goBackToMainMenu();
            }
        });
    }

    private void goBackToMainMenu() {
        setVisible(false);

        MainMenu.getInstance().setVisible(true);
    }
    
    private void setStatus(String message) {
        statusLbl.setText(message);
    }

    public void updateCell(int row, int col, Mark mark) {
        JLabel cell = this.gridCells[row][col];
        switch (mark) {
            case X_MARK -> {
                // Player X has put his mark
                cell.setText("X");
                cell.setForeground(Color.BLUE);
            }
                
            case O_MARK -> {
                // Player O has put his mark
                cell.setText("O");
                cell.setForeground(Color.RED);
            }
                
            default -> {
                // Make it Blank
                cell.setText(" ");
                cell.setForeground(Color.WHITE);
            }
        }
    }
    
    private void resetBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                updateCell(i, j, Mark.BLANK);
            }
        }
    }
    
    private void cellClicked(int row, int col) {
        updateCell(row, col, (row + col) % 2 == 0 ? Mark.X_MARK : Mark.O_MARK);
    }
    
    private void initCellClickHandler() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                final int row = i, col = j;
                this.gridCells[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        cellClicked(row, col);
                    }
                });
            }
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

        titleLabel = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        cellsGrid = new javax.swing.JPanel();
        cell1 = new javax.swing.JLabel();
        cell2 = new javax.swing.JLabel();
        cell3 = new javax.swing.JLabel();
        cell4 = new javax.swing.JLabel();
        cell5 = new javax.swing.JLabel();
        cell6 = new javax.swing.JLabel();
        cell7 = new javax.swing.JLabel();
        cell8 = new javax.swing.JLabel();
        cell9 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tic-Tac-Toe");
        setLocationByPlatform(true);
        setName("BoardUI"); // NOI18N
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Tic-Tac-Toe");

        statusLbl.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        statusLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLbl.setText("Player X Wons ... ");

        cellsGrid.setLayout(new java.awt.GridLayout(3, 3, 5, 5));

        cell1.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell1.setForeground(new java.awt.Color(102, 102, 255));
        cell1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell1.setText("X");
        cell1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell1.setMinimumSize(new java.awt.Dimension(31, 56));
        cell1.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell1);

        cell2.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell2.setForeground(new java.awt.Color(102, 102, 255));
        cell2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell2.setText("X");
        cell2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell2.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell2);

        cell3.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell3.setForeground(new java.awt.Color(102, 102, 255));
        cell3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell3.setText("X");
        cell3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell3.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell3);

        cell4.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell4.setForeground(new java.awt.Color(102, 102, 255));
        cell4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell4.setText("X");
        cell4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell4.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell4);

        cell5.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell5.setForeground(new java.awt.Color(102, 102, 255));
        cell5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell5.setText("X");
        cell5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell5.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell5);

        cell6.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell6.setForeground(new java.awt.Color(102, 102, 255));
        cell6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell6.setText("X");
        cell6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell6.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell6);

        cell7.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell7.setForeground(new java.awt.Color(102, 102, 255));
        cell7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell7.setText("X");
        cell7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell7.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell7);

        cell8.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell8.setForeground(new java.awt.Color(102, 102, 255));
        cell8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell8.setText("X");
        cell8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell8.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell8);

        cell9.setFont(new java.awt.Font("Ubuntu Sans", 0, 60)); // NOI18N
        cell9.setForeground(new java.awt.Color(102, 102, 255));
        cell9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cell9.setText("X");
        cell9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cell9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cell9.setPreferredSize(new java.awt.Dimension(70, 70));
        cellsGrid.add(cell9);

        resetBtn.setFont(new java.awt.Font("Liberation Mono", 0, 24)); // NOI18N
        resetBtn.setText("Undo");
        resetBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resetBtn.setContentAreaFilled(false);
        resetBtn.setFocusable(false);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        quitBtn.setFont(new java.awt.Font("Liberation Mono", 0, 24)); // NOI18N
        quitBtn.setText("Back");
        quitBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        quitBtn.setContentAreaFilled(false);
        quitBtn.setFocusable(false);
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cellsGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusLbl)
                .addGap(19, 19, 19)
                .addComponent(cellsGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to reset the game?", "Reset Game", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            resetBoard();
        }
    }//GEN-LAST:event_resetBtnActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        goBackToMainMenu();
    }//GEN-LAST:event_quitBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cell1;
    private javax.swing.JLabel cell2;
    private javax.swing.JLabel cell3;
    private javax.swing.JLabel cell4;
    private javax.swing.JLabel cell5;
    private javax.swing.JLabel cell6;
    private javax.swing.JLabel cell7;
    private javax.swing.JLabel cell8;
    private javax.swing.JLabel cell9;
    private javax.swing.JPanel cellsGrid;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
