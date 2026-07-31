package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lٝۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18464l {
    public final int crashlytics;
    public final C3844l loadAd;
    public final C3844l yandex;
    public static final C3844l amazon = AbstractC3670l.loadAd(":");
    public static final C3844l purchase = AbstractC3670l.loadAd(":status");
    public static final C3844l billing = AbstractC3670l.loadAd(":method");
    public static final C3844l mopub = AbstractC3670l.loadAd(":path");
    public static final C3844l admob = AbstractC3670l.loadAd(":scheme");
    public static final C3844l subs = AbstractC3670l.loadAd(":authority");

    public C18464l(String str, String str2) {
        Charset charset = AbstractC9050l.yandex;
        C3844l c3844l = new C3844l(str.getBytes(charset));
        c3844l.f7951l = str;
        C3844l c3844l2 = new C3844l(str2.getBytes(charset));
        c3844l2.f7951l = str2;
        this(c3844l, c3844l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18464l)) {
            return false;
        }
        C18464l c18464l = (C18464l) obj;
        return AbstractC8576l.yandex(this.yandex, c18464l.yandex) && AbstractC8576l.yandex(this.loadAd, c18464l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return this.yandex.tapsense() + ": " + this.loadAd.tapsense();
    }

    public C18464l(C3844l c3844l, String str) {
        C3844l c3844l2 = new C3844l(str.getBytes(AbstractC9050l.yandex));
        c3844l2.f7951l = str;
        this(c3844l, c3844l2);
    }

    public C18464l(C3844l c3844l, C3844l c3844l2) {
        this.yandex = c3844l;
        this.loadAd = c3844l2;
        this.crashlytics = c3844l2.purchase() + c3844l.purchase() + 32;
    }
}
