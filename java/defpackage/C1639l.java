package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓؗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1639l implements InterfaceC4945l {
    public final InterfaceC13238l yandex;

    public C1639l(InterfaceC13238l interfaceC13238l) {
        this.yandex = interfaceC13238l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1639l) && AbstractC8576l.yandex(this.yandex, ((C1639l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "AudioStreamMixes(mixes=" + this.yandex + ')';
    }

    @Override // defpackage.InterfaceC4945l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(1154603144);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.billing(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C13932l(1, this);
                c6956l.m2147try(objM2132native);
            }
            C2887l c2887lLoadAd = AbstractC10521l.loadAd(0, (Function0) objM2132native, c6956l, 0, 3);
            Function1 function1 = (Function1) c6956l.isPro(AbstractC12821l.yandex);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(interfaceC17242l, 16.0f, 0.0f, 2);
            C6839l c6839l = ((C0260l) c6956l.isPro(AbstractC14696l.yandex)).amazon;
            C2209l c2209l = AbstractC8209l.yandex;
            C10707l c10707l = AbstractC10689l.yandex;
            AbstractC16291l.crashlytics(interfaceC17242lVip, c6839l, AbstractC8209l.yandex(((C10936l) c6956l.isPro(c10707l)).isPro(), ((C10936l) c6956l.isPro(c10707l)).purchase(), c6956l, 0, 0), AbstractC14566l.amazon(-857557149, new C15272l(c2887lLoadAd, this, function1, 6), c6956l), c6956l, 50);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(this, interfaceC17242l, i, 24);
        }
    }
}
