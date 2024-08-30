package design;
import entities.Course;
import entities.Section;
import entities.University;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;

public class Admin_Dashboard extends javax.swing.JFrame {
    private ArrayList<Section> sections;
                        
            
            
    public Admin_Dashboard() {
        initComponents();        
        sections = new ArrayList();
        this.setTitle("Admin Portal");
        ImageIcon icon = new ImageIcon("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\academics.jpg");
        Image image = icon.getImage();
        this.setIconImage(image);  
        setPanelTransparent();
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\java1.jpg");
    }
   
    private void setImageSlider(String url){
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage();
        ImageIcon newImage = new ImageIcon(image.getScaledInstance(162,106,Image.SCALE_SMOOTH));
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
        student_portal = new javax.swing.JLabel();
        teacher_portal = new javax.swing.JLabel();
        a_portal = new javax.swing.JLabel();
        user_portal = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        courses_portal = new javax.swing.JLabel();
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
        course_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        course_name = new javax.swing.JTextField();
        course_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        section_list = new javax.swing.JTable();
        add_section = new javax.swing.JLabel();
        delete_section = new javax.swing.JLabel();
        course_add = new javax.swing.JButton();
        User_panal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        user_full_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        user_u_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        user_pass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        user_security_a = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        user_security_q = new javax.swing.JComboBox<>();
        user_role = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        user_reg = new javax.swing.JButton();
        Student_panel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        stname = new javax.swing.JLabel();
        search_student_name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        student_list = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        select_student = new javax.swing.JComboBox<>();
        select_course_enroll = new javax.swing.JComboBox<>();
        course_reg = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        enrolled_courses = new javax.swing.JTable();
        select_section_enroll = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        teacher_panel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        stname2 = new javax.swing.JLabel();
        search_student_name2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        student_list2 = new javax.swing.JTable();
        profile_update1 = new javax.swing.JButton();
        status_combo = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        stname1 = new javax.swing.JLabel();
        search_student_name1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        student_list1 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        select_teacher = new javax.swing.JComboBox<>();
        select_course = new javax.swing.JComboBox<>();
        course_assign = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        workloadList = new javax.swing.JTable();
        select_section = new javax.swing.JComboBox<>();
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
        home.setToolTipText("Home Portal");
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

        teacher_portal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        teacher_portal.setForeground(new java.awt.Color(255, 255, 255));
        teacher_portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacher_portal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher.png"))); // NOI18N
        teacher_portal.setText("Teacher Portal");
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

        user_portal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        user_portal.setForeground(new java.awt.Color(255, 255, 255));
        user_portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_portal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        user_portal.setText("User portal");
        user_portal.setToolTipText("User Portal");
        user_portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_portalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_portalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_portalMouseExited(evt);
            }
        });

        settings.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/setting.png"))); // NOI18N
        settings.setText("Settings");
        settings.setToolTipText("Setting portal");
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

        courses_portal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        courses_portal.setForeground(new java.awt.Color(255, 255, 255));
        courses_portal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courses_portal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        courses_portal.setText("Courses Portal");
        courses_portal.setToolTipText("Course Portal");
        courses_portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courses_portalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                courses_portalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                courses_portalMouseExited(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        logOut.setText("Log out");
        logOut.setToolTipText("Exit button");
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courses_portal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student_portal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teacher_portal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(logOut))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(a_portal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(user_portal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pic_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(home)
                .addGap(27, 27, 27)
                .addComponent(courses_portal)
                .addGap(26, 26, 26)
                .addComponent(a_portal)
                .addGap(30, 30, 30)
                .addComponent(student_portal)
                .addGap(26, 26, 26)
                .addComponent(settings)
                .addGap(33, 33, 33)
                .addComponent(teacher_portal)
                .addGap(28, 28, 28)
                .addComponent(user_portal)
                .addGap(28, 28, 28)
                .addComponent(logOut)
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 543));

        jTabbedPane.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane.setAutoscrolls(true);

        Welcome_panel.setBackground(new java.awt.Color(204, 204, 255));
        Welcome_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel3.setToolTipText("Total Registered students in university");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Students");
        jLabel9.setToolTipText("Total Registered students in university");

        st_count.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        st_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_count.setText("70+");
        st_count.setToolTipText("Total Registered students in university");

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
        jPanel4.setToolTipText("Total Courses offer by university");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Coureses");
        jLabel10.setToolTipText("Total Courses offer by university");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("150+");
        jLabel12.setToolTipText("Total Courses offer by university");

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
        jPanel5.setToolTipText("Total instructors in university");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Teachers");
        jLabel13.setToolTipText("Total instructors in university");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("250+");
        jLabel14.setToolTipText("Total instructors in university");

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

        course_panel.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course Name");
        jLabel1.setToolTipText("");

        course_name.setToolTipText("Enter new course name");
        course_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        course_code.setToolTipText("Enter new Course Code");
        course_code.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Course Code");
        jLabel2.setToolTipText("");

        section_list.setAutoCreateRowSorter(true);
        section_list.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        section_list.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        section_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Section Name", "days", "Time"
            }
        ));
        section_list.setToolTipText("List of sections created");
        section_list.setShowGrid(true);
        section_list.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(section_list);

        add_section.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_section.setForeground(new java.awt.Color(102, 102, 102));
        add_section.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_section.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        add_section.setText("Section");
        add_section.setToolTipText("Press to create a new section");
        add_section.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_sectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_sectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_sectionMouseExited(evt);
            }
        });

        delete_section.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_section.setForeground(new java.awt.Color(102, 102, 102));
        delete_section.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_section.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        delete_section.setText("Section");
        delete_section.setToolTipText("Press to delete a section");
        delete_section.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_sectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_sectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_sectionMouseExited(evt);
            }
        });

        course_add.setBackground(new java.awt.Color(8, 102, 255));
        course_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        course_add.setForeground(new java.awt.Color(255, 255, 255));
        course_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add1.png"))); // NOI18N
        course_add.setText("Create Course");
        course_add.setToolTipText("Press to create a new Course");
        course_add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        course_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout course_panelLayout = new javax.swing.GroupLayout(course_panel);
        course_panel.setLayout(course_panelLayout);
        course_panelLayout.setHorizontalGroup(
            course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(course_panelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1)
                        .addGroup(course_panelLayout.createSequentialGroup()
                            .addGroup(course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addComponent(course_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(course_panelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(add_section)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_section)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        course_panelLayout.setVerticalGroup(
            course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, course_panelLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(course_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(course_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(course_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_section)
                    .addComponent(delete_section))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(course_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jTabbedPane.addTab("Course", course_panel);

        User_panal.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Full Name");
        jLabel4.setToolTipText("");

        user_full_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_full_name.setToolTipText("Enter full name");
        user_full_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("User Name");
        jLabel5.setToolTipText("");

        user_u_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_u_name.setToolTipText("Enter user name");
        user_u_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        jLabel6.setToolTipText("");

        user_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_pass.setToolTipText("Enter password");
        user_pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Security Question");
        jLabel7.setToolTipText("");

        user_security_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_security_a.setToolTipText("Enter the answer of security question");
        user_security_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Role");
        jLabel8.setToolTipText("");

        user_security_q.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_security_q.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Security Questions--", "What is your Mother name?", "Your First Pet Name?", "Your First Teacher Name?" }));
        user_security_q.setToolTipText("Choose security questions for password recovery");
        user_security_q.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        user_role.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Role--", "Student", "Teacher" }));
        user_role.setToolTipText("Choose the role of user");
        user_role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Security Answer");
        jLabel15.setToolTipText("");

        user_reg.setBackground(new java.awt.Color(8, 102, 255));
        user_reg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_reg.setForeground(new java.awt.Color(255, 255, 255));
        user_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add1.png"))); // NOI18N
        user_reg.setText("Register");
        user_reg.setToolTipText("Press to register a new user");
        user_reg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(user_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(user_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(user_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(user_security_a, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(user_u_name)
                                .addComponent(jLabel7)
                                .addComponent(user_security_q, 0, 238, Short.MAX_VALUE))
                            .addComponent(user_role, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_full_name))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_security_q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(user_pass)
                                .addGap(3, 3, 3))))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_role)
                    .addComponent(user_security_a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(user_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout User_panalLayout = new javax.swing.GroupLayout(User_panal);
        User_panal.setLayout(User_panalLayout);
        User_panalLayout.setHorizontalGroup(
            User_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(User_panalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        User_panalLayout.setVerticalGroup(
            User_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(User_panalLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Users", User_panal);

        Student_panel.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        stname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stname.setForeground(new java.awt.Color(102, 102, 102));
        stname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stname.setText("Search Student by Name");
        stname.setToolTipText("");

        search_student_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_student_name.setToolTipText("Enter the name of the student to search");
        search_student_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        student_list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        student_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Role", "User Name", "Password", "Security Question", "Security Answer"
            }
        ));
        student_list.setToolTipText("List of all students");
        student_list.setEnabled(false);
        student_list.setShowGrid(true);
        jScrollPane2.setViewportView(student_list);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(search_student_name))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname)
                    .addContainerGap(443, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(search_student_name)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname)
                    .addContainerGap(472, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("List of Students", jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        select_student.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_student.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Student--", "Ali Ahamad", "Junaid Sultan", "Aila Arshad", " " }));
        select_student.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_studentActionPerformed(evt);
            }
        });

        select_course_enroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_course_enroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        select_course_enroll.setToolTipText("");
        select_course_enroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_course_enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_course_enrollActionPerformed(evt);
            }
        });

        course_reg.setBackground(new java.awt.Color(8, 102, 255));
        course_reg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course_reg.setForeground(new java.awt.Color(255, 255, 255));
        course_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        course_reg.setText("Enroll");
        course_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_regActionPerformed(evt);
            }
        });

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

        select_section_enroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_section_enroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Section--", "W1", "W2", "W3", "W4", "W5", "W6" }));
        select_section_enroll.setToolTipText("Section");
        select_section_enroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_section_enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_section_enrollActionPerformed(evt);
            }
        });

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
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(select_course_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(select_section_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(course_reg)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel16)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(select_student, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_section_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_course_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(select_student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(464, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Enrollment Portal", jPanel9);

        javax.swing.GroupLayout Student_panelLayout = new javax.swing.GroupLayout(Student_panel);
        Student_panel.setLayout(Student_panelLayout);
        Student_panelLayout.setHorizontalGroup(
            Student_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Student_panelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Student_panelLayout.setVerticalGroup(
            Student_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Student_panelLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane.addTab("Student", Student_panel);

        teacher_panel.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane2.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));

        stname2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stname2.setForeground(new java.awt.Color(102, 102, 102));
        stname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stname2.setText("Search Student by Name");
        stname2.setToolTipText("");

        search_student_name2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_student_name2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        student_list2.setAutoCreateRowSorter(true);
        student_list2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        student_list2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        student_list2.setModel(new javax.swing.table.DefaultTableModel(
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
        student_list2.setRowHeight(20);
        student_list2.setRowMargin(3);
        student_list2.setShowGrid(true);
        jScrollPane8.setViewportView(student_list2);
        if (student_list2.getColumnModel().getColumnCount() > 0) {
            student_list2.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(status_combo));
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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_student_name2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(profile_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname2)
                    .addContainerGap(443, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(search_student_name2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profile_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname2)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Advisor Portal", jPanel12);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));

        stname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stname1.setForeground(new java.awt.Color(102, 102, 102));
        stname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stname1.setText("Search Teacher by Name");
        stname1.setToolTipText("");

        search_student_name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_student_name1.setToolTipText("Search Teacher by name ");
        search_student_name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        student_list1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        student_list1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Name", "Role", "User Name", "Password", "Security Question", "Security Answer"
            }
        ));
        student_list1.setEnabled(false);
        student_list1.setShowGrid(true);
        jScrollPane6.setViewportView(student_list1);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_student_name1)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname1)
                    .addContainerGap(441, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(search_student_name1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname1)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("List of Teacher", jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));

        select_teacher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_teacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Teacher--", "Ali Ahamad", "Junaid Sultan", "Aila Arshad", " " }));
        select_teacher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_teacherActionPerformed(evt);
            }
        });

        select_course.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        select_course.setToolTipText("Section");
        select_course.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_courseActionPerformed(evt);
            }
        });

        course_assign.setBackground(new java.awt.Color(8, 102, 255));
        course_assign.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course_assign.setForeground(new java.awt.Color(255, 255, 255));
        course_assign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        course_assign.setText("Assigned");

        workloadList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Teacher", "Section", "Class Days", "Class Timing"
            }
        ));
        workloadList.setToolTipText("Attendance sheet");
        workloadList.setShowGrid(true);
        workloadList.setSurrendersFocusOnKeystroke(true);
        jScrollPane7.setViewportView(workloadList);

        select_section.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Section--", "W1", "W2", "W3", "W4", "W5", "W6" }));
        select_section.setToolTipText("Section");
        select_section.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_sectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(select_course, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(select_section, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(course_assign)
                        .addContainerGap(497, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(select_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(course_assign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(select_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(446, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Workload Portal", jPanel11);

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

        select_course_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_course_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        select_course_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_course_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_course_aActionPerformed(evt);
            }
        });

        select_section_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        profile_name.setToolTipText("Enter full name of the user");
        profile_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("User Name");
        jLabel19.setToolTipText("");

        profile_u_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_u_name.setToolTipText("Enter user name");
        profile_u_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Password");
        jLabel20.setToolTipText("");

        profile_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_pass.setToolTipText("Enter password");
        profile_pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Security Question");
        jLabel21.setToolTipText("");

        profile_security_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_security_a.setToolTipText("Enter the answer of security question");
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

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        home.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));        

    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
        home.setBorder(null);

    }//GEN-LAST:event_homeMouseExited

    private void student_portalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_portalMouseEntered
        // TODO add your handling code here:
        student_portal.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
        
        
    }//GEN-LAST:event_student_portalMouseEntered

    private void student_portalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_portalMouseExited
        // TODO add your handling code here:
        student_portal.setBorder(null);
    }//GEN-LAST:event_student_portalMouseExited

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

    private void user_portalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_portalMouseEntered
        // TODO add your handling code here:
        user_portal.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));        
    }//GEN-LAST:event_user_portalMouseEntered

    private void user_portalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_portalMouseExited
        // TODO add your handling code here:
        user_portal.setBorder(null);
    }//GEN-LAST:event_user_portalMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        // TODO add your handling code here:
        settings.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
        
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        // TODO add your handling code here:
        settings.setBorder(null);
    }//GEN-LAST:event_settingsMouseExited

    private void add_sectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_sectionMouseEntered
        // TODO add your handling code here:
        add_section.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_add_sectionMouseEntered

    private void add_sectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_sectionMouseExited
        // TODO add your handling code here:
        add_section.setBorder(null);
    }//GEN-LAST:event_add_sectionMouseExited

    private void add_sectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_sectionMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) section_list.getModel();
        model.addRow(new Object[1]);
        
    }//GEN-LAST:event_add_sectionMouseClicked

    private void delete_sectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_sectionMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) section_list.getModel();
        int index = model.getRowCount()-1;
        if (index>=0) {
            model.removeRow(index);            
        }
        else{
            JOptionPane.showMessageDialog(null, "section table already empty");
        }
        
    }//GEN-LAST:event_delete_sectionMouseClicked

    private void delete_sectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_sectionMouseEntered
        // TODO add your handling code here:
        delete_section.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_delete_sectionMouseEntered

    private void delete_sectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_sectionMouseExited
        // TODO add your handling code here:
        delete_section.setBorder(null);
    }//GEN-LAST:event_delete_sectionMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\java1.jpg");
        jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_homeMouseClicked

    private void a_portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_portalMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\attendance_pic.jpg");
        jTabbedPane.setSelectedIndex(5);
    }//GEN-LAST:event_a_portalMouseClicked

    private void student_portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_portalMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\students.jpg");
        jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_student_portalMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\settings.png");
        jTabbedPane.setSelectedIndex(6);
    }//GEN-LAST:event_settingsMouseClicked

    private void teacher_portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_portalMouseClicked
        // TODO add your handling code here:
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\teachers.jpg");
        jTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_teacher_portalMouseClicked

    private void user_portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_portalMouseClicked
        // TODO add your handling code here:
        jTabbedPane.setSelectedIndex(2);
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\java2.jpg");
        
    }//GEN-LAST:event_user_portalMouseClicked

    private void courses_portalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courses_portalMouseClicked
        // TODO add your handling code here:
        jTabbedPane.setSelectedIndex(1);
        setImageSlider("C:\\Users\\Bilal Arif\\Documents\\NetBeansProjects\\AMS\\src\\assets\\courses.jpg");
    }//GEN-LAST:event_courses_portalMouseClicked

    private void courses_portalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courses_portalMouseEntered
        // TODO add your handling code here:
        courses_portal.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_courses_portalMouseEntered

    private void courses_portalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courses_portalMouseExited
        // TODO add your handling code here:
        courses_portal.setBorder(null);
    }//GEN-LAST:event_courses_portalMouseExited

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

    private void select_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_studentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_studentActionPerformed

    private void select_course_enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_course_enrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_course_enrollActionPerformed

    private void select_section_enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_section_enrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_section_enrollActionPerformed

    private void select_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_teacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_teacherActionPerformed

    private void select_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_courseActionPerformed

    private void select_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_sectionActionPerformed

    private void status_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_comboActionPerformed

    private void course_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_addActionPerformed
        // TODO add your handling code here:        
        if (!course_name.getText().isEmpty()
                && !course_code.getText().isEmpty()) {
            Course c = new Course();
            c.setName(course_name.getText());
            c.setC_code(course_code.getText());
            DefaultTableModel model = (DefaultTableModel) section_list.getModel();
            Section section = null;
            if (model.getRowCount() > 0 && model != null) {
                section = new Section();
                for (int i = 0; i < model.getRowCount(); i++) {//rows
                    for (int j = 0; j < model.getColumnCount(); j++) {//columns
                        section.setName(model.getValueAt(i, j).toString());
                        section.setClass_days(model.getValueAt(i, j).toString());
                        section.setClass_time_slot(model.getValueAt(i, j).toString());
                    }
                    sections.add(section);
                }
                c.setSections(sections);
                boolean dis = University.createCourse(c);
                String msg = (dis)?"course create successfully":"something went wrong";
                University.dialogeMsg(msg);
            } else {
                University.dialogeMsg("No section created till now");
            }
        }
    }//GEN-LAST:event_course_addActionPerformed

    private void course_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_regActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_course_regActionPerformed

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
                new Admin_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendance_panel;
    private javax.swing.JPanel Student_panel;
    private javax.swing.JPanel User_panal;
    private javax.swing.JPanel Welcome_panel;
    private javax.swing.JLabel a_portal;
    private javax.swing.JLabel active_attendance;
    private javax.swing.JLabel active_update;
    private javax.swing.JLabel add_section;
    private javax.swing.JTable attendance_sheet;
    private javax.swing.JButton course_add;
    private javax.swing.JButton course_assign;
    private javax.swing.JTextField course_code;
    private javax.swing.JTextField course_name;
    private javax.swing.JPanel course_panel;
    private javax.swing.JButton course_reg;
    private javax.swing.JLabel courses_portal;
    private javax.swing.JLabel date;
    private javax.swing.JLabel delete_section;
    private javax.swing.JTable enrolled_courses;
    private javax.swing.JButton fetch_a;
    private javax.swing.JButton fetch_a1;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JTextField search_student_name;
    private javax.swing.JTextField search_student_name1;
    private javax.swing.JTextField search_student_name2;
    private javax.swing.JTable section_list;
    private javax.swing.JComboBox<String> select_course;
    private javax.swing.JComboBox<String> select_course_a;
    private javax.swing.JComboBox<String> select_course_enroll;
    private javax.swing.JComboBox<String> select_section;
    private javax.swing.JComboBox<String> select_section_a;
    private javax.swing.JComboBox<String> select_section_enroll;
    private javax.swing.JComboBox<String> select_student;
    private javax.swing.JComboBox<String> select_teacher;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel st_count;
    private javax.swing.JComboBox<String> status_combo;
    private javax.swing.JLabel stname;
    private javax.swing.JLabel stname1;
    private javax.swing.JLabel stname2;
    private javax.swing.JTable student_list;
    private javax.swing.JTable student_list1;
    private javax.swing.JTable student_list2;
    private javax.swing.JLabel student_portal;
    private javax.swing.JPanel teacher_panel;
    private javax.swing.JLabel teacher_portal;
    private javax.swing.JLabel time;
    private javax.swing.JTextField user_full_name;
    private javax.swing.JTextField user_pass;
    private javax.swing.JLabel user_portal;
    private javax.swing.JButton user_reg;
    private javax.swing.JComboBox<String> user_role;
    private javax.swing.JTextField user_security_a;
    private javax.swing.JComboBox<String> user_security_q;
    private javax.swing.JTextField user_u_name;
    private javax.swing.JTable workloadList;
    // End of variables declaration//GEN-END:variables
}
