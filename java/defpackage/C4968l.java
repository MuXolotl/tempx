package defpackage;

/* JADX INFO: renamed from: lؗٙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4968l {
    public C11140l firebase;
    public C11140l isPro;
    public C11140l smaato;
    public C11140l subs;
    public AbstractC16431l yandex = new C10978l();
    public AbstractC16431l loadAd = new C10978l();
    public AbstractC16431l crashlytics = new C10978l();
    public AbstractC16431l amazon = new C10978l();
    public InterfaceC13600l purchase = new C16304l(0.0f);
    public InterfaceC13600l billing = new C16304l(0.0f);
    public InterfaceC13600l mopub = new C16304l(0.0f);
    public InterfaceC13600l admob = new C16304l(0.0f);

    public C4968l() {
        int i = 0;
        this.subs = new C11140l(i);
        this.isPro = new C11140l(i);
        this.firebase = new C11140l(i);
        this.smaato = new C11140l(i);
    }

    public final C12564l yandex() {
        C12564l c12564l = new C12564l();
        c12564l.yandex = this.yandex;
        c12564l.loadAd = this.loadAd;
        c12564l.crashlytics = this.crashlytics;
        c12564l.amazon = this.amazon;
        c12564l.purchase = this.purchase;
        c12564l.billing = this.billing;
        c12564l.mopub = this.mopub;
        c12564l.admob = this.admob;
        c12564l.subs = this.subs;
        c12564l.isPro = this.isPro;
        c12564l.firebase = this.firebase;
        c12564l.smaato = this.smaato;
        return c12564l;
    }
}
