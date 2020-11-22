package planting.trees;

public class PlantingTrees {

    private Tree[] slot;

    public PlantingTrees(int numberOfSlot) {
        numberOfSlot = Math.max(1,numberOfSlot);
        this.slot = new Tree[numberOfSlot];
        
        for(int i = 0 ; i < numberOfSlot ; i++){
            slot[i] = new Tree();
        }

    }
    public void watering(int slotNumber){
        slot[slotNumber].watering();
    }
    public int getNumberOfSlot(){
        return this.slot.length;
    }
   
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < slot.length; i++) {
            str.append("Slot #"+ i + "| status : " + slot[i] +"\n");
        }
        return str.toString();
    }
    
}
