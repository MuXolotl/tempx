package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِؐۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11541l extends AbstractC5288l {
    public final /* synthetic */ int amazon = 1;
    public final /* synthetic */ Object purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11541l(C11941l c11941l) {
        super(C9510l.ads, true);
        this.purchase = c11941l;
    }

    @Override // defpackage.AbstractC5288l
    public void amazon(C0005l c0005l) {
        switch (this.amazon) {
            case 0:
                ((AbstractC17054l) this.purchase).mo2012l(new C0560l(c0005l));
                break;
        }
    }

    @Override // defpackage.AbstractC5288l
    public final void crashlytics() {
        int i = this.amazon;
        Object obj = this.purchase;
        switch (i) {
            case 0:
                ((AbstractC17054l) obj).mo2013l();
                break;
            default:
                Function0 function0 = ((C11941l) obj).f23797l;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }

    @Override // defpackage.AbstractC5288l
    public void loadAd() {
        switch (this.amazon) {
            case 0:
                ((AbstractC17054l) this.purchase).mo2014l();
                break;
        }
    }

    @Override // defpackage.AbstractC5288l
    public void purchase(C0005l c0005l) {
        switch (this.amazon) {
            case 0:
                ((AbstractC17054l) this.purchase).mo2015l();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11541l(AbstractC17054l abstractC17054l, AbstractC5103l abstractC5103l) {
        super(abstractC5103l, false);
        this.purchase = abstractC17054l;
    }
}
