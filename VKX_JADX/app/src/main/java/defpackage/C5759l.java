package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: lؘ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C5759l extends C12126l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f12149l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5759l(int i, int i2, IOException iOException) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.f12149l = i2;
    }

    public static C5759l yandex(int i, IOException iOException) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !AbstractC11452l.admob(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new C7825l("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new C5759l(i2, i, iOException);
    }

    public C5759l(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.f12149l = 1;
    }

    public C5759l(int i) {
        super(i == 2000 ? 2001 : i);
        this.f12149l = 1;
    }

    public C5759l(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.f12149l = 1;
    }
}
