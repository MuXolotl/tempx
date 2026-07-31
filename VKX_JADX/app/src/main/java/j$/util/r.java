package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.a5;
import j$.util.stream.y6;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends u {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.m, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return this.a.contains(new p((java.util.Map.Entry) obj));
        }
        return false;
    }

    @Override // j$.util.m, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.u, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.a.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // j$.util.m, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.a(this.a, new j$.time.s(1, consumer));
    }

    @Override // j$.util.m, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new l(this);
    }

    @Override // j$.util.m, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new a5(spliterator, y6.l(spliterator), true);
    }

    @Override // j$.util.m, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new q(Collection.EL.c(this.a));
    }

    @Override // j$.util.m, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new a5(spliterator, y6.l(spliterator), false);
    }

    @Override // j$.util.m, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new p((java.util.Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.m, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new p((java.util.Map.Entry) array[i]);
        }
        return array;
    }
}
