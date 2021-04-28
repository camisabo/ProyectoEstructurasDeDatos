package com.company;

public class cola {

    nodoCola init, fina;
    int tamCola;
    public cola(){
        init=null;
        fina=null;
        tamCola=0;

    }
    public boolean isEmpty(){
            return init==null;

    }
    public void insertarDato(int elemento){
        nodoCola datoIn =new nodocola(elemento);
        if(isEmpty()){
            init=datoIn;
        }else{
            fina.siguienteDato=datoIn;
        }
        fina=datoIn;
        tamCola=tamCola+1;
    }
    public int dequeue(){
        int dato2=init.dato;
        init=init.siguienteDato;
        tamCola =tamCola-1;
        return dato2;
    }
    public int cabeza(){
        return init.dato;
    }
    public int size(){
        return tamCola;

    }
}
