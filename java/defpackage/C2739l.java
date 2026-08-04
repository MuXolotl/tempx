package defpackage;

import java.io.IOException;
import java.net.ConnectException;

/* JADX INFO: renamed from: lؔٛؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2739l extends ConnectException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final IOException f5942l;

    public C2739l(String str, IOException iOException) {
        super(str);
        this.f5942l = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5942l;
    }
}
