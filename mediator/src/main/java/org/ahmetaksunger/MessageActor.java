package org.ahmetaksunger;

public class MessageActor implements Actor{
        private String name;
        private Dispatcher dispatcher;

        public MessageActor(String name, Dispatcher dispatcher) {
            this.name = name;
            this.dispatcher = dispatcher;
        }

        @Override
        public void sendMessage(String topic, String message) {
            dispatcher.dispatch(topic,message);
        }

        @Override
        public void receiveMessage(String message) {
            System.out.println("MessageActor: " + name + " received message: " + message);
        }
}
