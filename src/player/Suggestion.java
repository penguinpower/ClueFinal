package player;

import card.Card;

public class Suggestion {
	private Card room;
	private Card weapon;
	private Card person;
	
	public Suggestion(Card person, Card weapon, Card room){
		this.room = room;
		this.weapon = weapon;
		this.person = person;
	}

	@Override
	public String toString() {
		return room.getName() + ", " + weapon.getName() + ", " + person.getName();
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Suggestion suggestion = (Suggestion) obj;

        return room.equals(suggestion.room) && weapon.equals(suggestion.weapon) && person.equals(suggestion.person);                
    }
	
	public String getRoom() {
		return room.name;
	}
	
	public String getWeapon() {
		return weapon.name;
	}
	
	public String getPerson() {
		return person.name;
	}
}
