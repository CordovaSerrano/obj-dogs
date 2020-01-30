
/**
 * Write a description of class Owner here.
 * 
 * @author (Eduardo Javier Cordova Serrano) 
 * @version (January 28th, 2020)
 */
public class Owner
{
    // instance variables - replace the example below with your own
    private int age;
    private Gender gender;
    private Dog dog;
    private String name;
    /**
     * Constructor for objects of class Owner
     */
    public Owner(int age,Gender gender)
    {
        // initialise instance variables
        this.age= age;
        this.gender= gender;
    }
    
    public Owner(int age,Gender gender,String name)
    {
        // initialise instance variables
        this.age= age;
        this.gender= gender;
        this.name= name;
    }
    public void birthday()
    {
        age += 1;
    }
    public void setDog(Dog dog)
    {
        this.dog=dog;
        
        dog.setName("Snoopy");
        this.dog.setName("Snoopy");
        dog.setOwner(name);
    }
    public void setName(String name)
    {
        this.name= name;
    }
     public void setName(String name,String lastname)
    {
        this.name= name +" "+ lastname;
    }
    public String getName()
    {
        return name;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return 
     */
}
