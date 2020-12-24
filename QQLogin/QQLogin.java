package QQLogin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

//创建一个QQ登录窗口，并添加布局管理器
public class QQLogin{
    //为QQ登录界面整体初始化一个JFrame窗口
    private static JFrame jf = new JFrame();
    
    //QQ登录窗口初始化方法
    public static void initLogin(){
        jf.setSize(426, 300);       //设置窗口尺寸
        jf.setLocation(497, 242);   //设置窗口在屏幕中显示位置
        jf.setUndecorated(true);    //设置JFrame窗口边缘不显示
        jf.setResizable(false);     //禁止改变窗口的大小

        //根据QQ登录界面的效果，进行布局分配
        BorderLayout border_layout = new BorderLayout();
        jf.setLayout(border_layout);

        //创建并加入顶部面板
        JPanel panel_north = CreatePanel.CreateNorthPanel(jf);
        jf.add(panel_north, BorderLayout.PAGE_START);

        //创建并加入中部模板
        JPanel paner_center = CreatePanel.CreateCenterPanel(jf);
        jf.add(paner_center, BorderLayout.CENTER);

        //创建并加入左侧面板
        JPanel panel_west = CreatePanel.CreateWestPanel(jf);
        jf.add(panel_west, BorderLayout.LINE_START);

        //创建并加入底部面板
        JPanel panel_south = CreatePanel.CreateSouthPanel(jf);
        jf.add(panel_south, BorderLayout.PAGE_END);

        //创建并加入右侧面板
        JPanel panel_east = CreatePanel.CreateEastPanel(jf);
        jf.add(panel_east, BorderLayout.LINE_END);

        //设置窗口可见
        jf.setVisible(true);
    }
}
