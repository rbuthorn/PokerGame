import java.util.*;


enum Suits{
    HEARTS, SPADES, CLUBS, DIAMONDS
}

enum cardNames{
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

class Player{
    private Card card1, card2;
    private ArrayList<Card> hand = new ArrayList<>();
    private ArrayList<Card> bestHand = new ArrayList<>();
    private int handVal;

    Player(){

    }

    Player(Card card1, Card card2){
        this.card1 = card1;
        this.card2 = card2;
    }
    public ArrayList<Card> getBestHand(){
        for (Card card : bestHand) {
            System.out.println(card.getCardName() + " of " + card.getSuit());
        }
        return bestHand;
    }
    public void setBestHand(ArrayList<Card> bestHand){
        this.bestHand = bestHand;
    }
    public int getHandVal() {
        return handVal;
    }
    public void setHandVal(int handVal) {
        this.handVal = handVal;
    }
    public ArrayList<Card> getHand() {
        return hand;
    }
    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
    public Card getCard1() {
        return card1;
    }
    public void setCard1(Card card1) {
        this.card1 = card1;
        hand.add(card1);
    }
    public Card getCard2() {
        return card2;
    }
    public void setCard2(Card card2) {
        this.card2 = card2;
        hand.add(card2);
    }

    public void reset(){
        setCard1(null);
        setCard2(null);
        setHand(null);
        setHandVal(8);  //lowest hand value possible
    }

}

class Card{
    private cardNames cardName;
    private Suits suit;
    private int faceValue;

    Card(){

    }

    Card(int faceValue, Suits suit, cardNames cardName){
        this.suit = suit;
        this.faceValue = faceValue;
        this.cardName = cardName;
    }

    public cardNames getCardName() {
        return cardName;
    }
    public void setCardName(cardNames cardName) {
        this.cardName = cardName;
    }

    public Suits getSuit() {
        return suit;
    }
    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public int getFaceValue() {
        return faceValue;
    }
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

}

class deckOfCards{

    ArrayList<Card> Deck = new ArrayList<>();

    public ArrayList<Card> deckBuilder() {

        Deck.add(new Card(14, Suits.DIAMONDS, cardNames.ACE));
        Deck.add(new Card(13, Suits.DIAMONDS, cardNames.KING));
        Deck.add(new Card(12, Suits.DIAMONDS, cardNames.QUEEN));
        Deck.add(new Card(11, Suits.DIAMONDS, cardNames.JACK));
        Deck.add(new Card(10, Suits.DIAMONDS, cardNames.TEN));
        Deck.add(new Card(9, Suits.DIAMONDS, cardNames.NINE));
        Deck.add(new Card(8, Suits.DIAMONDS, cardNames.EIGHT));
        Deck.add(new Card(7, Suits.DIAMONDS, cardNames.SEVEN));
        Deck.add(new Card(6, Suits.DIAMONDS, cardNames.SIX));
        Deck.add(new Card(5, Suits.DIAMONDS, cardNames.FIVE));
        Deck.add(new Card(4, Suits.DIAMONDS, cardNames.FOUR));
        Deck.add(new Card(3, Suits.DIAMONDS, cardNames.THREE));
        Deck.add(new Card(2, Suits.DIAMONDS, cardNames.TWO));

        Deck.add(new Card(14, Suits.SPADES, cardNames.ACE));
        Deck.add(new Card(13, Suits.SPADES, cardNames.KING));
        Deck.add(new Card(12, Suits.SPADES, cardNames.QUEEN));
        Deck.add(new Card(11, Suits.SPADES, cardNames.JACK));
        Deck.add(new Card(10, Suits.SPADES, cardNames.TEN));
        Deck.add(new Card(9, Suits.SPADES, cardNames.NINE));
        Deck.add(new Card(8, Suits.SPADES, cardNames.EIGHT));
        Deck.add(new Card(7, Suits.SPADES, cardNames.SEVEN));
        Deck.add(new Card(6, Suits.SPADES, cardNames.SIX));
        Deck.add(new Card(5, Suits.SPADES, cardNames.FIVE));
        Deck.add(new Card(4, Suits.SPADES, cardNames.FOUR));
        Deck.add(new Card(3, Suits.SPADES, cardNames.THREE));
        Deck.add(new Card(2, Suits.SPADES, cardNames.TWO));

        Deck.add(new Card(14, Suits.HEARTS, cardNames.ACE));
        Deck.add(new Card(13, Suits.HEARTS, cardNames.KING));
        Deck.add(new Card(12, Suits.HEARTS, cardNames.QUEEN));
        Deck.add(new Card(11, Suits.HEARTS, cardNames.JACK));
        Deck.add(new Card(10, Suits.HEARTS, cardNames.TEN));
        Deck.add(new Card(9, Suits.HEARTS, cardNames.NINE));
        Deck.add(new Card(8, Suits.HEARTS, cardNames.EIGHT));
        Deck.add(new Card(7, Suits.HEARTS, cardNames.SEVEN));
        Deck.add(new Card(6, Suits.HEARTS, cardNames.SIX));
        Deck.add(new Card(5, Suits.HEARTS, cardNames.FIVE));
        Deck.add(new Card(4, Suits.HEARTS, cardNames.FOUR));
        Deck.add(new Card(3, Suits.HEARTS, cardNames.THREE));
        Deck.add(new Card(2, Suits.HEARTS, cardNames.TWO));

        Deck.add(new Card(14, Suits.CLUBS, cardNames.ACE));
        Deck.add(new Card(13, Suits.CLUBS, cardNames.KING));
        Deck.add(new Card(12, Suits.CLUBS, cardNames.QUEEN));
        Deck.add(new Card(11, Suits.CLUBS, cardNames.JACK));
        Deck.add(new Card(10, Suits.CLUBS, cardNames.TEN));
        Deck.add(new Card(9, Suits.CLUBS, cardNames.NINE));
        Deck.add(new Card(8, Suits.CLUBS, cardNames.EIGHT));
        Deck.add(new Card(7, Suits.CLUBS, cardNames.SEVEN));
        Deck.add(new Card(6, Suits.CLUBS, cardNames.SIX));
        Deck.add(new Card(5, Suits.CLUBS, cardNames.FIVE));
        Deck.add(new Card(4, Suits.CLUBS, cardNames.FOUR));
        Deck.add(new Card(3, Suits.CLUBS, cardNames.THREE));
        Deck.add(new Card(2, Suits.CLUBS, cardNames.TWO));

        return Deck;
    }

