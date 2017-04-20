package com.google.pubsub.jms.light;

import javax.jms.Topic;
import javax.jms.TopicPublisher;
import javax.jms.TopicSubscriber;
import javax.jms.TemporaryTopic;

/**
 * Default PubSub {@link javax.jms.TopicSession} implementation.
 *
 * @author Daiqian Zhang
 */
class PubSubTopicSession extends PubSubSession {

  @Override
  public TopicPublisher createPublisher(Topic topic) {
    return null;
  }

  @Override
  public TopicSubscriber createSubscriber(Topic topic) {
    return null;
  }


  @Override
  public TopicSubscriber createSubscriber(Topic topic, String messageSelector, boolean noLocal) {
    return null;
  }

  @Override
  public TemporaryTopic createTemporaryTopic() {
    return null;
  }

  @Override
  public void unsubscribe(String name) {
  }
}