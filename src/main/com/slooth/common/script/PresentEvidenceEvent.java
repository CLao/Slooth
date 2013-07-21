package com.slooth.common.script;

import java.util.Map;

public class PresentEvidenceEvent extends Event{
    // Maps the evidence you can get to the resulting event
    Map<String, Event> eventMappings;
}
