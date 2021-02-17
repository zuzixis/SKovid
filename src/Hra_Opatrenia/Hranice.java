/*
    !!!!!!!!very Importnt!!!!!!!!!!
 * Tu čejndž dis licens heder, čúúús Licens Heders in Prodžekt Propertís.
 * Tu čejndž dis templejt fajl, čúúús Tuuls || Templejts
 * end oupn d templejt in d edytor.
    !!!!!!!end of hlasenia!!!!!!!
 */
package Hra_Opatrenia;

/**
 *
 * @author Erik Malina
 */
public class Hranice implements IOpatrenie{

     private boolean zapnute;
    
    public boolean isZapnute() {
        return zapnute;
    }
    
    @Override
    public void zapnutie() {
        zapnute = true;
    }

    @Override
    public void vypnutie() {
        zapnute = false;
    }

    @Override
    public double getIndex() {
        if(zapnute){
            return 0.17; //doplnit index 
        } 
        return 0;//doplnit index 
        
    }
    
}
