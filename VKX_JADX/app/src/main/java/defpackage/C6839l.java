package defpackage;

/* JADX INFO: renamed from: lؙۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6839l implements InterfaceC6347l, InterfaceC10955l {
    public final InterfaceC8251l amazon;
    public final InterfaceC8251l crashlytics;
    public final InterfaceC8251l loadAd;
    public final InterfaceC8251l yandex;

    public C6839l(InterfaceC8251l interfaceC8251l, InterfaceC8251l interfaceC8251l2, InterfaceC8251l interfaceC8251l3, InterfaceC8251l interfaceC8251l4) {
        this.yandex = interfaceC8251l;
        this.loadAd = interfaceC8251l2;
        this.crashlytics = interfaceC8251l3;
        this.amazon = interfaceC8251l4;
    }

    public static C6839l crashlytics(C6839l c6839l, InterfaceC8251l interfaceC8251l, InterfaceC8251l interfaceC8251l2, InterfaceC8251l interfaceC8251l3, InterfaceC8251l interfaceC8251l4, int i) {
        if ((i & 1) != 0) {
            interfaceC8251l = c6839l.yandex;
        }
        if ((i & 2) != 0) {
            interfaceC8251l2 = c6839l.loadAd;
        }
        if ((i & 4) != 0) {
            interfaceC8251l3 = c6839l.crashlytics;
        }
        if ((i & 8) != 0) {
            interfaceC8251l4 = c6839l.amazon;
        }
        c6839l.getClass();
        return new C6839l(interfaceC8251l, interfaceC8251l2, interfaceC8251l3, interfaceC8251l4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6839l)) {
            return false;
        }
        C6839l c6839l = (C6839l) obj;
        return AbstractC8576l.yandex(this.yandex, c6839l.yandex) && AbstractC8576l.yandex(this.loadAd, c6839l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c6839l.crashlytics) && AbstractC8576l.yandex(this.amazon, c6839l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC10955l
    public final Object loadAd(Object obj, float f) {
        if (AbstractC8576l.yandex(obj, AbstractC16837l.yandex) || obj == null) {
            C6839l c6839l = AbstractC7497l.yandex;
            C4965l c4965l = new C4965l();
            obj = new C6839l(c4965l, c4965l, c4965l, c4965l);
        }
        if (!(obj instanceof C6839l)) {
            return null;
        }
        C6839l c6839l2 = (C6839l) obj;
        C6839l c6839l3 = AbstractC7497l.yandex;
        return new C6839l(new C9559l(this.yandex, c6839l2.yandex, f), new C9559l(this.loadAd, c6839l2.loadAd, f), new C9559l(this.crashlytics, c6839l2.crashlytics, f), new C9559l(this.amazon, c6839l2.amazon, f));
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.yandex + ", topEnd = " + this.loadAd + ", bottomEnd = " + this.crashlytics + ", bottomStart = " + this.amazon + ")";
    }

    @Override // defpackage.InterfaceC6347l
    public final AbstractC15342l yandex(long j, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l) {
        float fYandex = this.yandex.yandex(j, interfaceC13490l);
        float fYandex2 = this.loadAd.yandex(j, interfaceC13490l);
        float fYandex3 = this.crashlytics.yandex(j, interfaceC13490l);
        float fYandex4 = this.amazon.yandex(j, interfaceC13490l);
        float fPurchase = C14174l.purchase(j);
        float f = fYandex + fYandex4;
        if (f > fPurchase) {
            float f2 = fPurchase / f;
            fYandex *= f2;
            fYandex4 *= f2;
        }
        float f3 = fYandex2 + fYandex3;
        if (f3 > fPurchase) {
            float f4 = fPurchase / f3;
            fYandex2 *= f4;
            fYandex3 *= f4;
        }
        if (fYandex < 0.0f || fYandex2 < 0.0f || fYandex3 < 0.0f || fYandex4 < 0.0f) {
            StringBuilder sbTapsense = AbstractC14814l.tapsense("Corner size in Px can't be negative(topStart = ", fYandex, ", topEnd = ", fYandex2, ", bottomEnd = ");
            sbTapsense.append(fYandex3);
            sbTapsense.append(", bottomStart = ");
            sbTapsense.append(fYandex4);
            sbTapsense.append(")!");
            AbstractC14825l.yandex(sbTapsense.toString());
        }
        if (fYandex + fYandex2 + fYandex3 + fYandex4 == 0.0f) {
            return new C13080l(AbstractC7470l.isPro(0L, j));
        }
        C8896l c8896lIsPro = AbstractC7470l.isPro(0L, j);
        EnumC9931l enumC9931l2 = EnumC9931l.f20223l;
        float f5 = enumC9931l == enumC9931l2 ? fYandex : fYandex2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (enumC9931l == enumC9931l2) {
            fYandex = fYandex2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fYandex)) << 32) | (((long) Float.floatToRawIntBits(fYandex)) & 4294967295L);
        float f6 = enumC9931l == enumC9931l2 ? fYandex3 : fYandex4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (enumC9931l != enumC9931l2) {
            fYandex4 = fYandex3;
        }
        return new C18521l(new C3903l(c8896lIsPro.yandex, c8896lIsPro.loadAd, c8896lIsPro.crashlytics, c8896lIsPro.amazon, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fYandex4)) << 32) | (((long) Float.floatToRawIntBits(fYandex4)) & 4294967295L)));
    }
}
