package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.LinkedHashMap;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؒؐۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0761l {
    public final C11561l yandex = AbstractC1805l.crashlytics(new C8203l(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code duplicated, block: B:64:0x0085  */
    /* JADX WARN: Code duplicated, block: B:73:0x009c  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ad  */
    public static void loadAd(C0761l c0761l, C6558l c6558l, C7514l c7514l, C1799l c1799l, C12468l c12468l, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        List list4;
        List list5;
        List list6;
        C6558l c6558l2 = (i & 1) != 0 ? null : c6558l;
        C7514l c7514l2 = (i & 2) != 0 ? null : c7514l;
        C1799l c1799l2 = (i & 4) != 0 ? null : c1799l;
        C12468l c12468l2 = (i & 8) != 0 ? null : c12468l;
        List list7 = (i & 16) != 0 ? null : list;
        List list8 = (i & 32) != 0 ? null : list2;
        List list9 = (i & 64) != 0 ? null : list3;
        Boolean bool4 = (i & 128) != 0 ? null : bool;
        Boolean bool5 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : bool2;
        Boolean bool6 = (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : bool3;
        C11561l c11561l = c0761l.yandex;
        while (true) {
            Object obj = c11561l.yandex;
            C8203l c8203l = (C8203l) obj;
            C6558l c6558l3 = c6558l2 == null ? c8203l.yandex : c6558l2;
            C7514l c7514l3 = c7514l2 == null ? c8203l.loadAd : c7514l2;
            C1799l c1799l3 = c1799l2 == null ? c8203l.crashlytics : c1799l2;
            Boolean bool7 = bool6;
            C12468l c12468l3 = c12468l2 == null ? c8203l.amazon : c12468l2;
            if (list7 == null) {
                list4 = c8203l.purchase;
            } else {
                list4 = list7.isEmpty() ? null : list7;
                if (list4 == null) {
                    list4 = c8203l.purchase;
                }
            }
            if (list8 == null) {
                list5 = c8203l.billing;
            } else {
                list5 = list8.isEmpty() ? null : list8;
                if (list5 == null) {
                    list5 = c8203l.billing;
                }
            }
            if (list9 == null) {
                list6 = c8203l.mopub;
            } else {
                list6 = list9.isEmpty() ? null : list9;
                if (list6 == null) {
                    list6 = c8203l.mopub;
                }
            }
            Boolean bool8 = bool4 == null ? c8203l.admob : bool4;
            Boolean bool9 = bool5 == null ? c8203l.subs : bool5;
            Boolean bool10 = bool7 == null ? c8203l.isPro : bool7;
            c8203l.getClass();
            if (c11561l.yandex(obj, new C8203l(c6558l3, c7514l3, c1799l3, c12468l3, list4, list5, list6, bool8, bool9, bool10))) {
                return;
            } else {
                bool6 = bool7;
            }
        }
    }

    public final LinkedHashMap yandex() {
        C8203l c8203l = (C8203l) this.yandex.yandex;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C6558l c6558l = c8203l.yandex;
        if (c6558l != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(c6558l.yandex));
        }
        C7514l c7514l = c8203l.loadAd;
        if (c7514l != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(c7514l.yandex));
        }
        C1799l c1799l = c8203l.crashlytics;
        if (c1799l != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(c1799l.yandex));
        }
        C12468l c12468l = c8203l.amazon;
        if (c12468l != null) {
            linkedHashMap.put(CaptureRequest.FLASH_MODE, Integer.valueOf(c12468l.yandex));
        }
        List list = c8203l.purchase;
        if (list != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_REGIONS, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = c8203l.billing;
        if (list2 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AF_REGIONS, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = c8203l.mopub;
        if (list3 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_REGIONS, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = c8203l.admob;
        if (bool != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AE_LOCK, bool);
        }
        Boolean bool2 = c8203l.isPro;
        if (bool2 != null) {
            linkedHashMap.put(CaptureRequest.CONTROL_AWB_LOCK, bool2);
        }
        return linkedHashMap;
    }
}
