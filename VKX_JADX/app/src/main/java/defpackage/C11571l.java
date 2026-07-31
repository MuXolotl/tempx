package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lِؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11571l extends AbstractC17332l {
    public final AbstractC1872l amazon;
    public final C8688l billing;
    public final C8490l crashlytics = AbstractC3861l.loadAd(0, 2, 2);
    public final C2494l loadAd;
    public final C8688l purchase;
    public final C5198l yandex;

    public C11571l(C5198l c5198l, C2494l c2494l) {
        this.yandex = c5198l;
        this.loadAd = c2494l;
        this.amazon = ((InterfaceC16228l) c2494l.f5291l).mo1176l();
        C8688l c8688l = new C8688l(new C5767l(16, this));
        this.purchase = c8688l;
        this.billing = c8688l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object admob(AbstractC0283l abstractC0283l) {
        C5024l c5024l;
        if (abstractC0283l instanceof C5024l) {
            c5024l = (C5024l) abstractC0283l;
            int i = c5024l.f10281l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5024l.f10281l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5024l = new C5024l(this, abstractC0283l);
            }
        } else {
            c5024l = new C5024l(this, abstractC0283l);
        }
        Object obj = c5024l.f10280l;
        int i2 = c5024l.f10281l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (!this.purchase.yandex()) {
                C17972l c17972l = new C17972l(this, interfaceC14029l, 21);
                c5024l.f10281l = 1;
                Object objFirebase = AbstractC10999l.firebase(this.amazon, c17972l, c5024l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return new C8084l(this.crashlytics, null);
    }

    public final AbstractC6139l billing() {
        return (AbstractC6139l) this.billing.getValue();
    }

    public final InterfaceC1220l mopub() {
        return this.purchase;
    }
}
