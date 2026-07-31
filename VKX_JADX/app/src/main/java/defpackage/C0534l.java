package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: lؑۘؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0534l extends AbstractC8939l {
    public final int crashlytics;
    public final long loadAd;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0534l(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC10971l.isPro();
            porterDuffColorFilter = AbstractC10971l.yandex(AbstractC12953l.startapp(j), AbstractC11880l.m3270case(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC12953l.startapp(j), AbstractC11880l.m3272class(i));
        }
        super(porterDuffColorFilter);
        this.loadAd = j;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0534l)) {
            return false;
        }
        C0534l c0534l = (C0534l) obj;
        return C9735l.crashlytics(this.loadAd, c0534l.loadAd) && this.crashlytics == c0534l.crashlytics;
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return (C10882l.yandex(this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        return AbstractC14814l.ads("BlendModeColorFilter(color=", C9735l.subs(this.loadAd), ", blendMode=", AbstractC16759l.amazon(this.crashlytics), ")");
    }
}
