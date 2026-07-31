package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٔ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15198l implements InterfaceC7922l {
    @Override // defpackage.InterfaceC7922l
    public final void yandex(C7972l c7972l, C2434l c2434l) throws IOException {
        C9173l c9173l = c2434l.loadAd;
        if (c9173l != null) {
            C10965l c10965l = new C10965l();
            C13310l c13310l = new C13310l();
            for (C0657l c0657l : c9173l.yandex) {
                boolean z = c0657l.purchase;
                C11520l c11520l = c0657l.loadAd;
                if (z) {
                    c7972l.m2231implements("EXT-X-DISCONTINUITY");
                }
                C4273l c4273l = c0657l.crashlytics;
                if (c4273l != null && !c4273l.equals(c10965l.smaato)) {
                    c10965l.smaato = c4273l;
                    if (c9173l != null) {
                        c10965l.purchase(c7972l, c9173l);
                    }
                }
                C1790l c1790l = c0657l.billing;
                if (c1790l != null && !c1790l.equals(c13310l.smaato)) {
                    c13310l.smaato = c1790l;
                    if (c9173l != null) {
                        c13310l.purchase(c7972l, c9173l);
                    }
                }
                C8379l c8379l = c0657l.mopub;
                if (c8379l != null) {
                    Long l = c8379l.loadAd;
                    long j = c8379l.yandex;
                    c7972l.m2225const("EXT-X-BYTERANGE", l != null ? String.valueOf(j) + '@' + String.valueOf(c8379l.loadAd) : String.valueOf(j));
                }
                StringBuilder sb = new StringBuilder();
                if (c2434l.amazon < 3) {
                    sb.append(Integer.toString((int) c11520l.yandex));
                } else {
                    sb.append(Float.toString(c11520l.yandex));
                }
                sb.append(AbstractC6052l.yandex);
                String str = c11520l.loadAd;
                if (str != null) {
                    sb.append(str);
                }
                c7972l.m2225const("EXTINF", sb.toString());
                c7972l.m2221break(c0657l.yandex);
            }
        }
    }
}
