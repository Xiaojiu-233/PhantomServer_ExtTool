package xj.enums.thread;

// 动态线程池对任务的拒绝策略
public enum RejectStrategy {

    THROW_EXCEPTION,// 抛出异常
    THROW_TASK,// 不执行该任务
    THROW_QUEUE_TASK;// 将线程池里最早进入队列的任务

    public static RejectStrategy getStrategyByString(String strategy){
        try{
            return RejectStrategy.valueOf(strategy);
        }catch (IllegalArgumentException e){
            return RejectStrategy.THROW_TASK;
        }
    }

}
