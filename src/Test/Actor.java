package Test;

public class Actor implements Comparable<Actor> {
    private String firstName;
    private String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

   @Override
    public int compareTo(Actor other){
        int value = this.lastName.compareTo(other.getLastName());
        if (value!=0)
            return value;
        value = this.firstName.compareTo(other.getFirstName());
        return value;
   }
}
