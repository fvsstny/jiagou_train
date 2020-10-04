package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @className: Component
 * @author: lite
 * @date: 2020/10/4
 */
public class Component {
    private final String type;
    private final String name;
    // 子组件
    private final List<Component> subComponents;

    public Component(String type, String name) {
        this.type = type;
        this.name = name;
        subComponents = new ArrayList<>();
    }

    public static void main(String[] args) {
        Component winForm = new Component("WinForm", "WINDOW窗口");
        Component picture = new Component("Picture", "LOGO图片");
        Component loginButton = new Component("Button", "登录");
        Component regButton = new Component("Button", "注册");
        Component frame = new Component("Frame", "FRAME1");
        Component userNameLable = new Component("Lable", "用户名");
        Component textBox1 = new Component("TextBox", "文本框");
        Component passLable = new Component("Lable", "密码");
        Component passBox = new Component("PasswordBox", "密码框");
        Component checkBox = new Component("CheckBox", "复选框");
        Component textBox2 = new Component("TextBox", "记住用户名");
        Component linkLable = new Component("LinkLable", "忘记密码");

        winForm.addAll(picture, loginButton, regButton, frame);
        frame.addAll(userNameLable, textBox1, passLable, passBox, checkBox, textBox2, linkLable);

        winForm.print();
    }

    public void add(Component component) {
        subComponents.add(component);
    }

    public void addAll(Component... components) {
        subComponents.addAll(Arrays.asList(components));
    }

    public void print() {
        print(this);
        subComponents.forEach(Component::print);
    }

    private void print(Component component) {
        System.out.println("print " + component.type + "(" + component.name + ")");
    }
}