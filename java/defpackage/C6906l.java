package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؙۧۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6906l extends AbstractC17404l implements InterfaceC10955l {
    public final List amazon;
    public final long billing;
    public final List crashlytics;
    public final long purchase;

    public C6906l(List list, List list2, long j, long j2) {
        this.crashlytics = list;
        this.amazon = list2;
        this.purchase = j;
        this.billing = j2;
    }

    @Override // defpackage.AbstractC17404l
    public final Shader crashlytics(long j) {
        long j2 = this.purchase;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.billing;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.crashlytics;
        List list2 = this.amazon;
        AbstractC8853l.mopub(list, list2);
        if (Build.VERSION.SDK_INT < 29) {
            int iCrashlytics = AbstractC8853l.crashlytics(list);
            return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), AbstractC8853l.amazon(iCrashlytics, list), AbstractC8853l.purchase(iCrashlytics, list2, list), AbstractC0509l.amazon(0));
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i5 = 0; i5 < size; i5++) {
            jArr[i5] = AbstractC9168l.remoteconfig(((C9735l) list.get(i5)).yandex);
        }
        return C8249l.yandex.yandex(jFloatToRawIntBits, jFloatToRawIntBits2, jArr, list2 != null ? AbstractC16901l.m4249while(list2) : null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6906l)) {
            return false;
        }
        C6906l c6906l = (C6906l) obj;
        return this.crashlytics.equals(c6906l.crashlytics) && AbstractC8576l.yandex(this.amazon, c6906l.amazon) && C1187l.loadAd(this.purchase, c6906l.purchase) && C1187l.loadAd(this.billing, c6906l.billing);
    }

    public final int hashCode() {
        int iHashCode = this.crashlytics.hashCode() * 31;
        List list = this.amazon;
        return (C1187l.mopub(this.billing) + ((C1187l.mopub(this.purchase) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31;
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
            obj = new C6906l(arrayList, this.amazon, this.purchase, this.billing);
        }
        if (!(obj instanceof C6906l)) {
            return null;
        }
        C6906l c6906l = (C6906l) obj;
        return new C6906l(AbstractC3058l.metrica(list, c6906l.crashlytics, f), AbstractC3058l.startapp(this.amazon, c6906l.amazon, f), AbstractC3058l.adcel(this.purchase, c6906l.purchase, f), AbstractC3058l.adcel(this.billing, c6906l.billing, f));
    }

    public final String toString() {
        long j = this.purchase;
        String strSignature = ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? AbstractC15560l.Signature("start=", C1187l.firebase(j), ", ") : "";
        long j2 = this.billing;
        String strSignature2 = ((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? AbstractC15560l.Signature("end=", C1187l.firebase(j2), ", ") : "";
        String strMetrica = AbstractC14770l.metrica(0);
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.crashlytics);
        sb.append(", stops=");
        sb.append(this.amazon);
        sb.append(", ");
        AbstractC9361l.appmetrica(sb, strSignature, strSignature2, "tileMode=", strMetrica);
        sb.append(")");
        return sb.toString();
    }
}
