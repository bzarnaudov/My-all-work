package stacksAndQueues;

public class Item {
	public int value;
    public Item previousItem;

    public Item(int value, Item previousItem) {
        this.value = value;
        this.previousItem = previousItem;
    }
}
