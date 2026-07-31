package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٌ۠ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9092l {
    public static final C15578l yandex = new C15578l(467429406, false, new C7614l(3));

    public static byte[] admob(C16045l c16045l) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = c16045l.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return yandex(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Alert.DURATION_SHOW_INDEFINITELY;
            } else {
                iMin = j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
            }
        }
        if (c16045l.read() == -1) {
            return yandex(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static void amazon(Context context, InterfaceC2373l interfaceC2373l) {
        loadAd(context, interfaceC2373l, C13305l.mopub);
    }

    public static final List billing(String str) {
        C8195l c8195l;
        C2580l c2580l = C2580l.f5619l;
        if (str == null) {
            return c2580l;
        }
        int i = 3;
        InterfaceC1220l interfaceC1220lCrashlytics = AbstractC9968l.crashlytics(3, new C8241l(16));
        int i2 = 0;
        while (i2 <= AbstractC12024l.m3350volatile(str)) {
            InterfaceC1220l interfaceC1220lCrashlytics2 = AbstractC9968l.crashlytics(i, new C8241l(17));
            Integer numValueOf = null;
            int i3 = i2;
            while (true) {
                if (i3 > AbstractC12024l.m3350volatile(str)) {
                    ((ArrayList) interfaceC1220lCrashlytics.getValue()).add(new C5705l(AbstractC12024l.m3330l(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i3)).toString(), interfaceC1220lCrashlytics2.yandex() ? (List) interfaceC1220lCrashlytics2.getValue() : c2580l));
                    break;
                }
                char cCharAt = str.charAt(i3);
                if (cCharAt == ',') {
                    ((ArrayList) interfaceC1220lCrashlytics.getValue()).add(new C5705l(AbstractC12024l.m3330l(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i3)).toString(), interfaceC1220lCrashlytics2.yandex() ? (List) interfaceC1220lCrashlytics2.getValue() : c2580l));
                    i3++;
                    break;
                }
                if (cCharAt == ';') {
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i3);
                    }
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        if (i5 <= AbstractC12024l.m3350volatile(str)) {
                            char cCharAt2 = str.charAt(i5);
                            if (cCharAt2 != ',' && cCharAt2 != ';') {
                                if (cCharAt2 == '=') {
                                    int i6 = i5 + 1;
                                    if (str.length() != i6) {
                                        char c = '\"';
                                        if (str.charAt(i6) != '\"') {
                                            int i7 = i6;
                                            while (true) {
                                                if (i7 > AbstractC12024l.m3350volatile(str)) {
                                                    c8195l = new C8195l(Integer.valueOf(i7), AbstractC12024l.m3330l(str.substring(i6, i7)).toString());
                                                    break;
                                                }
                                                char cCharAt3 = str.charAt(i7);
                                                if (cCharAt3 == ',' || cCharAt3 == ';') {
                                                    c8195l = new C8195l(Integer.valueOf(i7), AbstractC12024l.m3330l(str.substring(i6, i7)).toString());
                                                    break;
                                                }
                                                i7++;
                                            }
                                        } else {
                                            int i8 = i5 + 2;
                                            StringBuilder sb = new StringBuilder();
                                            while (true) {
                                                if (i8 > AbstractC12024l.m3350volatile(str)) {
                                                    c8195l = new C8195l(Integer.valueOf(i8), "\"".concat(sb.toString()));
                                                    break;
                                                }
                                                char cCharAt4 = str.charAt(i8);
                                                if (cCharAt4 == c) {
                                                    int i9 = i8 + 1;
                                                    int i10 = i9;
                                                    while (i10 < str.length() && str.charAt(i10) == ' ') {
                                                        i10++;
                                                    }
                                                    if (i10 == str.length() || str.charAt(i10) == ';' || str.charAt(i10) == ',') {
                                                        c8195l = new C8195l(Integer.valueOf(i9), sb.toString());
                                                        break;
                                                    }
                                                }
                                                if (cCharAt4 != '\\' || i8 >= AbstractC12024l.m3350volatile(str) - 2) {
                                                    sb.append(cCharAt4);
                                                    i8++;
                                                } else {
                                                    sb.append(str.charAt(i8 + 1));
                                                    i8 += 2;
                                                }
                                                c = '\"';
                                            }
                                        }
                                    } else {
                                        c8195l = new C8195l(Integer.valueOf(i6), "");
                                    }
                                    int iIntValue = ((Number) c8195l.f17098l).intValue();
                                    mopub(interfaceC1220lCrashlytics2, str, i4, i5, (String) c8195l.f17097l);
                                    i3 = iIntValue;
                                    break;
                                }
                                i5++;
                            } else {
                                mopub(interfaceC1220lCrashlytics2, str, i4, i5, "");
                            }
                        } else {
                            mopub(interfaceC1220lCrashlytics2, str, i4, i5, "");
                        }
                        i3 = i5;
                        break;
                    }
                }
                i3++;
            }
            i2 = i3;
            i = 3;
        }
        return interfaceC1220lCrashlytics.yandex() ? (List) interfaceC1220lCrashlytics.getValue() : c2580l;
    }

    public static final void crashlytics(AppActivity appActivity, InterfaceC17817l interfaceC17817l, C13305l c13305l) {
        InterfaceC14029l interfaceC14029l = null;
        if (c13305l.crashlytics.isEmpty()) {
            AbstractC9033l.crashlytics(appActivity, new C5035l(interfaceC17817l, c13305l, interfaceC14029l, 1));
            return;
        }
        C18351l c18351lFirebase = AbstractC11990l.firebase(appActivity);
        C16552l c16552l = AbstractC11463l.yandex;
        AbstractC10999l.mopub(c18351lFirebase, ExecutorC6708l.f14063l, 0, new C5035l(interfaceC17817l, c13305l, interfaceC14029l, 0), 2);
    }

    public static final void loadAd(Context context, InterfaceC17817l interfaceC17817l, C13305l c13305l) {
        AppActivity appActivity = context instanceof AppActivity ? (AppActivity) context : null;
        if (appActivity != null) {
            crashlytics(appActivity, interfaceC17817l, c13305l);
        }
    }

    public static final void mopub(InterfaceC1220l interfaceC1220l, String str, int i, int i2, String str2) {
        String string = AbstractC12024l.m3330l(str.substring(i, i2)).toString();
        if (string.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC1220l.getValue()).add(new C14345l(string, str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r0.length() == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C14660l purchase(java.lang.String r22) {
        /*
            r0 = r22
            int r1 = r0.length()
            r2 = 0
            java.lang.String r3 = "Failed requirement."
            if (r1 <= 0) goto Lb0
            r1 = 0
            char r4 = r0.charAt(r1)
            r5 = 48
            lَٔؕ r6 = defpackage.C14660l.f28671l
            if (r4 != r5) goto L35
            int r4 = r0.length()
            r5 = 1
            if (r4 != r5) goto L1e
            goto L34
        L1e:
            java.lang.String r4 = "^0+"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.lang.String r5 = ""
            java.util.regex.Matcher r0 = r4.matcher(r0)
            java.lang.String r0 = r0.replaceFirst(r5)
            int r4 = r0.length()
            if (r4 != 0) goto L35
        L34:
            return r6
        L35:
            int r4 = r0.length()
            if (r4 <= 0) goto Laf
            int r4 = r0.length()
            r5 = 9
            int r4 = r4 % r5
            if (r4 != 0) goto L45
            goto L46
        L45:
            r5 = r4
        L46:
            java.lang.String r4 = r0.substring(r1, r5)
            lَّۨ r7 = defpackage.AbstractC3474l.isPro(r4)
            if (r7 == 0) goto Lab
            int r4 = r7.f24675l
            long r7 = r6.f28673l
            r9 = 32
            long r10 = r7 >>> r9
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r12
            long r14 = r6.f28672l
            long r16 = r14 >>> r9
            long r14 = r14 & r12
            r18 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r14 = r14 * r18
            long r16 = r16 * r18
            long r20 = r14 >>> r9
            long r16 = r16 + r20
            long r7 = r7 * r18
            long r20 = r16 >>> r9
            long r7 = r7 + r20
            long r10 = r10 * r18
            long r18 = r7 >>> r9
            long r10 = r10 + r18
            long r16 = r16 << r9
            long r14 = r14 & r12
            long r16 = r16 + r14
            long r9 = r10 << r9
            long r7 = r7 & r12
            long r9 = r9 + r7
            long r7 = (long) r4
            long r7 = r7 & r12
            long r7 = r16 + r7
            r11 = -9223372036854775808
            long r13 = r7 ^ r11
            long r11 = r16 ^ r11
            int r4 = java.lang.Long.compare(r13, r11)
            if (r4 >= 0) goto L96
            r11 = 1
            long r9 = r9 + r11
        L96:
            lَٔؕ r4 = new lَٔؕ
            r4.<init>(r9, r7)
            int r6 = r4.compareTo(r6)
            if (r6 < 0) goto La7
            java.lang.String r0 = r0.substring(r5)
            r6 = r4
            goto L35
        La7:
            defpackage.C8339l.metrica(r3)
            return r2
        Lab:
            defpackage.AbstractC16648l.pro(r4)
            throw r2
        Laf:
            return r6
        Lb0:
            defpackage.C8339l.metrica(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9092l.purchase(java.lang.String):lَٔؕ");
    }

    public static byte[] yandex(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }
}
