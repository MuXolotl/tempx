package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lُؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10814l {
    public static final List isPro = Arrays.asList(1, 5, 3);
    public final int admob;
    public final List amazon;
    public final InterfaceC1837l billing;
    public final List crashlytics;
    public final C14113l loadAd;
    public final C0665l mopub;
    public final List purchase;
    public final InputConfiguration subs;
    public final ArrayList yandex;

    public C10814l(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C0665l c0665l, InterfaceC1837l interfaceC1837l, InputConfiguration inputConfiguration, int i, C14113l c14113l) {
        this.yandex = arrayList;
        this.crashlytics = DesugarCollections.unmodifiableList(arrayList2);
        this.amazon = DesugarCollections.unmodifiableList(arrayList3);
        this.purchase = DesugarCollections.unmodifiableList(arrayList4);
        this.billing = interfaceC1837l;
        this.mopub = c0665l;
        this.subs = inputConfiguration;
        this.admob = i;
        this.loadAd = c14113l;
    }

    public static C10814l yandex() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C5104l c5104lCrashlytics = C5104l.crashlytics();
        ArrayList arrayList5 = new ArrayList();
        C12815l c12815lYandex = C12815l.yandex();
        ArrayList arrayList6 = new ArrayList(hashSet);
        C7420l c7420lYandex = C7420l.yandex(c5104lCrashlytics);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        C12920l c12920l = C12920l.loadAd;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c12815lYandex.yandex;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new C10814l(arrayList, arrayList2, arrayList3, arrayList4, new C0665l(arrayList6, c7420lYandex, -1, arrayList7, new C12920l(arrayMap)), null, null, 0, null);
    }

    public final List loadAd() {
        ArrayList arrayList = new ArrayList();
        for (C14113l c14113l : this.yandex) {
            arrayList.add(c14113l.yandex);
            Iterator it = c14113l.loadAd.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC0958l) it.next());
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
