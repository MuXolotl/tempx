package defpackage;

/* JADX INFO: renamed from: lَؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3380l implements InterfaceC11759l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f7202l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC11759l f7203l;

    public C3380l(InterfaceC11759l interfaceC11759l, long j) {
        this.f7203l = interfaceC11759l;
        this.f7202l = j;
    }

    @Override // defpackage.InterfaceC11759l
    public final int adcel(C10023l c10023l, C4136l c4136l, int i) {
        int iAdcel = this.f7203l.adcel(c10023l, c4136l, i);
        if (iAdcel == -4) {
            c4136l.f8496l += this.f7202l;
        }
        return iAdcel;
    }

    @Override // defpackage.InterfaceC11759l
    public final void firebase() {
        this.f7203l.firebase();
    }

    @Override // defpackage.InterfaceC11759l
    public final int smaato(long j) {
        return this.f7203l.smaato(j - this.f7202l);
    }

    @Override // defpackage.InterfaceC11759l
    public final boolean yandex() {
        return this.f7203l.yandex();
    }
}
