package proxy;

public class Proxy implements Subject {
    private int id;
    private RealSubject permission;

    public Proxy(int id) {
        this.id = id;
    }

    public int getId(int id){
        return id;
    }

    @Override
    public void getPermission() {
        if(getId(id) > 100){
            permission =  new RealSubject(id);
            permission.getPermission();
        }
        else {
            System.out.println("Permission denied");
        }
    }
}
