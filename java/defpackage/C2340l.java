package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2340l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f5091l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public float f5092l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public AbstractC12914l f5093l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        long j2;
        long jYandex;
        final AbstractC12914l abstractC12914l = this.f5093l;
        final float f = this.f5091l;
        float f2 = this.f5092l;
        boolean z = abstractC12914l instanceof C17857l;
        if (z) {
            j2 = j;
            jYandex = C15519l.yandex(0, 0, 0, 0, 11, j2);
        } else {
            j2 = j;
            jYandex = C15519l.yandex(0, 0, 0, 0, 14, j2);
        }
        final AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(jYandex);
        int iMo884throw = abstractC10113lAdcel.mo884throw(abstractC12914l);
        if (iMo884throw == Integer.MIN_VALUE) {
            iMo884throw = 0;
        }
        int i = z ? abstractC10113lAdcel.f20591l : abstractC10113lAdcel.f20592l;
        int iMopub = (z ? C15519l.mopub(j2) : C15519l.admob(j2)) - i;
        final int iPurchase = AbstractC8576l.purchase((!Float.isNaN(f) ? interfaceC7448l.mo870l(f) : 0) - iMo884throw, 0, iMopub);
        final int iPurchase2 = AbstractC8576l.purchase(((!Float.isNaN(f2) ? interfaceC7448l.mo870l(f2) : 0) - i) + iMo884throw, 0, iMopub - iPurchase);
        int iMax = abstractC10113lAdcel.f20592l;
        if (!z) {
            iMax = Math.max(iMax + iPurchase + iPurchase2, C15519l.isPro(j2));
        }
        int iMax2 = abstractC10113lAdcel.f20591l;
        if (z) {
            iMax2 = Math.max(iMax2 + iPurchase + iPurchase2, C15519l.subs(j2));
        }
        final int i2 = iMax2;
        final int i3 = iMax;
        return interfaceC7448l.isVip(i3, i2, C14054l.f27396l, new Function1() { // from class: lٕؗؗ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                boolean z2 = abstractC12914l instanceof C17857l;
                float f3 = f;
                int i5 = iPurchase;
                int i6 = iPurchase2;
                AbstractC10113l abstractC10113l = abstractC10113lAdcel;
                if (z2) {
                    i4 = 0;
                } else {
                    i4 = !C14467l.loadAd(f3, Float.NaN) ? i5 : (i3 - i6) - abstractC10113l.f20592l;
                }
                if (!z2) {
                    i5 = 0;
                } else if (C14467l.loadAd(f3, Float.NaN)) {
                    i5 = (i2 - i6) - abstractC10113l.f20591l;
                }
                AbstractC9601l.smaato(abstractC9601l, abstractC10113l, i4, i5);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
