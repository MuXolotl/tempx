package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4861l extends AbstractSet {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11500l f9914l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9915l;

    public /* synthetic */ C4861l(C11500l c11500l, int i) {
        this.f9915l = i;
        this.f9914l = c11500l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f9915l;
        C11500l c11500l = this.f9914l;
        switch (i) {
            case 0:
                c11500l.clear();
                break;
            default:
                c11500l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C17512l c17512lYandex;
        Object obj2;
        Object value;
        int i = this.f9915l;
        C11500l c11500l = this.f9914l;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C17512l c17512l = null;
                if (key != null) {
                    try {
                        c17512lYandex = c11500l.yandex(key, false);
                    } catch (ClassCastException unused) {
                        c17512lYandex = null;
                    }
                    break;
                } else {
                    c17512lYandex = null;
                }
                if (c17512lYandex != null && ((obj2 = c17512lYandex.f34125l) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    c17512l = c17512lYandex;
                }
                return c17512l != null;
            default:
                return c11500l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f9915l;
        C11500l c11500l = this.f9914l;
        switch (i) {
            case 0:
                return new C11176l(c11500l, 0);
            default:
                return new C11176l(c11500l, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C17512l c17512lYandex;
        Object obj2;
        Object value;
        int i = this.f9915l;
        C17512l c17512lYandex2 = null;
        C11500l c11500l = this.f9914l;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        c17512lYandex = c11500l.yandex(key, false);
                    } catch (ClassCastException unused) {
                        c17512lYandex = null;
                    }
                    break;
                } else {
                    c17512lYandex = null;
                }
                if (c17512lYandex != null && ((obj2 = c17512lYandex.f34125l) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    c17512lYandex2 = c17512lYandex;
                }
                if (c17512lYandex2 == null) {
                    return false;
                }
                c11500l.crashlytics(c17512lYandex2, true);
                return true;
            default:
                if (obj != null) {
                    try {
                        c17512lYandex2 = c11500l.yandex(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c17512lYandex2 != null) {
                    c11500l.crashlytics(c17512lYandex2, true);
                }
                return c17512lYandex2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f9915l;
        C11500l c11500l = this.f9914l;
        switch (i) {
            case 0:
                break;
        }
        return c11500l.f23119l;
    }
}
