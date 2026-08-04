package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: lؙٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15525l extends AbstractC2837l implements InterfaceC14681l, InterfaceC3999l, InterfaceC2226l, Set, InterfaceC2329l, InterfaceC5281l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC2435l f30332l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LongPointerWrapper f30333l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1332l f30334l;

    public C15525l(C1332l c1332l, LongPointerWrapper longPointerWrapper, InterfaceC2435l interfaceC2435l) {
        this.f30334l = c1332l;
        this.f30333l = longPointerWrapper;
        this.f30332l = interfaceC2435l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f30332l.mo1139package(obj, 2, new LinkedHashMap());
    }

    @Override // defpackage.InterfaceC14681l
    public final void amazon() {
        long ptr$cinterop_release = this.f30333l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_remove_all(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC2257l
    public final InterfaceC3999l billing(AbstractC6139l abstractC6139l) {
        C6067l c6067lRemoteconfig = abstractC6139l.remoteconfig();
        NativePointer nativePointer = c6067lRemoteconfig.f12835l;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f30333l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C15525l(this.f30334l, longPointerWrapper, this.f30332l.loadAd(c6067lRemoteconfig, longPointerWrapper));
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f30332l.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30332l.contains(obj);
    }

    @Override // defpackage.InterfaceC3999l
    public final boolean isValid() {
        LongPointerWrapper longPointerWrapper = this.f30333l;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return realmcJNI.realm_set_is_valid(ptr$cinterop_release);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6494l(this);
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lؚؚؔ */
    public final InterfaceC3999l mo877l(C5765l c5765l) {
        NativePointer nativePointer = c5765l.f12151l;
        long[] jArr = {0};
        long ptr$cinterop_release = this.f30333l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C15525l(this.f30334l, longPointerWrapper, this.f30332l.loadAd(c5765l, longPointerWrapper));
        }
        return null;
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lٌٖؖ */
    public final LongPointerWrapper mo878l(NativePointer nativePointer, C4816l c4816l) {
        long ptr$cinterop_release = this.f30333l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C7972l c7972l = new C7972l(22, c4816l);
        int i = AbstractC9795l.yandex;
        return new LongPointerWrapper(realmcJNI.register_notification_cb(ptr$cinterop_release, 2, ptr$cinterop_release2, c7972l), false);
    }

    @Override // defpackage.InterfaceC2257l
    public final AbstractC6107l metrica(C12428l c12428l) {
        return new C2270l(c12428l, 3);
    }

    @Override // defpackage.AbstractC2837l
    public final int pro() {
        this.f30332l.remoteconfig().mo1844l();
        long[] jArr = new long[1];
        long ptr$cinterop_release = this.f30333l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_size(ptr$cinterop_release, jArr);
        return (int) jArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f30332l.remove(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return this.f30332l.removeAll(collection);
    }

    @Override // defpackage.InterfaceC13077l
    public final InterfaceC2257l vip() {
        return this;
    }
}
