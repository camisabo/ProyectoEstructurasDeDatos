public class listasdobles {
    private nododoble iniciador, fin;

    public listasdobles() {
        iniciador = fin = null;
    }

    public boolean vacio() {
        return iniciador == null;  //saber si está vacía
    }

    public void agregar_final(int element) {
        if (!vacio()) {
            fin = new nododoble(element, null, fin);
            fin.anterior.siguiente = fin;

        } else {
            iniciador = fin = new nododoble(element);
        }
    }

    public void agregar_inicio(int element) {
        if (!vacio()) {
            iniciador = new nododoble(element, iniciador, null);
            iniciador.siguiente.anterior = iniciador;

        } else {
            iniciador = fin = new nododoble(element);
        }
    }

    public void mostrar_lista_inicioxfin() {
        if (!vacio()) {
            String datos="<=>";
            nododoble auxiliar = iniciador;
            while (auxiliar != null) {
                datos=datos+"{"+auxiliar.datico+"}";
                auxiliar=auxiliar.siguiente;
            }
            System.out.println(datos+"mostrando lista");
        }
    }
    public void mostrar_lista_finxinicio() {
        if (!vacio()) {
            String datos="<=>";
            nododoble auxiliar = fin;
            while (auxiliar != null) {
                datos=datos+"{"+auxiliar.datico+"}";
                auxiliar=auxiliar.anterior;
            }
            System.out.println(datos+"mostrando lista");
        }
    }
    public int eliminar_inicio(){
        int elementico=iniciador.datico;
        if(iniciador==fin){
            iniciador=fin=null;
        }else{
            iniciador=iniciador.siguiente;
            iniciador.anterior=null;

        }
        return elementico;
    }
    public int eliminar_final(){
        int elementico=fin.datico;
        if(iniciador==fin){
            iniciador=fin=null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
        return elementico;
    }
    }

