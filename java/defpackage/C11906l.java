package defpackage;

import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: renamed from: lِ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11906l {
    public final Object admob;
    public final Object amazon;
    public final Serializable billing;
    public final Object crashlytics;
    public final int loadAd;
    public final Serializable mopub;
    public final Serializable purchase;
    public final /* synthetic */ int yandex = 0;

    public C11906l(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        yandex(bigIntegerArr, "v1");
        yandex(bigIntegerArr2, "v2");
        this.crashlytics = bigIntegerArr[0];
        this.amazon = bigIntegerArr[1];
        this.purchase = bigIntegerArr2[0];
        this.billing = bigIntegerArr2[1];
        this.mopub = bigInteger;
        this.admob = bigInteger2;
        this.loadAd = i;
    }

    public static void yandex(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            C8339l.metrica(AbstractC15560l.Signature("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 0:
                return ((EnumC4474l) this.crashlytics) + " version=" + ((C4995l) this.amazon);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11906l(EnumC4474l enumC4474l, C4995l c4995l, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        this.crashlytics = enumC4474l;
        this.amazon = c4995l;
        this.purchase = strArr;
        this.billing = strArr2;
        this.mopub = strArr3;
        this.admob = str;
        this.loadAd = i;
    }
}
