package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lؒۛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1332l implements InterfaceC17603l, InterfaceC14681l, InterfaceC3999l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC7832l f3419l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1388l f3420l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f3421l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final LongPointerWrapper f3422l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C5501l f3423l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2330l f3424l;

    public C1332l(String str, InterfaceC1388l interfaceC1388l, InterfaceC7832l interfaceC7832l, C5501l c5501l, LongPointerWrapper longPointerWrapper) {
        this.f3421l = str;
        this.f3420l = interfaceC1388l;
        this.f3419l = interfaceC7832l;
        this.f3423l = c5501l;
        this.f3422l = longPointerWrapper;
        this.f3424l = interfaceC7832l.mo1847l().yandex(str);
    }

    @Override // defpackage.InterfaceC17603l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final InterfaceC7832l mo875abstract() {
        return this.f3419l;
    }

    @Override // defpackage.InterfaceC14681l
    public final void amazon() {
        if (this.f3419l.mo879l()) {
            C8339l.metrica("Frozen objects cannot be deleted. They must be converted to live objects first by using `MutableRealm/DynamicMutableRealm.findLatest(frozenObject)`.");
        } else {
            if (!isValid()) {
                C8339l.metrica("Cannot perform this operation on an invalid/deleted object");
                return;
            }
            long ptr$cinterop_release = this.f3422l.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_object_delete(ptr$cinterop_release);
        }
    }

    @Override // defpackage.InterfaceC2257l
    public final InterfaceC3999l billing(AbstractC6139l abstractC6139l) {
        return purchase(abstractC6139l.remoteconfig(), this.f3420l);
    }

    public final C0717l crashlytics(String str) {
        return this.f3424l.loadAd(str);
    }

    @Override // defpackage.InterfaceC13092l
    public final boolean isClosed() {
        return AbstractC4338l.admob(this);
    }

    @Override // defpackage.InterfaceC3999l
    public final boolean isValid() {
        LongPointerWrapper longPointerWrapper = this.f3422l;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return realmcJNI.realm_object_is_valid(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final C1332l mo877l(InterfaceC7832l interfaceC7832l) {
        NativePointer nativePointerMo1845l = interfaceC7832l.mo1845l();
        long[] jArr = {0};
        long ptr$cinterop_release = this.f3422l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointerMo1845l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_object_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C1332l(this.f3421l, this.f3420l, interfaceC7832l, this.f3423l, longPointerWrapper);
        }
        return null;
    }

    @Override // defpackage.InterfaceC2226l
    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public final C10821l mo876l() {
        return this.f3419l.mo876l();
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final LongPointerWrapper mo878l(NativePointer nativePointer, C4816l c4816l) {
        long ptr$cinterop_release = this.f3422l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C13161l c13161l = new C13161l(c4816l);
        int i = AbstractC9795l.yandex;
        return new LongPointerWrapper(realmcJNI.register_notification_cb(ptr$cinterop_release, 0, ptr$cinterop_release2, c13161l), false);
    }

    @Override // defpackage.InterfaceC13092l
    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final boolean mo879l() {
        return this.f3419l.mo879l();
    }

    @Override // defpackage.InterfaceC2257l
    public final AbstractC6107l metrica(C12428l c12428l) {
        return new C2270l(c12428l, 0);
    }

    public final C1332l purchase(InterfaceC7832l interfaceC7832l, InterfaceC1388l interfaceC1388l) {
        NativePointer nativePointerMo1845l = interfaceC7832l.mo1845l();
        long[] jArr = {0};
        long ptr$cinterop_release = this.f3422l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointerMo1845l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_object_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C1332l(this.f3421l, interfaceC1388l, interfaceC7832l, this.f3423l, longPointerWrapper);
        }
        return null;
    }

    public final void yandex() {
        if (isValid()) {
            return;
        }
        C8339l.smaato("Cannot perform this operation on an invalid/deleted object");
    }

    @Override // defpackage.InterfaceC13077l
    public final InterfaceC2257l vip() {
        return this;
    }
}
