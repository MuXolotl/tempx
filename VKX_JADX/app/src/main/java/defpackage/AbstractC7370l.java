package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚٛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7370l {
    public static final StringBuilder yandex = new StringBuilder(64);

    public static final InterfaceC1388l admob(InterfaceC13012l interfaceC13012l) {
        InterfaceC1388l interfaceC1388lMopub;
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        if (interfaceC1122lMo1616package != null && (interfaceC1388lMopub = mopub(interfaceC1122lMo1616package)) != null) {
            return interfaceC1388lMopub;
        }
        C11467l.Signature(interfaceC13012l, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    public static final void amazon(C6956l c6956l, int i) {
        c6956l.m2133new(372940860);
        if (c6956l.m2127for(i & 1, i != 0)) {
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.ota_card_permission);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17251l(i, 5);
        }
    }

    public static String billing(String str, String str2) {
        StringBuilder sb = yandex;
        sb.setLength(0);
        sb.append("----");
        sb.append(':');
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        AbstractC12442l.subscription(sb.length() <= 64);
        return sb.toString();
    }

    public static final void crashlytics(C6956l c6956l, int i) {
        c6956l.m2133new(-1672936872);
        if (c6956l.m2127for(i & 1, i != 0)) {
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.ota_card_permission_text);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 0, 0, 131066);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17251l(i, 6);
        }
    }

    public static final void isPro(CaptureRequest.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            subs(builder, entry.getKey(), entry.getValue());
        }
    }

    public static final void loadAd(Function0 function0, Function0 function1, C6956l c6956l, int i) {
        int i2;
        Function0 function2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(575471686);
        if ((i & 6) == 0) {
            i2 = (c6956l2.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (c6956l2.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i4 = (int) ((j >>> 32) ^ j);
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
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC17457l.mopub(function0, null, false, null, null, null, AbstractC12272l.yandex, c6956l2, (i3 & 14) | 805306368, 510);
            AbstractC9334l.yandex(c6956l2, new C9247l(1.0f, true));
            function2 = function1;
            AbstractC17457l.loadAd(function2, null, false, null, null, null, null, null, AbstractC12272l.loadAd, c6956l, ((i3 >> 3) & 14) | 805306368, 510);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            function2 = function1;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(function0, function2, i, 28);
        }
    }

    public static final InterfaceC1388l mopub(InterfaceC1122l interfaceC1122l) {
        if (interfaceC1122l instanceof InterfaceC1388l) {
            return (InterfaceC1388l) interfaceC1122l;
        }
        Object obj = null;
        if (!(interfaceC1122l instanceof AbstractC11726l)) {
            C11467l.Signature(interfaceC1122l, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((AbstractC11726l) interfaceC1122l).getUpperBounds();
        for (Object obj2 : upperBounds) {
            InterfaceC1122l interfaceC1122lMo1616package = ((InterfaceC13012l) obj2).mo1616package();
            C5160l c5160l = interfaceC1122lMo1616package instanceof C5160l ? (C5160l) interfaceC1122lMo1616package : null;
            if (c5160l != null && c5160l.m1728import() != EnumC18401l.INTERFACE && c5160l.m1728import() != EnumC18401l.ANNOTATION_CLASS) {
                obj = obj2;
                break;
            }
        }
        InterfaceC13012l interfaceC13012l = (InterfaceC13012l) obj;
        if (interfaceC13012l == null) {
            interfaceC13012l = (InterfaceC13012l) AbstractC16901l.m4217extends(upperBounds);
        }
        return interfaceC13012l != null ? admob(interfaceC13012l) : AbstractC18202l.yandex.loadAd(Object.class);
    }

    public static final void purchase(boolean z, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        C4346l c4346l;
        float f;
        c6956l.m2133new(1398083095);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16) | (c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C15089l c15089l = C18450l.f36034l;
            float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
            C4346l c4346l2 = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 16.0f, 0.0f, 16.0f, fYandex, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l, 48);
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
            if (z) {
                c6956l.m2123default(-905988055);
                c4346l = c4346l2;
                f = 16.0f;
                C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                c6956l.startapp(false);
            } else {
                c4346l = c4346l2;
                f = 16.0f;
                c6956l.m2123default(-905926241);
                AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                c6956l.startapp(false);
            }
            amazon(c6956l, 0);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, f));
            crashlytics(c6956l, 0);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, f));
            loadAd(function0, function1, c6956l, (i2 >> 3) & 126);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16327l(z, function0, function1, i, 1);
        }
    }

    public static final void subs(CaptureRequest.Builder builder, Object obj, Object obj2) {
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e) {
            Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
        }
    }

    public static final void yandex(InterfaceC12001l interfaceC12001l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-474572032);
        int i2 = 14;
        if ((((c6956l.billing(interfaceC12001l) ? 4 : 2) | i | 432) & 1171) == 1170 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2125final(1849434622);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C5150l.f11197l;
                c6956l.m2147try(objM2132native);
            }
            c6956l.startapp(false);
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            c6956l.m2125final(-683746039);
            c6956l.m2125final(-548224868);
            if (!(c6956l.yandex instanceof C2416l)) {
                AbstractC8238l.amazon();
                throw null;
            }
            c6956l.m2131interface();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC12001l, new C3755l(12));
            AbstractC8182l.billing(c6956l, new C12347l(0), new C3755l(13));
            AbstractC8182l.billing(c6956l, new C15667l(0), new C3755l(i2));
            c15578l.invoke(C2806l.yandex, c6956l, 54);
            c6956l.startapp(true);
            c6956l.startapp(false);
            c6956l.startapp(false);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(interfaceC12001l, c15578l, i, i2);
        }
    }
}
