public class ServerApp {
    public static void main(String[] args)  {
        System.out.println(new BaseAuthService().findByLoginAndPassword("l1", "p1"));
    }
}