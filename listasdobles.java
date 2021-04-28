public class listasDobles {
    private nodoDoble iniciador, fin;

    public listasDobles() {
        iniciador = fin = null;
    }

    public boolean vacio() {
        return iniciador == null;  //saber si está vacía
    }

    public void agregarFinal(int element) {
        if (!vacio()) {
            fin = new nodoDoble(element, null, fin);
            fin.anterior.siguiente = fin;

        } else {
            iniciador = fin = new nodoDoble(element);
        }
    }

    public void agregarInicio(int element) {
        if (!vacio()) {
            iniciador = new nodoDoble(element, iniciador, null);
            iniciador.siguiente.anterior = iniciador;

        } else {
            iniciador = fin = new nodoDoble(element);
        }
    }

    public void mostrarListaIniFin() {
        if (!vacio()) {
            String datos="<=>";
            nodoDoble auxiliar = iniciador;
            while (auxiliar != null) {
                datos=datos+"{"+auxiliar.datico+"}";
                auxiliar=auxiliar.siguiente;
            }
            System.out.println(datos+"mostrando lista");
        }
    }
    public void mostrarListaFinIni() {
        if (!vacio()) {
            String datos="<=>";
            nodoDoble auxiliar = fin;
            while (auxiliar != null) {
                datos=datos+"{"+auxiliar.datico+"}";
                auxiliar=auxiliar.anterior;
            }
            System.out.println(datos+"mostrando lista");
        }
    }
    public int eliminarInicio(){
        int elemento = iniciador.datico;
        if(iniciador==fin){
            iniciador=fin=null;
        }else{
            iniciador=iniciador.siguiente;
            iniciador.anterior=null;

        }
    return elemento;
    }
    public int eliminarFinal(){
        int elemento=fin.datico;
        if(iniciador==fin){
            iniciador=fin=null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
     return elemento;
    }
    }

