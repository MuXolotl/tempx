package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٖؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C2388l {
    public static final C13088l Companion = new C13088l();
    public static final InterfaceC1220l[] amazon = {null, null, AbstractC9968l.crashlytics(2, new C8810l(12))};
    public final List crashlytics;
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C2388l(int i, int i2, String str, List list) {
        this.yandex = (i & 1) == 0 ? "" : str;
        this.loadAd = (i & 2) == 0 ? 1 : i2;
        if ((i & 4) == 0) {
            this.crashlytics = C2580l.f5619l;
        } else {
            this.crashlytics = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2388l)) {
            return false;
        }
        C2388l c2388l = (C2388l) obj;
        return AbstractC8576l.yandex(this.yandex, c2388l.yandex) && this.loadAd == c2388l.loadAd && AbstractC8576l.yandex(this.crashlytics, c2388l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex.hashCode() * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkConfigNetworkProxyCertificatesProduct(product=");
        sb.append(this.yandex);
        sb.append(", version=");
        sb.append(this.loadAd);
        sb.append(", certs=");
        return AbstractC0653l.subscription(sb, this.crashlytics, ')');
    }
}
