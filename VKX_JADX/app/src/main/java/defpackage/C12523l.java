package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lَّۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12523l implements InterfaceC14961l {
    public C14249l amazon;
    public int crashlytics;
    public final C16864l loadAd;
    public final int yandex;

    public C12523l(int i, C16864l c16864l) {
        this.yandex = i;
        this.loadAd = c16864l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC14961l
    public final Object yandex(C6806l c6806l, AbstractC0283l abstractC0283l) {
        C14065l c14065l;
        if (abstractC0283l instanceof C14065l) {
            c14065l = (C14065l) abstractC0283l;
            int i = c14065l.f27415l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14065l.f27415l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14065l = new C14065l(this, abstractC0283l);
            }
        } else {
            c14065l = new C14065l(this, abstractC0283l);
        }
        Object objLoadAd = c14065l.f27414l;
        int i2 = c14065l.f27415l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C14249l c14249l = this.amazon;
            if (c14249l != null) {
                AbstractC11990l.billing(c14249l, null);
            }
            int i3 = this.crashlytics;
            int i4 = this.yandex;
            if (i3 >= i4) {
                throw new C17072l(AbstractC15560l.tapsense("Max send count ", i4, " exceeded. Consider increasing the property maxSendCount if more is required."), 10);
            }
            this.crashlytics = i3 + 1;
            C8403l c8403l = this.loadAd.f32914l;
            Object obj = c6806l.amazon;
            c14065l.f27415l = 1;
            objLoadAd = c8403l.loadAd(c6806l, obj, c14065l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objLoadAd);
        }
        C14249l c14249l2 = objLoadAd instanceof C14249l ? (C14249l) objLoadAd : null;
        if (c14249l2 != null) {
            this.amazon = c14249l2;
            return c14249l2;
        }
        C17132l.metrica(objLoadAd, "Failed to execute send pipeline. Expected [HttpClientCall], but received ");
        return null;
    }
}
