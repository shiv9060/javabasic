class Computer{
    public void playMusic()
    {
       System.out.println("Music playing..");
    }

    public String getMeAPen(int cost)
    {
        return "Pen";
    }
}
public class met {
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        
    }
    
}
