package defpackage;

import j$.util.Map;

/* JADX INFO: renamed from: lّۦُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12992l extends C0046l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C11890l f25462l;

    @Override // defpackage.C0046l, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC5189l) {
            return super.containsKey((AbstractC5189l) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC2180l) {
            return super.containsValue((InterfaceC2180l) obj);
        }
        return false;
    }

    @Override // defpackage.C0046l, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC5189l) {
            return (InterfaceC2180l) super.get((AbstractC5189l) obj);
        }
        return null;
    }

    @Override // defpackage.C0046l, java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC5189l) ? obj2 : (InterfaceC2180l) Map.CC.$default$getOrDefault(this, (AbstractC5189l) obj, (InterfaceC2180l) obj2);
    }

    @Override // defpackage.C0046l, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC5189l) {
            return (InterfaceC2180l) super.remove((AbstractC5189l) obj);
        }
        return null;
    }

    @Override // defpackage.C0046l
    /* JADX INFO: renamed from: subs, reason: merged with bridge method [inline-methods] */
    public final C11890l build() {
        C7250l c7250l = this.f908l;
        C11890l c11890l = this.f25462l;
        if (c7250l != c11890l.f14858l) {
            this.f909l = new C6760l(6);
            c11890l = new C11890l(this.f908l, amazon());
        }
        this.f25462l = c11890l;
        return c11890l;
    }
}
