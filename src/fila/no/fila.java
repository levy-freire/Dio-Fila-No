package fila.no;

public class fila<T> {

    private No<T> refNoEntradaFila;


    public fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {
        No novoNO =  new No(object);
        novoNO.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNO;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNO = refNoEntradaFila;
            while (true){
                if(primeiroNO.getRefNo() != null){
                    primeiroNO= primeiroNO.getRefNo();
                }else {
                    break;
                }
            }
            return(T) primeiroNO.getObject();
        }
        return null;
    }

    public T dequeeu(){
        if(!this.isEmpty()){
            No primeiroNO = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNO.getRefNo() != null){
                    noAuxiliar = primeiroNO;
                    primeiroNO= primeiroNO.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNO.getObject();
        }
        return null;
    }


    public boolean isEmpty() {
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
       String stringRetorno = "";
       No noAuxiliar = refNoEntradaFila;

       if (refNoEntradaFila != null){
           while(true){
               stringRetorno += "[NO{objeto=" + noAuxiliar.getObject() + "}] --->";
               if(noAuxiliar.getRefNo() != null){
                   noAuxiliar = noAuxiliar.getRefNo();
               }else{
                   stringRetorno += "null";
                   break;
               }
           }
       }else{
           stringRetorno = "null";
       }
       return  stringRetorno;
    }
}
