package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15720l extends C1852l {
    public final boolean adcel;
    public Function1 ads;
    public final C1852l metrica;
    public final boolean startapp;
    public Function1 subscription;
    public final long tapsense;

    /* JADX WARN: Illegal instructions before constructor call */
    public C15720l(C1852l c1852l, Function1 function1, Function1 function2, boolean z, boolean z2) {
        Function1 function1Subs;
        Function1 function1Purchase;
        C1698l c1698l = AbstractC9620l.yandex;
        super(0L, C8739l.f17990l, AbstractC9620l.firebase(function1, (c1852l == null || (function1Purchase = c1852l.purchase()) == null) ? AbstractC9620l.isPro.purchase : function1Purchase, z), AbstractC9620l.smaato(function2, (c1852l == null || (function1Subs = c1852l.subs()) == null) ? AbstractC9620l.isPro.billing : function1Subs));
        this.metrica = c1852l;
        this.startapp = z;
        this.adcel = z2;
        this.ads = this.purchase;
        this.subscription = this.billing;
        this.tapsense = AbstractC4071l.loadAd();
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final AbstractC18620l Signature(Function1 function1) {
        Function1 function1Firebase = AbstractC9620l.firebase(function1, this.ads, true);
        return !this.startapp ? AbstractC9620l.mopub(inmobi().Signature(null), function1Firebase, true) : inmobi().Signature(function1Firebase);
    }

    @Override // defpackage.C1852l
    public final C6295l ad() {
        return inmobi().ad();
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final int admob() {
        return inmobi().admob();
    }

    @Override // defpackage.AbstractC18620l
    public final void ads(C8739l c8739l) {
        AbstractC15344l.admob();
        throw null;
    }

    @Override // defpackage.C1852l
    /* JADX INFO: renamed from: advert */
    public final Function1 purchase() {
        return this.ads;
    }

    @Override // defpackage.AbstractC18620l
    public final C8739l amazon() {
        return inmobi().amazon();
    }

    @Override // defpackage.C1852l
    public final void applovin(C6295l c6295l) {
        AbstractC15344l.admob();
        throw null;
    }

    @Override // defpackage.C1852l
    public final C1852l appmetrica(Function1 function1, Function1 function2) {
        Function1 function1Firebase = AbstractC9620l.firebase(function1, this.ads, true);
        Function1 function1Smaato = AbstractC9620l.smaato(function2, this.subscription);
        return !this.startapp ? new C15720l(inmobi().appmetrica(null, function1Smaato), function1Firebase, function1Smaato, false, true) : inmobi().appmetrica(function1Firebase, function1Smaato);
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final boolean billing() {
        return inmobi().billing();
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void crashlytics() {
        C1852l c1852l;
        this.crashlytics = true;
        if (!this.adcel || (c1852l = this.metrica) == null) {
            return;
        }
        c1852l.crashlytics();
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void firebase() {
        AbstractC15344l.admob();
        throw null;
    }

    public final C1852l inmobi() {
        C1852l c1852l = this.metrica;
        return c1852l == null ? AbstractC9620l.isPro : c1852l;
    }

    @Override // defpackage.AbstractC18620l
    public final long mopub() {
        return inmobi().mopub();
    }

    @Override // defpackage.C1852l
    public final AbstractC6873l pro() {
        return inmobi().pro();
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final Function1 purchase() {
        return this.ads;
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void remoteconfig() {
        inmobi().remoteconfig();
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void smaato() {
        AbstractC15344l.admob();
        throw null;
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final Function1 subs() {
        return this.subscription;
    }

    @Override // defpackage.AbstractC18620l
    public final void subscription(long j) {
        AbstractC15344l.admob();
        throw null;
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void tapsense(int i) {
        inmobi().tapsense(i);
    }

    @Override // defpackage.C1852l, defpackage.AbstractC18620l
    public final void vip(InterfaceC2763l interfaceC2763l) {
        inmobi().vip(interfaceC2763l);
    }
}
