package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٍْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C13069l {
    public static final C13069l yandex = new C13069l();

    public void yandex(InterfaceC0048l interfaceC0048l, C9598l c9598l) {
        C0665l c0665lMo250case = interfaceC0048l.mo250case();
        C7420l c7420l = C7420l.f15370l;
        C6916l c6916l = C0665l.billing;
        HashSet hashSet = new HashSet();
        C5104l c5104lCrashlytics = C5104l.crashlytics();
        ArrayList arrayList = new ArrayList();
        C12815l c12815lYandex = C12815l.yandex();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C7420l c7420lYandex = C7420l.yandex(c5104lCrashlytics);
        ArrayList arrayList3 = new ArrayList(arrayList);
        C12920l c12920l = C12920l.loadAd;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c12815lYandex.yandex;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i = -1;
        new C0665l(arrayList2, c7420lYandex, -1, arrayList3, new C12920l(arrayMap));
        if (c0665lMo250case != null) {
            i = c0665lMo250case.crashlytics;
            c9598l.billing(c0665lMo250case.amazon);
            c7420l = c0665lMo250case.loadAd;
            ((C12815l) c9598l.f19554l).yandex.putAll((Map) c0665lMo250case.purchase.yandex);
            Iterator it = DesugarCollections.unmodifiableList(c0665lMo250case.yandex).iterator();
            while (it.hasNext()) {
                ((HashSet) c9598l.f19549l).add((AbstractC0958l) it.next());
            }
        }
        c9598l.f19553l = C5104l.amazon(c7420l);
        c9598l.f19550l = ((Number) interfaceC0048l.smaato(C16443l.f32156l, Integer.valueOf(i))).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) interfaceC0048l.smaato(C16443l.f32152l, null);
        if (captureCallback != null) {
            c9598l.tapsense(new C18505l(captureCallback));
        }
        C3316l c3316l = new C3316l(6);
        interfaceC0048l.inmobi(new C5131l(c3316l, interfaceC0048l, 0));
        c9598l.license(new C5501l(5, C7420l.yandex((C5104l) c3316l.f7072l)));
    }
}
