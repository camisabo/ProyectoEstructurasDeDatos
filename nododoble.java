public class nododoble {
    public int datico;
    nododoble siguiente,anterior;
    public nododoble(int element){
        this(element,null,null);//para cuando aún no hay nodos
    }
    public nododoble(int element, nododoble sig, nododoble ante){
        datico=element;
        siguiente=sig;
        anterior=ante;   //para cuando ya hay nodos
    }

}
