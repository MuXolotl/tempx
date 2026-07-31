package defpackage;

/* JADX INFO: renamed from: lًْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8030l extends AbstractC14971l implements InterfaceC16388l, InterfaceC18141l, InterfaceC1905l, InterfaceC16031l, InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f16716l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C0633l f16717l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C8896l f16718l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C7779l f16719l;

    public C8030l(C0633l c0633l) {
        this.f16717l = c0633l;
        C5138l c5138l = AbstractC15033l.yandex;
        C7779l c7779l = new C7779l(c5138l);
        c7779l.smaato(c5138l, c0633l);
        this.f16719l = c7779l;
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C16925l(abstractC10113lAdcel, this));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        InterfaceC18212l interfaceC18212l = this.f16717l.purchase().loadAd.f28636l;
        if (interfaceC18212l != null) {
            this.f16718l = (interfaceC18212l.mopub() && this.f16716l) ? AbstractC7470l.isPro(C1187l.admob(AbstractC5573l.vip(this).mo2591strictfp(0L), interfaceC18212l.mo2591strictfp(0L)), AbstractC14707l.mopub(AbstractC5573l.vip(this).f20590l)) : null;
        }
        m2254l(null);
        C0633l c0633l = this.f16717l;
        c0633l.f2096l = null;
        c0633l.f2093l = null;
        c0633l.f2089l.setValue(Boolean.FALSE);
        this.f16716l = false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        AbstractC3700l.admob(this, this.f16717l.purchase().subs);
        C5138l c5138l = AbstractC15033l.yandex;
        C0633l c0633l = this.f16717l;
        C4761l c4761l = C4761l.loadAd;
        C7779l c7779l = this.f16719l;
        if (c7779l == c4761l) {
            AbstractC0081l.yandex("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!c7779l.crashlytics(c5138l)) {
            AbstractC0081l.yandex("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + c5138l + " was not found.");
        }
        c7779l.smaato(c5138l, c0633l);
        this.f16717l.f2096l = (C0633l) AbstractC15560l.yandex(this, c5138l);
        m2254l(null);
        this.f16716l = false;
        C0633l c0633l2 = this.f16717l;
        c0633l2.f2093l = this;
        c0633l2.f2089l.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final InterfaceC17792l m2253l(InterfaceC2538l interfaceC2538l, InterfaceC6357l interfaceC6357l, long j) {
        long jSmaato;
        C8896l c8896lCrashlytics = this.f16717l.amazon().crashlytics();
        if (c8896lCrashlytics == null) {
            C17724l c17724l = this.f16717l.purchase().crashlytics;
            c17724l.license();
            c8896lCrashlytics = c17724l.tapsense().billing((C14509l) c17724l.amazon);
        }
        if (c8896lCrashlytics != null) {
            long jPurchase = AbstractC14707l.purchase(c8896lCrashlytics.mopub());
            int i = (int) (jPurchase >> 32);
            int i2 = (int) (jPurchase & 4294967295L);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                C18073l.tapsense("Error: Infinite width/height is invalid. animated bounds: ", this.f16717l.amazon().crashlytics(), ", current bounds: ", this.f16717l.purchase().crashlytics.tapsense().crashlytics());
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (!((i2 >= 0) & (i >= 0))) {
                AbstractC10280l.yandex("width and height must be >= 0");
            }
            j = AbstractC7563l.admob(i, i, i2, i2);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        if (this.f16717l.purchase().crashlytics.tapsense().amazon()) {
            InterfaceC5575l interfaceC5575l = (InterfaceC5575l) this.f16717l.f2095l.getValue();
            jSmaato = this.f16717l.purchase().loadAd.f28635l.yandex(AbstractC5573l.vip(this)).smaato();
            int i3 = abstractC10113lAdcel.f20592l;
            int i4 = abstractC10113lAdcel.f20591l;
            interfaceC5575l.getClass();
        } else {
            jSmaato = (((long) abstractC10113lAdcel.f20592l) << 32) | (((long) abstractC10113lAdcel.f20591l) & 4294967295L);
        }
        return interfaceC2538l.isVip((int) (jSmaato >> 32), (int) (4294967295L & jSmaato), C14054l.f27396l, new C16925l(this, abstractC10113lAdcel));
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        C8896l c8896lCrashlytics = this.f16717l.purchase().crashlytics.tapsense().crashlytics();
        boolean zMopub = this.f16717l.mopub();
        C0633l c0633l = this.f16717l;
        C9902l c9902l = null;
        if (!zMopub) {
            c0633l.f2090l = null;
            m2254l(null);
            C0633l c0633l2 = this.f16717l;
            if (!c0633l2.purchase().crashlytics.tapsense().amazon() || (!c0633l2.mopub() && c0633l2.billing())) {
                c6742l.yandex();
                return;
            }
            return;
        }
        if (c8896lCrashlytics != null) {
            C9144l c9144l = (C9144l) c0633l.f2087l.getValue();
            C8832l c8832l = (C8832l) this.f16717l.f2094l.getValue();
            c6742l.getLayoutDirection();
            InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
            c9144l.getClass();
            C0633l c0633l3 = (C0633l) c8832l.crashlytics.getValue();
            if (c0633l3 == null) {
                C8339l.metrica("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
            C0633l c0633l4 = c0633l3.f2096l;
            C8832l c8832l2 = c0633l4 != null ? (C8832l) c0633l4.f2094l.getValue() : null;
            if (c8832l2 != null) {
                C0633l c0633l5 = (C0633l) c8832l2.crashlytics.getValue();
                if (c0633l5 == null) {
                    C8339l.metrica("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                    return;
                }
                c9902l = c0633l5.f2090l;
            }
        }
        c0633l.f2090l = c9902l;
        if (((C11925l) this.f16717l.f2084l.getValue()) == null) {
            m2254l(AbstractC5573l.remoteconfig(this).crashlytics());
        }
        C11925l c11925l = (C11925l) this.f16717l.f2084l.getValue();
        if (c11925l == null) {
            C8339l.smaato("Error: shared element does not have a layer for rendering in the overlay.");
            return;
        }
        c6742l.subscription(AbstractC14707l.billing(c6742l.admob()), c11925l, new C10065l(c6742l, c8896lCrashlytics, this));
        C0633l c0633l6 = this.f16717l;
        if (!c0633l6.purchase().crashlytics.tapsense().amazon() || (!c0633l6.mopub() && c0633l6.billing())) {
            AbstractC2576l.loadAd(c6742l, c11925l);
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        this.f16718l = null;
        m2254l(null);
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final void m2254l(C11925l c11925l) {
        C11925l c11925l2 = (C11925l) this.f16717l.f2084l.getValue();
        if (AbstractC8576l.yandex(c11925l, c11925l2)) {
            return;
        }
        if (c11925l2 != null) {
            AbstractC5573l.remoteconfig(this).yandex(c11925l2);
        }
        this.f16717l.f2084l.setValue(c11925l);
    }

    @Override // defpackage.InterfaceC18141l
    /* JADX INFO: renamed from: lؚْٟ */
    public final /* synthetic */ Object mo1496l(C5138l c5138l) {
        return AbstractC15560l.yandex(this, c5138l);
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final InterfaceC18212l m2255l() {
        InterfaceC18212l interfaceC18212l = this.f16717l.purchase().loadAd.f28636l;
        if (interfaceC18212l != null) {
            return interfaceC18212l;
        }
        C8339l.metrica("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC18141l
    /* JADX INFO: renamed from: new */
    public final AbstractC17195l mo1499new() {
        return this.f16719l;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while */
    public final void mo540while() {
        this.f16717l.purchase().purchase();
        AbstractC3700l.admob(this, this.f16717l.purchase().subs);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
