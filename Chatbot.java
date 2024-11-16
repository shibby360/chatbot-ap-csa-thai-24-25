import java.util.Scanner;

public class Chatbot {
    public static boolean animal = false;
    public static String doCommand(String strInput) {
    
        Scanner inputs = new Scanner(System.in);
        Animal panda = new Animal("panda", "e-5");
        Animal monkey = new Animal("monkey", "f-4");
        Animal lion = new Animal("lion", "d-3");
        String[] messages = {"Sorry I don't know what you mean, I can answer anything about where the animals are, the nearest bathroom, or contact information. If not interested in any of these topics, type stop to quit.", "I apologize, I am not quite following. I am here to help with directions to animals, restroom locations, or contact details if needed. If not interested in any of these topics, type stop to quit.", "Sorry, I am not sure I understand. I can assist with finding animals, locating the nearest restroom, or providing contact information. If not interested in any of these topics, type stop to quit."};

        int count = 1;
        // return ("Hello there, I am ZooBot! I can help with finding the animal exhibit of your choosing, the nearest bathroom, and provide contact information.");
        // String strInput = inputs.nextLine();
        boolean recognized = false;
        if(strInput.toLowerCase().contains("animals") || strInput.toLowerCase().contains("bathroom") || strInput.toLowerCase().contains("contact")) {
            recognized = true;
        }
        if (strInput.toLowerCase().contains("animals")) {
            animal = true;
            return ("What animals would you want to look at, Pandas, Monkeys, or Lions?");
        }
        if(animal == true) {
            Animal temp = null;
            if(strInput.toLowerCase().contains("panda")) {
                temp = panda;
            } else if(strInput.toLowerCase().contains("monkey")) {
                temp = monkey;
            } else if(strInput.toLowerCase().contains("lion")) {
                temp = lion;
            }
            animal = false;
            return "Exhibit " + temp.getExhibit() + "\n" + " Would you like to restart?";
        }
        if (!recognized) {
            return (messages[(int)(Math.random() * messages.length)]);

            
            // if (strInput.toLowerCase().equals("stop")) {
            //     return "stop";
            // }
        }
        // inputs.close();
        return strInput + " ok";
    }
}


        
        

        

    
