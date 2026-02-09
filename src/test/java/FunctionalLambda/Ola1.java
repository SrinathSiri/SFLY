package FunctionalLambda;

interface cab1 {
    public void book(String Source, String Destination);
}

/*class Ola implements cab1{
    public void book(String Source,String Destination){
        System.out.println("Ola cab booked from "+Source+" To "+Destination);
    }
}*/

public class Ola1 {
    public static void main(String[] args) {
        cab1 obj = (Source, Destination) -> {
            System.out.println("Ola cab booked from " + Source + " To " + Destination);
        };
        obj.book("Ameenpur", "Madhapur");
    }
}
