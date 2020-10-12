package tw.clean.code.smell.shop;

public class Item {
    private ItemType itemType;
    private float price;

    public Item(ItemType itemType, float price){
        this.itemType = itemType;
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public float getPrice() {
        return price;
    }
}