    public void shuffle(ArrayList<Card> deck) {
        Collections.shuffle(deck);
    }
}

class Hand{

    private cardNames card1FV;
    private cardNames card2FV;
    private boolean onSuit;
    private double[] winPercentage;

    Hand(){

    }

    Hand(cardNames fv1, cardNames fv2, boolean onSuit){
        this.card1FV = fv1;
        this.card2FV = fv2;
        this.onSuit = onSuit;
    }

    public double[] getWinPercentage() {
        return winPercentage;
    }

    public void setWinPercentage(double[] winPercentage) {
        this.winPercentage = winPercentage;
    }

    public cardNames getCard1FV() {
        return card1FV;
    }
    public void setCard1FV(cardNames card1fv) {
        card1FV = card1fv;
    }
    public cardNames getCard2FV() {
        return card2FV;
    }
    public void setCard2FV(cardNames card2fv) {
        card2FV = card2fv;
    }
    public boolean isOnSuit() {
        return onSuit;
    }
    public void setOnSuit(boolean onSuit) {
        this.onSuit = onSuit;
    }
}

class tableCards{
    private Card flopCard1, flopCard2, flopCard3, turnCard, riverCard;

    tableCards(){

    }

    public Card getFlopCard1() {
        return flopCard1;
    }

    public void setFlopCard1(Card flopCard1) {
        this.flopCard1 = flopCard1;
    }

    public Card getFlopCard2() {
        return flopCard2;
    }

    public void setFlopCard2(Card flopCard2) {
        this.flopCard2 = flopCard2;
    }

    public Card getFlopCard3() {
        return flopCard3;
    }

    public void setFlopCard3(Card flopCard3) {
        this.flopCard3 = flopCard3;
    }

    public Card getTurnCard() {
        return turnCard;
    }

    public void setTurnCard(Card turnCard) {
        this.turnCard = turnCard;
    }

    public Card getRiverCard() {
        return riverCard;
    }

    public void setRiverCard(Card riverCard) {
        this.riverCard = riverCard;
    }
}

class tableSetup {

    int numOfPlayers = numPlayers();

    Player[] players = new Player[numOfPlayers];

    deckOfCards d = new deckOfCards();
    ArrayList<Card> deck = d.deckBuilder();

    tableCards dealtCards = new tableCards();

