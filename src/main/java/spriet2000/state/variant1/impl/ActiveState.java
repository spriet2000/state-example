package spriet2000.state.variant1.impl;


import spriet2000.state.variant1.ProductContext;
import spriet2000.state.variant1.ProductState;

import java.util.Arrays;
import java.util.List;

public class ActiveState extends ProductState {

    public void handle(ProductContext context) {

        // logic
        System.out.printf("logic applied of status %s%n", this.getName());

        // set new state
        context.setState(this);
    }

    public String getName() {
        return "Active";
    }

    public List<ProductState> getNextStates(ProductContext context) {
        if (context.getProductInfo().isCompleted()) {
            return Arrays.asList(new EndState(), new PauseState());
        } else {
            return Arrays.asList(new CancelledState(), new PauseState());
        }
    }
}
