package fila.no;

public class fila {

    private No refNoEntradaFila;


    public fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNO) {
        novoNO.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNO;
    }

    public No first(){
        if(!this.isEmpty()){
            No primeiroNO = refNoEntradaFila;
            while (true){
                if(primeiroNO.getRefNo() != null){
                    primeiroNO= primeiroNO.getRefNo();
                }else {
                    break;
                }
            }
        }
        return null;
    }

    public No dequeeu(){
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
            return primeiroNO;
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