    static public int numPlayers() {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many players are there?(including yourself): ");

        return sc.nextInt();
    }

    public void createPlayers() {
        for (int i = 0; i < numOfPlayers; i++) {
            players[i] = new Player();
        }
        System.out.println("player checker: ");
        System.out.println("there are " + numOfPlayers + " players");
        System.out.println();
    }

    public void dealPlayerCards() {
        d.shuffle(deck);

        for (int i = 0; i < numOfPlayers; i++) {
            players[i].setCard1(deck.remove(0));
        }
        for (int i = 0; i < numOfPlayers; i++) {
            players[i].setCard2(deck.remove(0));
        }
    }

    public void dealFlop() {
        dealtCards.setFlopCard1(deck.remove(0));
        dealtCards.setFlopCard2(deck.remove(0));
        //dealtCards.setFlopCard2(new Card(5, Suits.CLUBS));
        dealtCards.setFlopCard3(deck.remove(0));

        for(int i = 0; i < numOfPlayers; i++){
            players[i].getHand().add(dealtCards.getFlopCard1());
            players[i].getHand().add(dealtCards.getFlopCard2());
            players[i].getHand().add(dealtCards.getFlopCard3());
        }

    }

    public void dealTurn() {
        dealtCards.setTurnCard(deck.remove(0));
        //dealtCards.setTurnCard(new Card(8, Suits.SPADES, cardNames.EIGHT));

        for(int i = 0; i < numOfPlayers; i++){
            players[i].getHand().add(dealtCards.getTurnCard());
        }
    }

    public void dealRiver() {
        dealtCards.setRiverCard(deck.remove(0));

        for(int i = 0; i < numOfPlayers; i++){
            players[i].getHand().add(dealtCards.getRiverCard());
        }

        for(int i = 0; i < numOfPlayers; i++) {
            System.out.println();
            System.out.println("player " + i + "'s full hand is: ");

            for (int j = 0; j < players[i].getHand().size(); j++) {
                System.out.println(players[i].getHand().get(j).getCardName() + " of " + players[i].getHand().get(j).getSuit());
            }
        }

    }

    public boolean straightFlush(Player player) {
        ArrayList<Card> SFCopy = new ArrayList<>(player.getHand());

        SFCopy = cardsNotInFlushDeleter(SFCopy);

        if (SFCopy == null) {
            return false;
        }

        ArrayList<Card> wheel = wheelStraightChecker(SFCopy);

        SFCopy = cardsNotInStraightDeleter(SFCopy);

        if(SFCopy == null){
            if (wheel == null) {
                return false;
            }
            else {
                player.setBestHand(wheel);
                player.setHandVal(0);
                return true;
            }
        }

        sortCombinedCards(SFCopy);

        ArrayList<Card> highestSF = new ArrayList<>();

        for(int i = 1; i < 6; i++){
            highestSF.add(SFCopy.get(SFCopy.size()-i));
        }

        if(!fiveCardFlushChecker(highestSF) || !fiveCardStraightChecker(highestSF)){
            return false;
        }

        player.setBestHand(highestSF);
        player.setHandVal(0);
        return true;
    }

    public boolean fourOfAKind(Player player) {
        ArrayList<Card> FOAKCopy = new ArrayList<>(player.getHand());
        ArrayList<Card> holder = new ArrayList<>(FOAKCopy);

        int FOAK = FOAKChecker(FOAKCopy);

        if(FOAK == 0){
            return false;
        }

        removeNonDuplicateFaceValues(holder, FOAK);

        removeDuplicateFaceValues(FOAKCopy, FOAK);

        sortCombinedCards(FOAKCopy);

        holder.add(FOAKCopy.get(FOAKCopy.size()-1));

        player.setBestHand(holder);
        player.setHandVal(1);

        return true;
    }

    public boolean fullHouse(Player player) {
        ArrayList<Card> FHCopy = new ArrayList<>(player.getHand());
        ArrayList<Card> FHCopyForHand = new ArrayList<>(player.getHand());

        int highestTOAK = TOAKChecker(FHCopy);

        if(highestTOAK == 0){
            return false;
        }

        for (Card card : FHCopy) {
            if (card.getFaceValue() == highestTOAK) {
                FHCopyForHand.add(card);
            }
            if(FHCopyForHand.size() == 3){
                break;
            }
        }

        removeDuplicateFaceValues(FHCopy, highestTOAK);

        int highestPair = pairChecker(FHCopy);

        if(highestPair == 0){
            return false;
        }

        for (Card card : FHCopy) {
            if (card.getFaceValue() == highestPair) {
                FHCopyForHand.add(card);
            }
            if(FHCopyForHand.size() == 5){
                break;
            }
        }

        player.setBestHand(FHCopyForHand);
        player.setHandVal(2);
        return true;
    }

