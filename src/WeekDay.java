public enum WeekDay {
    MONDAY("Monday",2), TUESDAY("Tuesday",3),
    WEDNESDAY("Wednesday",4), THURSDAY("Thursday",5),
    FRIDAY("Friday",6), SATURDAY("Saturday",7),
    SUNDAY("Sunday",1);
    private String text;
    private int number;
    WeekDay(String text,int number){
        this.text=text;
        this.number=number;
    }

    public static WeekDay getDayByNumber(int number){
        for(WeekDay day:WeekDay.values()){
            if(day.number==number){
                return day;
            }
        }
        return null;
    }
    public String getText(){
        return this.text;
    }
    public int getNumber(){
        return this.number;
    }

}
