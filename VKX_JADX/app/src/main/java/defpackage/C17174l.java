package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٗٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17174l {
    public final Class loadAd;
    public final Class yandex;

    public C17174l(Class cls, Class cls2) {
        this.yandex = cls;
        this.loadAd = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17174l)) {
            return false;
        }
        C17174l c17174l = (C17174l) obj;
        return c17174l.yandex.equals(this.yandex) && c17174l.loadAd.equals(this.loadAd);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd);
    }

    public final String toString() {
        return AbstractC9361l.pro(this.yandex.getSimpleName(), " with primitive type: ", this.loadAd.getSimpleName());
    }
}
