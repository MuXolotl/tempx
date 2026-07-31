package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lَؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10090l extends AbstractC6291l {
    public final byte[] loadAd;
    public final String yandex;

    public C10090l(String str, byte[] bArr) {
        this.yandex = str;
        this.loadAd = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6291l)) {
            return false;
        }
        AbstractC6291l abstractC6291l = (AbstractC6291l) obj;
        C10090l c10090l = (C10090l) abstractC6291l;
        if (this.yandex.equals(c10090l.yandex)) {
            return Arrays.equals(this.loadAd, abstractC6291l instanceof C10090l ? ((C10090l) abstractC6291l).loadAd : c10090l.loadAd);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.loadAd) ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.yandex + ", contents=" + Arrays.toString(this.loadAd) + "}";
    }
}
