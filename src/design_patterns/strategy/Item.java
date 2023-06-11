package design_patterns.strategy;

public class Item {
    private String itemId;
    private Integer price;

    public Item(String itemId, Integer price) {
        this.itemId = itemId;
        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
