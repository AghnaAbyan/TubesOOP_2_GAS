package DataStore.Storer;

import java.io.IOException;

public interface Storer {
    public void dump() throws IOException;
    public void restore() throws IOException;
}
