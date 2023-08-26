// public class MultipleInherit {

    class MultipleInherit    
{    interface Herbivore
    {
        void eats_meat();
        //void eats_plants();
    }
    //interface Carnivore
    // {
    //     void eats_meat();
    // }

   class Bear implements Herbivore//,Carnivore
    {
        public void eats_meat()
        {
            System.out.println("Bears eats fishes");
        }

        // public void eats_plants()
        // {
        //     System.out.println("Bear eats fruits also");
        // }
    }

    
    public static void main(String args[])
    {
        Bear b =new Bear();
        // b=new Bear();
        b.eats_meat();
       // b.eats_plants();
    }
    

}