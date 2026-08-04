package defpackage;

/* JADX INFO: renamed from: lًَؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10157l extends AbstractC7581l implements InterfaceC4367l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C14750l f20673l;

    public C10157l(C14750l c14750l) {
        this.f20673l = c14750l;
    }

    @Override // defpackage.InterfaceC4367l
    public final InterfaceC7042l getParent() {
        C14750l c14750l = this.f15589l;
        if (c14750l != null) {
            return c14750l;
        }
        return null;
    }

    @Override // defpackage.AbstractC7581l
    public final void isPro(Throwable th) {
        C14750l c14750l = this.f15589l;
        if (c14750l == null) {
            c14750l = null;
        }
        this.f20673l.pro(c14750l);
    }

    @Override // defpackage.InterfaceC4367l
    public final boolean isVip(Throwable th) {
        C14750l c14750l = this.f15589l;
        if (c14750l == null) {
            c14750l = null;
        }
        return c14750l.applovin(th);
    }

    @Override // defpackage.AbstractC7581l
    public final boolean subs() {
        return true;
    }
}
