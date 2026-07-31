package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: lْؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1019l {
    public static final byte[] yandex = {112, 114, 111, 0};
    public static final byte[] loadAd = {112, 114, 109, 0};

    public static void adcel(ByteArrayOutputStream byteArrayOutputStream, C10713l c10713l) throws IOException {
        tapsense(byteArrayOutputStream, c10713l);
        int i = c10713l.mopub;
        int[] iArr = c10713l.admob;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            AbstractC17834l.subs(i4 - i3, byteArrayOutputStream);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c10713l.subs.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static C3532l admob(C13545l c13545l) {
        C3532l c3532l = null;
        if (c13545l == null) {
            return null;
        }
        int i = 27;
        List listM2943abstract = C10685l.m2943abstract(C3532l.billing, c13545l, 0, 0, new C8337l(i), 6);
        if (listM2943abstract.size() == 1) {
            return (C3532l) ((C8195l) listM2943abstract.get(0)).f17097l;
        }
        int length = c13545l.length();
        ArrayList arrayList = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                char cCharAt = c13545l.charAt(i2);
                if (cCharAt != ' ' && cCharAt != ',') {
                    i3 = i2;
                    i2 = i3;
                    break;
                }
                i2++;
                if (i2 >= length) {
                    i2 = i2;
                    break;
                }
            }
            while (i2 < length) {
                char cCharAt2 = c13545l.charAt(i2);
                if (cCharAt2 == ' ' || cCharAt2 == ',') {
                    break;
                }
                i2++;
            }
            C8195l c8195l = (C8195l) AbstractC16901l.m4236public(C3532l.billing.m2954import(c13545l, i3, i2, true, new C8337l(i)));
            if (c8195l == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c13545l.subSequence(i3, i2).toString());
            } else {
                Object obj = c8195l.f17097l;
                if (c3532l == null) {
                    c3532l = (C3532l) obj;
                } else {
                    c3532l = new C3532l(c3532l.yandex || ((C3532l) obj).yandex, c3532l.loadAd || ((C3532l) obj).loadAd, c3532l.crashlytics || ((C3532l) obj).crashlytics, C2580l.f5619l);
                }
            }
        }
        if (c3532l == null) {
            c3532l = C3532l.purchase;
        }
        return arrayList == null ? c3532l : new C3532l(c3532l.yandex, c3532l.loadAd, c3532l.crashlytics, arrayList);
    }

    public static void ads(ByteArrayOutputStream byteArrayOutputStream, C10713l c10713l, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC17834l.subs(str.getBytes(charset).length, byteArrayOutputStream);
        AbstractC17834l.subs(c10713l.purchase, byteArrayOutputStream);
        AbstractC17834l.admob(byteArrayOutputStream, c10713l.billing, 4);
        AbstractC17834l.admob(byteArrayOutputStream, c10713l.crashlytics, 4);
        AbstractC17834l.admob(byteArrayOutputStream, c10713l.mopub, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static String amazon(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean billing(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static String crashlytics(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC13766l.purchase;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = AbstractC13766l.amazon;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC0653l.ads(AbstractC5020l.ad(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static C10713l[] firebase(ByteArrayInputStream byteArrayInputStream, int i, C10713l[] c10713lArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C10713l[0];
        }
        if (i != c10713lArr.length) {
            C8339l.smaato("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iMopub = (int) AbstractC17834l.mopub(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC17834l.mopub(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC17834l.amazon(byteArrayInputStream, iMopub), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C10713l c10713l = c10713lArr[i3];
            if (!c10713l.loadAd.equals(strArr[i3])) {
                C8339l.smaato("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            c10713l.purchase = i4;
            c10713l.admob = subs(byteArrayInputStream, i4);
        }
        return c10713lArr;
    }

    public static C10713l[] isPro(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C10713l[] c10713lArr) throws IOException {
        byte[] bArr3 = AbstractC13766l.billing;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC13766l.mopub)) {
                C8339l.smaato("Unsupported meta version");
                return null;
            }
            int iMopub = (int) AbstractC17834l.mopub(fileInputStream, 2);
            byte[] bArrBilling = AbstractC17834l.billing(fileInputStream, (int) AbstractC17834l.mopub(fileInputStream, 4), (int) AbstractC17834l.mopub(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C8339l.smaato("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrBilling);
            try {
                C10713l[] c10713lArrSmaato = smaato(byteArrayInputStream, bArr2, iMopub, c10713lArr);
                byteArrayInputStream.close();
                return c10713lArrSmaato;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC13766l.yandex, bArr2)) {
            C8339l.smaato("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C8339l.smaato("Unsupported meta version");
            return null;
        }
        int iMopub2 = (int) AbstractC17834l.mopub(fileInputStream, 1);
        byte[] bArrBilling2 = AbstractC17834l.billing(fileInputStream, (int) AbstractC17834l.mopub(fileInputStream, 4), (int) AbstractC17834l.mopub(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C8339l.smaato("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrBilling2);
        try {
            C10713l[] c10713lArrFirebase = firebase(byteArrayInputStream2, iMopub2, c10713lArr);
            byteArrayInputStream2.close();
            return c10713lArrFirebase;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static byte[] loadAd(C10713l[] c10713lArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C10713l c10713l : c10713lArr) {
            length += ((((c10713l.mopub * 2) + 7) & (-8)) / 8) + (c10713l.purchase * 2) + crashlytics(c10713l.yandex, c10713l.loadAd, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c10713l.billing;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC13766l.crashlytics)) {
            int length2 = c10713lArr.length;
            while (i < length2) {
                C10713l c10713l2 = c10713lArr[i];
                ads(byteArrayOutputStream, c10713l2, crashlytics(c10713l2.yandex, c10713l2.loadAd, bArr));
                adcel(byteArrayOutputStream, c10713l2);
                i++;
            }
        } else {
            for (C10713l c10713l3 : c10713lArr) {
                ads(byteArrayOutputStream, c10713l3, crashlytics(c10713l3.yandex, c10713l3.loadAd, bArr));
            }
            int length3 = c10713lArr.length;
            while (i < length3) {
                adcel(byteArrayOutputStream, c10713lArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        C18073l.subs(byteArrayOutputStream.size(), length, " expected=", "The bytes saved do not match expectation. actual=");
        return null;
    }

    public static final int metrica(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static boolean mopub(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final Object purchase(InterfaceC6357l interfaceC6357l) {
        Object objSignature = interfaceC6357l.Signature();
        C6414l c6414l = objSignature instanceof C6414l ? (C6414l) objSignature : null;
        if (c6414l != null) {
            return c6414l.f13396l;
        }
        return null;
    }

    public static C10713l[] remoteconfig(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC13766l.loadAd)) {
            C8339l.smaato("Unsupported version");
            return null;
        }
        int iMopub = (int) AbstractC17834l.mopub(fileInputStream, 1);
        byte[] bArrBilling = AbstractC17834l.billing(fileInputStream, (int) AbstractC17834l.mopub(fileInputStream, 4), (int) AbstractC17834l.mopub(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C8339l.smaato("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrBilling);
        try {
            C10713l[] c10713lArrVip = vip(byteArrayInputStream, str, iMopub);
            byteArrayInputStream.close();
            return c10713lArrVip;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C10713l[] smaato(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C10713l[] c10713lArr) {
        C10713l c10713l;
        if (byteArrayInputStream.available() == 0) {
            return new C10713l[0];
        }
        if (i != c10713lArr.length) {
            C8339l.smaato("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC17834l.mopub(byteArrayInputStream, 2);
            String str = new String(AbstractC17834l.amazon(byteArrayInputStream, (int) AbstractC17834l.mopub(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jMopub = AbstractC17834l.mopub(byteArrayInputStream, 4);
            int iMopub = (int) AbstractC17834l.mopub(byteArrayInputStream, 2);
            if (c10713lArr.length <= 0) {
                c10713l = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= c10713lArr.length) {
                    c10713l = null;
                    break;
                }
                if (c10713lArr[i3].loadAd.equals(strSubstring)) {
                    c10713l = c10713lArr[i3];
                    break;
                }
                i3++;
            }
            if (c10713l == null) {
                C8339l.smaato("Missing profile key: ".concat(str));
                return null;
            }
            c10713l.amazon = jMopub;
            int[] iArrSubs = subs(byteArrayInputStream, iMopub);
            if (Arrays.equals(bArr, AbstractC13766l.purchase)) {
                c10713l.purchase = iMopub;
                c10713l.admob = iArrSubs;
            }
        }
        return c10713lArr;
    }

    public static boolean startapp(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C10713l[] c10713lArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = AbstractC13766l.yandex;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = AbstractC13766l.loadAd;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrLoadAd = loadAd(c10713lArr, bArr3);
                AbstractC17834l.admob(byteArrayOutputStream, c10713lArr.length, 1);
                AbstractC17834l.admob(byteArrayOutputStream, bArrLoadAd.length, 4);
                byte[] bArrCrashlytics = AbstractC17834l.crashlytics(bArrLoadAd);
                AbstractC17834l.admob(byteArrayOutputStream, bArrCrashlytics.length, 4);
                byteArrayOutputStream.write(bArrCrashlytics);
                return true;
            }
            byte[] bArr4 = AbstractC13766l.amazon;
            if (Arrays.equals(bArr, bArr4)) {
                AbstractC17834l.admob(byteArrayOutputStream, c10713lArr.length, 1);
                for (C10713l c10713l : c10713lArr) {
                    int size = c10713l.subs.size() * 4;
                    String strCrashlytics = crashlytics(c10713l.yandex, c10713l.loadAd, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC17834l.subs(strCrashlytics.getBytes(charset).length, byteArrayOutputStream);
                    AbstractC17834l.subs(c10713l.admob.length, byteArrayOutputStream);
                    AbstractC17834l.admob(byteArrayOutputStream, size, 4);
                    AbstractC17834l.admob(byteArrayOutputStream, c10713l.crashlytics, 4);
                    byteArrayOutputStream.write(strCrashlytics.getBytes(charset));
                    Iterator it = c10713l.subs.keySet().iterator();
                    while (it.hasNext()) {
                        AbstractC17834l.subs(((Integer) it.next()).intValue(), byteArrayOutputStream);
                        AbstractC17834l.subs(0, byteArrayOutputStream);
                    }
                    for (int i2 : c10713l.admob) {
                        AbstractC17834l.subs(i2, byteArrayOutputStream);
                    }
                }
                return true;
            }
            byte[] bArr5 = AbstractC13766l.crashlytics;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrLoadAd2 = loadAd(c10713lArr, bArr5);
                AbstractC17834l.admob(byteArrayOutputStream, c10713lArr.length, 1);
                AbstractC17834l.admob(byteArrayOutputStream, bArrLoadAd2.length, 4);
                byte[] bArrCrashlytics2 = AbstractC17834l.crashlytics(bArrLoadAd2);
                AbstractC17834l.admob(byteArrayOutputStream, bArrCrashlytics2.length, 4);
                byteArrayOutputStream.write(bArrCrashlytics2);
                return true;
            }
            byte[] bArr6 = AbstractC13766l.purchase;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            AbstractC17834l.subs(c10713lArr.length, byteArrayOutputStream);
            for (C10713l c10713l2 : c10713lArr) {
                String str = c10713l2.yandex;
                TreeMap treeMap = c10713l2.subs;
                String strCrashlytics2 = crashlytics(str, c10713l2.loadAd, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC17834l.subs(strCrashlytics2.getBytes(charset2).length, byteArrayOutputStream);
                AbstractC17834l.subs(treeMap.size(), byteArrayOutputStream);
                AbstractC17834l.subs(c10713l2.admob.length, byteArrayOutputStream);
                AbstractC17834l.admob(byteArrayOutputStream, c10713l2.crashlytics, 4);
                byteArrayOutputStream.write(strCrashlytics2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    AbstractC17834l.subs(((Integer) it2.next()).intValue(), byteArrayOutputStream);
                }
                for (int i3 : c10713l2.admob) {
                    AbstractC17834l.subs(i3, byteArrayOutputStream);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            AbstractC17834l.subs(c10713lArr.length, byteArrayOutputStream2);
            int i4 = 2;
            int i5 = 2;
            for (C10713l c10713l3 : c10713lArr) {
                AbstractC17834l.admob(byteArrayOutputStream2, c10713l3.crashlytics, 4);
                AbstractC17834l.admob(byteArrayOutputStream2, c10713l3.amazon, 4);
                AbstractC17834l.admob(byteArrayOutputStream2, c10713l3.mopub, 4);
                String strCrashlytics3 = crashlytics(c10713l3.yandex, c10713l3.loadAd, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strCrashlytics3.getBytes(charset3).length;
                AbstractC17834l.subs(length2, byteArrayOutputStream2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strCrashlytics3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C4535l c4535l = new C4535l(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(c4535l);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c10713lArr.length) {
                try {
                    C10713l c10713l4 = c10713lArr[i6];
                    AbstractC17834l.subs(i6, byteArrayOutputStream3);
                    AbstractC17834l.subs(c10713l4.purchase, byteArrayOutputStream3);
                    i7 = i7 + 4 + (c10713l4.purchase * i4);
                    int[] iArr = c10713l4.admob;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        AbstractC17834l.subs(i9 - i8, byteArrayOutputStream3);
                        i++;
                        i4 = i4;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i10 = i4;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C4535l c4535l2 = new C4535l(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(c4535l2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c10713lArr.length) {
                try {
                    C10713l c10713l5 = c10713lArr[i11];
                    Iterator it3 = c10713l5.subs.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        subscription(byteArrayOutputStream5, iIntValue, c10713l5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            tapsense(byteArrayOutputStream6, c10713l5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            AbstractC17834l.subs(i11, byteArrayOutputStream4);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            AbstractC17834l.admob(byteArrayOutputStream4, length4, 4);
                            AbstractC17834l.subs(iIntValue, byteArrayOutputStream4);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C4535l c4535l3 = new C4535l(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList2.add(c4535l3);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            AbstractC17834l.admob(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                C4535l c4535l4 = (C4535l) arrayList2.get(i14);
                int i15 = c4535l4.yandex;
                byte[] bArr7 = c4535l4.loadAd;
                int i16 = i10;
                if (i15 == 1) {
                    j = 0;
                } else if (i15 == i16) {
                    j = 1;
                } else if (i15 == 3) {
                    j = 2;
                } else if (i15 == 4) {
                    j = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                AbstractC17834l.admob(byteArrayOutputStream, j, 4);
                AbstractC17834l.admob(byteArrayOutputStream, size2, 4);
                if (c4535l4.crashlytics) {
                    long length5 = bArr7.length;
                    byte[] bArrCrashlytics3 = AbstractC17834l.crashlytics(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrCrashlytics3);
                    AbstractC17834l.admob(byteArrayOutputStream, bArrCrashlytics3.length, 4);
                    AbstractC17834l.admob(byteArrayOutputStream, length5, 4);
                    length = bArrCrashlytics3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    AbstractC17834l.admob(byteArrayOutputStream, bArr7.length, 4);
                    AbstractC17834l.admob(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
                i10 = i16;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static int[] subs(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iMopub = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iMopub += (int) AbstractC17834l.mopub(byteArrayInputStream, 2);
            iArr[i2] = iMopub;
        }
        return iArr;
    }

    public static void subscription(ByteArrayOutputStream byteArrayOutputStream, int i, C10713l c10713l) throws IOException {
        int i2 = c10713l.mopub;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c10713l.subs.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void tapsense(ByteArrayOutputStream byteArrayOutputStream, C10713l c10713l) {
        int i = 0;
        for (Map.Entry entry : c10713l.subs.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC17834l.subs(iIntValue - i, byteArrayOutputStream);
                AbstractC17834l.subs(0, byteArrayOutputStream);
                i = iIntValue;
            }
        }
    }

    public static C10713l[] vip(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C10713l[0];
        }
        C10713l[] c10713lArr = new C10713l[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iMopub = (int) AbstractC17834l.mopub(byteArrayInputStream, 2);
            int iMopub2 = (int) AbstractC17834l.mopub(byteArrayInputStream, 2);
            c10713lArr[i3] = new C10713l(str, new String(AbstractC17834l.amazon(byteArrayInputStream, iMopub), StandardCharsets.UTF_8), AbstractC17834l.mopub(byteArrayInputStream, 4), iMopub2, (int) AbstractC17834l.mopub(byteArrayInputStream, 4), (int) AbstractC17834l.mopub(byteArrayInputStream, 4), new int[iMopub2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C10713l c10713l = c10713lArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c10713l.billing;
            int i6 = c10713l.mopub;
            TreeMap treeMap = c10713l.subs;
            int i7 = iAvailable - i5;
            int iMopub3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iMopub3 += (int) AbstractC17834l.mopub(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iMopub3), 1);
                int iMopub4 = (int) AbstractC17834l.mopub(byteArrayInputStream, 2);
                while (iMopub4 > 0) {
                    AbstractC17834l.mopub(byteArrayInputStream, 2);
                    int iMopub5 = (int) AbstractC17834l.mopub(byteArrayInputStream, 1);
                    if (iMopub5 != 6 && iMopub5 != 7) {
                        while (iMopub5 > 0) {
                            AbstractC17834l.mopub(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iMopub6 = (int) AbstractC17834l.mopub(byteArrayInputStream, 1); iMopub6 > 0; iMopub6--) {
                                AbstractC17834l.mopub(byteArrayInputStream, 2);
                            }
                            iMopub5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iMopub4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C8339l.smaato("Read too much data during profile line parse");
                return null;
            }
            c10713l.admob = subs(byteArrayInputStream, c10713l.purchase);
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC17834l.amazon(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c10713lArr;
    }

    public static final String yandex(Method method) {
        return method.getName() + AbstractC8669l.m2416switch(method.getParameterTypes(), "", "(", ")", C12844l.f25255l, 24) + AbstractC1845l.loadAd(method.getReturnType());
    }
}
