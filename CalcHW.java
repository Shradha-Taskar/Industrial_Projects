import javax.swing.*;
import java.awt.event.*;

class MarvellousCalculator implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton badd, bsub, bmul, bdiv;
    JTextField tnum1, tnum2;
    JLabel lnum1, lnum2, lresult,resultlabel;

    public MarvellousCalculator(String tittle, int width, int height)
    {
        fobj = new JFrame(tittle);

        lnum1 = new JLabel("Number 1");
        lnum1.setBounds(50,50,100,30);

        tnum1 = new JTextField();
        tnum1.setBounds(150,50,150,30);

        lnum2 = new JLabel("Number 2");
        lnum2.setBounds(50,100,100,30);

        tnum2= new JTextField();
        tnum2.setBounds(150,100,150,30);

        badd = new JButton("+");
        badd.setBounds(50,160,60,40);

        bsub = new JButton("-");
        bsub.setBounds(120,160,60,40);

        bmul = new JButton("*");
        bmul.setBounds(190,160,60,40);

        bdiv = new JButton("/");
        bdiv.setBounds(260,160,60,40);

        lresult = new JLabel("Result :");
        lresult.setBounds(150,230,100,30);

        resultlabel = new JLabel("");
        resultlabel.setBounds(200,230,200,30);
        
        fobj.add(tnum1);
        fobj.add(tnum2);
        fobj.add(lnum1);
        fobj.add(lnum2);
        fobj.add(badd);
        fobj.add(bsub);
        fobj.add(bmul);
        fobj.add(bdiv);
        fobj.add(lresult);
        fobj.add(resultlabel);

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent aobj)
    {
        try
        {
            int num1 = Integer.parseInt(tnum1.getText());
            int num2 = Integer.parseInt(tnum2.getText());
            int ans = 0;

            if(aobj.getSource() == badd)
            ans = num1 + num2;

            else if(aobj.getSource() == bsub)
            ans = num1 - num2;

            else if(aobj.getSource() == bmul)
            ans = num1 * num2;

            else if(aobj.getSource() == bdiv)
            ans = num1 / num2;

            resultlabel.setText(Integer.toString(ans));
        }
        catch(Exception e)
        {
            resultlabel.setText("Invalid Input");
        }
    }
}

class CalcHW
{
    public static void main(String A[])
    {
        MarvellousCalculator mobj = new MarvellousCalculator("Calculator",400,350);
    }
}