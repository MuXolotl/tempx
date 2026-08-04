package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lًۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8348l implements Iterable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C3752l f17276l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C3752l f17277l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final WeakHashMap f17275l = new WeakHashMap();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f17278l = 0;

    public final Object amazon(Object obj, Object obj2) {
        C3752l c3752l = this.f17277l;
        while (c3752l != null && !c3752l.f7836l.equals(obj)) {
            c3752l = c3752l.f7834l;
        }
        if (c3752l != null) {
            return c3752l.f7835l;
        }
        C3752l c3752l2 = new C3752l(obj, obj2);
        this.f17278l++;
        C3752l c3752l3 = this.f17276l;
        if (c3752l3 == null) {
            this.f17277l = c3752l2;
            this.f17276l = c3752l2;
            return null;
        }
        c3752l3.f7834l = c3752l2;
        c3752l2.f7837l = c3752l3;
        this.f17276l = c3752l2;
        return null;
    }

    public final Object billing(Object obj) {
        C3752l c3752l = this.f17277l;
        while (c3752l != null && !c3752l.f7836l.equals(obj)) {
            c3752l = c3752l.f7834l;
        }
        if (c3752l == null) {
            return null;
        }
        this.f17278l--;
        WeakHashMap weakHashMap = this.f17275l;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2877l) it.next()).yandex(c3752l);
            }
        }
        C3752l c3752l2 = c3752l.f7837l;
        C3752l c3752l3 = c3752l.f7834l;
        if (c3752l2 != null) {
            c3752l2.f7834l = c3752l3;
        } else {
            this.f17277l = c3752l3;
        }
        C3752l c3752l4 = c3752l.f7834l;
        if (c3752l4 != null) {
            c3752l4.f7837l = c3752l2;
        } else {
            this.f17276l = c3752l2;
        }
        c3752l.f7834l = null;
        c3752l.f7837l = null;
        return c3752l.f7835l;
    }

    public final boolean equals(Object obj) {
        C18541l c18541l;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8348l)) {
            return false;
        }
        C8348l c8348l = (C8348l) obj;
        if (this.f17278l != c8348l.f17278l) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c8348l.iterator();
        while (true) {
            c18541l = (C18541l) it;
            if (!c18541l.hasNext()) {
                break;
            }
            C18541l c18541l2 = (C18541l) it2;
            if (!c18541l2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c18541l.next();
            Object next = c18541l2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c18541l.hasNext() || ((C18541l) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C18541l c18541l = (C18541l) it;
            if (!c18541l.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c18541l.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C3752l c3752l = this.f17277l;
        C3752l c3752l2 = this.f17276l;
        C18541l c18541l = new C18541l();
        c18541l.f36198l = c3752l2;
        c18541l.f36197l = c3752l;
        this.f17275l.put(c18541l, Boolean.FALSE);
        return c18541l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C18541l c18541l = (C18541l) it;
            if (!c18541l.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c18541l.next()).toString());
            if (c18541l.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
