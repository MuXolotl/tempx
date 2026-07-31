package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lًؙْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7969l extends AbstractC2837l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC6429l f16622l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final NativePointer f16623l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16624l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1332l f16625l;

    public /* synthetic */ C7969l(NativePointer nativePointer, InterfaceC6429l interfaceC6429l, C1332l c1332l, int i) {
        this.f16624l = i;
        this.f16623l = nativePointer;
        this.f16622l = interfaceC6429l;
        this.f16625l = c1332l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f16624l) {
            case 0:
                throw new UnsupportedOperationException("Adding keys to a dictionary through 'dictionary.keys' is not allowed.");
            default:
                Map.Entry entry = (Map.Entry) obj;
                return ((Boolean) this.f16622l.appmetrica(entry.getKey(), entry.getValue(), new LinkedHashMap()).f17097l).booleanValue();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.f16624l) {
            case 1:
                Iterator it = collection.iterator();
                boolean zBooleanValue = false;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    zBooleanValue |= ((Boolean) this.f16622l.appmetrica(entry.getKey(), entry.getValue(), new LinkedHashMap()).f17097l).booleanValue();
                }
                return zBooleanValue;
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f16624l) {
            case 1:
                this.f16622l.clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f16624l) {
            case 1:
                if (AbstractC9464l.smaato(obj)) {
                    return super.contains((Map.Entry) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f16624l) {
            case 0:
                return new C5032l(this, this.f16622l, 0);
            default:
                return new C7158l(this.f16622l);
        }
    }

    @Override // defpackage.AbstractC2837l
    public final int pro() {
        long j;
        int i = this.f16624l;
        NativePointer nativePointer = this.f16623l;
        switch (i) {
            case 0:
                long[] jArr = new long[1];
                long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
                int i2 = AbstractC9795l.yandex;
                realmcJNI.realm_results_count(ptr$cinterop_release, jArr);
                j = jArr[0];
                break;
            default:
                long[] jArr2 = new long[1];
                long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
                int i3 = AbstractC9795l.yandex;
                realmcJNI.realm_dictionary_size(ptr$cinterop_release2, jArr2);
                j = jArr2[0];
                break;
        }
        return (int) j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f16624l) {
            case 1:
                if (!AbstractC9464l.smaato(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                InterfaceC6429l interfaceC6429l = this.f16622l;
                boolean zMo803volatile = interfaceC6429l.mo803volatile(interfaceC6429l.get(key), entry.getValue());
                if (zMo803volatile) {
                    return ((Boolean) interfaceC6429l.adcel(entry.getKey()).f17097l).booleanValue();
                }
                if (!zMo803volatile) {
                    return false;
                }
                C18725l.billing();
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f16624l) {
            case 1:
                Iterator it = collection.iterator();
                boolean zRemove = false;
                while (it.hasNext()) {
                    zRemove |= remove((Map.Entry) it.next());
                }
                return zRemove;
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C12823l c12823l;
        C12823l c12823l2;
        int i = this.f16624l;
        InterfaceC6429l interfaceC6429l = this.f16622l;
        C1332l c1332l = this.f16625l;
        switch (i) {
            case 0:
                if (c1332l != null) {
                    String str = c1332l.f3421l;
                    Long lValueOf = Long.valueOf(c1332l.f3419l.mo876l().f21878l);
                    long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
                    int i2 = AbstractC9795l.yandex;
                    c12823l = new C12823l(str, lValueOf, Long.valueOf(realmcJNI.realm_object_get_key(ptr$cinterop_release)));
                } else {
                    c12823l = new C12823l("null", Long.valueOf(interfaceC6429l.remoteconfig().mo876l().f21878l), "null");
                }
                String str2 = (String) c12823l.f25200l;
                long jLongValue = ((Number) c12823l.f25199l).longValue();
                return "RealmDictionary.keys{size=" + pro() + ",owner=" + str2 + ",objKey=" + c12823l.f25198l + ",version=" + jLongValue + "}";
            default:
                if (c1332l != null) {
                    String str3 = c1332l.f3421l;
                    Long lValueOf2 = Long.valueOf(c1332l.f3419l.mo876l().f21878l);
                    long ptr$cinterop_release2 = c1332l.f3422l.getPtr$cinterop_release();
                    int i3 = AbstractC9795l.yandex;
                    c12823l2 = new C12823l(str3, lValueOf2, Long.valueOf(realmcJNI.realm_object_get_key(ptr$cinterop_release2)));
                } else {
                    AbstractC17054l abstractC17054lMo1843l = interfaceC6429l.remoteconfig().mo1843l();
                    abstractC17054lMo1843l.getClass();
                    c12823l2 = new C12823l("null", abstractC17054lMo1843l.mo875abstract().mo876l(), "null");
                }
                String str4 = (String) c12823l2.f25200l;
                Comparable comparable = (Comparable) c12823l2.f25199l;
                return "RealmDictionary.entries{size=" + pro() + ",owner=" + str4 + ",objKey=" + c12823l2.f25198l + ",version=" + comparable + "}";
        }
    }
}
