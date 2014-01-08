package nanomsg.reqrep;

import nanomsg.RWSocket;
import nanomsg.Nanomsg;


public class RepSocket extends RWSocket {
    public RepSocket(int domain) {
        super(domain, Nanomsg.constants.NN_REP);
    }

    public RepSocket() {
        this(Nanomsg.constants.AF_SP);
    }
}