package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17824l {
    public static final C15578l yandex = new C15578l(-1681201316, false, new C14484l(28));
    public static final C15578l loadAd = new C15578l(143633524, false, new C8918l(2));
    public static final C15578l crashlytics = new C15578l(1104834349, false, new C12851l(4));
    public static final C15578l amazon = new C15578l(-556275898, false, new C8918l(3));
    public static final C15578l purchase = new C15578l(916002695, false, new C8918l(4));
    public static final C15578l billing = new C15578l(-1906686008, false, new C11112l(27));
    public static final C15578l mopub = new C15578l(-434407415, false, new C11112l(28));
    public static final C15578l admob = new C15578l(1037871178, false, new C11112l(29));
    public static final C15578l subs = new C15578l(-922141780, false, new C8918l(0));
    public static final C15578l isPro = new C15578l(935694204, false, new C14484l(29));
    public static final C15578l firebase = new C15578l(-621029413, false, new C8918l(1));
    public static final C15578l smaato = new C15578l(2041596768, false, new C12851l(0));
    public static final C15578l remoteconfig = new C15578l(-413959472, false, new C12851l(1));
    public static final C15578l vip = new C15578l(70424061, false, new C12851l(2));
    public static final C15578l metrica = new C15578l(-980133062, false, new C12851l(3));

    public static final void admob(Function0 function0, C6956l c6956l, int i) {
        Function0 function1;
        C6956l c6956l2;
        c6956l.m2133new(-96299548);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            c6956l2 = c6956l;
            AbstractC7470l.billing(function1, null, false, null, AbstractC0676l.purchase(c6956l), null, AbstractC4071l.yandex, c6956l2, (i2 & 14) | 1572864, 46);
        } else {
            function1 = function0;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0454l(i, 9, function1);
        }
    }

    public static final void amazon(int i, C6956l c6956l, Function0 function0, boolean z, boolean z2) {
        int i2;
        c6956l.m2133new(-474746036);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(C4346l.f8873l, 40.0f);
            int i3 = i2;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zAmazon = c6956l.amazon(iAdmob);
            Object objM2132native = c6956l.m2132native();
            int i4 = 14;
            if (zAmazon || objM2132native == C1867l.yandex) {
                objM2132native = new C2221l(iAdmob, i4);
                c6956l.m2147try(objM2132native);
            }
            AbstractC7741l.loadAd(boolValueOf, interfaceC17242lIsPro, (Function1) objM2132native, null, "", null, AbstractC14566l.amazon(-1382756631, new C5699l(function0, z), c6956l), c6956l, ((i3 >> 3) & 14) | 1597488, 40);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13493l(z, z2, function0, i);
        }
    }

    public static final void billing(Function0 function0, C6956l c6956l, int i) {
        Function0 function1;
        C6956l c6956l2;
        c6956l.m2133new(2367995);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            c6956l2 = c6956l;
            AbstractC7470l.billing(function1, null, false, null, AbstractC0676l.purchase(c6956l), null, AbstractC4071l.crashlytics, c6956l2, (i2 & 14) | 1572864, 46);
        } else {
            function1 = function0;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0454l(i, 12, function1);
        }
    }

    public static final void crashlytics(EnumC12501l enumC12501l, Function0 function0, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-796625636);
        if ((i & 6) == 0) {
            i2 = (c6956l.amazon(enumC12501l.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            boolean z = enumC12501l != EnumC12501l.f24641l;
            boolean z2 = (i2 & 112) == 32;
            Object objM2132native = c6956l.m2132native();
            if (z2 || objM2132native == C1867l.yandex) {
                objM2132native = new C6199l(9, function0);
                c6956l.m2147try(objM2132native);
            }
            yandex(z, (Function1) objM2132native, AbstractC0080l.isPro(C4346l.f8873l, 40.0f), AbstractC14566l.amazon(-832830683, new C4951l(17, enumC12501l), c6956l), c6956l, 3456, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(enumC12501l, function0, i, 13);
        }
    }

    public static void firebase(AbstractC5921l abstractC5921l, C14025l c14025l) {
        if (abstractC5921l.isVip(c14025l)) {
            return;
        }
        try {
            abstractC5921l.mo691continue(c14025l, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object isPro(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return subs(cls, map, arrayList);
    }

    public static final void loadAd(int i, C6956l c6956l, Function0 function0, boolean z, boolean z2) {
        int i2;
        c6956l.m2133new(-1733650190);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC7470l.purchase(function0, AbstractC12442l.appmetrica(c6956l), AbstractC0080l.isPro(C4346l.f8873l, 60.0f), false, AbstractC12442l.Signature(((C18718l) c6956l.isPro(AbstractC5992l.yandex)).amazon, ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex, c6956l), AbstractC0676l.purchase(c6956l), AbstractC14566l.amazon(-1705821676, new C4061l(i3, z, z2), c6956l), c6956l, (i2 & 14) | 1573248);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13493l(function0, z, z2, i);
        }
    }

    public static final void mopub(Function0 function0, C6956l c6956l, int i) {
        Function0 function1;
        C6956l c6956l2;
        c6956l.m2133new(-1963100704);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            c6956l2 = c6956l;
            AbstractC7470l.billing(function1, null, false, null, AbstractC0676l.purchase(c6956l), null, AbstractC4071l.amazon, c6956l2, (i2 & 14) | 1572864, 46);
        } else {
            function1 = function0;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0454l(i, 10, function1);
        }
    }

    public static final void purchase(Function0 function0, C6956l c6956l, int i) {
        Function0 function1;
        C6956l c6956l2;
        c6956l.m2133new(718149001);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            c6956l2 = c6956l;
            AbstractC7470l.billing(function1, null, false, null, AbstractC0676l.purchase(c6956l), null, AbstractC4071l.loadAd, c6956l2, (i2 & 14) | 1572864, 46);
        } else {
            function1 = function0;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0454l(i, 11, function1);
        }
    }

    public static final void smaato(AbstractC5921l abstractC5921l, C14025l c14025l) throws IOException {
        try {
            IOException iOException = null;
            for (C14025l c14025l2 : abstractC5921l.signatures(c14025l)) {
                try {
                    if (abstractC5921l.m1876synchronized(c14025l2).loadAd) {
                        smaato(abstractC5921l, c14025l2);
                    }
                    abstractC5921l.adcel(c14025l2, false);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final Object subs(Class cls, Map map, List list) {
        C8688l c8688l = new C8688l(new C7646l(3, map));
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C1126l(cls, map, new C8688l(new C0340l(cls, map, false, 1)), c8688l, list));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    public static final void yandex(boolean z, Function1 function1, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        boolean z2;
        InterfaceC17242l interfaceC17242l3;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        c6956l.m2133new(-263798159);
        int i4 = (c6956l.mopub(z) ? 4 : 2) | i | (c6956l.admob(function1) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i4 |= c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i3 = i4;
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i3 & 1, z2)) {
                if (i5 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                long j = C9735l.isPro;
                C10707l c10707l = AbstractC5992l.yandex;
                interfaceC17242l3 = interfaceC17242l4;
                AbstractC7470l.amazon(z, function1, AbstractC12442l.inmobi(c6956l), interfaceC17242l3, false, AbstractC12442l.pro(j, ((C18718l) c6956l.isPro(c10707l)).crashlytics, ((C18718l) c6956l.isPro(c10707l)).amazon, ((C18718l) c6956l.isPro(c10707l)).yandex, c6956l), AbstractC0676l.purchase(c6956l), c15578l, c6956l, (i3 & 126) | ((i3 << 3) & 7168) | 12582912, 16);
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C9272l(z, function1, interfaceC17242l3, c15578l, i, i2);
            }
        }
        i4 |= 384;
        interfaceC17242l2 = interfaceC17242l;
        i3 = i4;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i3 & 1, z2)) {
            if (i5 != 0) {
                interfaceC17242l4 = C4346l.f8873l;
            } else {
                interfaceC17242l4 = interfaceC17242l2;
            }
            long j2 = C9735l.isPro;
            C10707l c10707l2 = AbstractC5992l.yandex;
            interfaceC17242l3 = interfaceC17242l4;
            AbstractC7470l.amazon(z, function1, AbstractC12442l.inmobi(c6956l), interfaceC17242l3, false, AbstractC12442l.pro(j2, ((C18718l) c6956l.isPro(c10707l2)).crashlytics, ((C18718l) c6956l.isPro(c10707l2)).amazon, ((C18718l) c6956l.isPro(c10707l2)).yandex, c6956l), AbstractC0676l.purchase(c6956l), c15578l, c6956l, (i3 & 126) | ((i3 << 3) & 7168) | 12582912, 16);
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9272l(z, function1, interfaceC17242l3, c15578l, i, i2);
        }
    }
}
