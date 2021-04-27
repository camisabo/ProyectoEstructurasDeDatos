package com.company;

public class cola {

    nodocola init, fina;
    int tama_cola;
    public cola(){
        init=null;
        fina=null;
        tama_cola=0;

    }
    public boolean isEmpty(){
            return init==null;

    }
    public void insertar_Dato(int elemento){
        nodocola dato_a_insertar =new nodocola(elemento);
        if(isEmpty()){
            init=dato_a_insertar;
        }else{
            fina.siguientedato=dato_a_insertar;
        }
        fina=dato_a_insertar;
        tama_cola=tama_cola+1;
    }
    public int dequeue(){
        int dato2=init.dato;
        init=init.siguientedato;
        tama_cola =tama_cola-1;
        return dato2;
    }
    public int cabeza_de_cola(){
        return init.dato;
    }
    public int size_cola(){
        return tama_cola;

    }
}
