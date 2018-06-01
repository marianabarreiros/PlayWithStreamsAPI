package controller.returnclient;

import controller.simpleclientfactory.SimpleClientFactory;
import static javafx.application.Platform.exit;

public class GetClient {

    private SimpleClientFactory simpleClientFactory = new SimpleClientFactory();

    public String returnClient(String fileLine) throws Exception {
        simpleClientFactory.creatClient(getNameClient(fileLine)); 
        return simpleClientFactory.getClientType().getTypeClient();
    }

    private String getNameClient(String fileLine) {
        int endIndex = fileLine.indexOf(":");
        String nameClient = fileLine.substring(0, endIndex);
        return nameClient;
    }
}
