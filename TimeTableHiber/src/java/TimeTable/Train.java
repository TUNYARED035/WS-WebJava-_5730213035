package TimeTable;
// Generated Oct 30, 2016 9:08:33 PM by Hibernate Tools 4.3.1



/**
 * Train generated by hbm2java
 */
public class Train  implements java.io.Serializable {


     private int trainId;
     private String name;
     private String type;
     private int numPsg;

    public Train() {
    }

	
    public Train(int trainId, int numPsg) {
        this.trainId = trainId;
        this.numPsg = numPsg;
    }
    public Train(int trainId, String name, String type, int numPsg) {
       this.trainId = trainId;
       this.name = name;
       this.type = type;
       this.numPsg = numPsg;
    }
   
    public int getTrainId() {
        return this.trainId;
    }
    
    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public int getNumPsg() {
        return this.numPsg;
    }
    
    public void setNumPsg(int numPsg) {
        this.numPsg = numPsg;
    }




}


