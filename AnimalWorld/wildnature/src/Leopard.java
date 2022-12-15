public class Leopard extends Animal {
    public Leopard(String name , String ears , String color , String eyes , int legs , int wings , String meal , float weight){
        super(name,ears,color,eyes,legs,wings,meal,weight);
    }

    @Override
    public void Continents() {
        System.out.println( name + " usually lives in South-America , tropics like Amazon");
    }

    @Override
    public float Amount_food() {
        return 1 ;
    }


    public String skinType() {

        return this.name + "s skin color is tawny yellow and its fur presents" + "\n" +
                " densely packed dark irregular black rosettes " + "\n" +
                this.name + " cat is a small wild cat and its skin had yellowish ground color" + "\n" +
                ". Two distinct dark stripes extending between eyes and ears, black spots on dorsum" + "\n" +
                " are its characteristic feature";
    }

    @Override
    public String getSkin() {
        return skin;
    }

    @Override
    public void diet(){
        System.out.println(" Any meat , rabbits  , gazels , bywols ");
    }


}
