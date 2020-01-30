
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    private Breed breed;
    private String ownername;
    private Owner owner;

    /**
     * Constructor for objects of class Dog
     */
    public Dog(int age,Breed breed)
    {
        // initialise instance variables
        this.age=age;
        this.breed= breed;
    }
    public void setOwner(String name)
    {   
        this.ownername= name;
    }
    public void setName(String name)
    {   
        this.name= name;
    }
    public String getName()
    {
        return name;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
