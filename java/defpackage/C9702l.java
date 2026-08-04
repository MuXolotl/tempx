package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٍٜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9702l extends AbstractC15096l implements InterfaceC3488l {
    public final String crashlytics;
    public final String loadAd;

    public C9702l(String str, String str2) {
        this.loadAd = str;
        this.crashlytics = str2;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '/') {
                C8339l.metrica("Multisegment prefix is not supported");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9702l)) {
            return false;
        }
        C9702l c9702l = (C9702l) obj;
        return this.loadAd.equals(c9702l.loadAd) && this.crashlytics.equals(c9702l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (this.loadAd.hashCode() * 31);
    }

    @Override // defpackage.AbstractC15096l
    public final AbstractC7444l mopub(C5740l c5740l, int i) {
        InterfaceC14665l c9139l;
        String str;
        List list = (List) c5740l.f12126l;
        String str2 = this.crashlytics;
        int i2 = 0;
        if (str2.length() > 0 && ((str = (String) AbstractC16901l.m4220for(i, list)) == null || !AbstractC16648l.isVip(str, str2, false))) {
            return AbstractC7444l.yandex;
        }
        String str3 = this.loadAd;
        if (str3.length() == 0) {
            InterfaceC14665l.loadAd.getClass();
            c9139l = C8070l.crashlytics;
        } else {
            List listM4233package = AbstractC16901l.m4233package(i, list);
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listM4233package, 10));
            for (Object obj : listM4233package) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                String strM3347throws = (String) obj;
                if (i2 == 0) {
                    strM3347throws = AbstractC12024l.m3347throws(str2.length(), strM3347throws);
                }
                arrayList.add(strM3347throws);
                i2 = i3;
            }
            c9139l = new C9139l(str3, arrayList);
        }
        return new C0950l(i < list.size() ? 0.1d : 0.2d, c9139l, list.size() - i);
    }

    public final String toString() {
        return "{...}";
    }
}
