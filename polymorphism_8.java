class polymorphism_8 {
    
    public void sing(){
        System.out.println("tweet tweet tweet");
    } 
 static class cat extends polymorphism_8{
        public void sing(){
        System.out.println("miaw miaw miaw");
        }
    } 
 static class dino extends polymorphism_8{
        public void sing (){
        System.out.println("rawr rawr rawr");
        }
    } 
    public class makan {
    public static void main (String[]args){
        dino a = new dino();
        a.sing();
    }
}
    
}

