package design;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

public class Student_Dashboard extends javax.swing.JFrame {
     
    public Student_Dashboard() {
        initComponents();        
        this.setTitle("Student Portal");
        ImageIcon icon = new ImageIcon("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\academics.jpg");
        Image image = icon.getImage();
        this.setIconImage(image);      
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\java1.jpg");
    }
   
    private void setImageSlider(String url){
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage();
        ImageIcon newImage = new ImageIcon(image.getScaledInstance(162,197,Image.SCALE_SMOOTH));
        pic_slider.setIcon(newImage);
    }        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        student_portal = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        pic_slider = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        Student_panel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        select_section_enroll = new javax.swing.JComboBox<>();
        course_reg = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        enrolled_courses = new javax.swing.JTable();
        select_section_enroll1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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

        student_portal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        student_portal.setForeground(new java.awt.Color(255, 255, 255));
        student_portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        student_portal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/student.png"))); // NOI18N
        student_portal.setText("Student Portal");
        student_portal.setToolTipText("Student Portal");
        student_portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_portalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                student_portalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                student_portalMouseExited(evt);
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
                        .addComponent(student_portal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logOut))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pic_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(student_portal)
                .addGap(42, 42, 42)
                .addComponent(settings)
                .addGap(44, 44, 44)
                .addComponent(logOut)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 543));

        jTabbedPane.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane.setAutoscrolls(true);

        Student_panel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        select_section_enroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_section_enroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        select_section_enroll.setToolTipText("Section");
        select_section_enroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        course_reg.setBackground(new java.awt.Color(8, 102, 255));
        course_reg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course_reg.setForeground(new java.awt.Color(255, 255, 255));
        course_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        course_reg.setText("Enroll");

        enrolled_courses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student  Name", "Course", "Section", "Status"
            }
        ));
        enrolled_courses.setToolTipText("Attendance sheet");
        enrolled_courses.setShowGrid(true);
        enrolled_courses.setSurrendersFocusOnKeystroke(true);
        jScrollPane5.setViewportView(enrolled_courses);

        select_section_enroll1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_section_enroll1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Section--", "W1", "W2", "W3", "W4", "W5", "W6" }));
        select_section_enroll1.setToolTipText("Section");
        select_section_enroll1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher.png"))); // NOI18N
        jLabel11.setText("Bilal Arif");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Teacher Name");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(select_section_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(select_section_enroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(course_reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_section_enroll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_section_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout Student_panelLayout = new javax.swing.GroupLayout(Student_panel);
        Student_panel.setLayout(Student_panelLayout);
        Student_panelLayout.setHorizontalGroup(
            Student_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Student_panelLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        Student_panelLayout.setVerticalGroup(
            Student_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Student_panelLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane.addTab("Student", Student_panel);

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

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("User Name");
        jLabel19.setToolTipText("");

        profile_u_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

    private void student_portalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_portalMouseEntered
        // TODO add your handling code here:
        student_portal.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
        
        
    }//GEN-LAST:event_student_portalMouseEntered

    private void student_portalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_portalMouseExited
        // TODO add your handling code here:
        student_portal.setBorder(null);
    }//GEN-LAST:event_student_portalMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        // TODO add your handling code here:
        settings.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
        
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        // TODO add your handling code here:
        settings.setBorder(null);
    }//GEN-LAST:event_settingsMouseExited

    private void student_portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_portalMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\students.jpg");
        jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_student_portalMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\settings.png");
        jTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_settingsMouseClicked

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
        active_update.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_active_updateMouseEntered

    private void active_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_updateMouseExited
        // TODO add your handling code here:
        active_update.setBorder(null);
    }//GEN-LAST:event_active_updateMouseExited

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
                new Student_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Student_panel;
    private javax.swing.JLabel active_update;
    private javax.swing.JButton course_reg;
    private javax.swing.JTable enrolled_courses;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel pic_slider;
    private javax.swing.JTextField profile_name;
    private javax.swing.JTextField profile_pass;
    private javax.swing.JComboBox<String> profile_role;
    private javax.swing.JTextField profile_security_a;
    private javax.swing.JComboBox<String> profile_security_q;
    private javax.swing.JTextField profile_u_name;
    private javax.swing.JButton profile_update;
    private javax.swing.JComboBox<String> select_section_enroll;
    private javax.swing.JComboBox<String> select_section_enroll1;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel student_portal;
    // End of variables declaration//GEN-END:variables
}
