/**
 * The type Food item.
 */
public class FoodItem {
    /**
     * Instantiates a new Food item.
     *
     * @param name         the name
     * @param pricePerUnit the price per unit
     * @param quantity     the quantity
     */
    public FoodItem(String name, Double pricePerUnit, Integer quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Price per unit.
     */
    protected Double pricePerUnit;
    /**
     * The Quantity.
     */
    protected Integer quantity;
    /**
     * The Max quantity.
     */
    protected Integer MAX_QUANTITY = 0;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets price per unit.
     *
     * @return the price per unit
     */
    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Sets price per unit.
     *
     * @param pricePerUnit the price per unit
     */
    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
