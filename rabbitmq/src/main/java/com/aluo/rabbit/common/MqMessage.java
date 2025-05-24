package com.aluo.rabbit.common;

/**
 * 发送的消息对象
 *
 * @author fk
 * @version v7.2.0
 * @since v7.2.0
 * 2020-06-15 21:50:52
 */
public class MqMessage {

    private String exchange;

    private String routingKey;

    private Integer delayTime;

    private Object message;


    public MqMessage(String exchange, String routingKey, Object message) {
        this.exchange = exchange;
        this.routingKey = routingKey;
        this.message = message;
    }

    public MqMessage(String exchange, String routingKey, Integer delayTime, Object message) {
        this.exchange = exchange;
        this.routingKey = routingKey;
        this.delayTime = delayTime;
        this.message = message;
    }

    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MqMessage{" +
                "exchange='" + exchange + '\'' +
                ", routingKey='" + routingKey + '\'' +
                ", delayTime=" + delayTime +
                ", message=" + message +
                '}';
    }
}
