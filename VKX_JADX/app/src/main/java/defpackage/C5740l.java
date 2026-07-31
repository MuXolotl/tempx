package defpackage;

import android.R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5740l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final byte[][] f12117l = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, -128, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, 127, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, -68, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, 14, -128, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, 127, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f12118l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f12119l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f12120l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f12121l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f12122l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f12123l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f12124l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f12125l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f12126l;

    public C5740l() {
        this.f12122l = false;
        this.f12118l = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f12124l = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f12123l = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f12126l = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f12121l = 0;
        this.f12125l = null;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
        for (int i = 0; i < 256; i++) {
            byte[][] bArr = f12117l;
            byte b = bArr[0][i];
            int i2 = b & 255;
            int iAmazon = (amazon(i2) ^ i2) & 255;
            int i3 = 180;
            int iAmazon2 = (((((b & 1) != 0 ? 180 : 0) ^ (i2 >> 1)) ^ i2) ^ amazon(i2)) & 255;
            int i4 = bArr[1][i];
            int i5 = i4 & 255;
            int[] iArr = {i2, i5};
            int[] iArr2 = {iAmazon, (amazon(i5) ^ i5) & 255};
            int i6 = i5 >> 1;
            if ((i4 & 1) == 0) {
                i3 = 0;
            }
            int[] iArr3 = {iAmazon2, (((i6 ^ i3) ^ i5) ^ amazon(i5)) & 255};
            int[] iArr4 = (int[]) this.f12118l;
            int i7 = iArr[1] | (iArr2[1] << 8);
            int i8 = iArr3[1];
            iArr4[i] = i7 | (i8 << 16) | (i8 << 24);
            int[] iArr5 = (int[]) this.f12124l;
            int i9 = iArr3[0];
            iArr5[i] = i9 | (i9 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = (int[]) this.f12123l;
            int i10 = iArr2[1];
            int i11 = iArr3[1];
            iArr6[i] = i10 | (i11 << 8) | (iArr[1] << 16) | (i11 << 24);
            int[] iArr7 = (int[]) this.f12126l;
            int i12 = iArr2[0];
            iArr7[i] = (iArr3[0] << 16) | (iArr[0] << 8) | i12 | (i12 << 24);
        }
    }

    public static int admob(int i) {
        return (i >>> 24) & 255;
    }

    public static int amazon(int i) {
        return ((i >> 2) ^ ((i & 2) != 0 ? 180 : 0)) ^ ((i & 1) != 0 ? 90 : 0);
    }

    public static int billing(int i) {
        return (i >>> 8) & 255;
    }

    public static int mopub(int i) {
        return (i >>> 16) & 255;
    }

    public static int purchase(int i) {
        int i2 = i >>> 24;
        int i3 = i2 & 255;
        int i4 = ((i3 << 1) ^ ((i2 & 128) != 0 ? 333 : 0)) & 255;
        int i5 = ((i3 >>> 1) ^ ((i2 & 1) != 0 ? 166 : 0)) ^ i4;
        return ((((i << 8) ^ (i5 << 24)) ^ (i4 << 16)) ^ (i5 << 8)) ^ i3;
    }

    public int crashlytics(int i) {
        int[] iArr = (int[]) this.f12120l;
        return iArr[(((i >>> 16) & 255) * 2) + 513] ^ ((iArr[((i >>> 24) & 255) * 2] ^ iArr[((i & 255) * 2) + 1]) ^ iArr[(((i >>> 8) & 255) * 2) + AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE]);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object firebase(AbstractC0283l abstractC0283l) {
        C0738l c0738l;
        C5740l c5740l;
        AbstractC2520l c11202l;
        if (abstractC0283l instanceof C0738l) {
            c0738l = (C0738l) abstractC0283l;
            int i = c0738l.f2231l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0738l.f2231l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0738l = new C0738l(this, abstractC0283l);
            }
        } else {
            c0738l = new C0738l(this, abstractC0283l);
        }
        C0738l c0738l2 = c0738l;
        Object obj = c0738l2.f2230l;
        int i2 = c0738l2.f2231l;
        Object obj2 = this.f12118l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            ArrayList arrayList = new ArrayList();
            c0738l2.f2231l = 1;
            c5740l = this;
            Object objSubs = c5740l.subs((C2234l) obj2, 0, arrayList, -1.7976931348623157E308d, c0738l2);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSubs == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            c5740l = this;
        }
        ArrayList arrayList2 = (ArrayList) c5740l.f12120l;
        if (arrayList2.isEmpty()) {
            C2234l c2234l = (C2234l) obj2;
            C8654l c8654l = (C8654l) c5740l.f12125l;
            c11202l = new C17696l(c2234l, "No matched subtrees found", c8654l != null ? c8654l.subs : C2759l.f5976l);
        } else {
            C10954l c10954l = new C10954l(13);
            int iSmaato = AbstractC14055l.smaato(arrayList2);
            double dMin = Double.MAX_VALUE;
            if (iSmaato >= 0) {
                int i3 = 0;
                while (true) {
                    C11202l c11202l2 = (C11202l) arrayList2.get(i3);
                    c10954l.m233l(c11202l2.loadAd);
                    double d = c11202l2.crashlytics;
                    if (d == -1.0d) {
                        d = 1.0d;
                    }
                    dMin = Math.min(dMin, d);
                    if (i3 == iSmaato) {
                        break;
                    }
                    i3++;
                }
            }
            c11202l = new C11202l(((C11202l) AbstractC16901l.m4214continue(arrayList2)).yandex, c10954l.build(), dMin);
        }
        C6944l c6944l = (C6944l) c5740l.f12119l;
        if (c6944l != null) {
            c6944l.amazon = c11202l;
        }
        if (c6944l != null) {
            Iterator it = ((List) c5740l.f12123l).iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(c6944l);
            }
        }
        return c11202l;
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to Twofish init - ", interfaceC9719l));
            return;
        }
        this.f12122l = z;
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        this.f12125l = bArr;
        int length = bArr.length * 8;
        if (length != 128 && length != 192 && length != 256) {
            C8339l.metrica("Key length not 128/192/256 bits.");
            return;
        }
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
            return;
        }
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
        byte[] bArr2 = (byte[]) this.f12125l;
        this.f12121l = bArr2.length / 8;
        smaato(bArr2);
    }

    public List isPro(String str) {
        if (str.length() == 0 || str.equals("/")) {
            return C2580l.f5619l;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '/') {
                i++;
            }
        }
        ArrayList arrayList = new ArrayList(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iM3321extends = AbstractC12024l.m3321extends(str, '/', i4, 4);
            if (iM3321extends == -1) {
                iM3321extends = length;
            }
            if (iM3321extends != i4) {
                arrayList.add(AbstractC2208l.crashlytics(i4, iM3321extends, 4, str));
            }
            i4 = iM3321extends + 1;
            i3 = iM3321extends;
        }
        InterfaceC9955l interfaceC9955l = (InterfaceC9955l) this.f12124l;
        C11911l c11911l = AbstractC16896l.yandex;
        if (!interfaceC9955l.getAttributes().loadAd(AbstractC16896l.yandex) && AbstractC16648l.Signature(str, "/", false)) {
            arrayList.add("");
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return 16;
    }

    public int loadAd(int i) {
        int[] iArr = (int[]) this.f12120l;
        return iArr[(((i >>> 24) & 255) * 2) + 513] ^ ((iArr[(i & 255) * 2] ^ iArr[(((i >>> 8) & 255) * 2) + 1]) ^ iArr[(((i >>> 16) & 255) * 2) + AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE]);
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
        byte[] bArr = (byte[]) this.f12125l;
        if (bArr != null) {
            smaato(bArr);
        }
    }

    public void smaato(byte[] bArr) {
        int i;
        int i2;
        int iBilling;
        int iMopub;
        int iAdmob;
        int iAdmob2;
        int iMopub2;
        int iBilling2;
        int i3;
        int[] iArr = (int[]) this.f12126l;
        int[] iArr2 = (int[]) this.f12123l;
        int[] iArr3 = (int[]) this.f12124l;
        int[] iArr4 = (int[]) this.f12118l;
        int[] iArr5 = new int[4];
        int[] iArr6 = new int[4];
        int[] iArr7 = new int[4];
        this.f12119l = new int[40];
        char c = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= this.f12121l) {
                break;
            }
            int i5 = i4 * 8;
            iArr5[i4] = AbstractC10000l.metrica(i5, bArr);
            int iMetrica = AbstractC10000l.metrica(i5 + 4, bArr);
            iArr6[i4] = iMetrica;
            int i6 = (this.f12121l - 1) - i4;
            int i7 = iArr5[i4];
            for (int i8 = 0; i8 < 4; i8++) {
                iMetrica = purchase(iMetrica);
            }
            int iPurchase = iMetrica ^ i7;
            for (int i9 = 0; i9 < 4; i9++) {
                iPurchase = purchase(iPurchase);
            }
            iArr7[i6] = iPurchase;
            i4++;
        }
        for (int i10 = 0; i10 < 20; i10++) {
            int i11 = 33686018 * i10;
            int iYandex = yandex(iArr5, i11);
            int iRotateLeft = Integer.rotateLeft(yandex(iArr6, i11 + R.attr.cacheColorHint), 8);
            int i12 = iYandex + iRotateLeft;
            int[] iArr8 = (int[]) this.f12119l;
            int i13 = i10 * 2;
            iArr8[i13] = i12;
            int i14 = i12 + iRotateLeft;
            iArr8[i13 + 1] = (i14 << 9) | (i14 >>> 23);
        }
        int i15 = iArr7[0];
        int i16 = iArr7[1];
        int i17 = 2;
        int i18 = iArr7[2];
        int i19 = 3;
        int i20 = iArr7[3];
        this.f12120l = new int[1024];
        int i21 = 0;
        while (i21 < 256) {
            int i22 = this.f12121l & i19;
            byte[][] bArr2 = f12117l;
            if (i22 != 0) {
                if (i22 != i) {
                    if (i22 == i17) {
                        c = c;
                        i3 = i21;
                        iBilling2 = i3;
                        iMopub2 = iBilling2;
                        iAdmob2 = iMopub2;
                    } else if (i22 == i19) {
                        c = c;
                        i2 = i21;
                        iBilling = i2;
                        iMopub = iBilling;
                        iAdmob = iMopub;
                    }
                    int[] iArr9 = (int[]) this.f12120l;
                    iArr = iArr;
                    int i23 = i21 * 2;
                    byte[] bArr3 = bArr2[c];
                    iArr2 = iArr2;
                    iArr9[i23] = iArr4[(bArr3[(i16 & 255) ^ (bArr3[i3] & 255)] & 255) ^ (i15 & 255)];
                    iArr9[i23 + 1] = iArr3[(bArr3[(bArr2[i][iBilling2] & 255) ^ billing(i16)] & 255) ^ billing(i15)];
                    ((int[]) this.f12120l)[i23 + AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE] = iArr2[(bArr2[i][(bArr2[c][iMopub2] & 255) ^ mopub(i16)] & 255) ^ mopub(i15)];
                    byte[] bArr4 = bArr2[i];
                    ((int[]) this.f12120l)[i23 + 513] = iArr[(bArr4[(bArr4[iAdmob2] & 255) ^ admob(i16)] & 255) ^ admob(i15)];
                    i21++;
                    c = c;
                    iArr = iArr;
                    i = i;
                    iArr2 = iArr2;
                    i17 = 2;
                    i19 = 3;
                } else {
                    int[] iArr10 = (int[]) this.f12120l;
                    int i24 = i21 * 2;
                    int i25 = bArr2[c][i21] & 255;
                    iArr10[i24] = iArr4[(i15 & 255) ^ i25];
                    iArr10[i24 + 1] = iArr3[i25 ^ billing(i15)];
                    ((int[]) this.f12120l)[i24 + AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE] = iArr2[(bArr2[i][i21] & 255) ^ mopub(i15)];
                    ((int[]) this.f12120l)[i24 + 513] = iArr[(bArr2[i][i21] & 255) ^ admob(i15)];
                }
                i = i;
                i21++;
                c = c;
                iArr = iArr;
                i = i;
                iArr2 = iArr2;
                i17 = 2;
                i19 = 3;
            } else {
                c = c;
                i2 = (bArr2[i][i21] & 255) ^ (i20 & 255);
                iBilling = (bArr2[c][i21] & 255) ^ billing(i20);
                iMopub = (bArr2[c][i21] & 255) ^ mopub(i20);
                iAdmob = (bArr2[i][i21] & 255) ^ admob(i20);
            }
            byte[] bArr5 = bArr2[i];
            i3 = (bArr5[i2] & 255) ^ (i18 & 255);
            iBilling2 = (bArr5[iBilling] & 255) ^ billing(i18);
            iMopub2 = (bArr2[c][iMopub] & 255) ^ mopub(i18);
            iAdmob2 = (bArr2[c][iAdmob] & 255) ^ admob(i18);
            int[] iArr11 = (int[]) this.f12120l;
            iArr = iArr;
            int i26 = i21 * 2;
            byte[] bArr6 = bArr2[c];
            iArr2 = iArr2;
            iArr11[i26] = iArr4[(bArr6[(i16 & 255) ^ (bArr6[i3] & 255)] & 255) ^ (i15 & 255)];
            iArr11[i26 + 1] = iArr3[(bArr6[(bArr2[i][iBilling2] & 255) ^ billing(i16)] & 255) ^ billing(i15)];
            ((int[]) this.f12120l)[i26 + AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE] = iArr2[(bArr2[i][(bArr2[c][iMopub2] & 255) ^ mopub(i16)] & 255) ^ mopub(i15)];
            byte[] bArr7 = bArr2[i];
            ((int[]) this.f12120l)[i26 + 513] = iArr[(bArr7[(bArr7[iAdmob2] & 255) ^ admob(i16)] & 255) ^ admob(i15)];
            i21++;
            c = c;
            iArr = iArr;
            i = i;
            iArr2 = iArr2;
            i17 = 2;
            i19 = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x030f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0327  */
    /* JADX WARN: Code duplicated, block: B:150:0x0330  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [lؘٗۗ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x030f -> B:145:0x031b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object subs(defpackage.C2234l r31, int r32, java.util.ArrayList r33, double r34, defpackage.AbstractC0283l r36) {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5740l.subs(lؓۥٝ, int, java.util.ArrayList, double, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (((byte[]) this.f12125l) == null) {
            C8339l.smaato("Twofish not initialised");
            return 0;
        }
        if (i + 16 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + 16 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        char c = 3;
        char c2 = 2;
        if (this.f12122l) {
            int iMetrica = AbstractC10000l.metrica(i, bArr) ^ ((int[]) this.f12119l)[0];
            int iMetrica2 = ((int[]) this.f12119l)[1] ^ AbstractC10000l.metrica(i + 4, bArr);
            int iMetrica3 = ((int[]) this.f12119l)[2] ^ AbstractC10000l.metrica(i + 8, bArr);
            int iMetrica4 = AbstractC10000l.metrica(i + 12, bArr) ^ ((int[]) this.f12119l)[3];
            int i3 = 8;
            int iRotateRight = iMetrica3;
            int iRotateLeft = iMetrica2;
            for (int i4 = 0; i4 < 16; i4 += 2) {
                int iLoadAd = loadAd(iMetrica);
                int iCrashlytics = crashlytics(iRotateLeft);
                iRotateRight = Integer.rotateRight(iRotateRight ^ ((iLoadAd + iCrashlytics) + ((int[]) this.f12119l)[i3]), 1);
                iMetrica4 = Integer.rotateLeft(iMetrica4, 1) ^ (((iCrashlytics * 2) + iLoadAd) + ((int[]) this.f12119l)[i3 + 1]);
                int iLoadAd2 = loadAd(iRotateRight);
                int iCrashlytics2 = crashlytics(iMetrica4);
                int i5 = i3 + 3;
                iMetrica = Integer.rotateRight(iMetrica ^ ((iLoadAd2 + iCrashlytics2) + ((int[]) this.f12119l)[i3 + 2]), 1);
                i3 += 4;
                iRotateLeft = Integer.rotateLeft(iRotateLeft, 1) ^ (((iCrashlytics2 * 2) + iLoadAd2) + ((int[]) this.f12119l)[i5]);
            }
            AbstractC10000l.smaato(((int[]) this.f12119l)[4] ^ iRotateRight, i2, bArr2);
            AbstractC10000l.smaato(iMetrica4 ^ ((int[]) this.f12119l)[5], i2 + 4, bArr2);
            AbstractC10000l.smaato(((int[]) this.f12119l)[6] ^ iMetrica, i2 + 8, bArr2);
            AbstractC10000l.smaato(((int[]) this.f12119l)[7] ^ iRotateLeft, i2 + 12, bArr2);
        } else {
            int iMetrica5 = AbstractC10000l.metrica(i, bArr) ^ ((int[]) this.f12119l)[4];
            int iMetrica6 = AbstractC10000l.metrica(i + 4, bArr) ^ ((int[]) this.f12119l)[5];
            int iMetrica7 = AbstractC10000l.metrica(i + 8, bArr) ^ ((int[]) this.f12119l)[6];
            int iMetrica8 = AbstractC10000l.metrica(i + 12, bArr) ^ ((int[]) this.f12119l)[7];
            int i6 = 39;
            int i7 = 0;
            while (i7 < 16) {
                int iLoadAd3 = loadAd(iMetrica5);
                int iCrashlytics3 = crashlytics(iMetrica6);
                char c3 = c;
                int i8 = iMetrica8 ^ (((iCrashlytics3 * 2) + iLoadAd3) + ((int[]) this.f12119l)[i6]);
                iMetrica7 = Integer.rotateLeft(iMetrica7, 1) ^ ((iLoadAd3 + iCrashlytics3) + ((int[]) this.f12119l)[i6 - 1]);
                iMetrica8 = Integer.rotateRight(i8, 1);
                int iLoadAd4 = loadAd(iMetrica7);
                int iCrashlytics4 = crashlytics(iMetrica8);
                int i9 = i6 - 3;
                int i10 = iMetrica6 ^ (((iCrashlytics4 * 2) + iLoadAd4) + ((int[]) this.f12119l)[i6 - 2]);
                i6 -= 4;
                iMetrica5 = Integer.rotateLeft(iMetrica5, 1) ^ ((iLoadAd4 + iCrashlytics4) + ((int[]) this.f12119l)[i9]);
                iMetrica6 = Integer.rotateRight(i10, 1);
                i7 += 2;
                c = c3;
                c2 = c2;
            }
            AbstractC10000l.smaato(((int[]) this.f12119l)[0] ^ iMetrica7, i2, bArr2);
            AbstractC10000l.smaato(iMetrica8 ^ ((int[]) this.f12119l)[1], i2 + 4, bArr2);
            AbstractC10000l.smaato(((int[]) this.f12119l)[c2] ^ iMetrica5, i2 + 8, bArr2);
            AbstractC10000l.smaato(((int[]) this.f12119l)[c] ^ iMetrica6, i2 + 12, bArr2);
        }
        return 16;
    }

    public int yandex(int[] iArr, int i) {
        int i2;
        int i3;
        int[] iArr2 = (int[]) this.f12126l;
        int[] iArr3 = (int[]) this.f12123l;
        int[] iArr4 = (int[]) this.f12124l;
        int[] iArr5 = (int[]) this.f12118l;
        int i4 = i & 255;
        int iBilling = billing(i);
        int iMopub = mopub(i);
        int iAdmob = admob(i);
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = this.f12121l & 3;
        byte[][] bArr = f12117l;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return 0;
                    }
                }
                byte[] bArr2 = bArr[0];
                i3 = (iArr4[(bArr2[(bArr[1][iBilling] & 255) ^ billing(i6)] & 255) ^ billing(i5)] ^ iArr5[(bArr2[(bArr2[i4] & 255) ^ (i6 & 255)] & 255) ^ (i5 & 255)]) ^ iArr3[(bArr[1][(bArr[0][iMopub] & 255) ^ mopub(i6)] & 255) ^ mopub(i5)];
                byte[] bArr3 = bArr[1];
                i2 = iArr2[(bArr3[(bArr3[iAdmob] & 255) ^ admob(i6)] & 255) ^ admob(i5)];
            } else {
                byte[] bArr4 = bArr[0];
                i3 = (iArr4[(bArr4[iBilling] & 255) ^ billing(i5)] ^ iArr5[(bArr4[i4] & 255) ^ (i5 & 255)]) ^ iArr3[(bArr[1][iMopub] & 255) ^ mopub(i5)];
                i2 = iArr2[(bArr[1][iAdmob] & 255) ^ admob(i5)];
            }
            return i3 ^ i2;
        }
        i4 = (i8 & 255) ^ (bArr[1][i4] & 255);
        iBilling = billing(i8) ^ (bArr[0][iBilling] & 255);
        iMopub = mopub(i8) ^ (bArr[0][iMopub] & 255);
        iAdmob = admob(i8) ^ (bArr[1][iAdmob] & 255);
        byte[] bArr5 = bArr[1];
        i4 = (bArr5[i4] & 255) ^ (i7 & 255);
        iBilling = billing(i7) ^ (bArr5[iBilling] & 255);
        iMopub = mopub(i7) ^ (bArr[0][iMopub] & 255);
        iAdmob = admob(i7) ^ (bArr[0][iAdmob] & 255);
        byte[] bArr6 = bArr[0];
        i3 = (iArr4[(bArr6[(bArr[1][iBilling] & 255) ^ billing(i6)] & 255) ^ billing(i5)] ^ iArr5[(bArr6[(bArr6[i4] & 255) ^ (i6 & 255)] & 255) ^ (i5 & 255)]) ^ iArr3[(bArr[1][(bArr[0][iMopub] & 255) ^ mopub(i6)] & 255) ^ mopub(i5)];
        byte[] bArr7 = bArr[1];
        i2 = iArr2[(bArr7[(bArr7[iAdmob] & 255) ^ admob(i6)] & 255) ^ admob(i5)];
        return i3 ^ i2;
    }

    public C5740l(C0720l c0720l, InterfaceC9955l interfaceC9955l, ArrayList arrayList) throws C12789l {
        this.f12118l = c0720l;
        this.f12124l = interfaceC9955l;
        this.f12123l = arrayList;
        this.f12122l = AbstractC12024l.m3344synchronized(AbstractC7000l.billing(interfaceC9955l.billing()), '/');
        this.f12120l = new ArrayList(16);
        this.f12125l = AbstractC7444l.yandex;
        try {
            List listIsPro = isPro(AbstractC7000l.billing(interfaceC9955l.billing()));
            this.f12126l = listIsPro;
            this.f12119l = arrayList.isEmpty() ? null : new C6944l(listIsPro);
        } catch (C1610l e) {
            throw new C12789l("Url decode failed for " + AbstractC7000l.amazon(((InterfaceC9955l) this.f12124l).billing()), e);
        }
    }
}
