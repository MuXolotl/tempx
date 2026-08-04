package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lًٔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14882l implements InterfaceC0643l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f29109l;

    static {
        new AtomicInteger();
    }

    @Override // defpackage.InterfaceC0643l
    public final Object loadAd(C1381l c1381l) throws IOException {
        if (this.f29109l) {
            if (((AbstractC1186l) c1381l.f3512l).isEmpty()) {
                return ((InterfaceC14033l) c1381l.f3513l).crashlytics((Uri) c1381l.f3514l);
            }
            throw new C8413l("Short circuit would skip transforms.");
        }
        Closeable closeableRemoteconfig = AbstractC6660l.remoteconfig(c1381l);
        try {
            if (!(closeableRemoteconfig instanceof InterfaceC4202l)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileZza = ((InterfaceC4202l) closeableRemoteconfig).zza();
            if (closeableRemoteconfig != null) {
                closeableRemoteconfig.close();
            }
            return fileZza;
        } catch (Throwable th) {
            if (closeableRemoteconfig != null) {
                try {
                    closeableRemoteconfig.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
