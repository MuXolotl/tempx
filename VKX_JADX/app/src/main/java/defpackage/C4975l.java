package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؗٙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4975l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C8688l f10163l;

    public C4975l() {
        super(0);
        this.f10163l = new C8688l(new C13802l(15, this));
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m1658import(Function1 function1, Function0 function0, int i, C7117l c7117l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i2) {
        int i3;
        c6956l.m2133new(-511832515);
        if ((i2 & 6) == 0) {
            i3 = (c6956l.admob(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l.admob(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c6956l.admob(c7117l) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 9363) != 9362)) {
            AbstractC3383l.yandex(interfaceC17242l, null, null, null, null, AbstractC14566l.amazon(-1663702517, new C5173l(c7117l, function1, i, function0, 0), c6956l), c6956l, ((i3 >> 12) & 14) | 196608, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10939l(this, function1, function0, i, c7117l, interfaceC17242l, i2);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1071663333);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            InterfaceC15829l interfaceC15829l = (InterfaceC15829l) this.f10163l.getValue();
            C16538l c16538l = C16538l.f32325l;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C13749l(3, (InterfaceC14029l) null, i3);
                c6956l.m2147try(objM2132native);
            }
            Function3 function3 = (Function3) objM2132native;
            C18454l c18454l = C18454l.f36052l;
            C5073l c5073lCrashlytics = AbstractC8265l.crashlytics(interfaceC15829l, c16538l, function3, C18454l.yandex(), c6956l, 0);
            InterfaceC12244l interfaceC12244l = c5073lCrashlytics.f11086l;
            InterfaceC12244l interfaceC12244l2 = c5073lCrashlytics.f11086l;
            boolean zAmazon = c6956l.amazon(((C18364l) interfaceC12244l.getValue()).f35879l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAmazon || objM2132native2 == c13863l) {
                objM2132native2 = new C13765l(((C18364l) interfaceC12244l2.getValue()).f35879l);
                c6956l.m2147try(objM2132native2);
            }
            C13765l c13765l = (C13765l) objM2132native2;
            boolean zAmazon2 = c6956l.amazon(((C18364l) interfaceC12244l2.getValue()).f35875l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAmazon2 || objM2132native3 == c13863l) {
                objM2132native3 = new C13765l(((C18364l) interfaceC12244l2.getValue()).f35875l);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1354742999, new C9772l(c13072lYandex, this, 18), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1061722900, new C2669l(c13072lYandex, c5073lCrashlytics, this, c5073lCrashlytics, c13765l, (C13765l) objM2132native3), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6489l(this, i);
        }
    }
}
