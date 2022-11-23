package transport;

import java.util.LinkedList;
import java.util.Queue;

public class TechStation<T extends Transport> {

    private String nameStation;

    public TechStation(String nameStation) {
        this.nameStation = nameStation;
    }

    private Queue<T> queue = new LinkedList<>();

    public void  addTransport(T transport) {
        queue.offer(transport);
    }

    public void passingMaintenance() {
        T transport = queue.poll();;
        if(transport != null) {
            System.out.println("Станция технического осмотра проводит обслуживание " + transport);
            passingMaintenance();
        } else {
            System.out.println("В очереди больше не осталось машин!");
        }
    }
    public int queue(){
        return queue.size();
    }
}
