package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؑٞؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0472l {
    public final int amazon;
    public final int crashlytics;
    public final byte[] loadAd;
    public final int yandex;

    public C0472l(byte[] bArr, int i, int i2, int i3) {
        this.yandex = i;
        this.loadAd = bArr;
        this.crashlytics = i2;
        this.amazon = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0472l.class != obj.getClass()) {
            return false;
        }
        C0472l c0472l = (C0472l) obj;
        return this.yandex == c0472l.yandex && this.crashlytics == c0472l.crashlytics && this.amazon == c0472l.amazon && Arrays.equals(this.loadAd, c0472l.loadAd);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.loadAd) + (this.yandex * 31)) * 31) + this.crashlytics) * 31) + this.amazon;
    }
}
