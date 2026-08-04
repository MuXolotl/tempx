package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌَؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10008l {
    public static final C10008l amazon = new C10008l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C10008l(int i, int i2, int i3) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10008l)) {
            return false;
        }
        C10008l c10008l = (C10008l) obj;
        return this.yandex == c10008l.yandex && this.loadAd == c10008l.loadAd && this.crashlytics == c10008l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        int i = this.loadAd;
        int i2 = this.crashlytics;
        int i3 = this.yandex;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append('.');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append('.');
        sb2.append(i);
        sb2.append('.');
        sb2.append(i2);
        return sb2.toString();
    }
}
