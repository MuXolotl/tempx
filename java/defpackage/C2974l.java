package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: lؔۢؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2974l implements InterfaceC9289l {
    public C16565l amazon;
    public C6655l billing;
    public C5807l purchase;
    public final Object yandex = new Object();
    public final LinkedHashMap loadAd = new LinkedHashMap();
    public final HashSet crashlytics = new HashSet();

    public final LinkedHashSet amazon() {
        LinkedHashSet linkedHashSet;
        synchronized (this.yandex) {
            linkedHashSet = new LinkedHashSet(this.loadAd.values());
        }
        return linkedHashSet;
    }

    public final InterfaceC18690l crashlytics(String str) {
        InterfaceC18690l interfaceC18690l;
        synchronized (this.yandex) {
            try {
                interfaceC18690l = (InterfaceC18690l) this.loadAd.get(str);
                if (interfaceC18690l == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC18690l;
    }

    public final ListenableFuture loadAd() {
        synchronized (this.yandex) {
            try {
                boolean zIsEmpty = this.loadAd.isEmpty();
                C16565l c16565l = this.amazon;
                ListenableFuture listenableFuture = c16565l;
                C16565l c16565l2 = c16565l;
                if (zIsEmpty) {
                    if (c16565l == null) {
                        listenableFuture = C11077l.f22285l;
                    }
                    return listenableFuture;
                }
                if (c16565l == null) {
                    C5807l c5807l = new C5807l();
                    c5807l.crashlytics = new C0011l();
                    C16565l c16565l3 = new C16565l(c5807l);
                    c5807l.loadAd = c16565l3;
                    c5807l.yandex = AbstractC5020l.class;
                    try {
                        synchronized (this.yandex) {
                            this.purchase = c5807l;
                        }
                        c5807l.yandex = "CameraRepository-deinit";
                    } catch (Exception e) {
                        c16565l3.loadAd(e);
                    }
                    this.amazon = c16565l3;
                    c16565l2 = c16565l3;
                }
                this.crashlytics.addAll(this.loadAd.values());
                for (InterfaceC18690l interfaceC18690l : this.loadAd.values()) {
                    interfaceC18690l.release().yandex(new RunnableC7762l(this, interfaceC18690l, 17), AbstractC12272l.yandex());
                }
                this.loadAd.clear();
                return c16565l2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void purchase(C6655l c6655l) {
        this.billing = c6655l;
        synchronized (this.yandex) {
            try {
                for (String str : c6655l.loadAd()) {
                    AbstractC5088l.yandex("CameraRepository", "Added camera: " + str);
                    InterfaceC18690l interfaceC18690l = (InterfaceC18690l) this.loadAd.put(str, c6655l.crashlytics(str));
                    if (interfaceC18690l != null) {
                        interfaceC18690l.release();
                    }
                }
            } catch (C4155l e) {
                throw new C7410l(e);
            }
        }
    }

    @Override // defpackage.InterfaceC9289l
    public final void yandex(List list) {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.yandex) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.loadAd.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.billing.crashlytics(str));
            }
            synchronized (this.yandex) {
                try {
                    HashSet hashSet2 = new HashSet(this.loadAd.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<InterfaceC18690l> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC18690l) this.loadAd.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.loadAd.containsKey(str2)) {
                            linkedHashMap.put(str2, (InterfaceC18690l) this.loadAd.get(str2));
                        } else {
                            linkedHashMap.put(str2, (InterfaceC18690l) map.get(str2));
                        }
                    }
                    this.loadAd.clear();
                    this.loadAd.putAll(linkedHashMap);
                    for (InterfaceC18690l interfaceC18690l : arrayList) {
                        if (interfaceC18690l != null) {
                            interfaceC18690l.vip();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C4155l e) {
            throw new C12868l("Failed to create CameraInternal", e);
        }
    }
}
