package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.metrica;
import androidx.recyclerview.widget.subs;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؓۗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2045l extends subs {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C13170l f4577l;

    public C2045l(C14706l c14706l, subs... subsVarArr) {
        List listAsList = Arrays.asList(subsVarArr);
        this.f4577l = new C13170l(this, c14706l);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            isVip((subs) it.next());
        }
        boolean z = this.f4577l.loadAd != 1;
        if (this.f465l.yandex()) {
            C8339l.smaato("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f464l = z;
    }

    @Override // androidx.recyclerview.widget.subs
    public final void Signature(RecyclerView recyclerView) {
        C13170l c13170l = this.f4577l;
        ArrayList arrayList = c13170l.crashlytics;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    arrayList.remove(size);
                    break;
                }
            } else {
                arrayList.remove(size);
            }
        }
        Iterator it = c13170l.amazon.iterator();
        while (it.hasNext()) {
            ((C16150l) it.next()).crashlytics.Signature(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.subs
    public final void ad(metrica metricaVar) {
        this.f4577l.admob(metricaVar).crashlytics.ad(metricaVar);
    }

    @Override // androidx.recyclerview.widget.subs
    public final long admob(int i) {
        C13170l c13170l = this.f4577l;
        appmetrica appmetricaVarMopub = c13170l.mopub(i);
        C16150l c16150l = (C16150l) appmetricaVarMopub.f492l;
        c16150l.crashlytics.admob(appmetricaVarMopub.f489l);
        c16150l.loadAd.getClass();
        appmetricaVarMopub.f490l = false;
        appmetricaVarMopub.f492l = null;
        appmetricaVarMopub.f489l = -1;
        c13170l.admob = appmetricaVarMopub;
        return -1L;
    }

    @Override // androidx.recyclerview.widget.subs
    public final void ads(metrica metricaVar, int i) {
        C13170l c13170l = this.f4577l;
        appmetrica appmetricaVarMopub = c13170l.mopub(i);
        ((IdentityHashMap) c13170l.mopub).put(metricaVar, (C16150l) appmetricaVarMopub.f492l);
        C16150l c16150l = (C16150l) appmetricaVarMopub.f492l;
        c16150l.crashlytics.amazon(metricaVar, appmetricaVarMopub.f489l);
        appmetricaVarMopub.f490l = false;
        appmetricaVarMopub.f492l = null;
        appmetricaVarMopub.f489l = -1;
        c13170l.admob = appmetricaVarMopub;
    }

    @Override // androidx.recyclerview.widget.subs
    public final void advert(metrica metricaVar) {
        C13170l c13170l = this.f4577l;
        IdentityHashMap identityHashMap = (IdentityHashMap) c13170l.mopub;
        C16150l c16150l = (C16150l) identityHashMap.get(metricaVar);
        if (c16150l == null) {
            C18073l.metrica("Cannot find wrapper for ", metricaVar, ", seems like it is not bound by this adapter: ", c13170l);
        } else {
            c16150l.crashlytics.advert(metricaVar);
            identityHashMap.remove(metricaVar);
        }
    }

    public final void isVip(subs subsVar) {
        C13170l c13170l = this.f4577l;
        c13170l.yandex(c13170l.amazon.size(), subsVar);
    }

    @Override // androidx.recyclerview.widget.subs
    public final boolean license(metrica metricaVar) {
        C13170l c13170l = this.f4577l;
        IdentityHashMap identityHashMap = (IdentityHashMap) c13170l.mopub;
        C16150l c16150l = (C16150l) identityHashMap.get(metricaVar);
        if (c16150l == null) {
            C18073l.metrica("Cannot find wrapper for ", metricaVar, ", seems like it is not bound by this adapter: ", c13170l);
            return false;
        }
        boolean zLicense = c16150l.crashlytics.license(metricaVar);
        identityHashMap.remove(metricaVar);
        return zLicense;
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        Iterator it = this.f4577l.amazon.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C16150l) it.next()).purchase;
        }
        return i;
    }

    public final void premium(subs subsVar) {
        C13170l c13170l = this.f4577l;
        ArrayList arrayList = c13170l.amazon;
        int iSubs = c13170l.subs(subsVar);
        if (iSubs == -1) {
            return;
        }
        C16150l c16150l = (C16150l) arrayList.get(iSubs);
        int iPurchase = c13170l.purchase(c16150l);
        arrayList.remove(iSubs);
        ((C2045l) c13170l.purchase).metrica(iPurchase, c16150l.purchase);
        Iterator it = c13170l.crashlytics.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                subsVar.Signature(recyclerView);
            }
        }
        subs subsVar2 = c16150l.crashlytics;
        subsVar2.f465l.unregisterObserver(c16150l.billing);
        c16150l.yandex.yandex();
        c13170l.amazon();
    }

    @Override // androidx.recyclerview.widget.subs
    public final void pro(metrica metricaVar) {
        this.f4577l.admob(metricaVar).crashlytics.pro(metricaVar);
    }

    @Override // androidx.recyclerview.widget.subs
    public final int purchase(subs subsVar, metrica metricaVar, int i) {
        C13170l c13170l = this.f4577l;
        C16150l c16150l = (C16150l) ((IdentityHashMap) c13170l.mopub).get(metricaVar);
        if (c16150l == null) {
            return -1;
        }
        subs subsVar2 = c16150l.crashlytics;
        int iPurchase = i - c13170l.purchase(c16150l);
        int iMopub = subsVar2.mopub();
        if (iPurchase >= 0 && iPurchase < iMopub) {
            return subsVar2.purchase(subsVar, metricaVar, iPurchase);
        }
        StringBuilder sbSubscription = AbstractC14814l.subscription(iPurchase, iMopub, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbSubscription.append(metricaVar);
        sbSubscription.append("adapter:");
        sbSubscription.append(subsVar);
        throw new IllegalStateException(sbSubscription.toString());
    }

    public final List signatures() {
        List list;
        ArrayList arrayList = this.f4577l.amazon;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C16150l) it.next()).crashlytics);
            }
            list = arrayList2;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.subs
    public final void startapp(RecyclerView recyclerView) {
        C13170l c13170l = this.f4577l;
        ArrayList arrayList = c13170l.crashlytics;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = c13170l.amazon.iterator();
        while (it2.hasNext()) {
            ((C16150l) it2.next()).crashlytics.startapp(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.subs
    public final int subs(int i) {
        C13170l c13170l = this.f4577l;
        appmetrica appmetricaVarMopub = c13170l.mopub(i);
        C16150l c16150l = (C16150l) appmetricaVarMopub.f492l;
        int iPurchase = c16150l.yandex.purchase(c16150l.crashlytics.subs(appmetricaVarMopub.f489l));
        appmetricaVarMopub.f490l = false;
        appmetricaVarMopub.f492l = null;
        appmetricaVarMopub.f489l = -1;
        c13170l.admob = appmetricaVarMopub;
        return iPurchase;
    }

    @Override // androidx.recyclerview.widget.subs
    public final metrica tapsense(ViewGroup viewGroup, int i) {
        C16150l c16150lYandex = ((InterfaceC9432l) this.f4577l.billing).yandex(i);
        return c16150lYandex.crashlytics.tapsense(viewGroup, c16150lYandex.yandex.crashlytics(i));
    }
}
