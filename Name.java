/*
 * Class that implments the NameADT interface. 
 */
package linearList;

/**
 *
 * @author NicholasFerrara
 */
class Name implements NameADT {

    String first;
    String last;
    String initals;

    public Name(String firstName, String lastName) {
        first = firstName;
        last = lastName;

    }

    @Override
    public String first() {
        return first;
    }

    @Override
    public String last() {
        return last;
    }

    
    public String toString() {
        return first + " " + last;

    }

    
    public String initials() {
        String firstInital = first.substring(0, 1);
        String lastInital = last.substring(0, 1);
        initals = firstInital + lastInital;
        return initals;

    }

}
