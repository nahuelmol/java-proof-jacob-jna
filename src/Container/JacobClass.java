package Container;

import com.mysql.jdbc.Buffer;

import com.oracle.net.Sdp;
import com.oracle.webservices.internal.api.message.MessageContextFactory;
import com.oracle.webservices.internal.api.message.ReadOnlyPropertyException;


public class JacobClass {
    public static void main(){
        System.out.println(ReadOnlyPropertyException.class.getClass());
        System.out.println(MessageContextFactory.class.getClass());
        System.out.println(Sdp.class.getClass());
        System.out.println(Buffer.class.getClass());
    }
}
