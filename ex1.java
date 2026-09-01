import java.util.Scanner;

public class ebill {
    public static void main(String[] args) {
        Consumer ob = new Consumer();
        ob.Getdata();
        ob.Calc();
        ob.Display();
    }
}

class Consumer {
    Scanner in = new Scanner(System.in);
    int cno;
    String cname, type_of_conn;
    double pre_reading, curr_reading, unit_consumed, tbill;

    void Getdata() {
        System.out.print("Enter Consumer number: ");
        cno = in.nextInt();
        in.nextLine();

        System.out.print("Enter Consumer name: ");
        cname = in.nextLine();

        System.out.print("Enter Type of Connection (domestic/commercial): ");
        type_of_conn = in.nextLine();

        System.out.print("Enter current Reading: ");
        pre_reading = in.nextDouble();

        System.out.print("Enter previous Reading: ");
        curr_reading = in.nextDouble();
    }

    void Calc() {
        unit_consumed = curr_reading - pre_reading;

        if (type_of_conn.equalsIgnoreCase("domestic")) {
            if (unit_consumed <= 100)
                tbill = unit_consumed * 1;
            else if (unit_consumed <= 200)
                tbill = unit_consumed * 2.5;
            else if (unit_consumed <= 500)
                tbill = unit_consumed * 4;
            else
                tbill = unit_consumed * 6;
        } else if (type_of_conn.equalsIgnoreCase("commercial")) {
            if (unit_consumed <= 100)
                tbill = unit_consumed * 2;
            else if (unit_consumed <= 200)
                tbill = unit_consumed * 4.5;
            else if (unit_consumed <= 500)
                tbill = unit_consumed * 6;
            else
                tbill = unit_consumed * 7;
        }
    }

    void Display() {
        System.out.println("Customer Name: " + cname);
        System.out.println("Units Consumed: " + unit_consumed);
        System.out.println("Total Bill: Rs. " + tbill);
    }
}
