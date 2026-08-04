package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l٘ۖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18126l extends AbstractC14401l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient AbstractC6140l f35417l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient int f35418l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient Object[] f35419l;

    public C18126l(AbstractC6140l abstractC6140l, Object[] objArr) {
        this.f35417l = abstractC6140l;
        this.f35419l = objArr;
    }

    @Override // defpackage.AbstractC10277l
    public final int amazon(Object[] objArr) {
        AbstractC13582l c2871l = this.f28155l;
        if (c2871l == null) {
            c2871l = new C2871l(this);
            this.f28155l = c2871l;
        }
        return c2871l.amazon(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f35417l.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC13582l c2871l = this.f28155l;
        if (c2871l == null) {
            c2871l = new C2871l(this);
            this.f28155l = c2871l;
        }
        return c2871l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f35418l;
    }
}
