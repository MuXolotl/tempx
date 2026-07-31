package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: lًؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3810l extends AbstractCollection implements Serializable, Collection {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7924l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final Object[] f7922l = new Object[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Object[] f7921l = new Object[0];

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Object[] f7923l = new Object[0];

    public /* synthetic */ AbstractC3810l(int i) {
        this.f7924l = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f7924l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.f7924l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int admob() {
        switch (this.f7924l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract int amazon(Object[] objArr);

    public int billing() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f7924l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int firebase() {
        switch (this.f7924l) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        int i = this.f7924l;
        Iterable$CC.$default$forEach(this, consumer);
    }

    public Object[] mopub() {
        switch (this.f7924l) {
        }
        return null;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        int i = this.f7924l;
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    public abstract int remoteconfig(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f7924l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.f7924l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        int i = this.f7924l;
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.f7924l) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Object[] smaato() {
        return null;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        switch (this.f7924l) {
            case 0:
                break;
            case 1:
                break;
        }
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        int i = this.f7924l;
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f7924l) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] objArrSmaato = smaato();
                    if (objArrSmaato != null) {
                        return Arrays.copyOfRange(objArrSmaato, admob(), billing(), objArr.getClass());
                    }
                    if (length != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size);
                } else if (length > size) {
                    objArr[size] = null;
                }
                amazon(objArr);
                return objArr;
            case 1:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] objArrMopub = mopub();
                    if (objArrMopub != null) {
                        return Arrays.copyOfRange(objArrMopub, admob(), firebase(), objArr.getClass());
                    }
                    if (length2 != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size2);
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                remoteconfig(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] objArrMopub2 = mopub();
                    if (objArrMopub2 != null) {
                        return Arrays.copyOfRange(objArrMopub2, admob(), firebase(), objArr.getClass());
                    }
                    if (length3 != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size3);
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                remoteconfig(objArr);
                return objArr;
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        int i = this.f7924l;
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        int i = this.f7924l;
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        int i = this.f7924l;
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.f7924l) {
            case 0:
                return toArray(f7922l);
            case 1:
                return toArray(f7921l);
            default:
                return toArray(f7923l);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        int i = this.f7924l;
        return toArray((Object[]) intFunction.apply(0));
    }
}
