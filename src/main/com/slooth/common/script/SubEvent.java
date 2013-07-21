package com.slooth.common.script;

import org.json.simple.JSONAware;

public class SubEvent implements JSONAware {

    private Event event;
    
    @Override
    public String toJSONString() {
        // TODO Auto-generated method stub
        return null;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}
