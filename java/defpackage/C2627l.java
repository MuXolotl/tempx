package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2627l extends AbstractC12972l {
    public final byte[] amazon;
    public final C2759l crashlytics;
    public final C5254l loadAd;
    public final String yandex;

    public C2627l(String str, C5254l c5254l, C2759l c2759l) {
        this.yandex = str;
        this.loadAd = c5254l;
        this.crashlytics = c2759l;
        Charset charsetYandex = AbstractC15755l.yandex(c5254l);
        this.amazon = C17423l.smaato(str, charsetYandex == null ? AbstractC9050l.yandex : charsetYandex);
    }

    @Override // defpackage.AbstractC8870l
    public final C2759l amazon() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC8870l
    public final C5254l loadAd() {
        return this.loadAd;
    }

    @Override // defpackage.AbstractC12972l
    public final byte[] purchase() {
        return this.amazon;
    }

    public final String toString() {
        return "TextContent[" + this.loadAd + "] \"" + AbstractC12024l.m3332l(30, this.yandex) + '\"';
    }

    @Override // defpackage.AbstractC8870l
    public final Long yandex() {
        return Long.valueOf(this.amazon.length);
    }
}
