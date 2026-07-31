package defpackage;

import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: renamed from: lؒٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1109l {
    public final long crashlytics;
    public final C4421l loadAd;
    public final BigInteger yandex;

    public C1109l(C4421l c4421l, long j, BigInteger bigInteger) {
        if (c4421l == null) {
            C8339l.metrica("GUID must not be null");
            throw null;
        }
        if (j < 0) {
            C8339l.metrica("Position of header can't be negative.");
            throw null;
        }
        if (bigInteger == null || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            C8339l.metrica("chunkLen must not be null nor negative.");
            throw null;
        }
        this.loadAd = c4421l;
        this.crashlytics = j;
        this.yandex = bigInteger;
    }

    public final String toString() {
        return yandex("");
    }

    public String yandex(String str) {
        StringBuilder sbAdvert = AbstractC5020l.advert(str, "-> GUID: ");
        C4421l c4421l = this.loadAd;
        if (c4421l == null) {
            C4421l c4421l2 = C4421l.amazon;
            C8339l.metrica("Argument must not be null.");
            return null;
        }
        HashMap map = C4421l.vip;
        sbAdvert.append(((C4421l) map.get(c4421l)) != null ? ((C4421l) map.get(c4421l)).yandex : null);
        String str2 = AbstractC3848l.yandex;
        sbAdvert.append(str2);
        sbAdvert.append(str);
        sbAdvert.append("  | : Starts at position: ");
        long j = this.crashlytics;
        sbAdvert.append(j);
        sbAdvert.append(str2);
        sbAdvert.append(str);
        sbAdvert.append("  | : Last byte at: ");
        return AbstractC15560l.ads((this.yandex.longValue() + j) - 1, str2, sbAdvert);
    }
}
