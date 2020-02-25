package br.com.liandro.generics_sets_map;

import java.util.Objects;

public class ProductTreeSet implements Comparable<ProductTreeSet> {

    private String name;
    private Double price;

    public ProductTreeSet(String name, Double price) {
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
        if (!(o instanceof ProductTreeSet)) return false;
        ProductTreeSet that = (ProductTreeSet) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Product {" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(ProductTreeSet o) {
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }
}
