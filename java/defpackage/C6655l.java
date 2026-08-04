package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙٟۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6655l {
    public Set admob;
    public final C1276l amazon;
    public final C15855l billing;
    public final C13568l crashlytics;
    public final AtomicBoolean isPro;
    public final C7542l loadAd;
    public final C8688l mopub;
    public final C7518l purchase;
    public final Object subs;
    public final C8688l yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, lؙٟۥ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    public C6655l(C8688l c8688l, Context context, C13316l c13316l, C3797l c3797l, C7542l c7542l, C13568l c13568l, C1276l c1276l) {
        ?? arrayList;
        this.yandex = c8688l;
        this.loadAd = c7542l;
        this.crashlytics = c13568l;
        this.amazon = c1276l;
        this.purchase = new C7518l((C4723l) c8688l.getValue(), ((C4723l) c8688l.getValue()).loadAd());
        C8688l c8688l2 = new C8688l(new C17026l(context, c13316l, this, c3797l, 3));
        this.mopub = c8688l2;
        this.admob = C5746l.f12138l;
        this.subs = new Object();
        this.isPro = new AtomicBoolean(false);
        ArrayList arrayListCrashlytics = AbstractC14814l.crashlytics(((C9377l) c8688l2.getValue()).yandex());
        if (arrayListCrashlytics != null) {
            arrayList = new ArrayList(AbstractC14055l.billing(arrayListCrashlytics, 10));
            Iterator it = arrayListCrashlytics.iterator();
            while (it.hasNext()) {
                arrayList.add(((C10160l) it.next()).yandex);
            }
        } else {
            arrayList = C2580l.f5619l;
        }
        C8084l c8084l = ((C1663l) ((C4723l) this.yandex.getValue()).loadAd().yandex()).loadAd.firebase;
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC5103l.billing(c13316l.yandex));
        C15855l c15855l = new C15855l();
        c15855l.f31108l = new Object();
        c15855l.f31105l = new CopyOnWriteArrayList();
        c15855l.f31111l = null;
        c15855l.f31109l = false;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C12371l.crashlytics((String) it2.next(), null, null));
        }
        c15855l.f31112l = arrayList2;
        c15855l.f31114l = c8084l;
        c15855l.f31106l = c18662lYandex;
        c15855l.f31107l = new AtomicBoolean(false);
        c15855l.f31110l = (CameraManager) context.getSystemService("camera");
        this.billing = c15855l;
        amazon(arrayList);
    }

    public final void amazon(List list) {
        if (this.isPro.get()) {
            return;
        }
        LinkedHashSet linkedHashSetYandex = yandex(list);
        synchronized (this.subs) {
            try {
                if (this.isPro.get()) {
                    return;
                }
                if (AbstractC8576l.yandex(this.admob, linkedHashSetYandex)) {
                    return;
                }
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Updated available camera list: " + this.admob + " -> " + linkedHashSetYandex);
                }
                this.admob = linkedHashSetYandex;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC18690l crashlytics(String str) throws C12868l {
        if (this.isPro.get()) {
            throw new C12868l("CameraFactory has been shut down.");
        }
        C9377l c9377l = ((C9377l) this.mopub.getValue()).loadAd;
        C10160l.yandex(str);
        return (InterfaceC18690l) new C13416l(c9377l, new C17927l(str, 2), this.crashlytics).advert.get();
    }

    public final Set loadAd() {
        synchronized (this.subs) {
            if (this.isPro.get()) {
                return C5746l.f12138l;
            }
            return new LinkedHashSet(this.admob);
        }
    }

    public final LinkedHashSet yandex(List list) throws C7410l {
        String strBilling;
        C8688l c8688l = this.mopub;
        C9377l c9377l = (C9377l) c8688l.getValue();
        List<String> listM4213const = AbstractC16901l.m4213const(list);
        C13568l c13568l = this.crashlytics;
        try {
            ArrayList arrayList = new ArrayList();
            C7615l c7615lYandex = c9377l.yandex();
            C7542l c7542l = this.loadAd;
            if (c7542l != null) {
                try {
                    strBilling = AbstractC17291l.billing(c7615lYandex, c7542l.loadAd());
                } catch (IllegalStateException e) {
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e);
                    }
                    strBilling = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listM4213const) {
                    if (!AbstractC8576l.yandex(str, strBilling)) {
                        C9377l c9377l2 = c9377l.loadAd;
                        C10160l.yandex(str);
                        arrayList2.add(((InterfaceC18690l) new C13416l(c9377l2, new C17927l(str, 2), c13568l).advert.get()).adcel());
                    }
                }
                Iterator it = c7542l.yandex(arrayList2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC15879l) it.next()).mopub());
                }
                listM4213const = arrayList;
            }
            C7615l c7615lYandex2 = ((C9377l) c8688l.getValue()).yandex();
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : listM4213const) {
                if (AbstractC8576l.yandex(str2, "0") || AbstractC8576l.yandex(str2, "1")) {
                    arrayList3.add(str2);
                } else if (AbstractC3957l.loadAd(c7615lYandex2, str2)) {
                    arrayList3.add(str2);
                } else if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e2) {
            if (AbstractC5088l.smaato()) {
                Log.e("CXCP", "Error while accessing info about cameras.", e2);
            }
            throw new C7410l(e2);
        }
    }
}
