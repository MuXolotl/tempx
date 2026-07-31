package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؙٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16172l extends AbstractC1377l {
    public final AbstractC1377l amazon;
    public final List crashlytics;
    public final String loadAd;
    public final int purchase;
    public final String yandex;

    public C16172l(String str, String str2, List list, AbstractC1377l abstractC1377l, int i) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = list;
        this.amazon = abstractC1377l;
        this.purchase = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1377l) {
            C16172l c16172l = (C16172l) ((AbstractC1377l) obj);
            if (this.yandex.equals(c16172l.yandex)) {
                String str = c16172l.loadAd;
                String str2 = this.loadAd;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.crashlytics.equals(c16172l.crashlytics)) {
                        AbstractC1377l abstractC1377l = c16172l.amazon;
                        AbstractC1377l abstractC1377l2 = this.amazon;
                        if (abstractC1377l2 != null ? abstractC1377l2.equals(abstractC1377l) : abstractC1377l == null) {
                            if (this.purchase == c16172l.purchase) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.yandex.hashCode() ^ 1000003) * 1000003;
        String str = this.loadAd;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.crashlytics.hashCode()) * 1000003;
        AbstractC1377l abstractC1377l = this.amazon;
        return this.purchase ^ ((iHashCode2 ^ (abstractC1377l != null ? abstractC1377l.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.yandex);
        sb.append(", reason=");
        sb.append(this.loadAd);
        sb.append(", frames=");
        sb.append(this.crashlytics);
        sb.append(", causedBy=");
        sb.append(this.amazon);
        sb.append(", overflowCount=");
        return AbstractC14814l.remoteconfig(this.purchase, "}", sb);
    }
}
