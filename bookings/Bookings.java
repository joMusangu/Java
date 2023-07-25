package bookings;
import javax.swing.JOptionPane;

public class Bookings {
    static boolean td [] [] = new boolean [8] [12];

    public static void main(String[] args) {
        int amount = Integer.parseInt(JOptionPane.showInputDialog("How many tickets?"));
        initialise();
        display();
        for (int i = 0; i < amount; i++) 
        {
            book();
            display();
        }
    }
    
    static void initialise()
    {
        for (int row = 0; row < 8; row++) 
        {
            for (int col = 0; col < 12; col++) 
            {
                td [row] [col] = false;
            }
        }
    }
    
    static void book()
    {
        String input = JOptionPane.showInputDialog("Input seat (row,col)");
        int rowInput = Integer.parseInt(input.substring(0, input.indexOf(",")));
        int colInput = Integer.parseInt(input.substring(input.indexOf(",")+1));
        
        if (td [rowInput] [colInput] == true)
        {
            colInput = 0;
            boolean seat = false;
            while(seat == false)
            {
                String check = JOptionPane.showInputDialog("This seat is taken\nIs seat " + rowInput + ", " + colInput + " ok?\nType yes or no");
                if (check.equalsIgnoreCase("no"))
                {
                    colInput++;
                }
                else
                {
                    td [rowInput] [colInput] = true;
                    seat = true;
                }
            }
        }
        else
        {
            td [rowInput] [colInput] = true;
        }
    }
    
    static void display()
    {
        for (int row = 0; row < 8; row++) 
        {
            for (int col = 0; col < 12; col++) 
            {
                if (td [row] [col] == false) 
                {
                    System.out.print("free ");
                }
                else
                    if(td [row] [col] == true)
                    {
                        System.out.print("booked ");
                    }
            }
            System.out.println();
        }
        System.out.println();
    }
}
