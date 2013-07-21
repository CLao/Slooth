package com.slooth.common.script;

import java.util.Set;

/*
 * Represents a model of the script that gets loaded from a script file server side, then fed
 * to clients event by event
 */

public class Script {
    private Set<Event> events;

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
}
