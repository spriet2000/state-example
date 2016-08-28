package spriet2000.state.variant1;

public final class ProductInfo {

    private final ProductState productStatus;

    public ProductInfo(ProductState productState) {

        this.productStatus = productState;
    }

    public ProductState getState() {
        return productStatus;
    }
}
