package defpackage;

import j$.lang.Iterable$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: lؘۦٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6106l implements Collection, InterfaceC2356l, j$.util.Collection {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f12891l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12892l;

    public C6106l() {
        this.f12892l = 0;
        this.f12891l = AbstractC1793l.yandex();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12892l) {
            case 0:
                return ((C1807l) this.f12891l).yandex(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12892l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f12892l) {
            case 0:
                ((C1807l) this.f12891l).loadAd();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f12892l;
        Object obj2 = this.f12891l;
        switch (i) {
            case 0:
                return ((C1807l) obj2).crashlytics(obj);
            default:
                return ((C13660l) obj2).amazon(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f12892l;
        Object obj = this.f12891l;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((C1807l) obj).crashlytics(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((C13660l) obj).amazon(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        int i = this.f12892l;
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        int i = this.f12892l;
        Object obj = this.f12891l;
        switch (i) {
            case 0:
                return ((C1807l) obj).mopub == 0;
            default:
                return ((C13660l) obj).subs();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12892l) {
            case 0:
                C1807l c1807l = (C1807l) this.f12891l;
                c1807l.getClass();
                return new C17991l(new C6878l(c1807l));
            default:
                return AbstractC6900l.purchase(new C12521l(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        int i = this.f12892l;
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12892l) {
            case 0:
                return ((C1807l) this.f12891l).admob(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12892l) {
            case 0:
                return ((C1807l) this.f12891l).admob(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f12892l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12892l) {
            case 0:
                return ((C1807l) this.f12891l).isPro(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        int i = this.f12892l;
        Object obj = this.f12891l;
        switch (i) {
            case 0:
                return ((C1807l) obj).mopub;
            default:
                return ((C13660l) obj).purchase;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        int i = this.f12892l;
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        int i = this.f12892l;
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f12892l) {
            case 0:
                break;
        }
        return AbstractC18648l.billing(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        int i = this.f12892l;
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        int i = this.f12892l;
        return j$.util.Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        int i = this.f12892l;
        return j$.util.Collection.CC.$default$stream(this);
    }

    public C6106l(C13660l c13660l) {
        this.f12892l = 1;
        this.f12891l = c13660l;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        int i = this.f12892l;
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12892l) {
            case 0:
                break;
        }
        return AbstractC18648l.mopub(this, objArr);
    }
}
