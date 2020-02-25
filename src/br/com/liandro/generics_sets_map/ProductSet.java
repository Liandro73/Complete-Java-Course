package br.com.liandro.generics_sets_map;

import java.util.Objects;

public class ProductSet {

    private String name;
    private Double price;

    public ProductSet(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductSet)) return false;
        ProductSet that = (ProductSet) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }
}
