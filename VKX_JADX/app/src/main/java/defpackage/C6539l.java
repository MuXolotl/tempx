package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؙٙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C6539l {
    public static final C17560l Companion = new C17560l();
    public static final InterfaceC16588l[] amazon = {null, null, new C0185l(C0194l.yandex, C14171l.yandex, 1)};
    public final Map crashlytics;
    public final C14801l loadAd;
    public final C18067l yandex;

    public /* synthetic */ C6539l(int i, C18067l c18067l, C14801l c14801l, Map map) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C8018l.yandex.purchase());
            throw null;
        }
        this.yandex = c18067l;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = c14801l;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = map;
        }
    }

    public static C6539l yandex(C6539l c6539l, C18067l c18067l, C14801l c14801l, Map map, int i) {
        if ((i & 1) != 0) {
            c18067l = c6539l.yandex;
        }
        if ((i & 2) != 0) {
            c14801l = c6539l.loadAd;
        }
        if ((i & 4) != 0) {
            map = c6539l.crashlytics;
        }
        c6539l.getClass();
        return new C6539l(c18067l, c14801l, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6539l)) {
            return false;
        }
        C6539l c6539l = (C6539l) obj;
        return AbstractC8576l.yandex(this.yandex, c6539l.yandex) && AbstractC8576l.yandex(this.loadAd, c6539l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c6539l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C14801l c14801l = this.loadAd;
        int iHashCode2 = (iHashCode + (c14801l == null ? 0 : c14801l.hashCode())) * 31;
        Map map = this.crashlytics;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.yandex + ", backgroundTime=" + this.loadAd + ", processDataMap=" + this.crashlytics + ')';
    }

    public C6539l(C18067l c18067l, C14801l c14801l, Map map) {
        this.yandex = c18067l;
        this.loadAd = c14801l;
        this.crashlytics = map;
    }
}
