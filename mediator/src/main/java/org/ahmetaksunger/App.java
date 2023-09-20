package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {

        MessageDispatcher dispatcher = new MessageDispatcher();

        Actor actor1 = new MessageActor("Actor1",dispatcher);
        Actor actor2 = new MessageActor("Actor2",dispatcher);
        Actor actor3 = new MessageActor("Actor3",dispatcher);
        Actor actor4 = new MessageActor("Actor4",dispatcher);

        dispatcher.registerActor("topic1", actor1);
        dispatcher.registerActor("topic1", actor2);
        dispatcher.registerActor("topic2", actor2);
        dispatcher.registerActor("topic2", actor3);
        dispatcher.registerActor("topic2", actor4);

        actor4.sendMessage("topic1", "Hello from actor4");
        actor1.sendMessage("topic2", "Hello from actor1");
    }
}
