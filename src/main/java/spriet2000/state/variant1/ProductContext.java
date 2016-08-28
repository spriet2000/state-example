package spriet2000.state.variant1;

public final class ProductContext {

    private final ProductInfo productInfo;
    private final ClientInfo clientInfo;

    ProductContext(ProductInfo productInfo, ClientInfo clientInfo) {
        this.productInfo = productInfo;
        this.clientInfo = clientInfo;
    }

    public void setNewState(final ProductState nextState) {
        nextState.handle(this);
        persistStateChange(productInfo, nextState);

    }

    private void persistStateChange(ProductInfo productInfo, ProductState to) {
        ProductState from = productInfo.getState();
        productInfo.setState(to);
        System.out.printf("saved from %s,to %s%n", from.getName(), to.getName());
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    ProductInfo getProductInfo() {
        return productInfo;
    }
}
