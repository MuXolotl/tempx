package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lًٍؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7886l extends AbstractC7778l {
    public static final String amazon;
    public static final String purchase;
    public final float crashlytics;
    public final int loadAd;

    static {
        String str = AbstractC15323l.yandex;
        amazon = Integer.toString(1, 36);
        purchase = Integer.toString(2, 36);
    }

    public C7886l(int i, float f) {
        boolean z = false;
        AbstractC12442l.subs(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        AbstractC12442l.subs(z, "starRating is out of range [0, maxStars]");
        this.loadAd = i;
        this.crashlytics = f;
    }

    @Override // defpackage.AbstractC7778l
    public final Bundle crashlytics() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC7778l.yandex, 2);
        bundle.putInt(amazon, this.loadAd);
        bundle.putFloat(purchase, this.crashlytics);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7886l)) {
            return false;
        }
        C7886l c7886l = (C7886l) obj;
        return this.loadAd == c7886l.loadAd && this.crashlytics == c7886l.crashlytics;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.loadAd), Float.valueOf(this.crashlytics));
    }

    @Override // defpackage.AbstractC7778l
    public final boolean loadAd() {
        return this.crashlytics != -1.0f;
    }

    public C7886l(int i) {
        AbstractC12442l.subs(i > 0, "maxStars must be a positive integer");
        this.loadAd = i;
        this.crashlytics = -1.0f;
    }
}
