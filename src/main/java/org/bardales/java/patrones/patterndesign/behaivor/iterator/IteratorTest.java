package org.bardales.java.patrones.patterndesign.behaivor.iterator;

import java.util.Iterator;

public class IteratorTest {

    public static void main(String... args) {
        ChannelCollection channelCollection = new ChannelCollectionImpl();
        channelCollection.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channelCollection.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channelCollection.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channelCollection.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));

        Iterator<Channel> channelIterator = channelCollection.iterator(ChannelTypeEnum.HINDI);
        while (channelIterator.hasNext()) {
            Channel c = channelIterator.next();
            System.out.println(c);
        }

    }

}
