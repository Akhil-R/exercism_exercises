public class GameMaster {

    // define a 'describe' method that returns a description of a Character
    public String describe(Character character)
    {
        String formattedMessage = String.format("You're a level %d %s with %d hit points.",character.getLevel(),character.getCharacterClass(),character.getHitPoints());     
        return formattedMessage;
    }

    // define a 'describe' method that returns a description of a Destination
     public String describe(Destination destination)
    {
        String formattedMessage = String.format("You've arrived at %s, which has %d inhabitants.",destination.getName(),destination.getInhabitants());     
        return formattedMessage;
    }

    // define a 'describe' method that returns a description of a TravelMethod
     public String describe(TravelMethod travelMethod)
    {
       if(travelMethod == TravelMethod.WALKING)
       {
           return "You're traveling to your destination by walking.";
       }
        return "You're traveling to your destination on horseback.";
    }

    // define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod)
    {
       return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    // define a 'describe' method that returns a description of a Character and Destination
       public String describe(Character character, Destination destination)
    {
       return describe(character, destination,TravelMethod.WALKING);
    }
}
