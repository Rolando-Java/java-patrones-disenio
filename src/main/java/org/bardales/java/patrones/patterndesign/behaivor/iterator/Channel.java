package org.bardales.java.patrones.patterndesign.behaivor.iterator;

public class Channel {

    private final double frequency;
    private final ChannelTypeEnum type;

    public Channel(double frequency, ChannelTypeEnum type) {
        this.frequency = frequency;
        this.type = type;
    }

    public double getFrequency() {
        return this.frequency;
    }

    public ChannelTypeEnum getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "frequency : " + this.frequency + " channelTypeEnum : " + this.type;
    }

}
