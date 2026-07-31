package defpackage;

import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.loadAd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lؔؑۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2330l {
    public final boolean admob;
    public final LinkedHashMap amazon;
    public final LinkedHashMap billing;
    public final ArrayList crashlytics;
    public final long loadAd;
    public final C0717l mopub;
    public final LinkedHashMap purchase;
    public final InterfaceC1388l subs;
    public final String yandex;

    public C2330l(NativePointer nativePointer, String str, long j, InterfaceC13226l interfaceC13226l) {
        Map mapCrashlytics;
        C8195l c8195l;
        this.yandex = str;
        this.loadAd = j;
        Object obj = null;
        this.subs = interfaceC13226l != null ? interfaceC13226l.loadAd() : null;
        C7507l c7507lLoadAd = loadAd.loadAd(nativePointer, j);
        List<C11085l> listAmazon = loadAd.amazon(nativePointer, c7507lLoadAd.purchase, c7507lLoadAd.crashlytics + c7507lLoadAd.amazon);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listAmazon, 10));
        for (C11085l c11085l : listAmazon) {
            arrayList.add(new C0717l(c11085l, (interfaceC13226l == null || (mapCrashlytics = interfaceC13226l.crashlytics()) == null || (c8195l = (C8195l) mapCrashlytics.get(c11085l.yandex)) == null) ? null : (InterfaceC1835l) c8195l.f17097l));
        }
        this.crashlytics = arrayList;
        for (Object obj2 : arrayList) {
            if (((C0717l) obj2).admob) {
                obj = obj2;
                break;
            }
        }
        this.mopub = (C0717l) obj;
        this.admob = c7507lLoadAd.mopub;
        ArrayList arrayList2 = this.crashlytics;
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(arrayList2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase < 16 ? 16 : iFirebase);
        for (Object obj3 : arrayList2) {
            linkedHashMap.put(((C0717l) obj3).loadAd, obj3);
        }
        ArrayList arrayList3 = this.crashlytics;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            if (!((C0717l) obj4).crashlytics.equals("")) {
                arrayList4.add(obj4);
            }
        }
        int iFirebase2 = AbstractC2200l.firebase(AbstractC14055l.billing(arrayList4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iFirebase2 < 16 ? 16 : iFirebase2);
        for (Object obj5 : arrayList4) {
            linkedHashMap2.put(((C0717l) obj5).crashlytics, obj5);
        }
        this.purchase = AbstractC8676l.metrica(linkedHashMap, linkedHashMap2);
        ArrayList arrayList5 = this.crashlytics;
        int iFirebase3 = AbstractC2200l.firebase(AbstractC14055l.billing(arrayList5, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iFirebase3 < 16 ? 16 : iFirebase3);
        for (Object obj6 : arrayList5) {
            linkedHashMap3.put(new C4272l(((C0717l) obj6).amazon), obj6);
        }
        this.billing = linkedHashMap3;
        ArrayList arrayList6 = this.crashlytics;
        int iFirebase4 = AbstractC2200l.firebase(AbstractC14055l.billing(arrayList6, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iFirebase4 >= 16 ? iFirebase4 : 16);
        for (Object obj7 : arrayList6) {
            linkedHashMap4.put(((C0717l) obj7).yandex, obj7);
        }
        this.amazon = linkedHashMap4;
    }

    public final C0717l loadAd(String str) {
        C0717l c0717l = (C0717l) this.purchase.get(str);
        if (c0717l != null) {
            return c0717l;
        }
        C8339l.metrica(AbstractC14814l.ads("Schema for type '", this.yandex, "' doesn't contain a property named '", str, "'"));
        return null;
    }

    public final C0717l yandex(long j) {
        return (C0717l) this.billing.get(new C4272l(j));
    }
}
