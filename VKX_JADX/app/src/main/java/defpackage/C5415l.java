package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: lؘٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5415l extends C5101l {
    public final Socket vip;

    public C5415l(Socket socket) {
        this.vip = socket;
    }

    @Override // defpackage.C5101l
    public final void firebase() {
        Socket socket = this.vip;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!AbstractC7169l.yandex(e)) {
                throw e;
            }
            AbstractC7169l.yandex.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC7169l.yandex.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    @Override // defpackage.C5101l
    public final IOException isPro(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
