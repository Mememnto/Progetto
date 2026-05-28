package Controller;

import java.util.ArrayList;

public class OrdinazioneControllerStub {
    public static boolean salvaOrdinazione(ArrayList<String> piatti, ArrayList<Integer> quantita){
       /* System.out.println("OrdinazioneControllerStub.salvaOrdinazione()");
        System.out.println("piatto: " + piatto);
        System.out.println("quantita: " + quantita);*/
        //if() dovrei fare altri controlli tipo se il piatto è disponibile e se la cucina è aperta o altri.... ma non enso debba essere così complicato il codice
        for(int i=0;i<quantita.size();i++){
            if(quantita.get(i)==0) {
                return false;
            }else if(quantita.get(i)>0) return true;
        }
        return false;
    }
}
