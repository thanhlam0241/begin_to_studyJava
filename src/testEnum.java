public class testEnum {
    public static void main(String [] args){
        WeekDay monday = WeekDay.MONDAY;
        if(monday==WeekDay.SUNDAY){
            System.out.println("FUck");
        }
        //Enum can be use in switch
        WeekDay today=WeekDay.SUNDAY;
        switch(today){
            case SUNDAY:System.out.println("To day is "+today);break;
            default :System.out.println("To day isn't "+today);
        }

        //Enum can be checked all members
        WeekDay [] day=WeekDay.values();
        for(WeekDay e:day){
            System.out.println(e);
        }
        //Enum can have constructor and method
        WeekDay tomorrow=WeekDay.MONDAY;

    }
}
