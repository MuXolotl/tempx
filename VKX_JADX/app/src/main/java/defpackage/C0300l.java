package defpackage;

import android.content.res.Resources;

/* JADX INFO: renamed from: lْؑۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0300l {
    public final int loadAd;
    public final Resources.Theme yandex;

    public C0300l(int i, Resources.Theme theme) {
        this.yandex = theme;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0300l)) {
            return false;
        }
        C0300l c0300l = (C0300l) obj;
        return AbstractC8576l.yandex(this.yandex, c0300l.yandex) && this.loadAd == c0300l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        return "Key(theme=" + this.yandex + ", id=" + this.loadAd + ")";
    }
}
