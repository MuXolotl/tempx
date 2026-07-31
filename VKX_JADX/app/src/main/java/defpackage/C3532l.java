package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lِؕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3532l {
    public static final C10685l billing;
    public static final C3532l purchase;
    public final List amazon;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean yandex;

    static {
        C3532l c3532l = new C3532l(14);
        C3532l c3532l2 = new C3532l(13);
        purchase = c3532l2;
        billing = AbstractC12396l.crashlytics(AbstractC14055l.remoteconfig(new C8195l("close", c3532l), new C8195l("keep-alive", c3532l2), new C8195l("upgrade", new C3532l(11))), new C4100l(21), new C8337l(26));
    }

    public /* synthetic */ C3532l(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, C2580l.f5619l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3532l.class != obj.getClass()) {
            return false;
        }
        C3532l c3532l = (C3532l) obj;
        return this.yandex == c3532l.yandex && this.loadAd == c3532l.loadAd && this.crashlytics == c3532l.crashlytics && AbstractC8576l.yandex(this.amazon, c3532l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((((((this.yandex ? 1231 : 1237) * 31) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        if (!this.amazon.isEmpty()) {
            return yandex();
        }
        boolean z = this.crashlytics;
        boolean z2 = this.loadAd;
        boolean z3 = this.yandex;
        if (z3 && !z2 && !z) {
            return "close";
        }
        if (z3 || !z2 || z) {
            return (!z3 && z2 && z) ? "keep-alive, Upgrade" : yandex();
        }
        return "keep-alive";
    }

    public final String yandex() throws IOException {
        StringBuilder sb = new StringBuilder();
        List list = this.amazon;
        ArrayList arrayList = new ArrayList(list.size() + 3);
        if (this.yandex) {
            arrayList.add("close");
        }
        if (this.loadAd) {
            arrayList.add("keep-alive");
        }
        if (this.crashlytics) {
            arrayList.add("Upgrade");
        }
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        AbstractC16901l.m4216else(arrayList, sb, null, null, null, null, 126);
        return sb.toString();
    }

    public C3532l(boolean z, boolean z2, boolean z3, List list) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = z3;
        this.amazon = list;
    }
}
