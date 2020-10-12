package tw.clean.code.smell.shop;

import java.util.List;

public class Shop {
    /**
     * Assume shop has inventory and an option for user to select the items
     * **/

    public float checkOut(List<Item> cart){
        float totalPrice = 0;
        for(Item item : cart){
            totalPrice += this.priceInclusiveOfTax(this.discount(item.getPrice(), item), item);
        }
        return totalPrice;
    }

    private float priceInclusiveOfTax(float price, Item item) {
        switch (item.getItemType()){
            case EATABLES:
                return (price + (price * 0.05f));
            case COSMETICS:
                return (price + (price * 0.18f));
            case ELECTRONICS:
                return (price + (price * 0.08f));
            case TOYS:
                return (price + (price * 0.10f));
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemType());
        }
    }

    private float discount(float price, Item item) {
        switch (item.getItemType()){
            case EATABLES:
                return (price - (price * 0.01f));
            case COSMETICS:
                return (price - (price * 0.30f));
            case ELECTRONICS:
                return (price - (price * 0.10f));
            case TOYS:
                return (price - (price * 0.05f));
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemType());
        }
    }
}
