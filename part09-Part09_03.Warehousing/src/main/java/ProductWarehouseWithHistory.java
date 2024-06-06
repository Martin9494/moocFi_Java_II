




public class ProductWarehouseWithHistory extends  ProductWarehouse{

    private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.history = new ChangeHistory();
        history.add(initialBalance);
        super.setBalance(initialBalance);

        
    }

    public String history(){
        return history.toString();
    
    }

    @Override
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            history.add(super.getBalance()+amount);
            super.setBalance(super.getBalance() + amount);
            
        } else {
            history.add(super.getBalance());
            super.setBalance(super.getCapacity());
            
        }
    }
    @Override
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            
            return 0.0;
        }
        if (amount > super.getBalance()) {
            double allThatWeCan = super.getBalance();
            super.setBalance(0.0);
            history.add(0.0);
            return allThatWeCan;
        }
        history.add(super.getBalance()-amount);
        super.setBalance(super.getBalance() - amount);
        
        return amount;
    }
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+this.history);
        System.out.println("Largest amount of product: "+history.maxValue());
        System.out.println("Smallest amount of product: "+history.minValue());
        System.out.println("Average: "+history.average());

    }

    

}
