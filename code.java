import java.awt.*;
public class CheckboxExample
{
CheckboxExample()
{
Frame f = new Frame("checkbox example");
CheckboxGroup ci = new CheckboxGroup();
Checkbox c = new Checkbox("c",ci,true);
c.setBounds(100,100,50,50);
Checkbox ch = new Checkbox("c++",ci,false);
ch.setBounds(100,150,50,50);
f.add(c);
f.add(ch);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])
{
new CheckboxExample();
}
}
