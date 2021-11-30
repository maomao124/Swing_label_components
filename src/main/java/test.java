import javax.swing.*;

import java.awt.*;

import static javax.swing.SwingConstants.CENTER;
/**
 * Project name(项目名称)：Swing标签组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 20:05
 * Version(版本): 1.0
 * Description(描述)：
 * JLabel()：创建无图像并且标题为空字符串的 JLabel。
 * JLabel(Icon image)：创建具有指定图像的 JLabel。
 * JLabel(String text)：创建具有指定文本的 JLabel。
 * JLabel(String textjcon image,int horizontalAlignment)：创建具有指定文本、图像和水平对齐方式的 JLabel，
 * horizontalAlignment 的取值有 3 个，即 JLabel.LEFT、JLabel.RIGHT 和 JLabel.CENTER。
 * JLabel类的常用方法
 * 方法名称	说明
 * void setText(Stxing text)	定义 JLabel 将要显示的单行文本
 * void setIcon(Icon image)	定义 JLabel 将要显示的图标
 * void setIconTextGap(int iconTextGap)	如果 JLabel 同时显示图标和文本，则此属性定义它们之间的间隔
 * void setHorizontalTextPosition(int textPosition)	设置 JLabel 的文本相对其图像的水平位置
 * void setHorizontalAlignment(int alignment)	设置标签内容沿 X 轴的对齐方式
 * int getText()	返回 JLabel 所显示的文本字符串
 * Icon getIcon()	返回 JLabel 显示的图形图像
 * Component getLabelFor()	获得将 JLabel 添加到的组件
 * int getIconTextGap()	返回此标签中显示的文本和图标之间的间隔量
 * int getHorizontalTextPosition()	返回 JLabel 的文本相对其图像的水平位置
 * int getHorizontalAlignment()	返回 JLabel 沿 X 轴的对齐方式
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试");
        JPanel jPanel = new JPanel();
        JLabel label1 = new JLabel("普通标签");
        JLabel label2 = new JLabel();
        label2.setText("settext方法");
        ImageIcon imageIcon = new ImageIcon("t.jpg");
        Font font = new Font("标签3", 1, 30);
        JLabel label3 = new JLabel("标签3", imageIcon, CENTER);
        label3.setFont(font);
        //label2.setIcon(imageIcon);
        label3.setIconTextGap(20);
        label3.setHorizontalTextPosition(CENTER);
        jPanel.add(label1);
        jPanel.add(label2);
        jPanel.add(label3);
        jFrame.add(jPanel);
        jFrame.setLocation(200, 200);
        jFrame.setSize(1280, 720);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
