package calculations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//@SuppressWarnings("ALL")
@SuppressWarnings("ALL")
public class Calculator extends JFrame {

    // Variables declaration
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnAdd;
    private JButton btnC;
    private JButton btnDiv;
    private JButton btnDot;
    private JButton btnEquals;
    private JButton btnMult;
    private JButton btnPlusOrMinus;
    private JButton btnSub;
    private JTextField txtDisplay;
    private JMenu file;
    private JMenu help;
    private JMenuItem exit;
    private JMenuItem about;
    private JMenuBar mb;
    double firstNum;
    double secondNum;
    double result;
    String operation;

    /**
     * @ plan
     * to overload constructor for the implementation of the scientific version
     */
    public Calculator() {
        super("basic calculator");
        initComponents();
    }


    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    private void initComponents() {

        txtDisplay = new JTextField();
        btn1 = new JButton();
        btn3 = new JButton();
        btn2 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn9 = new JButton();
        btn7 = new JButton();
        btn0 = new JButton();
        btnDot = new JButton();
        btnC = new JButton();
        btnAdd = new JButton();
        btnSub = new JButton();
        btnMult = new JButton();
        btnDiv = new JButton();
        btnPlusOrMinus = new JButton();
        btnEquals = new JButton();
        btn8 = new JButton();

        /**
         * adding menubar to hold menus and menu items
         *
         */
        Font font = new Font("Times New Roman", 1, 12);
        Font font2 = new Font("Times New Roman", 0, 12);
        file = new JMenu("File");
        file.setFont(font);

        help = new JMenu("Help");
        help.setFont(font);
        about = new JMenuItem("about");
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "CAL-Q-LATOR version 1.0 designed by Samson Rasaki");

            }
        });
        help.add(about);

        exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setFont(font2);
        file.add(exit);

        mb = new JMenuBar();
        mb.add(file);
        mb.add(help);

        setJMenuBar(mb);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtDisplay.setFont(new Font("Dialog", 1, 24));
        txtDisplay.setBackground(Color.LIGHT_GRAY);
        txtDisplay.setEditable(false);
        txtDisplay.setHorizontalAlignment(JTextField.RIGHT);

        btn1.setFont(new Font("Dialog", 1, 24));
        btn1.setText("1");
        btn1.addActionListener(Calculator.this::btn1ActionPerformed);

        btn3.setFont(new Font("Dialog", 1, 24));
        btn3.setText("3");
        btn3.addActionListener(Calculator.this::btn3ActionPerformed);

        btn2.setFont(new Font("Dialog", 1, 24));
        btn2.setText("2");
        btn2.addActionListener(Calculator.this::btn2ActionPerformed);

        btn4.setFont(new Font("Dialog", 1, 24));
        btn4.setText("4");
        btn4.addActionListener(Calculator.this::btn4ActionPerformed);

        btn5.setFont(new Font("Dialog", 1, 24));
        btn5.setText("5");
        btn5.addActionListener(Calculator.this::btn5ActionPerformed);

        btn6.setFont(new Font("Dialog", 1, 24));
        btn6.setText("6");
        btn6.addActionListener(Calculator.this::btn6ActionPerformed);

        btn9.setFont(new Font("Dialog", 1, 24));
        btn9.setText("9");
        btn9.addActionListener(Calculator.this::btn9ActionPerformed);

        btn7.setFont(new Font("Dialog", 1, 24));
        btn7.setText("7");
        btn7.addActionListener(Calculator.this::btn7ActionPerformed);

        btn0.setFont(new Font("Dialog", 1, 24));
        btn0.setText("0");
        btn0.addActionListener(Calculator.this::btn0ActionPerformed);

        btnDot.setFont(new Font("Dialog", 1, 36));
        btnDot.setBackground(Color.gray);
        btnDot.setForeground(Color.red);
        btnDot.setText(".");
        btnDot.addActionListener(Calculator.this::btnDotActionPerformed);

        btnC.setFont(new Font("Dialog", 1, 24));
        btnC.setBackground(Color.gray);
        btnC.setForeground(Color.red);
        btnC.setText("CE");
        btnC.addActionListener(Calculator.this::btnCActionPerformed);

        btnAdd.setFont(new Font("Dialog", 1, 36));
        btnAdd.setBackground(Color.gray);
        btnAdd.setForeground(Color.red);
        btnAdd.setText("+");
        btnAdd.addActionListener(Calculator.this::btnAddActionPerformed);

        btnSub.setFont(new Font("Dialog", 1, 36));
        btnSub.setBackground(Color.gray);
        btnSub.setForeground(Color.red);
        btnSub.setText("-");
        btnSub.addActionListener(Calculator.this::btnSubActionPerformed);

        btnMult.setFont(new java.awt.Font("Dialog", 1, 36));
        btnMult.setBackground(Color.gray);
        btnMult.setForeground(Color.red);
        btnMult.setText("*");
        btnMult.addActionListener(Calculator.this::btnMultActionPerformed);

        btnDiv.setFont(new Font("Dialog", 1, 36));
        btnDiv.setForeground(Color.red);
        btnDiv.setBackground(Color.gray);
        btnDiv.setText("/");
        btnDiv.addActionListener(Calculator.this::btnDivActionPerformed);

        btnPlusOrMinus.setFont(new Font("Dialog", 1, 36));
        btnPlusOrMinus.setBackground(Color.darkGray);
        btnPlusOrMinus.setForeground(Color.white);
        btnPlusOrMinus.setText("+/-");
        btnPlusOrMinus.addActionListener(Calculator.this::btnPlusOrMinusActionPerformed);

        btnEquals.setFont(new Font("Dialog", 1, 36));
        btnEquals.setText("=");
        btnEquals.setBackground(Color.darkGray);
        btnEquals.setForeground(Color.white);
        btnEquals.addActionListener(Calculator.this::btnEqualsActionPerformed);

        btn8.setFont(new Font("Dialog", 1, 24));
        btn8.setText("8");
        btn8.addActionListener(Calculator.this::btn8ActionPerformed);

        GroupLayout layout = new GroupLayout(getContentPane());
                            getContentPane().setLayout(layout);
                                      layout.setHorizontalGroup(
                                                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtDisplay, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(btn7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(btnMult, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))))
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(btnPlusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnEquals, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                        .addComponent(btn0, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnDot, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnC, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnDiv, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPlusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn2.getText();
        txtDisplay.setText(takein);
    }

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn7.getText();
        txtDisplay.setText(takein);
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn1.getText();
        txtDisplay.setText(takein);
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn3.getText();
        txtDisplay.setText(takein);
    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn4.getText();
        txtDisplay.setText(takein);
    }

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn5.getText();
        txtDisplay.setText(takein);
    }

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn6.getText();
        txtDisplay.setText(takein);
    }

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn8.getText();
        txtDisplay.setText(takein);
    }

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn9.getText();
        txtDisplay.setText(takein);
    }

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btn0.getText();
        txtDisplay.setText(takein);
    }

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {
        String takein;
        takein = txtDisplay.getText() + btnDot.getText();
        txtDisplay.setText(takein);
    }

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {
        txtDisplay.setText("");
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "+";
    }

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "-";
    }

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "*";
    }

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {
        firstNum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "/";
    }

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {
        String answer;
        secondNum = Double.parseDouble(txtDisplay.getText());
        switch(operation){
            case "+":
                result = firstNum + secondNum;
                answer = String.format("%.0f", result);
                txtDisplay.setText(answer);
                break;

            case "-":
                result = firstNum - secondNum;
                answer = String.format("%.0f", result);
                txtDisplay.setText(answer);
                break;

            case "*":
                result = firstNum * secondNum;
                answer = String.format("%.0f", result);
                txtDisplay.setText(answer);
                break;

            case "/":
                result = firstNum / secondNum;
                answer = String.format("%.0f", result);
                txtDisplay.setText(answer);
                break;

        }
    }

    private void btnPlusOrMinusActionPerformed(java.awt.event.ActionEvent evt) {
        double plusOrMinus = (Double.parseDouble(String.valueOf(txtDisplay.getText())));
        plusOrMinus = plusOrMinus * (-1);
        txtDisplay.setText(String.valueOf(plusOrMinus));
    }


    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        EventQueue.invokeLater(() -> new Calculator().setVisible(true));
    }


}