    public boolean Flush(Player player) {
        ArrayList<Card> FCopy = new ArrayList<>(player.getHand());

        FCopy = cardsNotInFlushDeleter(FCopy);

        if(FCopy == null) {
            return false;
        }

        sortCombinedCards(FCopy);

        ArrayList<Card> highestFlush = new ArrayList<>();

        for(int i = 1; i < 6; i++){
            highestFlush.add(FCopy.get(FCopy.size()-i));
        }

        if(!fiveCardFlushChecker(highestFlush)){
            return false;
        }

        player.setBestHand(highestFlush);
        player.setHandVal(3);

        return true;
    }

    public boolean Straight(Player player) {
        ArrayList<Card> SCopy = new ArrayList<>(player.getHand());

        //copy and paste whole code and simply check that all the win cases work - edge cases and everything.

        ArrayList<Card> wheel = wheelStraightChecker(SCopy);

        SCopy = cardsNotInStraightDeleter(SCopy);

        if(SCopy == null) {
            if (wheel == null) {
                return false;
            }
            else {
                player.setBestHand(wheel);
                player.setHandVal(4);
                return true;
            }
        }

        sortCombinedCards(SCopy);

        player.setBestHand(SCopy);
        player.setHandVal(4);

        return true;
    }

    public boolean TOAK(Player player) {
        ArrayList<Card> TOAKCopy = new ArrayList<>(player.getHand());
        ArrayList<Card> holder = new ArrayList<>(TOAKCopy);

        int highestTOAK = TOAKChecker(TOAKCopy);

        if(highestTOAK == 0){
            return false;
        }

        //sets player.bestHand to the three of a kind plus the next highest two cards
        //holder holds the cards in the three of a kind, TOAKCopy then holds all cards but the three of a kind,
        //and finds the highest next two cards

        removeNonDuplicateFaceValues(holder, highestTOAK);

        removeDuplicateFaceValues(TOAKCopy, highestTOAK);

        sortCombinedCards(TOAKCopy);

        holder.add(TOAKCopy.get(TOAKCopy.size()-1));
        holder.add(TOAKCopy.get(TOAKCopy.size()-2));

        player.setBestHand(holder);
        player.setHandVal(5);

        return true;
    }

    public boolean twoPair(Player player) {
        ArrayList<Card> TPCopy = new ArrayList<>(player.getHand());
        ArrayList<Card> TPCopyForHand = new ArrayList<>(player.getHand());

        int highestPair1 = pairChecker(TPCopy);

        if(highestPair1 == 0){
            return false;
        }

        for (Card card : TPCopy) {
            if (card.getFaceValue() == highestPair1) {
                TPCopyForHand.add(card);
            }
            if(TPCopyForHand.size() == 2){
                break;
            }
        }

        removeDuplicateFaceValues(TPCopy, highestPair1);

        int highestPair2 = pairChecker(TPCopy);

        if(highestPair2 == 0){
            return false;
        }

        for (Card card : TPCopy) {
            if (card.getFaceValue() == highestPair2) {
                TPCopyForHand.add(card);
            }
            if(TPCopyForHand.size() == 4){
                break;
            }
        }

        removeDuplicateFaceValues(TPCopy, highestPair2);

        TPCopyForHand.add(TPCopy.get(TPCopy.size()-1));

        player.setBestHand((TPCopyForHand));
        player.setHandVal(6);

        return true;
    }

    public boolean Pair(Player player) {
        ArrayList<Card> PCopy = new ArrayList<Card>(player.getHand());

        ArrayList<Card> holder = new ArrayList<>(PCopy);

        int highestPair = pairChecker(PCopy);

        if(highestPair == 0){
            return false;
        }

        removeNonDuplicateFaceValues(holder, highestPair);

        removeDuplicateFaceValues(PCopy, highestPair);

        sortCombinedCards(PCopy);

        holder.add(PCopy.get(PCopy.size()-1));
        holder.add(PCopy.get(PCopy.size()-2));
        holder.add(PCopy.get(PCopy.size()-3));

        player.setBestHand(holder);
        player.setHandVal(7);

        return true;
    }

