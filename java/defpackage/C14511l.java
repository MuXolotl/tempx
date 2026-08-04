package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: lۣٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14511l {
    public static final C14511l crashlytics = new C14511l(AbstractC16901l.m4229l(new ArrayList()), null);
    public final AbstractC5711l loadAd;
    public final Set yandex;

    public C14511l(Set set, AbstractC5711l abstractC5711l) {
        this.yandex = set;
        this.loadAd = abstractC5711l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14511l)) {
            return false;
        }
        C14511l c14511l = (C14511l) obj;
        return c14511l.yandex.equals(this.yandex) && AbstractC8576l.yandex(c14511l.loadAd, this.loadAd);
    }

    public final int hashCode() {
        int iHashCode = (this.yandex.hashCode() + 1517) * 41;
        AbstractC5711l abstractC5711l = this.loadAd;
        return iHashCode + (abstractC5711l != null ? abstractC5711l.hashCode() : 0);
    }
}
