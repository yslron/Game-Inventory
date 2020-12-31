/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



/**
 *
 * @author yslron
 * Game Inventory v0.1
 * 12/31/20
 */
public class Inventory_View extends javax.swing.JFrame {

    private int mouseX, mouseY;
    private int rounded = 10;
    String[] items = new String[]{"Common", "Uncommon", "Rare", "Very Rare", "Legendary", "Exotic"};
    private double initValue = 0.0;
    private String total = Double.toString(initValue);

    /**
     * Creates new form Inventory_View
     */
    public Inventory_View() {

        setUndecorated(true);

        initComponents();

        JTableHeader Theader = jTable2.getTableHeader();
        this.setLocationRelativeTo(null);
        jButton1.setBorderPainted(false);
        jButton2.setBorderPainted(false);
        jScrollPane2.getViewport().getView().setEnabled(true);
        jButton1.setBorder(BorderFactory.createEmptyBorder());
        jButton2.setBorder(BorderFactory.createEmptyBorder());
        jTextField1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextField2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jTextField3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jComboBox2.setBackground(new Color(211, 211, 211));
        jTable2.getTableHeader().setReorderingAllowed(false);
        Theader.setForeground(new Color(26, 35, 48));
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        jComboBox2.setRenderer(new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (index == 0) {
                    c.setForeground(new Color(242, 242, 242));
                    c.setBackground(new Color(26, 35, 48));
                    if (isSelected) {
                        c.setBackground(new Color(49, 62, 80));

                    } else {
                        c.setForeground(new Color(242, 242, 242));
                    }
                }
                if (index == 1) {
                    c.setForeground(new Color(101, 150, 226));
                    c.setBackground(new Color(26, 35, 48));
                    if (isSelected) {
                        c.setBackground(new Color(49, 62, 80));
                    } else {
                        c.setForeground(new Color(101, 150, 226));
                    }
                }
                if (index == 2) {
                    c.setForeground(new Color(77, 105, 205));
                    c.setBackground(new Color(26, 35, 48));
                    if (isSelected) {
                        c.setBackground(new Color(49, 62, 80));
                    }
                }
                if (index == 3) {
                    c.setForeground(new Color(137, 71, 255));
                    c.setBackground(new Color(26, 35, 48));
                    if (isSelected) {
                        c.setBackground(new Color(49, 62, 80));
                    }
                }
                if (index == 4) {
                    c.setForeground(new Color(212, 43, 230));
                    c.setBackground(new Color(26, 35, 48));
                    if (isSelected) {
                        c.setBackground(new Color(49, 62, 80));
                    }
                }
                if (index == 5) {
                    c.setForeground(new Color(235, 75, 75));
                    c.setBackground(new Color(26, 35, 48));
                    if (isSelected) {
                        c.setBackground(new Color(49, 62, 80));
                    }
                }

                return c;
            }
        });
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jLabel1.setVerticalAlignment(SwingConstants.CENTER);
        jTextField_Total.setEditable(false);
        jTable2.setDefaultEditor(Object.class, null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(20,new Color(36,48,68));
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new RoundJTextField(rounded);
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new RoundJTextField(rounded);
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new RoundJTextField(rounded);
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Total = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(41, 55, 76));
        jPanel5.setPreferredSize(new java.awt.Dimension(754, 382));

        jPanel1.setBackground(new java.awt.Color(36, 48, 68));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(49, 93, 225));
        jButton2.setBorderPainted(false);
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(225, 50, 66));
        jButton1.setBorderPainted(false);
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GAME INVENTORY");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(36, 48, 68));

        jLabel3.setBackground(new java.awt.Color(0, 167, 130));
        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() & ~java.awt.Font.BOLD, 13));
        jLabel3.setForeground(new java.awt.Color(19, 167, 130));
        jLabel3.setText("Name");

        jTextField1.setBackground(new java.awt.Color(26, 35, 48));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(Color.WHITE);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 48, 68), 1, true));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() & ~java.awt.Font.BOLD, 13));
        jLabel4.setForeground(new java.awt.Color(19, 167, 130));
        jLabel4.setText("Quantity");

        jTextField2.setBackground(new java.awt.Color(26, 35, 48));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setForeground(Color.WHITE);

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() & ~java.awt.Font.BOLD, 13));
        jLabel5.setForeground(new java.awt.Color(19, 167, 130));
        jLabel5.setText("Price");

        jTextField3.setBackground(new java.awt.Color(26, 35, 48));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setForeground(Color.WHITE);

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() & ~java.awt.Font.BOLD, 13));
        jLabel6.setForeground(new java.awt.Color(19, 167, 130));
        jLabel6.setText("Rarity");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(items));
        jComboBox2.setFocusable(false);
        jComboBox2.setPreferredSize(new java.awt.Dimension(57, 24));
        jComboBox2.setRequestFocusEnabled(false);
        jComboBox2.setVerifyInputWhenFocusTarget(false);

        jButton4.setBackground(new java.awt.Color(19, 167, 130));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("ADD DATA");
        jButton4.setBorder(null);
        jButton4.setFocusPainted(false);
        jButton4.setFocusTraversalPolicyProvider(true);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ITEM INVENTORY");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jScrollPane2.setBorder(null);

        jTable2.setBackground(new java.awt.Color(36, 48, 68));
        jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(26, 35, 48), 1, true));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Name", "Quantity", "Price", "Rarity"
            }
        ));
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setFillsViewportHeight(true);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setInheritsPopupMenu(true);
        jTable2.setName(""); // NOI18N
        jTable2.setSelectionBackground(new java.awt.Color(26, 35, 48));
        jTable2.setShowGrid(false);
        jScrollPane2.setViewportView(jTable2);

        jPanel3.setBackground(new java.awt.Color(41, 55, 76));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("DELETE");
        jButton5.setBorder(null);
        jButton5.setFocusPainted(false);
        jButton5.setFocusTraversalPolicyProvider(true);
        jButton5.setFocusable(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ITEM INVENTORY VALUE");
        jLabel7.setToolTipText("");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("$");
        jLabel8.setToolTipText("");

        jTextField_Total.setBackground(new java.awt.Color(41, 55, 76));
        jTextField_Total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_Total.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Total.setText("0.0");
        jTextField_Total.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Total))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ITEM DETAILS");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
      

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        try {
            int toInt = Integer.parseInt(jTextField2.getText());
            double toDouble = Double.parseDouble(jTextField3.getText());
            model.addRow(new Object[]{jTextField1.getText(), toInt, toDouble, jComboBox2.getSelectedItem()});

        } catch (NumberFormatException e) {

            if (jTextField1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Item Name is Empty Please Input Data");
            } else if (jTextField2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Quantity is Empty Please Input Data");
            } else if (jTextField3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Price is Empty Please Input Data");
            } else {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        getSum();
        setCol(jTable2, 3);
        /*if(jTextField2.getText() != null){

        }else{
            JOptionPane.showMessageDialog(null, "Error Empty Field");
        }

        if(jTextField3.getText() != null){

        }else{
            JOptionPane.showMessageDialog(null, "Error Empty Field");
        }*/
    }//GEN-LAST:event_jButton4ActionPerformed

    public void setCol(JTable table, int column_index) {
        table.getColumnModel().getColumn(column_index).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String st_val = (String) table.getValueAt(row, 3);

                if (st_val.equals("Uncommon")) {
                    c.setForeground(new Color(101, 150, 226));
                } else if (st_val.equals("Rare")) {
                    c.setForeground(new Color(77, 105, 205));
                } else if (st_val.equals("Very Rare")) {
                    c.setForeground(new Color(137, 71, 255));
                } else if (st_val.equals("Legendary")) {
                    c.setForeground(new Color(212, 43, 230));
                } else if (st_val.equals("Exotic")) {
                    c.setForeground(new Color(235, 75, 75));
                } else {
                    c.setForeground(new Color(242, 242, 242));
                }
                return c;
            }
        });
    }


    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        dispose();        
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:

        this.setExtendedState(this.ICONIFIED);
        // will enable animations
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        try {
            int SelectedRowIndex = jTable2.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "There is no row to delete \n" + e);
        }
        getSum();
        //Algorithm for highlighted deletion, its buggy and doesn't work

        /*int[] row = jTable2.getSelectedRows();
        for (int i =0; i < jTable2.getSelectedRowCount();i++){
            int rows = jTable2.convertRowIndexToModel(row[i]);
            System.out.println("row [" + rows +"]");
            model.removeRow(rows);
        }*/
        //added
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    public void getSum() {
        int sum = 0;
        double sum2 = 0;
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            sum = sum + Integer.parseInt(jTable2.getValueAt(i, 1).toString());
        }
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            sum2 = sum2 + Double.parseDouble(jTable2.getValueAt(i, 2).toString());
        }
        double sum_total = sum * sum2;
        jTextField_Total.setText(Double.toString(sum_total));

    }

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
            java.util.logging.Logger.getLogger(Inventory_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inventory_View().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_Total;
    // End of variables declaration//GEN-END:variables

}