    public void highCards(Player player) {

        ArrayList<Card> highCards = new ArrayList<>();

        sortCombinedCards(player.getHand());

        for(int i = 1; i < 6; i++){
            highCards.add(player.getHand().get(player.getHand().size()-i));
            }

        player.setBestHand(highCards);
    }

    public ArrayList<Card> wheelStraightChecker(ArrayList<Card> a){
        removeDuplicateFaceValues(a);

        ArrayList<Card> wheelStraight = new ArrayList<>();

        for(Card card: a){
            if(card.getFaceValue() == 14){
                wheelStraight.add(card);
            }
            if(card.getFaceValue() == 2){
                wheelStraight.add(card);
            }
            if(card.getFaceValue() == 3){
                wheelStraight.add(card);
            }
            if(card.getFaceValue() == 4){
                wheelStraight.add(card);
            }
            if(card.getFaceValue() == 5){
                wheelStraight.add(card);
            }
        }
        if(wheelStraight.size() == 5){
            return wheelStraight;
        }
        return null;
    }

    public int FOAKChecker(ArrayList<Card> a){

        //returns 0 if no FOAK in hand
        //returns face value of FOAK if there exists one

        int highestFOAK = 0;

        sortCombinedCards(a);

        for (int i = 0; i < a.size()-3; i++) {
            if(a.get(i).getFaceValue() == a.get(i+1).getFaceValue() &&
                    a.get(i+1).getFaceValue() == a.get(i+2).getFaceValue() &&
                    a.get(i+2).getFaceValue() == a.get(i+3).getFaceValue()){
                highestFOAK = a.get(i).getFaceValue();
            }
        }
        return highestFOAK;
    }

    public int TOAKChecker(ArrayList<Card> a) {

        //returns 0 if no TOAK in hand
        //returns face value of highest TOAK in hand if there exists one

        int highestTOAK = 0;

        sortCombinedCards(a);

        for (int i = 0; i < a.size() - 2; i++) {
            if (a.get(i).getFaceValue() == a.get(i + 1).getFaceValue() &&
                    a.get(i + 1).getFaceValue() == a.get(i + 2).getFaceValue()) {

                if (a.get(i).getFaceValue() > highestTOAK) {
                    highestTOAK = a.get(i).getFaceValue();
                    i += 2;
                }
            }
        }
        return highestTOAK;
    }

