package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lۣٓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14513l implements InterfaceC3881l, InterfaceC14224l, InterfaceC12702l, InterfaceC17020l, InterfaceC5066l, InterfaceC2938l, InterfaceC12145l, InterfaceC8396l, InterfaceC7882l, InterfaceC6481l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C14513l f28387l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static volatile C14513l f28389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f28392l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28393l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Object f28390l = new Object();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final float[] f28391l = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final float[] f28388l = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    static {
        byte b = 0;
        f28387l = new C14513l(b, b, b);
    }

    public C14513l(C16816l c16816l) throws GeneralSecurityException {
        this.f28393l = 7;
        if (c16816l.loadAd != 12) {
            C18262l.ads("invalid IV size");
            throw null;
        }
        if (c16816l.crashlytics != 16) {
            C18262l.ads("invalid tag size");
            throw null;
        }
        if (c16816l.amazon == C5138l.f11178l) {
            this.f28392l = c16816l.yandex;
        } else {
            C18262l.ads("invalid variant");
            throw null;
        }
    }

    public static String applovin(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static C14513l tapsense() {
        C14513l c14513l;
        synchronized (f28390l) {
            try {
                if (f28389l == null) {
                    f28389l = new C14513l(3, 1, (byte) 0);
                }
                c14513l = f28389l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14513l;
    }

    public C8128l Signature(C13531l c13531l, C14785l c14785l) {
        IOException iOException = (IOException) c14785l.f28907l;
        if (!(iOException instanceof C4590l)) {
            return null;
        }
        int i = ((C4590l) iOException).f9323l;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (c13531l.yandex - c13531l.loadAd > 1) {
            return new C8128l(1, 300000L);
        }
        if (c13531l.crashlytics - c13531l.amazon > 1) {
            return new C8128l(2, 60000L);
        }
        return null;
    }

    public long ad(C14785l c14785l) {
        for (Throwable cause = (IOException) c14785l.f28907l; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C17655l) || (cause instanceof FileNotFoundException) || (cause instanceof C7825l) || (cause instanceof C12971l)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof C12126l) && ((C12126l) cause).f24145l == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((c14785l.f28908l - 1) * 1000, 5000);
    }

    @Override // defpackage.InterfaceC3881l
    public byte[] adcel() throws GeneralSecurityException {
        int i = this.f28392l;
        if (i == 16) {
            return AbstractC2383l.subs;
        }
        if (i == 32) {
            return AbstractC2383l.isPro;
        }
        C18262l.ads("Could not determine HPKE AEAD ID");
        return null;
    }

    @Override // defpackage.InterfaceC7882l
    public InterfaceC14356l admob(InterfaceC14356l interfaceC14356l) {
        C16556l c16556l = interfaceC14356l instanceof C16556l ? (C16556l) interfaceC14356l : null;
        if (c16556l != null && c16556l.loadAd == this.f28392l) {
            c16556l.yandex = 0;
            return c16556l;
        }
        C16556l c16556l2 = new C16556l();
        c16556l2.yandex = 0;
        c16556l2.loadAd = this.f28392l;
        if (c16556l != null) {
            c16556l2.crashlytics = c16556l.crashlytics;
            c16556l2.amazon = c16556l.amazon;
            c16556l2.purchase = c16556l.purchase;
            c16556l2.billing = c16556l.billing;
        }
        return c16556l2;
    }

    public void ads(String str, String str2, Throwable th) {
        if (this.f28392l <= 6) {
            Log.e(str, str2, th);
        }
    }

    public Object advert(Object obj) {
        return ((C16017l) obj).f31396l.get(this.f28392l);
    }

    @Override // defpackage.InterfaceC14224l
    public int amazon() {
        return this.f28392l;
    }

    public void appmetrica(String str, String str2) {
        if (this.f28392l <= 5) {
            Log.w(str, str2);
        }
    }

    @Override // defpackage.InterfaceC6481l
    public int billing(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.InterfaceC14224l
    public byte[] crashlytics(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != this.f28392l) {
            C18262l.ads("invalid key size");
            return null;
        }
        SecretKeySpec secretKeySpecLoadAd = AbstractC1606l.loadAd(bArr);
        byte[] bArrYandex = AbstractC14640l.yandex(12);
        AlgorithmParameterSpec algorithmParameterSpecYandex = AbstractC1606l.yandex(0, bArrYandex.length, bArrYandex);
        Cipher cipherCrashlytics = AbstractC1606l.crashlytics();
        cipherCrashlytics.init(1, secretKeySpecLoadAd, algorithmParameterSpecYandex);
        int outputSize = cipherCrashlytics.getOutputSize(bArr4.length);
        int length = bArr2.length + bArr3.length;
        if (outputSize > 2147483635 - length) {
            C18262l.ads("plaintext too long");
            return null;
        }
        int i = length + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i + outputSize);
        System.arraycopy(bArr3, 0, bArrCopyOf, bArr2.length, bArr3.length);
        System.arraycopy(bArrYandex, 0, bArrCopyOf, length, 12);
        if (cipherCrashlytics.doFinal(bArr4, 0, bArr4.length, bArrCopyOf, i) == outputSize) {
            return bArrCopyOf;
        }
        C18262l.ads("not enough data written");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // defpackage.InterfaceC12702l
    /* JADX INFO: renamed from: default */
    public Object mo1290default(AbstractC9542l abstractC9542l, float f) {
        int i;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        float fPurchase;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        boolean z = abstractC9542l.mo1287synchronized() == 1;
        if (z) {
            abstractC9542l.yandex();
        }
        while (abstractC9542l.ads()) {
            arrayList.add(Float.valueOf((float) abstractC9542l.signatures()));
        }
        int i4 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f28392l = 2;
        }
        if (z) {
            abstractC9542l.mopub();
        }
        if (this.f28392l == -1) {
            this.f28392l = arrayList.size() / 4;
        }
        int i5 = this.f28392l;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = this.f28392l * 4;
            if (i6 >= i) {
                break;
            }
            int i9 = i6 / 4;
            double dFloatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i3;
            int i11 = i6 % 4;
            if (i11 != 0) {
                if (i11 == i2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 2) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 3) {
                    iArr[i9] = Color.argb(255, i7, i8, (int) (dFloatValue * 255.0d));
                }
            } else if (i9 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i9 - 1] >= f4) {
                    fArr[i9] = f4 + 0.01f;
                } else {
                    fArr[i9] = (float) dFloatValue;
                }
            } else {
                fArr[i9] = (float) dFloatValue;
            }
            i6++;
            i3 = i10;
            i2 = 1;
        }
        int i12 = i3;
        C14360l c14360l = new C14360l(fArr, iArr);
        if (arrayList.size() <= i) {
            return c14360l;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i13 = i12;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i13] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i13] = ((Float) arrayList.get(i)).floatValue();
                i13++;
            }
            i++;
        }
        float[] fArrCopyOf = c14360l.yandex;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i14 = i12;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            while (i14 < length) {
                float f5 = i16 < fArrCopyOf.length ? fArrCopyOf[i16] : Float.NaN;
                float f6 = i17 < size ? fArr2[i17] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr4[i14] = f5;
                    i16++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr4[i14] = f6;
                    i17++;
                } else {
                    fArr4[i14] = f5;
                    i16++;
                    i17++;
                    i15++;
                }
                i14++;
            }
            fArrCopyOf = i15 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i15);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i18 = i12;
        while (i18 < length2) {
            float f7 = fArrCopyOf[i18];
            int iBinarySearch = Arrays.binarySearch(fArr, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f8 = fArr3[iBinarySearch2];
                if (i5 < i4 || f7 == fArr[i12]) {
                    iArgb = iArr[i12];
                } else {
                    int i19 = 1;
                    while (true) {
                        if (i19 >= i5) {
                            C8339l.metrica("Unreachable code.");
                            return null;
                        }
                        f2 = fArr[i19];
                        if (f2 >= f7 || i19 == i5 - 1) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 != i5 - 1 || f7 < f2) {
                        int i20 = i19 - 1;
                        float f9 = fArr[i20];
                        int iSubs = AbstractC17307l.subs(iArr[i20], (f7 - f9) / (f2 - f9), iArr[i19]);
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iSubs), Color.green(iSubs), Color.blue(iSubs));
                    } else {
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iArr[i19]), Color.green(iArr[i19]), Color.blue(iArr[i19]));
                    }
                }
                iArr2[i18] = iArgb;
            } else {
                int i21 = iArr[iBinarySearch];
                if (size < i4 || f7 <= fArr2[i12]) {
                    iArgb2 = Color.argb((int) (fArr3[i12] * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                } else {
                    int i22 = 1;
                    while (true) {
                        if (i22 >= size) {
                            C8339l.metrica("Unreachable code.");
                            return null;
                        }
                        f3 = fArr2[i22];
                        if (f3 >= f7 || i22 == size - 1) {
                            break;
                        }
                        i22++;
                    }
                    if (f3 <= f7) {
                        fPurchase = fArr3[i22];
                    } else {
                        int i23 = i22 - 1;
                        float f10 = fArr2[i23];
                        fPurchase = AbstractC7484l.purchase(fArr3[i23], fArr3[i22], (f7 - f10) / (f3 - f10));
                    }
                    iArgb2 = Color.argb((int) (fPurchase * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                }
                iArr2[i18] = iArgb2;
            }
            i18++;
            i4 = 2;
        }
        return new C14360l(fArrCopyOf, iArr2);
    }

    @Override // defpackage.InterfaceC2938l
    public int firebase(C17385l c17385l, int i) {
        return (i - c17385l.f33850l.mo870l(32.0f)) - this.f28392l;
    }

    @Override // defpackage.InterfaceC12145l
    public int inmobi() {
        return 0;
    }

    @Override // defpackage.InterfaceC5066l
    public String isPro() {
        switch (this.f28393l) {
            case 12:
                return AbstractC14814l.remoteconfig(this.f28392l, " digits", new StringBuilder("expected at least "));
            default:
                return AbstractC14814l.remoteconfig(this.f28392l, " digits", new StringBuilder("expected at most "));
        }
    }

    public void isVip(String str, String str2) {
        if (this.f28392l <= 4) {
            Log.i(str, str2);
        }
    }

    public int license(int i) {
        int i2 = this.f28392l;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    @Override // defpackage.InterfaceC17020l
    public ByteBuffer loadAd() {
        return ByteBuffer.allocate(this.f28392l);
    }

    public void metrica(String str, String str2, Throwable th) {
        if (this.f28392l <= 3) {
            Log.d(str, str2, th);
        }
    }

    @Override // defpackage.InterfaceC3881l
    public byte[] mopub(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length == this.f28392l) {
            return new C7972l(bArr).m2237package(bArr2, bArr3, i, bArr4);
        }
        throw new InvalidAlgorithmParameterException(AbstractC0653l.vip(bArr.length, "Unexpected key length: "));
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public boolean m3858native() {
        return m3859strictfp() || m3860synchronized(128);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x008a A[EDGE_INSN: B:107:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0101 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    public float premium(int i, int i2, String str) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        char cCharAt;
        int i10;
        char cCharAt2;
        boolean z3;
        boolean z4;
        int i11;
        int i12;
        int i13;
        char cCharAt3;
        char cCharAt4;
        this.f28392l = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z = false;
            } else {
                z = true;
            }
            int i14 = this.f28392l;
            long j = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            z2 = false;
            i6 = 0;
            while (true) {
                i7 = this.f28392l;
                if (i7 >= i2) {
                    break;
                }
                cCharAt4 = str.charAt(i7);
                if (cCharAt4 != '0') {
                    if (i3 == 0) {
                        i5++;
                    } else {
                        i4++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i15 = i3 + i4;
                    while (i4 > 0) {
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j *= 10;
                        i4--;
                    }
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j = (j * 10) + ((long) (cCharAt4 - '0'));
                    i3 = i15 + 1;
                    if (j < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z2) {
                        break;
                    }
                    i6 = this.f28392l - i14;
                    z2 = true;
                }
                this.f28392l++;
            }
            if (!z2 && this.f28392l == i6 + 1) {
                return Float.NaN;
            }
            if (i3 == 0) {
                if (i5 == 0) {
                    return Float.NaN;
                }
                i3 = 1;
            }
            if (z2) {
                i4 = (i6 - i5) - i3;
            }
            i8 = this.f28392l;
            if (i8 < i2 && ((cCharAt = str.charAt(i8)) == 'E' || cCharAt == 'e')) {
                i10 = this.f28392l + 1;
                this.f28392l = i10;
                if (i10 == i2) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i10);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case '0':
                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.f28392l--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                    if (!z4) {
                        i11 = this.f28392l;
                        i12 = 0;
                        while (true) {
                            i13 = this.f28392l;
                            if (i13 >= i2 && (cCharAt3 = str.charAt(i13)) >= '0' && cCharAt3 <= '9') {
                                if (i12 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i12 = (i12 * 10) + (cCharAt3 - '0');
                                this.f28392l++;
                            }
                        }
                        if (this.f28392l == i11) {
                            return Float.NaN;
                        }
                        if (z3) {
                            i4 -= i12;
                        } else {
                            i4 += i12;
                        }
                    }
                } else {
                    z3 = false;
                }
                this.f28392l++;
                z4 = false;
                if (!z4) {
                    i11 = this.f28392l;
                    i12 = 0;
                    while (true) {
                        i13 = this.f28392l;
                        if (i13 >= i2) {
                        }
                        i12 = (i12 * 10) + (cCharAt3 - '0');
                        this.f28392l++;
                    }
                    if (this.f28392l == i11) {
                        return Float.NaN;
                    }
                    if (z3) {
                        i4 -= i12;
                    } else {
                        i4 += i12;
                    }
                }
            }
            i9 = i3 + i4;
            if (i9 <= 39 || i9 < -44) {
                return Float.NaN;
            }
            float f2 = j;
            if (j != 0) {
                if (i4 > 0) {
                    f = f28391l[i4];
                } else if (i4 < 0) {
                    if (i4 < -38) {
                        f2 = (float) (((double) f2) * 1.0E-20d);
                        i4 += 20;
                    }
                    f = f28388l[-i4];
                }
                f2 *= f;
            }
            return z ? -f2 : f2;
        }
        z = false;
        this.f28392l++;
        int i16 = this.f28392l;
        long j2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        z2 = false;
        i6 = 0;
        while (true) {
            i7 = this.f28392l;
            if (i7 >= i2) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i7);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i3 == 0) {
                i5++;
            } else {
                i4++;
            }
            this.f28392l++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
            if (i5 == 0) {
                return Float.NaN;
            }
            i3 = 1;
        }
        if (z2) {
            i4 = (i6 - i5) - i3;
        }
        i8 = this.f28392l;
        if (i8 < i2) {
            i10 = this.f28392l + 1;
            this.f28392l = i10;
            if (i10 == i2) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i10);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case '0':
                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z3 = false;
                            z4 = false;
                            break;
                        default:
                            this.f28392l--;
                            z4 = true;
                            z3 = false;
                            break;
                    }
                } else {
                    z3 = true;
                }
                if (!z4) {
                    i11 = this.f28392l;
                    i12 = 0;
                    while (true) {
                        i13 = this.f28392l;
                        if (i13 >= i2) {
                        }
                        i12 = (i12 * 10) + (cCharAt3 - '0');
                        this.f28392l++;
                    }
                    if (this.f28392l == i11) {
                        return Float.NaN;
                    }
                    if (z3) {
                        i4 -= i12;
                    } else {
                        i4 += i12;
                    }
                }
            } else {
                z3 = false;
            }
            this.f28392l++;
            z4 = false;
            if (!z4) {
                i11 = this.f28392l;
                i12 = 0;
                while (true) {
                    i13 = this.f28392l;
                    if (i13 >= i2) {
                    }
                    i12 = (i12 * 10) + (cCharAt3 - '0');
                    this.f28392l++;
                }
                if (this.f28392l == i11) {
                    return Float.NaN;
                }
                if (z3) {
                    i4 -= i12;
                } else {
                    i4 += i12;
                }
            }
        }
        i9 = i3 + i4;
        if (i9 <= 39) {
        }
        return Float.NaN;
    }

    public int pro() {
        switch (this.f28393l) {
            case 15:
                break;
            case 16:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
        }
        return this.f28392l;
    }

    @Override // defpackage.InterfaceC3881l
    public byte[] purchase(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != this.f28392l) {
            throw new InvalidAlgorithmParameterException(AbstractC0653l.vip(bArr.length, "Unexpected key length: "));
        }
        if (!AbstractC12589l.ad(2)) {
            C18262l.ads("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKeySpecLoadAd = AbstractC1606l.loadAd(bArr);
        if (bArr2.length != 12) {
            C18262l.ads("iv is wrong size");
            return null;
        }
        if (bArr3.length < i + 16) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecYandex = AbstractC1606l.yandex(0, bArr2.length, bArr2);
        Cipher cipherCrashlytics = AbstractC1606l.crashlytics();
        cipherCrashlytics.init(2, secretKeySpecLoadAd, algorithmParameterSpecYandex);
        if (bArr4.length != 0) {
            cipherCrashlytics.updateAAD(bArr4);
        }
        return cipherCrashlytics.doFinal(bArr3, i, bArr3.length - i);
    }

    @Override // defpackage.InterfaceC3881l
    public int remoteconfig() {
        return this.f28392l;
    }

    @Override // defpackage.InterfaceC12145l
    public int signatures() {
        return this.f28392l;
    }

    @Override // defpackage.InterfaceC14224l
    public byte[] smaato(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length < i) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        if (bArr.length != this.f28392l) {
            C18262l.ads("invalid key size");
            return null;
        }
        SecretKeySpec secretKeySpecLoadAd = AbstractC1606l.loadAd(bArr);
        int i2 = i + 12;
        if (bArr2.length < i + 28) {
            C18262l.ads("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecYandex = AbstractC1606l.yandex(i, 12, bArr2);
        Cipher cipherCrashlytics = AbstractC1606l.crashlytics();
        cipherCrashlytics.init(2, secretKeySpecLoadAd, algorithmParameterSpecYandex);
        return cipherCrashlytics.doFinal(bArr2, i2, (bArr2.length - i) - 12);
    }

    public void startapp(String str, String str2) {
        if (this.f28392l <= 6) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public boolean m3859strictfp() {
        return !(!m3860synchronized(32) || m3860synchronized(64) || m3860synchronized(128)) || m3860synchronized(64);
    }

    @Override // defpackage.InterfaceC6481l
    public int subs(Context context, String str) {
        return this.f28392l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public boolean m3860synchronized(int i) {
        return (this.f28392l & i) == i;
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: throws */
    public AbstractC2249l mo1831throws(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return j < ((long) this.f28392l) * 1000000 ? abstractC2249l : abstractC2249l2;
    }

    public String toString() {
        switch (this.f28393l) {
            case 22:
                return String.valueOf(this.f28392l);
            default:
                return super.toString();
        }
    }

    public void vip(String str, String str2) {
        if (this.f28392l <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: volatile */
    public long mo1832volatile(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return ((long) signatures()) * 1000000;
    }

    @Override // defpackage.InterfaceC15930l
    public /* synthetic */ boolean yandex() {
        return false;
    }

    public /* synthetic */ C14513l(int i, int i2, byte b) {
        this.f28393l = i2;
        this.f28392l = i;
    }

    public C14513l(C10184l c10184l) {
        this.f28393l = 27;
        this.f28392l = c10184l.f20761l;
    }

    public C14513l(int i) throws InvalidAlgorithmParameterException {
        this.f28393l = 3;
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(AbstractC0653l.vip(i, "Unsupported key length: "));
        }
        this.f28392l = i;
    }

    public /* synthetic */ C14513l(byte b, int i) {
        this.f28393l = i;
    }

    public C14513l(int i, int i2) {
        this.f28393l = 5;
        this.f28392l = i;
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: package */
    public AbstractC2249l mo1830package(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return abstractC2249l3;
    }

    @Override // defpackage.InterfaceC15930l
    public AbstractC2249l subscription(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return abstractC2249l3;
    }
}
