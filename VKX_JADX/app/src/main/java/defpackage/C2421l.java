package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٜؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2421l {
    public final boolean loadAd;
    public final float yandex;

    public C2421l(float f, boolean z) {
        this.yandex = f;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2421l)) {
            return false;
        }
        C2421l c2421l = (C2421l) obj;
        return this.loadAd == c2421l.loadAd && this.yandex == c2421l.yandex;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.loadAd), Float.valueOf(this.yandex));
    }
}
