package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10304l extends AbstractC11340l implements InterfaceC7150l, InterfaceC16388l, InterfaceC16031l, InterfaceC3506l, InterfaceC3703l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public int f20991l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public InterfaceC13515l f20992l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public AbstractC9544l f20993l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C12217l f20994l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C16328l f20995l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final C4451l f20996l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C11194l f20997l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C10312l f20998l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f20999l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public C8896l f21000l = new C8896l(-1.0f, -1.0f, -1.0f, -1.0f);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C13404l f21001l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public EnumC7283l f21002l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C7504l f21003l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C10715l f21004l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public int f21005l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final AbstractC17450l f21006l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public C12814l f21007l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f21008l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f21009l;

    public C10304l(boolean z, boolean z2, boolean z3, C10312l c10312l, C16328l c16328l, C12217l c12217l, AbstractC9544l abstractC9544l, boolean z4, C11194l c11194l, EnumC7283l enumC7283l, C10715l c10715l, InterfaceC13515l interfaceC13515l) {
        this.f20999l = z;
        this.f21008l = z2;
        this.f20998l = c10312l;
        this.f20995l = c16328l;
        this.f20994l = c12217l;
        this.f20993l = abstractC9544l;
        this.f21009l = z4;
        this.f20997l = c11194l;
        this.f21002l = enumC7283l;
        this.f21004l = c10715l;
        this.f20992l = interfaceC13515l;
        AbstractC17450l c9288l = AbstractC11433l.yandex() ? new C9288l(c16328l, c12217l, c10312l, z || z2 || z3) : new C1980l();
        m3069l(c9288l);
        this.f21006l = c9288l;
        InterfaceC14029l interfaceC14029l = null;
        C4451l c4451l = new C4451l(this.f21004l, new C13954l(this, interfaceC14029l, 6), new C4978l(this, interfaceC14029l, 4), new C0783l(8, this));
        m3069l(c4451l);
        this.f20996l = c4451l;
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(final InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        EnumC7283l enumC7283l = this.f21002l;
        EnumC7283l enumC7283l2 = EnumC7283l.f15126l;
        C14054l c14054l = C14054l.f27396l;
        if (enumC7283l == enumC7283l2) {
            final AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(0, 0, 0, Alert.DURATION_SHOW_INDEFINITELY, 7, j));
            final int iMin = Math.min(abstractC10113lAdcel.f20591l, C15519l.mopub(j));
            final int i = 1;
            return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, iMin, c14054l, new Function1(this) { // from class: lؘؔٗ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C10304l f5772l;

                {
                    this.f5772l = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    InterfaceC7448l interfaceC7448l2 = interfaceC7448l;
                    AbstractC10113l abstractC10113l = abstractC10113lAdcel;
                    AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                    switch (i2) {
                        case 0:
                            int i3 = abstractC10113l.f20592l;
                            C10304l c10304l = this.f5772l;
                            c10304l.m2909l(abstractC9601l, iMin, i3, c10304l.f20995l.amazon().f12061l, interfaceC7448l2.getLayoutDirection());
                            AbstractC9601l.smaato(abstractC9601l, abstractC10113l, -c10304l.f20997l.yandex.admob(), 0);
                            break;
                        default:
                            int i4 = abstractC10113l.f20591l;
                            C10304l c10304l2 = this.f5772l;
                            c10304l2.m2909l(abstractC9601l, iMin, i4, c10304l2.f20995l.amazon().f12061l, interfaceC7448l2.getLayoutDirection());
                            AbstractC9601l.smaato(abstractC9601l, abstractC10113l, 0, -c10304l2.f20997l.yandex.admob());
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        final AbstractC10113l abstractC10113lAdcel2 = interfaceC6357l.adcel(C15519l.yandex(0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13, j));
        final int iMin2 = Math.min(abstractC10113lAdcel2.f20592l, C15519l.admob(j));
        final int i2 = 0;
        return interfaceC7448l.isVip(iMin2, abstractC10113lAdcel2.f20591l, c14054l, new Function1(this) { // from class: lؘؔٗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C10304l f5772l;

            {
                this.f5772l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                InterfaceC7448l interfaceC7448l2 = interfaceC7448l;
                AbstractC10113l abstractC10113l = abstractC10113lAdcel2;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                switch (i3) {
                    case 0:
                        int i4 = abstractC10113l.f20592l;
                        C10304l c10304l = this.f5772l;
                        c10304l.m2909l(abstractC9601l, iMin2, i4, c10304l.f20995l.amazon().f12061l, interfaceC7448l2.getLayoutDirection());
                        AbstractC9601l.smaato(abstractC9601l, abstractC10113l, -c10304l.f20997l.yandex.admob(), 0);
                        break;
                    default:
                        int i5 = abstractC10113l.f20591l;
                        C10304l c10304l2 = this.f5772l;
                        c10304l2.m2909l(abstractC9601l, iMin2, i5, c10304l2.f20995l.amazon().f12061l, interfaceC7448l2.getLayoutDirection());
                        AbstractC9601l.smaato(abstractC9601l, abstractC10113l, 0, -c10304l2.f20997l.yandex.admob());
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3506l
    /* JADX INFO: renamed from: for */
    public final void mo1346for(InterfaceC18212l interfaceC18212l) {
        this.f20998l.amazon.setValue(interfaceC18212l);
        this.f21006l.mo2634for(interfaceC18212l);
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        this.f21006l.isPro(interfaceC17593l);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void m2908l() {
        if (this.f21001l == null) {
            this.f21001l = new C13404l(((Boolean) AbstractC13402l.loadAd(this, AbstractC4751l.advert)).booleanValue());
            AbstractC2697l.firebase(this);
        }
        this.f21003l = AbstractC10999l.mopub(m3914l(), null, 0, new C17972l(this, (InterfaceC14029l) null, 25), 3);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        C12217l c12217l = this.f20994l;
        boolean z = this.f20999l;
        c12217l.subs = z;
        if (z && m2910l()) {
            m2908l();
        }
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) throws Throwable {
        int iMopub;
        int iBilling;
        C6742l c6742l2 = c6742l;
        C13601l c13601l = c6742l2.f14144l;
        c6742l2.yandex();
        C5667l c5667lAmazon = this.f20995l.amazon();
        C0327l c0327lCrashlytics = this.f20998l.crashlytics();
        if (c0327lCrashlytics == null) {
            return;
        }
        C8195l c8195l = c5667lAmazon.f12062l;
        C8195l c8195l2 = c5667lAmazon.f12062l;
        long j = c5667lAmazon.f12061l;
        if (c8195l != null) {
            int i = ((C9058l) c8195l.f17098l).yandex;
            long j2 = ((C12814l) c8195l.f17097l).yandex;
            if (!C12814l.amazon(j2)) {
                C9902l c9902lFirebase = c0327lCrashlytics.firebase(C12814l.mopub(j2), C12814l.billing(j2));
                C11090l c11090l = c0327lCrashlytics.yandex.loadAd;
                if (i == 1) {
                    AbstractC9544l abstractC9544lLoadAd = c11090l.loadAd();
                    if (abstractC9544lLoadAd != null) {
                        AbstractC9361l.smaato(c6742l2, c9902lFirebase, abstractC9544lLoadAd, 0.2f, null, null, 56);
                        c6742l2 = c6742l;
                    } else {
                        long jCrashlytics = c11090l.crashlytics();
                        if (jCrashlytics == 16) {
                            jCrashlytics = C9735l.loadAd;
                        }
                        c6742l2 = c6742l;
                        AbstractC9361l.remoteconfig(c6742l2, c9902lFirebase, C9735l.loadAd(C9735l.amazon(jCrashlytics) * 0.2f, jCrashlytics), 0.0f, null, 60);
                    }
                } else {
                    c6742l2 = c6742l;
                    AbstractC9361l.remoteconfig(c6742l2, c9902lFirebase, ((C8620l) AbstractC13402l.loadAd(this, AbstractC4524l.yandex)).loadAd, 0.0f, null, 60);
                }
            }
        }
        if (C12814l.amazon(j)) {
            AbstractC14024l.Signature(c13601l.f26629l.m4555synchronized(), c0327lCrashlytics);
            if (c8195l2 == null) {
                AbstractC9544l abstractC9544l = this.f20993l;
                boolean zM2910l = m2910l();
                C13404l c13404l = this.f21001l;
                C12217l c12217l = this.f20994l;
                float fAdmob = c13404l != null ? c13404l.crashlytics.admob() : 0.0f;
                if (fAdmob != 0.0f && zM2910l) {
                    C8896l c8896lFirebase = c12217l.firebase();
                    float f = c8896lFirebase.crashlytics;
                    float f2 = c8896lFirebase.yandex;
                    float f3 = f - f2;
                    c6742l2.f14144l.purchase(abstractC9544l, (((long) Float.floatToRawIntBits((f3 / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(c8896lFirebase.loadAd)) & 4294967295L), c8896lFirebase.crashlytics(), f3, fAdmob);
                }
            }
        } else {
            if (c8195l2 == null && (iMopub = C12814l.mopub(j)) != (iBilling = C12814l.billing(j))) {
                AbstractC9361l.remoteconfig(c6742l2, c0327lCrashlytics.firebase(iMopub, iBilling), ((C8620l) AbstractC13402l.loadAd(this, AbstractC4524l.yandex)).loadAd, 0.0f, null, 60);
            }
            AbstractC14024l.Signature(c13601l.f26629l.m4555synchronized(), c0327lCrashlytics);
        }
        this.f21006l.mo536l(c6742l2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3  */
    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void m2909l(AbstractC9601l abstractC9601l, int i, int i2, long j, EnumC9931l enumC9931l) {
        int i3;
        C0327l c0327lCrashlytics;
        float f;
        this.f20997l.loadAd.subs(i);
        this.f20997l.billing(i2 - i);
        C12814l c12814l = this.f21007l;
        if (c12814l != null) {
            int i4 = C12814l.crashlytics;
            int i5 = (int) (j & 4294967295L);
            long j2 = c12814l.yandex;
            if (i5 == ((int) (j2 & 4294967295L))) {
                i3 = (int) (j >> 32);
                if (i3 == ((int) (j2 >> 32)) && i2 == this.f21005l && i == this.f20991l) {
                    i3 = -1;
                }
            } else {
                int i6 = C12814l.crashlytics;
                i3 = (int) (4294967295L & j);
            }
        } else {
            int i7 = C12814l.crashlytics;
            i3 = (int) (4294967295L & j);
        }
        if (i3 < 0 || !m2910l() || (c0327lCrashlytics = this.f20998l.crashlytics()) == null) {
            return;
        }
        C8896l c8896lCrashlytics = c0327lCrashlytics.crashlytics(AbstractC8576l.billing(i3, new C8934l(0, c0327lCrashlytics.yandex.yandex.f7563l.length(), 1)));
        float f2 = c8896lCrashlytics.yandex;
        float f3 = c8896lCrashlytics.crashlytics;
        boolean z = enumC9931l == EnumC9931l.f20222l;
        abstractC9601l.getClass();
        int iYandex = AbstractC9361l.yandex(abstractC9601l, 2.0f);
        float f4 = z ? i2 - f3 : f2;
        if (z) {
            f2 = i2 - f3;
        }
        float f5 = f2 + iYandex;
        float f6 = i2;
        if (f5 > f6) {
            f5 = f6;
        }
        C8896l c8896lLoadAd = C8896l.loadAd(c8896lCrashlytics, f4, f5, 0.0f, 10);
        float f7 = c8896lLoadAd.loadAd;
        float f8 = c8896lLoadAd.yandex;
        C8896l c8896l = this.f21000l;
        boolean z2 = (f8 == c8896l.yandex && f7 == c8896l.loadAd && i2 == this.f21005l) ? false : true;
        if (z2 || i != this.f20991l) {
            boolean z3 = this.f21002l == EnumC7283l.f15126l;
            if (!z3) {
                f7 = f8;
            }
            float f9 = z3 ? c8896lLoadAd.amazon : c8896lLoadAd.crashlytics;
            int iAdmob = this.f20997l.yandex.admob();
            float f10 = iAdmob + i;
            if (f9 > f10) {
                f = f9 - f10;
            } else {
                float f11 = iAdmob;
                if (f7 >= f11 || f9 - f7 <= i) {
                    f = (f7 >= f11 || f9 - f7 > ((float) i)) ? 0.0f : f7 - f11;
                } else {
                    f = f9 - f10;
                }
            }
            this.f21007l = new C12814l(j);
            this.f21000l = c8896lLoadAd;
            this.f20991l = i;
            this.f21005l = i2;
            AbstractC10999l.mopub(m3914l(), null, 4, new C12017l(f, this, z2, j, c8896lCrashlytics, null), 1);
        }
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final boolean m2910l() {
        if (!this.f21009l) {
            return false;
        }
        if (!this.f20999l && !this.f21008l) {
            return false;
        }
        AbstractC9544l abstractC9544l = this.f20993l;
        return ((abstractC9544l instanceof C8990l) && ((C8990l) abstractC9544l).yandex == 16) ? false : true;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
