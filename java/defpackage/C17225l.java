package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lّٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17225l implements InterfaceC18035l {
    public final String crashlytics;
    public final InterfaceC1388l loadAd;
    public final C16413l yandex;

    public C17225l(C16413l c16413l, InterfaceC1388l interfaceC1388l) {
        this.yandex = c16413l;
        this.loadAd = interfaceC1388l;
        this.crashlytics = c16413l.yandex + '<' + interfaceC1388l.license() + '>';
    }

    @Override // defpackage.InterfaceC18035l
    public final String admob(int i) {
        return this.yandex.billing[i];
    }

    @Override // defpackage.InterfaceC18035l
    public final int amazon(String str) {
        return this.yandex.amazon(str);
    }

    @Override // defpackage.InterfaceC18035l
    public final AbstractC2021l billing() {
        return this.yandex.loadAd;
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean crashlytics() {
        return false;
    }

    public final boolean equals(Object obj) {
        C17225l c17225l = obj instanceof C17225l ? (C17225l) obj : null;
        return c17225l != null && this.yandex.equals(c17225l.yandex) && AbstractC8576l.yandex(c17225l.loadAd, this.loadAd);
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean firebase(int i) {
        return this.yandex.subs[i];
    }

    @Override // defpackage.InterfaceC18035l
    public final List getAnnotations() {
        return this.yandex.amazon;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (this.loadAd.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC18035l
    public final InterfaceC18035l isPro(int i) {
        return this.yandex.mopub[i];
    }

    @Override // defpackage.InterfaceC18035l
    public final int mopub() {
        return this.yandex.crashlytics;
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final List subs(int i) {
        return this.yandex.admob[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.loadAd + ", original: " + this.yandex + ')';
    }

    @Override // defpackage.InterfaceC18035l
    public final String yandex() {
        return this.crashlytics;
    }
}