    public int pairChecker(ArrayList<Card> a){

        //returns 0 if no pair in hand
        //returns face value of highest [air in hand if there exists one

        int highestPair = 0;

        sortCombinedCards(a);

        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i).getFaceValue() == a.get(i + 1).getFaceValue()) {

                if (a.get(i).getFaceValue() > highestPair) {
                    highestPair = a.get(i).getFaceValue();
                    i += 1;
                }
            }
        }
        return highestPair;
    }

    public void removeNonDuplicateFaceValues(ArrayList<Card> a, int faceValue){

        ArrayList<Card> duplicates = new ArrayList<>();

        for (Card card : a) {
            if (card.getFaceValue() != faceValue) {
                duplicates.add(card);
            }
        }
        for (Card duplicate : duplicates) {

            a.remove(duplicate);
        }
    }

    public void removeDuplicateFaceValues(ArrayList<Card> a, int faceValue){
        ArrayList<Card> duplicates = new ArrayList<>();

        for (Card card : a) {
            if (card.getFaceValue() == faceValue) {
                duplicates.add(card);
            }
        }
        for (Card duplicate : duplicates) {

            a.remove(duplicate);
        }
    }

    public void removeDuplicateFaceValues(ArrayList<Card> h) {
        ArrayList<Card> duplicates = new ArrayList<>();

        sortCombinedCards(h);

        for(int i = 0; i < h.size()-1; i++){

                if(h.get(i).getFaceValue() == h.get(i+1).getFaceValue()) {
                    duplicates.add(h.get(i+1));
                }
            }
        for (Card duplicate : duplicates) {

            h.remove(duplicate);
        }
    }

    public ArrayList<Card> cardsNotInFlushDeleter(ArrayList<Card> a){

        //returns the new hand with only the cards in the flush

        int j = 0;  //counter
        Suits s = suitOfFlushInHand(a);
        if (s == null) {
            return null;
        }

        while(j < a.size()){
            if(a.get(j).getSuit() != s) {
                a.remove(j);
            }
            else{
                j++;
            }
        }
        return a;
    }

    public ArrayList<Card> cardsNotInStraightDeleter(ArrayList<Card> a){
        ArrayList<Card> straightList = new ArrayList<>();

        removeDuplicateFaceValues(a);

        sortCombinedCards(a);
        int i = 1;
        while(i < a.size()-1){
            if(a.get(a.size()-i).getFaceValue() == a.get(a.size()-1-i).getFaceValue()+ 1){
                straightList.add(a.get(a.size()-i));
            }
            else{
                straightList.clear();
            }
            if(straightList.size() == 5){
                break;
            }
            i++;
        }
        if(straightList.size() < 5){
            return null;
        }
        return straightList;
    }


        public Suits suitOfFlushInHand(ArrayList<Card> SFCopy) {

    //returns the suit of the flush in a player's hand if there is one. if there is not a flush, returns null

        int dCount = 0;
        int sCount = 0;
        int cCount = 0;
        int hCount = 0;

            for (Card card : SFCopy) {
                if (card.getSuit().equals(Suits.DIAMONDS)) {
                    dCount++;
                }
                if (card.getSuit().equals(Suits.SPADES)) {
                    sCount++;
                }
                if (card.getSuit().equals(Suits.CLUBS)) {
                    cCount++;
                }
                if (card.getSuit().equals(Suits.HEARTS)) {
                    hCount++;
                }
            }

        if(dCount > 4) {
            return Suits.DIAMONDS;
        }
        else if(sCount > 4) {
            return Suits.SPADES;
        }
        else if(cCount > 4) {
            return Suits.CLUBS;
        }
        else if(hCount > 4) {
            return Suits.HEARTS;
        }
        return null;
    }

    public void sortCombinedCards(ArrayList<Card> a) {

        //sorts cards in ascending order
        for(int i = 0; i < a.size(); i++) {

            for(int j = i; j < a.size(); j++) {

                if(a.get(i).getFaceValue() > a.get(j).getFaceValue()) {
                    Collections.swap(a, i, j);
                }
            }
        }
    }

    public boolean fiveCardStraightChecker(ArrayList<Card> a){
        sortCombinedCards(a);

        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getFaceValue() != (a.get(i+1).getFaceValue() - 1)){
                return false;
            }
            if(i==3){
                return true;
            }
        }
        return false;
    }

    public boolean fiveCardFlushChecker(ArrayList<Card> a){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getSuit() != (a.get(i+1).getSuit())){
                return false;
            }
            if(i==4){
                return true;
            }
        }
        return false;
    }
}


public class Poker {
    public static void main(String[] args) {

            tableSetup[] games = new tableSetup[10];

            int i = 0;

            while (i < 10) {

                games[i] = new tableSetup();
                games[i].createPlayers();
                games[i].dealPlayerCards();
                games[i].dealFlop();
                games[i].dealTurn();
                games[i].dealRiver();


                for (int k = 0; k < games[i].players.length; k++) {

                    System.out.println();
                    System.out.println("Player " + k + ": ");

                    System.out.println("Straight Flush: " + games[i].straightFlush(games[i].players[k]));
                    System.out.println("Four of a kind: " + games[i].fourOfAKind(games[i].players[k]));
                    System.out.println("Full House: " + games[i].fullHouse(games[i].players[k]));
                    System.out.println("Flush: " + games[i].Flush(games[i].players[k]));
                    System.out.println("Straight: " + games[i].Straight(games[i].players[k]));
                    System.out.println("Three of a kind: " + games[i].TOAK(games[i].players[k]));
                    System.out.println("Two Pair: " + games[i].twoPair(games[i].players[k]));
                    System.out.println("Pair: " + games[i].Pair(games[i].players[k]));
                    System.out.println();

                    games[i].players[k].getBestHand();
                }
                i++;
            }
        }
    }

//        public Hand[] setHands () {
//            int i = 0;
//            Hand[] hands = new Hand[169];
//            List<cardNames> cardList = cardNames.getCardNames();
//            for (cardNames a : cardNames.values()) {
//                for (cardNames b : cardList) {
//                    hands[i] = new Hand(a, b, false);
//                    if (a != b) {
//                        hands[i] = new Hand(a, b, true);
//                    }
//                    i++;
//                }
//                cardList.remove(0);
//            }
//            return hands;
//        }
//    }
