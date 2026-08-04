package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lؘٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5664l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f12036l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final ArrayList f12037l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final ArrayList f12038l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LinkedHashMap f12039l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7931l f12040l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C17963l f12041l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final LinkedHashMap f12042l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final List f12043l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C11879l f12033l = AbstractC1805l.loadAd(0);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C11879l f12030l = AbstractC1805l.loadAd(0);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C11879l f12034l = AbstractC1805l.loadAd(0);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C11879l f12032l = AbstractC1805l.loadAd(0);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C11879l f12027l = AbstractC1805l.loadAd(0);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final List f12035l = AbstractC14055l.remoteconfig(C15617l.f30509l, C15617l.f30503l);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C15696l f12031l = new C15696l(20);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final List f12028l = AbstractC14055l.remoteconfig(new C10134l(0), new C10134l(34));

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C15696l f12029l = new C15696l(21);

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35, types: [lٓؖؑ] */
    /* JADX WARN: Type inference failed for: r9v41 */
    public C5664l(InterfaceC5389l interfaceC5389l, C7931l c7931l, C6760l c6760l) {
        boolean z;
        C7931l c7931l2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C15617l c15617l;
        ?? r9;
        C13930l c13930l;
        ?? r11;
        Integer num;
        this.f12040l = c7931l;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || c7931l.admob != 0) {
            z = false;
        } else {
            InterfaceC5389l.admob.getClass();
            if (C11905l.loadAd(interfaceC5389l)) {
                z = false;
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                C10861l c10861l = (C10861l) interfaceC5389l;
                Integer num2 = (Integer) c10861l.crashlytics(key);
                if ((num2 != null && num2.intValue() == 0) || (i >= 28 && (num = (Integer) c10861l.crashlytics(key)) != null && num.intValue() == 4)) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = c7931l.crashlytics.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ?? arrayList3 = C2580l.f5619l;
            C15617l c15617l2 = null;
            if (!zHasNext) {
                Iterator it2 = this.f12040l.loadAd.iterator();
                while (it2.hasNext()) {
                    C4069l c4069l = (C4069l) it2.next();
                    for (AbstractC2371l abstractC2371l : c4069l.yandex) {
                        if (!linkedHashMap.containsKey(abstractC2371l)) {
                            C11879l c11879l = f12032l;
                            c11879l.getClass();
                            int iIncrementAndGet = C11879l.loadAd.incrementAndGet(c11879l);
                            Size size = abstractC2371l.yandex;
                            int i2 = abstractC2371l.loadAd;
                            String str = abstractC2371l.crashlytics;
                            String str2 = str == null ? this.f12040l.yandex : str;
                            Integer num3 = (Integer) linkedHashMap3.get(c4069l);
                            if (z) {
                                if (abstractC2371l instanceof C13930l) {
                                    c13930l = (C13930l) abstractC2371l;
                                } else {
                                    r9 = c15617l2;
                                }
                                if (r9 != 0) {
                                    r9 = c13930l;
                                    c15617l = r9.subs;
                                } else {
                                    r9 = c13930l;
                                    c15617l = c15617l2;
                                }
                            } else {
                                r9 = c13930l;
                                c15617l = c15617l2;
                            }
                            C11304l c11304l = new C11304l(iIncrementAndGet, size, i2, str2, num3, c15617l, abstractC2371l.amazon, abstractC2371l.purchase, abstractC2371l.billing, abstractC2371l.mopub, abstractC2371l.admob);
                            linkedHashMap.put(abstractC2371l, c11304l);
                            arrayList.add(c11304l);
                            it2 = it2;
                            c15617l2 = null;
                        }
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                int size2 = this.f12040l.loadAd.size();
                int i3 = 0;
                while (true) {
                    c7931l2 = this.f12040l;
                    if (i3 >= size2) {
                        break;
                    }
                    C4069l c4069l2 = (C4069l) c7931l2.loadAd.get(i3);
                    List list = c4069l2.yandex;
                    ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C11304l c11304l2 = (C11304l) linkedHashMap.get((AbstractC2371l) it3.next());
                        C11879l c11879l2 = f12030l;
                        c11879l2.getClass();
                        C16853l c16853l = new C16853l(C11879l.loadAd.incrementAndGet(c11879l2), c11304l2.crashlytics, c11304l2.billing, c11304l2.admob, c11304l2.mopub, c11304l2.subs, c11304l2.isPro, c11304l2.loadAd, c11304l2.amazon);
                        linkedHashMap4.put(c16853l, c11304l2);
                        arrayList4.add(c16853l);
                        size2 = size2;
                    }
                    int i4 = size2;
                    C11879l c11879l3 = f12033l;
                    c11879l3.getClass();
                    C9494l c9494l = new C9494l(C11879l.loadAd.incrementAndGet(c11879l3), arrayList4);
                    linkedHashMap2.put(c4069l2, c9494l);
                    arrayList2.add(c9494l);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ((C16853l) it4.next()).isPro = c9494l;
                    }
                    Iterator it5 = c4069l2.yandex.iterator();
                    while (it5.hasNext()) {
                        ((C11304l) linkedHashMap.get((AbstractC2371l) it5.next())).smaato.add(c9494l);
                    }
                    i3++;
                    size2 = i4;
                }
                ArrayList<C13228l> arrayList5 = c7931l2.amazon;
                if (arrayList5 != null) {
                    arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList5, 10));
                    for (C13228l c13228l : arrayList5) {
                        C11879l c11879l4 = f12034l;
                        c11879l4.getClass();
                        int iIncrementAndGet2 = C11879l.loadAd.incrementAndGet(c11879l4);
                        c13228l.getClass();
                        arrayList3.add(new C8278l(iIncrementAndGet2, c13228l.loadAd));
                    }
                }
                this.f12043l = arrayList3;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj : arrayList2) {
                    ArrayList arrayList8 = ((C9494l) obj).loadAd;
                    if (arrayList8.isEmpty()) {
                        z6 = false;
                        break;
                    }
                    Iterator it6 = arrayList8.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z6 = false;
                            break;
                        }
                        C5565l c5565l = ((C16853l) it6.next()).mopub;
                        if (c5565l == null ? false : C5565l.yandex(c5565l.yandex, 1L)) {
                            z6 = true;
                            break;
                        }
                    }
                    if (z6) {
                        arrayList6.add(obj);
                    } else {
                        arrayList7.add(obj);
                    }
                }
                if (arrayList6.isEmpty()) {
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        ArrayList arrayList11 = ((C9494l) obj2).loadAd;
                        if (arrayList11.isEmpty()) {
                            z3 = false;
                            break;
                        }
                        Iterator it7 = arrayList11.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (AbstractC16901l.inmobi(f12035l, ((C16853l) it7.next()).admob)) {
                                    z3 = true;
                                    break;
                                }
                            } else {
                                z3 = false;
                                break;
                            }
                        }
                        if (z3) {
                            arrayList9.add(obj2);
                        } else {
                            arrayList10.add(obj2);
                        }
                    }
                    if (arrayList9.isEmpty()) {
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            ArrayList arrayList14 = ((C9494l) obj3).loadAd;
                            if (arrayList14.isEmpty()) {
                                z2 = false;
                                break;
                            }
                            Iterator it8 = arrayList14.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    if (f12028l.contains(new C10134l(((C16853l) it8.next()).crashlytics))) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z2) {
                                arrayList12.add(obj3);
                            } else {
                                arrayList13.add(obj3);
                            }
                        }
                        if (!arrayList12.isEmpty()) {
                            arrayList2 = AbstractC16901l.m4232new(AbstractC16901l.m4243this(arrayList12, f12029l), arrayList13);
                        }
                    } else {
                        arrayList2 = AbstractC16901l.m4232new(AbstractC16901l.m4243this(arrayList9, f12031l), arrayList10);
                    }
                } else {
                    arrayList2 = AbstractC16901l.m4232new(arrayList6, arrayList7);
                }
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    ArrayList arrayList17 = ((C9494l) obj4).loadAd;
                    if (arrayList17.isEmpty()) {
                        z5 = false;
                        break;
                    }
                    Iterator it9 = arrayList17.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            z5 = false;
                            break;
                        }
                        C5565l c5565l2 = ((C16853l) it9.next()).mopub;
                        if (c5565l2 == null ? false : C5565l.yandex(c5565l2.yandex, 3L)) {
                            z5 = true;
                            break;
                        }
                    }
                    if (z5) {
                        arrayList15.add(obj4);
                    } else {
                        arrayList16.add(obj4);
                    }
                }
                if (arrayList15.isEmpty()) {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = new ArrayList();
                    for (Object obj5 : arrayList2) {
                        ArrayList arrayList20 = ((C9494l) obj5).loadAd;
                        if (!arrayList20.isEmpty()) {
                            Iterator it10 = arrayList20.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                                C5959l c5959l = ((C16853l) it10.next()).subs;
                                if (c5959l == null ? false : C5959l.yandex(c5959l.yandex, 1L)) {
                                    z4 = true;
                                    break;
                                }
                            }
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            arrayList18.add(obj5);
                        } else {
                            arrayList19.add(obj5);
                        }
                    }
                    if (!arrayList18.isEmpty()) {
                        arrayList2 = AbstractC16901l.m4232new(arrayList19, arrayList18);
                    }
                } else {
                    arrayList2 = AbstractC16901l.m4232new(arrayList16, arrayList15);
                }
                this.f12037l = arrayList2;
                ArrayList arrayList21 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                Iterator it11 = arrayList2.iterator();
                while (it11.hasNext()) {
                    arrayList21.add(new C16755l(((C9494l) it11.next()).yandex));
                }
                AbstractC16901l.m4229l(arrayList21);
                this.f12039l = linkedHashMap2;
                this.f12036l = AbstractC16901l.m4243this(arrayList, new C0323l(8, this));
                this.f12042l = linkedHashMap4;
                ArrayList arrayList22 = this.f12037l;
                ArrayList arrayList23 = new ArrayList();
                Iterator it12 = arrayList22.iterator();
                while (it12.hasNext()) {
                    AbstractC3984l.license(arrayList23, ((C9494l) it12.next()).loadAd);
                }
                this.f12038l = arrayList23;
                C17963l c17963l = new C17963l();
                Iterator it13 = this.f12040l.loadAd.iterator();
                while (it13.hasNext()) {
                    ((C4069l) it13.next()).getClass();
                }
                this.f12041l = c17963l.crashlytics();
                return;
            }
            List<C4069l> list2 = (List) it.next();
            if (list2.isEmpty()) {
                C8339l.smaato("Check failed.");
                throw null;
            }
            List list3 = this.f12040l.loadAd;
            if (Build.VERSION.SDK_INT >= 24) {
                r11 = arrayList3;
                ArrayList arrayList24 = new ArrayList();
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    AbstractC3984l.license(arrayList24, ((C4069l) it14.next()).yandex);
                }
                ArrayList arrayList25 = new ArrayList();
                Iterator it15 = arrayList24.iterator();
                while (it15.hasNext()) {
                    it15.next();
                }
                ArrayList arrayList26 = new ArrayList();
                Iterator it16 = arrayList25.iterator();
                if (it16.hasNext()) {
                    throw AbstractC15560l.adcel(it16);
                }
                r11 = arrayList26;
            }
            r11 = arrayList3;
            C11879l c11879l5 = f12027l;
            c11879l5.getClass();
            int iIncrementAndGet3 = C11879l.loadAd.incrementAndGet(c11879l5);
            while (r11.contains(Integer.valueOf(iIncrementAndGet3))) {
                iIncrementAndGet3 = C11879l.loadAd.incrementAndGet(c11879l5);
            }
            for (C4069l c4069l3 : list2) {
                if (linkedHashMap3.containsKey(c4069l3)) {
                    C8339l.smaato("Check failed.");
                    throw null;
                }
                linkedHashMap3.put(c4069l3, Integer.valueOf(iIncrementAndGet3));
            }
        }
    }

    public final C4069l billing(int i) {
        Object next;
        Iterator it = this.f12039l.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C9494l) ((Map.Entry) next).getValue()).yandex != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (C4069l) entry.getKey();
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        for (AutoCloseable autoCloseable : (C4764l) this.f12041l.values()) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    C11983l.crashlytics();
                    return;
                }
                AbstractC14238l.subscription((ExecutorService) autoCloseable);
            }
        }
    }

    public final String toString() {
        return "StreamGraph(" + this.f12039l + ')';
    }

    public final C9494l yandex(int i) {
        Object next;
        Iterator it = this.f12037l.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C9494l) next).yandex == i) {
                return (C9494l) next;
            }
        }
        next = null;
        return (C9494l) next;
    }
}
