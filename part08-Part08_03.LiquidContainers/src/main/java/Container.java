public class Container {
    private String name;
    private int liquit;
    private int limit;

    public Container(String name){
        this.name = name;
        this.liquit = 0;
        this.limit = 100;
    }

    public void add(int amount){
        if(amount < 0){

        }else if (this.liquit + amount >= this.limit) {
            this.liquit = this.limit;
        }else if(this.liquit + amount < this.limit){
            this.liquit += amount;
        }else{

        }
    }

    public void move(int amount, Container container){
        if(amount < 0){

        }else if (amount+container.liquit >= container.limit) {
            this.liquit = 0;
            container.liquit = 100;
        }else if(amount <= this.liquit){
            container.liquit += amount;
            this.liquit -= amount;
        }else if(this.liquit < amount){
            container.liquit += this.liquit;
            this.liquit = 0;
        }else{

        }
    }
    public void remove(int amount){
        if(amount < 0){

        }else if (amount > this.limit) {
            
        }else if(this.liquit >= amount){
            this.liquit = this.liquit - amount;
        }else if(this.liquit < amount){
            this.liquit = 0;
        }
    }

    @Override
    public String toString(){
        return this.name+": "+this.liquit+"/"+this.limit;
    }

}
