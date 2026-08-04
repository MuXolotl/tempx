package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؒٔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1050l extends AbstractC11801l {
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m777abstract(String str, Function0 function0, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1496772175);
        if ((i & 48) == 0) {
            i2 = i | (c6956l.admob(function0) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC13319l.yandex(AbstractC14566l.amazon(-207091565, new C4210l(str, 5), c6956l), AbstractC9151l.loadAd(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), false, null, function0, 15), null, null, null, null, null, c6956l, 6, 508);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(this, str, function0, i, 11);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m778import(String str, C6956l c6956l, int i) {
        c6956l.m2133new(-1586760009);
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            AbstractC13010l.loadAd(str, AbstractC3605l.remoteconfig(C4346l.f8873l, 16.0f, 12.0f), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 54, 0, 262136);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, str, i, 22);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(1639321944);
        int i2 = i | (c6956l.billing(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-41264100, new C9772l(c13072lYandex, this, 23), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-79370393, new Cprotected(c13072lYandex, this, (InterfaceC2262l) objM2132native, 15), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10862l(this, i);
        }
    }
}
