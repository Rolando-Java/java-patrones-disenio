package org.bardales.java.patrones.patterndesign.behaivor.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private final List<Channel> channels;

    public ChannelCollectionImpl() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        this.channels.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channels.remove(c);
    }

    @Override
    public Iterator<Channel> iterator(ChannelTypeEnum type) {
        return new ChannelIterator(type, channels);
    }

    private class ChannelIterator implements Iterator<Channel> {

        private final ChannelTypeEnum type;
        private final List<Channel> channels;
        private int positionHasNext;
        private int positionNext;

        public ChannelIterator(ChannelTypeEnum type, List<Channel> channels) {
            this.type = type;
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            int pos = positionHasNext;
            while (pos < channels.size()) {
                Channel c = this.channels.get(pos);
                if (c.getType().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    positionNext = pos;
                    return true;
                }
                pos++;
            }
            return false;
        }

        @Override
        public Channel next() {
            if(hasNext()) {
               Channel c = this.channels.get(positionNext);
               positionHasNext = ++positionNext;
               return c;
            }
            return null;
        }

    }

}
