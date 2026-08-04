package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14899l implements InterfaceC2948l {
    public final /* synthetic */ C17253l amazon;
    public final /* synthetic */ InterfaceC2262l billing;
    public final /* synthetic */ Function0 crashlytics;
    public final /* synthetic */ C6330l loadAd;
    public final /* synthetic */ InterfaceC3685l mopub;
    public final /* synthetic */ float purchase;
    public final /* synthetic */ C7583l yandex;

    public C14899l(C7583l c7583l, C6330l c6330l, InterfaceC2901l interfaceC2901l, C17253l c17253l, float f, InterfaceC2262l interfaceC2262l, InterfaceC3685l interfaceC3685l) {
        this.yandex = c7583l;
        this.loadAd = c6330l;
        this.crashlytics = interfaceC2901l;
        this.amazon = c17253l;
        this.purchase = f;
        this.billing = interfaceC2262l;
        this.mopub = interfaceC3685l;
    }

    @Override // defpackage.InterfaceC2948l
    public final InterfaceC17792l yandex(C17385l c17385l, long j) {
        C12507l c12507l;
        int i;
        int iAmazon;
        InterfaceC15847l interfaceC15847l = c17385l.f33850l;
        C17253l c17253l = this.amazon;
        float f = c17253l.amazon;
        float f2 = c17253l.loadAd;
        C7583l c7583l = this.yandex;
        c7583l.license.getValue();
        boolean z = c7583l.yandex || interfaceC15847l.mo992import();
        AbstractC15684l.loadAd(j, EnumC7283l.f15126l);
        C6330l c6330l = this.loadAd;
        if (c6330l.amazon != null && C15519l.loadAd(c6330l.loadAd, j) && c6330l.crashlytics == interfaceC15847l.loadAd()) {
            c12507l = c6330l.amazon;
        } else {
            c6330l.loadAd = j;
            c6330l.crashlytics = interfaceC15847l.loadAd();
            C12507l c12507l2 = (C12507l) c6330l.yandex.invoke(c17385l, new C15519l(j));
            c6330l.amazon = c12507l2;
            c12507l = c12507l2;
        }
        C11862l c11862l = (C11862l) this.crashlytics.invoke();
        interfaceC15847l.getLayoutDirection();
        int iMo870l = interfaceC15847l.mo870l(f2);
        interfaceC15847l.getLayoutDirection();
        C12507l c12507l3 = c12507l;
        int iMo870l2 = interfaceC15847l.mo870l(f);
        int iMo870l3 = interfaceC15847l.mo870l(AbstractC3605l.billing(c17253l, interfaceC15847l.getLayoutDirection()));
        int iMopub = (C15519l.mopub(j) - iMo870l) - iMo870l2;
        long j2 = (((long) iMo870l3) << 32) | (((long) iMo870l) & 4294967295L);
        int iMo870l4 = interfaceC15847l.mo870l(AbstractC3605l.purchase(c17253l, interfaceC15847l.getLayoutDirection()) + AbstractC3605l.billing(c17253l, interfaceC15847l.getLayoutDirection()));
        int iMo870l5 = interfaceC15847l.mo870l(f + f2);
        C16761l c16761lAmazon = AbstractC14460l.amazon(c11862l, c7583l.subscription, c7583l.firebase);
        long jYandex = C15519l.yandex(AbstractC7563l.mopub(iMo870l4, j), 0, AbstractC7563l.billing(iMo870l5, j), 0, 10, j);
        int iMo870l6 = interfaceC15847l.mo870l(this.purchase);
        boolean zMo992import = interfaceC15847l.mo992import();
        C16122l c16122l = c7583l.loadAd;
        C9568l c9568l = new C9568l(c7583l, c16761lAmazon, c11862l, c12507l3, jYandex, true, c17385l, iMopub, j2, iMo870l, iMo870l2, iMo870l6, this.billing, z, c16122l != null ? c16122l.remoteconfig : null, this.mopub);
        C7403l c7403l = c7583l.crashlytics;
        int[] iArr = (int[]) c7403l.f15341l;
        Object obj = c7403l.f15337l;
        Integer numM2405for = AbstractC8669l.m2405for(iArr, 0);
        int iYandex = AbstractC13841l.yandex(c11862l, obj, numM2405for != null ? numM2405for.intValue() : 0);
        if (!AbstractC8669l.tapsense(iArr, iYandex)) {
            ((C0536l) c7403l.f15338l).crashlytics(iYandex);
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                iArr = (int[]) ((C14959l) c7403l.f15342l).invoke(Integer.valueOf(iYandex), Integer.valueOf(iArr.length));
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                c7403l.f15341l = iArr;
                ((C15308l) c7403l.f15343l).subs(C7403l.yandex(iArr));
            } catch (Throwable th) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th;
            }
        }
        int[] iArr2 = (int[]) c7403l.f15340l;
        int length = iArr.length;
        int i2 = c9568l.subscription;
        if (length != i2) {
            C13698l c13698l = c9568l.ads;
            c13698l.m3669continue();
            int[] iArr3 = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (i3 >= iArr.length || (iAmazon = iArr[i3]) == -1) {
                    iAmazon = i3 == 0 ? 0 : AbstractC3461l.amazon(((long) i3) & 4294967295L, iArr3) + 1;
                }
                iArr3[i3] = iAmazon;
                c13698l.m3676interface(iAmazon, i3);
                i3++;
            }
            iArr = iArr3;
        }
        if (iArr2.length != i2) {
            int[] iArr4 = new int[i2];
            int i4 = 0;
            while (i4 < i2) {
                if (i4 < iArr2.length) {
                    i = iArr2[i4];
                } else {
                    i = i4 == 0 ? 0 : iArr4[i4 - 1];
                }
                iArr4[i4] = i;
                i4++;
            }
            iArr2 = iArr4;
        }
        C16122l c16122lPurchase = AbstractC3461l.purchase(c9568l, Math.round((zMo992import || !c7583l.yandex) ? c7583l.metrica : ((Number) ((C6570l) c7583l.pro.f26580l).f13720l.getValue()).floatValue()), iArr, iArr2, true);
        c7583l.billing(c16122lPurchase, interfaceC15847l.mo992import(), false);
        return c16122lPurchase;
    }
}
