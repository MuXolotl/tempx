package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lّٓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14113l {
    public final int amazon;
    public final int crashlytics;
    public final List loadAd;
    public final C15421l purchase;
    public final AbstractC0958l yandex;

    public C14113l(AbstractC0958l abstractC0958l, List list, int i, int i2, C15421l c15421l) {
        this.yandex = abstractC0958l;
        this.loadAd = list;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = c15421l;
    }

    public static C11644l yandex(AbstractC0958l abstractC0958l) {
        C11644l c11644l = new C11644l(4, false);
        if (abstractC0958l == null) {
            C6541l.subs("Null surface");
            return null;
        }
        c11644l.f23358l = abstractC0958l;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            C6541l.subs("Null sharedSurfaces");
            return null;
        }
        c11644l.f23357l = list;
        c11644l.f23361l = -1;
        c11644l.f23360l = -1;
        c11644l.f23362l = C15421l.amazon;
        return c11644l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14113l)) {
            return false;
        }
        C14113l c14113l = (C14113l) obj;
        return this.yandex.equals(c14113l.yandex) && this.loadAd.equals(c14113l.loadAd) && this.crashlytics == c14113l.crashlytics && this.amazon == c14113l.amazon && this.purchase.equals(c14113l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() ^ ((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * (-721379959)) ^ this.crashlytics) * 1000003) ^ this.amazon) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.yandex + ", sharedSurfaces=" + this.loadAd + ", physicalCameraId=null, mirrorMode=" + this.crashlytics + ", surfaceGroupId=" + this.amazon + ", dynamicRange=" + this.purchase + "}";
    }
}
