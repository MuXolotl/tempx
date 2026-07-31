package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؕۤۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3753l implements InterfaceC9354l {
    public long amazon;
    public final C18476l crashlytics = new C18476l();
    public final InterfaceC9354l loadAd;
    public long purchase;

    public C3753l(InterfaceC9354l interfaceC9354l) {
        this.loadAd = interfaceC9354l;
    }

    @Override // defpackage.InterfaceC9354l
    public final boolean admob() {
        return this.crashlytics.subs() && this.loadAd.admob();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC9354l
    public final Object amazon(int i, AbstractC0283l abstractC0283l) {
        C15374l c15374l;
        if (abstractC0283l instanceof C15374l) {
            c15374l = (C15374l) abstractC0283l;
            int i2 = c15374l.f30043l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15374l.f30043l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15374l = new C15374l(this, abstractC0283l);
            }
        } else {
            c15374l = new C15374l(this, abstractC0283l);
        }
        Object objAmazon = c15374l.f30042l;
        int i3 = c15374l.f30043l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objAmazon);
            crashlytics();
            if (this.crashlytics.f36079l >= i) {
                return Boolean.TRUE;
            }
            c15374l.f30043l = 1;
            objAmazon = this.loadAd.amazon(i, c15374l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAmazon);
        }
        if (!((Boolean) objAmazon).booleanValue()) {
            return Boolean.FALSE;
        }
        crashlytics();
        return Boolean.TRUE;
    }

    public final void crashlytics() {
        purchase();
        this.amazon += this.crashlytics.isVip(this.loadAd.mopub());
    }

    @Override // defpackage.InterfaceC9354l
    public final Throwable loadAd() {
        return this.loadAd.loadAd();
    }

    @Override // defpackage.InterfaceC9354l
    public final C18476l mopub() {
        crashlytics();
        return this.crashlytics;
    }

    public final void purchase() {
        long j = this.purchase;
        long j2 = this.amazon;
        long j3 = this.crashlytics.f36079l;
        this.purchase = (j2 - j3) + j;
        this.amazon = j3;
    }

    @Override // defpackage.InterfaceC9354l
    public final void yandex(Throwable th) {
        this.loadAd.yandex(th);
    }
}
