package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Range;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: lّٓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC12589l {
    public static InterfaceC18382l Signature(int i, int i2, int i3) {
        if (i == -2) {
            return C18499l.yandex;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            AbstractC12704l.yandex(i4);
            return new C12881l(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        AbstractC12704l.yandex(i5);
        return new C12881l(i5);
    }

    public static final boolean ad(int i) {
        Boolean bool;
        if (AbstractC3534l.yandex()) {
            try {
                int i2 = Conscrypt.yandex;
                bool = (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                AbstractC3534l.yandex.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean adcel(InterfaceC0048l interfaceC0048l) {
        return ((Boolean) interfaceC0048l.smaato(InterfaceC0048l.f927l, Boolean.FALSE)).booleanValue();
    }

    public static C17511l admob(InterfaceC0048l interfaceC0048l) {
        return (C17511l) interfaceC0048l.smaato(InterfaceC0048l.f914l, null);
    }

    public static boolean ads(InterfaceC0048l interfaceC0048l) {
        Boolean bool = (Boolean) interfaceC0048l.smaato(InterfaceC0048l.f922l, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public static int advert(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static C0665l amazon(InterfaceC0048l interfaceC0048l) {
        return (C0665l) interfaceC0048l.smaato(InterfaceC0048l.f928l, null);
    }

    public static String applovin(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String appmetrica(String str, int i, char c) {
        return str + i + c;
    }

    public static C10814l billing(InterfaceC0048l interfaceC0048l) {
        return (C10814l) interfaceC0048l.smaato(InterfaceC0048l.f915l, null);
    }

    public static int crashlytics(InterfaceC0048l interfaceC0048l, Size size) {
        Map map = (Map) interfaceC0048l.smaato(InterfaceC0048l.f930l, null);
        if (map == null || !map.containsKey(size)) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static /* synthetic */ String m3419extends(int i) {
        if (i == 1) {
            return "NOT_INITIALIZED";
        }
        if (i == 2) {
            return "INITIALIZING";
        }
        if (i == 3) {
            return "PENDING_RELEASE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "RELEASED";
        }
        return "READY";
    }

    public static int firebase(InterfaceC0048l interfaceC0048l) {
        return ((Integer) interfaceC0048l.smaato(InterfaceC0048l.f920l, 0)).intValue();
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static /* synthetic */ String m3420for(int i) {
        if (i == 1) {
            return "ACTIVE_STREAMING";
        }
        if (i != 2) {
            return i != 3 ? "null" : "INACTIVE";
        }
        return "ACTIVE_NON_STREAMING";
    }

    public static void inmobi(int i, AbstractC7188l abstractC7188l, C3631l c3631l, String str) {
        abstractC7188l.billing(c3631l, Integer.valueOf(i));
        c3631l.isVip(str);
    }

    public static EnumC18632l isPro(InterfaceC0048l interfaceC0048l) {
        EnumC18632l enumC18632l = (EnumC18632l) interfaceC0048l.smaato(InterfaceC0048l.f926l, EnumC18632l.DEFAULT);
        Objects.requireNonNull(enumC18632l);
        return enumC18632l;
    }

    public static int isVip(C11090l c11090l, int i, int i2) {
        return (c11090l.hashCode() + i) * i2;
    }

    public static C9192l license(C11250l c11250l) {
        View view = c11250l.f22673l;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        InterfaceC18382l interfaceC18382lSignature = Signature(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (interfaceC18382lSignature == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        InterfaceC18382l interfaceC18382lSignature2 = Signature(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (interfaceC18382lSignature2 == null) {
            return null;
        }
        return new C9192l(interfaceC18382lSignature, interfaceC18382lSignature2);
    }

    public static EnumC11949l loadAd(InterfaceC0048l interfaceC0048l) {
        return (EnumC11949l) interfaceC0048l.adcel(InterfaceC0048l.f919l);
    }

    public static String metrica(InterfaceC0048l interfaceC0048l, String str) {
        return (String) interfaceC0048l.smaato(InterfaceC15273l.f29871l, str);
    }

    public static int mopub(InterfaceC0048l interfaceC0048l) {
        return ((Integer) interfaceC0048l.smaato(InterfaceC0048l.f918l, 0)).intValue();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static /* synthetic */ String m3421native(int i) {
        switch (i) {
            case 1:
                return "RLM_TYPE_NULL";
            case 2:
                return "RLM_TYPE_INT";
            case 3:
                return "RLM_TYPE_BOOL";
            case 4:
                return "RLM_TYPE_STRING";
            case 5:
                return "RLM_TYPE_BINARY";
            case 6:
                return "RLM_TYPE_TIMESTAMP";
            case 7:
                return "RLM_TYPE_FLOAT";
            case 8:
                return "RLM_TYPE_DOUBLE";
            case 9:
                return "RLM_TYPE_DECIMAL128";
            case 10:
                return "RLM_TYPE_OBJECT_ID";
            case 11:
                return "RLM_TYPE_LINK";
            case 12:
                return "RLM_TYPE_UUID";
            case 13:
                return "RLM_TYPE_LIST";
            case 14:
                return "RLM_TYPE_DICTIONARY";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static /* synthetic */ void m3422package(C18389l c18389l) throws Exception {
        if (c18389l instanceof AutoCloseable) {
            c18389l.close();
        } else if (c18389l instanceof ExecutorService) {
            AbstractC14238l.ads();
        } else {
            C11983l.crashlytics();
        }
    }

    public static String premium(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static /* synthetic */ String m3423private(int i) {
        if (i == 1) {
            return "INVARIANT";
        }
        if (i != 2) {
            return i != 3 ? "null" : "OUT_VARIANCE";
        }
        return "IN_VARIANCE";
    }

    public static final boolean pro(int i) {
        return !AbstractC3534l.yandex();
    }

    public static C10814l purchase(InterfaceC0048l interfaceC0048l) {
        return (C10814l) interfaceC0048l.adcel(InterfaceC0048l.f915l);
    }

    public static Range remoteconfig(InterfaceC0048l interfaceC0048l, Range range) {
        return (Range) interfaceC0048l.smaato(InterfaceC0048l.f924l, range);
    }

    public static ClassCastException signatures(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static C3693l smaato(InterfaceC0048l interfaceC0048l) {
        C3693l c3693l = (C3693l) interfaceC0048l.smaato(InterfaceC0048l.f916l, new C3693l());
        Objects.requireNonNull(c3693l);
        return c3693l;
    }

    public static int startapp(InterfaceC0048l interfaceC0048l) {
        return ((Integer) interfaceC0048l.smaato(InterfaceC0048l.f921l, 0)).intValue();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static /* synthetic */ void m3424strictfp(Object obj) {
        if (obj == null) {
            return;
        }
        C18725l.loadAd();
    }

    public static int subs(InterfaceC0048l interfaceC0048l) {
        return ((Integer) interfaceC0048l.smaato(InterfaceC0048l.f925l, 0)).intValue();
    }

    public static boolean subscription(InterfaceC0048l interfaceC0048l) {
        return ((Boolean) interfaceC0048l.smaato(InterfaceC0048l.f929l, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static /* synthetic */ void m3425synchronized(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            AbstractC14238l.vip((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            C11983l.crashlytics();
        }
    }

    public static InterfaceC12750l tapsense(InterfaceC12750l interfaceC12750l, InterfaceC12750l interfaceC12750l2) {
        boolean z = interfaceC12750l2 instanceof C16686l;
        if (!z || !(interfaceC12750l instanceof C16686l)) {
            if (!z || (interfaceC12750l instanceof C16686l)) {
                return (z || !(interfaceC12750l instanceof C16686l)) ? interfaceC12750l2.crashlytics(new C5767l(24, interfaceC12750l)) : interfaceC12750l;
            }
            return interfaceC12750l2;
        }
        C16686l c16686l = (C16686l) interfaceC12750l2;
        AbstractC17404l abstractC17404l = c16686l.yandex;
        float f = c16686l.loadAd;
        if (Float.isNaN(f)) {
            f = ((C16686l) interfaceC12750l).loadAd;
        }
        return new C16686l(abstractC17404l, f);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static boolean m3426throw(C17735l c17735l) {
        Iterator it = c17735l.crashlytics(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).loadAd()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static void m3427throws(long j, AbstractC7188l abstractC7188l, C3631l c3631l, String str) {
        abstractC7188l.billing(c3631l, Long.valueOf(j));
        c3631l.isVip(str);
    }

    public static String vip(InterfaceC0048l interfaceC0048l) {
        return (String) interfaceC0048l.adcel(InterfaceC15273l.f29871l);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static void m3428volatile(boolean z, AbstractC7188l abstractC7188l, C3631l c3631l, String str) {
        abstractC7188l.billing(c3631l, Boolean.valueOf(z));
        c3631l.isVip(str);
    }

    public static Executor yandex(InterfaceC0491l interfaceC0491l, ExecutorC0877l executorC0877l) {
        return (Executor) interfaceC0491l.smaato(InterfaceC0491l.f1804l, executorC0877l);
    }
}
