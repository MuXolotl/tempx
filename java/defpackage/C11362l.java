package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;

/* JADX INFO: renamed from: lُٕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11362l implements Parcelable, InterfaceC2763l, List, RandomAccess, InterfaceC4742l {
    public static final Parcelable.Creator<C11362l> CREATOR = new C9499l(0);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C1713l f22912l;

    public C11362l(AbstractC5030l abstractC5030l) {
        AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
        C1713l c1713l = new C1713l(abstractC18620lIsPro.mopub(), abstractC5030l);
        if (!(abstractC18620lIsPro instanceof C18661l)) {
            c1713l.loadAd = new C1713l(1L, abstractC5030l);
        }
        this.f22912l = c1713l;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        do {
            synchronized (AbstractC18263l.yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(this.f22912l);
                i = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC5030l abstractC5030lAdvert = abstractC5030l.advert(obj);
            if (abstractC5030lAdvert.equals(abstractC5030l)) {
                return false;
            }
            C1713l c1713l2 = this.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, this, abstractC18620lIsPro), i, abstractC5030lAdvert, true);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zAmazon);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        do {
            synchronized (AbstractC18263l.yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(this.f22912l);
                i = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC5030l abstractC5030lIsVip = abstractC5030l.isVip(collection);
            if (AbstractC8576l.yandex(abstractC5030lIsVip, abstractC5030l)) {
                return false;
            }
            C1713l c1713l2 = this.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, this, abstractC18620lIsPro), i, abstractC5030lIsVip, true);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zAmazon);
        return true;
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f22912l;
    }

    @Override // defpackage.InterfaceC2763l
    public final /* synthetic */ AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC18620l abstractC18620lIsPro;
        C1713l c1713l = this.f22912l;
        synchronized (AbstractC9620l.crashlytics) {
            abstractC18620lIsPro = AbstractC9620l.isPro();
            C1713l c1713l2 = (C1713l) AbstractC9620l.ad(c1713l, this, abstractC18620lIsPro);
            synchronized (AbstractC18263l.yandex) {
                c1713l2.crashlytics = C3451l.f7330l;
                c1713l2.amazon++;
                c1713l2.purchase++;
            }
        }
        AbstractC9620l.metrica(abstractC18620lIsPro, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((C1713l) AbstractC9620l.Signature(this.f22912l, this)).crashlytics.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C1713l) AbstractC9620l.Signature(this.f22912l, this)).crashlytics.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((C1713l) AbstractC9620l.Signature(this.f22912l, this)).crashlytics.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ((C1713l) AbstractC9620l.Signature(this.f22912l, this)).crashlytics.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((C1713l) AbstractC9620l.Signature(this.f22912l, this)).crashlytics.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ((C1713l) AbstractC9620l.Signature(this.f22912l, this)).crashlytics.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C13376l(this, 0);
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        abstractC7498l.loadAd = this.f22912l;
        this.f22912l = (C1713l) abstractC7498l;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        do {
            synchronized (AbstractC18263l.yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(this.f22912l);
                i = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            int iIndexOf = abstractC5030l.indexOf(obj);
            AbstractC5030l abstractC5030lApplovin = iIndexOf != -1 ? abstractC5030l.applovin(iIndexOf) : abstractC5030l;
            if (abstractC5030lApplovin.equals(abstractC5030l)) {
                return false;
            }
            C1713l c1713l2 = this.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, this, abstractC18620lIsPro), i, abstractC5030lApplovin, true);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zAmazon);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        do {
            synchronized (AbstractC18263l.yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(this.f22912l);
                i = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            abstractC5030l.getClass();
            AbstractC5030l abstractC5030lPremium = abstractC5030l.premium(new C1195l(0, collection));
            if (AbstractC8576l.yandex(abstractC5030lPremium, abstractC5030l)) {
                return false;
            }
            C1713l c1713l2 = this.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, this, abstractC18620lIsPro), i, abstractC5030lPremium, true);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zAmazon);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC18263l.admob(this, new C1195l(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        Object obj2 = get(i);
        do {
            synchronized (AbstractC18263l.yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(this.f22912l);
                i2 = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC5030l abstractC5030lAppmetrica = abstractC5030l.appmetrica(i, obj);
            if (abstractC5030lAppmetrica.equals(abstractC5030l)) {
                break;
            }
            C1713l c1713l2 = this.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, this, abstractC18620lIsPro), i2, abstractC5030lAppmetrica, false);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zAmazon);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((C1713l) AbstractC9620l.Signature(this.f22912l, this)).crashlytics.pro();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            AbstractC5363l.yandex("fromIndex or toIndex are out of bounds");
        }
        return new C15590l(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC18648l.billing(this);
    }

    public final String toString() {
        return "SnapshotStateList(value=" + ((C1713l) AbstractC9620l.admob(this.f22912l)).crashlytics + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC5030l abstractC5030l = ((C1713l) AbstractC9620l.Signature(this.f22912l, this)).crashlytics;
        int iPro = abstractC5030l.pro();
        parcel.writeInt(iPro);
        for (int i2 = 0; i2 < iPro; i2++) {
            parcel.writeValue(abstractC5030l.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC18648l.mopub(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C13376l(this, i);
    }

    public C11362l() {
        this(C3451l.f7330l);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        do {
            synchronized (AbstractC18263l.yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(this.f22912l);
                i2 = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC5030l abstractC5030lAd = abstractC5030l.ad(i, obj);
            if (abstractC5030lAd.equals(abstractC5030l)) {
                return;
            }
            C1713l c1713l2 = this.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, this, abstractC18620lIsPro), i2, abstractC5030lAd, true);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zAmazon);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return AbstractC18263l.admob(this, new C7365l(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC5030l abstractC5030l;
        AbstractC18620l abstractC18620lIsPro;
        boolean zAmazon;
        Object obj = get(i);
        do {
            synchronized (AbstractC18263l.yandex) {
                C1713l c1713l = (C1713l) AbstractC9620l.admob(this.f22912l);
                i2 = c1713l.amazon;
                abstractC5030l = c1713l.crashlytics;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC5030l abstractC5030lApplovin = abstractC5030l.applovin(i);
            if (abstractC5030lApplovin.equals(abstractC5030l)) {
                break;
            }
            C1713l c1713l2 = this.f22912l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                zAmazon = AbstractC18263l.amazon((C1713l) AbstractC9620l.ad(c1713l2, this, abstractC18620lIsPro), i2, abstractC5030lApplovin, true);
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        } while (!zAmazon);
        return obj;
    }
}
