package spriet2000.state.variant1;

public final class ProductContext {

    private final ProductInfo productInfo;

    ProductContext(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public void setState(final ProductState nextState) {
        persistStateChange(productInfo, nextState);
    }

    public void handle(final ProductState nextState){
        nextState.handle(this);
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    private void persistStateChange(ProductInfo productInfo, ProductState to) {
        ProductState from = productInfo.getState();
        productInfo.setState(to);
        System.out.printf("saved from %s,to %s%n", from.getName(), to.getName());
    }
}
