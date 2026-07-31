package defpackage;

import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lٟٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14355l extends AbstractC18064l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C1332l f28104l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC6429l f28105l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final NativePointer f28106l;

    public C14355l(NativePointer nativePointer, InterfaceC6429l interfaceC6429l, C1332l c1332l) {
        this.f28106l = nativePointer;
        this.f28105l = interfaceC6429l;
        this.f28104l = c1332l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Adding values to a dictionary through 'dictionary.values' is not allowed.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Adding values to a dictionary through 'dictionary.values' is not allowed.");
    }

    @Override // defpackage.AbstractC18064l
    public final int amazon() {
        return this.f28105l.mopub();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f28105l.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5032l(this, this.f28105l, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC12172l abstractC12172l;
        AbstractC12172l abstractC12172l2;
        Iterator it = iterator();
        if (obj == null) {
            do {
                abstractC12172l2 = (AbstractC12172l) it;
                if (!abstractC12172l2.hasNext()) {
                    return false;
                }
            } while (abstractC12172l2.next() != null);
            abstractC12172l2.remove();
            return true;
        }
        do {
            abstractC12172l = (AbstractC12172l) it;
            if (!abstractC12172l.hasNext()) {
                return false;
            }
        } while (!this.f28105l.mo803volatile(obj, abstractC12172l.next()));
        abstractC12172l.remove();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = iterator();
        boolean z = false;
        while (true) {
            AbstractC12172l abstractC12172l = (AbstractC12172l) it;
            if (!abstractC12172l.hasNext()) {
                return z;
            }
            Object next = abstractC12172l.next();
            if (next instanceof byte[]) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!Arrays.equals((byte[]) next, (byte[]) it2.next())) {
                        abstractC12172l.remove();
                        z = true;
                    }
                }
            } else if (!collection.contains(next)) {
                abstractC12172l.remove();
                z = true;
            }
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C12823l c12823l;
        InterfaceC6429l interfaceC6429l = this.f28105l;
        C1332l c1332l = this.f28104l;
        if (c1332l != null) {
            String str = c1332l.f3421l;
            Long lValueOf = Long.valueOf(c1332l.f3419l.mo876l().f21878l);
            long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            c12823l = new C12823l(str, lValueOf, Long.valueOf(realmcJNI.realm_object_get_key(ptr$cinterop_release)));
        } else {
            AbstractC17054l abstractC17054lMo1843l = interfaceC6429l.remoteconfig().mo1843l();
            abstractC17054lMo1843l.getClass();
            c12823l = new C12823l("null", abstractC17054lMo1843l.mo875abstract().mo876l(), "null");
        }
        String str2 = (String) c12823l.f25200l;
        Comparable comparable = (Comparable) c12823l.f25199l;
        return "RealmDictionary.values{size=" + interfaceC6429l.mopub() + ",owner=" + str2 + ",objKey=" + c12823l.f25198l + ",version=" + comparable + "}";
    }
}
