package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٌٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8958l implements AutoCloseable, InterfaceC9492l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C5944l f18472l = new C5944l(C8426l.crashlytics, C13541l.loadAd);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C14588l f18473l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5664l f18474l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Set f18475l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final LinkedHashMap f18476l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C18262l f18477l;

    public C8958l(C5664l c5664l, C14588l c14588l, boolean z) {
        C13541l c13541l;
        this.f18474l = c5664l;
        this.f18473l = c14588l;
        C17963l c17963l = c5664l.f12041l;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2200l.firebase(c17963l.f34966l));
        Iterator it = c17963l.entrySet().iterator();
        if (!it.hasNext()) {
            this.f18476l = linkedHashMap;
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                C9494l c9494lYandex = this.f18474l.yandex(((C16755l) it2.next()).yandex);
                if (c9494lYandex == null) {
                    C8339l.smaato("Required value was null.");
                    throw null;
                }
                arrayList.add(c9494lYandex);
            }
            this.f18475l = AbstractC16901l.m4229l(arrayList);
            this.f18477l = new C18262l(7);
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        int i = ((C16755l) entry.getKey()).yandex;
        AbstractC8698l abstractC8698l = (AbstractC8698l) entry.getValue();
        C9494l c9494lYandex2 = this.f18474l.yandex(i);
        if (c9494lYandex2 == null) {
            C8339l.smaato("Required value was null.");
            throw null;
        }
        C4069l c4069lBilling = this.f18474l.billing(i);
        c4069lBilling.getClass();
        List list = c4069lBilling.yandex;
        if (z) {
            if (Build.VERSION.SDK_INT >= 33 && !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((AbstractC2371l) it3.next()).getClass();
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 || i2 >= 33) {
                throw null;
            }
            c13541l = C13541l.loadAd;
        } else {
            if (Build.VERSION.SDK_INT >= 33 && !list.isEmpty()) {
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    ((AbstractC2371l) it4.next()).getClass();
                }
            }
            c13541l = C13541l.loadAd;
        }
        C17963l c17963l2 = new C17963l();
        for (C16853l c16853l : c9494lYandex2.loadAd) {
            c17963l2.put(new C13172l(c16853l.yandex), new C5944l(C8426l.loadAd, c13541l));
        }
        new C6760l(c17963l2.crashlytics(), abstractC8698l);
        abstractC8698l.getClass();
        throw null;
    }

    @Override // defpackage.InterfaceC9492l
    public final void billing(InterfaceC10687l interfaceC10687l, long j, int i, int i2) {
        Map map = (Map) this.f18476l.get(new C16755l(i));
        if (map == null) {
            return;
        }
        if (this.f18474l.billing(i) == null) {
            C8339l.smaato("Required value was null.");
        } else {
            if (!map.containsKey(new C13172l(i2))) {
                C8339l.smaato("Check failed.");
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((C5944l) it.next()).yandex(j);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f18473l.close();
        this.f18472l.close();
        Iterator it = this.f18476l.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((C5944l) it2.next()).close();
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void isVip(InterfaceC10687l interfaceC10687l, long j, long j2) throws Exception {
        C1565l c1565l = new C1565l(interfaceC10687l, j, j2, this.f18475l);
        this.f18472l.mopub(j, j2, j, c1565l.amazon);
        C10227l c10227l = c1565l.purchase;
        int iPro = c10227l.pro();
        for (int i = 0; i < iPro; i++) {
            C0078l c0078l = (C0078l) c10227l.get(i);
            Object obj = this.f18476l.get(new C16755l(c0078l.f987l));
            if (obj == null) {
                C8339l.smaato("Required value was null.");
                return;
            }
            Object obj2 = ((Map) obj).get(new C13172l(c0078l.f986l));
            if (obj2 == null) {
                C8339l.smaato("Required value was null.");
                return;
            }
            C5944l c5944l = (C5944l) obj2;
            c5944l.mopub(j, j2, j2, c0078l);
            if (!interfaceC10687l.mo2962package().keySet().contains(new C16755l(c0078l.f987l))) {
                c5944l.yandex(c1565l.yandex);
            }
        }
        C5595l c5595l = new C5595l(c1565l);
        this.f18477l.getClass();
        if (!interfaceC10687l.mo2964switch()) {
            this.f18473l.yandex();
        }
        c5595l.yandex();
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: private */
    public final void mo1759private(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) throws Exception {
        this.f18472l.billing(j, new C3722l(10));
        if (interfaceC9595l.isVip()) {
            return;
        }
        Iterator it = interfaceC10687l.mo2962package().keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f18476l.get(new C16755l(((C16755l) it.next()).yandex));
            if (map != null) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((C5944l) it2.next()).yandex(j);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: switch */
    public final void mo1760switch(C15390l c15390l) {
        this.f18473l.yandex();
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: throw */
    public final void mo1762throw(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) throws Exception {
        this.f18472l.billing(j, c9992l);
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void ads(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo1758package(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void vip(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void adcel(InterfaceC10687l interfaceC10687l, long j) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void signatures(InterfaceC10687l interfaceC10687l, int i) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void inmobi(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void mopub(InterfaceC10687l interfaceC10687l, long j, long j2) {
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: synchronized */
    public final /* synthetic */ void mo1761synchronized(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
    }
}
