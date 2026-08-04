package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lؙؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6187l extends AbstractC14971l implements InterfaceC16031l, InterfaceC7150l, InterfaceC1905l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public InterfaceC16115l f13045l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C11090l f13046l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f13047l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f13048l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f13049l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f13050l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C11090l f13051l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f13052l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        if (this.f13052l) {
            m1960l(interfaceC7448l, m1961l(), (InterfaceC16061l) AbstractC13402l.loadAd(this, AbstractC4751l.firebase));
            this.f13052l = false;
        }
        int i = this.f13049l;
        int iPurchase = i != -1 ? AbstractC8576l.purchase(i, C15519l.subs(j), C15519l.mopub(j)) : C15519l.subs(j);
        int i2 = this.f13047l;
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(0, 0, iPurchase, i2 != -1 ? AbstractC8576l.purchase(i2, C15519l.subs(j), C15519l.mopub(j)) : C15519l.mopub(j), 3, j));
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 6));
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        m1963l(abstractC11754l);
        int i2 = this.f13049l;
        int i3 = this.f13047l;
        if (i2 == i3) {
            return i3;
        }
        int iCrashlytics = interfaceC6357l.crashlytics(i);
        int i4 = this.f13049l;
        int i5 = this.f13047l;
        if (iCrashlytics < i4) {
            iCrashlytics = i4;
        }
        return iCrashlytics > i5 ? i5 : iCrashlytics;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        this.f13046l = null;
        this.f13045l = null;
        this.f13052l = false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        InterfaceC16061l interfaceC16061l = (InterfaceC16061l) AbstractC13402l.loadAd(this, AbstractC4751l.firebase);
        this.f13046l = AbstractC7709l.crashlytics(this.f13051l, AbstractC5573l.metrica(this).f7691l);
        AbstractC17569l abstractC17569l = m1961l().yandex.billing;
        C6886l c6886l = m1961l().yandex.crashlytics;
        if (c6886l == null) {
            c6886l = C6886l.f14425l;
        }
        C11617l c11617l = m1961l().yandex.amazon;
        int i = c11617l != null ? c11617l.yandex : 0;
        C8689l c8689l = m1961l().yandex.purchase;
        this.f13045l = ((C7620l) interfaceC16061l).loadAd(abstractC17569l, c6886l, i, c8689l != null ? c8689l.yandex : 65535);
        AbstractC3700l.admob(this, new C0338l(this, 0));
        this.f13052l = true;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m1960l(InterfaceC7448l interfaceC7448l, C11090l c11090l, InterfaceC16061l interfaceC16061l) {
        C18118l c18118l = (C18118l) AbstractC3618l.loadAd(c11090l, interfaceC7448l, interfaceC16061l, 3).f15549l;
        float fAdmob = c18118l.admob(0);
        float fAdmob2 = c18118l.admob(1);
        float fAdmob3 = c18118l.admob(2);
        this.f13049l = AbstractC17653l.crashlytics(fAdmob, fAdmob2, fAdmob3, this.f13048l, 1);
        this.f13047l = AbstractC17653l.crashlytics(fAdmob, fAdmob2, fAdmob3, this.f13050l, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        this.f13052l = true;
        AbstractC4047l.isPro(this);
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final C11090l m1961l() {
        C11090l c11090l = this.f13046l;
        if (c11090l != null) {
            return c11090l;
        }
        throw AbstractC1757l.m1043volatile("Resolved style is not set.");
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final void mo1962l() {
        this.f13046l = AbstractC7709l.crashlytics(this.f13051l, AbstractC5573l.metrica(this).f7691l);
        this.f13052l = true;
        AbstractC4047l.isPro(this);
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final void m1963l(AbstractC11754l abstractC11754l) {
        if (this.f13052l) {
            m1960l(abstractC11754l, m1961l(), (InterfaceC16061l) AbstractC13402l.loadAd(this, AbstractC4751l.firebase));
            this.f13052l = false;
        }
        int i = this.f13049l;
        this.f13049l = i >= 0 ? i : 0;
        int i2 = this.f13047l;
        if (i2 == -1) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        this.f13047l = i2;
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        m1963l(abstractC11754l);
        int i2 = this.f13049l;
        if (i2 == this.f13047l) {
            return i2;
        }
        int iMo1460for = interfaceC6357l.mo1460for(i);
        int i3 = this.f13049l;
        int i4 = this.f13047l;
        if (iMo1460for < i3) {
            iMo1460for = i3;
        }
        return iMo1460for > i4 ? i4 : iMo1460for;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while */
    public final void mo540while() {
        if (this.f13045l != null) {
            AbstractC3700l.admob(this, new C0338l(this, 1));
        }
        this.f13052l = true;
        AbstractC4047l.isPro(this);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
