package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِۖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12044l extends AbstractC11340l implements InterfaceC3703l, InterfaceC3506l, InterfaceC16031l, InterfaceC1905l, InterfaceC11189l {

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C13975l f23964l = new C13975l(2);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C6543l f23965l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public InterfaceC18212l f23966l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C15920l f23967l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C7008l f23968l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C2403l f23969l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final Function1 f23970l;

    public C12044l(C2403l c2403l, int i, Function1 function1) {
        this.f23969l = c2403l;
        this.f23970l = function1;
        C6543l c6543l = new C6543l(i, new C14959l(2, this, C12044l.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 4), 10);
        m3069l(c6543l);
        this.f23965l = c6543l;
    }

    @Override // defpackage.InterfaceC11189l
    public final Object adcel() {
        return f23964l;
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3506l
    /* JADX INFO: renamed from: for */
    public final void mo1346for(InterfaceC18212l interfaceC18212l) {
        this.f23966l = interfaceC18212l;
        if (this.f23965l.m2028l().loadAd()) {
            boolean zMopub = interfaceC18212l.mopub();
            C16222l c16222l = AbstractC8340l.f17267l;
            if (!zMopub) {
                if (this.f29462l) {
                    AbstractC13359l.purchase(this, c16222l);
                }
            } else {
                InterfaceC18212l interfaceC18212l2 = this.f23966l;
                if (interfaceC18212l2 != null && interfaceC18212l2.mopub() && this.f29462l) {
                    AbstractC13359l.purchase(this, c16222l);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        boolean zLoadAd = this.f23965l.m2028l().loadAd();
        InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
        C4707l c4707l = AbstractC0424l.smaato;
        InterfaceC13922l interfaceC13922l = AbstractC3668l.yandex[4];
        interfaceC17593l.amazon(c4707l, Boolean.valueOf(zLoadAd));
        interfaceC17593l.amazon(AbstractC16601l.pro, new C7629l(null, new C13246l(0, this, C12044l.class, "requestFocus", "requestFocus()Z", 0, 0, 10)));
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void m3354l(C2403l c2403l) {
        C7008l c7008l;
        if (AbstractC8576l.yandex(this.f23969l, c2403l)) {
            return;
        }
        C2403l c2403l2 = this.f23969l;
        if (c2403l2 != null && (c7008l = this.f23968l) != null) {
            c2403l2.loadAd(new C17768l(c7008l));
        }
        this.f23968l = null;
        this.f23969l = c2403l;
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        C15920l c15920l = this.f23967l;
        if (c15920l != null) {
            c15920l.loadAd();
        }
        this.f23967l = null;
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void m3355l(C2403l c2403l, InterfaceC12553l interfaceC12553l) {
        if (!this.f29462l) {
            c2403l.loadAd(interfaceC12553l);
            return;
        }
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) ((C18662l) m3914l()).f36440l.mo245l(C1083l.f2996l);
        AbstractC10999l.mopub(m3914l(), null, 0, new C4647l(c2403l, interfaceC12553l, interfaceC7042l != null ? interfaceC7042l.mo2154l(new C3005l(c2403l, interfaceC12553l, 13)) : null, (InterfaceC14029l) null, 17), 3);
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while */
    public final void mo540while() {
        C10700l c10700l = new C10700l();
        AbstractC3700l.admob(this, new C12242l(c10700l, this, 17));
        C15920l c15920l = (C15920l) c10700l.f21708l;
        if (this.f23965l.m2028l().loadAd()) {
            C15920l c15920l2 = this.f23967l;
            if (c15920l2 != null) {
                c15920l2.loadAd();
            }
            if (c15920l != null) {
                c15920l.yandex();
            } else {
                c15920l = null;
            }
            this.f23967l = c15920l;
        }
    }

    public /* synthetic */ C12044l(C2403l c2403l, C6438l c6438l, int i) {
        this(c2403l, 1, (i & 4) != 0 ? null : c6438l);
    }
}
