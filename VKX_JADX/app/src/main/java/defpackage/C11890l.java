package defpackage;

import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: lًِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11890l extends C7090l implements InterfaceC18556l, Map {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C11890l f23708l = new C11890l(C7250l.purchase, 0);

    public final C11890l amazon(AbstractC5189l abstractC5189l, InterfaceC2180l interfaceC2180l) {
        C14785l c14785lSignature = this.f14858l.Signature(abstractC5189l.hashCode(), abstractC5189l, interfaceC2180l, 0);
        return c14785lSignature == null ? this : new C11890l((C7250l) c14785lSignature.f28907l, this.f14857l + c14785lSignature.f28908l);
    }

    @Override // defpackage.C7090l, defpackage.InterfaceC16176l
    public final InterfaceC5567l builder() {
        C12992l c12992l = new C12992l(this);
        c12992l.f25462l = this;
        return c12992l;
    }

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

    @Override // defpackage.C7090l, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC5189l) {
            return super.containsKey((AbstractC5189l) obj);
        }
        return false;
    }

    @Override // defpackage.C7090l, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC2180l) {
            return super.containsValue((InterfaceC2180l) obj);
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // defpackage.C7090l, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC5189l) {
            return (InterfaceC2180l) super.get((AbstractC5189l) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC5189l) ? obj2 : (InterfaceC2180l) Map.CC.$default$getOrDefault(this, (AbstractC5189l) obj, (InterfaceC2180l) obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.InterfaceC4191l
    /* JADX INFO: renamed from: this */
    public final Object mo539this(AbstractC5189l abstractC5189l) {
        return AbstractC9690l.billing(this, abstractC5189l);
    }

    @Override // defpackage.C7090l
    /* JADX INFO: renamed from: yandex */
    public final C0046l builder() {
        C12992l c12992l = new C12992l(this);
        c12992l.f25462l = this;
        return c12992l;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
