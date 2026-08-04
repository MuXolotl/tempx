package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lّؕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3364l extends AbstractC6005l implements InterfaceC11334l, InterfaceC14681l, InterfaceC3999l, InterfaceC2226l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC14426l f7162l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LongPointerWrapper f7163l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1332l f7164l;

    public C3364l(C1332l c1332l, LongPointerWrapper longPointerWrapper, InterfaceC14426l interfaceC14426l) {
        this.f7164l = c1332l;
        this.f7163l = longPointerWrapper;
        this.f7162l = interfaceC14426l;
    }

    @Override // defpackage.AbstractC6005l
    public final Object ad(int i) {
        Object obj = get(i);
        this.f7162l.remoteconfig().mo1844l();
        long ptr$cinterop_release = this.f7163l.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_list_erase(ptr$cinterop_release, i);
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f7162l.ad(i, obj, 2, new LinkedHashMap());
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int iPro = pro();
        if (i >= 0 && i <= iPro) {
            return this.f7162l.applovin(i, collection, 2, new LinkedHashMap());
        }
        C18262l.adcel(AbstractC12589l.premium(i, iPro, "index: ", ", size: "));
        return false;
    }

    @Override // defpackage.InterfaceC14681l
    public final void amazon() {
        long ptr$cinterop_release = this.f7163l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_list_remove_all(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC2257l
    public final InterfaceC3999l billing(AbstractC6139l abstractC6139l) {
        C6067l c6067lRemoteconfig = abstractC6139l.remoteconfig();
        NativePointer nativePointer = c6067lRemoteconfig.f12835l;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f7163l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_list_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C3364l(this.f7164l, longPointerWrapper, this.f7162l.loadAd(c6067lRemoteconfig, longPointerWrapper));
        }
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f7162l.remoteconfig().mo1844l();
        long ptr$cinterop_release = this.f7163l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_list_clear(ptr$cinterop_release);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f7162l.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        InterfaceC14426l interfaceC14426l = this.f7162l;
        interfaceC14426l.remoteconfig().mo1844l();
        return interfaceC14426l.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return this.f7162l.indexOf(obj);
    }

    @Override // defpackage.InterfaceC3999l
    public final boolean isValid() {
        LongPointerWrapper longPointerWrapper = this.f7163l;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return realmcJNI.realm_list_is_valid(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lؚؚؔ */
    public final InterfaceC3999l mo877l(C5765l c5765l) {
        NativePointer nativePointer = c5765l.f12151l;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f7163l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_list_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C3364l(this.f7164l, longPointerWrapper, this.f7162l.loadAd(c5765l, longPointerWrapper));
        }
        return null;
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lٌٖؖ */
    public final LongPointerWrapper mo878l(NativePointer nativePointer, C4816l c4816l) {
        long ptr$cinterop_release = this.f7163l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C10685l c10685l = new C10685l(c4816l);
        int i = AbstractC9795l.yandex;
        return new LongPointerWrapper(realmcJNI.register_notification_cb(ptr$cinterop_release, 1, ptr$cinterop_release2, c10685l), false);
    }

    @Override // defpackage.InterfaceC2257l
    public final AbstractC6107l metrica(C12428l c12428l) {
        return new C2270l(c12428l, 2);
    }

    @Override // defpackage.AbstractC6005l
    public final int pro() {
        this.f7162l.remoteconfig().mo1844l();
        long[] jArr = new long[1];
        long ptr$cinterop_release = this.f7163l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_list_size(ptr$cinterop_release, jArr);
        return (int) jArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        return this.f7162l.remove(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        InterfaceC14426l interfaceC14426l = this.f7162l;
        interfaceC14426l.remoteconfig().mo1844l();
        return interfaceC14426l.mo1566strictfp(i, obj, 2, new LinkedHashMap());
    }

    @Override // defpackage.InterfaceC13077l
    public final InterfaceC2257l vip() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return this.f7162l.applovin(pro(), collection, 2, new LinkedHashMap());
    }
}
