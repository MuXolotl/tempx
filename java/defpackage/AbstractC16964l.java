package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16964l {
    public static final C10707l yandex;

    static {
        AbstractC10478l.subs(new C6573l(8));
        yandex = new C10707l(new C6573l(9));
    }

    public static final void yandex(C0764l c0764l, InterfaceC1878l interfaceC1878l, C1919l c1919l, C13494l c13494l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        int i3;
        c6956l.m2133new(904511636);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c0764l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC1878l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(c1919l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(c13494l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.admob(c15578l) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            C14370l c14370l = new C14370l(c0764l, c13494l, c1919l, interfaceC1878l);
            C8372l c8372lYandex = AbstractC10493l.yandex(false, 0.0f, 0L, null, 255);
            long j = c0764l.yandex;
            boolean zPurchase = c6956l.purchase(j);
            Object objM2132native = c6956l.m2132native();
            if (zPurchase || objM2132native == C1867l.yandex) {
                i3 = 0;
                objM2132native = new C8620l(j, C9735l.loadAd(0.4f, j));
                c6956l.m2147try(objM2132native);
            } else {
                i3 = 0;
            }
            C10092l c10092lYandex = yandex.yandex(c14370l);
            C10092l c10092lYandex2 = AbstractC14631l.yandex.yandex(c8372lYandex);
            C10092l c10092lYandex3 = AbstractC4524l.yandex.yandex((C8620l) objM2132native);
            C10092l[] c10092lArr = new C10092l[3];
            c10092lArr[i3] = c10092lYandex;
            c10092lArr[1] = c10092lYandex2;
            c10092lArr[2] = c10092lYandex3;
            AbstractC10478l.loadAd(c10092lArr, AbstractC14566l.amazon(-1750539308, new C4752l(c13494l, c15578l, i3), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5418l(c0764l, interfaceC1878l, c1919l, c13494l, c15578l, i, 3);
        }
    }
}
