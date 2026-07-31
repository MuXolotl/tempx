package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: lؚؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0901l extends AbstractC4072l {
    public final C11315l Signature;
    public final C7026l ads;
    public int license;
    public final String subscription;
    public final C13975l tapsense;

    public C0901l(C7026l c7026l, String str, C13975l c13975l) {
        this.ads = c7026l;
        this.subscription = str;
        this.tapsense = c13975l;
        C11315l c11315l = new C11315l();
        c11315l.addLast(str);
        this.Signature = c11315l;
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void adcel(long j) {
        ((SharedPreferences) this.ads.f14720l).edit().putLong(m749throws(), j).apply();
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void admob(byte b) {
        this.ads.premium(b, m749throws());
    }

    @Override // defpackage.AbstractC4072l
    public final void advert(InterfaceC18035l interfaceC18035l, int i) {
        C11315l c11315l = this.Signature;
        if (c11315l.f22809l > this.license) {
            c11315l.removeLast();
        }
        c11315l.addLast(interfaceC18035l.admob(i));
    }

    @Override // defpackage.InterfaceC17739l
    public final void amazon() {
        String strM749throws = m749throws();
        C7026l c7026l = this.ads;
        c7026l.inmobi(strM749throws);
        c7026l.signatures(m749throws().concat("?"), false);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void billing(double d) {
        ((SharedPreferences) this.ads.f14720l).edit().putLong(m749throws(), Double.doubleToRawLongBits(d)).apply();
    }

    @Override // defpackage.InterfaceC17739l
    public final InterfaceC0039l crashlytics(InterfaceC18035l interfaceC18035l) {
        this.license++;
        return this;
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void firebase(float f) {
        ((SharedPreferences) this.ads.f14720l).edit().putFloat(m749throws(), f).apply();
    }

    @Override // defpackage.InterfaceC17739l
    public final C13975l loadAd() {
        return this.tapsense;
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void metrica(int i) {
        this.ads.premium(i, m749throws());
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void mopub(short s) {
        this.ads.premium(s, m749throws());
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void remoteconfig() {
        this.ads.signatures(m749throws().concat("?"), true);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void smaato(char c) {
        this.ads.premium(c, m749throws());
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void subs(boolean z) {
        this.ads.signatures(m749throws(), z);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void subscription(String str) {
        ((SharedPreferences) this.ads.f14720l).edit().putString(m749throws(), str).apply();
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final InterfaceC0039l tapsense(InterfaceC18035l interfaceC18035l, int i) {
        this.ads.premium(i, m749throws().concat(".size"));
        crashlytics(interfaceC18035l);
        return this;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final String m749throws() {
        return AbstractC16901l.m4210case(this.Signature, ".", null, null, null, 62);
    }

    @Override // defpackage.InterfaceC17739l
    public final void vip(InterfaceC18035l interfaceC18035l, int i) {
        this.ads.premium(i, m749throws());
    }

    @Override // defpackage.InterfaceC0039l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
        this.license--;
        C11315l c11315l = this.Signature;
        c11315l.removeLast();
        if (c11315l.isEmpty()) {
            c11315l.addLast(this.subscription);
        }
    }
}
