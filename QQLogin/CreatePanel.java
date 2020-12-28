package QQLogin;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;

// import org.graalvm.compiler.hotspot.nodes.DimensionsNode;

// import jdk.internal.org.jline.utils.Colors;

import java.awt.Font;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class CreatePanel {
    //顶部面部区域
    public static JPanel CreateNorthPanel(JFrame jf){
        JPanel panel = new JPanel();
        panel.setLayout(null);                           //取消容器内的默认布局
        panel.setPreferredSize(new Dimension(0,140));    //设置顶部面板尺寸

        //1.1 向顶部面板添加背景图片
        ImageIcon image = new ImageIcon("images/back.jpg");
        JLabel background = new JLabel(image);

        //设置背景图片的位置以及尺寸
        background.setBounds(0,0,426,image.getIconHeight());
        panel.add(background);

        //1.2 在顶部JPanel面板右上角添加一个退出退出按钮
        JButton out = new JButton(new ImageIcon("images/close_normal.jpg"));
        out.setBounds(403, 0, 26, 26);

        //设置鼠标移动到退出按钮是更改图片
        out.setRolloverIcon(new ImageIcon("images/close_hover.jpg"));

        //取消按钮边框的效果
        out.setBorderPainted(false);
        panel.add(out);
        return panel;
    }

    //左侧面部区域
    public static JPanel CreateWestPanel(JFrame jf){
        //创建一个JPanel左侧面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(130,0));

        //向左侧面板添加背景图片
        ImageIcon image = new ImageIcon("images/qq.jpg");
        JLabel background = new JLabel(image);
        background.setBounds(0,0,120,110);
        panel.add(background);
        return panel;
    }

    //中部面部区域
    public static JPanel CreateCenterPanel(JFrame jf){
        //创建一个JPanel中部面板
        JPanel panel = new JPanel();
        panel.setLayout(null);

        //3.1 创建一个JconboBox下拉框组件，并初始化QQ账号
        String[] str = {"123456789","1443573779","1376977181"};
        JComboBox<Object> jconCenter = new JComboBox<Object>(str);
        panel.add(jconCenter);

        //设置下拉框可编辑
        jconCenter.setEditable(true);
        jconCenter.setBounds(0,15,175,30);

        //设置下拉框内容字体
        jconCenter.setFont(new Font("Calibri",0,13));

        //设置一个JPasswordField密码框组件
        JPasswordField jpaCenter = new JPasswordField();

        //设置密码框面板为流式布局管理器
        jpaCenter.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
        jpaCenter.setBounds(0,44,175,30);
        jpaCenter.setPreferredSize(new Dimension(185,25));
        panel.add(jpaCenter);

        //创建ImageIcon小键盘图表组件，并加入到密码框组件中
        ImageIcon image = new ImageIcon("images/keyboard.jpg");
        JButton jbu = new JButton(image);
        jbu.setPreferredSize(new Dimension(22,20));
        jbu.setBorderPainted(false);
        jpaCenter.add(jbu);

        //创建两个JCheckBox多选框组件
        JCheckBox jch1 = new JCheckBox("记住密码");
        //设置选中时不显示边框
        jch1.setFocusPainted(false);
        jch1.setFont(new Font("宋体",0,13));
        jch1.setBounds(0, 85, 80, 20);
        panel.add(jch1);
        JCheckBox jch2 = new JCheckBox("自动登录");
        jch2.setFocusPainted(false);
        jch2.setFont(new Font("宋体",0,12));
        jch2.setBounds(100, 85, 80, 20);
        panel.add(jch2);
        return panel;
    }

    //底部面部区域
    public static JPanel CreateSouthPanel(JFrame jf){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(0,51));
        panel.setLayout(null);
        //创建左下角多人登录图表组件
        JButton jble = new JButton(new ImageIcon("images/single_normal.jpg"));
        jble.setPreferredSize(new DimensionUIResource(40, 40));
        jble.setFocusPainted(false);
        jble.setRolloverIcon(new ImageIcon("images/single_down.jpg"));
        jble.setBorderPainted(false);
        //设置不显示按钮区域
        jble.setContentAreaFilled(false);
        jble.setBounds(0,10,40,40);
        jble.setToolTipText("多账号登录");
        //创建底部中间登录图表组件
        ImageIcon image = new ImageIcon("images/login_normal.jpg");
        JButton jb = new JButton("登    录",image);
        jb.setFont(new Font("宋体",0,13));
        jb.setBounds(130, 0, 175, 40);
        //将文字放在图像中间
        jb.setHorizontalTextPosition(SwingConstants.CENTER);
        jb.setFocusPainted(false);
        jb.setContentAreaFilled(false);
        jb.setRolloverIcon(new ImageIcon("images/right_normal.jpg"));\
        //创建右下角二维码登录图表组件
        JButton jbr1 = new JButton(new ImageIcon("images/right_normal.jpg"));
        jbr1.setFocusPainted(false);
        jbr1.setBorderPainted(false);
        jbr1.setContentAreaFilled(false);
        jbr1.setRolloverIcon(new ImageIcon("images/right_hover.jpg"));
        jbr1.setToolTipText("二维码登录");
        //将底部3个组件添加搭配顶部JPanel
        panel.add(jble);
        panel.add(jb);
        panel.add(jbr1);
        return panel;
    }

    //右侧面部区域
    public static JPanel CreateEastPanel(JFrame jf){
        //创建一个Jpanel左侧面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(100, 0));
        //创建两个JLabel标签组件
        JLabel regeist = new JLabel("注册账号");
        regeist.setForeground(new Color(100,149,238));
        regeist.setBounds(0, 13, 60, 30);
        regeist.setFont(new Font("宋体",0,12));
        //创建两个JPanel右侧面板
        JLabel regentpwd = new JLabel("找回密码");
        regentpwd.setForeground(new Color(100,149,238));
        regentpwd.setBounds(0, 13, 60, 30);
        regentpwd.setFont(new Font("宋体",0,12));
        panel.add(regentpwd);
        panel.add(regeist);
        return panel;
    }
}
