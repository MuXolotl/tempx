package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lۤؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18670l extends AbstractC7778l {
    public static final String crashlytics;
    public final float loadAd;

    static {
        String str = AbstractC15323l.yandex;
        crashlytics = Integer.toString(1, 36);
    }

    public C18670l(float f) {
        AbstractC12442l.subs(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.loadAd = f;
    }

    @Override // defpackage.AbstractC7778l
    public final Bundle crashlytics() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC7778l.yandex, 1);
        bundle.putFloat(crashlytics, this.loadAd);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18670l) {
            return this.loadAd == ((C18670l) obj).loadAd;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.loadAd));
    }

    @Override // defpackage.AbstractC7778l
    public final boolean loadAd() {
        return this.loadAd != -1.0f;
    }

    public C18670l() {
        this.loadAd = -1.0f;
    }
}
