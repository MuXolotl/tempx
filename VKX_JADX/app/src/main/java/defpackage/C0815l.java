package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؒؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0815l {
    public static final String amazon;
    public static final String crashlytics;
    public final AbstractC1186l loadAd;
    public final C11916l yandex;

    static {
        String str = AbstractC15323l.yandex;
        crashlytics = Integer.toString(0, 36);
        amazon = Integer.toString(1, 36);
    }

    public C0815l(C11916l c11916l, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c11916l.yandex)) {
            throw new IndexOutOfBoundsException();
        }
        this.yandex = c11916l;
        this.loadAd = AbstractC1186l.Signature(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0815l.class == obj.getClass()) {
            C0815l c0815l = (C0815l) obj;
            if (this.yandex.equals(c0815l.yandex) && this.loadAd.equals(c0815l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.loadAd.hashCode() * 31) + this.yandex.hashCode();
    }
}
