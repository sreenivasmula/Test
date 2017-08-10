package com.sreeni.jms;

import javax.jms.*;
import javax.naming.InitialContext;

public class MyTopicReceiver {
    public static void main(String[] args) {
        try {
            // 1) Create and start connection
            InitialContext ctx = new InitialContext();
            TopicConnectionFactory f = (TopicConnectionFactory) ctx.lookup("myTopicConnectionFactory");
            TopicConnection con = f.createTopicConnection();
            con.start();
            // 2) create topic session
            TopicSession ses = con.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            // 3) get the Topic object
            Topic t = (Topic) ctx.lookup("myTopic");
            // 4)create TopicSubscriber
            TopicSubscriber receiver = ses.createSubscriber(t);

            // 5) create listener object
            MyListener listener = new MyListener();

            // 6) register the listener object with subscriber
            receiver.setMessageListener(listener);

            System.out.println("Subscriber1 is ready, waiting for messages...");
            System.out.println("press Ctrl+c to shutdown...");
            while (true) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
