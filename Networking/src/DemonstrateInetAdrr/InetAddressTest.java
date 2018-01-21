package DemonstrateInetAdrr;
import java.net.*;

public class InetAddressTest {

    public static void main(String args[]) throws UnknownHostException
    {
        InetAddress adress = InetAddress.getLocalHost();
        System.out.println(adress);

        adress = InetAddress.getByName("www.facebook.com");
        System.out.println(adress);

        InetAddress SW[] = InetAddress.getAllByName("free.facebook.com");
        for (int i = 0; i<SW.length ; i++)
        {
            System.out.println(SW[i]);
        }
    }

}
