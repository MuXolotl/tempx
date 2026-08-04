package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4067l implements InterfaceC18035l {
    public final InterfaceC18035l crashlytics;
    public final InterfaceC18035l loadAd;
    public final String yandex;

    public C4067l(String str, InterfaceC18035l interfaceC18035l, InterfaceC18035l interfaceC18035l2) {
        this.yandex = str;
        this.loadAd = interfaceC18035l;
        this.crashlytics = interfaceC18035l2;
    }

    @Override // defpackage.InterfaceC18035l
    public final String admob(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.InterfaceC18035l
    public final int amazon(String str) {
        Integer numSignatures = AbstractC16648l.signatures(str);
        if (numSignatures != null) {
            return numSignatures.intValue();
        }
        C8339l.metrica(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.InterfaceC18035l
    public final AbstractC2021l billing() {
        return C2861l.amazon;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4067l)) {
            return false;
        }
        C4067l c4067l = (C4067l) obj;
        return this.yandex.equals(c4067l.yandex) && this.loadAd.equals(c4067l.loadAd) && this.crashlytics.equals(c4067l.crashlytics);
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean firebase(int i) {
        if (i >= 0) {
            return false;
        }
        C10754l.metrica(AbstractC0653l.ads(AbstractC2812l.Signature("Illegal index ", i, ", "), this.yandex, " expects only non-negative indices"));
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ List getAnnotations() {
        return C2580l.f5619l;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC18035l
    public final InterfaceC18035l isPro(int i) {
        if (i < 0) {
            C10754l.metrica(AbstractC0653l.ads(AbstractC2812l.Signature("Illegal index ", i, ", "), this.yandex, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.loadAd;
        }
        if (i2 == 1) {
            return this.crashlytics;
        }
        C8339l.smaato("Unreached");
        return null;
    }

    @Override // defpackage.InterfaceC18035l
    public final int mopub() {
        return 2;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final List subs(int i) {
        if (i >= 0) {
            return C2580l.f5619l;
        }
        C10754l.metrica(AbstractC0653l.ads(AbstractC2812l.Signature("Illegal index ", i, ", "), this.yandex, " expects only non-negative indices"));
        return null;
    }

    public final String toString() {
        return this.yandex + '(' + this.loadAd + ", " + this.crashlytics + ')';
    }

    @Override // defpackage.InterfaceC18035l
    public final String yandex() {
        return this.yandex;
    }
}
