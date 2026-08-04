package defpackage;

import android.graphics.Rect;

/* JADX INFO: renamed from: lَۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10067l {
    public final int amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    static {
        new C10067l(0, 0, 0, 0);
    }

    public C10067l(int i, int i2, int i3, int i4) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        if (i > i3) {
            C10754l.metrica(AbstractC12589l.premium(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        C10754l.metrica(AbstractC12589l.premium(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C10067l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C10067l c10067l = (C10067l) obj;
        return this.yandex == c10067l.yandex && this.loadAd == c10067l.loadAd && this.crashlytics == c10067l.crashlytics && this.amazon == c10067l.amazon;
    }

    public final int hashCode() {
        return (((((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + this.amazon;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C10067l.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.yandex);
        sb.append(',');
        sb.append(this.loadAd);
        sb.append(',');
        sb.append(this.crashlytics);
        sb.append(',');
        return AbstractC14814l.remoteconfig(this.amazon, "] }", sb);
    }

    public C10067l(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
