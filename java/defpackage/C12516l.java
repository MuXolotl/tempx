package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: lَّٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12516l extends AbstractC6791l {
    public static final C11467l firebase = new C11467l(8);
    public final InterfaceC15129l isPro;

    public C12516l(InterfaceC15129l interfaceC15129l) {
        this.isPro = interfaceC15129l;
    }

    public static C12599l appmetrica(C13143l c13143l, int i, int i2) {
        int iM3393interface;
        String strConcat;
        int iSignatures = c13143l.signatures();
        Charset charsetM3399switch = m3399switch(iSignatures);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c13143l.firebase(0, i3, bArr);
        if (i2 == 2) {
            strConcat = "image/" + AbstractC11452l.admob(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM3393interface = 2;
        } else {
            iM3393interface = m3393interface(0, bArr);
            String strAdmob = AbstractC11452l.admob(new String(bArr, 0, iM3393interface, StandardCharsets.ISO_8859_1));
            strConcat = strAdmob.indexOf(47) == -1 ? "image/".concat(strAdmob) : strAdmob;
        }
        int i4 = bArr[iM3393interface + 1] & 255;
        int i5 = iM3393interface + 2;
        int iM3387class = m3387class(i5, iSignatures, bArr);
        String str = new String(bArr, i5, iM3387class - i5, charsetM3399switch);
        int iM3385case = m3385case(iSignatures) + iM3387class;
        return new C12599l(strConcat, str, i4, i3 <= iM3385case ? AbstractC15323l.loadAd : Arrays.copyOfRange(bArr, iM3385case, i3));
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static int m3385case(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static C16609l m3386catch(int i, C13143l c13143l, String str) {
        byte[] bArr = new byte[i];
        c13143l.firebase(0, i, bArr);
        return new C16609l(str, null, new String(bArr, 0, m3393interface(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static int m3387class(int i, int i2, byte[] bArr) {
        int iM3393interface = m3393interface(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM3393interface;
        }
        while (iM3393interface < bArr.length - 1) {
            if ((iM3393interface - i) % 2 == 0 && bArr[iM3393interface + 1] == 0) {
                return iM3393interface;
            }
            iM3393interface = m3393interface(iM3393interface + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static String m3388continue(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static boolean m3389default(C13143l c13143l, int i, int i2, boolean z) {
        int iAppmetrica;
        long jAppmetrica;
        int iM3567synchronized;
        int i3;
        int i4 = c13143l.loadAd;
        while (true) {
            try {
                boolean z2 = true;
                if (c13143l.yandex() < i2) {
                    c13143l.m3562for(i4);
                    return true;
                }
                if (i >= 3) {
                    iAppmetrica = c13143l.remoteconfig();
                    jAppmetrica = c13143l.applovin();
                    iM3567synchronized = c13143l.m3567synchronized();
                } else {
                    iAppmetrica = c13143l.appmetrica();
                    jAppmetrica = c13143l.appmetrica();
                    iM3567synchronized = 0;
                }
                if (iAppmetrica == 0 && jAppmetrica == 0 && iM3567synchronized == 0) {
                    c13143l.m3562for(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jAppmetrica) != 0) {
                        c13143l.m3562for(i4);
                        return false;
                    }
                    jAppmetrica = (((jAppmetrica >> 24) & 255) << 21) | (jAppmetrica & 255) | (((jAppmetrica >> 8) & 255) << 7) | (((jAppmetrica >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM3567synchronized & 64) != 0 ? 1 : 0;
                    if ((iM3567synchronized & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iM3567synchronized & 32) != 0 ? 1 : 0;
                    if ((iM3567synchronized & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jAppmetrica < i3) {
                    c13143l.m3562for(i4);
                    return false;
                }
                if (c13143l.yandex() < jAppmetrica) {
                    c13143l.m3562for(i4);
                    return false;
                }
                c13143l.m3568throw((int) jAppmetrica);
            } catch (Throwable th) {
                c13143l.m3562for(i4);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static C16609l m3390else(int i, C13143l c13143l) {
        if (i < 1) {
            return null;
        }
        int iSignatures = c13143l.signatures();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c13143l.firebase(0, i2, bArr);
        int iM3387class = m3387class(0, iSignatures, bArr);
        String str = new String(bArr, 0, iM3387class, m3399switch(iSignatures));
        int iM3385case = m3385case(iSignatures) + iM3387class;
        return new C16609l("WXXX", str, m3396private(bArr, iM3385case, m3393interface(iM3385case, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static C11403l m3391extends(int i, C13143l c13143l, String str) {
        if (i < 1) {
            return null;
        }
        int iSignatures = c13143l.signatures();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c13143l.firebase(0, i2, bArr);
        return new C11403l(str, null, m3392for(iSignatures, 0, bArr));
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static C13708l m3392for(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return AbstractC1186l.isVip("");
        }
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        int iM3387class = m3387class(i2, i, bArr);
        while (i2 < iM3387class) {
            c16971lMetrica.crashlytics(new String(bArr, i2, iM3387class - i2, m3399switch(i)));
            i2 = m3385case(i) + iM3387class;
            iM3387class = m3387class(i2, i, bArr);
        }
        C13708l c13708lMopub = c16971lMetrica.mopub();
        return c13708lMopub.isEmpty() ? AbstractC1186l.isVip("") : c13708lMopub;
    }

    public static C7207l inmobi(C13143l c13143l, int i, int i2, boolean z, int i3, InterfaceC15129l interfaceC15129l) throws Throwable {
        int i4 = c13143l.loadAd;
        int iM3393interface = m3393interface(i4, c13143l.yandex);
        String str = new String(c13143l.yandex, i4, iM3393interface - i4, StandardCharsets.ISO_8859_1);
        c13143l.m3562for(iM3393interface + 1);
        int iRemoteconfig = c13143l.remoteconfig();
        int iRemoteconfig2 = c13143l.remoteconfig();
        long jApplovin = c13143l.applovin();
        if (jApplovin == 4294967295L) {
            jApplovin = -1;
        }
        long jApplovin2 = c13143l.applovin();
        long j = jApplovin2 == 4294967295L ? -1L : jApplovin2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c13143l.loadAd < i5) {
            AbstractC16800l abstractC16800lM3400synchronized = m3400synchronized(i2, c13143l, z, i3, interfaceC15129l);
            if (abstractC16800lM3400synchronized != null) {
                arrayList.add(abstractC16800lM3400synchronized);
            }
        }
        return new C7207l(str, iRemoteconfig, iRemoteconfig2, jApplovin, j, (AbstractC16800l[]) arrayList.toArray(new AbstractC16800l[0]));
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static int m3393interface(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static C1455l m3394native(int i, C13143l c13143l) {
        byte[] bArr = new byte[i];
        c13143l.firebase(0, i, bArr);
        int iM3393interface = m3393interface(0, bArr);
        String str = new String(bArr, 0, iM3393interface, StandardCharsets.ISO_8859_1);
        int i2 = iM3393interface + 1;
        return new C1455l(str, i <= i2 ? AbstractC15323l.loadAd : Arrays.copyOfRange(bArr, i2, i));
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C3514l m3395package(int i, C13143l c13143l) {
        if (i < 4) {
            return null;
        }
        int iSignatures = c13143l.signatures();
        Charset charsetM3399switch = m3399switch(iSignatures);
        byte[] bArr = new byte[3];
        c13143l.firebase(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c13143l.firebase(0, i2, bArr2);
        int iM3387class = m3387class(0, iSignatures, bArr2);
        String str2 = new String(bArr2, 0, iM3387class, charsetM3399switch);
        int iM3385case = m3385case(iSignatures) + iM3387class;
        return new C3514l(str, str2, m3396private(bArr2, iM3385case, m3387class(iM3385case, iSignatures, bArr2), charsetM3399switch));
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static String m3396private(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static int m3397static(int i, C13143l c13143l) {
        byte[] bArr = c13143l.yandex;
        int i2 = c13143l.loadAd;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static C4036l m3398strictfp(int i, C13143l c13143l) {
        int iSignatures = c13143l.signatures();
        Charset charsetM3399switch = m3399switch(iSignatures);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c13143l.firebase(0, i2, bArr);
        int iM3393interface = m3393interface(0, bArr);
        String strVip = AbstractC3825l.vip(new String(bArr, 0, iM3393interface, StandardCharsets.ISO_8859_1));
        int i3 = iM3393interface + 1;
        int iM3387class = m3387class(i3, iSignatures, bArr);
        String strM3396private = m3396private(bArr, i3, iM3387class, charsetM3399switch);
        int iM3385case = m3385case(iSignatures) + iM3387class;
        int iM3387class2 = m3387class(iM3385case, iSignatures, bArr);
        String strM3396private2 = m3396private(bArr, iM3385case, iM3387class2, charsetM3399switch);
        int iM3385case2 = m3385case(iSignatures) + iM3387class2;
        return new C4036l(strVip, strM3396private, strM3396private2, i2 <= iM3385case2 ? AbstractC15323l.loadAd : Arrays.copyOfRange(bArr, iM3385case2, i2));
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static Charset m3399switch(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [lًٖۨ] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [lْؗؖ] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [lْؗؖ] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [lْؗؖ] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static AbstractC16800l m3400synchronized(int i, C13143l c13143l, boolean z, int i2, InterfaceC15129l interfaceC15129l) throws Throwable {
        int iInmobi;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r9;
        int i4;
        int i5;
        ?? r2;
        Throwable th;
        ?? r3;
        ?? r12;
        ?? r10;
        ?? r11;
        C13143l c13143l2;
        Object c12335l;
        int i6 = i;
        int iSignatures = c13143l.signatures();
        int iSignatures2 = c13143l.signatures();
        int iSignatures3 = c13143l.signatures();
        int iSignatures4 = i6 >= 3 ? c13143l.signatures() : 0;
        if (i6 == 4) {
            iInmobi = c13143l.inmobi();
            if (!z) {
                iInmobi = (((iInmobi >> 24) & 255) << 21) | (iInmobi & 255) | (((iInmobi >> 8) & 255) << 7) | (((iInmobi >> 16) & 255) << 14);
            }
        } else {
            iInmobi = i6 == 3 ? c13143l.inmobi() : c13143l.appmetrica();
        }
        int iM3397static = iInmobi;
        int iM3567synchronized = i6 >= 3 ? c13143l.m3567synchronized() : 0;
        if (iSignatures == 0 && iSignatures2 == 0 && iSignatures3 == 0 && iSignatures4 == 0 && iM3397static == 0 && iM3567synchronized == 0) {
            c13143l.m3562for(c13143l.crashlytics);
            return null;
        }
        int i7 = c13143l.loadAd + iM3397static;
        if (i7 > c13143l.crashlytics) {
            AbstractC6427l.vip("Id3Decoder", "Frame size exceeds remaining tag data");
            c13143l.m3562for(c13143l.crashlytics);
            return null;
        }
        if (interfaceC15129l != null) {
            boolean zLoadAd = interfaceC15129l.loadAd(i6, iSignatures, iSignatures2, iSignatures3, iSignatures4);
            r1 = iSignatures;
            i3 = iSignatures2;
            if (!zLoadAd) {
                i6 = i6;
                c13143l.m3562for(i7);
                return null;
            }
        } else {
            i3 = iSignatures2;
            r1 = iSignatures;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iM3567synchronized & 128) != 0;
            z5 = (iM3567synchronized & 64) != 0;
            z6 = false;
            z4 = (iM3567synchronized & 32) != 0;
            z3 = z2;
        } else if (i6 == 4) {
            boolean z7 = (iM3567synchronized & 64) != 0;
            boolean z8 = (iM3567synchronized & 8) != 0;
            z5 = (iM3567synchronized & 4) != 0;
            z6 = (iM3567synchronized & 2) != 0;
            z3 = (iM3567synchronized & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            AbstractC6427l.vip("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c13143l.m3562for(i7);
            return null;
        }
        if (z4) {
            iM3397static--;
            c13143l.m3568throw(1);
        }
        if (z3) {
            iM3397static -= 4;
            c13143l.m3568throw(4);
        }
        if (z6) {
            iM3397static = m3397static(iM3397static, c13143l);
        }
        try {
            try {
                if (r1 == 84 && i3 == 88 && iSignatures3 == 88 && (i6 == 2 || iSignatures4 == 88)) {
                    c12335l = m3401throw(iM3397static, c13143l);
                } else if (r1 == 84) {
                    c12335l = m3391extends(iM3397static, c13143l, m3388continue(i6, r1, i3, iSignatures3, iSignatures4));
                } else if (r1 == 87 && i3 == 88 && iSignatures3 == 88 && (i6 == 2 || iSignatures4 == 88)) {
                    c12335l = m3390else(iM3397static, c13143l);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && i3 == 82 && iSignatures3 == 73 && iSignatures4 == 86) {
                            c12335l = m3394native(iM3397static, c13143l);
                        } else {
                            th = null;
                            try {
                                if (r1 != 71 || i3 != 69 || iSignatures3 != 79 || (iSignatures4 != 66 && i6 != 2)) {
                                    if (i6 == 2) {
                                        if (r1 == 80 && i3 == 73 && iSignatures3 == 67) {
                                            c12335l = appmetrica(c13143l, iM3397static, i6);
                                        } else if (r1 != 67 && i3 == 79 && iSignatures3 == 77 && (iSignatures4 == 77 || i6 == 2)) {
                                            c12335l = m3395package(iM3397static, c13143l);
                                        } else if (r1 != 67 && i3 == 72 && iSignatures3 == 65 && iSignatures4 == 80) {
                                            int i8 = iM3397static;
                                            iM3397static = i3;
                                            i3 = i8;
                                            r11 = r1;
                                            i4 = iSignatures3;
                                            i5 = iSignatures4;
                                            try {
                                                c12335l = inmobi(c13143l, i3, i6, z, i2, interfaceC15129l);
                                                i6 = i;
                                                r1 = c13143l;
                                            } catch (Exception e) {
                                                e = e;
                                                i6 = i;
                                                r2 = c13143l;
                                                r9 = r11;
                                                r2.m3562for(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e2) {
                                                e = e2;
                                                i6 = i;
                                                r2 = c13143l;
                                                r9 = r11;
                                                r2.m3562for(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = c13143l;
                                                r3.m3562for(i7);
                                                throw th;
                                            }
                                        } else {
                                            int i9 = iM3397static;
                                            iM3397static = i3;
                                            i3 = i9;
                                            r11 = r1;
                                            i4 = iSignatures3;
                                            i5 = iSignatures4;
                                            try {
                                                if (r11 != 67 && iM3397static == 84 && i4 == 79 && i5 == 67) {
                                                    i6 = i;
                                                    C13143l c13143l3 = c13143l;
                                                    c12335l = m3402throws(c13143l3, i3, i6, z, i2, interfaceC15129l);
                                                    r1 = c13143l3;
                                                } else {
                                                    i6 = i;
                                                    c13143l2 = c13143l;
                                                    if (r11 != 77 && iM3397static == 76 && i4 == 76 && i5 == 84) {
                                                        c12335l = m3403volatile(i3, c13143l2);
                                                        r1 = c13143l2;
                                                    } else {
                                                        String strM3388continue = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                        byte[] bArr = new byte[i3];
                                                        c13143l2.firebase(0, i3, bArr);
                                                        c12335l = new C12335l(strM3388continue, bArr);
                                                        r1 = c13143l2;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.m3562for(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.m3562for(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3 = r1;
                                                r3.m3562for(i7);
                                                throw th;
                                            }
                                        }
                                    } else if (r1 == 65 && i3 == 80 && iSignatures3 == 73 && iSignatures4 == 67) {
                                        c12335l = appmetrica(c13143l, iM3397static, i6);
                                    } else {
                                        if (r1 != 67) {
                                        }
                                        if (r1 != 67) {
                                            int i10 = iM3397static;
                                            iM3397static = i3;
                                            i3 = i10;
                                            r11 = r1;
                                            i4 = iSignatures3;
                                            i5 = iSignatures4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                c13143l2 = c13143l;
                                                if (r11 != 77) {
                                                    String strM3388continue2 = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                    byte[] bArr2 = new byte[i3];
                                                    c13143l2.firebase(0, i3, bArr2);
                                                    c12335l = new C12335l(strM3388continue2, bArr2);
                                                    r1 = c13143l2;
                                                } else {
                                                    String strM3388continue3 = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                    byte[] bArr3 = new byte[i3];
                                                    c13143l2.firebase(0, i3, bArr3);
                                                    c12335l = new C12335l(strM3388continue3, bArr3);
                                                    r1 = c13143l2;
                                                }
                                            } else {
                                                i6 = i;
                                                c13143l2 = c13143l;
                                                if (r11 != 77) {
                                                    String strM3388continue4 = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                    byte[] bArr4 = new byte[i3];
                                                    c13143l2.firebase(0, i3, bArr4);
                                                    c12335l = new C12335l(strM3388continue4, bArr4);
                                                    r1 = c13143l2;
                                                } else {
                                                    String strM3388continue5 = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                    byte[] bArr5 = new byte[i3];
                                                    c13143l2.firebase(0, i3, bArr5);
                                                    c12335l = new C12335l(strM3388continue5, bArr5);
                                                    r1 = c13143l2;
                                                }
                                            }
                                        } else {
                                            int i11 = iM3397static;
                                            iM3397static = i3;
                                            i3 = i11;
                                            r11 = r1;
                                            i4 = iSignatures3;
                                            i5 = iSignatures4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                c13143l2 = c13143l;
                                                if (r11 != 77) {
                                                    String strM3388continue6 = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                    byte[] bArr6 = new byte[i3];
                                                    c13143l2.firebase(0, i3, bArr6);
                                                    c12335l = new C12335l(strM3388continue6, bArr6);
                                                    r1 = c13143l2;
                                                } else {
                                                    String strM3388continue7 = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                    byte[] bArr7 = new byte[i3];
                                                    c13143l2.firebase(0, i3, bArr7);
                                                    c12335l = new C12335l(strM3388continue7, bArr7);
                                                    r1 = c13143l2;
                                                }
                                            } else {
                                                i6 = i;
                                                c13143l2 = c13143l;
                                                if (r11 != 77) {
                                                    String strM3388continue8 = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                    byte[] bArr8 = new byte[i3];
                                                    c13143l2.firebase(0, i3, bArr8);
                                                    c12335l = new C12335l(strM3388continue8, bArr8);
                                                    r1 = c13143l2;
                                                } else {
                                                    String strM3388continue9 = m3388continue(i6, r11 == true ? 1 : 0, iM3397static, i4, i5);
                                                    byte[] bArr9 = new byte[i3];
                                                    c13143l2.firebase(0, i3, bArr9);
                                                    c12335l = new C12335l(strM3388continue9, bArr9);
                                                    r1 = c13143l2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        AbstractC6427l.metrica("Id3Decoder", "Failed to decode frame: id=" + m3388continue(i6, r10, iM3397static, i4, i5) + ", frameSize=" + i3, e);
                                    }
                                    return r12;
                                }
                                c12335l = m3398strictfp(iM3397static, c13143l);
                                int i12 = iM3397static;
                                iM3397static = i3;
                                i3 = i12;
                                r11 = r1;
                                i4 = iSignatures3;
                                i5 = iSignatures4;
                                r1 = c13143l;
                            } catch (Exception e5) {
                                e = e5;
                                int i13 = iM3397static;
                                iM3397static = i3;
                                i3 = i13;
                                r9 = r1;
                                i4 = iSignatures3;
                                i5 = iSignatures4;
                                r2 = c13143l;
                                r2.m3562for(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    AbstractC6427l.metrica("Id3Decoder", "Failed to decode frame: id=" + m3388continue(i6, r10, iM3397static, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                int i14 = iM3397static;
                                iM3397static = i3;
                                i3 = i14;
                                r9 = r1;
                                i4 = iSignatures3;
                                i5 = iSignatures4;
                                r2 = c13143l;
                                r2.m3562for(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    AbstractC6427l.metrica("Id3Decoder", "Failed to decode frame: id=" + m3388continue(i6, r10, iM3397static, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            }
                        }
                        r1.m3562for(i7);
                        r12 = c12335l;
                        e = th;
                        r10 = r11;
                        if (r12 == 0) {
                            AbstractC6427l.metrica("Id3Decoder", "Failed to decode frame: id=" + m3388continue(i6, r10, iM3397static, i4, i5) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    c12335l = m3386catch(iM3397static, c13143l, m3388continue(i6, r1, i3, iSignatures3, iSignatures4));
                }
                int i15 = iM3397static;
                iM3397static = i3;
                i3 = i15;
                r11 = r1;
                i4 = iSignatures3;
                i5 = iSignatures4;
                r1 = c13143l;
                th = null;
                r1.m3562for(i7);
                r12 = c12335l;
                e = th;
                r10 = r11;
            } catch (Exception e7) {
                e = e7;
                int i16 = iM3397static;
                iM3397static = i3;
                i3 = i16;
                r9 = r1;
                i4 = iSignatures3;
                i5 = iSignatures4;
                r2 = c13143l;
                th = null;
                r2.m3562for(i7);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    AbstractC6427l.metrica("Id3Decoder", "Failed to decode frame: id=" + m3388continue(i6, r10, iM3397static, i4, i5) + ", frameSize=" + i3, e);
                }
                return r12;
            } catch (OutOfMemoryError e8) {
                e = e8;
                int i17 = iM3397static;
                iM3397static = i3;
                i3 = i17;
                r9 = r1;
                i4 = iSignatures3;
                i5 = iSignatures4;
                r2 = c13143l;
                th = null;
                r2.m3562for(i7);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    AbstractC6427l.metrica("Id3Decoder", "Failed to decode frame: id=" + m3388continue(i6, r10, iM3397static, i4, i5) + ", frameSize=" + i3, e);
                }
                return r12;
            }
            if (r12 == 0) {
                AbstractC6427l.metrica("Id3Decoder", "Failed to decode frame: id=" + m3388continue(i6, r10, iM3397static, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        } catch (Throwable th4) {
            th = th4;
            r3 = c13143l;
        }
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static C11403l m3401throw(int i, C13143l c13143l) {
        if (i < 1) {
            return null;
        }
        int iSignatures = c13143l.signatures();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c13143l.firebase(0, i2, bArr);
        int iM3387class = m3387class(0, iSignatures, bArr);
        return new C11403l("TXXX", new String(bArr, 0, iM3387class, m3399switch(iSignatures)), m3392for(iSignatures, m3385case(iSignatures) + iM3387class, bArr));
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C12894l m3402throws(C13143l c13143l, int i, int i2, boolean z, int i3, InterfaceC15129l interfaceC15129l) throws Throwable {
        int i4 = c13143l.loadAd;
        int iM3393interface = m3393interface(i4, c13143l.yandex);
        String str = new String(c13143l.yandex, i4, iM3393interface - i4, StandardCharsets.ISO_8859_1);
        c13143l.m3562for(iM3393interface + 1);
        int iSignatures = c13143l.signatures();
        boolean z2 = (iSignatures & 2) != 0;
        boolean z3 = (iSignatures & 1) != 0;
        int iSignatures2 = c13143l.signatures();
        String[] strArr = new String[iSignatures2];
        for (int i5 = 0; i5 < iSignatures2; i5++) {
            int i6 = c13143l.loadAd;
            int iM3393interface2 = m3393interface(i6, c13143l.yandex);
            strArr[i5] = new String(c13143l.yandex, i6, iM3393interface2 - i6, StandardCharsets.ISO_8859_1);
            c13143l.m3562for(iM3393interface2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c13143l.loadAd < i7) {
            AbstractC16800l abstractC16800lM3400synchronized = m3400synchronized(i2, c13143l, z, i3, interfaceC15129l);
            if (abstractC16800lM3400synchronized != null) {
                arrayList.add(abstractC16800lM3400synchronized);
            }
        }
        return new C12894l(str, z2, z3, strArr, (AbstractC16800l[]) arrayList.toArray(new AbstractC16800l[0]));
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static C18132l m3403volatile(int i, C13143l c13143l) {
        int iM3567synchronized = c13143l.m3567synchronized();
        int iAppmetrica = c13143l.appmetrica();
        int iAppmetrica2 = c13143l.appmetrica();
        int iSignatures = c13143l.signatures();
        int iSignatures2 = c13143l.signatures();
        C5257l c5257l = new C5257l();
        c5257l.smaato(c13143l);
        int i2 = ((i - 10) * 8) / (iSignatures + iSignatures2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iMopub = c5257l.mopub(iSignatures);
            int iMopub2 = c5257l.mopub(iSignatures2);
            iArr[i3] = iMopub;
            iArr2[i3] = iMopub2;
        }
        return new C18132l(iM3567synchronized, iAppmetrica, iArr, iArr2, iAppmetrica2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final C7417l applovin(int i, byte[] bArr) {
        boolean z;
        C13096l c13096l;
        int i2;
        int i3;
        int iM3397static;
        AbstractC16800l abstractC16800lM3400synchronized;
        ArrayList arrayList = new ArrayList();
        C13143l c13143l = new C13143l(bArr, i);
        boolean z2 = false;
        if (c13143l.yandex() < 10) {
            AbstractC6427l.vip("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iAppmetrica = c13143l.appmetrica();
            if (iAppmetrica == 4801587) {
                int iSignatures = c13143l.signatures();
                c13143l.m3568throw(1);
                int iSignatures2 = c13143l.signatures();
                int iIsVip = c13143l.isVip();
                if (iSignatures != 2) {
                    if (iSignatures == 3) {
                        if ((iSignatures2 & 64) != 0) {
                            int iRemoteconfig = c13143l.remoteconfig();
                            c13143l.m3568throw(iRemoteconfig);
                            iIsVip -= iRemoteconfig + 4;
                        }
                    } else if (iSignatures == 4) {
                        if ((iSignatures2 & 64) != 0) {
                            int iIsVip2 = c13143l.isVip();
                            c13143l.m3568throw(iIsVip2 - 4);
                            iIsVip -= iIsVip2;
                        }
                        if ((iSignatures2 & 16) != 0) {
                            iIsVip -= 10;
                        }
                    } else {
                        AbstractC12900l.subscription("Skipped ID3 tag with unsupported majorVersion=", iSignatures, "Id3Decoder");
                    }
                    if (iSignatures < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c13096l = new C13096l(iSignatures, iIsVip, z);
                } else if ((iSignatures2 & 64) != 0) {
                    AbstractC6427l.vip("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iSignatures < 4 || (iSignatures2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c13096l = new C13096l(iSignatures, iIsVip, z);
                }
                if (c13096l == null) {
                    return null;
                }
                i2 = c13096l.yandex;
                int i4 = c13143l.loadAd;
                i3 = i2 == 2 ? 6 : 10;
                iM3397static = c13096l.crashlytics;
                if (c13096l.loadAd) {
                    iM3397static = m3397static(iM3397static, c13143l);
                }
                c13143l.m3561extends(i4 + iM3397static);
                if (!m3389default(c13143l, i2, i3, false)) {
                    if (i2 == 4 || !m3389default(c13143l, 4, i3, true)) {
                        AbstractC12900l.subscription("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (c13143l.yandex() >= i3) {
                    abstractC16800lM3400synchronized = m3400synchronized(i2, c13143l, z2, i3, this.isPro);
                    if (abstractC16800lM3400synchronized != null) {
                        arrayList.add(abstractC16800lM3400synchronized);
                    }
                }
                return new C7417l(arrayList);
            }
            AbstractC6427l.vip("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iAppmetrica))));
        }
        c13096l = null;
        if (c13096l == null) {
            return null;
        }
        i2 = c13096l.yandex;
        int i5 = c13143l.loadAd;
        if (i2 == 2) {
        }
        iM3397static = c13096l.crashlytics;
        if (c13096l.loadAd) {
            iM3397static = m3397static(iM3397static, c13143l);
        }
        c13143l.m3561extends(i5 + iM3397static);
        if (!m3389default(c13143l, i2, i3, false)) {
            if (i2 == 4) {
            }
            AbstractC12900l.subscription("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
            return null;
        }
        while (c13143l.yandex() >= i3) {
            abstractC16800lM3400synchronized = m3400synchronized(i2, c13143l, z2, i3, this.isPro);
            if (abstractC16800lM3400synchronized != null) {
                arrayList.add(abstractC16800lM3400synchronized);
            }
        }
        return new C7417l(arrayList);
    }

    @Override // defpackage.AbstractC6791l
    public final C7417l subs(C15608l c15608l, ByteBuffer byteBuffer) {
        return applovin(byteBuffer.limit(), byteBuffer.array());
    }
}
