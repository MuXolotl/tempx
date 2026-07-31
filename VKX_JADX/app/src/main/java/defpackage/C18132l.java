package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lً٘ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18132l extends AbstractC16800l {
    public final int amazon;
    public final int[] billing;
    public final int crashlytics;
    public final int loadAd;
    public final int[] purchase;

    public C18132l(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = iArr;
        this.billing = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18132l.class != obj.getClass()) {
            return false;
        }
        C18132l c18132l = (C18132l) obj;
        return this.loadAd == c18132l.loadAd && this.crashlytics == c18132l.crashlytics && this.amazon == c18132l.amazon && Arrays.equals(this.purchase, c18132l.purchase) && Arrays.equals(this.billing, c18132l.billing);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.billing) + ((Arrays.hashCode(this.purchase) + ((((((527 + this.loadAd) * 31) + this.crashlytics) * 31) + this.amazon) * 31)) * 31);
    }
}
