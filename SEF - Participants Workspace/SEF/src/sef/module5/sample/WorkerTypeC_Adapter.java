package sef.module5.sample;

public class WorkerTypeC_Adapter implements AdapterInterface{

    private Worker worker;
    public WorkerTypeC_Adapter(Worker worker){
        this.worker = worker;

    }

    public void execute() {
        worker.doWork();
    }
}
