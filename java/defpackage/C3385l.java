package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؕٓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3385l {
    public final byte[] loadAd;
    public final C7017l yandex;

    public C3385l(C7017l c7017l, byte[] bArr) {
        if (c7017l == null) {
            C6541l.subs("encoding is null");
            throw null;
        }
        if (bArr == null) {
            C6541l.subs("bytes is null");
            throw null;
        }
        this.yandex = c7017l;
        this.loadAd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3385l)) {
            return false;
        }
        C3385l c3385l = (C3385l) obj;
        if (this.yandex.equals(c3385l.yandex)) {
            return Arrays.equals(this.loadAd, c3385l.loadAd);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.loadAd) ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.yandex + ", bytes=[...]}";
    }
}
