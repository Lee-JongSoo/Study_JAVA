package scheduler;

public class PriotityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 고개으이 전화를 먼저 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬이 가장 높은 상담원에게 우선적으로 배분합니다.");
    }
}
