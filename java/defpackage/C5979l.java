package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lؘٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5979l {
    public final C7972l crashlytics;
    public final LinkedHashMap loadAd = new LinkedHashMap();
    public final C3111l yandex;

    public C5979l(StreamConfigurationMap streamConfigurationMap, C3111l c3111l) {
        this.yandex = c3111l;
        new LinkedHashMap();
        new LinkedHashMap();
        this.crashlytics = Build.VERSION.SDK_INT >= 34 ? new C9613l(26, streamConfigurationMap) : new C7972l(26, streamConfigurationMap);
    }

    public final Size[] yandex(int i) {
        int i2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.loadAd;
        Size[] sizeArrMo2222case = null;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        try {
            sizeArrMo2222case = this.crashlytics.mo2222case(i);
        } catch (Throwable th) {
            AbstractC5088l.Signature("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
        }
        if (sizeArrMo2222case == null || sizeArrMo2222case.length == 0) {
            AbstractC5088l.tapsense("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return sizeArrMo2222case;
        }
        C3111l c3111l = this.yandex;
        c3111l.getClass();
        ArrayList arrayList = new ArrayList(new C14743l(sizeArrMo2222case, false));
        if (c3111l.crashlytics != null) {
            Size[] sizeArr2 = (i == 34 && (Build.MANUFACTURER.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length != 0) {
                AbstractC3984l.pro(arrayList, sizeArr2);
            }
        }
        InterfaceC5389l interfaceC5389l = c3111l.yandex;
        if (interfaceC5389l == null || c3111l.loadAd == null) {
            i2 = 0;
        } else {
            String str = ((C10861l) interfaceC5389l).f21960l;
            boolean zFirebase = AbstractC4311l.firebase();
            i2 = 0;
            Collection<?> collectionRemoteconfig = C2580l.f5619l;
            if (zFirebase) {
                if (str.equals("0") && i == 256) {
                    collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(4160, 3120), new Size(4000, 3000));
                }
            } else if (AbstractC4311l.smaato()) {
                if (str.equals("0") && i == 256) {
                    collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(4160, 3120), new Size(4000, 3000));
                }
            } else if (AbstractC4311l.subs()) {
                if (str.equals("0") && (i == 34 || i == 35)) {
                    collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(720, 720), new Size(400, 400));
                }
            } else if (AbstractC4311l.startapp()) {
                if (str.equals("0")) {
                    if (i == 34) {
                        collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                }
            } else if (AbstractC4311l.metrica()) {
                if (str.equals("0")) {
                    if (i == 34) {
                        collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    } else if (i == 35) {
                        collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                }
            } else if (AbstractC4311l.remoteconfig()) {
                if (str.equals("0") && i == 256) {
                    collectionRemoteconfig = Collections.singletonList(new Size(9280, 6944));
                }
            } else if (AbstractC4311l.vip()) {
                if (i == 35) {
                    collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440));
                }
            } else if (AbstractC4311l.isPro()) {
                if (i == 35) {
                    collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448));
                }
            } else if (!AbstractC4311l.adcel()) {
                AbstractC5088l.tapsense("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
            } else if (str.equals("1") && i == 35) {
                collectionRemoteconfig = AbstractC14055l.remoteconfig(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(1824, 712));
            }
            Collection<?> collection = collectionRemoteconfig;
            if (!collection.isEmpty()) {
                arrayList.removeAll(collection);
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC5088l.tapsense("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr3 = (Size[]) arrayList.toArray(new Size[i2]);
        linkedHashMap.put(Integer.valueOf(i), sizeArr3);
        return (Size[]) sizeArr3.clone();
    }
}
