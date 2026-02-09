package FunctionalLambda;

interface cab3 {
    public void ola3(String Source, String Destination);
}

/*class fuel3 implements cab3{
    public void ola3(String Source,String Destination){
        System.out.println("Ola3 cab booked from "+Source+" To "+Destination);
    }
}*/


public class Ola3 {
    public static void main(String[] args) {
        cab3 obj = (Source, Destination) -> {
            System.out.println("Ola3 cab booked from " + Source + " To " + Destination);
        };
        obj.ola3("Ameenpur", "Madhapur");
    }
}
