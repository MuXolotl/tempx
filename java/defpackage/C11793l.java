package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِّٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11793l implements InterfaceC0379l {
    public final float[] admob;
    public final C13317l amazon;
    public final C13317l billing;
    public final InterfaceC18565l crashlytics;
    public final C17296l loadAd;
    public final Function2 mopub;
    public final C13317l purchase;
    public final float[] subs;
    public final String yandex;

    public C11793l(String str, C17296l c17296l, InterfaceC18565l interfaceC18565l, C13317l c13317l, C13317l c13317l2, C13317l c13317l3, Function2 function2) {
        this.yandex = str;
        this.loadAd = c17296l;
        this.crashlytics = interfaceC18565l;
        this.amazon = c13317l;
        this.purchase = c13317l2;
        this.billing = c13317l3;
        this.mopub = function2;
        AbstractC11553l.yandex("RGB");
        C13317l c13317l4 = AbstractC2223l.yandex;
        float f = c13317l.yandex;
        float f2 = c13317l2.yandex;
        float f3 = c13317l3.yandex;
        float f4 = c13317l.loadAd;
        float f5 = c13317l2.loadAd;
        float f6 = c13317l3.loadAd;
        float[] fArr = {f, f2, f3, f4, f5, f6, (1.0f - f) - f4, (1.0f - f2) - f5, (1.0f - f3) - f6};
        C13317l c13317l5 = c17296l.loadAd;
        float[] fArrPurchase = AbstractC12446l.purchase(fArr);
        float f7 = c13317l5.yandex;
        float f8 = c13317l5.crashlytics;
        float f9 = (f7 * f8) / c13317l5.loadAd;
        float fYandex = c13317l5.yandex();
        float[] fArrCrashlytics = AbstractC12446l.crashlytics((fArrPurchase[2] * fYandex) + (fArrPurchase[1] * f8) + (fArrPurchase[0] * f9), (fArrPurchase[5] * fYandex) + (fArrPurchase[4] * f8) + (fArrPurchase[3] * f9), (fArrPurchase[8] * fYandex) + (fArrPurchase[7] * f8) + (fArrPurchase[6] * f9), fArr);
        this.admob = fArrCrashlytics;
        this.subs = AbstractC12446l.purchase(fArrCrashlytics);
    }

    @Override // defpackage.InterfaceC14834l
    public final C17296l amazon() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC0379l
    public final C18411l crashlytics(float f, float f2, float f3, float f4) {
        return new C18411l(f, f2, f3, f4, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC0379l)) {
            return false;
        }
        InterfaceC0379l interfaceC0379l = (InterfaceC0379l) obj;
        if (!this.yandex.equals(interfaceC0379l.getName()) || !AbstractC8576l.yandex(this.loadAd, interfaceC0379l.amazon()) || !this.crashlytics.equals(interfaceC0379l.purchase())) {
            return false;
        }
        if (!(obj instanceof C11793l)) {
            return Arrays.equals(this.admob, interfaceC0379l.yandex()) && Arrays.equals(this.subs, interfaceC0379l.loadAd());
        }
        C11793l c11793l = (C11793l) obj;
        return AbstractC8576l.yandex(this.amazon, c11793l.amazon) && AbstractC8576l.yandex(this.purchase, c11793l.purchase) && AbstractC8576l.yandex(this.billing, c11793l.billing);
    }

    @Override // defpackage.InterfaceC14834l
    public final String getName() {
        return this.yandex;
    }

    public final int hashCode() {
        return this.billing.hashCode() + ((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC0379l
    public final float[] loadAd() {
        return this.subs;
    }

    @Override // defpackage.InterfaceC0379l
    public final InterfaceC18565l purchase() {
        return this.crashlytics;
    }

    public final String toString() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC0379l
    public final float[] yandex() {
        return this.admob;
    }
}
