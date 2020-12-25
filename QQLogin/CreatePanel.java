package QQLogin;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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

    //顶部面部区域
    public static JPanel CreateSouthPanel(JFrame jf){
        JPanel panel = new JPanel();
        return panel;
    }

    //右侧面部区域
    public static JPanel CreateEastPanel(JFrame jf){
        JPanel panel = new JPanel();
        return panel;
    }
}
