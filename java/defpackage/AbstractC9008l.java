package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.util.Vector;

/* JADX INFO: renamed from: lٌۘۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9008l {
    public static final String yandex;

    static {
        try {
            try {
                yandex = (String) AccessController.doPrivileged(new C5052l());
            } catch (Exception unused) {
                yandex = "\n";
            }
        } catch (Exception unused2) {
            yandex = String.format("%n", new Object[0]);
        }
    }

    public static String amazon(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static byte[] billing(char[] cArr) {
        int length = cArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            purchase(cArr, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            C8339l.smaato("cannot encode string to byte array!");
            return null;
        }
    }

    public static byte[] crashlytics(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String[] loadAd(String str) {
        int i;
        Vector vector = new Vector();
        boolean z = true;
        while (true) {
            if (!z) {
                break;
            }
            int iIndexOf = str.indexOf(46);
            if (iIndexOf >= 0) {
                vector.addElement(str.substring(0, iIndexOf));
                str = str.substring(iIndexOf + 1);
            } else {
                vector.addElement(str);
                z = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static String mopub(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static void purchase(char[] cArr, int i, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        int i2;
        String str;
        int i3;
        if (i < 1) {
            return;
        }
        byte[] bArr = new byte[64];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 1;
            char c = cArr[i4];
            if (c < 128) {
                i2 = i5 + 1;
                bArr[i5] = (byte) c;
            } else {
                if (c >= 2048) {
                    if (c >= 55296 && c <= 57343) {
                        if (c > 56319) {
                            str = "invalid UTF-16 high surrogate";
                            break;
                        }
                        if (i6 >= i) {
                            str = "invalid UTF-16 codepoint (truncated surrogate pair)";
                            break;
                        }
                        int i7 = i4 + 2;
                        char c2 = cArr[i6];
                        if (c2 < 56320 || c2 > 57343) {
                            str = "invalid UTF-16 low surrogate";
                            break;
                        }
                        int i8 = ((c2 & 1023) | ((c & 1023) << 10)) + 65536;
                        bArr[i5] = (byte) ((i8 >> 18) | 240);
                        bArr[i5 + 1] = (byte) (((i8 >> 12) & 63) | 128);
                        int i9 = i5 + 3;
                        bArr[i5 + 2] = (byte) (((i8 >> 6) & 63) | 128);
                        i3 = i5 + 4;
                        bArr[i9] = (byte) ((i8 & 63) | 128);
                        i6 = i7;
                    } else {
                        bArr[i5] = (byte) ((c >> '\f') | 224);
                        bArr[i5 + 1] = (byte) (((c >> 6) & 63) | 128);
                        i2 = i5 + 3;
                        bArr[i5 + 2] = (byte) ((c & '?') | 128);
                    }
                } else {
                    int i10 = i5 + 1;
                    bArr[i5] = (byte) ((c >> 6) | 192);
                    i3 = i5 + 2;
                    bArr[i10] = (byte) ((c & '?') | 128);
                }
                i2 = i3;
            }
            if (i2 + 4 > 64) {
                byteArrayOutputStream.write(bArr, 0, i2);
                i5 = 0;
            } else {
                i5 = i2;
            }
            if (i6 >= i) {
                if (i5 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i5);
                    return;
                }
                return;
            }
            i4 = i6;
        }
        C8339l.smaato(str);
    }

    public static String yandex(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }
}
