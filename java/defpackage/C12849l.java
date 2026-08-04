package defpackage;

/* JADX INFO: renamed from: lؙّۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12849l implements InterfaceC14447l {
    public final EnumC9931l amazon;
    public final InterfaceC14447l crashlytics;
    public final AbstractC13264l loadAd;

    public C12849l(AbstractC13264l abstractC13264l, InterfaceC14447l interfaceC14447l, EnumC9931l enumC9931l) {
        this.loadAd = abstractC13264l;
        this.crashlytics = interfaceC14447l;
        this.amazon = enumC9931l;
    }

    @Override // defpackage.InterfaceC14447l
    public final C13315l loadAd() {
        InterfaceC14447l.yandex.getClass();
        return C18498l.loadAd;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    @Override // defpackage.InterfaceC14447l
    public final float yandex(float f, float f2, float f3) {
        int iVip;
        int iVip2;
        int iVip3;
        float fYandex = this.crashlytics.yandex(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            C8896l c8896l = AbstractC11922l.yandex;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fYandex);
        EnumC9931l enumC9931l = EnumC9931l.f20222l;
        EnumC7283l enumC7283l = EnumC7283l.f15125l;
        EnumC9931l enumC9931l2 = this.amazon;
        AbstractC13264l abstractC13264l = this.loadAd;
        if (fAbs != 0.0f && z) {
            if (enumC9931l2 == enumC9931l && abstractC13264l.firebase().purchase == enumC7283l) {
                iVip3 = abstractC13264l.vip() + (-abstractC13264l.billing);
            } else {
                iVip3 = abstractC13264l.billing;
            }
            float fVip = iVip3 * (-1.0f);
            while (fYandex > 0.0f && fVip < fYandex) {
                fVip += abstractC13264l.vip();
            }
            while (fYandex < 0.0f && fVip > fYandex) {
                fVip -= abstractC13264l.vip();
            }
            return fVip;
        }
        int i = abstractC13264l.billing;
        C10086l c10086l = abstractC13264l.inmobi;
        if (Math.abs(i) < 1.0E-6d) {
            return 0.0f;
        }
        if (enumC9931l2 == enumC9931l && abstractC13264l.firebase().purchase == enumC7283l) {
            iVip = abstractC13264l.vip() + (-abstractC13264l.billing);
        } else {
            iVip = abstractC13264l.billing;
        }
        float f5 = iVip * (-1.0f);
        if (enumC9931l2 == enumC9931l && abstractC13264l.firebase().purchase == enumC7283l) {
            if (!((Boolean) c10086l.getValue()).booleanValue()) {
                iVip2 = abstractC13264l.vip();
                f5 += iVip2;
            }
        } else if (((Boolean) c10086l.getValue()).booleanValue()) {
            iVip2 = abstractC13264l.vip();
            f5 += iVip2;
        }
        return AbstractC8576l.amazon(f5, -f3, f3);
    }
}
