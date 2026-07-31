package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: renamed from: lَؖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4036l extends AbstractC16800l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final byte[] purchase;

    public C4036l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4036l.class != obj.getClass()) {
            return false;
        }
        C4036l c4036l = (C4036l) obj;
        return Objects.equals(this.loadAd, c4036l.loadAd) && this.crashlytics.equals(c4036l.crashlytics) && this.amazon.equals(c4036l.amazon) && Arrays.equals(this.purchase, c4036l.purchase);
    }

    public final int hashCode() {
        String str = this.loadAd;
        return Arrays.hashCode(this.purchase) + AbstractC12589l.advert(AbstractC12589l.advert((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.crashlytics), 31, this.amazon);
    }

    @Override // defpackage.AbstractC16800l
    public final String toString() {
        return this.yandex + ": mimeType=" + this.loadAd + ", filename=" + this.crashlytics + ", description=" + this.amazon;
    }
}
