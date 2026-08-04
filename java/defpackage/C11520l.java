package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lُِۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11520l {
    public final String loadAd;
    public final float yandex;

    public C11520l(String str, float f) {
        this.yandex = f;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11520l)) {
            return false;
        }
        C11520l c11520l = (C11520l) obj;
        return this.yandex == c11520l.yandex && Objects.equals(this.loadAd, c11520l.loadAd);
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.yandex), this.loadAd);
    }
}
