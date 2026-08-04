package defpackage;

import android.graphics.Rect;

/* JADX INFO: renamed from: lٍّۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9742l {
    public final float loadAd;
    public final C10067l yandex;

    public C9742l(Rect rect, float f) {
        this(new C10067l(rect), f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9742l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C9742l c9742l = (C9742l) obj;
        return AbstractC8576l.yandex(this.yandex, c9742l.yandex) && this.loadAd == c9742l.loadAd;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.yandex + ", density=" + this.loadAd + ')';
    }

    public final Rect yandex() {
        C10067l c10067l = this.yandex;
        c10067l.getClass();
        return new Rect(c10067l.yandex, c10067l.loadAd, c10067l.crashlytics, c10067l.amazon);
    }

    public C9742l(C10067l c10067l, float f) {
        this.yandex = c10067l;
        this.loadAd = f;
    }
}
