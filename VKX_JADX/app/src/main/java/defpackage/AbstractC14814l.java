package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureResult;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* JADX INFO: renamed from: lؘُٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC14814l {
    public static StringBuilder Signature(String str, InterfaceC2224l interfaceC2224l, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(interfaceC2224l);
        sb.append(str2);
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void ad(C11751l c11751l) throws Exception {
        if (c11751l instanceof AutoCloseable) {
            c11751l.close();
        } else if (c11751l instanceof ExecutorService) {
            AbstractC14238l.vip((ExecutorService) c11751l);
        } else {
            C11983l.crashlytics();
        }
    }

    public static String adcel(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static int admob(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static String ads(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static /* synthetic */ void advert(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            AbstractC14238l.vip((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
            return;
        }
        if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
            return;
        }
        if (obj instanceof DrmManagerClient) {
            ((DrmManagerClient) obj).release();
        } else if (obj instanceof ContentProviderClient) {
            ((ContentProviderClient) obj).release();
        } else {
            C11983l.crashlytics();
        }
    }

    public static InterfaceC5389l amazon(C7615l c7615l, String str) {
        return ((C1663l) c7615l.yandex()).crashlytics.purchase(str);
    }

    public static /* synthetic */ String applovin(int i) {
        if (i == 1) {
            return "PENDING_OPEN";
        }
        if (i == 2) {
            return "OPENING";
        }
        if (i == 3) {
            return "OPEN";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CLOSED";
        }
        return "CLOSING";
    }

    public static /* synthetic */ String appmetrica(int i) {
        if (i == 1) {
            return "PENDING";
        }
        if (i == 2) {
            return "CREATING";
        }
        if (i == 3) {
            return "CREATED";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CLOSED";
        }
        return "CLOSING";
    }

    public static /* synthetic */ boolean billing(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw null;
    }

    public static ArrayList crashlytics(C7615l c7615l) {
        ArrayList arrayListAmazon;
        C14232l c14232l = ((C1663l) c7615l.yandex()).loadAd;
        synchronized (c14232l.billing) {
            arrayListAmazon = c14232l.mopub;
        }
        if (arrayListAmazon == null) {
            arrayListAmazon = c14232l.amazon();
        }
        if (arrayListAmazon == null) {
            Log.w("CXCP", "Failed to load cameraIds from " + ((Object) C1594l.yandex("CXCP-Camera2")));
        }
        return arrayListAmazon;
    }

    public static Object firebase(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static C9426l inmobi(C10069l c10069l, long j, int i) {
        Map map;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        long j2 = (i & 32) != 0 ? 3000000000L : j;
        if (c10069l.f20544l.yandex()) {
            C8936l.firebase(c10069l, " after close.", "Cannot call unlock3A on ");
            return null;
        }
        C10013l c10013l = c10069l.f20542l;
        Long l = new Long(j2);
        C9426l c9426l = C10013l.vip;
        C18548l c18548l = c10013l.yandex;
        C11905l c11905l = InterfaceC5389l.admob;
        InterfaceC5389l interfaceC5389l = c10013l.loadAd;
        c11905l.getClass();
        Boolean bool4 = !C11905l.yandex(interfaceC5389l) ? null : bool;
        if (!AbstractC8576l.yandex(bool2, bool) && !AbstractC8576l.yandex(bool4, bool) && !AbstractC8576l.yandex(bool3, bool)) {
            return AbstractC15929l.yandex(new C6346l(0, null));
        }
        if (c18548l.loadAd.mopub() == null) {
            return c9426l;
        }
        if (AbstractC8576l.yandex(bool4, bool)) {
            Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
            if (!c18548l.purchase(C10013l.remoteconfig)) {
                Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                return c9426l;
            }
            C0761l.loadAd(c10013l.crashlytics, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
        }
        boolean zYandex = AbstractC8576l.yandex(bool2, bool);
        boolean zYandex2 = AbstractC8576l.yandex(bool4, bool);
        boolean zYandex3 = AbstractC8576l.yandex(bool3, bool);
        if (zYandex || zYandex2 || zYandex3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (zYandex) {
                linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, C10013l.metrica);
            }
            if (zYandex2) {
                linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, C10013l.startapp);
            }
            if (zYandex3) {
                linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, C10013l.adcel);
            }
            map = linkedHashMap;
        } else {
            map = C14054l.f27396l;
        }
        C4418l c4418l = new C4418l(new C7072l(1, map), 60, l);
        c10013l.amazon.amazon(c4418l);
        Boolean bool5 = AbstractC8576l.yandex(bool2, bool) ? Boolean.FALSE : null;
        Boolean bool6 = AbstractC8576l.yandex(bool3, bool) ? Boolean.FALSE : null;
        if (bool5 != null || bool6 != null) {
            Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool5 + ", awbLock=" + bool6);
            C0761l.loadAd(c10013l.crashlytics, null, null, null, null, null, null, null, bool5, null, bool6, 383);
        }
        c18548l.billing(c10013l.crashlytics.yandex());
        return c4418l.f8995l;
    }

    public static C2403l isPro(C6956l c6956l) {
        C2403l c2403l = new C2403l();
        c6956l.m2147try(c2403l);
        return c2403l;
    }

    public static void isVip(String str, C9426l c9426l) {
        c9426l.m2649l(new C6711l(str));
    }

    public static StringBuilder license(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static final boolean loadAd(int i) {
        return i == 6 || i == 4;
    }

    public static String metrica(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static /* synthetic */ boolean mopub(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ String premium(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static /* synthetic */ void pro(C11878l c11878l) throws Exception {
        if (c11878l instanceof AutoCloseable) {
            c11878l.close();
        } else if (c11878l instanceof ExecutorService) {
            AbstractC14238l.ads();
        } else {
            C11983l.crashlytics();
        }
    }

    public static Set purchase(C7615l c7615l) {
        C14232l c14232l = ((C1663l) c7615l.yandex()).loadAd;
        if (Build.VERSION.SDK_INT < 30) {
            c14232l.getClass();
            return C5746l.f12138l;
        }
        synchronized (c14232l.billing) {
        }
        try {
            Set setAmazon = AbstractC5121l.amazon((CameraManager) c14232l.yandex.get());
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + setAmazon);
            Set<Set> set = setAmazon;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(set2, 10));
                for (String str : set2) {
                    C10160l.yandex(str);
                    arrayList2.add(new C10160l(str));
                }
                arrayList.add(AbstractC16901l.m4229l(arrayList2));
            }
            return AbstractC16901l.m4229l(arrayList);
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
            return null;
        }
    }

    public static String remoteconfig(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ String signatures(int i) {
        if (i == 1) {
            return "ENABLED";
        }
        if (i == 2) {
            return "READ_ONLY";
        }
        if (i != 3) {
            return i != 4 ? "null" : "DISABLED";
        }
        return "WRITE_ONLY";
    }

    public static String smaato(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String startapp(String str, String str2) {
        return str + str2;
    }

    public static int subs(Catalog2Layout catalog2Layout, int i, int i2) {
        return (catalog2Layout.hashCode() + i) * i2;
    }

    public static StringBuilder subscription(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder tapsense(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static InterfaceC1142l m3895throws(C10069l c10069l, C6558l c6558l, C7514l c7514l, C1799l c1799l, List list, List list2, List list3, int i) {
        C6558l c6558l2 = (i & 1) != 0 ? null : c6558l;
        C7514l c7514l2 = (i & 2) != 0 ? null : c7514l;
        C1799l c1799l2 = (i & 4) != 0 ? null : c1799l;
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        if (!c10069l.f20544l.yandex()) {
            return C10013l.loadAd(c10069l.f20542l, c6558l2, c7514l2, c1799l2, null, list4, list5, list6, 8);
        }
        C8936l.firebase(c10069l, " after close.", "Cannot call update3A on ");
        return null;
    }

    public static String vip(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static boolean yandex(InterfaceC15879l interfaceC15879l, C1869l c1869l, C5008l c5008l) {
        Iterator it = ((LinkedHashSet) c5008l.f10245l).iterator();
        while (it.hasNext()) {
            ((AbstractC5295l) it.next()).getClass();
        }
        try {
            AbstractC17943l.crashlytics(interfaceC15879l, c1869l, c5008l);
            return true;
        } catch (IllegalArgumentException | C14687l e) {
            AbstractC5088l.loadAd("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
            return false;
        }
    }
}
