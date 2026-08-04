package defpackage;

import android.os.Trace;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑٛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0432l extends AbstractC11340l implements InterfaceC7150l, InterfaceC16388l, InterfaceC11189l, InterfaceC16031l, InterfaceC1905l, InterfaceC4191l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public C16905l[] f1566l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C0783l f1567l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C11925l f1568l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C0580l f1569l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C0580l f1570l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public C17158l[] f1571l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C11644l f1572l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C6943l f1573l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C14526l f1574l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public AbstractC15342l f1575l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public long f1576l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C6257l f1577l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C7504l f1578l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public EnumC9931l f1579l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C2403l f1580l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public AbstractC18072l[] f1581l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public AbstractC18072l[] f1582l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public InterfaceC6347l f1583l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public InterfaceC5428l f1584l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C5767l f1585l;

    public C0432l(C6257l c6257l, InterfaceC5428l interfaceC5428l) {
        this.f1584l = interfaceC5428l;
        C6943l c6943l = new C6943l();
        c6943l.f14561l = 1.0f;
        C1280l c1280l = C1280l.yandex;
        c6943l.f14565l = c1280l;
        c6943l.f14556l = c1280l;
        this.f1573l = c6943l;
        this.f1570l = new C0580l();
        this.f1572l = new C11644l(7, false);
        this.f1577l = c6257l == null ? new C6257l(null) : c6257l;
        this.f1576l = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public static C0580l m532l(C0432l c0432l, int i) {
        C0580l c0580l = c0432l.f1570l;
        C6943l c6943l = c0432l.f1573l;
        if ((c6943l.amazon() & i) == 0) {
            return c0580l;
        }
        C0580l c0580l2 = new C0580l();
        c6943l.mopub(i, c0580l2);
        return c0580l2;
    }

    @Override // defpackage.InterfaceC11189l
    public final Object adcel() {
        return "StyleOuterNode";
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, final long j) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4;
        C0580l c0580lM532l = m532l(this, 12);
        float f = c0580lM532l.license((byte) 4) ? c0580lM532l.mopub : 0.0f;
        float f2 = c0580lM532l.license((byte) 13) ? c0580lM532l.startapp : 0.0f;
        if (!Float.isNaN(f2)) {
            f += f2;
        }
        final float f3 = f;
        float f4 = c0580lM532l.license((byte) 5) ? c0580lM532l.admob : 0.0f;
        float f5 = c0580lM532l.license((byte) 15) ? c0580lM532l.ads : 0.0f;
        if (!Float.isNaN(f5)) {
            f4 += f5;
        }
        float f6 = c0580lM532l.license((byte) 6) ? c0580lM532l.subs : 0.0f;
        float f7 = c0580lM532l.license((byte) 14) ? c0580lM532l.adcel : 0.0f;
        if (!Float.isNaN(f7)) {
            f6 += f7;
        }
        float f8 = c0580lM532l.license((byte) 7) ? c0580lM532l.isPro : 0.0f;
        float f9 = c0580lM532l.license((byte) 16) ? c0580lM532l.subscription : 0.0f;
        if (!Float.isNaN(f9)) {
            f8 += f9;
        }
        int iRound5 = Math.round(f3 + f4);
        int iRound6 = Math.round(f6 + f8);
        int iIsPro = C15519l.isPro(j) - iRound5;
        if (iIsPro < 0) {
            iIsPro = 0;
        }
        int iAdmob = C15519l.admob(j);
        if (iAdmob != Integer.MAX_VALUE && (iAdmob = iAdmob + iRound5) < 0) {
            iAdmob = 0;
        }
        int iSubs = C15519l.subs(j) - iRound6;
        int i = iSubs < 0 ? 0 : iSubs;
        int iMopub = C15519l.mopub(j);
        if (iMopub != Integer.MAX_VALUE && (iMopub = iMopub + iRound6) < 0) {
            iMopub = 0;
        }
        if (c0580lM532l.license((byte) 19)) {
            iRound = Math.round(c0580lM532l.pro);
            if (iRound < 0) {
                iRound = 0;
            }
        } else {
            iRound = Integer.MAX_VALUE;
        }
        if (c0580lM532l.license((byte) 17)) {
            iRound2 = Math.round(c0580lM532l.license);
            if (iRound2 < 0) {
                iRound2 = 0;
            }
            if (iRound2 > iRound) {
                iRound2 = iRound;
            }
        } else {
            iRound2 = 0;
        }
        if (c0580lM532l.license((byte) 9)) {
            int iRound7 = Math.round(c0580lM532l.smaato);
            if (iRound7 >= iRound2) {
                iRound2 = iRound7;
            }
            if (iRound2 <= iRound) {
                iRound = iRound2;
            }
            iRound2 = iRound;
        }
        if (iRound2 != 0) {
            if (iRound2 >= iIsPro) {
                iIsPro = iRound2;
            }
            if (iIsPro > iAdmob) {
                iIsPro = iAdmob;
            }
        }
        if (iRound != Integer.MAX_VALUE) {
            if (iRound < iIsPro) {
                iRound = iIsPro;
            }
            if (iRound <= iAdmob) {
                iAdmob = iRound;
            }
        }
        if (!c0580lM532l.license((byte) 9)) {
            if (c0580lM532l.license((byte) 11) && C15519l.amazon(j)) {
                int iRound8 = Math.round(iAdmob * c0580lM532l.vip);
                if (iRound8 >= iIsPro) {
                    iIsPro = iRound8;
                }
                if (iIsPro > iAdmob) {
                    iIsPro = iAdmob;
                }
                iAdmob = iIsPro;
            } else if (c0580lM532l.license((byte) 13) && c0580lM532l.license((byte) 15)) {
                iIsPro = iAdmob;
            }
        }
        if (c0580lM532l.license((byte) 20)) {
            iRound3 = Math.round(c0580lM532l.Signature);
            if (iRound3 < 0) {
                iRound3 = 0;
            }
        } else {
            iRound3 = Integer.MAX_VALUE;
        }
        if (c0580lM532l.license((byte) 18)) {
            iRound4 = Math.round(c0580lM532l.tapsense);
            if (iRound4 < 0) {
                iRound4 = 0;
            }
            if (iRound4 > iRound3) {
                iRound4 = iRound3;
            }
        } else {
            iRound4 = 0;
        }
        if (c0580lM532l.license((byte) 10)) {
            int iRound9 = Math.round(c0580lM532l.remoteconfig);
            if (iRound9 >= iRound4) {
                iRound4 = iRound9;
            }
            if (iRound4 <= iRound3) {
                iRound3 = iRound4;
            }
            iRound4 = iRound3;
        }
        if (iRound4 != 0) {
            if (iRound4 >= i) {
                i = iRound4;
            }
            if (i > iMopub) {
                i = iMopub;
            }
        }
        if (iRound3 != Integer.MAX_VALUE) {
            if (iRound3 < i) {
                iRound3 = i;
            }
            if (iRound3 <= iMopub) {
                iMopub = iRound3;
            }
        }
        if (!c0580lM532l.license((byte) 10)) {
            if (c0580lM532l.license((byte) 12) && C15519l.crashlytics(j)) {
                int iRound10 = Math.round(iMopub * c0580lM532l.metrica);
                if (iRound10 >= i) {
                    i = iRound10;
                }
                if (i > iMopub) {
                    i = iMopub;
                }
                iMopub = i;
            } else if (c0580lM532l.license((byte) 14) && c0580lM532l.license((byte) 16)) {
                i = iMopub;
            }
        }
        final AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.yandex(iIsPro, iAdmob, i, iMopub));
        final float f10 = f4;
        final float f11 = f6;
        final float f12 = f8;
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l + iRound5, abstractC10113lAdcel.f20591l + iRound6, C14054l.f27396l, new Function1() { // from class: lؚّٖ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                C0432l c0432l = this.f24566l;
                C0580l c0580lM532l2 = C0432l.m532l(c0432l, 12);
                boolean zLicense = c0580lM532l2.license((byte) 13);
                long j2 = j;
                AbstractC10113l abstractC10113l = abstractC10113lAdcel;
                int iRound11 = (zLicense || !c0580lM532l2.license((byte) 15)) ? Math.round(f3) : (C15519l.admob(j2) - abstractC10113l.f20592l) - Math.round(f10);
                int iRound12 = (!c0580lM532l2.license((byte) 16) || c0580lM532l2.license((byte) 14)) ? Math.round(f11) : (C15519l.mopub(j2) - abstractC10113l.f20591l) - Math.round(f12);
                int iAds = c0580lM532l2.ads();
                int i2 = 4;
                if ((iAds & 4) != 0) {
                    C0783l c0783l = c0432l.f1567l;
                    if (c0783l == null) {
                        c0783l = new C0783l(i2, c0432l);
                        c0432l.f1567l = c0783l;
                    }
                    AbstractC9601l.startapp(abstractC9601l, abstractC10113l, iRound11, iRound12, c0783l, 4);
                } else {
                    abstractC9601l.mopub(abstractC10113l, iRound11, iRound12, 0.0f);
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void m534l(C6742l c6742l, int i, InterfaceC6347l interfaceC6347l, AbstractC18072l abstractC18072l) {
        AbstractC18072l[] abstractC18072lArr = this.f1581l;
        AbstractC18072l abstractC18072l2 = abstractC18072lArr != null ? (AbstractC18072l) AbstractC8669l.m2418throw(i, abstractC18072lArr) : null;
        C16905l[] c16905lArr = this.f1566l;
        C16905l c16905l = c16905lArr != null ? (C16905l) AbstractC8669l.m2418throw(i, c16905lArr) : null;
        if (!AbstractC8576l.yandex(abstractC18072l2, abstractC18072l) || c16905l == null) {
            C10023l c10023lLoadAd = AbstractC5573l.remoteconfig(this).loadAd();
            c10023lLoadAd.getClass();
            c16905l = new C16905l(interfaceC6347l, abstractC18072l, c10023lLoadAd);
        }
        C16905l c16905l2 = c16905l;
        AbstractC18072l[] abstractC18072lArr2 = this.f1581l;
        if (abstractC18072lArr2 != null) {
            abstractC18072lArr2[i] = abstractC18072l;
        }
        C16905l[] c16905lArr2 = this.f1566l;
        if (c16905lArr2 != null) {
            c16905lArr2[i] = c16905l2;
        }
        AbstractC14165l.admob(c16905l2, c6742l, c6742l.f14144l.f26629l.m4551private(), null, 6);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public final void mo535l() {
        C11925l c11925l = this.f1568l;
        if (c11925l != null) {
            AbstractC5573l.remoteconfig(this).yandex(c11925l);
            this.f1568l = null;
        }
        this.f1585l = null;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final void mo536l(C6742l c6742l) {
        Object obj;
        float f;
        boolean z;
        AbstractC9544l abstractC9544l;
        C17158l[] c17158lArr;
        AbstractC15342l abstractC15342l;
        Object obj2;
        C16905l[] c16905lArr;
        C11644l c11644l;
        Function1 ctransient;
        Function1 c2623l;
        C0580l c0580lM532l = m532l(this, 2);
        long j = C9735l.firebase;
        long j2 = c0580lM532l.license((byte) 34) ? c0580lM532l.isVip : j;
        AbstractC9544l abstractC9544l2 = c0580lM532l.pro(51) ? c0580lM532l.signatures : null;
        if (c0580lM532l.license((byte) 36)) {
            j = c0580lM532l.premium;
        }
        long j3 = j;
        AbstractC9544l abstractC9544l3 = c0580lM532l.pro(52) ? c0580lM532l.applovin : null;
        long j4 = C9735l.loadAd;
        if (c0580lM532l.license((byte) 35)) {
            j4 = c0580lM532l.ad;
        }
        long j5 = j4;
        AbstractC9544l abstractC9544l4 = c0580lM532l.pro(50) ? c0580lM532l.advert : null;
        float f2 = c0580lM532l.license((byte) 8) ? c0580lM532l.firebase : 0.0f;
        float f3 = f2 / 2.0f;
        InterfaceC6347l interfaceC6347l = c0580lM532l.inmobi;
        boolean z2 = f3 > 0.0f;
        boolean z3 = (j2 == 16 && abstractC9544l2 == null) ? false : true;
        boolean z4 = (j3 == 16 && abstractC9544l3 == null) ? false : true;
        boolean zPro = c0580lM532l.pro(55);
        C9946l c9946l = AbstractC16837l.yandex;
        long j6 = j2;
        if (zPro && (obj = c0580lM532l.f2019throws) != null) {
            InterfaceC6347l interfaceC6347l2 = c0580lM532l.pro(53) ? c0580lM532l.inmobi : c9946l;
            AbstractC18072l[] abstractC18072lArr = this.f1582l;
            f = f2;
            C17158l[] c17158lArr2 = this.f1571l;
            z = z3;
            boolean z5 = obj instanceof Object[];
            int length = z5 ? ((Object[]) obj).length : 1;
            abstractC9544l = abstractC9544l2;
            if (abstractC18072lArr == null || !AbstractC8576l.yandex(this.f1583l, interfaceC6347l2)) {
                AbstractC18072l[] abstractC18072lArr2 = new AbstractC18072l[length];
                for (int i = 0; i < length; i++) {
                    abstractC18072lArr2[i] = null;
                }
                this.f1582l = abstractC18072lArr2;
                C17158l[] c17158lArr3 = new C17158l[length];
                for (int i2 = 0; i2 < length; i2++) {
                    c17158lArr3[i2] = null;
                }
                this.f1571l = c17158lArr3;
            } else if (abstractC18072lArr.length != length) {
                this.f1582l = (AbstractC18072l[]) Arrays.copyOf(abstractC18072lArr, length);
                if (c17158lArr2 != null) {
                    c17158lArr = (C17158l[]) Arrays.copyOf(c17158lArr2, length);
                } else {
                    c17158lArr = new C17158l[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        c17158lArr[i3] = null;
                    }
                }
                this.f1571l = c17158lArr;
            }
            if (z5) {
                Object[] objArr = (Object[]) obj;
                int length2 = objArr.length;
                for (int i4 = 0; i4 < length2; i4++) {
                    Object obj3 = objArr[i4];
                    if (obj3 instanceof AbstractC18072l) {
                        m538l(c6742l, i4, interfaceC6347l2, (AbstractC18072l) obj3);
                    }
                }
            } else if (obj instanceof AbstractC18072l) {
                m538l(c6742l, 0, interfaceC6347l2, (AbstractC18072l) obj);
            }
        } else {
            f = f2;
            z = z3;
            abstractC9544l = abstractC9544l2;
        }
        C13601l c13601l = c6742l.f14144l;
        long jM4551private = c13601l.f26629l.m4551private();
        AbstractC15342l abstractC15342lYandex = (C14174l.loadAd(this.f1576l, jM4551private) && this.f1579l == c6742l.getLayoutDirection() && AbstractC8576l.yandex(this.f1583l, interfaceC6347l)) ? this.f1575l : interfaceC6347l.yandex(jM4551private, c6742l.getLayoutDirection(), c6742l);
        this.f1575l = abstractC15342lYandex;
        this.f1576l = jM4551private;
        this.f1579l = c6742l.getLayoutDirection();
        if (!z) {
            abstractC15342l = abstractC15342lYandex;
        } else if (abstractC9544l != null) {
            abstractC15342l = abstractC15342lYandex;
            AbstractC10851l.amazon(c6742l, abstractC15342l, abstractC9544l, 0.0f, null, 60);
        } else {
            abstractC15342l = abstractC15342lYandex;
            AbstractC10851l.purchase(c6742l, abstractC15342l, j6);
        }
        c6742l.yandex();
        if (z4) {
            if (abstractC9544l3 != 0) {
                AbstractC10851l.amazon(c6742l, abstractC15342l, abstractC9544l3, 0.0f, null, 60);
            } else {
                AbstractC10851l.purchase(c6742l, abstractC15342l, j3);
            }
        }
        if (z2) {
            AbstractC9544l c8990l = abstractC9544l4 == 0 ? new C8990l(j5) : abstractC9544l4;
            C11063l c11063l = new C11063l(1, f);
            C5767l c5767l = this.f1585l;
            if (c5767l == null) {
                c5767l = new C5767l(15, this);
                this.f1585l = c5767l;
                Unit unit = Unit.INSTANCE;
            }
            final C5767l c5767l2 = c5767l;
            final C11644l c11644l2 = this.f1572l;
            c11644l2.f23357l = c11063l;
            if (c8990l.equals((AbstractC9544l) c11644l2.f23361l) && AbstractC8576l.yandex(abstractC15342l, (AbstractC15342l) c11644l2.f23360l) && ((Function1) c11644l2.f23362l) != null) {
                c11644l = c11644l2;
            } else {
                c11644l2.f23361l = c8990l;
                c11644l2.f23360l = abstractC15342l;
                if (abstractC15342l instanceof C13616l) {
                    final C13616l c13616l = (C13616l) abstractC15342l;
                    C9902l c9902l = c13616l.amazon;
                    final C8896l c8896lAmazon = c9902l.amazon();
                    float f4 = c8896lAmazon.loadAd;
                    float f5 = c8896lAmazon.amazon;
                    float f6 = c8896lAmazon.yandex;
                    float f7 = c8896lAmazon.crashlytics;
                    final float fMin = Math.min(Math.abs(f7 - f6), Math.abs(f5 - f4));
                    C9902l c9902lYandex = (C9902l) c11644l2.f23358l;
                    if (c9902lYandex == null) {
                        c9902lYandex = AbstractC3478l.yandex();
                        c11644l2.f23358l = c9902lYandex;
                    }
                    c9902lYandex.admob();
                    AbstractC15560l.isPro(c9902lYandex, c8896lAmazon);
                    c9902lYandex.mopub(c9902lYandex, c9902l, 0);
                    final long jCeil = (((long) ((int) Math.ceil(f7 - f6))) << 32) | (((long) ((int) Math.ceil(f5 - f4))) & 4294967295L);
                    final AbstractC9544l abstractC9544l5 = c8990l;
                    final C9902l c9902l2 = c9902lYandex;
                    ctransient = new Function1() { // from class: lٌَ۟
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            long j7 = jCeil;
                            C9902l c9902l3 = c9902l2;
                            InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                            float fFloatValue = Float.valueOf(((C11063l) c11644l2.f23357l).f22270l).floatValue();
                            float f8 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                            float f9 = 2.0f * f8;
                            float f10 = fMin;
                            C13616l c13616l2 = c13616l;
                            AbstractC9544l abstractC9544l6 = abstractC9544l5;
                            if (f9 > f10) {
                                AbstractC9361l.smaato(interfaceC13349l, c13616l2.amazon, abstractC9544l6, 0.0f, null, null, 60);
                            } else {
                                C11925l c11925l = (C11925l) c5767l2.invoke();
                                c11925l.admob(1);
                                C8896l c8896l = c8896lAmazon;
                                float f11 = c8896l.yandex;
                                float f12 = c8896l.loadAd;
                                ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(f11, f12);
                                try {
                                    interfaceC13349l.subscription(j7, c11925l, new C13205l(c8896l, c13616l2, abstractC9544l6, f8, c9902l3));
                                    AbstractC2576l.loadAd(interfaceC13349l, c11925l);
                                } finally {
                                    ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f11, -f12);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c11644l = c11644l2;
                } else {
                    AbstractC9544l abstractC9544l6 = c8990l;
                    c11644l = c11644l2;
                    if (abstractC15342l instanceof C18521l) {
                        C3903l c3903l = ((C18521l) abstractC15342l).amazon;
                        if (AbstractC8238l.purchase(c3903l)) {
                            c2623l = new Ctransient(c11644l, c3903l, abstractC9544l6, 8);
                        } else {
                            C9902l c9902lYandex2 = (C9902l) c11644l.f23358l;
                            if (c9902lYandex2 == null) {
                                c9902lYandex2 = AbstractC3478l.yandex();
                                c11644l.f23358l = c9902lYandex2;
                            }
                            C9902l c9902l3 = c9902lYandex2;
                            C13250l c13250l = new C13250l();
                            c13250l.f26029l = Float.NaN;
                            c2623l = new C2623l(c11644l, c3903l, c13250l, new C10700l(), c9902l3, abstractC9544l6, 1);
                        }
                        ctransient = c2623l;
                    } else {
                        if (!(abstractC15342l instanceof C13080l)) {
                            C18725l.billing();
                            return;
                        }
                        ctransient = new Ctransient(c11644l, ((C13080l) abstractC15342l).amazon, abstractC9544l6, 9);
                    }
                }
                c11644l.f23362l = ctransient;
            }
            if (C1187l.loadAd(0L, 0L)) {
                ((Function1) c11644l.f23362l).invoke(c6742l);
            } else {
                float fIntBitsToFloat = Float.intBitsToFloat(0);
                float fIntBitsToFloat2 = Float.intBitsToFloat(0);
                ((C16543l) c13601l.f26629l.f36010l).inmobi(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    ((Function1) c11644l.f23362l).invoke(c6742l);
                    ((C16543l) c13601l.f26629l.f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                } catch (Throwable th) {
                    ((C16543l) c13601l.f26629l.f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                    throw th;
                }
            }
        }
        if (c0580lM532l.pro(56) && (obj2 = c0580lM532l.f2011package) != null) {
            InterfaceC6347l interfaceC6347l3 = c0580lM532l.pro(53) ? c0580lM532l.inmobi : c9946l;
            AbstractC18072l[] abstractC18072lArr3 = this.f1581l;
            C16905l[] c16905lArr2 = this.f1566l;
            boolean z6 = obj2 instanceof Object[];
            int length3 = z6 ? ((Object[]) obj2).length : 1;
            if (abstractC18072lArr3 == null || !AbstractC8576l.yandex(this.f1583l, interfaceC6347l3)) {
                AbstractC18072l[] abstractC18072lArr4 = new AbstractC18072l[length3];
                for (int i5 = 0; i5 < length3; i5++) {
                    abstractC18072lArr4[i5] = null;
                }
                this.f1581l = abstractC18072lArr4;
                C16905l[] c16905lArr3 = new C16905l[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    c16905lArr3[i6] = null;
                }
                this.f1566l = c16905lArr3;
            } else if (abstractC18072lArr3.length != length3) {
                this.f1581l = (AbstractC18072l[]) Arrays.copyOf(abstractC18072lArr3, length3);
                if (c16905lArr2 != null) {
                    c16905lArr = (C16905l[]) Arrays.copyOf(c16905lArr2, length3);
                } else {
                    c16905lArr = new C16905l[length3];
                    for (int i7 = 0; i7 < length3; i7++) {
                        c16905lArr[i7] = null;
                    }
                }
                this.f1566l = c16905lArr;
            }
            if (z6) {
                Object[] objArr2 = (Object[]) obj2;
                int length4 = objArr2.length;
                for (int i8 = 0; i8 < length4; i8++) {
                    Object obj4 = objArr2[i8];
                    if (obj4 instanceof AbstractC18072l) {
                        m534l(c6742l, i8, interfaceC6347l3, (AbstractC18072l) obj4);
                    }
                }
            } else if (obj2 instanceof AbstractC18072l) {
                m534l(c6742l, 0, interfaceC6347l3, (AbstractC18072l) obj2);
            }
        }
        this.f1583l = interfaceC6347l;
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void m537l(boolean z) {
        C0580l c0580l;
        int iAds;
        C0580l c0580l2;
        if (this.f29462l) {
            InterfaceC14029l interfaceC14029l = null;
            final C0580l c0580l3 = z ? null : this.f1570l;
            if (z) {
                c0580l = this.f1570l;
            } else {
                if (this.f1569l == null) {
                    this.f1569l = new C0580l();
                }
                c0580l = this.f1569l;
            }
            final C0580l c0580l4 = c0580l;
            final InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
            final C9987l c9987l = new C9987l();
            C6943l c6943l = this.f1573l;
            C2494l c2494l = c6943l.f14569l;
            C0580l c0580l5 = c6943l.f14557l;
            if (c2494l == null || c0580l5 == null) {
                c6943l.f14563l = null;
            } else {
                long jM1202l = c2494l.m1202l();
                if (jM1202l != 0) {
                    long j = jM1202l & 2251799813685247L;
                    int i = (int) (jM1202l >> 50);
                    C0580l c0580l6 = new C0580l();
                    C2494l c2494l2 = c6943l.f14569l;
                    if (c2494l2 != null && ((c0580l2 = c6943l.f14567l) != null || (c0580l2 = c6943l.f14564l) != null)) {
                        C0580l c0580l7 = c0580l2;
                        C0580l c0580l8 = c6943l.f14557l;
                        if (c0580l8 != null) {
                            AbstractC6512l.yandex(c0580l7, c0580l8, c2494l2, j, i, c0580l6);
                        }
                    }
                    c6943l.f14563l = c0580l6;
                } else {
                    c6943l.f14563l = null;
                }
            }
            AbstractC3700l.admob(this, new Function0() { // from class: lٕۘؒ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    InterfaceC13490l interfaceC13490l2 = interfaceC13490l;
                    C0432l c0432l = this.f31155l;
                    C6943l c6943l2 = c0432l.f1573l;
                    InterfaceC5428l interfaceC5428l = c0432l.f1584l;
                    c6943l2.getClass();
                    Trace.beginSection("Compose:Styles:build");
                    try {
                        c6943l2.f14560l = c0432l;
                        c6943l2.f14561l = interfaceC13490l2.loadAd();
                        C0580l c0580l9 = c6943l2.f14557l;
                        C0580l c0580l10 = c6943l2.f14564l;
                        if (c0580l10 != null) {
                            AbstractC6512l.vip.billing(c0580l10);
                        } else {
                            c0580l10 = new C0580l();
                        }
                        c6943l2.f14557l = c0580l10;
                        c6943l2.f14564l = c0580l9;
                        c6943l2.f14566l = null;
                        interfaceC5428l.yandex(c6943l2);
                        c6943l2.crashlytics();
                        Unit unit = Unit.INSTANCE;
                        Trace.endSection();
                        C0580l c0580l11 = c0580l4;
                        c6943l2.mopub(0, c0580l11);
                        c0432l.f1570l = c0580l11;
                        c0432l.f1569l = c0580l3;
                        c9987l.f20387l = c6943l2.amazon();
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            });
            int i2 = c9987l.f20387l;
            if (c0580l3 != null) {
                long j2 = AbstractC6512l.loadAd | AbstractC6512l.crashlytics | AbstractC6512l.amazon;
                long j3 = AbstractC6512l.purchase;
                long j4 = j2 | j3 | AbstractC6512l.billing | AbstractC6512l.mopub;
                int i3 = AbstractC6512l.admob | AbstractC6512l.subs | AbstractC6512l.isPro;
                int i4 = AbstractC6512l.firebase;
                int i5 = i3 | i4 | AbstractC6512l.smaato | AbstractC6512l.remoteconfig;
                long jSubs = c0580l3.subs(c0580l4, j4);
                int iAdmob = c0580l3.admob(i5, c0580l4);
                iAds = AbstractC6512l.mopub(jSubs) | AbstractC6512l.purchase(iAdmob);
                if ((iAdmob & 8) != 0 && ((c0580l3.yandex & j3) != 0 || (c0580l3.loadAd & i4) != 0 || (j3 & c0580l4.yandex) != 0 || (c0580l4.loadAd & i4) != 0)) {
                    iAds |= 4;
                }
            } else {
                iAds = c0580l4.ads();
            }
            int i6 = i2 | iAds;
            if (!AbstractC8576l.yandex(this.f1577l.yandex, this.f1580l)) {
                C7504l c7504l = this.f1578l;
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                C2403l c2403l = this.f1577l.yandex;
                this.f1580l = c2403l;
                if (c2403l != null) {
                    this.f1578l = AbstractC10999l.mopub(m3914l(), null, 0, new C15352l(this, c2403l, interfaceC14029l, 14), 3);
                }
            }
            if (z) {
                return;
            }
            if ((i6 & 1) != 0) {
                C14526l c14526l = this.f1574l;
                if (c14526l == null) {
                    C8339l.smaato("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                AbstractC4047l.isPro(c14526l);
            }
            if ((i6 & 8) != 0) {
                AbstractC4047l.isPro(this);
            }
            if ((i6 & 2) != 0) {
                AbstractC2697l.firebase(this);
                C14526l c14526l2 = this.f1574l;
                if (c14526l2 == null) {
                    C8339l.smaato("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                AbstractC4047l.subs(c14526l2);
            }
            if ((i6 & 4) != 0) {
                C0783l c0783l = this.f1567l;
                if (c0783l == null) {
                    c0783l = new C0783l(4, this);
                    this.f1567l = c0783l;
                }
                AbstractC4047l.remoteconfig(this, c0783l);
            }
            if ((i6 & 16) != 0 && this.f29454l.f29462l) {
                AbstractC5573l.metrica(this).m1388package();
            }
            if ((i6 & 32) == 0 || !this.f29454l.f29462l) {
                return;
            }
            AbstractC5573l.metrica(this).appmetrica(true);
        }
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void m538l(C6742l c6742l, int i, InterfaceC6347l interfaceC6347l, AbstractC18072l abstractC18072l) {
        AbstractC18072l[] abstractC18072lArr = this.f1582l;
        AbstractC18072l abstractC18072l2 = abstractC18072lArr != null ? (AbstractC18072l) AbstractC8669l.m2418throw(i, abstractC18072lArr) : null;
        C17158l[] c17158lArr = this.f1571l;
        C17158l c17158l = c17158lArr != null ? (C17158l) AbstractC8669l.m2418throw(i, c17158lArr) : null;
        if (!AbstractC8576l.yandex(abstractC18072l2, abstractC18072l) || c17158l == null) {
            C10023l c10023lLoadAd = AbstractC5573l.remoteconfig(this).loadAd();
            c10023lLoadAd.getClass();
            c17158l = new C17158l(interfaceC6347l, abstractC18072l, c10023lLoadAd);
        }
        C17158l c17158l2 = c17158l;
        AbstractC18072l[] abstractC18072lArr2 = this.f1582l;
        if (abstractC18072lArr2 != null) {
            abstractC18072lArr2[i] = abstractC18072l;
        }
        C17158l[] c17158lArr2 = this.f1571l;
        if (c17158lArr2 != null) {
            c17158lArr2[i] = c17158l2;
        }
        AbstractC14165l.admob(c17158l2, c6742l, c6742l.f14144l.f26629l.m4551private(), null, 6);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC4191l
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final Object mo539this(AbstractC5189l abstractC5189l) {
        return AbstractC13402l.loadAd(this, abstractC5189l);
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void mo540while() {
        m537l(false);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final /* synthetic */ void mo533continue() {
    }
}
