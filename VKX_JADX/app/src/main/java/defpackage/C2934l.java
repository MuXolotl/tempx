package defpackage;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.SparseBooleanArray;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lْؔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2934l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f6384l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f6385l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f6386l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6387l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f6388l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f6389l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f6390l;

    public C2934l(Bitmap bitmap) {
        this.f6387l = 2;
        ArrayList arrayList = new ArrayList();
        this.f6390l = arrayList;
        this.f6386l = 16;
        this.f6384l = 12544;
        this.f6389l = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f6385l = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            C8339l.metrica("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(C1010l.purchase);
        this.f6388l = bitmap;
        arrayList.add(C7545l.purchase);
        arrayList.add(C7545l.billing);
        arrayList.add(C7545l.mopub);
        arrayList.add(C7545l.admob);
        arrayList.add(C7545l.subs);
        arrayList.add(C7545l.isPro);
    }

    public static void smaato(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(AbstractC3559l.yandex(obj));
        sb.append("]");
    }

    public void admob() {
        C5687l c5687l = ((C5687l) this.f6385l).crashlytics;
        if (c5687l != null) {
            this.f6385l = c5687l;
        } else {
            this.f6385l = (C5687l) this.f6390l;
            int i = this.f6384l;
            if (i > 0) {
                this.f6384l = i - 1;
            }
            if (this.f6389l > 0) {
                this.f6386l++;
            }
        }
        mopub();
    }

    public void amazon() {
        int i = 0;
        this.f6386l = 0;
        while (true) {
            int[] iArr = (int[]) this.f6390l;
            if (i >= iArr.length - 1) {
                this.f6384l = iArr.length - 1;
                this.f6389l = 3;
                return;
            } else {
                iArr[i] = ((C4336l) this.f6388l).remoteconfig();
                i++;
            }
        }
    }

    public boolean billing() {
        C0680l c0680lLoadAd = ((C11886l) this.f6390l).loadAd.loadAd();
        int iYandex = c0680lLoadAd.yandex(6);
        return !(iYandex == 0 || ((ByteBuffer) c0680lLoadAd.f31320l).get(iYandex + c0680lLoadAd.f31319l) == 0) || this.f6384l == 65039;
    }

    public VolumeProvider crashlytics() {
        C2934l c2934l;
        if (((VolumeProvider) this.f6390l) != null) {
            c2934l = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            c2934l = this;
            c2934l.f6390l = new C14755l(c2934l, this.f6386l, this.f6384l, this.f6389l, (String) this.f6388l, 1);
        } else {
            c2934l = this;
            c2934l.f6390l = new C14464l(c2934l, c2934l.f6386l, c2934l.f6384l, c2934l.f6389l, 1);
        }
        return (VolumeProvider) c2934l.f6390l;
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        int iRemoteconfig;
        purchase();
        int i2 = this.f6386l;
        int i3 = this.f6389l;
        int i4 = i3 * 8;
        int[] iArr = (int[]) this.f6390l;
        int i5 = this.f6384l;
        int i6 = iArr[i5];
        if (i4 != 0) {
            i6 = (i6 << i4) | (iArr[(i5 + 1) % iArr.length] >>> (32 - i4));
        }
        int i7 = i2 ^ i6;
        this.f6386l = i7;
        if (i3 != 0) {
            iRemoteconfig = ((C4336l) this.f6388l).remoteconfig();
        } else {
            int length = (i5 + 1) % iArr.length;
            this.f6384l = length;
            iRemoteconfig = iArr[length];
        }
        int i8 = i7 ^ iRemoteconfig;
        this.f6386l = i8;
        C10739l.firebase(i8, 0, bArr);
        reset();
        return 4;
    }

    public boolean firebase(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.f6388l;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return "Zuc128Mac";
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return 4;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        C4336l c4336l = (C4336l) this.f6388l;
        c4336l.init(true, interfaceC9719l);
        this.f6385l = new C10739l(c4336l);
        amazon();
    }

    public void isPro(C5687l c5687l, StringBuilder sb) {
        for (C5687l c5687l2 : c5687l.amazon.values()) {
            sb.append("  ");
            sb.append(c5687l);
            sb.append(" -> ");
            sb.append(c5687l2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.f6388l;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, c5687l2.yandex, Math.min(iArr.length, c5687l2.loadAd + 1))));
            sb.append("\"]\n");
            isPro(c5687l2, sb);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    public C1010l loadAd() {
        int iMax;
        ArrayList arrayList;
        float f;
        ArrayList arrayList2 = (ArrayList) this.f6385l;
        Bitmap bitmap = (Bitmap) this.f6388l;
        if (bitmap == null) {
            C11586l.yandex();
            return null;
        }
        int i = this.f6389l;
        int i2 = this.f6384l;
        double dSqrt = -1.0d;
        if (i2 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i2) {
                dSqrt = Math.sqrt(((double) i2) / ((double) height));
            }
        } else if (i > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i) {
            dSqrt = ((double) i) / ((double) iMax);
        }
        int i3 = 0;
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        C11644l c11644l = new C11644l(iArr, this.f6386l, arrayList2.isEmpty() ? null : (C10060l[]) arrayList2.toArray(new C10060l[arrayList2.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) c11644l.f23361l;
        ArrayList arrayList4 = (ArrayList) this.f6390l;
        C1010l c1010l = new C1010l(arrayList4, arrayList3);
        int size = arrayList4.size();
        int i4 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = c1010l.crashlytics;
            if (i4 >= size) {
                sparseBooleanArray.clear();
                return c1010l;
            }
            C7545l c7545l = (C7545l) arrayList4.get(i4);
            float[] fArr = c7545l.crashlytics;
            float[] fArr2 = c7545l.yandex;
            int length = fArr.length;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i5 = i3; i5 < length; i5++) {
                float f4 = fArr[i5];
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                int length2 = fArr.length;
                for (int i6 = i3; i6 < length2; i6++) {
                    float f5 = fArr[i6];
                    if (f5 > 0.0f) {
                        fArr[i6] = f5 / f3;
                    }
                }
            }
            List list = c1010l.yandex;
            int size2 = list.size();
            int i7 = i3;
            float f6 = 0.0f;
            C13562l c13562l = null;
            while (i7 < size2) {
                C13562l c13562l2 = (C13562l) list.get(i7);
                float[] fArrLoadAd = c13562l2.loadAd();
                float f7 = fArrLoadAd[1];
                int i8 = i3;
                float[] fArr3 = c7545l.loadAd;
                if (f7 < fArr2[i8] || f7 > fArr2[2]) {
                    arrayList = arrayList4;
                    f = f2;
                } else {
                    float f8 = fArrLoadAd[2];
                    if (f8 < fArr3[i8] || f8 > fArr3[2]) {
                        arrayList = arrayList4;
                        f = f2;
                    } else {
                        f = f2;
                        if (sparseBooleanArray.get(c13562l2.amazon)) {
                            arrayList = arrayList4;
                        } else {
                            float[] fArrLoadAd2 = c13562l2.loadAd();
                            C13562l c13562l3 = c1010l.amazon;
                            int i9 = c13562l3 != null ? c13562l3.purchase : 1;
                            arrayList = arrayList4;
                            float[] fArr4 = c7545l.crashlytics;
                            float f9 = fArr4[i8];
                            float fAbs = f9 > f ? (1.0f - Math.abs(fArrLoadAd2[1] - fArr2[1])) * f9 : f;
                            float f10 = fArr4[1];
                            float fAbs2 = f10 > f ? (1.0f - Math.abs(fArrLoadAd2[2] - fArr3[1])) * f10 : f;
                            float f11 = fArr4[2];
                            float f12 = fAbs + fAbs2 + (f11 > f ? (c13562l2.purchase / i9) * f11 : f);
                            if (c13562l == null || f12 > f6) {
                                c13562l = c13562l2;
                                f6 = f12;
                            }
                        }
                    }
                }
                i7++;
                f2 = f;
                arrayList4 = arrayList;
                i3 = i8;
            }
            ArrayList arrayList5 = arrayList4;
            int i10 = i3;
            if (c13562l != null && c7545l.amazon) {
                sparseBooleanArray.append(c13562l.amazon, true);
            }
            c1010l.loadAd.put(c7545l, c13562l);
            i4++;
            arrayList4 = arrayList5;
            i3 = i10;
        }
    }

    public void mopub() {
        if (this.f6384l == 0) {
            return;
        }
        HashMap map = ((C5687l) this.f6385l).amazon;
        int[] iArr = (int[]) this.f6388l;
        C5687l c5687l = (C5687l) map.get(Integer.valueOf(iArr[this.f6386l]));
        while (true) {
            int i = (c5687l.loadAd - c5687l.yandex) + 1;
            int i2 = this.f6384l;
            if (i > i2) {
                return;
            }
            int i3 = this.f6386l + i;
            this.f6386l = i3;
            this.f6385l = c5687l;
            int i4 = i2 - i;
            this.f6384l = i4;
            if (i4 > 0) {
                c5687l = (C5687l) c5687l.amazon.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public void purchase() {
        int[] iArr = (int[]) this.f6390l;
        int i = (this.f6389l + 1) % 4;
        this.f6389l = i;
        if (i == 0) {
            iArr[this.f6384l] = ((C4336l) this.f6388l).remoteconfig();
            this.f6384l = (this.f6384l + 1) % iArr.length;
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        int i = this.f6387l;
        Object obj = this.f6388l;
        switch (i) {
            case 0:
                this.f6386l = 1;
                this.f6390l = (C11886l) obj;
                this.f6389l = 0;
                break;
            default:
                C10739l c10739l = (C10739l) this.f6385l;
                if (c10739l != null) {
                    ((C4336l) obj).loadAd(c10739l);
                }
                amazon();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:64:0x0092  */
    public void subs(Object obj, EnumC4433l enumC4433l, C17465l c17465l) {
        String simpleName;
        C17465l c17465l2;
        boolean zIsValidCodePoint;
        StringBuilder sb = (StringBuilder) this.f6385l;
        int i = enumC4433l.f9027l;
        String string = enumC4433l.f9029l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi != 0) {
            if (iInmobi == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iInmobi != 2) {
                if (iInmobi != 3) {
                    if (iInmobi != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                smaato(sb, obj, string);
                return;
            }
        }
        int iOrdinal = enumC4433l.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (c17465l.yandex()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        if (c17465l.yandex()) {
                            c17465l2 = c17465l;
                        } else {
                            int i2 = c17465l.yandex;
                            int i3 = i2 & 128;
                            if (i3 == 0) {
                                c17465l2 = C17465l.purchase;
                            } else if (i3 == i2 && c17465l.loadAd == -1 && c17465l.crashlytics == -1) {
                                c17465l2 = c17465l;
                            } else {
                                c17465l2 = new C17465l(i3, -1, -1);
                            }
                        }
                        if (c17465l2.equals(c17465l)) {
                            Number number = (Number) obj;
                            Locale locale = AbstractC3559l.yandex;
                            boolean zCrashlytics = c17465l.crashlytics();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                AbstractC3559l.loadAd(sb, jLongValue, zCrashlytics);
                                return;
                            }
                            if (number instanceof Integer) {
                                AbstractC3559l.loadAd(sb, jLongValue & 4294967295L, zCrashlytics);
                                return;
                            }
                            if (number instanceof Byte) {
                                AbstractC3559l.loadAd(sb, jLongValue & 255, zCrashlytics);
                                return;
                            }
                            if (number instanceof Short) {
                                AbstractC3559l.loadAd(sb, jLongValue & 65535, zCrashlytics);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                C8339l.smaato("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string2 = ((BigInteger) number).toString(16);
                            if (zCrashlytics) {
                                string2 = string2.toUpperCase(AbstractC3559l.yandex);
                            }
                            sb.append(string2);
                            return;
                        }
                    }
                } else if (c17465l.yandex()) {
                    sb.append(obj);
                    return;
                }
            } else if (c17465l.yandex()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = AbstractC3559l.yandex;
                int i4 = c17465l.yandex;
                int i5 = i4 & 162;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, AbstractC3559l.yandex);
                try {
                    formattable.formatTo(formatter, i5, c17465l.loadAd, c17465l.crashlytics);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(AbstractC3559l.crashlytics(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (c17465l.yandex()) {
                sb.append(AbstractC3559l.yandex(obj));
                return;
            }
        }
        if (!c17465l.yandex()) {
            int i6 = enumC4433l.f9028l;
            if (c17465l.crashlytics()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            c17465l.amazon(sb2);
            sb2.append((char) i6);
            string = sb2.toString();
        }
        sb.append(String.format(AbstractC3559l.yandex, string, obj));
    }

    public String toString() {
        switch (this.f6387l) {
            case 4:
                StringBuilder sb = new StringBuilder("digraph {\n");
                isPro((C5687l) this.f6390l, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        purchase();
        int i = this.f6389l * 8;
        int i2 = 128;
        int i3 = 0;
        while (i2 > 0) {
            if ((b & i2) != 0) {
                int i4 = i + i3;
                int i5 = this.f6386l;
                int[] iArr = (int[]) this.f6390l;
                int i6 = this.f6384l;
                int i7 = iArr[i6];
                if (i4 != 0) {
                    i7 = (i7 << i4) | (iArr[(i6 + 1) % iArr.length] >>> (32 - i4));
                }
                this.f6386l = i5 ^ i7;
            }
            i2 >>= 1;
            i3++;
        }
    }

    public void yandex(C7545l c7545l) {
        ArrayList arrayList = (ArrayList) this.f6390l;
        if (arrayList.contains(c7545l)) {
            return;
        }
        arrayList.add(c7545l);
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }

    public C2934l(C5151l c5151l, Object[] objArr, StringBuilder sb) {
        this.f6387l = 5;
        this.f6386l = 0;
        this.f6384l = -1;
        AbstractC13841l.billing(c5151l, "context");
        this.f6388l = c5151l;
        this.f6389l = 0;
        this.f6390l = objArr;
        this.f6385l = sb;
    }

    public C2934l(int[] iArr) {
        this.f6387l = 4;
        this.f6388l = iArr;
        C5687l c5687l = new C5687l(-1, -1);
        this.f6390l = c5687l;
        this.f6385l = c5687l;
    }

    public C2934l(C0554l c0554l, int i, int i2, int i3, String str) {
        this.f6387l = 1;
        this.f6385l = c0554l;
        this.f6386l = i;
        this.f6384l = i2;
        this.f6389l = i3;
        this.f6388l = str;
    }

    public C2934l() {
        this.f6387l = 3;
        this.f6388l = new C4336l(1);
        this.f6390l = new int[2];
    }

    public C2934l(C11886l c11886l) {
        this.f6387l = 0;
        this.f6386l = 1;
        this.f6388l = c11886l;
        this.f6390l = c11886l;
    }
}
