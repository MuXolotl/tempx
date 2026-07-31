package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٖٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14179l {
    public final int loadAd;
    public final int yandex;

    public C14179l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14179l)) {
            return false;
        }
        C14179l c14179l = (C14179l) obj;
        return this.yandex == c14179l.yandex && this.loadAd == c14179l.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.loadAd), Integer.valueOf(this.yandex));
    }
}
