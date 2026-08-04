package defpackage;

import androidx.car.app.model.Alert;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lٖؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16164l {
    public static final InterfaceC18035l[] yandex = new InterfaceC18035l[0];

    public static short[][] admob(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            C18073l.license("Multiplication is not possible!");
            return null;
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short s = (short) (AbstractC8328l.yandex[sArr[i][i2]][sArr2[i2][i3]] & 255);
                    short[] sArr4 = sArr3[i];
                    sArr4[i3] = (short) (s ^ sArr4[i3]);
                }
            }
        }
        return sArr3;
    }

    public static final C15578l amazon(List list) {
        return new C15578l(1271844412, true, new C3956l(7, list));
    }

    public static final InterfaceC1388l billing(InterfaceC13012l interfaceC13012l) {
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        if (interfaceC1122lMo1616package instanceof InterfaceC1388l) {
            return (InterfaceC1388l) interfaceC1122lMo1616package;
        }
        if (!(interfaceC1122lMo1616package instanceof AbstractC11726l)) {
            C1759l.ads(interfaceC1122lMo1616package, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC1122lMo1616package + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC1122lMo1616package + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC1122lMo1616package + '.');
    }

    public static final Set crashlytics(InterfaceC18035l interfaceC18035l) {
        if (interfaceC18035l instanceof InterfaceC16555l) {
            return ((InterfaceC16555l) interfaceC18035l).loadAd();
        }
        HashSet hashSet = new HashSet(interfaceC18035l.mopub());
        int iMopub = interfaceC18035l.mopub();
        for (int i = 0; i < iMopub; i++) {
            hashSet.add(interfaceC18035l.admob(i));
        }
        return hashSet;
    }

    public static short[][] firebase(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i2][i] = sArr[i][i2];
            }
        }
        return sArr2;
    }

    public static final void isPro(InterfaceC1388l interfaceC1388l) {
        String strLicense = interfaceC1388l.license();
        if (strLicense == null) {
            strLicense = "<local class name not available>";
        }
        throw new C14747l(AbstractC15560l.Signature("Serializer for class '", strLicense, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static short[][] loadAd(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return yandex(sArr, firebase(sArr));
        }
        C18073l.license("Addition is not possible!");
        return null;
    }

    public static final InterfaceC17792l mopub(InterfaceC8077l interfaceC8077l, int i, int i2, int i3, int i4, int i5, InterfaceC7448l interfaceC7448l, List list, AbstractC10113l[] abstractC10113lArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            InterfaceC6357l interfaceC6357l = (InterfaceC6357l) list2.get(i14);
            float fPurchase = AbstractC9690l.purchase(AbstractC9690l.amazon(interfaceC6357l));
            if (fPurchase > 0.0f) {
                f2 += fPurchase;
                i15++;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                AbstractC10113l abstractC10113lAdcel = abstractC10113lArr[i14];
                if (abstractC10113lAdcel == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    abstractC10113lAdcel = interfaceC6357l.adcel(interfaceC8077l.mopub(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                AbstractC10113l abstractC10113l = abstractC10113lAdcel;
                int iIsPro = interfaceC8077l.isPro(abstractC10113l);
                int iSubs = interfaceC8077l.subs(abstractC10113l);
                iArr2[i10 - i6] = iIsPro;
                int i18 = i17 - iIsPro;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iIsPro + iMin;
                iMax = Math.max(iMax, iSubs);
                abstractC10113lArr[i10] = abstractC10113l;
                i15 = i11;
            }
            i14 = i10 + 1;
            j = j;
        }
        long j2 = j;
        int i19 = i15;
        if (i19 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j3 = ((long) (i19 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i20 = i6; i20 < i7; i20++) {
                jRound -= (long) Math.round(AbstractC9690l.purchase(AbstractC9690l.amazon((InterfaceC6357l) list2.get(i20))) * f3);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (abstractC10113lArr[i21] == null) {
                    InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) list2.get(i21);
                    f = f3;
                    C1809l c1809lAmazon = AbstractC9690l.amazon(interfaceC6357l2);
                    float fPurchase2 = AbstractC9690l.purchase(c1809lAmazon);
                    if (fPurchase2 <= 0.0f) {
                        AbstractC10440l.loadAd("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j4 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fPurchase2 * f) + iSignum);
                    AbstractC10113l abstractC10113lAdcel2 = interfaceC6357l2.adcel(interfaceC8077l.mopub((!(c1809lAmazon != null ? c1809lAmazon.loadAd : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iIsPro2 = interfaceC8077l.isPro(abstractC10113lAdcel2);
                    int iSubs2 = interfaceC8077l.subs(abstractC10113lAdcel2);
                    iArr2[i21 - i6] = iIsPro2;
                    i23 += iIsPro2;
                    int iMax3 = Math.max(i22, iSubs2);
                    abstractC10113lArr[i21] = abstractC10113lAdcel2;
                    i22 = iMax3;
                    jRound = j4;
                } else {
                    f = f3;
                }
                i21++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i23) + j3);
            int i24 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i24) {
                i9 = i24;
            }
            iMax = i22;
        }
        int i25 = i9 + i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        interfaceC8077l.billing(iMax4, iArr2, iArr3, interfaceC7448l);
        return interfaceC8077l.admob(abstractC10113lArr, interfaceC7448l, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static final InterfaceC18035l[] purchase(List list) {
        InterfaceC18035l[] interfaceC18035lArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC18035lArr = (InterfaceC18035l[]) list.toArray(new InterfaceC18035l[0])) == null) ? yandex : interfaceC18035lArr;
    }

    public static short[][][] subs(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        short[][] sArr4 = sArr2[0];
        int length = sArr4.length;
        short[][] sArr5 = sArr3[0];
        if (length == sArr5.length) {
            int length2 = sArr4[0].length;
            short[] sArr6 = sArr5[0];
            if (length2 == sArr6.length && sArr2.length == sArr[0].length && sArr3.length == sArr.length) {
                short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, sArr3.length, sArr5.length, sArr6.length);
                for (int i = 0; i < sArr2[0].length; i++) {
                    for (int i2 = 0; i2 < sArr2[0][0].length; i2++) {
                        for (int i3 = 0; i3 < sArr.length; i3++) {
                            for (int i4 = 0; i4 < sArr[0].length; i4++) {
                                short s = (short) (AbstractC8328l.yandex[sArr[i3][i4]][sArr2[i4][i][i2]] & 255);
                                short[] sArr8 = sArr7[i3][i];
                                sArr8[i2] = (short) (s ^ sArr8[i2]);
                            }
                            short[] sArr9 = sArr7[i3][i];
                            short s2 = sArr3[i3][i][i2];
                            short s3 = sArr9[i2];
                            byte[][] bArr = AbstractC8328l.yandex;
                            sArr9[i2] = (short) (s2 ^ s3);
                        }
                    }
                }
                return sArr7;
            }
        }
        C18073l.license("Multiplication not possible!");
        return null;
    }

    public static short[][] yandex(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length) {
            short[] sArr3 = sArr[0];
            if (sArr3.length == sArr2[0].length) {
                short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr3.length);
                for (int i = 0; i < sArr.length; i++) {
                    for (int i2 = 0; i2 < sArr[0].length; i2++) {
                        short[] sArr5 = sArr4[i];
                        short s = sArr[i][i2];
                        short s2 = sArr2[i][i2];
                        byte[][] bArr = AbstractC8328l.yandex;
                        sArr5[i2] = (short) (s ^ s2);
                    }
                }
                return sArr4;
            }
        }
        C18073l.license("Addition is not possible!");
        return null;
    }
}
