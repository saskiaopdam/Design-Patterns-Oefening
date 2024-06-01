package product;

import product.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public String packing() {
        return new Bottle().pack();
    }
}
