package chatting.memory;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame {
   JTextArea area;
   JScrollPane scroll;
   JTextField txt;
   JButton bt;
   ChatA ca;
   public ChatB(ChatA ca){
      area=new JTextArea();
      scroll = new JScrollPane(area);
      txt=new JTextField(18);
      add(scroll, BorderLayout.CENTER);
      add(txt, BorderLayout.SOUTH);
      setVisible(true);
      setBounds(500, 100, 300, 400);   
      this.ca=ca;
      txt.addKeyListener(new KeyAdapter() {
         public void keyReleased(KeyEvent e) {
            if(e.getKeyCode()==e.VK_ENTER) {
               String msg="ChatB : "+txt.getText()+"\n";
               area.append(msg);
               ca.area.append(msg);
               txt.setText("");
            }
         }
      });
   }
}