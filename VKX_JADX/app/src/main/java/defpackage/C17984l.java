package defpackage;

import android.net.ConnectivityManager;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: l٘ٗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17984l extends AbstractC11801l {
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final void m4451public(C17984l c17984l) {
        c17984l.getClass();
        ConnectivityManager connectivityManager = VKXApplication.f36630l;
        if (connectivityManager == null) {
            connectivityManager = null;
        }
        if (AbstractC13950l.m3811for(connectivityManager)) {
            new C13330l(R.string.launch_warning, R.string.vpn_prewarn_auth, R.string.confirm_act, null, null, new C2573l(c17984l, 1), null, 360).Signature(c17984l.isVip());
        } else {
            c17984l.m4125private(new C11562l());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4452abstract(C6956l c6956l, int i) {
        ?? r0;
        C6956l c6956l2;
        boolean z;
        C6956l c6956l3;
        C6956l c6956l4 = c6956l;
        c6956l4.m2133new(1536465418);
        int i2 = i | (c6956l4.admob(this) ? 4 : 2);
        if (c6956l4.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l4.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                C6782l c6782l = C6782l.yandex;
                c6782l.getClass();
                C8634l c8634l = C6782l.crashlytics;
                InterfaceC13922l interfaceC13922l = C6782l.loadAd[0];
                objM2132native = AbstractC8020l.smaato(Boolean.valueOf(!((Boolean) c8634l.pro(c6782l)).booleanValue()));
                c6956l4.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                c6956l4.m2123default(1375012501);
                C9401l c9401l = new C9401l(4);
                Object objM2132native2 = c6956l4.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = new C0289l(interfaceC8714l, 16);
                    c6956l4.m2147try(objM2132native2);
                }
                z = false;
                AbstractC16291l.yandex((Function0) objM2132native2, AbstractC14566l.amazon(-446123689, new C7605l(interfaceC8714l, 3), c6956l4), null, AbstractC14566l.amazon(1485001945, new C14601l(this, interfaceC8714l, 14), c6956l4), AbstractC4959l.crashlytics, AbstractC4959l.amazon, AbstractC4959l.purchase, null, 0L, 0L, 0L, 0L, c9401l, c6956l, 1797174, 3072, 8068);
                c6956l3 = c6956l;
            } else {
                z = false;
                c6956l4.m2123default(1370665464);
                c6956l3 = c6956l4;
            }
            c6956l3.startapp(z);
            r0 = z;
            c6956l2 = c6956l3;
        } else {
            r0 = 0;
            c6956l4.m2124else();
            c6956l2 = c6956l4;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9759l(this, i, r0);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4453import(List list, Function0 function0, C6956l c6956l, int i) {
        List list2;
        int i2;
        InterfaceC8714l interfaceC8714l;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1611713264);
        int i3 = 4;
        if ((i & 6) == 0) {
            list2 = list;
            i2 = (c6956l2.admob(list2) ? 4 : 2) | i;
        } else {
            list2 = list;
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l2.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                C11521l c11521l = new C11521l(0, EnumC0442l.f1616l);
                while (true) {
                    if (!c11521l.hasNext()) {
                        objM2132native = EnumC0442l.Default;
                        break;
                    }
                    EnumC0442l enumC0442l = (EnumC0442l) c11521l.next();
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    if (AbstractC14147l.yandex(vKXApplication, enumC0442l)) {
                        objM2132native = enumC0442l;
                        break;
                    }
                }
                c6956l2.m2147try(objM2132native);
            }
            EnumC0442l enumC0442l2 = (EnumC0442l) objM2132native;
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.smaato(null);
                c6956l2.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native2;
            C15050l c15050l = (C15050l) interfaceC8714l2.getValue();
            if (c15050l == null) {
                c6956l2.m2123default(1110771589);
                c6956l2.startapp(false);
                interfaceC8714l = interfaceC8714l2;
            } else {
                c6956l2.m2123default(1110771590);
                Object objM2132native3 = c6956l2.m2132native();
                if (objM2132native3 == c13863l) {
                    objM2132native3 = new C0289l(interfaceC8714l2, 15);
                    c6956l2.m2147try(objM2132native3);
                }
                interfaceC8714l = interfaceC8714l2;
                AbstractC16291l.yandex((Function0) objM2132native3, AbstractC14566l.amazon(-1001366069, new C12755l((Object) c15050l, (Object) function0, interfaceC8714l2, i4), c6956l2), null, AbstractC14566l.amazon(1219580425, new C7605l(interfaceC8714l2, i3), c6956l2), AbstractC4959l.firebase, AbstractC4959l.smaato, AbstractC4959l.remoteconfig, null, 0L, 0L, 0L, 0L, null, c6956l, 1797174, 0, 16260);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
            }
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-292171253, new C2104l(this, enumC0442l2, list2, interfaceC8714l, 5), c6956l2), c6956l2, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(this, list, function0, i, 16);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m4454instanceof(C6956l c6956l, int i) {
        c6956l.m2133new(-1874375703);
        int i2 = 4;
        int i3 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                C11521l c11521l = new C11521l(0, EnumC0442l.f1616l);
                while (true) {
                    if (!c11521l.hasNext()) {
                        objM2132native = EnumC0442l.Default;
                        break;
                    }
                    EnumC0442l enumC0442l = (EnumC0442l) c11521l.next();
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    if (AbstractC14147l.yandex(vKXApplication, enumC0442l)) {
                        objM2132native = enumC0442l;
                        break;
                    }
                }
                c6956l.m2147try(objM2132native);
            }
            EnumC0442l enumC0442l2 = (EnumC0442l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                C8688l c8688l = C2490l.subs;
                objM2132native2 = Boolean.valueOf(AbstractC12832l.crashlytics().loadAd.ads());
                c6956l.m2147try(objM2132native2);
            }
            AbstractC15497l.loadAd(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), null, AbstractC14566l.amazon(-113636092, new C7371l(this, ((Boolean) objM2132native2).booleanValue(), 7), c6956l), null, null, 0, 0L, 0L, null, AbstractC14566l.amazon(-1661305862, new C0541l(this, enumC0442l2, i2), c6956l), c6956l, 805306758, 506);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9759l(this, i, 1);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(1548016914);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(AbstractC16584l.loadAd().subs());
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            int i3 = i2 & 14;
            m4452abstract(c6956l, i3);
            if (((List) interfaceC8714l.getValue()).isEmpty()) {
                c6956l.m2123default(1908418889);
                m4454instanceof(c6956l, i3);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(1908230099);
                List list = (List) interfaceC8714l.getValue();
                Object objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = new C0289l(interfaceC8714l, 14);
                    c6956l.m2147try(objM2132native2);
                }
                m4453import(list, (Function0) objM2132native2, c6956l, ((i2 << 6) & 896) | 48);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9759l(this, i, 3);
        }
    }
}
