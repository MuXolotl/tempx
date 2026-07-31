package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lُٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15601l extends AbstractC2837l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0046l f30457l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30458l;

    public /* synthetic */ C15601l(int i, C0046l c0046l) {
        this.f30458l = i;
        this.f30457l = c0046l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f30458l) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f30458l) {
            case 0:
                this.f30457l.clear();
                break;
            default:
                this.f30457l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f30458l) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    C0046l c0046l = this.f30457l;
                    Object obj2 = c0046l.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && c0046l.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f30457l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f30458l) {
            case 0:
                return new C4720l(this.f30457l);
            default:
                AbstractC15674l[] abstractC15674lArr = new AbstractC15674l[8];
                for (int i = 0; i < 8; i++) {
                    abstractC15674lArr[i] = new C15418l(1);
                }
                return new C1166l(this.f30457l, abstractC15674lArr);
        }
    }

    @Override // defpackage.AbstractC2837l
    public final int pro() {
        switch (this.f30458l) {
            case 0:
                break;
        }
        return this.f30457l.amazon();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f30458l) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f30457l.remove(entry.getKey(), entry.getValue());
            default:
                C0046l c0046l = this.f30457l;
                if (!c0046l.containsKey(obj)) {
                    return false;
                }
                c0046l.remove(obj);
                return true;
        }
    }
}
