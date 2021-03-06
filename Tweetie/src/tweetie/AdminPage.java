/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetie;

import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Nam
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     *
     */
    Data data = new Data();
    static User tempLatest = new User();
    public ArrayList<UserView> arrayUser;
    /**
     * Creates new form AdminPage
     */
    private static AdminPage instance = null;
    public AdminPage() {
        initComponents();
        arrayUser = new ArrayList<>();
    }
    public static AdminPage getInstance() {
        if (instance == null) {
            synchronized (AdminPage.class) {
                if (instance == null) {
                    instance = new AdminPage();
                }
            }
        }
        return instance;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addUser = new javax.swing.JButton();
        addGroup = new javax.swing.JButton();
        userID = new javax.swing.JTextField();
        groupID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        nameCheck = new javax.swing.JButton();
        errorMessage2 = new javax.swing.JLabel();
        lastUpdate = new javax.swing.JButton();
        lastUserUpdate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userView = new javax.swing.JButton();
        userTotal = new javax.swing.JButton();
        groupTotal = new javax.swing.JButton();
        msgTotal = new javax.swing.JButton();
        positivePercent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        messageCount = new javax.swing.JTextField();
        groupCount = new javax.swing.JTextField();
        percentageCount = new javax.swing.JTextField();
        userCount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nam Huynh, CS 356, Assignment 2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 435));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tweetie/tweetie.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        addGroup.setText("Add Group");
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        jLabel1.setText("User ID:");

        jLabel3.setText("Group ID:");

        jLabel4.setText("Error Message");

        errorMessage.setText(":");

        nameCheck.setText("ID Check");
        nameCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCheckActionPerformed(evt);
            }
        });

        errorMessage2.setText(" ");

        lastUpdate.setText("Last Update:");
        lastUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastUpdateActionPerformed(evt);
            }
        });

        lastUserUpdate.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(groupID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(addGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(94, 94, 94))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastUpdate)
                                    .addComponent(nameCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lastUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastUpdate)
                            .addComponent(lastUserUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(nameCheck)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addUser)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(addGroup))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(groupID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(errorMessage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(errorMessage2))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        userView.setBackground(new java.awt.Color(255, 255, 255));
        userView.setText("Open User View");
        userView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userViewActionPerformed(evt);
            }
        });

        userTotal.setText("Show Total Users");
        userTotal.setPreferredSize(new java.awt.Dimension(157, 23));
        userTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTotalActionPerformed(evt);
            }
        });

        groupTotal.setText("Show Total Groups");
        groupTotal.setPreferredSize(new java.awt.Dimension(157, 23));
        groupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupTotalActionPerformed(evt);
            }
        });

        msgTotal.setText("Show Total Messages");
        msgTotal.setPreferredSize(new java.awt.Dimension(157, 23));
        msgTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTotalActionPerformed(evt);
            }
        });

        positivePercent.setText("Show Positive Percentage");
        positivePercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positivePercentActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        percentageCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageCountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(msgTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(userTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userCount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageCount))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(positivePercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(groupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(percentageCount, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(groupCount)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(userView, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userView, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positivePercent)
                    .addComponent(userTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentageCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        errorMessage2.setText(" ");
        errorMessage.setText(":");
        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        Enumeration en = root.depthFirstEnumeration();
        while(en.hasMoreElements()){
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();
            if(!en.hasMoreElements()){
                if(selectedNode != null ){
                    if(selectedNode.getAllowsChildren() == false){
                        errorMessage.setText(": This is a user, you cannot add to it.");
                    }else{
                        if(!userID.getText().trim().equals("")){
                            User obj = new User();
                            obj.setID(userID.getText());
                            DefaultMutableTreeNode user = new DefaultMutableTreeNode(obj ,false);
                            user.setUserObject(obj);
                            model.insertNodeInto(user, selectedNode, selectedNode.getChildCount());
                            DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) jTree1.getCellRenderer();
                            //renderer.setClosedIcon(renderer.getLeafIcon());
                            //renderer.setLeafIcon(renderer.getDefaultOpenIcon());
                            data.addTotUsers();
                        }
                        else{
                        errorMessage.setText(": You must enter an ID.");
                        }
                    }
                }
                else{
                    errorMessage.setText(": You must choose a parent node to insert");
                }
            }
            else if(node.toString().toLowerCase().equals(userID.getText().toLowerCase())){
                errorMessage.setText(": The user has already been added.");
                return;
            }
        }
        userID.setText("");
         
    }//GEN-LAST:event_addUserActionPerformed

    private void msgTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTotalActionPerformed

        messageCount.setText("" + data.getTotMessages());
    }//GEN-LAST:event_msgTotalActionPerformed

    private void userTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTotalActionPerformed

        userCount.setText(""+ data.getTotUsers());
    }//GEN-LAST:event_userTotalActionPerformed

    private void userViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userViewActionPerformed

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        User user = (User) selectedNode.getUserObject();
        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
        UserView view = new UserView(data, arrayUser, user, jTree1);
        arrayUser.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_userViewActionPerformed

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        // TODO add your handling code here:
        errorMessage.setText(":");
        errorMessage2.setText(" ");
        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        Enumeration en = root.depthFirstEnumeration();
        while(en.hasMoreElements()){ 
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();
            if(!en.hasMoreElements()){
                if(selectedNode != null){
                    if(!groupID.getText().trim().equals("")){
                        Group obj = new Group();
                        obj.setID(groupID.getText());
                        DefaultMutableTreeNode group = new DefaultMutableTreeNode(obj, true);
                        group.setUserObject(obj);
                        model.insertNodeInto(group, selectedNode, selectedNode.getChildCount());
                        DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) jTree1.getCellRenderer();
                        //renderer.setIcon(renderer.getDefaultOpenIcon());
                        //renderer.setOpenIcon(renderer.getDefaultClosedIcon());
                        data.addTotGroups();
                    }
                    else{
                        errorMessage.setText(": You must enter an ID.");
                    }
                }
                else{
                    errorMessage.setText(": You must choose a parent node to insert");
                }
            }
            else if(node.toString().equals(groupID.getText())){
                errorMessage.setText(": The group has already been added.");
                return;
            }
            
        }
        groupID.setText("");
        
        
        
    }//GEN-LAST:event_addGroupActionPerformed

    private void percentageCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_percentageCountActionPerformed

    private void groupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupTotalActionPerformed
        groupCount.setText(""+ data.getTotGroups());
    }//GEN-LAST:event_groupTotalActionPerformed

    private void positivePercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positivePercentActionPerformed
        percentageCount.setText("" + data.calcPosPercent());
    }//GEN-LAST:event_positivePercentActionPerformed

    private void nameCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCheckActionPerformed
        errorMessage.setText(": ");
        errorMessage2.setText(" ");
        DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
        String temp = userID.getText().toLowerCase();
        String temp2 = groupID.getText().toLowerCase();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        Enumeration en = root.depthFirstEnumeration();
        if(!temp.equals("")){
            if(!temp.contains(" ")){
                while(en.hasMoreElements()){
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();
                    if(node.toString().toLowerCase().equals(temp)){
                        errorMessage.setText(": The user ID has already been taken.");
                        return;
                    }
                    else
                        errorMessage.setText(": User ID is available!");
                }
            }
            else{
                errorMessage.setText(": Invalid ID: User ID contains a space. ");
            }
        }
        else if(temp.equals("")){
            errorMessage.setText(": Invalid ID: Please insert a user ID. ");
        }
        en = root.depthFirstEnumeration();
        if(!temp2.equals("")){
            if(!temp2.contains(" ")){
                while(en.hasMoreElements()){
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();
                    if(node.toString().toLowerCase().equals(temp2)){
                        errorMessage2.setText("  The group ID has already been taken.");
                        return;
                    }
                    else
                        errorMessage2.setText("  Group ID is available!");
                }
            }
            else{
                errorMessage2.setText("  Invalid ID: Group ID contains a space. ");
            }
        }
        else if(temp2.equals("")){
            errorMessage2.setText("  Invalid ID: Please insert a group ID. ");
        }
        
    }//GEN-LAST:event_nameCheckActionPerformed

    private void lastUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastUpdateActionPerformed
        lastUserUpdate.setText(tempLatest.getId());
        
    }//GEN-LAST:event_lastUpdateActionPerformed
    @Override
    public Dimension getPreferredSize() 
    {
        return new Dimension(750,500);
    }
    /**
     * @param args the command line arguments
     */
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroup;
    private javax.swing.JButton addUser;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel errorMessage2;
    private javax.swing.JTextField groupCount;
    private javax.swing.JTextField groupID;
    private javax.swing.JButton groupTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton lastUpdate;
    private javax.swing.JLabel lastUserUpdate;
    private javax.swing.JTextField messageCount;
    private javax.swing.JButton msgTotal;
    private javax.swing.JButton nameCheck;
    private javax.swing.JTextField percentageCount;
    private javax.swing.JButton positivePercent;
    private javax.swing.JTextField userCount;
    private javax.swing.JTextField userID;
    private javax.swing.JButton userTotal;
    private javax.swing.JButton userView;
    // End of variables declaration//GEN-END:variables
}
