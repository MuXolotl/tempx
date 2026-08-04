package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚۛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7518l implements InterfaceC9289l {
    public boolean billing;
    public C2974l crashlytics;
    public int purchase;
    public final C7615l yandex;
    public final Object loadAd = new Object();
    public final ArrayList amazon = new ArrayList();

    public C7518l(C4723l c4723l, C7615l c7615l) {
        this.yandex = c7615l;
    }

    public final void amazon() {
        synchronized (this.loadAd) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [lؚۛٝ] */
    public final void crashlytics(C2974l c2974l) throws C12868l {
        ?? arrayList;
        synchronized (this.loadAd) {
            this.crashlytics = c2974l;
            Unit unit = Unit.INSTANCE;
        }
        ArrayList arrayListCrashlytics = AbstractC14814l.crashlytics(this.yandex);
        if (arrayListCrashlytics != null) {
            arrayList = new ArrayList(AbstractC14055l.billing(arrayListCrashlytics, 10));
            Iterator it = arrayListCrashlytics.iterator();
            while (it.hasNext()) {
                arrayList.add(((C10160l) it.next()).yandex);
            }
        } else {
            arrayList = C2580l.f5619l;
        }
        yandex(arrayList);
    }

    public final int loadAd() {
        int i;
        synchronized (this.loadAd) {
            i = this.purchase;
        }
        return i;
    }

    @Override // defpackage.InterfaceC9289l
    public final void yandex(List list) throws C12868l {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> setPurchase = AbstractC14814l.purchase(this.yandex);
            if (setPurchase == null) {
                setPurchase = C5746l.f12138l;
            }
            for (Set set : setPurchase) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C10160l) it.next()).yandex);
                }
                Set setM4229l = AbstractC16901l.m4229l(arrayList);
                if (list.containsAll(setM4229l)) {
                    List listM4213const = AbstractC16901l.m4213const(set);
                    if (listM4213const.size() >= 2) {
                        String str = ((C10160l) listM4213const.get(0)).yandex;
                        String str2 = ((C10160l) listM4213const.get(1)).yandex;
                        try {
                            if (AbstractC3957l.loadAd(this.yandex, str) && AbstractC3957l.loadAd(this.yandex, str2)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                ((List) linkedHashMap.get(str)).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                ((List) linkedHashMap.get(str2)).add(str);
                            }
                        } catch (C7410l e) {
                            if (AbstractC5088l.metrica()) {
                                Log.w("CXCP", "Skipping incompatible concurrent pair: " + set + " due to " + e.getMessage());
                            }
                        }
                    }
                } else if (AbstractC5088l.metrica()) {
                    Log.w("CXCP", "Failed to retrieve concurrent camera: " + setM4229l + " from " + list);
                }
            }
            synchronized (this.loadAd) {
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e2) {
            throw new C12868l("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }
}
