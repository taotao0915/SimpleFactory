public class FruitFactory {
    public static Fruit getFruit(String fruitName) throws IllegalAccessException, InstantiationException {
        if(fruitName.equalsIgnoreCase("Apple")){
            return Apple.class.newInstance();
        }else if(fruitName.equalsIgnoreCase("Banana")){
            return Banana.class.newInstance();
        }else{
            System.out.println("找不到相关水果产品");
            return null;
        }
    }
}
