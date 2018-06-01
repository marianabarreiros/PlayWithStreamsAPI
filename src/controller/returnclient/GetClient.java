package controller.returnclient;

import controller.simpleclientfactory.SimpleClientFactory;
import static javafx.application.Platform.exit;

public class GetClient {

    private SimpleClientFactory simpleClientFactory = new SimpleClientFactory();

    public String returnClient(String fileLine) {
        try {
            if(simpleClientFactory.creatClient(getNameClient(fileLine)))
                return simpleClientFactory.getClientType().getTypeClient();
        } catch (NullPointerException e) {
            System.out.println("Erro: Cliente não existe");
        }
        return null;
    }

    private String getNameClient(String fileLine) {
        int endIndex = fileLine.indexOf(":");
        String nameClient = fileLine.substring(0, endIndex);
        return nameClient;
    }
}
