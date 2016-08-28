package spriet2000.state.variant1.impl;

import spriet2000.state.variant1.ProductContext;
import spriet2000.state.variant1.ProductState;

import java.util.Arrays;
import java.util.List;

public class EndState extends ProductState {

    public void handle(ProductContext context) {

        // logic

        // set new state
        context.setNewState(this);
    }

    public String getName() {
        return "End";
    }

    public List<ProductState> getNextStates(ProductContext context) {
        return Arrays.asList(new ProductState[0]);
    }
}
