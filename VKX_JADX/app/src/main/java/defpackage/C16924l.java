package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lٗؗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16924l {
    public static final /* synthetic */ InterfaceC13922l[] isPro = {new C0544l(C16924l.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new C0544l(C16924l.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
    public final C2278l admob;
    public final C0098l amazon;
    public final C18028l billing;
    public final LinkedHashMap crashlytics;
    public final LinkedHashMap loadAd;
    public final C2278l mopub;
    public final C0098l purchase;
    public final /* synthetic */ AbstractC2842l subs;
    public final LinkedHashMap yandex;

    public C16924l(AbstractC2842l abstractC2842l, List list, List list2, List list3) {
        this.subs = abstractC2842l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C3498l c3498lFirebase = AbstractC18719l.firebase((InterfaceC3588l) abstractC2842l.loadAd.f15737l, ((C14036l) ((AbstractC14080l) obj)).f27374l);
            Object arrayList = linkedHashMap.get(c3498lFirebase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c3498lFirebase, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.yandex = yandex(linkedHashMap);
        AbstractC2842l abstractC2842l2 = this.subs;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            C3498l c3498lFirebase2 = AbstractC18719l.firebase((InterfaceC3588l) abstractC2842l2.loadAd.f15737l, ((C13146l) ((AbstractC14080l) obj2)).f25736l);
            Object arrayList2 = linkedHashMap2.get(c3498lFirebase2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(c3498lFirebase2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.loadAd = yandex(linkedHashMap2);
        ((C17334l) ((C0511l) this.subs.loadAd.f15738l).crashlytics).getClass();
        AbstractC2842l abstractC2842l3 = this.subs;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            C3498l c3498lFirebase3 = AbstractC18719l.firebase((InterfaceC3588l) abstractC2842l3.loadAd.f15737l, ((C1512l) ((AbstractC14080l) obj3)).f3775l);
            Object arrayList3 = linkedHashMap3.get(c3498lFirebase3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(c3498lFirebase3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.crashlytics = yandex(linkedHashMap3);
        int i = 0;
        this.amazon = ((C16412l) ((C0511l) this.subs.loadAd.f15738l).yandex).loadAd(new C12649l(this, i));
        int i2 = 1;
        this.purchase = ((C16412l) ((C0511l) this.subs.loadAd.f15738l).yandex).loadAd(new C12649l(this, i2));
        this.billing = ((C16412l) ((C0511l) this.subs.loadAd.f15738l).yandex).crashlytics(new C12649l(this, 2));
        AbstractC2842l abstractC2842l4 = this.subs;
        C16412l c16412l = (C16412l) ((C0511l) abstractC2842l4.loadAd.f15738l).yandex;
        C18635l c18635l = new C18635l(this, abstractC2842l4, i);
        c16412l.getClass();
        this.mopub = new C2278l(c16412l, c18635l);
        AbstractC2842l abstractC2842l5 = this.subs;
        C16412l c16412l2 = (C16412l) ((C0511l) abstractC2842l5.loadAd.f15738l).yandex;
        C18635l c18635l2 = new C18635l(this, abstractC2842l5, i2);
        c16412l2.getClass();
        this.admob = new C2278l(c16412l2, c18635l2);
    }

    public static LinkedHashMap yandex(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC14080l> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
            for (AbstractC14080l abstractC14080l : iterable) {
                int iCrashlytics = abstractC14080l.crashlytics();
                int iAds = C11522l.ads(iCrashlytics) + iCrashlytics;
                if (iAds > 4096) {
                    iAds = 4096;
                }
                C11522l c11522lM3096volatile = C11522l.m3096volatile(byteArrayOutputStream, iAds);
                c11522lM3096volatile.m3130while(iCrashlytics);
                abstractC14080l.billing(c11522lM3096volatile);
                c11522lM3096volatile.m3104default();
                arrayList.add(Unit.INSTANCE);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
