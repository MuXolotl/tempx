package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;

/* JADX INFO: renamed from: lُؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2539l extends C5101l {
    public final /* synthetic */ C0374l vip;

    public C2539l(C0374l c0374l) {
        this.vip = c0374l;
    }

    @Override // defpackage.C5101l
    public final void firebase() {
        int i = 9;
        this.vip.purchase(9);
        C8050l c8050l = this.vip.f1453l;
        synchronized (c8050l) {
            long j = c8050l.f16775l;
            long j2 = c8050l.f16754l;
            if (j < j2) {
                return;
            }
            c8050l.f16754l = j2 + 1;
            c8050l.f16768l = System.nanoTime() + 1000000000;
            Unit unit = Unit.INSTANCE;
            C7522l.crashlytics(c8050l.f16759l, AbstractC0653l.ads(new StringBuilder(), c8050l.f16755l, " ping"), 0L, new C7730l(i, c8050l), 6);
        }
    }

    @Override // defpackage.C5101l
    public final IOException isPro(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    public final void smaato() throws IOException {
        if (subs()) {
            throw isPro(null);
        }
    }
}
