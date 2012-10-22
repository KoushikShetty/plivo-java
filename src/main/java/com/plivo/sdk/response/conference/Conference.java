package com.plivo.sdk.response.conference;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Conference {
    @SerializedName("conference_name")
    public String conferenceName ;
    
    @SerializedName("conference_run_time")
    public String conferenceRunTime ;
    
    @SerializedName("conference_member_count")
    public String conferenceMemberCount ;
    
    public List<ConferenceMember> members ;
    
    @SerializedName("api_id")
    public String apiID ;
    
    public String error ;
    
    public Conference() {
        // empty
    }
}
