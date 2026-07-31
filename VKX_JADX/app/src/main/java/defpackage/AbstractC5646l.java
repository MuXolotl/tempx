package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.text.Bidi;

/* JADX INFO: renamed from: lؘْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5646l {
    public static final C15578l yandex = new C15578l(-424293596, false, new C8918l(20));
    public static final C15578l loadAd = new C15578l(-651855949, false, new C8918l(21));
    public static final C15578l crashlytics = new C15578l(717594468, false, new C8918l(22));

    public static int admob(int i, byte[] bArr, int i2, int i3, InterfaceC9858l interfaceC9858l, C16292l c16292l) {
        AbstractC13800l abstractC13800l = (AbstractC13800l) interfaceC9858l;
        int iMopub = mopub(bArr, i2, c16292l);
        abstractC13800l.billing(c16292l.yandex);
        while (iMopub < i3) {
            int iMopub2 = mopub(bArr, iMopub, c16292l);
            if (i != c16292l.yandex) {
                break;
            }
            iMopub = mopub(bArr, iMopub2, c16292l);
            abstractC13800l.billing(c16292l.yandex);
        }
        return iMopub;
    }

    public static int amazon(InterfaceC0060l interfaceC0060l, int i, byte[] bArr, int i2, int i3, InterfaceC9858l interfaceC9858l, C16292l c16292l) throws C2297l {
        Object objAmazon = interfaceC0060l.amazon();
        InterfaceC0060l interfaceC0060l2 = interfaceC0060l;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C16292l c16292l2 = c16292l;
        int iVip = vip(objAmazon, interfaceC0060l2, bArr2, i2, i4, c16292l2);
        interfaceC0060l2.loadAd(objAmazon);
        c16292l2.crashlytics = objAmazon;
        interfaceC9858l.add(objAmazon);
        while (iVip < i4) {
            C16292l c16292l3 = c16292l2;
            int i5 = i4;
            int iMopub = mopub(bArr2, iVip, c16292l3);
            if (i != c16292l3.yandex) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC0060l interfaceC0060l3 = interfaceC0060l2;
            Object objAmazon2 = interfaceC0060l3.amazon();
            iVip = vip(objAmazon2, interfaceC0060l3, bArr3, iMopub, i5, c16292l3);
            interfaceC0060l2 = interfaceC0060l3;
            bArr2 = bArr3;
            i4 = i5;
            c16292l2 = c16292l3;
            interfaceC0060l2.loadAd(objAmazon2);
            c16292l2.crashlytics = objAmazon2;
            interfaceC9858l.add(objAmazon2);
        }
        return iVip;
    }

    public static int billing(int i, byte[] bArr, int i2, C16292l c16292l) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c16292l.yandex = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c16292l.yandex = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c16292l.yandex = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c16292l.yandex = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c16292l.yandex = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static long crashlytics(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x025f A[EDGE_INSN: B:145:0x025f->B:172:0x02bb BREAK  A[LOOP:5: B:155:0x027b->B:207:0x027b]] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    public static final int firebase(C18118l c18118l, Layout layout, C11644l c11644l, int i, RectF rectF, InterfaceC0983l interfaceC0983l, C15707l c15707l, boolean z) {
        C6793l[] c6793lArr;
        int i2;
        C6793l[] c6793lArr2;
        int i3;
        int iPurchase;
        int i4;
        int i5;
        int iAmazon;
        Bidi bidiCreateLineBidi;
        float fYandex;
        float fYandex2;
        float fYandex3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = c18118l.billing;
        int lineStart2 = layout2.getLineStart(i);
        int iBilling = c18118l.billing(i);
        if (i6 < (iBilling - lineStart2) * 2) {
            AbstractC1786l.yandex("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C0463l c0463l = new C0463l(c18118l);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i7 = 0;
        while (lineStart2 < iBilling) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fYandex = c0463l.yandex(lineStart2, z2, z2, true);
                fYandex3 = c0463l.yandex(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fYandex3 = c0463l.yandex(lineStart2, false, false, false);
                fYandex = c0463l.yandex(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fYandex2 = c0463l.yandex(lineStart2, false, false, true);
                    fYandex = c0463l.yandex(lineStart2 + 1, true, true, true);
                } else {
                    fYandex = c0463l.yandex(lineStart2, false, false, false);
                    fYandex2 = c0463l.yandex(lineStart2 + 1, true, true, false);
                }
                fYandex3 = fYandex2;
            }
            fArr[i7] = fYandex;
            fArr[i7 + 1] = fYandex3;
            i7 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) c11644l.f23358l;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iM3151l = c11644l.m3151l(lineStart3, false);
        int iM3150l = c11644l.m3150l(iM3151l);
        int i8 = lineStart3 - iM3150l;
        int i9 = lineEnd2 - iM3150l;
        Bidi bidiM3147l = c11644l.m3147l(iM3151l);
        if (bidiM3147l == null || (bidiCreateLineBidi = bidiM3147l.createLineBidi(i8, i9)) == null) {
            i2 = 0;
            c6793lArr = new C6793l[]{new C6793l(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            c6793lArr = new C6793l[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                c6793lArr[i10] = new C6793l(bidiCreateLineBidi.getRunStart(i10) + lineStart3, bidiCreateLineBidi.getRunLimit(i10) + lineStart3, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
            i2 = 0;
        }
        C7488l c8934l = z ? new C8934l(i2, c6793lArr.length - 1, 1) : new C7488l(c6793lArr.length - 1, i2, -1);
        int i12 = c8934l.f15488l;
        int i13 = c8934l.f15487l;
        int i14 = c8934l.f15486l;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            C6793l c6793l = c6793lArr[i12];
            boolean z4 = c6793l.crashlytics;
            int iYandex = c6793l.yandex;
            int iLoadAd = c6793l.loadAd;
            float f = z4 ? fArr[((iLoadAd - 1) - lineStart) * 2] : fArr[(iYandex - lineStart) * 2];
            float fIsPro = z4 ? isPro(iYandex, lineStart, fArr) : isPro(iLoadAd - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i15 = i14;
            if (!z) {
                c6793lArr2 = c6793lArr;
                if (fIsPro < f2) {
                    iLoadAd = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fIsPro) && (!z4 || f2 > f)) {
                        int i16 = iLoadAd;
                        int i17 = iYandex;
                        while (i16 - i17 > 1) {
                            int i18 = (i16 + i17) / 2;
                            float f4 = fArr[(i18 - lineStart) * 2];
                            int i19 = i16;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i16 = i19;
                                i17 = i18;
                            } else {
                                i16 = i18;
                            }
                        }
                        i3 = z4 ? i16 : i17;
                    } else {
                        i3 = iLoadAd - 1;
                    }
                    int iAmazon2 = interfaceC0983l.amazon(i3 + 1);
                    if (iAmazon2 == -1 || (iPurchase = interfaceC0983l.purchase(iAmazon2)) <= iYandex) {
                        iLoadAd = -1;
                        break;
                    }
                    if (iAmazon2 < iYandex) {
                        iAmazon2 = iYandex;
                    }
                    if (iPurchase <= iLoadAd) {
                        iLoadAd = iPurchase;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iAmazon3 = iAmazon2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iLoadAd - 1) - lineStart) * 2] : fArr[(iAmazon3 - lineStart) * 2];
                        rectF2.right = z4 ? isPro(iAmazon3, lineStart, fArr) : isPro(iLoadAd - 1, lineStart, fArr);
                        if (((Boolean) c15707l.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iLoadAd = interfaceC0983l.loadAd(iLoadAd);
                        if (iLoadAd == -1 || iLoadAd <= iYandex) {
                            iLoadAd = -1;
                            break;
                        }
                        iAmazon3 = interfaceC0983l.amazon(iLoadAd);
                        if (iAmazon3 < iYandex) {
                            iAmazon3 = iYandex;
                        }
                    }
                } else {
                    iLoadAd = -1;
                    break;
                }
                iYandex = iLoadAd;
            } else {
                if (fIsPro < f2) {
                    c6793lArr2 = c6793lArr;
                    iYandex = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fIsPro)) {
                        int i20 = iLoadAd;
                        int i21 = iYandex;
                        while (true) {
                            i4 = i20;
                            if (i20 - i21 <= 1) {
                                break;
                            }
                            int i22 = (i4 + i21) / 2;
                            float f6 = fArr[(i22 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i20 = i4;
                                i21 = i22;
                            } else {
                                i20 = i22;
                            }
                        }
                        i5 = z4 ? i4 : i21;
                    } else {
                        i5 = iYandex;
                    }
                    int iPurchase2 = interfaceC0983l.purchase(i5);
                    if (iPurchase2 != -1 && (iAmazon = interfaceC0983l.amazon(iPurchase2)) < iLoadAd) {
                        if (iAmazon >= iYandex) {
                            iYandex = iAmazon;
                        }
                        if (iPurchase2 > iLoadAd) {
                            iPurchase2 = iLoadAd;
                        }
                        c6793lArr2 = c6793lArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iPurchase3 = iPurchase2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iPurchase3 - 1) - lineStart) * 2] : fArr[(iYandex - lineStart) * 2];
                            rectF3.right = z4 ? isPro(iYandex, lineStart, fArr) : isPro(iPurchase3 - 1, lineStart, fArr);
                            if (((Boolean) c15707l.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iYandex = interfaceC0983l.yandex(iYandex);
                            if (iYandex != -1 && iYandex < iLoadAd) {
                                iPurchase3 = interfaceC0983l.purchase(iYandex);
                                if (iPurchase3 > iLoadAd) {
                                    iPurchase3 = iLoadAd;
                                }
                            }
                        }
                    } else {
                        c6793lArr2 = c6793lArr;
                    }
                    iYandex = -1;
                    break;
                } else {
                    c6793lArr2 = c6793lArr;
                    iYandex = -1;
                    break;
                }
            }
            if (iYandex >= 0) {
                return iYandex;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i15;
            i14 = i15;
            c6793lArr = c6793lArr2;
        }
    }

    public static final float isPro(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static int loadAd(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void metrica(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C6541l.subs(str);
    }

    public static int mopub(byte[] bArr, int i, C16292l c16292l) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return billing(b, bArr, i2, c16292l);
        }
        c16292l.yandex = b;
        return i2;
    }

    public static int purchase(int i, byte[] bArr, int i2, int i3, C7565l c7565l, C16292l c16292l) throws C2297l {
        if ((i >>> 3) == 0) {
            throw C2297l.yandex();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iSubs = subs(bArr, i2, c16292l);
            c7565l.amazon(i, Long.valueOf(c16292l.loadAd));
            return iSubs;
        }
        if (i4 == 1) {
            c7565l.amazon(i, Long.valueOf(crashlytics(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iMopub = mopub(bArr, i2, c16292l);
            int i5 = c16292l.yandex;
            if (i5 < 0) {
                throw C2297l.purchase();
            }
            if (i5 > bArr.length - iMopub) {
                throw C2297l.mopub();
            }
            if (i5 == 0) {
                c7565l.amazon(i, AbstractC15257l.f29847l);
            } else {
                c7565l.amazon(i, AbstractC15257l.mopub(iMopub, i5, bArr));
            }
            return iMopub + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C2297l.yandex();
            }
            c7565l.amazon(i, Integer.valueOf(loadAd(i2, bArr)));
            return i2 + 4;
        }
        C7565l c7565lCrashlytics = C7565l.crashlytics();
        int i6 = (i & (-8)) | 4;
        int i7 = c16292l.amazon + 1;
        c16292l.amazon = i7;
        if (i7 >= 100) {
            throw new C2297l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iMopub2 = mopub(bArr, i2, c16292l);
            i8 = c16292l.yandex;
            if (i8 == i6) {
                i2 = iMopub2;
                break;
            }
            i2 = purchase(i8, bArr, iMopub2, i3, c7565lCrashlytics, c16292l);
        }
        c16292l.amazon--;
        if (i2 > i3 || i8 != i6) {
            throw C2297l.billing();
        }
        c7565l.amazon(i, c7565lCrashlytics);
        return i2;
    }

    public static int remoteconfig(Object obj, InterfaceC0060l interfaceC0060l, byte[] bArr, int i, int i2, int i3, C16292l c16292l) throws C2297l {
        C0372l c0372l = (C0372l) interfaceC0060l;
        int i4 = c16292l.amazon + 1;
        c16292l.amazon = i4;
        if (i4 >= 100) {
            throw new C2297l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iInmobi = c0372l.inmobi(obj, bArr, i, i2, i3, c16292l);
        c16292l.amazon--;
        c16292l.crashlytics = obj;
        return iInmobi;
    }

    public static int subs(byte[] bArr, int i, C16292l c16292l) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c16292l.loadAd = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c16292l.loadAd = j2;
        return i3;
    }

    public static int vip(Object obj, InterfaceC0060l interfaceC0060l, byte[] bArr, int i, int i2, C16292l c16292l) throws C2297l {
        int iBilling = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iBilling = billing(i3, bArr, iBilling, c16292l);
            i3 = c16292l.yandex;
        }
        int i4 = iBilling;
        if (i3 < 0 || i3 > i2 - i4) {
            throw C2297l.mopub();
        }
        int i5 = c16292l.amazon + 1;
        c16292l.amazon = i5;
        if (i5 >= 100) {
            throw new C2297l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        interfaceC0060l.mopub(obj, bArr, i4, i6, c16292l);
        c16292l.amazon--;
        c16292l.crashlytics = obj;
        return i6;
    }

    public static int yandex(byte[] bArr, int i, C16292l c16292l) throws C2297l {
        int iMopub = mopub(bArr, i, c16292l);
        int i2 = c16292l.yandex;
        if (i2 < 0) {
            throw C2297l.purchase();
        }
        if (i2 > bArr.length - iMopub) {
            throw C2297l.mopub();
        }
        if (i2 == 0) {
            c16292l.crashlytics = AbstractC15257l.f29847l;
            return iMopub;
        }
        c16292l.crashlytics = AbstractC15257l.mopub(iMopub, i2, bArr);
        return iMopub + i2;
    }

    public abstract float smaato(C15728l c15728l);

    public abstract void startapp(C15728l c15728l, float f);
}
