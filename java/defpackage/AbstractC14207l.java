package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14207l {
    public static final String[] amazon;
    public static final String[] crashlytics;
    public static final String[] loadAd;
    public static final C3844l yandex;

    static {
        C3844l c3844l = new C3844l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(AbstractC9050l.yandex));
        c3844l.f7951l = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        yandex = c3844l;
        loadAd = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        crashlytics = new String[64];
        String[] strArr = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            strArr[i] = AbstractC11432l.amazon("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        amazon = strArr;
        String[] strArr2 = crashlytics;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC0653l.ads(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = crashlytics;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC0653l.ads(sb, strArr3[i4], "|PADDED");
        }
        int length = crashlytics.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = crashlytics;
            if (strArr4[i7] == null) {
                strArr4[i7] = amazon[i7];
            }
        }
    }

    public static String crashlytics(int i, int i2, long j, boolean z) {
        return AbstractC11432l.amazon("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), yandex(8), Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    public static String loadAd(boolean z, int i, int i2, int i3, int i4) {
        String strAdvert;
        String strYandex = yandex(i3);
        if (i4 == 0) {
            strAdvert = "";
        } else {
            String[] strArr = amazon;
            if (i3 == 2 || i3 == 3) {
                strAdvert = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strAdvert = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 == 7 || i3 == 8) {
                strAdvert = strArr[i4];
            } else {
                String[] strArr2 = crashlytics;
                String str = i4 < strArr2.length ? strArr2[i4] : strArr[i4];
                if (i3 != 5 || (i4 & 4) == 0) {
                    strAdvert = (i3 != 0 || (i4 & 32) == 0) ? str : AbstractC16648l.advert(str, "PRIORITY", "COMPRESSED", false);
                } else {
                    strAdvert = AbstractC16648l.advert(str, "HEADERS", "PUSH_PROMISE", false);
                }
            }
        }
        return AbstractC11432l.amazon("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strYandex, strAdvert);
    }

    public static String yandex(int i) {
        String[] strArr = loadAd;
        return i < strArr.length ? strArr[i] : AbstractC11432l.amazon("0x%02x", Integer.valueOf(i));
    }
}
