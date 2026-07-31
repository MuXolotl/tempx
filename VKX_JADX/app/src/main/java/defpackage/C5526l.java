package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؘؚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5526l extends AbstractC12698l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient C4006l f11797l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient int f11798l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient Object[] f11799l;

    public C5526l(C4006l c4006l, Object[] objArr) {
        this.f11797l = c4006l;
        this.f11799l = objArr;
    }

    @Override // defpackage.AbstractC11819l
    public final int amazon(int i, Object[] objArr) {
        AbstractC14904l c3704l = this.f25017l;
        if (c3704l == null) {
            c3704l = new C3704l(this);
            this.f25017l = c3704l;
        }
        return c3704l.amazon(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11797l.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC14904l c3704l = this.f25017l;
        if (c3704l == null) {
            c3704l = new C3704l(this);
            this.f25017l = c3704l;
        }
        return c3704l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11798l;
    }
}
