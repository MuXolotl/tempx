package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٍٗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9611l {
    public ArrayList amazon;
    public AbstractC2520l crashlytics;
    public final int loadAd;
    public final C2234l yandex;

    public C9611l(C2234l c2234l, int i, C17696l c17696l) {
        this.yandex = c2234l;
        this.loadAd = i;
        this.crashlytics = c17696l;
    }

    public final String toString() {
        return AbstractC10478l.admob(this.yandex) + ", segment:" + this.loadAd + " -> " + this.crashlytics;
    }

    public final void yandex(int i, StringBuilder sb) {
        sb.append(AbstractC16648l.ad(i, "  ") + this);
        sb.append('\n');
        ArrayList arrayList = this.amazon;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C9611l) it.next()).yandex(i + 1, sb);
            }
        }
    }
}
