package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lْؐۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13049l {
    public final long amazon;
    public final long crashlytics;
    public final String loadAd;
    public final Bundle purchase;
    public final String yandex;

    public C13049l(long j, long j2, Bundle bundle, String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.purchase = bundle;
        this.crashlytics = j;
        this.amazon = j2;
    }

    public static C13049l yandex(C13236l c13236l) {
        String str = c13236l.f26010l;
        String str2 = c13236l.f26008l;
        return new C13049l(c13236l.f26012l, c13236l.f26011l, c13236l.f26009l.firebase(), str, str2);
    }

    public final C13236l loadAd() {
        C16021l c16021l = new C16021l(new Bundle(this.purchase));
        return new C13236l(this.yandex, c16021l, this.loadAd, this.crashlytics, this.amazon);
    }

    public final String toString() {
        String string = this.purchase.toString();
        String str = this.loadAd;
        int length = String.valueOf(str).length();
        String str2 = this.yandex;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        AbstractC9361l.appmetrica(sb, "origin=", str, ",name=", str2);
        return AbstractC0653l.ads(sb, ",params=", string);
    }
}
