package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘْٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14120l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11625l f27618l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27619l;

    public /* synthetic */ C14120l(C11625l c11625l, int i) {
        this.f27619l = i;
        this.f27618l = c11625l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.f27619l;
        C11625l c11625l = this.f27618l;
        switch (i2) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                C12015l c12015l = c11625l.loadAd;
                float f = c12015l.yandex;
                float f2 = c12015l.loadAd;
                float fAmazon = AbstractC8576l.amazon(fFloatValue, f, f2);
                int i3 = c11625l.yandex;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float fAbs = fAmazon;
                    float f3 = fAbs;
                    int i4 = 0;
                    while (true) {
                        float fFirebase = AbstractC7572l.firebase(f, f2, i4 / i);
                        float f4 = fFirebase - fAmazon;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = fFirebase;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            fAmazon = f3;
                        }
                    }
                }
                if (fAmazon != c11625l.amazon.admob()) {
                    c11625l.purchase.invoke(Float.valueOf(fAmazon));
                    Function0 function0 = c11625l.crashlytics;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                c11625l.loadAd(0.0f);
                c11625l.firebase.invoke();
                return Unit.INSTANCE;
        }
    }
}
