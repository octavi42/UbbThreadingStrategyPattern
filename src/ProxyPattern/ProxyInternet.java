package ProxyPattern;

public class ProxyInternet implements Internet{

    @Override
    public void connect(){
        System.out.println("access to web");
    }

}
