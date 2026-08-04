package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؘّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5636l extends AbstractC11801l {
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m1837abstract(final int i, final C15578l c15578l, final boolean z, final Function1 function1, final InterfaceC17242l interfaceC17242l, final Integer num, boolean z2, final boolean z3, C6956l c6956l, final int i2) {
        final boolean z4;
        C15578l c15578l2;
        c6956l.m2133new(1144778127);
        int i3 = i2 | (c6956l.amazon(i) ? 4 : 2) | (c6956l.mopub(z) ? 256 : 128) | (c6956l.admob(function1) ? 2048 : 1024) | (c6956l.billing(interfaceC17242l) ? 16384 : 8192) | (c6956l.billing(num) ? 131072 : 65536) | 1572864 | (c6956l.mopub(z3) ? 8388608 : 4194304) | (c6956l.admob(this) ? 67108864 : 33554432);
        byte b = 0;
        if (c6956l.m2127for(i3 & 1, (38347923 & i3) != 38347922)) {
            if (num == null) {
                c6956l.m2123default(2045353790);
                c6956l.startapp(false);
                c15578l2 = null;
            } else {
                c6956l.m2123default(2045353791);
                C15578l c15578lAmazon = AbstractC14566l.amazon(1890167459, new C4314l(num.intValue(), 12, b), c6956l);
                c6956l.startapp(false);
                c15578l2 = c15578lAmazon;
            }
            boolean zAdmob = ((i3 & 896) == 256) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048) | c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new Function0() { // from class: lًُؚ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z3) {
                            function1.invoke(Boolean.valueOf(!z));
                        } else {
                            new C14107l().Signature(this.isVip());
                        }
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(578765293, new C4314l(i, 13, b), c6956l), AbstractC15788l.yandex(AbstractC9151l.loadAd(interfaceC17242l, true, null, (Function0) objM2132native, 14), 1.0f), null, c15578l2, c15578l, AbstractC14566l.amazon(1460406578, new C14793l(z3, z, function1), c6956l), null, c6956l, 221190, 452);
            z4 = true;
        } else {
            c6956l.m2124else();
            z4 = z2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(i, c15578l, z, function1, interfaceC17242l, num, z4, z3, i2) { // from class: lٌۛٙ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f18623l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ Integer f18624l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f18625l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ int f18626l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f18628l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ boolean f18629l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ boolean f18630l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f18631l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(49);
                    this.f18627l.m1837abstract(this.f18626l, this.f18623l, this.f18629l, this.f18628l, this.f18631l, this.f18624l, this.f18625l, this.f18630l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m1838import(final int i, final boolean z, final Function1 function1, final C15578l c15578l, final InterfaceC17242l interfaceC17242l, final Integer num, boolean z2, C6956l c6956l, final int i2) {
        final boolean z3;
        C15578l c15578l2;
        c6956l.m2133new(1133569133);
        int i3 = i2 | (c6956l.amazon(i) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | (c6956l.admob(function1) ? 256 : 128) | (c6956l.billing(interfaceC17242l) ? 16384 : 8192) | (c6956l.billing(num) ? 131072 : 65536) | 1572864;
        byte b = 0;
        if (c6956l.m2127for(i3 & 1, (599187 & i3) != 599186)) {
            if (num == null) {
                c6956l.m2123default(-1169348320);
                c6956l.startapp(false);
                c15578l2 = null;
            } else {
                c6956l.m2123default(-1169348319);
                C15578l c15578lAmazon = AbstractC14566l.amazon(2038603649, new C4314l(num.intValue(), 10, b), c6956l);
                c6956l.startapp(false);
                c15578l2 = c15578lAmazon;
            }
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objM2132native = c6956l.m2132native();
            if (z4 || objM2132native == C1867l.yandex) {
                objM2132native = new C1926l(4, function1, z);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-472295989, new C4314l(i, 11, b), c6956l), AbstractC15788l.yandex(AbstractC9151l.loadAd(interfaceC17242l, true, null, (Function0) objM2132native, 14), 1.0f), null, c15578l2, c15578l, AbstractC14566l.amazon(-133489520, new C4571l(2, function1, z), c6956l), null, c6956l, 221190, 452);
            z3 = true;
        } else {
            c6956l.m2124else();
            z3 = z2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(i, z, function1, c15578l, interfaceC17242l, num, z3, i2) { // from class: lّٕۜ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25317l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ Integer f25318l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f25319l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ int f25320l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f25322l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f25323l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f25324l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(3073);
                    this.f25321l.m1838import(this.f25320l, this.f25317l, this.f25323l, this.f25322l, this.f25324l, this.f25318l, this.f25319l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C5636l c5636l;
        C5866l c5866l;
        C5056l c5056l;
        c6956l.m2133new(1689918378);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3603l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3603l;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C7814l) ((AbstractC11904l) C3078l.f6613l.f33214l), c6956l, 0);
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon((C7549l) AbstractC16584l.yandex().billing.admob, c6956l, 0);
            Object objM2132native = c6956l.m2132native();
            Object obj2 = C1867l.yandex;
            if (objM2132native == obj2) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            View view = (View) c6956l.isPro(AbstractC1242l.billing);
            C5866l c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
            boolean zAdmob = c6956l.admob(view);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == obj2) {
                objM2132native2 = new C12337l(view, null, 0);
                c6956l.m2147try(objM2132native2);
            }
            C5056l c5056lMetrica = AbstractC12953l.metrica(c5866lYandex, (Function4) objM2132native2, c6956l);
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2 || objM2132native3 == obj2) {
                c5866l = c5866lYandex;
                c5056l = c5056lMetrica;
                Object c5735l = new C5735l(0, this, C5636l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 6);
                c6956l.m2147try(c5735l);
                objM2132native3 = c5735l;
            } else {
                c5866l = c5866lYandex;
                c5056l = c5056lMetrica;
            }
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native3);
            boolean zBilling = c6956l.billing(interfaceC8714lLoadAd) | c6956l.billing(c5056l) | c6956l.admob(view) | c6956l.admob(this) | c6956l.admob(interfaceC2262l) | c6956l.billing(interfaceC8714lAmazon);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling || objM2132native4 == obj2) {
                Object c2623l = new C2623l(interfaceC8714lLoadAd, c5056l, this, interfaceC2262l, view, interfaceC8714lAmazon);
                c5636l = this;
                c6956l.m2147try(c2623l);
                objM2132native4 = c2623l;
            } else {
                c5636l = this;
            }
            AbstractC7837l.yandex(AbstractC7236l.yandex, function0, c5866l, (Function1) objM2132native4, c6956l, 6, 0);
        } else {
            c5636l = this;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4951l(c5636l, i, 5);
        }
    }
}
