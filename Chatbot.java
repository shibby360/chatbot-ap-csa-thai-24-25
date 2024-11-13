import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        String[] messages = {"Sorry I don't know what you mean, I can answer anything about where the animals are, the nearest bathroom, or contact information. If not interested in any of these topics, type stop to quit.", "I apologize, I am not quite following. I am here to help with directions to animals, restroom locations, or contact details if needed. If not interested in any of these topics, type stop to quit.", "Sorry, I am not sure I understand. I can assist with finding animals, locating the nearest restroom, or providing contact information. If not interested in any of these topics, type stop to quit."};

        int count = 1;
        boolean start = true;
        while (start == true) {
            System.out.println("Hello there, I am ZooBot! I can help with finding the animal exhibit of your choosing, the nearest bathroom, and provide contact information.");
            String strInput = inputs.nextLine();
            boolean recognized = false;
            for (String keyword : new String[] {"animals", "bathroom", "contact"}) {
                if (strInput.toLowerCase().contains(keyword)) {
                    recognized = true;
                    if (strInput.toLowerCase().contains("animals"))
                        System.out.println("What animals would you want to look at, Pandas, Monkeys, or Lions?");
                        String strInput2 = inputs.nextLine();
                        if (strInput2.toLowerCase().contains("panda") || strInput2.toLowerCase().contains("pandas")){
                            System.out.println("Exhibit E-5");
                            System.out.println("Would you like to restart the conversation? If not, type stop to exit");
                            String strInput4 = inputs.nextLine();
                            if (strInput4.toLowerCase().equals("stop")) {
                                start = false;
                            }
                        }
                    
                }
            }

            if (!recognized) {
                System.out.println(messages[(int)(Math.random() * messages.length)]);
                String strInput3 = inputs.nextLine();
                if (strInput3.toLowerCase().equals("stop")) {
                    break;
                }
            }

        }
        inputs.close();
    }
}


        
        

        

    
