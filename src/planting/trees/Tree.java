public class Tree {
    
    private GrowthStatus growth;
    private int growthstep;

    public Tree() {
        this.growth = GrowthStatus.SEED;
        this.growthstep = 0;
    }

    public void watering(){
        growthstep++;
        calculateGrowth();
    }

    public void calculateGrowth(){
        if(growthstep == 1){
            this.growth = GrowthStatus.SAPLING;
        }else{
            this.growth = GrowthStatus.MATURE;
        }
    }

    @Override
    public String toString() {
        return growth.toString() ;

    }
}
