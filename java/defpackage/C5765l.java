package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_version_id_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lؘٙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5765l implements InterfaceC7832l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11513l f12150l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final NativePointer f12151l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC17054l f12152l;

    public C5765l(AbstractC17054l abstractC17054l, NativePointer nativePointer, C11513l c11513l) {
        this.f12152l = abstractC17054l;
        this.f12151l = nativePointer;
        this.f12150l = c11513l;
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_begin_read(ptr$cinterop_release);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5765l)) {
            return false;
        }
        C5765l c5765l = (C5765l) obj;
        return AbstractC8576l.yandex(this.f12152l, c5765l.f12152l) && this.f12151l.equals(c5765l.f12151l) && AbstractC8576l.yandex(this.f12150l, c5765l.f12150l);
    }

    public final int hashCode() {
        return this.f12150l.hashCode() + ((this.f12151l.hashCode() + (this.f12152l.hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC13092l
    public final boolean isClosed() {
        return AbstractC4338l.mopub(this);
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final AbstractC17054l mo1843l() {
        return this.f12152l;
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public final void mo1844l() {
        AbstractC4338l.yandex(this);
    }

    @Override // defpackage.InterfaceC2226l
    /* JADX INFO: renamed from: lؓۚ۟ */
    public final C10821l mo876l() {
        return AbstractC4338l.vip(this);
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public final NativePointer mo1845l() {
        return this.f12151l;
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final C6067l mo1846l() {
        C8339l.smaato("Cannot modify managed objects outside of a write transaction");
        return null;
    }

    @Override // defpackage.InterfaceC7832l
    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final C11513l mo1847l() {
        return this.f12150l;
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
        return "FrozenRealmReferenceImpl(owner=" + this.f12152l + ", dbPointer=" + this.f12151l + ", schemaMetadata=" + this.f12150l + ")";
    }

    public final C10821l yandex() {
        long jNew_realm_version_id_t = realmcJNI.new_realm_version_id_t();
        realm_version_id_t realm_version_id_tVar = new realm_version_id_t();
        realm_version_id_tVar.loadAd = true;
        realm_version_id_tVar.yandex = jNew_realm_version_id_t;
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f12151l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_version_id(ptr$cinterop_release, zArr, realm_version_id_tVar.yandex, realm_version_id_tVar);
        if (zArr[0]) {
            return new C10821l(realmcJNI.realm_version_id_t_version_get(realm_version_id_tVar.yandex, realm_version_id_tVar));
        }
        C8339l.smaato("No VersionId was available. Reading the VersionId requires a valid read transaction.");
        return null;
    }
}
