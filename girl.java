/**
 * Created by lenovo-pc on 23-Feb-17.
 */
public class girl {
    public String name;                             //name of girl
    public double attract;                          //level of attractiveness
    public double mb;                               //maintainer cost
    public double iq;                               //level of intelligencee
    public int type;                                //commitment type
    public double happy;                            //happiness level

    girl(String name,double attract,double mb,double iq,int type){
        this.name=name;
        this.attract=attract;
        this.mb=mb;
        this.iq=iq;
        this.type=0;                                // 0 for non-committed, 1 for choosy, 2 for normal, 3 for desperate
         this.happy=0;
    }
}
