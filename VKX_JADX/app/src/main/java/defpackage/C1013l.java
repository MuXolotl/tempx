package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: renamed from: lّؒ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1013l {
    public final String loadAd;
    public C9056l purchase;
    public final int yandex;
    public final TreeSet crashlytics = new TreeSet();
    public final ArrayList amazon = new ArrayList();

    public C1013l(int i, String str, C9056l c9056l) {
        this.yandex = i;
        this.loadAd = str;
        this.purchase = c9056l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1013l.class == obj.getClass()) {
            C1013l c1013l = (C1013l) obj;
            if (this.yandex == c1013l.yandex && this.loadAd.equals(c1013l.loadAd) && this.crashlytics.equals(c1013l.crashlytics) && this.purchase.equals(c1013l.purchase)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd);
    }

    public final boolean yandex(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.amazon;
            if (i >= arrayList.size()) {
                return false;
            }
            C14798l c14798l = (C14798l) arrayList.get(i);
            long j3 = c14798l.yandex;
            long j4 = c14798l.loadAd;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }
}
