public class Chatbot {
    public static boolean animal = false;
    public static boolean bathroom = false;
    public static String doCommand(String strInput) {
        Animal panda = new Animal("panda", "e-5");
        Animal monkey = new Animal("monkey", "f-4");
        Animal lion = new Animal("lion", "d-3");
        Bathroom[] bathrooms = {
            new Bathroom("panda", "20N 50W"),
            new Bathroom("monkey", "10S 30E"),
            new Bathroom("lion", "30N 10E")
        };
        String[] messages = {
            "Sorry I don't know what you mean, I can answer anything about where the animals are, the nearest bathroom, or contact information. If not interested in any of these topics, type stop to quit.", 
            "I apologize, I am not quite following. I am here to help with directions to animals, restroom locations, or contact details if needed. If not interested in any of these topics, type stop to quit.", 
            "Sorry, I am not sure I understand. I can assist with finding animals, locating the nearest restroom, or providing contact information. If not interested in any of these topics, type stop to quit."
        };
        String lowerStr = strInput.toLowerCase();
        if(animal == true) {
            Animal temp = null;
            if(lowerStr.contains("panda")) {
                temp = panda;
            } else if(lowerStr.contains("monkey")) {
                temp = monkey;
            } else if(lowerStr.contains("lion")) {
                temp = lion;
            }
            animal = false;
            return "Exhibit " + temp.getExhibit() + "\n You can press stop to exit.";
        }
        if(bathroom == true) {
            bathroom = false;
            String anim = null;
            Bathroom temp = null;
            if(lowerStr.contains("panda")) {
                anim = "panda";
            } else if(lowerStr.contains("monkey")) {
                anim = "monkey";
            } else if(lowerStr.contains("lion")) {
                anim = "lion";
            } else {
                String[] msgs = {
                    "Sorry, I couldn't understand. Closest to which exhibit?",
                    "I didn't get what you were saying. Closest to the pandas, monkeys, or lion exhibit?"
                };
                bathroom = true;
                return (msgs[(int)(Math.random() * msgs.length)]);
            }
            for(Bathroom x : bathrooms) {
                if(x.getExhibit() == anim) {
                    temp = x;
                    break;
                }
            }
            return "The bathroom closest to the " + anim + " exhibit is " + temp.getDirection() + " away from there." + "\n You can press stop to exit.";
        }
        if (lowerStr.contains("animal")) {
            animal = true;
            return "What animals would you want to look at, Pandas, Monkeys, or Lions?";
        } else if(lowerStr.contains("bathroom")) {
            bathroom = true;
            return "Closest to which exhibit(pandas, monkeys, lions)?";
        } else if(lowerStr.contains("contact")) {
            return "Our email is: coolzoo@gmail.com.\nOur phone number is 123-555-1234.";
        } else if(lowerStr.contains("thank")) {
            return "You're welcome! Feel free to ask about animals, bathrooms or contact info. If you aren't interested, press stop to quit.";
        } else {
            return (messages[(int)(Math.random() * messages.length)]);
        }
        // return strInput + " ok";
    }
}


        
        

        

    
