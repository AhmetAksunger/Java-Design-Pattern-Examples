package org.ahmetaksunger;

import java.util.*;

public class MessageDispatcher implements Dispatcher{

    private Map<String, List<Actor>> registeredActors = new HashMap<>();

    @Override
    public void dispatch(String topic, String message) {
        if(registeredActors.containsKey(topic)){
            registeredActors.get(topic).forEach(actor -> actor.receiveMessage(message));
        }
    }

    public void registerActor(String topic, Actor actor) {
        if(registeredActors.containsKey(topic)){
            registeredActors.get(topic).add(actor);
        }else {
            registeredActors.put(topic, new ArrayList<>(Collections.singletonList(actor)));
        }
    }
}
