package ProxyPattern;

public class RealInternet implements Internet {

    ProxyInternet proxyInternet = new ProxyInternet();

    @Override
    public void connect(){
        System.out.println("connect");
    }

}
