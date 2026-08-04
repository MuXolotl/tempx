package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: lٌ٘۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18234l extends AbstractC6552l implements InterfaceC2599l, InterfaceC2226l, Map {
    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f13671l.containsKey((String) obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f13671l.get((String) obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : Map.CC.$default$getOrDefault(this, (String) obj, obj2);
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lؚؚؔ */
    public final InterfaceC3999l mo877l(C5765l c5765l) {
        NativePointer nativePointer = c5765l.f12151l;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f13674l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C18234l(this.f13675l, longPointerWrapper, this.f13671l.loadAd(c5765l, longPointerWrapper));
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // defpackage.InterfaceC2257l
    public final AbstractC6107l metrica(C12428l c12428l) {
        return new C2270l(c12428l, 1);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f13671l.remove((String) obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        C12823l c12823l;
        InterfaceC6429l interfaceC6429l = this.f13671l;
        C1332l c1332l = this.f13675l;
        if (c1332l != null) {
            String str = c1332l.f3421l;
            Long lValueOf = Long.valueOf(c1332l.f3419l.mo876l().f21878l);
            long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            c12823l = new C12823l(str, lValueOf, Long.valueOf(realmcJNI.realm_object_get_key(ptr$cinterop_release)));
        } else {
            c12823l = new C12823l("null", Long.valueOf(interfaceC6429l.remoteconfig().mo876l().f21878l), "null");
        }
        String str2 = (String) c12823l.f25200l;
        long jLongValue = ((Number) c12823l.f25199l).longValue();
        return "RealmDictionary{size=" + interfaceC6429l.mopub() + ",owner=" + str2 + ",objKey=" + c12823l.f25198l + ",version=" + jLongValue + "}";
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof String) {
            return Map.CC.$default$remove(this, (String) obj, obj2);
        }
        return false;
    }
}
