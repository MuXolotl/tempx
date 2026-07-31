package defpackage;

import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Trace;
import android.provider.DocumentsContract;
import android.view.View;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lُُۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC11397l {
    public static final int[] yandex = {-19, -1, -1, -1, -1, -1, -1, Alert.DURATION_SHOW_INDEFINITELY};
    public static final int[] loadAd = {-32595792, -7943725, 4688975, 3500415, 6194736, 33281959, -12573105, -1002827, 163343, 5703241};

    public static void Signature(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = i;
        long j2 = i2;
        long j3 = j * j2;
        long j4 = i4;
        long j5 = j * j4;
        long j6 = i3;
        long j7 = (j6 * j2) + j5;
        long j8 = i6;
        long j9 = (j6 * j4) + (j * j8);
        long j10 = i5;
        long j11 = (j10 * j2) + j9;
        long j12 = ((j10 * j4) + (j6 * j8)) << 1;
        long j13 = i8;
        long j14 = j * j13;
        long j15 = i7;
        long jRemoteconfig = AbstractC0653l.remoteconfig(j15, j2, j14, j12);
        long j16 = (j10 * j8) << 1;
        long j17 = i10;
        long j18 = i9;
        long jRemoteconfig2 = AbstractC0653l.remoteconfig(j18, j2, (j15 * j4) + (j6 * j13) + (j * j17), j16);
        long j19 = ((j18 * j4) + ((j15 * j8) + ((j10 * j13) + (j6 * j17)))) << 1;
        long j20 = (j15 * j13) + (((j18 * j8) + (j10 * j17)) << 1);
        long j21 = (j18 * j13) + (j15 * j17);
        long j22 = (j18 * j17) << 1;
        long j23 = i11;
        long j24 = i12;
        long j25 = j23 * j24;
        long j26 = i14;
        long j27 = j23 * j26;
        long j28 = i13;
        long j29 = (j28 * j24) + j27;
        long j30 = i16;
        long j31 = (j28 * j26) + (j23 * j30);
        long j32 = i15;
        long j33 = i18;
        long j34 = j23 * j33;
        long j35 = i17;
        long jRemoteconfig3 = AbstractC0653l.remoteconfig(j35, j24, j34, ((j32 * j26) + (j28 * j30)) << 1);
        long j36 = i20;
        long j37 = (j35 * j26) + (j28 * j33) + (j23 * j36);
        long j38 = i19;
        long jRemoteconfig4 = AbstractC0653l.remoteconfig(j38, j24, j37, (j32 * j30) << 1);
        long j39 = j3 - (((j26 * j38) + ((j35 * j30) + ((j32 * j33) + (j28 * j36)))) * 76);
        long j40 = j7 - (((j35 * j33) + (((j30 * j38) + (j32 * j36)) << 1)) * 38);
        long j41 = j11 - (((j38 * j33) + (j35 * j36)) * 38);
        long j42 = jRemoteconfig - ((j36 * j38) * 76);
        long j43 = j19 - j25;
        long j44 = j20 - j29;
        long j45 = j21 - ((j32 * j24) + j31);
        long j46 = j22 - jRemoteconfig3;
        long j47 = i + i11;
        long j48 = i2 + i12;
        long j49 = j47 * j48;
        long j50 = i4 + i14;
        long j51 = j47 * j50;
        long j52 = i3 + i13;
        long j53 = (j52 * j48) + j51;
        long j54 = i6 + i16;
        long j55 = i5 + i15;
        long j56 = (j55 * j48) + (j52 * j50) + (j47 * j54);
        long j57 = ((j55 * j50) + (j52 * j54)) << 1;
        long j58 = i8 + i18;
        long j59 = i7 + i17;
        long jRemoteconfig5 = AbstractC0653l.remoteconfig(j59, j48, j47 * j58, j57);
        long j60 = i10 + i20;
        long j61 = i9 + i19;
        long jRemoteconfig6 = AbstractC0653l.remoteconfig(j61, j48, (j59 * j50) + (j52 * j58) + (j47 * j60), (j55 * j54) << 1);
        long j62 = ((j50 * j61) + ((j59 * j54) + ((j55 * j58) + (j52 * j60)))) << 1;
        long j63 = (j59 * j58) + (((j54 * j61) + (j55 * j60)) << 1);
        long j64 = (j61 * j58) + (j59 * j60);
        long j65 = (j60 * j61) << 1;
        long j66 = (jRemoteconfig5 - j42) + j46;
        int i21 = ((int) j66) & 67108863;
        long j67 = ((jRemoteconfig6 - jRemoteconfig2) - jRemoteconfig4) + (j66 >> 26);
        int i22 = ((int) j67) & 33554431;
        long j68 = ((((j67 >> 25) + j62) - j43) * 38) + j39;
        iArr3[0] = ((int) j68) & 67108863;
        long j69 = ((j63 - j44) * 38) + j40 + (j68 >> 26);
        iArr3[1] = ((int) j69) & 67108863;
        long j70 = ((j64 - j45) * 38) + j41 + (j69 >> 26);
        iArr3[2] = ((int) j70) & 33554431;
        long j71 = ((j65 - j46) * 38) + j42 + (j70 >> 25);
        iArr3[3] = ((int) j71) & 67108863;
        long jRemoteconfig7 = AbstractC0653l.remoteconfig(jRemoteconfig4, 38L, jRemoteconfig2, j71 >> 26);
        iArr3[4] = ((int) jRemoteconfig7) & 33554431;
        long j72 = (j49 - j39) + j43 + (jRemoteconfig7 >> 25);
        iArr3[5] = ((int) j72) & 67108863;
        long j73 = (j53 - j40) + j44 + (j72 >> 26);
        iArr3[6] = ((int) j73) & 67108863;
        long j74 = (j56 - j41) + j45 + (j73 >> 26);
        iArr3[7] = ((int) j74) & 33554431;
        long j75 = (j74 >> 25) + ((long) i21);
        iArr3[8] = ((int) j75) & 67108863;
        iArr3[9] = i22 + ((int) (j75 >> 26));
    }

    public static void ad(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        signatures(iArr, i);
        signatures(iArr, -i);
    }

    public static void adcel(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void admob(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr2[i3];
            iArr2[i3] = i4 ^ ((iArr[i2 + i3] ^ i4) & i);
        }
    }

    public static void ads(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[8];
        isPro(0, 0, iArr, iArr3);
        ad(iArr3);
        startapp(0, 0, iArr3, iArr4);
        startapp(5, 4, iArr3, iArr4);
        AbstractC6974l.remoteconfig(yandex, iArr4, iArr4);
        remoteconfig(0, 0, iArr4, iArr2);
        remoteconfig(4, 5, iArr4, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
    }

    public static void advert(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static final C8464l amazon(C3654l c3654l) {
        C8464l c8464l = c3654l.f7688l;
        if (c8464l != null) {
            return c8464l;
        }
        throw AbstractC5020l.metrica("Required value was null.");
    }

    public static void applovin(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = i;
        long j2 = j * j;
        long j3 = i2 * 2;
        long j4 = j * j3;
        long j5 = i3 * 2;
        long j6 = j * j5;
        long j7 = i2;
        long j8 = (j7 * j7) + j6;
        long j9 = i4 * 2;
        long j10 = (j * j9) + (j3 * j5);
        long j11 = i5 * 2;
        long j12 = (j7 * j9) + (j * j11) + (((long) i3) * j5);
        long j13 = (j5 * j9) + (j3 * j11);
        long j14 = j5 * j11;
        long j15 = i4;
        long j16 = (j15 * j15) + j14;
        long j17 = j15 * j11;
        long j18 = i6;
        long j19 = j18 * j18;
        long j20 = i7 * 2;
        long j21 = j18 * j20;
        long j22 = i8 * 2;
        long j23 = j18 * j22;
        long j24 = i7;
        long j25 = (j24 * j24) + j23;
        long j26 = j20 * j22;
        long j27 = i9 * 2;
        long j28 = i10 * 2;
        long j29 = (j24 * j27) + (j18 * j28) + (((long) i8) * j22);
        long j30 = (j22 * j27) + (j20 * j28);
        long j31 = j22 * j28;
        long j32 = i9;
        long j33 = j2 - (j30 * 38);
        long j34 = j4 - (((j32 * j32) + j31) * 38);
        long j35 = j8 - ((j32 * j28) * 38);
        long j36 = j10 - ((((long) i10) * j28) * 38);
        long j37 = j13 - j19;
        long j38 = j16 - j21;
        long j39 = j17 - j25;
        long j40 = (((long) i5) * j11) - ((j18 * j27) + j26);
        int i11 = i2 + i7;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        int i14 = i5 + i10;
        long j41 = i + i6;
        long j42 = i11 * 2;
        long j43 = j41 * j42;
        long j44 = i12 * 2;
        long j45 = i11;
        long j46 = (j45 * j45) + (j41 * j44);
        long j47 = i13 * 2;
        long j48 = i14 * 2;
        long j49 = i13;
        long j50 = ((long) i14) * j48;
        long j51 = (((j41 * j47) + (j42 * j44)) - j36) + j40;
        int i15 = ((int) j51) & 67108863;
        long j52 = ((((j45 * j47) + ((j41 * j48) + (((long) i12) * j44))) - j12) - j29) + (j51 >> 26);
        int i16 = ((int) j52) & 33554431;
        long j53 = ((((j52 >> 25) + ((j47 * j44) + (j42 * j48))) - j37) * 38) + j33;
        iArr2[0] = ((int) j53) & 67108863;
        long j54 = ((((j49 * j49) + (j44 * j48)) - j38) * 38) + j34 + (j53 >> 26);
        iArr2[1] = ((int) j54) & 67108863;
        long j55 = (((j49 * j48) - j39) * 38) + j35 + (j54 >> 26);
        iArr2[2] = ((int) j55) & 33554431;
        long j56 = ((j50 - j40) * 38) + j36 + (j55 >> 25);
        iArr2[3] = ((int) j56) & 67108863;
        long jRemoteconfig = AbstractC0653l.remoteconfig(j29, 38L, j12, j56 >> 26);
        iArr2[4] = ((int) jRemoteconfig) & 33554431;
        long j57 = ((j41 * j41) - j33) + j37 + (jRemoteconfig >> 25);
        iArr2[5] = ((int) j57) & 67108863;
        long j58 = (j43 - j34) + j38 + (j57 >> 26);
        iArr2[6] = ((int) j58) & 67108863;
        long j59 = (j46 - j35) + j39 + (j58 >> 26);
        iArr2[7] = ((int) j59) & 33554431;
        long j60 = (j59 >> 25) + ((long) i15);
        iArr2[8] = ((int) j60) & 67108863;
        iArr2[9] = i16 + ((int) (j60 >> 26));
    }

    public static void appmetrica(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void billing(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static final void crashlytics(int i, C15578l c15578l, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        c6956l.m2133new(-1854833411);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C10327l.subs;
                c6956l.m2147try(objM2132native);
            }
            InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native;
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC2812l.pro(6, c15578l, c6956l, true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9093l(interfaceC17242l, c15578l, i, i3);
        }
    }

    public static void firebase(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void inmobi(InterfaceC14094l interfaceC14094l) {
        if (m3078package(interfaceC14094l) || ((AbstractC17970l) interfaceC14094l).f35136l == null) {
            Trace.beginSection(((AbstractC17970l) interfaceC14094l).f35134l);
            m3079synchronized(interfaceC14094l);
        } else {
            inmobi(((AbstractC17970l) interfaceC14094l).f35136l);
            m3079synchronized(interfaceC14094l);
        }
    }

    public static void isPro(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static final String isVip(InterfaceC14189l interfaceC14189l, Charset charset) throws IOException {
        InterfaceC14189l interfaceC14189l2;
        Function0 c5146l;
        if (interfaceC14189l instanceof C3972l) {
            interfaceC14189l2 = interfaceC14189l;
            c5146l = new C18200l(0, 2, C3972l.class, interfaceC14189l2, "closed", "getClosed()Z");
        } else {
            interfaceC14189l2 = interfaceC14189l;
            if (!(interfaceC14189l2 instanceof C18476l)) {
                C18725l.billing();
                return null;
            }
            c5146l = new C5146l(23);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new C2629l(c5146l, interfaceC14189l2), charset);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
            stringWriter.write(cArr, 0, i);
        }
        return stringWriter.toString();
    }

    public static final C16240l license(AbstractC12074l abstractC12074l, InterfaceC9354l interfaceC9354l) throws C14279l {
        long jLongValue;
        Long lPremium;
        Object obj = abstractC12074l.f24000l;
        InterfaceC9955l interfaceC9955l = (InterfaceC9955l) obj;
        String strSignatures = interfaceC9955l.billing().yandex().signatures("Content-Type");
        if (strSignatures == null) {
            throw new C14279l(null);
        }
        String strSignatures2 = interfaceC9955l.billing().yandex().signatures("Content-Length");
        Long lValueOf = strSignatures2 != null ? Long.valueOf(Long.parseLong(strSignatures2)) : null;
        try {
            InterfaceC12932l interfaceC12932lMo246l = abstractC12074l.vip().mo246l(AbstractC11463l.loadAd);
            C11911l c11911l = AbstractC3248l.yandex;
            Long l = (Long) ((InterfaceC9955l) obj).getAttributes().billing(AbstractC3248l.yandex);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                String property = System.getProperty("io.ktor.server.request.formFieldLimit");
                jLongValue = (property == null || (lPremium = AbstractC16648l.premium(property)) == null) ? 52428800L : lPremium.longValue();
            }
            return new C16240l(interfaceC12932lMo246l, interfaceC9354l, strSignatures, lValueOf, jLongValue);
        } catch (C18068l unused) {
            C5254l c5254l = C5254l.f11335l;
            throw new C14279l(AbstractC10033l.admob(strSignatures));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void loadAd(Function1 function1, InterfaceC17242l interfaceC17242l, Function1 function2, Function1 function3, C6956l c6956l, int i, int i2) {
        int i3;
        Function1 function4;
        boolean z;
        Function1 function5;
        Function1 function6;
        C4224l c4224lAds;
        Function1 function7;
        int i4;
        InterfaceC17242l interfaceC17242lBilling;
        InterfaceC13490l interfaceC13490l;
        EnumC9931l enumC9931l;
        InterfaceC18556l interfaceC18556lSmaato;
        InterfaceC3177l interfaceC3177l;
        InterfaceC3187l interfaceC3187l;
        int i5;
        Context context;
        C14112l c14112lMopub;
        InterfaceC2449l interfaceC2449l;
        View view;
        boolean zAdmob;
        Object objM2132native;
        Function0 function0;
        C11192l c11192l = C11192l.f22531l;
        c6956l.m2133new(-180024211);
        AbstractC3031l abstractC3031l = c6956l.yandex;
        if ((i & 6) == 0) {
            i3 = (c6956l.admob(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if ((i & 3072) == 0) {
            i6 |= c6956l.admob(function2) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                function4 = function3;
                i6 |= c6956l.admob(function4) ? 16384 : 8192;
            }
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i6 & 1, z)) {
                if (i7 != 0) {
                    function7 = c11192l;
                } else {
                    function7 = function4;
                }
                long j = c6956l.f14595continue;
                i4 = (int) (j ^ (j >>> 32));
                interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l.premium(C16450l.f32163l).premium(C14786l.f28910l).premium(C9842l.f20040l).premium(C13334l.f26178l));
                interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
                enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
                interfaceC18556lSmaato = c6956l.smaato();
                interfaceC3177l = (InterfaceC3177l) c6956l.isPro(AbstractC2431l.yandex);
                interfaceC3187l = (InterfaceC3187l) c6956l.isPro(AbstractC11677l.yandex);
                c6956l.m2123default(1314774735);
                int i8 = i6 & 14;
                long j2 = c6956l.f14595continue;
                i5 = (int) (j2 ^ (j2 >>> 32));
                context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
                c14112lMopub = AbstractC8238l.mopub(c6956l);
                interfaceC2449l = (InterfaceC2449l) c6956l.isPro(AbstractC16780l.yandex);
                view = (View) c6956l.isPro(AbstractC1242l.billing);
                zAdmob = c6956l.admob(context) | ((((i8 & 14) ^ 6) <= 4 && c6956l.billing(function1)) || (i8 & 6) == 4) | c6956l.admob(c14112lMopub) | c6956l.admob(interfaceC2449l) | c6956l.amazon(i5) | c6956l.admob(view);
                objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == C1867l.yandex) {
                    Object c3888l = new C3888l(context, function1, c14112lMopub, interfaceC2449l, i5, view);
                    c6956l.m2147try(c3888l);
                    objM2132native = c3888l;
                }
                function0 = (Function0) objM2132native;
                if (abstractC3031l instanceof C11803l) {
                    AbstractC8238l.amazon();
                    throw null;
                }
                c6956l.m2131interface();
                if (c6956l.f14603switch) {
                    c6956l.firebase(function0);
                } else {
                    c6956l.m2136protected();
                }
                InterfaceC8801l.firebase.getClass();
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C6415l.f13414l);
                AbstractC8182l.billing(c6956l, interfaceC13490l, C6415l.f13421l);
                AbstractC8182l.billing(c6956l, interfaceC3177l, C6415l.f13401l);
                AbstractC8182l.billing(c6956l, interfaceC3187l, C6415l.f13404l);
                AbstractC8182l.billing(c6956l, enumC9931l, C6415l.f13420l);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                AbstractC8182l.billing(c6956l, function7, C6415l.f13400l);
                function5 = function2;
                AbstractC8182l.billing(c6956l, function5, C6415l.f13415l);
                c6956l.startapp(true);
                c6956l.startapp(false);
                function6 = function7;
            } else {
                function5 = function2;
                c6956l.m2124else();
                function6 = function4;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C7612l(function1, interfaceC17242l, function5, function6, i, i2, 1);
            }
        }
        i6 |= 24576;
        function4 = function3;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i6 & 1, z)) {
            if (i7 != 0) {
                function7 = c11192l;
            } else {
                function7 = function4;
            }
            long j3 = c6956l.f14595continue;
            i4 = (int) (j3 ^ (j3 >>> 32));
            interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l.premium(C16450l.f32163l).premium(C14786l.f28910l).premium(C9842l.f20040l).premium(C13334l.f26178l));
            interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
            enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
            interfaceC18556lSmaato = c6956l.smaato();
            interfaceC3177l = (InterfaceC3177l) c6956l.isPro(AbstractC2431l.yandex);
            interfaceC3187l = (InterfaceC3187l) c6956l.isPro(AbstractC11677l.yandex);
            c6956l.m2123default(1314774735);
            int i9 = i6 & 14;
            long j4 = c6956l.f14595continue;
            i5 = (int) (j4 ^ (j4 >>> 32));
            context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
            c14112lMopub = AbstractC8238l.mopub(c6956l);
            interfaceC2449l = (InterfaceC2449l) c6956l.isPro(AbstractC16780l.yandex);
            view = (View) c6956l.isPro(AbstractC1242l.billing);
            zAdmob = c6956l.admob(context) | ((((i9 & 14) ^ 6) <= 4 && c6956l.billing(function1)) || (i9 & 6) == 4) | c6956l.admob(c14112lMopub) | c6956l.admob(interfaceC2449l) | c6956l.amazon(i5) | c6956l.admob(view);
            objM2132native = c6956l.m2132native();
            if (zAdmob) {
                Object c3888l2 = new C3888l(context, function1, c14112lMopub, interfaceC2449l, i5, view);
                c6956l.m2147try(c3888l2);
                objM2132native = c3888l2;
            } else {
                Object c3888l3 = new C3888l(context, function1, c14112lMopub, interfaceC2449l, i5, view);
                c6956l.m2147try(c3888l3);
                objM2132native = c3888l3;
            }
            function0 = (Function0) objM2132native;
            if (abstractC3031l instanceof C11803l) {
                AbstractC8238l.amazon();
                throw null;
            }
            c6956l.m2131interface();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            InterfaceC8801l.firebase.getClass();
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C6415l.f13414l);
            AbstractC8182l.billing(c6956l, interfaceC13490l, C6415l.f13421l);
            AbstractC8182l.billing(c6956l, interfaceC3177l, C6415l.f13401l);
            AbstractC8182l.billing(c6956l, interfaceC3187l, C6415l.f13404l);
            AbstractC8182l.billing(c6956l, enumC9931l, C6415l.f13420l);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.billing(c6956l, function7, C6415l.f13400l);
            function5 = function2;
            AbstractC8182l.billing(c6956l, function5, C6415l.f13415l);
            c6956l.startapp(true);
            c6956l.startapp(false);
            function6 = function7;
        } else {
            function5 = function2;
            c6956l.m2124else();
            function6 = function4;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7612l(function1, interfaceC17242l, function5, function6, i, i2, 1);
        }
    }

    public static void metrica(int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        adcel((i4 << 26) | i3, i2, bArr);
        adcel((i4 >>> 6) | (i5 << 20), i2 + 4, bArr);
        adcel((i5 >>> 12) | (i6 << 13), i2 + 8, bArr);
        adcel((i7 << 7) | (i6 >>> 19), i2 + 12, bArr);
    }

    public static void mopub(Context context, Function0 function0) {
        Object c18435l;
        String strYandex = C8994l.yandex.yandex();
        if (!AbstractC8576l.yandex(strYandex, "")) {
            List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
            if (persistedUriPermissions.isEmpty() || persistedUriPermissions.isEmpty()) {
                C8994l.yandex.crashlytics("");
            } else {
                for (UriPermission uriPermission : persistedUriPermissions) {
                    if (AbstractC8576l.yandex(uriPermission.getUri().toString(), strYandex) || !uriPermission.isWritePermission()) {
                        try {
                            Uri uri = Uri.parse(strYandex);
                            c18435l = new C15512l(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
                        } catch (Throwable th) {
                            c18435l = new C18435l(th);
                        }
                        if (C1171l.yandex(c18435l) != null) {
                            C8994l.yandex.crashlytics("");
                        } else {
                            C15512l c15512l = (C15512l) (c18435l instanceof C18435l ? null : c18435l);
                            if (c15512l != null) {
                                if (c15512l.yandex()) {
                                    AbstractC0532l.loadAd(function0, (AppActivity) context);
                                    return;
                                }
                                C8994l.yandex.crashlytics("");
                            }
                        }
                    }
                }
                C8994l.yandex.crashlytics("");
            }
        }
        AbstractC11708l.yandex(new Ctry(context, new C10734l(Integer.valueOf(R.drawable.ic_folder_outline_24), context.getString(R.string.path_select_none), context.getString(R.string.path_select_text), new C8195l(context.getString(R.string.path_select_button), new C9871l(context, 3)), null, 176), 4));
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static boolean m3078package(InterfaceC14094l interfaceC14094l) {
        return ((AbstractC17970l) interfaceC14094l).f35137l != Thread.currentThread();
    }

    public static void premium(int i, int[] iArr, int[] iArr2) {
        applovin(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                applovin(iArr2, iArr2);
            }
        }
    }

    public static void pro(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void purchase(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void remoteconfig(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & 67108863;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & 67108863;
        iArr2[i2 + 2] = ((i4 >>> 20) | (i5 << 12)) & 33554431;
        iArr2[i2 + 3] = 67108863 & ((i6 << 19) | (i5 >>> 13));
        iArr2[i2 + 4] = i6 >>> 7;
    }

    public static void signatures(int[] iArr, int i) {
        int i2 = iArr[9];
        long j = ((long) (((i2 >> 24) + i) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + ((long) iArr[7]);
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + ((long) iArr[8]);
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
    }

    public static void smaato(int i, int i2, byte[] bArr, int[] iArr) {
        int iVip = vip(i, bArr);
        int iVip2 = vip(i + 4, bArr);
        int iVip3 = vip(i + 8, bArr);
        int iVip4 = vip(i + 12, bArr);
        iArr[i2] = iVip & 67108863;
        iArr[i2 + 1] = ((iVip >>> 26) | (iVip2 << 6)) & 67108863;
        iArr[i2 + 2] = ((iVip2 >>> 20) | (iVip3 << 12)) & 33554431;
        iArr[i2 + 3] = 67108863 & ((iVip4 << 19) | (iVip3 >>> 13));
        iArr[i2 + 4] = iVip4 >>> 7;
    }

    public static void startapp(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2] = (i4 << 26) | i3;
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    public static void subs(int[] iArr, int i) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static int subscription(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static void m3079synchronized(InterfaceC14094l interfaceC14094l) {
        String strSubstring = ((AbstractC17970l) interfaceC14094l).f35138l;
        AtomicReference atomicReference = AbstractC10540l.yandex;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }

    public static void tapsense(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        long j = ((long) i3) * 121666;
        int i10 = ((int) j) & 33554431;
        long j2 = j >> 25;
        long j3 = ((long) i5) * 121666;
        int i11 = ((int) j3) & 33554431;
        long j4 = ((long) i8) * 121666;
        long j5 = ((long) iArr[9]) * 121666;
        int i12 = ((int) j5) & 33554431;
        long j6 = (((long) i) * 121666) + ((j5 >> 25) * 38);
        iArr2[0] = ((int) j6) & 67108863;
        long j7 = (((long) i6) * 121666) + (j3 >> 25);
        iArr2[5] = ((int) j7) & 67108863;
        long j8 = (((long) i2) * 121666) + (j6 >> 26);
        iArr2[1] = ((int) j8) & 67108863;
        long j9 = (((long) i4) * 121666) + j2;
        iArr2[3] = ((int) j9) & 67108863;
        long j10 = (((long) i7) * 121666) + (j7 >> 26);
        iArr2[6] = ((int) j10) & 67108863;
        long j11 = (((long) i9) * 121666) + (j4 >> 25);
        iArr2[8] = ((int) j11) & 67108863;
        iArr2[2] = ((int) (j8 >> 26)) + i10;
        iArr2[4] = i11 + ((int) (j9 >> 26));
        iArr2[7] = (((int) j4) & 33554431) + ((int) (j10 >> 26));
        iArr2[9] = i12 + ((int) (j11 >> 26));
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static void m3080throws(InterfaceC14094l interfaceC14094l) {
        if (m3078package(interfaceC14094l) || ((AbstractC17970l) interfaceC14094l).f35136l == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            m3080throws(((AbstractC17970l) interfaceC14094l).f35136l);
        }
    }

    public static int vip(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final void yandex(Function1 function1, InterfaceC17242l interfaceC17242l, Function1 function2, C6956l c6956l, int i) {
        C11192l c11192l = C11192l.f22531l;
        c6956l.m2133new(-1783766393);
        int i2 = (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            loadAd(function1, interfaceC17242l, c11192l, function2, c6956l, 3126 | ((i2 << 6) & 57344), 4);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11834l(function1, interfaceC17242l, function2, i, 1);
        }
    }
}
