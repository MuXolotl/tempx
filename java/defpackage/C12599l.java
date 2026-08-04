package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: renamed from: lّٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12599l extends AbstractC16800l {
    public final int amazon;
    public final String crashlytics;
    public final String loadAd;
    public final byte[] purchase;

    public C12599l(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = i;
        this.purchase = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12599l.class != obj.getClass()) {
            return false;
        }
        C12599l c12599l = (C12599l) obj;
        return this.amazon == c12599l.amazon && this.loadAd.equals(c12599l.loadAd) && Objects.equals(this.crashlytics, c12599l.crashlytics) && Arrays.equals(this.purchase, c12599l.purchase);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert((527 + this.amazon) * 31, 31, this.loadAd);
        String str = this.crashlytics;
        return Arrays.hashCode(this.purchase) + ((iAdvert + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC16800l, defpackage.InterfaceC1525l
    public final void loadAd(C3117l c3117l) {
        c3117l.yandex(this.amazon, this.purchase);
    }

    @Override // defpackage.AbstractC16800l
    public final String toString() {
        return this.yandex + ": mimeType=" + this.loadAd + ", description=" + this.crashlytics;
    }
}
