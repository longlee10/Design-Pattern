package chainOfResponsibility;

public abstract class Handler {
    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
        if(doHandle(request))
            return;

        if(next != null)
            next.handle(request);
    }

    abstract boolean doHandle(HttpRequest request);
}
