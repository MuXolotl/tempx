package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؖ۟ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4421l {
    public static final C4421l admob;
    public static final C4421l amazon;
    public static final C4421l billing;
    public static final C4421l firebase;
    public static final C4421l isPro;
    public static final C4421l metrica;
    public static final C4421l mopub;
    public static final C4421l purchase;
    public static final C4421l remoteconfig;
    public static final Pattern smaato;
    public static final C4421l subs;
    public static final HashMap vip;
    public int crashlytics;
    public int[] loadAd;
    public String yandex;

    static {
        C4421l c4421l = new C4421l(new int[]{64, 164, 241, 73, 206, 78, 208, 17, 163, 172, 0, 160, 201, 3, 72, 246}, "Audio error concealment absent.");
        new C4421l(new int[]{64, 164, 241, 73, 206, 78, 208, 17, 163, 172, 0, 160, 201, 3, 72, 246}, "Interleaved audio error concealment.");
        C4421l c4421l2 = new C4421l(new int[]{64, 158, 105, 248, 77, 91, 207, 17, 168, 253, 0, 128, 95, 92, 68, 43}, " Audio stream");
        C4421l c4421l3 = new C4421l(new int[]{250, 179, 17, 34, 35, 189, 210, 17, 180, 183, 0, 160, 201, 85, 252, 110}, "Content Branding");
        amazon = c4421l3;
        C4421l c4421l4 = new C4421l(new int[]{251, 179, 17, 34, 35, 189, 210, 17, 180, 183, 0, 160, 201, 85, 252, 110}, "Content Encryption Object");
        C4421l c4421l5 = new C4421l(new int[]{51, 38, 178, 117, 142, 102, 207, 17, 166, 217, 0, 170, 0, 98, 206, 108}, "Content Description");
        purchase = c4421l5;
        C4421l c4421l6 = new C4421l(new int[]{64, 82, 209, 134, 29, 49, 208, 17, 163, 164, 0, 160, 201, 3, 72, 246}, "Encoding description");
        C4421l c4421l7 = new C4421l(new int[]{64, 164, 208, 210, 7, 227, 210, 17, 151, 240, 0, 160, 201, 94, 168, 80}, "Extended Content Description");
        billing = c4421l7;
        C4421l c4421l8 = new C4421l(new int[]{161, 220, 171, 140, 71, 169, 207, 17, 142, 228, 0, 192, 12, 32, 83, EnergyProfile.EVCONNECTOR_TYPE_OTHER}, "File header");
        mopub = c4421l8;
        C4421l c4421l9 = new C4421l(new int[]{48, 38, 178, 117, 142, 102, 207, 17, 166, 217, 0, 170, 0, 98, 206, 108}, "Asf header");
        admob = c4421l9;
        C4421l c4421l10 = new C4421l(new int[]{181, 3, 191, 95, 46, 169, 207, 17, 142, 227, 0, 192, 12, 32, 83, EnergyProfile.EVCONNECTOR_TYPE_OTHER}, "Header Extension");
        subs = c4421l10;
        C4421l c4421l11 = new C4421l(new int[]{169, 70, 67, 124, 224, 239, 252, 75, 178, 41, 57, 62, 222, 65, 92, 133}, "Language List");
        C4421l c4421l12 = new C4421l(new int[]{234, 203, 248, 197, 175, 91, 119, 72, 132, 103, 170, 140, 68, 250, 76, 202}, "Metadata");
        isPro = c4421l12;
        C4421l c4421l13 = new C4421l(new int[]{148, 28, 35, 68, 152, 148, 209, 73, 161, 65, 29, 19, 78, 69, 112, 84}, "Metadata Library");
        firebase = c4421l13;
        smaato = Pattern.compile("[a-f0-9]{8}\\-[a-f0-9]{4}\\-[a-f0-9]{4}\\-[a-f0-9]{4}\\-[a-f0-9]{12}", 2);
        C4421l c4421l14 = new C4421l(new int[]{145, 7, 220, 183, 183, 169, 207, 17, 142, 230, 0, 192, 12, 32, 83, EnergyProfile.EVCONNECTOR_TYPE_OTHER}, "Stream");
        remoteconfig = c4421l14;
        C4421l c4421l15 = new C4421l(new int[]{206, 117, 248, 123, 141, 70, 209, 17, 141, 130, 0, 96, 151, 201, 162, 178}, "Stream bitrate properties");
        C4421l c4421l16 = new C4421l(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, "Unspecified");
        metrica = c4421l16;
        C4421l[] c4421lArr = {c4421l, c4421l5, c4421l2, c4421l6, c4421l8, c4421l9, c4421l14, c4421l7, new C4421l(new int[]{192, 239, 25, 188, 77, 91, 207, 17, 168, 253, 0, 128, 95, 92, 68, 43}, "Video stream"), c4421l10, c4421l15, new C4421l(new int[]{48, 26, 251, 30, 98, 11, 208, 17, 163, 155, 0, 160, 201, 3, 72, 246}, "Script Command Object"), c4421l4, c4421l3, c4421l16, c4421l13, c4421l12, c4421l11};
        vip = new HashMap(18);
        for (int i = 0; i < 18; i++) {
            C4421l c4421l17 = c4421lArr[i];
            vip.put(c4421l17, c4421l17);
        }
    }

    public C4421l(int[] iArr) {
        this.yandex = "";
        this.loadAd = null;
        if (iArr.length != 16) {
            C8339l.metrica("The given guidData doesn't match the GUID specification.");
            throw null;
        }
        int[] iArr2 = new int[16];
        this.loadAd = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 16);
    }

    public static C4421l loadAd(String str) {
        if (str == null) {
            throw new C14612l("null");
        }
        if (!smaato.matcher(str).matches()) {
            throw new C14612l("Invalid guidData format.");
        }
        int[] iArr = new int[16];
        int[] iArr2 = {3, 2, 1, 0, 5, 4, 7, 6, 8, 9, 10, 11, 12, 13, 14, 15};
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) != '-') {
                iArr[iArr2[i2]] = Integer.parseInt(str.substring(i, i + 2), 16);
                i++;
                i2++;
            }
            i++;
        }
        return new C4421l(iArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4421l)) {
            return false;
        }
        int[] iArr = this.loadAd;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int[] iArr3 = ((C4421l) obj).loadAd;
        int[] iArr4 = new int[iArr3.length];
        System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
        return Arrays.equals(iArr2, iArr4);
    }

    public final int hashCode() {
        if (this.crashlytics == -1) {
            int[] iArr = this.loadAd;
            int length = iArr.length;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = (i * 31) + iArr2[i2];
            }
            this.crashlytics = i;
        }
        return this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        byte[] bArrYandex = yandex();
        String[] strArr = new String[bArrYandex.length];
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < bArrYandex.length; i++) {
            sb2.delete(0, sb2.length());
            sb2.append(Integer.toHexString(bArrYandex[i] & 255));
            if (sb2.length() == 1) {
                sb2.insert(0, "0");
            }
            strArr[i] = sb2.toString();
        }
        sb.append(strArr[3]);
        sb.append(strArr[2]);
        sb.append(strArr[1]);
        sb.append(strArr[0]);
        sb.append('-');
        sb.append(strArr[5]);
        sb.append(strArr[4]);
        sb.append('-');
        sb.append(strArr[7]);
        sb.append(strArr[6]);
        sb.append('-');
        sb.append(strArr[8]);
        sb.append(strArr[9]);
        sb.append('-');
        sb.append(strArr[10]);
        sb.append(strArr[11]);
        sb.append(strArr[12]);
        sb.append(strArr[13]);
        sb.append(strArr[14]);
        sb.append(strArr[15]);
        return sb.toString();
    }

    public final byte[] yandex() {
        int length = this.loadAd.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (this.loadAd[i] & 255);
        }
        return bArr;
    }

    public C4421l(int[] iArr, String str) {
        this(iArr);
        this.yandex = str;
    }
}
