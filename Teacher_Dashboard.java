package design;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.DefaultCellEditor;

public class Teacher_Dashboard extends javax.swing.JFrame {
     
    public Teacher_Dashboard() {
        initComponents();        
        this.setTitle("Teacher Portal");
        ImageIcon icon = new ImageIcon("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\academics.jpg");
        Image image = icon.getImage();
        this.setIconImage(image);  
        setPanelTransparent();
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\java1.jpg");
    }
   
    private void setImageSlider(String url){
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage();
        ImageIcon newImage = new ImageIcon(image.getScaledInstance(162,173,Image.SCALE_SMOOTH));
        pic_slider.setIcon(newImage);
    }
    
    private void setPanelTransparent(){
        jPanel3.setBackground(new Color(255, 255, 255, 170));
        jPanel4.setBackground(new Color(255, 255, 255, 170));
        jPanel5.setBackground(new Color(255, 255, 255, 170));
        

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        teacher_portal = new javax.swing.JLabel();
        a_portal = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        pic_slider = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        Welcome_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        st_count = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        teacher_panel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        stname1 = new javax.swing.JLabel();
        search_student_name1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        student_list1 = new javax.swing.JTable();
        profile_update1 = new javax.swing.JButton();
        status_combo = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        enrolled_courses1 = new javax.swing.JTable();
        Attendance_panel = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        select_course_a = new javax.swing.JComboBox<>();
        select_section_a = new javax.swing.JComboBox<>();
        active_attendance = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        attendance_sheet = new javax.swing.JTable();
        fetch_a = new javax.swing.JButton();
        fetch_a1 = new javax.swing.JButton();
        setting_panel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        profile_name = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        profile_u_name = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        profile_pass = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        profile_security_a = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        profile_security_q = new javax.swing.JComboBox<>();
        profile_role = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        profile_update = new javax.swing.JButton();
        active_update = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 255, 255)));

        home.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/home.png"))); // NOI18N
        home.setText("Home");
        home.setToolTipText("Course Portal");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        teacher_portal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        teacher_portal.setForeground(new java.awt.Color(255, 255, 255));
        teacher_portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacher_portal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher.png"))); // NOI18N
        teacher_portal.setText("Advisor Portal");
        teacher_portal.setToolTipText("Teacher Portal");
        teacher_portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher_portalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacher_portalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacher_portalMouseExited(evt);
            }
        });

        a_portal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        a_portal.setForeground(new java.awt.Color(255, 255, 255));
        a_portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a_portal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/attendance.png"))); // NOI18N
        a_portal.setText("A-Portal");
        a_portal.setToolTipText("Attendance Portal");
        a_portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_portalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a_portalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a_portalMouseExited(evt);
            }
        });

        settings.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/setting.png"))); // NOI18N
        settings.setText("Settings");
        settings.setToolTipText("Settings");
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        logOut.setText("Log out");
        logOut.setToolTipText("Log out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(teacher_portal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOut)
                    .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_portal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pic_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home)
                .addGap(41, 41, 41)
                .addComponent(teacher_portal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(a_portal)
                .addGap(37, 37, 37)
                .addComponent(settings)
                .addGap(37, 37, 37)
                .addComponent(logOut)
                .addGap(76, 76, 76))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 543));

        jTabbedPane.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane.setAutoscrolls(true);

        Welcome_panel.setBackground(new java.awt.Color(204, 204, 255));
        Welcome_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Students");

        st_count.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        st_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_count.setText("70+");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
            .addComponent(st_count, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(st_count, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Welcome_panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Coureses");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("150+");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Welcome_panel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 260, 130));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Teachers");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("250+");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Welcome_panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 561, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/java3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        Welcome_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 550));

        jTabbedPane.addTab("Welcome", Welcome_panel);

        teacher_panel.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane2.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));

        stname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stname1.setForeground(new java.awt.Color(102, 102, 102));
        stname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stname1.setText("Search Student by Name");
        stname1.setToolTipText("");

        search_student_name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_student_name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        student_list1.setAutoCreateRowSorter(true);
        student_list1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        student_list1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        student_list1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student Name", "Course", "Section", "Status"
            }
        ));
        student_list1.setRowHeight(20);
        student_list1.setRowMargin(3);
        student_list1.setShowGrid(true);
        jScrollPane6.setViewportView(student_list1);
        if (student_list1.getColumnModel().getColumnCount() > 0) {
            student_list1.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(status_combo)

            );
        }

        profile_update1.setBackground(new java.awt.Color(8, 102, 255));
        profile_update1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile_update1.setForeground(new java.awt.Color(255, 255, 255));
        profile_update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/upload.png"))); // NOI18N
        profile_update1.setText("Resolve");
        profile_update1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        status_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Cancelled" }));
        status_combo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        status_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_student_name1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(profile_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                        .addGap(185, 185, 185)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname1)
                    .addContainerGap(624, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(search_student_name1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profile_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname1)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Advisor Portal", jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));

        enrolled_courses1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Teacher", "Section", "Class Days", "Class Timing"
            }
        ));
        enrolled_courses1.setToolTipText("Assigned Courses Load ");
        enrolled_courses1.setEnabled(false);
        enrolled_courses1.setShowGrid(true);
        enrolled_courses1.setSurrendersFocusOnKeystroke(true);
        jScrollPane7.setViewportView(enrolled_courses1);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane2.addTab("Courses Load", jPanel11);

        javax.swing.GroupLayout teacher_panelLayout = new javax.swing.GroupLayout(teacher_panel);
        teacher_panel.setLayout(teacher_panelLayout);
        teacher_panelLayout.setHorizontalGroup(
            teacher_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacher_panelLayout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        teacher_panelLayout.setVerticalGroup(
            teacher_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacher_panelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Teacher", teacher_panel);

        Attendance_panel.setBackground(new java.awt.Color(204, 204, 255));

        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Date");
        date.setToolTipText("");
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 102));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("time");
        time.setToolTipText("");
        time.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        select_course_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        select_course_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_course_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_course_aActionPerformed(evt);
            }
        });

        select_section_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Section--", "W1", "W2", "W3", "W4", "W5", "W6" }));
        select_section_a.setToolTipText("Section");
        select_section_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_section_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_section_aActionPerformed(evt);
            }
        });

        active_attendance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        active_attendance.setForeground(new java.awt.Color(102, 102, 102));
        active_attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editing.png"))); // NOI18N
        active_attendance.setText("Active");
        active_attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                active_attendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                active_attendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                active_attendanceMouseExited(evt);
            }
        });

        attendance_sheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student  Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        attendance_sheet.setToolTipText("Attendance sheet");
        attendance_sheet.setShowGrid(true);
        attendance_sheet.setSurrendersFocusOnKeystroke(true);
        jScrollPane4.setViewportView(attendance_sheet);

        fetch_a.setBackground(new java.awt.Color(8, 102, 255));
        fetch_a.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fetch_a.setForeground(new java.awt.Color(255, 255, 255));
        fetch_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/list.png"))); // NOI18N
        fetch_a.setText("Create Attendance");

        fetch_a1.setBackground(new java.awt.Color(8, 102, 255));
        fetch_a1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fetch_a1.setForeground(new java.awt.Color(255, 255, 255));
        fetch_a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/list.png"))); // NOI18N
        fetch_a1.setText("Save");

        javax.swing.GroupLayout Attendance_panelLayout = new javax.swing.GroupLayout(Attendance_panel);
        Attendance_panel.setLayout(Attendance_panelLayout);
        Attendance_panelLayout.setHorizontalGroup(
            Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Attendance_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Attendance_panelLayout.createSequentialGroup()
                        .addComponent(fetch_a1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Attendance_panelLayout.createSequentialGroup()
                        .addGroup(Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Attendance_panelLayout.createSequentialGroup()
                                .addGroup(Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Attendance_panelLayout.createSequentialGroup()
                                        .addComponent(select_course_a, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Attendance_panelLayout.createSequentialGroup()
                                        .addComponent(active_attendance)
                                        .addGap(119, 119, 119)))
                                .addGroup(Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date)
                                    .addComponent(select_section_a, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fetch_a)
                                    .addComponent(time))))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        Attendance_panelLayout.setVerticalGroup(
            Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Attendance_panelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Attendance_panelLayout.createSequentialGroup()
                        .addGroup(Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(time))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Attendance_panelLayout.createSequentialGroup()
                        .addComponent(active_attendance)
                        .addGap(13, 13, 13)))
                .addGroup(Attendance_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_course_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_section_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fetch_a))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fetch_a1)
                .addGap(23, 23, 23))
        );

        jTabbedPane.addTab("Attendance", Attendance_panel);

        setting_panel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Full Name");
        jLabel18.setToolTipText("");

        profile_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        profile_name.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("User Name");
        jLabel19.setToolTipText("");

        profile_u_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_u_name.setToolTipText("enter user name");
        profile_u_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Password");
        jLabel20.setToolTipText("");

        profile_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Security Question");
        jLabel21.setToolTipText("");

        profile_security_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_security_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Role");
        jLabel22.setToolTipText("");

        profile_security_q.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile_security_q.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Security Questions--", "What is your Mother name?", "Your First Pet Name?", "Your First Teacher Name?" }));
        profile_security_q.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        profile_role.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Role--", "Student", "Teacher" }));
        profile_role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Security Answer");
        jLabel23.setToolTipText("");

        profile_update.setBackground(new java.awt.Color(8, 102, 255));
        profile_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile_update.setForeground(new java.awt.Color(255, 255, 255));
        profile_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editing.png"))); // NOI18N
        profile_update.setText("Update Info");
        profile_update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(profile_update, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(profile_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(profile_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(profile_security_a, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19)
                                .addComponent(profile_u_name)
                                .addComponent(jLabel21)
                                .addComponent(profile_security_q, 0, 238, Short.MAX_VALUE))
                            .addComponent(profile_role, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profile_name))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profile_u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profile_security_q)
                            .addComponent(profile_pass)))
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profile_role)
                    .addComponent(profile_security_a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(profile_update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        active_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        active_update.setForeground(new java.awt.Color(102, 102, 102));
        active_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editing.png"))); // NOI18N
        active_update.setText("Active");
        active_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                active_updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                active_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                active_updateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout setting_panelLayout = new javax.swing.GroupLayout(setting_panel);
        setting_panel.setLayout(setting_panelLayout);
        setting_panelLayout.setHorizontalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setting_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(setting_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(active_update)))
                .addGap(34, 34, 34))
        );
        setting_panelLayout.setVerticalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(active_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("settings", setting_panel);

        getContentPane().add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, -37, 630, 580));
        jTabbedPane.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(802, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void teacher_portalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_portalMouseEntered
        // TODO add your handling code here:
        teacher_portal.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
        
        
    }//GEN-LAST:event_teacher_portalMouseEntered

    private void teacher_portalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_portalMouseExited
        // TODO add your handling code here:
        teacher_portal.setBorder(null);
    }//GEN-LAST:event_teacher_portalMouseExited

    private void a_portalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_portalMouseEntered
        // TODO add your handling code here:
        a_portal.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));        
        
    }//GEN-LAST:event_a_portalMouseEntered

    private void a_portalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_portalMouseExited
        // TODO add your handling code here:
        a_portal.setBorder(null);
    }//GEN-LAST:event_a_portalMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        // TODO add your handling code here:
        settings.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
        
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        // TODO add your handling code here:
        settings.setBorder(null);
    }//GEN-LAST:event_settingsMouseExited

    private void a_portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_portalMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\attendance_pic.jpg");
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_a_portalMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\settings.png");
        jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_settingsMouseClicked

    private void teacher_portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_portalMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\teachers.jpg");
        jTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_teacher_portalMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\log_off.png");
        int dis = JOptionPane.showConfirmDialog(null,"Do you want to loggged out");
        if (dis==0) {
            this.setVisible(false);
            this.dispose();
            new SignIn().setVisible(true);            
        }        
        jTabbedPane.setSelectedIndex(0);
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\java1.jpg");
    }//GEN-LAST:event_logOutMouseClicked

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        // TODO add your handling code here:
        logOut.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        // TODO add your handling code here:
        logOut.setBorder(null);
    }//GEN-LAST:event_logOutMouseExited

    private void active_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_active_updateMouseClicked

    private void active_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_active_updateMouseEntered

    private void active_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_updateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_active_updateMouseExited

    private void select_course_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_course_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_course_aActionPerformed

    private void select_section_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_section_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_section_aActionPerformed

    private void active_attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_attendanceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_active_attendanceMouseClicked

    private void active_attendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_attendanceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_active_attendanceMouseEntered

    private void active_attendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_attendanceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_active_attendanceMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\java1.jpg");
        jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        home.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
        home.setBorder(null);
    }//GEN-LAST:event_homeMouseExited

    private void status_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_comboActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendance_panel;
    private javax.swing.JPanel Welcome_panel;
    private javax.swing.JLabel a_portal;
    private javax.swing.JLabel active_attendance;
    private javax.swing.JLabel active_update;
    private javax.swing.JTable attendance_sheet;
    private javax.swing.JLabel date;
    private javax.swing.JTable enrolled_courses1;
    private javax.swing.JButton fetch_a;
    private javax.swing.JButton fetch_a1;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel pic_slider;
    private javax.swing.JTextField profile_name;
    private javax.swing.JTextField profile_pass;
    private javax.swing.JComboBox<String> profile_role;
    private javax.swing.JTextField profile_security_a;
    private javax.swing.JComboBox<String> profile_security_q;
    private javax.swing.JTextField profile_u_name;
    private javax.swing.JButton profile_update;
    private javax.swing.JButton profile_update1;
    private javax.swing.JTextField search_student_name1;
    private javax.swing.JComboBox<String> select_course_a;
    private javax.swing.JComboBox<String> select_section_a;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel st_count;
    private javax.swing.JComboBox<String> status_combo;
    private javax.swing.JLabel stname1;
    private javax.swing.JTable student_list1;
    private javax.swing.JPanel teacher_panel;
    private javax.swing.JLabel teacher_portal;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
