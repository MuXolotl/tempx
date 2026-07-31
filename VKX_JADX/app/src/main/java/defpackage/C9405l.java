package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٍۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9405l extends AbstractC18026l {

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public static final C4480l f19245l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public C9789l f19246l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public InterfaceC7150l f19247l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public C15519l f19248l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public C5776l f19249l;

    static {
        C4480l c4480lYandex = AbstractC4311l.yandex();
        c4480lYandex.billing(C9735l.admob);
        c4480lYandex.remoteconfig(1.0f);
        c4480lYandex.vip(1);
        f19245l = c4480lYandex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9405l(C3654l c3654l, InterfaceC7150l interfaceC7150l) {
        super(c3654l);
        this.f19247l = interfaceC7150l;
        this.f19246l = c3654l.f7693l != null ? new C9789l(this) : null;
        this.f19249l = (((AbstractC14971l) interfaceC7150l).f29454l.f29450l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? new C5776l(this, (C8030l) interfaceC7150l) : null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    @Override // defpackage.InterfaceC6357l
    public final AbstractC10113l adcel(long j) {
        InterfaceC17792l interfaceC17792lAmazon;
        boolean z;
        if (this.f35273l) {
            C15519l c15519l = this.f19248l;
            if (c15519l == null) {
                C8339l.metrica("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = c15519l.yandex;
        }
        m2888new(j);
        C5776l c5776l = this.f19249l;
        if (c5776l != null) {
            C8030l c8030l = c5776l.f12176l;
            InterfaceC17792l interfaceC17792lMo1000l = c5776l.f12177l.f19246l.mo1000l();
            interfaceC17792lMo1000l.purchase();
            interfaceC17792lMo1000l.loadAd();
            boolean z2 = false;
            if (c8030l.f16717l.admob() && c8030l.f16717l.purchase().yandex() && c8030l.f16717l.purchase().loadAd.loadAd()) {
                z = true;
            } else {
                C15519l c15519l2 = this.f19248l;
                if (AbstractC2812l.advert(c15519l2) && j == c15519l2.yandex) {
                    z = false;
                } else {
                    z = true;
                }
            }
            c5776l.f12175l = z;
            if (!z) {
                this.f35271l.f35273l = true;
            }
            interfaceC17792lAmazon = c8030l.m2253l(c5776l, this.f35271l, j);
            this.f35271l.f35273l = false;
            if (interfaceC17792lAmazon.purchase() == this.f19246l.f20592l && interfaceC17792lAmazon.loadAd() == this.f19246l.f20591l) {
                z2 = true;
            }
            if (!c5776l.f12175l) {
                AbstractC18026l abstractC18026l = this.f35271l;
                long j2 = abstractC18026l.f20590l;
                AbstractC1668l abstractC1668lMo2645l = abstractC18026l.mo2645l();
                if (C4999l.yandex(j2, abstractC1668lMo2645l != null ? new C4999l(abstractC1668lMo2645l.m998l()) : null) && !z2) {
                    interfaceC17792lAmazon = new C0892l(interfaceC17792lAmazon, this);
                }
            }
        } else {
            interfaceC17792lAmazon = this.f19247l.amazon(this, this.f35271l, j);
        }
        m4479l(interfaceC17792lAmazon);
        m4489l();
        return this;
    }

    @Override // defpackage.AbstractC18026l, defpackage.AbstractC10113l
    /* JADX INFO: renamed from: class */
    public final void mo1459class(long j, float f, C11925l c11925l) {
        C9405l c9405l;
        if (this.f35274l) {
            c9405l = this;
            c9405l.m4478l(mo2645l().f4024l, f, null, c11925l);
        } else {
            c9405l = this;
            c9405l.m4478l(j, f, null, c11925l);
        }
        c9405l.m2646l();
    }

    @Override // defpackage.InterfaceC6357l
    public final int crashlytics(int i) {
        C5776l c5776l = this.f19249l;
        if (c5776l == null) {
            return this.f19247l.billing(this, this.f35271l, i);
        }
        C8030l c8030l = c5776l.f12176l;
        AbstractC18026l abstractC18026l = this.f35271l;
        if (!c8030l.f29454l.f29452l.mo2645l().mo991implements()) {
            return abstractC18026l.crashlytics(i);
        }
        return c8030l.m2253l(new C5879l(c5776l, c5776l.getLayoutDirection()), new C11030l(abstractC18026l, 2, 2, 2), AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    @Override // defpackage.InterfaceC6357l
    /* JADX INFO: renamed from: for */
    public final int mo1460for(int i) {
        C5776l c5776l = this.f19249l;
        if (c5776l == null) {
            return this.f19247l.mopub(this, this.f35271l, i);
        }
        C8030l c8030l = c5776l.f12176l;
        AbstractC18026l abstractC18026l = this.f35271l;
        if (!c8030l.f29454l.f29452l.mo2645l().mo991implements()) {
            return abstractC18026l.mo1460for(i);
        }
        return c8030l.m2253l(new C5879l(c5776l, c5776l.getLayoutDirection()), new C11030l(abstractC18026l, 1, 2, 2), AbstractC7563l.loadAd(0, i, 0, 0, 13)).loadAd();
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: interface */
    public final void mo883interface(long j, float f, Function1 function1) {
        if (this.f35274l) {
            m4478l(mo2645l().f4024l, f, function1, null);
        } else {
            m4478l(j, f, function1, null);
        }
        m2646l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public final void m2642l(InterfaceC7150l interfaceC7150l) {
        if (!interfaceC7150l.equals(this.f19247l)) {
            if ((((AbstractC14971l) interfaceC7150l).f29454l.f29450l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                C8030l c8030l = (C8030l) interfaceC7150l;
                C5776l c5776l = this.f19249l;
                if (c5776l != null) {
                    c5776l.f12176l = c8030l;
                } else {
                    c5776l = new C5776l(this, c8030l);
                }
                this.f19249l = c5776l;
            } else {
                this.f19249l = null;
            }
        }
        this.f19247l = interfaceC7150l;
    }

    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final AbstractC14971l mo2643l() {
        return ((AbstractC14971l) this.f19247l).f29454l;
    }

    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public final void mo2644l() {
        if (this.f19246l == null) {
            this.f19246l = new C9789l(this);
        }
    }

    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final AbstractC1668l mo2645l() {
        return this.f19246l;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public final void m2646l() {
        boolean z;
        if (this.f23554l) {
            return;
        }
        m4490l();
        AbstractC18026l abstractC18026l = this.f35271l;
        C5776l c5776l = this.f19249l;
        if (c5776l != null) {
            C9789l c9789l = this.f19246l;
            C9083l c9083l = c9789l.f4022l;
            if (c5776l.f12175l) {
                z = false;
            } else {
                if (C4999l.yandex(this.f20590l, c9789l != null ? new C4999l(c9789l.m998l()) : null)) {
                    long j = abstractC18026l.f20590l;
                    AbstractC1668l abstractC1668lMo2645l = abstractC18026l.mo2645l();
                    if (C4999l.yandex(j, abstractC1668lMo2645l != null ? new C4999l(abstractC1668lMo2645l.m998l()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            abstractC18026l.f35274l = z;
        }
        boolean z2 = abstractC18026l.f23549l;
        abstractC18026l.f23549l = this.f23549l;
        mo1000l().crashlytics();
        abstractC18026l.f23549l = z2;
        abstractC18026l.f35274l = false;
    }

    @Override // defpackage.AbstractC18026l
    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public final void mo2647l(InterfaceC14859l interfaceC14859l, C11925l c11925l) {
        AbstractC18026l abstractC18026l;
        this.f35271l.m4469l(interfaceC14859l, c11925l);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(this.f35281l)).getShowLayoutBounds() || (abstractC18026l = this.f35271l) == null) {
            return;
        }
        if (C4999l.loadAd(this.f20590l, abstractC18026l.f20590l) && C5177l.loadAd(abstractC18026l.f35291l, 0L)) {
            return;
        }
        long j = this.f20590l;
        interfaceC14859l.firebase(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f19245l);
    }

    @Override // defpackage.InterfaceC6357l
    public final int metrica(int i) {
        C5776l c5776l = this.f19249l;
        if (c5776l == null) {
            return this.f19247l.yandex(this, this.f35271l, i);
        }
        C8030l c8030l = c5776l.f12176l;
        AbstractC18026l abstractC18026l = this.f35271l;
        if (!c8030l.f29454l.f29452l.mo2645l().mo991implements()) {
            return abstractC18026l.metrica(i);
        }
        return c8030l.m2253l(new C5879l(c5776l, c5776l.getLayoutDirection()), new C11030l(abstractC18026l, 2, 1, 2), AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final int mo2648public(AbstractC12914l abstractC12914l) {
        C9789l c9789l = this.f19246l;
        if (c9789l == null) {
            return AbstractC3872l.loadAd(this, abstractC12914l);
        }
        C7661l c7661l = c9789l.f4025l;
        int iAmazon = c7661l.amazon(abstractC12914l);
        return iAmazon >= 0 ? c7661l.crashlytics[iAmazon] : RecyclerView.UNDEFINED_DURATION;
    }

    @Override // defpackage.InterfaceC6357l
    public final int remoteconfig(int i) {
        C5776l c5776l = this.f19249l;
        if (c5776l == null) {
            return this.f19247l.subs(this, this.f35271l, i);
        }
        C8030l c8030l = c5776l.f12176l;
        AbstractC18026l abstractC18026l = this.f35271l;
        if (!c8030l.f29454l.f29452l.mo2645l().mo991implements()) {
            return abstractC18026l.remoteconfig(i);
        }
        return c8030l.m2253l(new C5879l(c5776l, c5776l.getLayoutDirection()), new C11030l(abstractC18026l, 1, 1, 2), AbstractC7563l.loadAd(0, 0, 0, i, 7)).purchase();
    }
}
