package org.example.problem1;

import java.time.LocalDate;

public class PerishableFoodItem {

    public class PerishableItem extends FoodItem{
        protected LocalDate orderDate;
        protected LocalDate expiryDate;
        private static final Integer MAX_PERSIHABLE_QUANTITY = 100;

        public PerishableItem(LocalDate expiryDate, LocalDate orderDate) {
            super(name, pricePerUnit, availableQuanity);
            this.expiryDate = expiryDate;
            this.orderDate = orderDate;
        }

        public PerishableItem(String name, Double pricePerUnit, Integer quantity) {
            super(name, pricePerUnit, quantity);
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public Double getPricePerUnit() {
            return super.getPricePerUnit();
        }

        @Override
        public Integer getQuantity() {
            return super.getQuantity();
        }

        @Override
        public void setName(String name) {
            super.setName(name);
        }

        @Override
        public void setPricePerUnit(Double pricePerUnit) {
            super.setPricePerUnit(pricePerUnit);
        }

        @Override
        public void setQuantity(Integer quantity) {
            super.setQuantity(quantity);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
