package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: lٌؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8569l extends AbstractC18379l {
    public int mopub;

    @Override // defpackage.InterfaceC10376l
    public final int Signature() {
        return 0;
    }

    @Override // defpackage.InterfaceC10376l
    public final Object ad() {
        return null;
    }

    @Override // defpackage.InterfaceC10376l
    public final void isPro(long j, long j2, long j3, List list, InterfaceC7405l[] interfaceC7405lArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (subs(this.mopub, jElapsedRealtime)) {
            for (int i = this.loadAd - 1; i >= 0; i--) {
                if (!subs(i, jElapsedRealtime)) {
                    this.mopub = i;
                    return;
                }
            }
            C18073l.admob();
        }
    }

    @Override // defpackage.InterfaceC10376l
    public final int smaato() {
        return this.mopub;
    }
}
