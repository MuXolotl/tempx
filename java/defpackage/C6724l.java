package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lؙۙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6724l {
    public final HashMap loadAd;
    public final InterfaceC4701l yandex;

    public C6724l(InterfaceC4701l interfaceC4701l, HashMap map) {
        this.yandex = interfaceC4701l;
        this.loadAd = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6724l)) {
            return false;
        }
        C6724l c6724l = (C6724l) obj;
        return this.yandex.equals(c6724l.yandex) && this.loadAd.equals(c6724l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.yandex + ", values=" + this.loadAd + "}";
    }

    public final long yandex(EnumC14251l enumC14251l, long j, int i) {
        long jAdmob = j - this.yandex.admob();
        C4807l c4807l = (C4807l) this.loadAd.get(enumC14251l);
        long j2 = c4807l.yandex;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jAdmob), c4807l.loadAd);
    }
}
