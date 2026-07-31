package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lٕٝۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15825l extends AbstractC9813l implements InterfaceC5130l, InterfaceC14681l, InterfaceC3999l, InterfaceC17603l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f31073l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final NativePointer f31074l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC7832l f31075l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C5501l f31076l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC1388l f31077l;

    public C15825l(InterfaceC7832l interfaceC7832l, NativePointer nativePointer, long j, InterfaceC1388l interfaceC1388l, C5501l c5501l) {
        this.f31075l = interfaceC7832l;
        this.f31074l = nativePointer;
        this.f31073l = j;
        this.f31077l = interfaceC1388l;
        this.f31076l = c5501l;
    }

    @Override // defpackage.InterfaceC17603l
    /* JADX INFO: renamed from: abstract */
    public final InterfaceC7832l mo875abstract() {
        return this.f31075l;
    }

    @Override // defpackage.InterfaceC14681l
    public final void amazon() {
        long ptr$cinterop_release = ((LongPointerWrapper) this.f31074l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_results_delete_all(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC2257l
    public final InterfaceC3999l billing(AbstractC6139l abstractC6139l) {
        C6067l c6067lRemoteconfig = abstractC6139l.remoteconfig();
        NativePointer nativePointer = c6067lRemoteconfig.f12835l;
        long ptr$cinterop_release = ((LongPointerWrapper) this.f31074l).getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return new C15825l(c6067lRemoteconfig, new LongPointerWrapper(realmcJNI.realm_results_resolve_in(ptr$cinterop_release, ptr$cinterop_release2), false, 2, null), this.f31073l, this.f31077l, this.f31076l);
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC9671l) {
            return super.contains((InterfaceC9671l) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = ((LongPointerWrapper) this.f31074l).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_results_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
            return null;
        }
        return AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), this.f31077l, this.f31076l, this.f31075l);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC9671l) {
            return super.indexOf((InterfaceC9671l) obj);
        }
        return -1;
    }

    @Override // defpackage.InterfaceC13092l
    public final boolean isClosed() {
        return AbstractC4338l.admob(this);
    }

    @Override // defpackage.InterfaceC3999l
    public final boolean isValid() {
        return (this.f31074l.isReleased() || this.f31075l.isClosed()) ? false : true;
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC9671l) {
            return super.lastIndexOf((InterfaceC9671l) obj);
        }
        return -1;
    }

    @Override // defpackage.InterfaceC2226l
    /* JADX INFO: renamed from: lؓۚ۟ */
    public final C10821l mo876l() {
        return AbstractC4338l.metrica(this);
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lؚؚؔ */
    public final InterfaceC3999l mo877l(C5765l c5765l) {
        NativePointer nativePointer = c5765l.f12151l;
        long ptr$cinterop_release = ((LongPointerWrapper) this.f31074l).getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return new C15825l(c5765l, new LongPointerWrapper(realmcJNI.realm_results_resolve_in(ptr$cinterop_release, ptr$cinterop_release2), false, 2, null), this.f31073l, this.f31077l, this.f31076l);
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lٌٖؖ */
    public final LongPointerWrapper mo878l(NativePointer nativePointer, C4816l c4816l) {
        long ptr$cinterop_release = ((LongPointerWrapper) this.f31074l).getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C5138l c5138l = new C5138l(25, c4816l);
        int i = AbstractC9795l.yandex;
        return new LongPointerWrapper(realmcJNI.register_results_notification_cb(ptr$cinterop_release, ptr$cinterop_release2, c5138l), false);
    }

    @Override // defpackage.InterfaceC13092l
    /* JADX INFO: renamed from: lٖۡٓ */
    public final boolean mo879l() {
        return AbstractC4338l.subs(this);
    }

    @Override // defpackage.InterfaceC2257l
    public final AbstractC6107l metrica(C12428l c12428l) {
        return new C2270l(c12428l, 4);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        long[] jArr = new long[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f31074l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_results_count(ptr$cinterop_release, jArr);
        return (int) jArr[0];
    }

    @Override // defpackage.InterfaceC13077l
    public final InterfaceC2257l vip() {
        return this;
    }
}
