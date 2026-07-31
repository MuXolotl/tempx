package defpackage;

/* JADX INFO: renamed from: lّ٘٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17873l implements InterfaceC9573l {
    public static final /* synthetic */ InterfaceC13922l[] purchase = {AbstractC18202l.yandex.billing(new C0114l(C17873l.class, "isEnabled", "isEnabled()Z", 0))};
    public final C17838l amazon;
    public final C8108l crashlytics;
    public final C3464l loadAd;
    public final InterfaceC9573l yandex;

    public C17873l(InterfaceC9573l interfaceC9573l, boolean z, int i) {
        C3464l c3464l = new C3464l();
        this.yandex = interfaceC9573l;
        this.loadAd = c3464l;
        int i2 = 0;
        int i3 = 1;
        C0382l c0382l = new C0382l(i3, c3464l, C3464l.class, "startPredictiveBack", "startPredictiveBack(Lcom/arkivanov/essenty/backhandler/BackEvent;)Z", 8, i2);
        int i4 = 0;
        C17847l c17847l = new C17847l(i3, c3464l, C3464l.class, "progressPredictiveBack", "progressPredictiveBack(Lcom/arkivanov/essenty/backhandler/BackEvent;)V", i4, i2, 11);
        int i5 = 0;
        this.crashlytics = new C8108l(false, i, c0382l, c17847l, new C6335l(i5, c3464l, C3464l.class, "cancelPredictiveBack", "cancelPredictiveBack()V", i4, i2, 20), new C10239l(i5, c3464l, C3464l.class, "back", "back()Z", 8, 1));
        this.amazon = new C17838l(Boolean.valueOf(z), this, 1);
        c3464l.crashlytics = AbstractC9905l.admob(c3464l.crashlytics, new C15079l(10, this));
    }

    public final void amazon() {
        InterfaceC9573l interfaceC9573l = this.yandex;
        C8108l c8108l = this.crashlytics;
        if (interfaceC9573l.loadAd(c8108l)) {
            return;
        }
        interfaceC9573l.yandex(c8108l);
    }

    public final void billing() {
        InterfaceC13922l interfaceC13922l = purchase[0];
        this.crashlytics.crashlytics.crashlytics(C8108l.admob[0], Boolean.valueOf(((Boolean) this.amazon.yandex).booleanValue() && this.loadAd.purchase()));
    }

    @Override // defpackage.InterfaceC9573l
    public final void crashlytics(C8108l c8108l) {
        this.loadAd.crashlytics(c8108l);
    }

    @Override // defpackage.InterfaceC9573l
    public final boolean loadAd(C8108l c8108l) {
        return this.loadAd.yandex.contains(c8108l);
    }

    public final void purchase() {
        InterfaceC9573l interfaceC9573l = this.yandex;
        C8108l c8108l = this.crashlytics;
        if (interfaceC9573l.loadAd(c8108l)) {
            interfaceC9573l.crashlytics(c8108l);
        }
    }

    @Override // defpackage.InterfaceC9573l
    public final void yandex(C8108l c8108l) {
        this.loadAd.yandex(c8108l);
    }
}
