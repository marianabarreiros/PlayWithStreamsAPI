package teste;

public class SimpleClientFactory {
    private Client client = null;

    public Client getClient() {return client;}
    
    public boolean creatClient(String client){
        switch(client.toLowerCase()){
            case "regular":
                this.client = new Regular();
                return true;
            case "rewards":
                this.client = new Rewards(); 
                return true;
            default: 
                return false;
        }       
    }
}

