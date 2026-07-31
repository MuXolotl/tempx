package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lٌؘْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5649l implements InterfaceC3736l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16903l f11999l;

    public C5649l(C16903l c16903l) {
        this.f11999l = c16903l;
    }

    @Override // defpackage.InterfaceC3736l
    public final Status amazon() {
        return Status.f580l;
    }

    public final String toString() {
        C16903l c16903l = this.f11999l;
        AbstractC1051l.subs(c16903l);
        return "OptInOptionsResultImpl[" + (c16903l.f32958l == 1) + "]";
    }
}
