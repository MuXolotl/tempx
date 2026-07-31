package defpackage;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9288l extends AbstractC17450l implements InterfaceC16031l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C5616l f19087l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f19088l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f19089l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C7504l f19090l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C10312l f19091l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C16328l f19092l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C12217l f19093l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C15620l f19094l;

    public C9288l(C16328l c16328l, C12217l c12217l, C10312l c10312l, boolean z) {
        this.f19092l = c16328l;
        this.f19093l = c12217l;
        this.f19091l = c10312l;
        this.f19089l = z;
        C10086l c10086lSmaato = AbstractC8020l.smaato(new C4999l(0L));
        this.f19088l = c10086lSmaato;
        this.f19087l = new C5616l(new C1187l(C5795l.amazon(this.f19092l, this.f19093l, this.f19091l, ((C4999l) c10086lSmaato.getValue()).yandex)), AbstractC3415l.loadAd, new C1187l(AbstractC3415l.crashlytics), 8);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: lٛٙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C9288l f35997l;

            {
                this.f35997l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                C9288l c9288l = this.f35997l;
                switch (i2) {
                    case 0:
                        return (C1187l) c9288l.f19087l.amazon();
                    default:
                        C2261l c2261l = (C2261l) obj;
                        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) AbstractC13402l.loadAd(c9288l, AbstractC4751l.admob);
                        c9288l.f19088l.setValue(new C4999l((((long) interfaceC13490l.mo870l(C2261l.loadAd(c2261l.yandex))) << 32) | (((long) interfaceC13490l.mo870l(C2261l.yandex(c2261l.yandex))) & 4294967295L)));
                        return Unit.INSTANCE;
                }
            }
        };
        final int i2 = 1;
        Function1 function2 = new Function1(this) { // from class: lٛٙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C9288l f35997l;

            {
                this.f35997l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                C9288l c9288l = this.f35997l;
                switch (i3) {
                    case 0:
                        return (C1187l) c9288l.f19087l.amazon();
                    default:
                        C2261l c2261l = (C2261l) obj;
                        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) AbstractC13402l.loadAd(c9288l, AbstractC4751l.admob);
                        c9288l.f19088l.setValue(new C4999l((((long) interfaceC13490l.mo870l(C2261l.loadAd(c2261l.yandex))) << 32) | (((long) interfaceC13490l.mo870l(C2261l.yandex(c2261l.yandex))) & 4294967295L)));
                        return Unit.INSTANCE;
                }
            }
        };
        if (!AbstractC11433l.yandex()) {
            C10754l.ads("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        C15620l c15620l = new C15620l(function1, function2, Build.VERSION.SDK_INT == 28 ? C16278l.f31881l : C3303l.f7043l);
        m3069l(c15620l);
        this.f19094l = c15620l;
    }

    @Override // defpackage.AbstractC17450l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void mo2634for(InterfaceC18212l interfaceC18212l) {
        this.f19094l.mo1346for(interfaceC18212l);
    }

    @Override // defpackage.AbstractC17450l, defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        this.f19094l.isPro(interfaceC17593l);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void m2635l() {
        C7504l c7504l = this.f19090l;
        InterfaceC14029l interfaceC14029l = null;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.f19090l = null;
        if (AbstractC11433l.yandex()) {
            if (!this.f19089l && (((C1187l) this.f19087l.amazon()).yandex & 9223372034707292159L) != 9205357640488583168L) {
                AbstractC10999l.mopub(m3914l(), null, 4, new C17972l(this, interfaceC14029l, 27), 1);
            }
            this.f19090l = AbstractC10999l.mopub(m3914l(), null, 0, new C15352l(this, interfaceC14029l, 19), 3);
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        m2635l();
    }

    @Override // defpackage.AbstractC17450l, defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        c6742l.yandex();
        this.f19094l.mo536l(c6742l);
    }

    @Override // defpackage.AbstractC17450l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public final void mo1102l(C16328l c16328l, C12217l c12217l, C10312l c10312l, boolean z) {
        C16328l c16328l2 = this.f19092l;
        C12217l c12217l2 = this.f19093l;
        C10312l c10312l2 = this.f19091l;
        boolean z2 = this.f19089l;
        this.f19092l = c16328l;
        this.f19093l = c12217l;
        this.f19091l = c10312l;
        this.f19089l = z;
        if (AbstractC8576l.yandex(c16328l, c16328l2) && c12217l == c12217l2 && AbstractC8576l.yandex(c10312l, c10312l2) && z == z2) {
            return;
        }
        m2635l();
    }
}
