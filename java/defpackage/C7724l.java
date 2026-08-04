package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lًِؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7724l extends AbstractC7778l {
    public static final String amazon;
    public static final String purchase;
    public final boolean crashlytics;
    public final boolean loadAd;

    static {
        String str = AbstractC15323l.yandex;
        amazon = Integer.toString(1, 36);
        purchase = Integer.toString(2, 36);
    }

    public C7724l() {
        this.loadAd = false;
        this.crashlytics = false;
    }

    @Override // defpackage.AbstractC7778l
    public final Bundle crashlytics() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC7778l.yandex, 3);
        bundle.putBoolean(amazon, this.loadAd);
        bundle.putBoolean(purchase, this.crashlytics);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7724l)) {
            return false;
        }
        C7724l c7724l = (C7724l) obj;
        return this.crashlytics == c7724l.crashlytics && this.loadAd == c7724l.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.loadAd), Boolean.valueOf(this.crashlytics));
    }

    @Override // defpackage.AbstractC7778l
    public final boolean loadAd() {
        return this.loadAd;
    }

    public C7724l(boolean z) {
        this.loadAd = true;
        this.crashlytics = z;
    }
}
