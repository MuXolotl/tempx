package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٗؖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16911l extends AbstractC11801l {
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4250import(boolean z, Function1 function1, InterfaceC17242l interfaceC17242l, Integer num, boolean z2, C6956l c6956l, int i) {
        boolean z3;
        C15578l c15578lAmazon;
        c6956l.m2133new(45927461);
        int i2 = i | (c6956l.amazon(R.string.settings_experimental_vkru) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | (c6956l.admob(function1) ? 256 : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024) | (c6956l.billing(num) ? 16384 : 8192) | 196608;
        byte b = 0;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            int i4 = 8;
            if (num == null) {
                c6956l.m2123default(-1869165464);
                c6956l.startapp(false);
                c15578lAmazon = null;
            } else {
                c6956l.m2123default(-1869165463);
                c15578lAmazon = AbstractC14566l.amazon(-58755951, new C4314l(num.intValue(), i4, b), c6956l);
                c6956l.startapp(false);
            }
            boolean z4 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objM2132native = c6956l.m2132native();
            if (z4 || objM2132native == C1867l.yandex) {
                objM2132native = new C1926l(2, function1, z);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-143755257, new C12513l(b, i4), c6956l), AbstractC15788l.yandex(AbstractC9151l.loadAd(interfaceC17242l, true, null, (Function0) objM2132native, 14), 1.0f), null, c15578lAmazon, null, AbstractC14566l.amazon(2033371682, new C4571l(i3, function1, z), c6956l), null, c6956l, 196614, 468);
            z3 = true;
        } else {
            c6956l.m2124else();
            z3 = z2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15772l(this, z, function1, interfaceC17242l, num, z3, i);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1614812793);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3604l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3604l;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1947152459, new C14601l(c13072lYandex, this, 5), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1340391274, new C11223l(c13072lYandex, AbstractC3700l.loadAd(interfaceC6942lYandex, (C3278l) ((AbstractC11904l) C0995l.f2741l.f33214l), c6956l, 0), this, (InterfaceC2262l) objM2132native, 10), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11364l(this, i);
        }
    }
}
