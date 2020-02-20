import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SwingMainFrame implements ActionListener{
  private enum Actions {
   HELLO,
   D2Yaction,
   BILL,
   AreaButton
 }
  JTextArea ta = new JTextArea();
  String amount,aval,bval;
  int temp;
  int to_return;
  int a,b;

  public static void main(String[] args) {

    Swing instance = new Swing();


    JFrame mainframe = new JFrame("all in one");
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setSize(800,400);

//-------------- creating pannels-----------------------
    JPanel selection = new JPanel();
    JPanel getinput = new JPanel();
    JPanel boxpannel = new JPanel();
    JPanel day3 = new JPanel();
//--------------buttons---------------
    JButton salary = new JButton("salary");
    selection.add(salary);
    salary.setActionCommand(Actions.HELLO.name());
    salary.addActionListener(instance);

    JButton d2y = new JButton("day to year");
    selection.add(d2y);
    d2y.setActionCommand(Actions.D2Yaction.name());
    d2y.addActionListener(instance);

    JButton bill = new JButton("bill");
    selection.add(bill);
    bill.setActionCommand(Actions.BILL.name());
    bill.addActionListener(instance);

    JButton dectob = new JButton("123>01101");
    selection.add(dectob);

    selection.setLayout(new FlowLayout(FlowLayout.CENTER));

    JButton Area = new JButton("Aea");
    day3.add(Area);
    Area.setActionCommand(Actions.AreaButton.name());
    Area.addActionListener(instance);



    day3.setLayout(new FlowLayout(FlowLayout.CENTER));





//---------------------Box pannel-------------------------------
    boxpannel.add(selection);
    boxpannel.add(day3);
    boxpannel.setLayout(new GridLayout(3,0));

//--------------------get input ----------------------------
    JLabel label = new JLabel("Enter The input");
    JTextField tf = new JTextField(10);
    JButton send = new JButton("Send");
    JButton reset = new JButton("Reset");
    getinput.add(label);
    getinput.add(tf);
    getinput.add(send);
    getinput.add(reset);


    mainframe.getContentPane().add(BorderLayout.SOUTH,getinput);

    mainframe.getContentPane().add(BorderLayout.CENTER, boxpannel);
    mainframe.getContentPane().add(BorderLayout.NORTH, instance.ta);

    mainframe.setVisible(true);

  }

    public void actionPerformed(ActionEvent evt) {
      Swing abs = new Swing();
      if (evt.getActionCommand() == Actions.HELLO.name()) {
          abs.ta.setText("sad");
          Newframe();

      }
      if (evt.getActionCommand() == Actions.D2Yaction.name()) {

          Dtoy();

      }
      if (evt.getActionCommand() == Actions.BILL.name()) {

          Billprgram();

      }
      if (evt.getActionCommand() == Actions.AreaButton.name()) {
          AreaFrame();

      }
    }

    public void Newframe(){
      JFrame salaryframe = new JFrame("salary");
      salaryframe.setSize(400,400);

      JButton calculate = new JButton("calculate");
      JTextField tf = new JTextField(10);
      JLabel lab = new JLabel("Enter the salary");
      JPanel getinput = new JPanel();
      getinput.add(lab);getinput.add(tf);getinput.add(calculate);
      JTextArea ta = new JTextArea();

      tf.setText("2000");
      JLabel toplab = new JLabel();
      toplab.setText(
      "-------------------"
       +"Welcome to salary calculation"
       +"--------------\n");
       ta.setText("Enter the salar of employee\n");

       calculate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      	amount = tf.getText();
       temp = Integer.parseInt(amount);

        ta.append(salarycalc(temp));
      }
    });

      salaryframe.getContentPane().add(BorderLayout.NORTH,toplab);

      salaryframe.getContentPane().add(BorderLayout.CENTER,ta);
      salaryframe.getContentPane().add(BorderLayout.SOUTH,getinput);

      salaryframe.setVisible(true);
    }

    public void Dtoy(){
      JFrame salaryframe = new JFrame("Day to year");
      salaryframe.setSize(400,400);

      JButton calculate = new JButton("calculate");
      JTextField tf = new JTextField(10);
      JLabel lab = new JLabel("Enter days");
      JPanel getinput = new JPanel();
      getinput.add(lab);getinput.add(tf);getinput.add(calculate);
      JTextArea ta = new JTextArea();

      tf.setText("365");
      JLabel toplab = new JLabel();
      toplab.setText(
      "-------------------"
       +"Welcome to daytoyear calculation"
       +"--------------\n");
       ta.setText("Enter days\n");

       calculate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      	amount = tf.getText();
       temp = Integer.parseInt(amount);

        ta.append(daytoyear(temp));
      }
    });

      salaryframe.getContentPane().add(BorderLayout.NORTH,toplab);

      salaryframe.getContentPane().add(BorderLayout.CENTER,ta);
      salaryframe.getContentPane().add(BorderLayout.SOUTH,getinput);

      salaryframe.setVisible(true);
    }

    public void Billprgram(){
      JFrame salaryframe = new JFrame("calculate bill");
      salaryframe.setSize(400,400);

      JButton calculate = new JButton("calculate");
      JTextField tf = new JTextField(10);
      JLabel lab = new JLabel("Enter unit");
      JPanel getinput = new JPanel();
      getinput.add(lab);getinput.add(tf);getinput.add(calculate);
      JTextArea ta = new JTextArea();

      tf.setText("100");
      JLabel toplab = new JLabel();
      toplab.setText(
      "--------------"
       +"Welcome to electricity bill calculation"
       +"----------\n");
       ta.setText("Enter unit\n");

       calculate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      	amount = tf.getText();
       temp = Integer.parseInt(amount);

        ta.append(Billcalcfunc(temp));
      }
    });

      salaryframe.getContentPane().add(BorderLayout.NORTH,toplab);

      salaryframe.getContentPane().add(BorderLayout.CENTER,ta);
      salaryframe.getContentPane().add(BorderLayout.SOUTH,getinput);

      salaryframe.setVisible(true);
    }

    public void AreaFrame(){
      JFrame salaryframe = new JFrame("calculate area");
      salaryframe.setSize(400,400);

      JButton calculate = new JButton("calculate");
      JTextField atf = new JTextField(4);
      JTextField btf = new JTextField(4);

      JLabel alab = new JLabel("Height");
      JLabel blab = new JLabel("Width");

      JPanel getinput = new JPanel();
      getinput.add(blab);getinput.add(btf);getinput.add(alab);getinput.add(atf);getinput.add(calculate);
      JTextArea ta = new JTextArea();

      atf.setText("10");
      btf.setText("5");
      JLabel toplab = new JLabel();
      toplab.setText(
      "--------------"
       +"Welcome to Area calculation"
       +"----------\n");
       ta.setText("Enter unit\n");

       calculate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      	aval = atf.getText();
        bval = btf.getText();
        a = Integer.parseInt(aval);
        b = Integer.parseInt(bval);
        QuadArea qa = new QuadArea();
        System.out.println("hkhk");
        ta.append(qa.area(a,b));
      }
    });

      salaryframe.getContentPane().add(BorderLayout.NORTH,toplab);

      salaryframe.getContentPane().add(BorderLayout.CENTER,ta);
      salaryframe.getContentPane().add(BorderLayout.SOUTH,getinput);

      salaryframe.setVisible(true);
    }






    String salarycalc(int a){
      double togive = 0;
      if(a<5000){
        double hra = 2000;
        double da = 0.75*a;
        togive = a+hra+da;
      }
      if(a>=5000){
        double hra = 0.2*a;
        double da = 0.5*a;
        togive = a+hra+da;

      }

      String s = "The salary of employee is " + String.format("%f",togive)+"\n";

      return s;

    }

	String daytoyear(int a){
      double togive = 0;
      double abc = 0;
      double bbc = 0;
      double years = 0;
      double months = 0;
      double weeks = 0;
      years = a/365;
      abc = a%365;
      months = abc/30;
      abc = abc%30;
      months = months-abc;
      weeks = abc/7;
      bbc = weeks%7;
      weeks = weeks-bbc;
      String s = String.format("%f ",years)+"years"+String.format("%f ",months)+"days"+String.format("%f ",weeks)+"weeks"+"\n";

      return s;

    }

  String Billcalcfunc(int a){
    return "work under prgress";
  }

}