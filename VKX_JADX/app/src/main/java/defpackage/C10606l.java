package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lَۣ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10606l extends AbstractC10465l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient Object[] f21526l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final transient int f21527l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient AbstractC6140l f21528l;

    public C10606l(AbstractC6140l abstractC6140l, Object[] objArr, int i) {
        super(0);
        this.f21528l = abstractC6140l;
        this.f21526l = objArr;
        this.f21527l = i;
    }

    @Override // defpackage.AbstractC3810l
    public final int amazon(Object[] objArr) {
        AbstractC3343l c3208l = this.f21317l;
        if (c3208l == null) {
            c3208l = new C3208l(this);
            this.f21317l = c3208l;
        }
        return c3208l.amazon(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f21528l.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC3343l c3208l = this.f21317l;
        if (c3208l == null) {
            c3208l = new C3208l(this);
            this.f21317l = c3208l;
        }
        return c3208l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21527l;
    }
}
