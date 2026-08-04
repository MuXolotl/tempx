package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: renamed from: lًٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7712l {
    public static final byte[] yandex = new byte[0];
    public static final C5884l loadAd = AbstractC14770l.firebase(AbstractC3670l.yandex("efbbbf"), AbstractC3670l.yandex("feff"), AbstractC3670l.yandex("fffe0000"), AbstractC3670l.yandex("fffe"), AbstractC3670l.yandex("0000feff"));

    public static final int admob(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int amazon(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean billing(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int crashlytics(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (AbstractC12024l.inmobi(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean firebase(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final String[] isPro(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final void loadAd(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int metrica(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Alert.DURATION_SHOW_INDEFINITELY;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final int mopub(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC8576l.subs(cCharAt, 31) <= 0 || AbstractC8576l.subs(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ int purchase(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return amazon(str, c, i, i2);
    }

    public static final int remoteconfig(InterfaceC9473l interfaceC9473l) {
        return (interfaceC9473l.readByte() & 255) | ((interfaceC9473l.readByte() & 255) << 16) | ((interfaceC9473l.readByte() & 255) << 8);
    }

    public static final int smaato(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final String startapp(int i, int i2, String str) {
        int iAdmob = admob(i, i2, str);
        return str.substring(iAdmob, subs(iAdmob, i2, str));
    }

    public static final int subs(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int vip(C0869l c0869l) {
        int i = 0;
        while (!c0869l.subs() && c0869l.ads(0L) == 61) {
            i++;
            c0869l.readByte();
        }
        return i;
    }

    public static final void yandex(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbSignature = AbstractC0653l.Signature(j, "length=", ", offset=");
            sbSignature.append(j2);
            sbSignature.append(", count=");
            sbSignature.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbSignature.toString());
        }
    }
}
