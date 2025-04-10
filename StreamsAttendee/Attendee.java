class Attendee{
    int attendeeID;
    String attendeeName;
    int attendeeAge;
    
    public Attendee(int attendeeID,String attendeeName,int attendeeAge){
        this.attendeeID = attendeeID;
        this.attendeeName = attendeeName;
        this.attendeeAge = attendeeAge;
    }
    
    public String getEmpName(){
        return attendeeName;
    }
}