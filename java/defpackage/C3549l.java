package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lٟؕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3549l implements Parcelable, InterfaceC2763l, Set, RandomAccess, InterfaceC5281l {
    public static final Parcelable.Creator<C3549l> CREATOR = new C9499l(4);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C17230l f7456l;

    public C3549l() {
        C15084l c15084l = C15084l.f29615l;
        C17230l c17230l = new C17230l(AbstractC9620l.isPro().mopub(), c15084l);
        if (AbstractC9620l.loadAd.get() != null) {
            c17230l.loadAd = new C17230l(1L, c15084l);
        }
        this.f7456l = c17230l;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        C15084l c15084l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        do {
            synchronized (AbstractC7798l.yandex) {
                C17230l c17230l = (C17230l) AbstractC9620l.admob(this.f7456l);
                i = c17230l.amazon;
                c15084l = c17230l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            C15084l c15084lAd = c15084l.ad(obj);
            if (c15084lAd.equals(c15084l)) {
                return false;
            }
            C17230l c17230l2 = this.f7456l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = AbstractC7798l.yandex((C17230l) AbstractC9620l.ad(c17230l2, this, abstractC18620lIsPro), i, c15084lAd);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zYandex);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        C15084l c15084l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        do {
            synchronized (AbstractC7798l.yandex) {
                C17230l c17230l = (C17230l) AbstractC9620l.admob(this.f7456l);
                i = c17230l.amazon;
                c15084l = c17230l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            c15084l.getClass();
            C10600l c10600l = new C10600l(c15084l);
            c10600l.addAll(collection);
            C15084l c15084lAd = c10600l.ad();
            if (c15084lAd.equals(c15084l)) {
                return false;
            }
            C17230l c17230l2 = this.f7456l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = AbstractC7798l.yandex((C17230l) AbstractC9620l.ad(c17230l2, this, abstractC18620lIsPro), i, c15084lAd);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zYandex);
        return true;
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f7456l;
    }

    @Override // defpackage.InterfaceC2763l
    public final /* synthetic */ AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        return null;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        AbstractC18620l abstractC18620lIsPro;
        C17230l c17230l = this.f7456l;
        synchronized (AbstractC9620l.crashlytics) {
            abstractC18620lIsPro = AbstractC9620l.isPro();
            C17230l c17230l2 = (C17230l) AbstractC9620l.ad(c17230l, this, abstractC18620lIsPro);
            synchronized (AbstractC7798l.yandex) {
                c17230l2.crashlytics = C15084l.f29615l;
                c17230l2.amazon++;
            }
        }
        AbstractC9620l.metrica(abstractC18620lIsPro, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return ((C17230l) AbstractC9620l.Signature(this.f7456l, this)).crashlytics.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C17230l) AbstractC9620l.Signature(this.f7456l, this)).crashlytics.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return ((C17230l) AbstractC9620l.Signature(this.f7456l, this)).crashlytics.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3038l(this, ((C17230l) AbstractC9620l.Signature(this.f7456l, this)).crashlytics.iterator());
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        abstractC7498l.loadAd = this.f7456l;
        this.f7456l = (C17230l) abstractC7498l;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C15084l c15084l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        do {
            synchronized (AbstractC7798l.yandex) {
                C17230l c17230l = (C17230l) AbstractC9620l.admob(this.f7456l);
                i = c17230l.amazon;
                c15084l = c17230l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            C15084l c15084lAdvert = c15084l.advert(obj);
            if (c15084lAdvert.equals(c15084l)) {
                return false;
            }
            C17230l c17230l2 = this.f7456l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = AbstractC7798l.yandex((C17230l) AbstractC9620l.ad(c17230l2, this, abstractC18620lIsPro), i, c15084lAdvert);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zYandex);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        C15084l c15084l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        do {
            synchronized (AbstractC7798l.yandex) {
                C17230l c17230l = (C17230l) AbstractC9620l.admob(this.f7456l);
                i = c17230l.amazon;
                c15084l = c17230l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            c15084l.getClass();
            C10600l c10600l = new C10600l(c15084l);
            c10600l.removeAll(collection);
            C15084l c15084lAd = c10600l.ad();
            if (c15084lAd.equals(c15084l)) {
                return false;
            }
            C17230l c17230l2 = this.f7456l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = AbstractC7798l.yandex((C17230l) AbstractC9620l.ad(c17230l2, this, abstractC18620lIsPro), i, c15084lAd);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zYandex);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        C15084l c15084l;
        boolean zRetainAll;
        AbstractC18620l abstractC18620lIsPro;
        boolean zYandex;
        do {
            synchronized (AbstractC7798l.yandex) {
                C17230l c17230l = (C17230l) AbstractC9620l.admob(this.f7456l);
                i = c17230l.amazon;
                c15084l = c17230l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            if (c15084l == null) {
                C8339l.smaato("No set to mutate");
                return false;
            }
            C10600l c10600l = new C10600l(c15084l);
            zRetainAll = c10600l.retainAll(AbstractC16901l.m4229l(collection));
            C15084l c15084lAd = c10600l.ad();
            if (c15084lAd.equals(c15084l)) {
                break;
            }
            C17230l c17230l2 = this.f7456l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zYandex = AbstractC7798l.yandex((C17230l) AbstractC9620l.ad(c17230l2, this, abstractC18620lIsPro), i, c15084lAd);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zYandex);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return ((C17230l) AbstractC9620l.Signature(this.f7456l, this)).crashlytics.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC18648l.billing(this);
    }

    public final String toString() {
        return "SnapshotStateSet(value=" + ((C17230l) AbstractC9620l.admob(this.f7456l)).crashlytics + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C15084l c15084l = ((C17230l) AbstractC9620l.Signature(this.f7456l, this)).crashlytics;
        parcel.writeInt(size());
        Iterator it = c15084l.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC18648l.mopub(this, objArr);
    }
}
