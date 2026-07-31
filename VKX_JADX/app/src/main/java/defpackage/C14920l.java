package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lٖٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14920l extends AbstractC3947l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f29371l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f29372l;

    @Override // defpackage.AbstractC3947l, defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return this.f29371l == 1 ? interfaceC6357l.mo1460for(i) : interfaceC6357l.crashlytics(i);
    }

    @Override // defpackage.AbstractC3947l
    /* JADX INFO: renamed from: lؘۛؕ */
    public final long mo1453l(InterfaceC6357l interfaceC6357l, long j) {
        int iMo1460for = this.f29371l == 1 ? interfaceC6357l.mo1460for(C15519l.admob(j)) : interfaceC6357l.crashlytics(C15519l.admob(j));
        if (iMo1460for < 0) {
            iMo1460for = 0;
        }
        if (iMo1460for < 0) {
            AbstractC10280l.yandex("height must be >= 0");
        }
        return AbstractC7563l.admob(0, Alert.DURATION_SHOW_INDEFINITELY, iMo1460for, iMo1460for);
    }

    @Override // defpackage.AbstractC3947l
    /* JADX INFO: renamed from: lؘٗۦ */
    public final boolean mo1454l() {
        return this.f29372l;
    }

    @Override // defpackage.AbstractC3947l, defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return this.f29371l == 1 ? interfaceC6357l.mo1460for(i) : interfaceC6357l.crashlytics(i);
    }
}
