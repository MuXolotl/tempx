package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lؘٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5687l {
    public final HashMap amazon = new HashMap(0);
    public C5687l crashlytics;
    public final int loadAd;
    public int yandex;

    public C5687l(int i, int i2) {
        if (i > i2) {
            C11983l.crashlytics();
            throw null;
        }
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return AbstractC9361l.Signature(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
