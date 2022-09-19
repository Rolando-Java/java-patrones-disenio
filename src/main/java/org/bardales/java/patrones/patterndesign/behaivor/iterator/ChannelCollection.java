package org.bardales.java.patrones.patterndesign.behaivor.iterator;

import java.util.Iterator;

public interface ChannelCollection {

    void addChannel(Channel c);

    void removeChannel(Channel c);

    Iterator<Channel> iterator(ChannelTypeEnum type);

}
