package humaninterface.remote;

import dk.tobiasgrundtvig.util.socket.SocketConnection;
import dk.tobiasgrundtvig.util.socket.impl.SocketConnectionImpl;
import humaninterface.impl.ConsoleTextualInterface;
import java.io.IOException;

/**
 *
 * @author Tobias
 */
public class TestClient
{
    public static void main(String[] args) throws IOException
    {
        SocketConnection socketConn = new SocketConnectionImpl("localhost", 5665);
        TextualInterfaceConnection tic = new TextualInterfaceConnectionImpl(socketConn);
        AnswerSide as = new AnswerSide(tic, new ConsoleTextualInterface());
        as.run();
        
    }
}
