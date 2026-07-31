package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًۛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8265l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C15578l f17163l = new C15578l(-961100858, false, new C13881l(0));

    public static final C11359l amazon(C3554l c3554l) {
        String str = c3554l.f7471l;
        String str2 = c3554l.f7470l;
        List list = c3554l.f7469l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((C2882l) it.next()).f6280l));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(((C2882l) it2.next()).f6279l));
        }
        return new C11359l(str, str2, false, arrayList, arrayList2);
    }

    public static final C5073l crashlytics(InterfaceC15829l interfaceC15829l, Function1 function1, Function3 function3, AbstractC11904l abstractC11904l, C6956l c6956l, int i) {
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = AbstractC12311l.isPro(c6956l);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
        Object objM2132native2 = c6956l.m2132native();
        int i2 = 0;
        if (objM2132native2 == c13863l) {
            C8766l c8766l = new C8766l(interfaceC15829l.yandex(), function1, abstractC11904l, i2);
            c6956l.m2147try(c8766l);
            objM2132native2 = c8766l;
        }
        InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd((InterfaceC6942l) objM2132native2, abstractC11904l, c6956l, 0);
        Object objM2132native3 = c6956l.m2132native();
        if (objM2132native3 == c13863l) {
            objM2132native3 = new C5073l(interfaceC8714lLoadAd, interfaceC2262l, interfaceC15829l, function3);
            c6956l.m2147try(objM2132native3);
        }
        return (C5073l) objM2132native3;
    }

    public static C5192l loadAd(InterfaceC1388l interfaceC1388l, String str) {
        C5192l c5192l;
        HashMap map = C5192l.crashlytics;
        synchronized (map) {
            try {
                Object c5192l2 = map.get(str);
                if (c5192l2 == null) {
                    c5192l2 = new C5192l(interfaceC1388l, str);
                    map.put(str, c5192l2);
                }
                c5192l = (C5192l) c5192l2;
                if (!AbstractC8576l.yandex(c5192l.loadAd, interfaceC1388l)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5192l;
    }

    public static final void yandex(C0247l c0247l, List list, Function1 function1, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1007379715);
        int i2 = i | (c6956l2.admob(list) ? 32 : 16) | (c6956l2.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 145) != 144)) {
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.spark_payment_window_method);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            c6956l2 = c6956l;
            AbstractC3383l.yandex(null, null, null, null, null, AbstractC14566l.amazon(-1039797739, new C3091l(list, function1, 14), c6956l2), c6956l2, 196608, 31);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(c0247l, list, function1, i, 10);
        }
    }
}
