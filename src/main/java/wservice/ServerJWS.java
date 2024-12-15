package wservice;

import javax.xml.ws.Endpoint;

import static java.lang.System.getProperty;

public class ServerJWS {
    public static void main(String[] args) {

        String url = "http://localhost:8787/";
        Endpoint.publish(url,new BanqueW());
        System.out.println("Server published successfully sur :"+url);
        System.out.println(System.getProperty("java.version"));

    }

}
