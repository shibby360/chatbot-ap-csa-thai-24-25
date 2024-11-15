import java.util.Scanner;

public class Chatbot {
    public static String doCommand(String strInput) {
        // variables
        Animal panda = new Animal("panda", "e-5");
        Animal monkey = new Animal("monkey", "f-4");
        Animal lion = new Animal("lion", "d-3");
        // Scanner inputs = new Scanner(System.in);
        String[] messages = {
            "Sorry I don't know what you mean, I can answer anything about where the animals are, the nearest bathroom, or contact information. If not interested in any of these topics, type stop to quit.", 
            "I apologize, I am not quite following. I am here to help with directions to animals, restroom locations, or contact details if needed. If not interested in any of these topics, type stop to quit.", 
            "Sorry, I am not sure I understand. I can assist with finding animals, locating the nearest restroom, or providing contact information. If not interested in any of these topics, type stop to quit."
        };
        boolean start = true;
        while (start == true) {
            boolean recognized = false;
            for (String keyword : new String[] {"animals", "bathroom", "contact"}) {
                if (strInput.toLowerCase().contains(keyword)) {
                    recognized = true;
                    if (strInput.toLowerCase().contains("animals")) {
                        // return "What animals would you want to look at, Pandas, Monkeys, or Lions?";
                        // String strInput2 = inputs.nextLine();
                        String strInput2 = "pandas";
                        Animal temp = null;
                        if (strInput2.toLowerCase().contains("panda")){
                            temp = panda;
                        } else if(strInput2.toLowerCase().contains("monkey")) {
                            temp = monkey;
                        } else if(strInput2.toLowerCase().contains("lion")) {
                            temp = lion;
                        }
                        return "Exhibit " + temp.getExhibit() + "\n" + "Would you like to restart the conversation? If not, type stop to exit";
                    }
                }
            }

            if (!recognized) {
                // return (messages[(int)(Math.random() * messages.length)]);
                // String strInput3 = inputs.nextLine();
                String strInput3 = "hi";
                if (strInput3.toLowerCase().equals("stop")) {
                    break;
                }
            }

        }
        // inputs.close();
        return strInput + " ok";
    }
}


        
        

        

    
