package defpackage;

import android.content.Context;
import android.content.res.Resources;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18296l {
    public static final C9714l yandex = new C9714l();

    public static final List admob(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(AbstractC16901l.m4231native(list));
        }
        return C2580l.f5619l;
    }

    public static final void amazon(int i, C6956l c6956l, boolean z) {
        c6956l.m2133new(-1495004923);
        int i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            String strPurchase = AbstractC11999l.purchase(c6956l, z ? R.string.ota_card_disclaimer_critical : R.string.ota_card_disclaimer);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC3605l.startapp(C4346l.f8873l, 0.0f, 16.0f, 0.0f, 0.0f, 13), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 48, 0, 131064);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4584l(i, 10, z);
        }
    }

    public static final void billing(C5056l c5056l, Object obj, InterfaceC17242l interfaceC17242l, boolean z, boolean z2, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        boolean z3;
        c6956l.m2133new(1129341741);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c5056l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.mopub(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= c6956l.mopub(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2123default(-1931603123);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(new C1187l(0L));
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            c6956l.startapp(false);
            c6956l.m2123default(-1931600257);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C3006l(26, interfaceC8714l);
                c6956l.m2147try(objM2132native2);
            }
            c6956l.startapp(false);
            InterfaceC17242l interfaceC17242lBilling = AbstractC8238l.billing(interfaceC17242l, (Function1) objM2132native2);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            int iLoadAd = AbstractC8238l.loadAd(c6956l);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lBilling);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            C6415l c6415l = C3438l.isPro;
            if (c6956l.f14603switch || !AbstractC8576l.yandex(c6956l.m2132native(), Integer.valueOf(iLoadAd))) {
                c6956l.m2147try(Integer.valueOf(iLoadAd));
                c6956l.loadAd(Integer.valueOf(iLoadAd), c6415l);
            }
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
            c6956l.m2123default(872013070);
            int i3 = i2 & 14;
            boolean zBilling = (i3 == 4) | c6956l.billing(obj);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling || objM2132native3 == c13863l) {
                objM2132native3 = new C18297l(c5056l, obj, new C11029l(16, interfaceC8714l));
                c6956l.m2147try(objM2132native3);
            }
            c6956l.startapp(false);
            c15578l.invoke((C18297l) objM2132native3, Boolean.valueOf(z3), c6956l, Integer.valueOf((i2 >> 9) & 1008));
            c6956l.startapp(true);
            HashSet hashSet = c5056l.ads;
            Boolean boolValueOf = Boolean.valueOf(z);
            c6956l.m2123default(-1931586729);
            boolean zAdmob = ((i2 & 7168) == 2048) | (i3 == 4) | c6956l.admob(obj);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob || objM2132native4 == c13863l) {
                objM2132native4 = new C9239l(z, c5056l, obj, (InterfaceC14029l) null);
                c6956l.m2147try(objM2132native4);
            }
            c6956l.startapp(false);
            AbstractC12311l.purchase(hashSet, boolValueOf, (Function2) objM2132native4, c6956l);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14789l(c5056l, obj, interfaceC17242l, z, z3, c15578l, i);
        }
    }

    public static final void crashlytics(String str, int i, String str2, C9247l c9247l, C6956l c6956l, int i2) {
        c6956l.m2133new(530521343);
        int i3 = i2 | (c6956l.billing(str) ? 4 : 2) | (c6956l.amazon(i) ? 32 : 16) | (c6956l.billing(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(c9247l) ? 2048 : 1024);
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C15687l(6);
                c6956l.m2147try(objM2132native);
            }
            AbstractC3383l.loadAd((Function0) objM2132native, AbstractC0080l.amazon(c9247l, 1.0f), false, null, AbstractC13880l.yandex(0L, 0L, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, c6956l, 0, 11), null, null, AbstractC14566l.amazon(264376500, new C0325l(str2, i, str), c6956l), c6956l, 100663686, 232);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(str, i, str2, c9247l, i2);
        }
    }

    public static final C5160l isPro(InterfaceC17477l interfaceC17477l) {
        Class clsMetrica = AbstractC5592l.metrica(interfaceC17477l);
        C5160l c5160l = (C5160l) (clsMetrica != null ? AbstractC18202l.yandex.loadAd(clsMetrica) : null);
        if (c5160l != null) {
            return c5160l;
        }
        C11467l.ads(interfaceC17477l.Signature(), "Type parameter container is not resolved: ");
        return null;
    }

    public static final void loadAd(C6956l c6956l, int i) {
        c6956l.m2133new(-212355961);
        int i2 = 1;
        if (c6956l.m2127for(i & 1, i != 0)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C15687l(5);
                c6956l.m2147try(objM2132native);
            }
            Function0 function0 = (Function0) objM2132native;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            Resources resources = (Resources) c6956l.isPro(AbstractC1242l.crashlytics);
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = AbstractC7525l.yandex;
            AbstractC3383l.loadAd(function0, interfaceC17242lAmazon, false, null, AbstractC13880l.yandex(0L, 0L, AbstractC12953l.loadAd(resources.getColor(R.color.blue_alpha, theme)), 0L, c6956l, 0, 11), null, null, AbstractC17291l.yandex, c6956l, 100663734, 232);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17251l(i, i2);
        }
    }

    public static final void mopub(C0059l c0059l, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        C4346l c4346l;
        float f;
        C16511l c16511l;
        boolean z;
        Function0 function2 = function0;
        Function0 function3 = function1;
        c6956l.m2133new(-769886139);
        int i2 = i | (c6956l.admob(c0059l) ? 4 : 2) | (c6956l.admob(function2) ? 32 : 16) | (c6956l.admob(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = (C16511l) c0059l.get();
                c6956l.m2147try(objM2132native);
            }
            C16511l c16511l2 = (C16511l) objM2132native;
            float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
            C4346l c4346l2 = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 16.0f, 0.0f, 16.0f, fYandex, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            boolean z2 = c16511l2.mopub;
            if (z2) {
                c6956l.m2123default(-976656014);
                AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l2, 16.0f));
                c6956l.startapp(false);
                c16511l = c16511l2;
                z = z2;
                c4346l = c4346l2;
                f = 16.0f;
            } else {
                c6956l.m2123default(-976585861);
                c4346l = c4346l2;
                f = 16.0f;
                c16511l = c16511l2;
                z = z2;
                C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                c6956l.startapp(false);
            }
            purchase(c6956l, 0);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, f));
            if (c16511l.crashlytics) {
                c6956l.m2123default(-976429869);
                loadAd(c6956l, 0);
                AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, f));
            } else {
                c6956l.m2123default(-978662861);
            }
            c6956l.startapp(false);
            crashlytics(c16511l.loadAd, c16511l.yandex, c16511l.amazon, new C9247l(1.0f, false), c6956l, 0);
            amazon(0, c6956l, z);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, f));
            function2 = function0;
            function3 = function1;
            yandex(z, function2, function3, c6956l, i2 & 1008);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(c0059l, function2, function3, i, 19);
        }
    }

    public static final void purchase(C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1332562301);
        if (c6956l2.m2127for(i & 1, i != 0)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
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
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.ota_card_title);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.ota_card_text), AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.isPro, c6956l, 48, 0, 130040);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17251l(i, 2);
        }
    }

    public static final Map subs(Map map) {
        int size = map.size();
        if (size == 0) {
            return C14054l.f27396l;
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC16901l.m4248volatile(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final void yandex(boolean z, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(41794234);
        int i2 = i | (c6956l2.mopub(z) ? 4 : 2) | (c6956l2.admob(function0) ? 32 : 16) | (c6956l2.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, C4346l.f8873l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            if (z) {
                c6956l2.m2123default(-1306120340);
            } else {
                c6956l2.m2123default(-1300292588);
                AbstractC17457l.mopub(function0, null, false, null, null, null, AbstractC17291l.loadAd, c6956l, ((i2 >> 3) & 14) | 805306368, 510);
                c6956l2 = c6956l;
            }
            c6956l2.startapp(false);
            AbstractC9334l.yandex(c6956l2, new C9247l(1.0f, true));
            AbstractC17457l.loadAd(function1, null, false, null, null, null, null, null, AbstractC17291l.crashlytics, c6956l2, ((i2 >> 6) & 14) | 805306368, 510);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16327l(z, function0, function1, i, 0);
        }
    }
}
