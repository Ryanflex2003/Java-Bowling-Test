public class Frame {
    public int FirstRollPins = 0;
    public int SecondRollPins = 0;
    public int BonusRollPins = 0;

    public Frame(){}
    public Frame(int firstRollPins) { FirstRollPins = firstRollPins; }
    public Frame(int firstRollPins, int secondRollPins) { FirstRollPins = firstRollPins; SecondRollPins = secondRollPins; }
    public Frame(int firstRollPins, int secondRollPins, int bonusRollPins) {
        FirstRollPins = firstRollPins;
        SecondRollPins = secondRollPins;
        BonusRollPins = bonusRollPins;
    }
}
