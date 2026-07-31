package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًۨؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8441l {
    public static final C15578l yandex = new C15578l(-685901422, false, new C11902l(5));
    public static final C15578l loadAd = new C15578l(1886749759, false, new C11902l(6));
    public static final C15578l crashlytics = new C15578l(-2124374540, false, new C10673l(2));

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5, types: [lؕۘۡ] */
    public static final void amazon(C11183l c11183l, C6742l c6742l) {
        boolean z;
        C17448l c17448l;
        ?? r4;
        Object c18435l;
        if (Build.VERSION.SDK_INT >= 31) {
            InterfaceC14859l interfaceC14859lM4555synchronized = c6742l.f14144l.f26629l.m4555synchronized();
            Canvas canvas = AbstractC10071l.yandex;
            if (((C2151l) interfaceC14859lM4555synchronized).yandex.isHardwareAccelerated()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean zCrashlytics = AbstractC13958l.crashlytics(c11183l);
        if (zCrashlytics && z) {
            InterfaceC3587l interfaceC3587l = c11183l.f22485l;
            InterfaceC3587l c13713l = interfaceC3587l instanceof C13713l ? interfaceC3587l : new C13713l(c11183l);
            if (c13713l != interfaceC3587l) {
                interfaceC3587l.loadAd();
                c11183l.f22485l = c13713l;
                return;
            }
            return;
        }
        if (zCrashlytics) {
            InterfaceC3587l interfaceC3587l2 = c11183l.f22485l;
            if (!(interfaceC3587l2 instanceof C17869l)) {
                Object obj = null;
                if (C17869l.admob) {
                    try {
                        r4 = interfaceC3587l2;
                        c18435l = new C17869l(c11183l);
                    } catch (Throwable th) {
                        c18435l = new C18435l(th);
                    }
                    if (C1171l.yandex(c18435l) != null) {
                        C17869l.admob = false;
                    }
                    obj = (C17869l) (c18435l instanceof C18435l ? null : c18435l);
                }
                r4 = interfaceC3587l2;
                r4 = obj;
            }
            if (r4 != 0) {
                InterfaceC3587l interfaceC3587l3 = c11183l.f22485l;
                if (r4 != interfaceC3587l3) {
                    interfaceC3587l3.loadAd();
                    c11183l.f22485l = r4;
                    return;
                }
                return;
            }
        }
        InterfaceC3587l interfaceC3587l4 = c11183l.f22485l;
        if ((interfaceC3587l4 instanceof C17448l) || (c17448l = new C17448l(c11183l)) == interfaceC3587l4) {
            return;
        }
        interfaceC3587l4.loadAd();
        c11183l.f22485l = c17448l;
    }

    public static final Object crashlytics(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        Enum r1;
        if (!z) {
            if (r4 != null) {
                set = AbstractC16901l.m4229l(AbstractC9905l.admob(set, r4));
            }
            return AbstractC16901l.m4224instanceof(set);
        }
        if (set.contains(r2)) {
            r1 = r2;
        } else {
            r1 = set.contains(r3) ? r3 : null;
        }
        if (AbstractC8576l.yandex(r1, r2) && AbstractC8576l.yandex(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    public static C8913l loadAd(C2312l c2312l, C16412l c16412l, InterfaceC11865l interfaceC11865l, InputStream inputStream) throws IOException {
        C7431l c7431l;
        AbstractC14080l abstractC14080l;
        try {
            C5378l c5378l = C5378l.billing;
            C5378l c5378lYandex = AbstractC12027l.yandex(inputStream);
            C5378l c5378l2 = C5378l.billing;
            int i = c5378lYandex.crashlytics;
            int i2 = c5378l2.crashlytics;
            int i3 = c5378lYandex.loadAd;
            int i4 = c5378l2.loadAd;
            if (i3 == 0) {
                if (i4 == 0 && i == i2) {
                    C3429l c3429l = new C3429l();
                    AbstractC6810l.yandex(c3429l);
                    C2630l c2630l = C7431l.f15379l;
                    c2630l.getClass();
                    C1718l c1718l = new C1718l(inputStream);
                    abstractC14080l = (AbstractC14080l) c2630l.crashlytics(c1718l, c3429l);
                    try {
                        c1718l.yandex(0);
                        C2630l.yandex(abstractC14080l);
                        c7431l = (C7431l) abstractC14080l;
                    } catch (C12383l e) {
                        e.f24472l = abstractC14080l;
                        throw e;
                    }
                } else {
                    c7431l = null;
                }
            } else if (i3 != i4 || i > i2) {
                c7431l = null;
            } else {
                C3429l c3429l2 = new C3429l();
                AbstractC6810l.yandex(c3429l2);
                C2630l c2630l2 = C7431l.f15379l;
                c2630l2.getClass();
                C1718l c1718l2 = new C1718l(inputStream);
                abstractC14080l = (AbstractC14080l) c2630l2.crashlytics(c1718l2, c3429l2);
                c1718l2.yandex(0);
                C2630l.yandex(abstractC14080l);
                c7431l = (C7431l) abstractC14080l;
            }
            inputStream.close();
            if (c7431l != null) {
                return new C8913l(c2312l, interfaceC11865l, c7431l, c5378lYandex);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + c5378l2 + ", actual " + c5378lYandex + ". Please update Kotlin");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7876l.loadAd(inputStream, th);
                throw th2;
            }
        }
    }

    public static final void yandex(C2832l c2832l, EnumC14812l enumC14812l, C6956l c6956l, int i) {
        c6956l.m2133new(-1770945943);
        int i2 = (c6956l.billing(c2832l) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            enumC14812l = EnumC14812l.ON_RESUME;
            c6956l.m2123default(-2101357749);
            int i3 = 1;
            boolean z = (i2 & 14) == 4;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z || objM2132native == c13863l) {
                objM2132native = new C2578l(enumC14812l, c2832l, i3);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC13342l interfaceC13342l = (InterfaceC13342l) objM2132native;
            c6956l.startapp(false);
            AbstractC6475l abstractC6475lLoadAd = ((InterfaceC3177l) c6956l.isPro(AbstractC2431l.yandex)).loadAd();
            c6956l.m2123default(-2101338711);
            boolean zAdmob = c6956l.admob(abstractC6475lLoadAd) | c6956l.admob(interfaceC13342l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C8854l(abstractC6475lLoadAd, interfaceC13342l, 21);
                c6956l.m2147try(objM2132native2);
            }
            c6956l.startapp(false);
            AbstractC12311l.yandex(abstractC6475lLoadAd, interfaceC13342l, (Function1) objM2132native2, c6956l);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(c2832l, enumC14812l, i, 27);
        }
    }
}
