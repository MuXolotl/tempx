package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lَٓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10282l {
    public final C10227l crashlytics;
    public final long loadAd;
    public final List yandex;

    /* JADX WARN: Multi-variable type inference failed */
    public C10282l(AbstractList abstractList, long j) {
        ArrayList arrayListMetrica;
        ArrayList arrayListMetrica2;
        char c;
        char c2;
        C17841l c17841l;
        C17841l c17841l2;
        List list;
        char c3;
        char c4;
        this.yandex = abstractList;
        this.loadAd = j;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        char c5 = 3;
        char c6 = 2;
        if (abstractList.size() <= 0 || ((AbstractC9278l) abstractList.get(0)).yandex.size() != 3) {
            arrayListMetrica = null;
            arrayListMetrica2 = null;
        } else {
            C8195l c8195lAmazon = ((C17841l) ((AbstractC9278l) abstractList.get(0)).yandex.get(1)).amazon(0.5f);
            C17841l c17841l3 = (C17841l) c8195lAmazon.f17098l;
            C17841l c17841l4 = (C17841l) c8195lAmazon.f17097l;
            arrayListMetrica2 = AbstractC14055l.metrica(((AbstractC9278l) abstractList.get(0)).yandex.get(0), c17841l3);
            arrayListMetrica = AbstractC14055l.metrica(c17841l4, ((AbstractC9278l) abstractList.get(0)).yandex.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            c17841l = null;
            c17841l2 = null;
            while (true) {
                if (i == 0 && arrayListMetrica != null) {
                    list = arrayListMetrica;
                } else if (i != this.yandex.size()) {
                    list = ((AbstractC9278l) this.yandex.get(i)).yandex;
                } else {
                    if (arrayListMetrica2 == null) {
                        c = c5;
                        c2 = c6;
                        break;
                    }
                    list = arrayListMetrica2;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    C17841l c17841l5 = (C17841l) list.get(i2);
                    if (c17841l5.billing()) {
                        c3 = c5;
                        if (c17841l2 != null) {
                            float[] fArr = c17841l2.yandex;
                            c4 = c6;
                            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                            C17841l c17841l6 = new C17841l(fArrCopyOf);
                            fArrCopyOf[6] = c17841l5.yandex();
                            fArrCopyOf[7] = c17841l5.loadAd();
                            c17841l2 = c17841l6;
                        } else {
                            c4 = c6;
                        }
                    } else {
                        if (c17841l2 != null) {
                            c10227lAdmob.add(c17841l2);
                        }
                        c3 = c5;
                        c4 = c6;
                        if (c17841l == null) {
                            c17841l = c17841l5;
                            c17841l2 = c17841l;
                        } else {
                            c17841l2 = c17841l5;
                        }
                    }
                    i2++;
                    c5 = c3;
                    c6 = c4;
                }
                c = c5;
                c2 = c6;
                if (i == size) {
                    break;
                }
                i++;
                c5 = c;
                c6 = c2;
            }
        } else {
            c = 3;
            c2 = 2;
            c17841l = null;
            c17841l2 = null;
        }
        if (c17841l2 == null || c17841l == null) {
            c10227lAdmob.add(AbstractC4603l.yandex(AbstractC10433l.mopub(this.loadAd), AbstractC10433l.admob(this.loadAd), AbstractC10433l.mopub(this.loadAd), AbstractC10433l.admob(this.loadAd), AbstractC10433l.mopub(this.loadAd), AbstractC10433l.admob(this.loadAd), AbstractC10433l.mopub(this.loadAd), AbstractC10433l.admob(this.loadAd)));
        } else {
            float[] fArr2 = c17841l2.yandex;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[c2];
            float f4 = fArr2[c];
            float f5 = fArr2[4];
            float f6 = fArr2[5];
            float[] fArr3 = c17841l.yandex;
            c10227lAdmob.add(AbstractC4603l.yandex(f, f2, f3, f4, f5, f6, fArr3[0], fArr3[1]));
        }
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
        this.crashlytics = c10227lPurchase;
        Object obj = c10227lPurchase.get(c10227lPurchase.pro() - 1);
        int iPro = c10227lPurchase.pro();
        int i3 = 0;
        while (i3 < iPro) {
            C17841l c17841l7 = (C17841l) this.crashlytics.get(i3);
            C17841l c17841l8 = (C17841l) obj;
            if (Math.abs(c17841l7.yandex[0] - c17841l8.yandex()) > 1.0E-4f || Math.abs(c17841l7.yandex[1] - c17841l8.loadAd()) > 1.0E-4f) {
                C8339l.metrica("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i3++;
            obj = c17841l7;
        }
    }

    public static float[] yandex(C10282l c10282l, float[] fArr, int i) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 1;
        char c6 = 4;
        float[] fArr2 = (i & 1) != 0 ? new float[4] : fArr;
        C10227l c10227l = c10282l.crashlytics;
        if (fArr2.length < 4) {
            C8339l.metrica("Required bounds size of 4");
            return null;
        }
        int iPro = c10227l.pro();
        float fMax = Float.MIN_VALUE;
        char c7 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        int i2 = 0;
        float fMax2 = Float.MIN_VALUE;
        while (i2 < iPro) {
            C17841l c17841l = (C17841l) c10227l.get(i2);
            boolean zBilling = c17841l.billing();
            float[] fArr3 = c17841l.yandex;
            if (zBilling) {
                fArr2[c7] = fArr3[c7];
                fArr2[c5] = fArr3[c5];
                fArr2[2] = fArr3[c7];
                fArr2[3] = fArr3[c5];
                c = c5;
                c2 = c6;
                c3 = c7;
                c4 = 2;
            } else {
                c = c5;
                float fMin3 = Math.min(fArr3[c7], c17841l.yandex());
                c2 = c6;
                float fMin4 = Math.min(fArr3[c], c17841l.loadAd());
                c3 = c7;
                float fMax3 = Math.max(fArr3[c7], c17841l.yandex());
                float fMax4 = Math.max(fArr3[c], c17841l.loadAd());
                c4 = 2;
                fArr2[c3] = Math.min(fMin3, Math.min(fArr3[2], fArr3[c2]));
                fArr2[c] = Math.min(fMin4, Math.min(fArr3[3], fArr3[5]));
                fArr2[2] = Math.max(fMax3, Math.max(fArr3[2], fArr3[c2]));
                fArr2[3] = Math.max(fMax4, Math.max(fArr3[3], fArr3[5]));
            }
            fMin = Math.min(fMin, fArr2[c3]);
            fMin2 = Math.min(fMin2, fArr2[c]);
            fMax = Math.max(fMax, fArr2[c4]);
            fMax2 = Math.max(fMax2, fArr2[3]);
            i2++;
            c7 = c3;
            c6 = c2;
            c5 = c;
        }
        fArr2[c7] = fMin;
        fArr2[c5] = fMin2;
        fArr2[2] = fMax;
        fArr2[3] = fMax2;
        return fArr2;
    }

    public final C10282l crashlytics(InterfaceC6951l interfaceC6951l) {
        long j = this.loadAd;
        long jYandex = interfaceC6951l.yandex(AbstractC10433l.mopub(j), AbstractC10433l.admob(j));
        long jYandex2 = C9699l.yandex(Float.intBitsToFloat((int) (jYandex >> 32)), Float.intBitsToFloat((int) (jYandex & 4294967295L)));
        C10227l c10227lAdmob = AbstractC14055l.admob();
        List list = this.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c10227lAdmob.add(((AbstractC9278l) list.get(i)).yandex(interfaceC6951l));
        }
        return new C10282l(AbstractC14055l.purchase(c10227lAdmob), jYandex2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10282l)) {
            return false;
        }
        return AbstractC8576l.yandex(this.yandex, ((C10282l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final C10282l loadAd() {
        float[] fArrYandex = yandex(this, null, 3);
        float f = fArrYandex[2] - fArrYandex[0];
        float f2 = fArrYandex[3] - fArrYandex[1];
        float fMax = Math.max(f, f2);
        return crashlytics(new C8691l(((fMax - f) / 2.0f) - fArrYandex[0], fMax, ((fMax - f2) / 2.0f) - fArrYandex[1]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(AbstractC16901l.m4210case(this.crashlytics, null, null, null, null, 63));
        sb.append(" || Features = ");
        sb.append(AbstractC16901l.m4210case(this.yandex, null, null, null, null, 63));
        sb.append(" || Center = (");
        long j = this.loadAd;
        sb.append(AbstractC10433l.mopub(j));
        sb.append(", ");
        sb.append(AbstractC10433l.admob(j));
        sb.append(")]");
        return sb.toString();
    }
}
