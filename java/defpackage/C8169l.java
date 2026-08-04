package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًٞۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8169l extends AbstractC17404l implements InterfaceC10955l {
    public final List amazon;
    public final float billing;
    public final List crashlytics;
    public final long purchase;

    public C8169l(List list, List list2, long j, float f) {
        this.crashlytics = list;
        this.amazon = list2;
        this.purchase = j;
        this.billing = f;
    }

    @Override // defpackage.AbstractC17404l
    public final Shader crashlytics(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.purchase;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jMopub = AbstractC8532l.mopub(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jMopub >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMopub & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fPurchase = this.billing;
        if (fPurchase == Float.POSITIVE_INFINITY) {
            fPurchase = C14174l.purchase(j) / 2.0f;
        }
        float f = fPurchase;
        List list = this.crashlytics;
        List list2 = this.amazon;
        AbstractC8853l.mopub(list, list2);
        if (Build.VERSION.SDK_INT < 29) {
            int iCrashlytics = AbstractC8853l.crashlytics(list);
            return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)), f, AbstractC8853l.amazon(iCrashlytics, list), AbstractC8853l.purchase(iCrashlytics, list2, list), AbstractC0509l.amazon(0));
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i3 = 0; i3 < size; i3++) {
            jArr[i3] = AbstractC9168l.remoteconfig(((C9735l) list.get(i3)).yandex);
        }
        return C8249l.yandex.loadAd(jFloatToRawIntBits, f, jArr, list2 != null ? AbstractC16901l.m4249while(list2) : null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8169l)) {
            return false;
        }
        C8169l c8169l = (C8169l) obj;
        return this.crashlytics.equals(c8169l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8169l.amazon) && C1187l.loadAd(this.purchase, c8169l.purchase) && this.billing == c8169l.billing;
    }

    public final int hashCode() {
        int iHashCode = this.crashlytics.hashCode() * 31;
        List list = this.amazon;
        return AbstractC9029l.mopub((C1187l.mopub(this.purchase) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, this.billing, 31);
    }

    @Override // defpackage.InterfaceC10955l
    public final Object loadAd(Object obj, float f) {
        if (obj == null) {
            obj = new C8990l(C9735l.isPro);
        }
        boolean z = obj instanceof C8990l;
        List list = this.crashlytics;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C9735l) list.get(i)).getClass();
                arrayList.add(new C9735l(((C8990l) obj).yandex));
            }
            obj = new C8169l(arrayList, this.amazon, this.purchase, this.billing);
        }
        if (!(obj instanceof C8169l)) {
            return null;
        }
        C8169l c8169l = (C8169l) obj;
        return new C8169l(AbstractC3058l.metrica(list, c8169l.crashlytics, f), AbstractC3058l.startapp(this.amazon, c8169l.amazon, f), AbstractC2296l.billing(this.purchase, c8169l.purchase, f), AbstractC7572l.firebase(this.billing, c8169l.billing, f));
    }

    public final String toString() {
        long j = this.purchase;
        String strSignature = (9223372034707292159L & j) != 9205357640488583168L ? AbstractC15560l.Signature("center=", C1187l.firebase(j), ", ") : "";
        float f = this.billing;
        String strLoadAd = (Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 ? AbstractC4582l.loadAd("radius=", f, ", ") : "";
        String strMetrica = AbstractC14770l.metrica(0);
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.crashlytics);
        sb.append(", stops=");
        sb.append(this.amazon);
        sb.append(", ");
        AbstractC9361l.appmetrica(sb, strSignature, strLoadAd, "tileMode=", strMetrica);
        sb.append(")");
        return sb.toString();
    }
}
