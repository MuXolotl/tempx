package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lؗٙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4979l extends AbstractC3947l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f10176l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f10177l;

    @Override // defpackage.AbstractC3947l
    /* JADX INFO: renamed from: lؘۛؕ */
    public final long mo1453l(InterfaceC6357l interfaceC6357l, long j) {
        int iRemoteconfig = this.f10176l == 1 ? interfaceC6357l.remoteconfig(C15519l.mopub(j)) : interfaceC6357l.metrica(C15519l.mopub(j));
        if (iRemoteconfig < 0) {
            iRemoteconfig = 0;
        }
        if (iRemoteconfig < 0) {
            AbstractC10280l.yandex("width must be >= 0");
        }
        return AbstractC7563l.admob(iRemoteconfig, iRemoteconfig, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.AbstractC3947l
    /* JADX INFO: renamed from: lؘٗۦ */
    public final boolean mo1454l() {
        return this.f10177l;
    }

    @Override // defpackage.AbstractC3947l, defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return this.f10176l == 1 ? interfaceC6357l.remoteconfig(i) : interfaceC6357l.metrica(i);
    }

    @Override // defpackage.AbstractC3947l, defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return this.f10176l == 1 ? interfaceC6357l.remoteconfig(i) : interfaceC6357l.metrica(i);
    }
}
