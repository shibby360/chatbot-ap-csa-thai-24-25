public class Chatbot {
    public static boolean animal = false;
    public static boolean bathroom = false;
    public static boolean contact = false;
    public static String doCommand(String strInput) {
        boolean recognized = false;
        Animal panda = new Animal("panda", "e-5");
        Animal monkey = new Animal("monkey", "f-4");
        Animal lion = new Animal("lion", "d-3");
        Animal bear = new Animal("bear", "g-3");
        Bathroom[] bathrooms = {
            new Bathroom("panda", "20 feet north"),
            new Bathroom("monkey", "10 feet east"),
            new Bathroom("lion", "30 feet west"),
            new Bathroom("bear", "40 feet south")
        };
        String[] messages = {
            "Sorry I don't know what you mean, I can answer anything about where the animals are, the nearest bathroom, or contact information. If not interested in any of these topics, type stop to quit.", 
            "I apologize, I am not quite following. I am here to help with directions to animals, restroom locations, or contact details if needed. If not interested in any of these topics, type stop to quit.", 
            "Sorry, I am not sure I understand. I can assist with finding animals, locating the nearest restroom, or providing contact information. If not interested in any of these topics, type stop to quit."
        };
        String lowerStr = strInput.toLowerCase();
        if((lowerStr.contains("panda") || lowerStr.contains("monkey") || lowerStr.contains("lion") || lowerStr.contains("bear")) && !bathroom) { animal = true; }
        if(animal == true) {
            Animal temp = null;
            if(lowerStr.contains("panda")) {
                temp = panda;
                recognized = true;
            } else if(lowerStr.contains("monkey")) {
                temp = monkey;
                recognized = true;
            } else if(lowerStr.contains("lion")) {
                temp = lion;
                recognized = true;
            } else if(lowerStr.contains("bear")) {
                temp = bear;
                recognized = true;
            }
            if(recognized) { 
                animal = false;
                return temp.getName().substring(0,1).toUpperCase() + temp.getName().substring(1) + "s are in in exhibit " + temp.getExhibit() + ".";
            }
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
            } else if(lowerStr.contains("bear")) {
                anim = "bear";
            } else {
                String[] msgs = {
                    "Sorry, I couldn't understand. Closest to which exhibit?",
                    "I didn't get what you were saying. Closest to the pandas, monkeys, lions, or bear exhibit?",

                };
                bathroom = true;
                return (msgs[(int)(Math.random() * msgs.length)]);
            }
            for(Bathroom x : bathrooms) {
                if(x.getExhibit().equals(anim)) {
                    temp = x;
                    break;
                }
            }
            return "The bathroom closest to the " + anim + " exhibit is " + temp.getDirection() + " away from there. \n You can press stop to exit or type another question in the box below.";
        }
        if(contact == true) {
            if(lowerStr.contains("email")) {
                return "Our email is coolzoo@gmail.com \n You can press stop to exit or type another question in the box below.";
            } else if(lowerStr.contains("phone")) {
                return "Our phone number is 925-325-2341 \n You can press stop to exit or type another question in the box below.";
            } else if(lowerStr.contains("instagram")) {
                return "Our instagram is shivankchhaya \n You can press stop to exit or type another question in the box below.";
            }
        }
        if (lowerStr.contains("animal") || lowerStr.contains("exhibit")) {
            animal = true;
            return "What animals would you want to look at, Pandas, Monkeys, Lions, or Bears(one at a time please)?";
        } else if(lowerStr.contains("bathroom")) {
            bathroom = true;
            return "Closest to which exhibit(pandas, monkeys, lions, bears)?";
        } else if(lowerStr.contains("contact")) {
            contact = true;
            return "Would you like our phone number, email, or instagram?";
        } else if(lowerStr.contains("thank")) {
            return "You're welcome! Feel free to ask about animals, bathrooms or contact info. If you aren't interested, press stop to quit.";
        } 
        if(!recognized) {
            recognized = false;
            return (messages[(int)(Math.random() * messages.length)]);
        }
        return (messages[(int)(Math.random() * messages.length)]);
    }
}


        
        

        

    
