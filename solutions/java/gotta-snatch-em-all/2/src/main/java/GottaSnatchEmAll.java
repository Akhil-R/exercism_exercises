import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
    return new HashSet<> (cards);
    }

    static boolean addCard(String card, Set<String> collection) {       
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iHaveExtra = !myCollection.containsAll(theirCollection);
        boolean theyHaveExtra = !theirCollection.containsAll(myCollection);
        return iHaveExtra && theyHaveExtra;

    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<> (collections.get(0));

        for(Set<String> c : collections){
            common.retainAll(c);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        for(Set<String> c : collections){
            all.addAll(c);
        }
        return all;
    }
}
