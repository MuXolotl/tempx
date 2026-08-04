package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٜؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1455l extends AbstractC16800l {
    public final byte[] crashlytics;
    public final String loadAd;

    public C1455l(String str, byte[] bArr) {
        super("PRIV");
        this.loadAd = str;
        this.crashlytics = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1455l.class != obj.getClass()) {
            return false;
        }
        C1455l c1455l = (C1455l) obj;
        return this.loadAd.equals(c1455l.loadAd) && Arrays.equals(this.crashlytics, c1455l.crashlytics);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.crashlytics) + AbstractC12589l.advert(527, 31, this.loadAd);
    }

    @Override // defpackage.AbstractC16800l
    public final String toString() {
        return this.yandex + ": owner=" + this.loadAd;
    }
}
