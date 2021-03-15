package com.middle.advanced.common.model.mediator.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * 抽象同事类 客户
 **/
public abstract class Customer extends JFrame
        implements ActionListener {
    protected Middum middum;
    protected String name;
    JTextField sentText;
    JTextArea receiveArea;

    public Customer(String name) {
        super(name);
        this.name = name;
    }

    void ClientWindow(int x, int y) {
        Container cp;
        JScrollPane sp;
        JPanel p1, p2;
        cp = this.getContentPane();
        sentText = new JTextField(18);
        receiveArea = new JTextArea(10, 18);
        receiveArea.setEditable(false);
        p1 = new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
        p1.add(receiveArea);
        sp = new JScrollPane(p1);
        cp.add(sp, BorderLayout.NORTH);
        p2 = new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
        p2.add(sentText);
        cp.add(p2, BorderLayout.SOUTH);
        sentText.addActionListener(this);
        this.setLocation(x, y);
        this.setSize(250, 330);
        //窗口大小不可调整
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setMiddum(Middum medium) {
        this.middum = medium;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tempInfo = sentText.getText().trim();
        sentText.setText("");
        this.send(tempInfo);
    }

    public abstract void send(String ad);

    public abstract void receive(String from, String ad);


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
