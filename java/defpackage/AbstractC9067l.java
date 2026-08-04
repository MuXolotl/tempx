package defpackage;

/* JADX INFO: renamed from: lٌۜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9067l extends AbstractC14971l implements InterfaceC11189l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public InterfaceC10137l f18656l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC10137l f18657l;

    public AbstractC9067l() {
        C12591l c12591l = AbstractC14760l.smaato;
        this.f18657l = c12591l;
        this.f18656l = c12591l;
    }

    @Override // defpackage.InterfaceC11189l
    public final Object adcel() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public void mo535l() {
        this.f18656l = this.f18657l;
        AbstractC13359l.subs(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C14850l(this, 0));
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public void mo511l() {
        AbstractC13359l.mopub(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C14850l(this, 1));
        mo2588l();
    }

    /* JADX INFO: renamed from: lؘۛؕ */
    public abstract InterfaceC10137l mo2149l(InterfaceC10137l interfaceC10137l);

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        this.f18657l = AbstractC14760l.smaato;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public void mo2588l() {
        this.f18656l = mo2149l(this.f18657l);
        AbstractC13359l.subs(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C14850l(this, 0));
    }
}
