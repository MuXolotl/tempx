package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘؙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5992l {
    public static final C10707l yandex = new C10707l(new C6573l(2));

    public static final void yandex(final long j, final long j2, final C15578l c15578l, C6956l c6956l, final int i) {
        c6956l.m2133new(874084409);
        int i2 = (c6956l.purchase(j) ? 4 : 2) | i | (c6956l.purchase(j2) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C18718l(j, j2);
                c6956l.m2147try(objM2132native);
            }
            C18718l c18718l = (C18718l) objM2132native;
            AbstractC10478l.loadAd(new C10092l[]{yandex.yandex(c18718l), AbstractC5020l.startapp(c18718l.yandex, AbstractC12502l.yandex)}, c15578l, c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(j, j2, c15578l, i) { // from class: lُّ٘

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f34828l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ long f34829l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ long f34830l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(385);
                    AbstractC5992l.yandex(this.f34830l, this.f34829l, this.f34828l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
