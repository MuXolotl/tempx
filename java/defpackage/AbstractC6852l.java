package defpackage;

import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙۣۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6852l {
    public static final float yandex = (25.0f * 2.0f) / 2.4142137f;

    public static final void loadAd(int i, int i2, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i3;
        c6956l.m2133new(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC17242l = C4346l.f8873l;
            }
            AbstractC9334l.yandex(c6956l, AbstractC14289l.firebase(AbstractC0080l.firebase(interfaceC17242l, yandex, 25.0f), new C4199l(((C8620l) c6956l.isPro(AbstractC4524l.yandex)).yandex, 1)));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17292l(interfaceC17242l, i, i2, 0);
        }
    }

    public static final void yandex(InterfaceC7316l interfaceC7316l, InterfaceC17242l interfaceC17242l, long j, C6956l c6956l, int i, int i2) {
        c6956l.m2133new(1776202187);
        int i3 = (c6956l.billing(interfaceC7316l) ? 4 : 2) | i | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && c6956l.purchase(j)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            c6956l.adcel();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C1412l(4, interfaceC7316l);
                c6956l.m2147try(objM2132native);
            }
            AbstractC5103l.yandex(interfaceC7316l, C18450l.f36017l, AbstractC14566l.amazon(-1653527038, new C1714l(j, AbstractC4962l.yandex(interfaceC17242l, false, (Function1) objM2132native)), c6956l), c6956l, i4 | 432);
        } else {
            c6956l.m2124else();
        }
        long j2 = j;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6013l(interfaceC7316l, interfaceC17242l, j2, i, i2, 0);
        }
    }
}
