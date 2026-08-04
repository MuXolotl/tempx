package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؚٕۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C16016l implements InterfaceC0582l {
    public static final C9013l Companion = new C9013l();
    public static final InterfaceC1220l[] crashlytics = {AbstractC9968l.crashlytics(2, new C6573l(6)), null};
    public final String loadAd;
    public final List yandex;

    public /* synthetic */ C16016l(int i, String str, List list) {
        this.yandex = (i & 1) == 0 ? C2580l.f5619l : list;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16016l)) {
            return false;
        }
        C16016l c16016l = (C16016l) obj;
        return AbstractC8576l.yandex(this.yandex, c16016l.yandex) && AbstractC8576l.yandex(this.loadAd, c16016l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Synchronized(lines=");
        sb.append(this.yandex);
        sb.append(", credits=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    public C16016l(List list, String str) {
        this.yandex = list;
        this.loadAd = str;
    }
}
