package design;


//eager way of creating singleton object
//USAGE
//drawback: sometimes client does not even use want the object jalebi
//This problem occurs in huge projects
public class Jalebi {
    private static Jalebi jalebi = new Jalebi();
    public static Jalebi getJalebi(){
        return jalebi;
    }
}
