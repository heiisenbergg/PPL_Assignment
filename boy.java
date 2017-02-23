/**
 * Created by lenovo-pc on 23-Feb-17.
 */
public class boy {                                      //class boy
    public String name;                                 //name of boy
    public double attract;                              //level of attractiveness
    public double budget;                               //his budget
    public double iq;                                   //his intelligence level
    public int type;                                    //commitment type
    public double happy;                                //happiness level
    public double min_attract;                          //minimum attraction requirement

    boy(String name,double attract,double mb,double iq,int type,double min_attract){
        this.name=name;
        this.attract=attract;
        this.budget=budget;
        this.iq=iq;
        this.type=0;                                    // 0 for non-committed, 1 for miser, 2 for generous, 3 for geek
        this.happy=0;
        this.min_attract=min_attract;
    }

    public static void main(String[] args) {
        System.out.println("Helllo");
    }
}
