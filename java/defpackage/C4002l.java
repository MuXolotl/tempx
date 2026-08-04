package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lٌؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4002l extends AbstractC9637l {
    @Override // defpackage.AbstractC9637l
    public final int crashlytics(C8911l c8911l) {
        int i;
        synchronized (c8911l) {
            i = c8911l.f13442l - 1;
            c8911l.f13442l = i;
        }
        return i;
    }

    @Override // defpackage.AbstractC9637l
    public final void loadAd(C8911l c8911l, Set set) {
        synchronized (c8911l) {
            try {
                if (c8911l.f13441l == null) {
                    c8911l.f13441l = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
