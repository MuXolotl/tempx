package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: lؑؒۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C0046l extends AbstractC3120l implements InterfaceC5567l, Map {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C7250l f908l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C6760l f909l = new C6760l(6);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C7090l f910l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f911l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f912l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f913l;

    public C0046l(C7090l c7090l) {
        this.f910l = c7090l;
        this.f908l = c7090l.f14858l;
        this.f913l = c7090l.f14857l;
    }

    public final void admob(int i) {
        this.f913l = i;
        this.f911l++;
    }

    @Override // defpackage.AbstractC3120l
    public final int amazon() {
        return this.f913l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f908l = C7250l.purchase;
        admob(0);
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f908l.amazon(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.AbstractC3120l
    public final Set crashlytics() {
        return new C15601l(1, this);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f908l.mopub(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // defpackage.InterfaceC5567l
    /* JADX INFO: renamed from: mopub, reason: merged with bridge method [inline-methods] */
    public C7090l build() {
        C7250l c7250l = this.f908l;
        C7090l c7090l = this.f910l;
        if (c7250l != c7090l.f14858l) {
            this.f909l = new C6760l(6);
            c7090l = new C7090l(this.f908l, amazon());
        }
        this.f910l = c7090l;
        return c7090l;
    }

    @Override // defpackage.AbstractC3120l
    public final Collection purchase() {
        return new C4764l(2, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f912l = null;
        this.f908l = this.f908l.smaato(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f912l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        C7090l c7090lBuild = null;
        C7090l c7090l = map instanceof C7090l ? (C7090l) map : null;
        if (c7090l == null) {
            C0046l c0046l = map instanceof C0046l ? (C0046l) map : null;
            if (c0046l != null) {
                c7090lBuild = c0046l.build();
            }
        } else {
            c7090lBuild = c7090l;
        }
        if (c7090lBuild == null) {
            super.putAll(map);
            return;
        }
        C5559l c5559l = new C5559l();
        c5559l.yandex = 0;
        int i = this.f913l;
        this.f908l = this.f908l.remoteconfig(c7090lBuild.f14858l, 0, c5559l, this);
        int i2 = (c7090lBuild.f14857l + i) - c5559l.yandex;
        if (i != i2) {
            admob(i2);
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        int iAmazon = amazon();
        C7250l c7250lMetrica = this.f908l.metrica(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c7250lMetrica == null) {
            c7250lMetrica = C7250l.purchase;
        }
        this.f908l = c7250lMetrica;
        return iAmazon != amazon();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.AbstractC3120l
    public final Set yandex() {
        return new C15601l(0, this);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f912l = null;
        C7250l c7250lVip = this.f908l.vip(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c7250lVip == null) {
            c7250lVip = C7250l.purchase;
        }
        this.f908l = c7250lVip;
        return this.f912l;
    }
}
