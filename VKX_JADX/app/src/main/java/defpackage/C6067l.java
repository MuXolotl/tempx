package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lؘۣۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6067l implements InterfaceC7832l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11561l f12834l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final NativePointer f12835l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC17054l f12836l;

    public C6067l(AbstractC17054l abstractC17054l, NativePointer nativePointer) {
        this.f12836l = abstractC17054l;
        this.f12835l = nativePointer;
        this.f12834l = AbstractC1805l.crashlytics(new C11513l(nativePointer, ((C12125l) abstractC17054l.f33215l).purchase.values()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6067l)) {
            return false;
        }
        C6067l c6067l = (C6067l) obj;
        return this.f12836l.equals(c6067l.f12836l) && AbstractC8576l.yandex(this.f12835l, c6067l.f12835l);
    }

    public final int hashCode() {
        return this.f12835l.hashCode() + (this.f12836l.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC13092l
    public final boolean isClosed() {
        return AbstractC4338l.mopub(this);
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lًؑٝ */
    public final AbstractC17054l mo1843l() {
        return this.f12836l;
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lؑۨٝ */
    public final void mo1844l() {
        AbstractC4338l.yandex(this);
    }

    @Override // defpackage.InterfaceC2226l
    /* JADX INFO: renamed from: lؓۚ۟ */
    public final C10821l mo876l() {
        return AbstractC4338l.vip(this);
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lٍؘؘ */
    public final NativePointer mo1845l() {
        return this.f12835l;
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lؘْٔ */
    public final C6067l mo1846l() {
        AbstractC4338l.yandex(this);
        return this;
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final C11513l mo1847l() {
        return (C11513l) this.f12834l.yandex;
    }

    @Override // defpackage.InterfaceC13092l
    /* JADX INFO: renamed from: lٖۡٓ */
    public final boolean mo879l() {
        mo1844l();
        long ptr$cinterop_release = ((LongPointerWrapper) mo1845l()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return realmcJNI.realm_is_frozen(ptr$cinterop_release);
    }

    public final String toString() {
        return "LiveRealmReference(owner=" + this.f12836l + ", dbPointer=" + this.f12835l + ")";
    }

    public final C5765l yandex(AbstractC17054l abstractC17054l) {
        long ptr$cinterop_release = ((LongPointerWrapper) this.f12835l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return new C5765l(abstractC17054l, new LongPointerWrapper(realmcJNI.realm_freeze(ptr$cinterop_release), false, 2, null), mo1847l());
    }
}
