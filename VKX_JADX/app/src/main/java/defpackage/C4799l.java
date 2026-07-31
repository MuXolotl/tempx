package defpackage;

/* JADX INFO: renamed from: lَؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4799l extends C17134l implements InterfaceC11333l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final C14965l f9845l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final InterfaceC8850l f9846l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final C14036l f9847l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final InterfaceC3588l f9848l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final C5557l f9849l;

    public C4799l(InterfaceC8371l interfaceC8371l, C17134l c17134l, InterfaceC3841l interfaceC3841l, C3498l c3498l, int i, C14036l c14036l, InterfaceC3588l interfaceC3588l, C14965l c14965l, C5557l c5557l, InterfaceC8850l interfaceC8850l, InterfaceC5706l interfaceC5706l) {
        super(interfaceC8371l, c17134l, interfaceC3841l, c3498l, i, interfaceC5706l == null ? InterfaceC5706l.f12087l : interfaceC5706l);
        this.f9847l = c14036l;
        this.f9848l = interfaceC3588l;
        this.f9845l = c14965l;
        this.f9849l = c5557l;
        this.f9846l = interfaceC8850l;
    }

    @Override // defpackage.InterfaceC13847l
    /* JADX INFO: renamed from: goto */
    public final C14965l mo678goto() {
        return this.f9845l;
    }

    @Override // defpackage.C17134l, defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final AbstractC10175l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        C4799l c4799l = new C4799l(interfaceC8371l, (C17134l) interfaceC4884l, interfaceC3841l, c3498l == null ? getName() : c3498l, i, this.f9847l, this.f9848l, this.f9845l, this.f9849l, this.f9846l, interfaceC5706l);
        c4799l.f20733l = this.f20733l;
        return c4799l;
    }

    @Override // defpackage.InterfaceC13847l
    /* JADX INFO: renamed from: private */
    public final AbstractC14080l mo682private() {
        return this.f9847l;
    }

    @Override // defpackage.InterfaceC13847l
    /* JADX INFO: renamed from: this */
    public final InterfaceC3588l mo683this() {
        return this.f9848l;
    }

    @Override // defpackage.InterfaceC13847l
    /* JADX INFO: renamed from: try */
    public final InterfaceC8850l mo684try() {
        return this.f9846l;
    }
}
