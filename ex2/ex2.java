import Currency.*;
import Distance.*;
import Time.*;
import java.util.Scanner;

public class ex2convertor
{
    public static void main(String[] args)
    {
        int code, currency_code, distance_code, time_code;
        Scanner sc = new Scanner(System.in);

        Currencyconvertor c = new Currencyconvertor();
        Distanceconvertor d = new Distanceconvertor();
        Timeconvertor t = new Timeconvertor();

        System.out.println("Enter the code");
        System.out.println("1: Currency");
        System.out.println("2: Distance");
        System.out.println("3: Time");

        code = sc.nextInt();

        if (code == 1)
        {
            System.out.println("Enter the Currency code");
            System.out.println("1: Euro");
            System.out.println("2: Dollar");
            System.out.println("3: Yen");

            currency_code = sc.nextInt();

            if (currency_code == 1)
            {
                c.convertInrToEuro();
                c.convertEuroToInr();
            }
            else if (currency_code == 2)
            {
                c.convertInrToDollar();
                c.convertDollarToInr();
            }
            else if (currency_code == 3)
            {
                c.convertInrToYen();
                c.convertYenToInr();
            }
            else
            {
                System.out.println("Invalid Code");
            }
        }
        else if (code == 2)
        {
            System.out.println("Enter the Distance code");
            System.out.println("1: Meter");
            System.out.println("2: Miles");

            distance_code = sc.nextInt();

            if (distance_code == 1)
            {
                d.convertMeterToKm();
                d.convertKmToMeter();
            }
            else if (distance_code == 2)
            {
                d.convertMilesToKm();
                d.convertKmToMiles();
            }
            else
            {
                System.out.println("Invalid Code");
            }
        }
        else if (code == 3)
        {
            System.out.println("Enter the Time code");
            System.out.println("1: Minutes");
            System.out.println("2: Seconds");

            time_code = sc.nextInt();

            if (time_code == 1)
            {
                t.convertHourToMinute();
                t.convertMinuteToHour();
            }
            else if (time_code == 2)
            {
                t.convertHourToSeconds();
                t.convertSecondsToHour();
            }
            else
            {
                System.out.println("Invalid Code");
            }
        }
        else
        {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}