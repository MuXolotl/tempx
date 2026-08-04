package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lؖؒۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3859l implements InterfaceC10139l {
    public final C13283l loadAd;

    public C3859l(Context context) {
        this.loadAd = C13283l.mopub.crashlytics(context);
        if ((context instanceof Application) && AbstractC5088l.remoteconfig()) {
            Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
        }
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Created UseCaseConfigurationMap");
        }
    }

    @Override // defpackage.InterfaceC10139l
    public final InterfaceC17944l yandex(EnumC11949l enumC11949l, int i) {
        int i2;
        int i3;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Creating config for " + enumC11949l);
        }
        C5104l c5104lCrashlytics = C5104l.crashlytics();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C5104l c5104lCrashlytics2 = C5104l.crashlytics();
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = C12815l.yandex().yandex;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = enumC11949l.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            i2 = 1;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4 && iOrdinal != 5) {
                C18725l.billing();
                return null;
            }
            i2 = 1;
        } else {
            i2 = AbstractC17919l.yandex(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        C6916l c6916l = InterfaceC0048l.f915l;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        C7420l c7420lYandex = C7420l.yandex(c5104lCrashlytics2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        C12920l c12920l = C12920l.loadAd;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str : arrayMap.keySet()) {
            arrayMap2.put(str, arrayMap.get(str));
        }
        c5104lCrashlytics.mopub(c6916l, new C10814l(arrayList5, arrayList6, arrayList7, arrayList8, new C0665l(arrayList9, c7420lYandex, i2, arrayList10, new C12920l(arrayMap2)), null, null, 0, null));
        HashSet hashSet2 = new HashSet();
        C5104l c5104lCrashlytics3 = C5104l.crashlytics();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = C12815l.yandex().yandex;
        int iOrdinal2 = enumC11949l.ordinal();
        if (iOrdinal2 == 0) {
            i3 = i == 2 ? 5 : 2;
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            i3 = 1;
        } else if (iOrdinal2 != 3) {
            if (iOrdinal2 != 4 && iOrdinal2 != 5) {
                C18725l.billing();
                return null;
            }
            i3 = 1;
        } else {
            i3 = AbstractC17919l.yandex(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        C6916l c6916l2 = InterfaceC0048l.f928l;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        C7420l c7420lYandex2 = C7420l.yandex(c5104lCrashlytics3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        C12920l c12920l2 = C12920l.loadAd;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        c5104lCrashlytics.mopub(c6916l2, new C0665l(arrayList12, c7420lYandex2, i3, arrayList13, new C12920l(arrayMap4)));
        c5104lCrashlytics.mopub(InterfaceC0048l.f917l, enumC11949l == EnumC11949l.f23817l ? C7135l.loadAd : C13069l.yandex);
        c5104lCrashlytics.mopub(InterfaceC0048l.f914l, C17511l.yandex);
        EnumC11949l enumC11949l2 = EnumC11949l.f23816l;
        C13283l c13283l = this.loadAd;
        if (enumC11949l == enumC11949l2) {
            c5104lCrashlytics.mopub(InterfaceC4089l.f8425synchronized, c13283l.crashlytics());
        }
        C6916l c6916l3 = InterfaceC4089l.applovin;
        C6096l c6096l = C13283l.mopub;
        c5104lCrashlytics.mopub(c6916l3, Integer.valueOf(c13283l.loadAd(true).getRotation()));
        return C7420l.yandex(c5104lCrashlytics);
    }
}
