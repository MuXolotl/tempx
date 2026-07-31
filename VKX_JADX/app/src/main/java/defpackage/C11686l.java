package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lٍِؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11686l implements InterfaceC5281l, Set, InterfaceC2356l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C6295l f23430l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6295l f23431l;

    public C11686l(C6295l c6295l) {
        this.f23431l = c6295l;
        this.f23430l = c6295l;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f23430l.yandex(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C6295l c6295l = this.f23430l;
        int i = c6295l.amazon;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c6295l.smaato(it.next());
        }
        return i != c6295l.amazon;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f23430l.loadAd();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f23431l.crashlytics(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f23431l.crashlytics(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11686l.class != obj.getClass()) {
            return false;
        }
        return this.f23431l.equals(((C11686l) obj).f23431l);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f23431l.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f23431l.admob();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C17991l(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f23430l.remoteconfig(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C6295l c6295l = this.f23430l;
        int i = c6295l.amazon;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c6295l.isPro(it.next());
        }
        return i != c6295l.amazon;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[LOOP:0: B:5:0x0011->B:17:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053 A[EDGE_INSN: B:24:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:5:0x0011->B:17:0x0050], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C6295l c6295l = this.f23430l;
        Object[] objArr = c6295l.loadAd;
        int i = c6295l.amazon;
        long[] jArr = c6295l.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!AbstractC16901l.inmobi(collection, objArr[i5])) {
                                c6295l.vip(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != c6295l.amazon;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f23431l.amazon;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC18648l.billing(this);
    }

    public final String toString() {
        return this.f23431l.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC18648l.mopub(this, objArr);
    }
}
