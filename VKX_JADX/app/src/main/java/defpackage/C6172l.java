package defpackage;

import java.util.TreeSet;

/* JADX INFO: renamed from: lؙؐۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6172l {
    public long loadAd;
    public final TreeSet yandex = new TreeSet(new C2351l(20));

    public final void loadAd(C12220l c12220l, C0812l c0812l) {
        this.yandex.add(c0812l);
        this.loadAd += c0812l.f2435l;
        yandex(c12220l, 0L);
    }

    public final void yandex(C12220l c12220l, long j) {
        while (this.loadAd + j > 134217728 && !this.yandex.isEmpty()) {
            C0812l c0812l = (C0812l) this.yandex.first();
            synchronized (c12220l) {
                c12220l.firebase(c0812l);
            }
        }
    }
}
