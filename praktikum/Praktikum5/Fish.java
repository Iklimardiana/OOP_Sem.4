public class Fish {
    String typeOfFish;
    int friendliness;

    public Fish(){
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    Fish(String newTypeOfFish, int newFriendliness){
        typeOfFish = newTypeOfFish;
        friendliness = newFriendliness;
    }

    void setTypeOfFish(String newTypeOfFish){
        typeOfFish= newTypeOfFish;
    }

    void setFriendliness(int newFriendliness){
        friendliness = newFriendliness;
    }


    String getTypeOfFish(){
        return typeOfFish;
    }
    int getFriendliness(){
        return friendliness;
    }

    Fish nicestFish(Fish obj1, Fish obj2){
        if(obj1.getFriendliness()>obj2.getFriendliness()){
            return obj1;
        }else{
            return obj2;
        }

    }
    public static void main(String[] args){
        Fish Amber = new Fish("Angel Fish", 5);
        Fish James = new Fish("Guppy", 3);
        Fish Nice = Amber.nicestFish(Amber, James);
        System.out.println("Nicest Fish: "+Nice.getTypeOfFish());
    }

}
