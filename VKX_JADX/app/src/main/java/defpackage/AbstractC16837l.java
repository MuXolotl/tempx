package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٗؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16837l {
    public static final C9946l yandex = new C9946l(2);

    public static final void amazon(ZipOutputStream zipOutputStream, File file, int i) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    amazon(zipOutputStream, file, i);
                } else {
                    byte[] bArr = new byte[2048];
                    String path = file2.getPath();
                    String strSubstring = path.substring(i);
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(path), 2048);
                    try {
                        ZipEntry zipEntry = new ZipEntry(strSubstring);
                        zipEntry.setTime(file2.lastModified());
                        zipOutputStream.putNextEntry(zipEntry);
                        for (int i2 = bufferedInputStream2.read(bArr, 0, 2048); i2 != -1; i2 = bufferedInputStream2.read(bArr, 0, 2048)) {
                            zipOutputStream.write(bArr, 0, i2);
                        }
                        bufferedInputStream = bufferedInputStream2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        throw th;
                    }
                }
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final int crashlytics(InterfaceC0684l interfaceC0684l) {
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("SELECT changes()");
        try {
            interfaceC14742lMo668l.mo827l();
            int i = (int) interfaceC14742lMo668l.getLong(0);
            AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(ArrayList arrayList, InterfaceC9354l interfaceC9354l, C11310l c11310l, Charset charset, AbstractC0283l abstractC0283l) throws C10756l {
        C10576l c10576l;
        if (abstractC0283l instanceof C10576l) {
            c10576l = (C10576l) abstractC0283l;
            int i = c10576l.f21489l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10576l.f21489l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10576l = new C10576l(abstractC0283l);
            }
        } else {
            c10576l = new C10576l(abstractC0283l);
        }
        Object objVip = c10576l.f21492l;
        int i2 = c10576l.f21489l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objVip);
            C8141l c8141l = new C8141l(new C14970l(4, arrayList), charset, c11310l, interfaceC9354l);
            C13624l c13624l = new C13624l(interfaceC9354l, interfaceC14029l, 12);
            c10576l.f21491l = interfaceC9354l;
            c10576l.f21490l = c11310l;
            c10576l.f21489l = 1;
            objVip = AbstractC0622l.vip(c8141l, c13624l, c10576l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objVip == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c11310l = c10576l.f21490l;
            interfaceC9354l = c10576l.f21491l;
            AbstractC2829l.crashlytics(objVip);
        }
        if (objVip != null) {
            return objVip;
        }
        if (!interfaceC9354l.admob()) {
            return interfaceC9354l;
        }
        InterfaceC13012l interfaceC13012l = c11310l.loadAd;
        if (interfaceC13012l != null && interfaceC13012l.Signature()) {
            return C6130l.yandex;
        }
        throw new C10756l(2, "No suitable converter found for " + c11310l, null);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x027a  */
    public static final void yandex(InterfaceC17242l interfaceC17242l, C8232l c8232l, C1232l c1232l, C17253l c17253l, boolean z, InterfaceC14745l interfaceC14745l, boolean z2, C10306l c10306l, InterfaceC3501l interfaceC3501l, InterfaceC5404l interfaceC5404l, Function1 function1, C6956l c6956l, int i, int i2) {
        int i3;
        int i4;
        C8232l c8232l2;
        boolean z3;
        Object c4490l;
        C8232l c8232l3;
        InterfaceC2901l interfaceC2901l;
        InterfaceC17242l interfaceC17242lSubs;
        c6956l.m2133new(708740370);
        if ((i & 6) == 0) {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(c8232l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c6956l.billing(c1232l) : c6956l.admob(c1232l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c6956l.billing(c17253l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c6956l.mopub(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c6956l.mopub(z) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c6956l.billing(interfaceC14745l) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c6956l.mopub(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c6956l.billing(c10306l) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c6956l.billing(interfaceC3501l) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c6956l.billing(interfaceC5404l) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c6956l.admob(function1) ? 32 : 16;
        }
        int i5 = i3;
        boolean z4 = true;
        if (c6956l.m2127for(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            int i6 = i5 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i4 & 112);
            InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
            boolean z5 = (((i8 & 14) ^ 6) > 4 && c6956l.billing(c8232l)) || (i8 & 6) == 4;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z5 || objM2132native == c13863l) {
                C1461l c1461l = C1461l.f3659l;
                objM2132native = new C0059l(0, 4, InterfaceC12244l.class, AbstractC8020l.billing(c1461l, new C12242l(AbstractC8020l.billing(c1461l, new C0289l(interfaceC8714lVip, 18)), c8232l, 26)), "value", "getValue()Ljava/lang/Object;");
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2901l interfaceC2901l2 = (InterfaceC2901l) objM2132native;
            int i9 = i7 | ((i5 >> 9) & 112);
            boolean z6 = ((((i9 & 14) ^ 6) > 4 && c6956l.billing(c8232l)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && c6956l.mopub(false)) || (i9 & 48) == 32);
            Object objM2132native2 = c6956l.m2132native();
            if (z6 || objM2132native2 == c13863l) {
                objM2132native2 = new C1787l(c8232l);
                c6956l.m2147try(objM2132native2);
            }
            C1787l c1787l = (C1787l) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native3;
            InterfaceC3685l interfaceC3685l = (InterfaceC3685l) c6956l.isPro(AbstractC4751l.mopub);
            C13975l c13975l = !((Boolean) c6956l.isPro(AbstractC4751l.ad)).booleanValue() ? C17926l.yandex : null;
            int i10 = (i5 & 524272) | ((i4 << 18) & 3670016) | ((i5 >> 6) & 29360128);
            boolean z7 = ((((i10 & 896) ^ 384) > 256 && c6956l.billing(c1232l)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && c6956l.billing(c8232l)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && c6956l.billing(c17253l)) || (i10 & 3072) == 2048);
            if (((57344 & i10) ^ 24576) > 16384 && c6956l.mopub(false)) {
                z3 = true;
            } else if ((i10 & 24576) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zBilling = ((((i10 & 29360128) ^ 12582912) > 8388608 && c6956l.billing(interfaceC3501l)) || (i10 & 12582912) == 8388608) | z7 | z3 | ((((458752 & i10) ^ 196608) > 131072 && c6956l.mopub(z)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) > 1048576 && c6956l.billing(interfaceC5404l)) || (i10 & 1572864) == 1048576) | c6956l.billing(interfaceC3685l);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling || objM2132native4 == c13863l) {
                c8232l3 = c8232l;
                c4490l = new C4490l(c8232l3, z, c17253l, interfaceC2901l2, c1232l, interfaceC3501l, interfaceC5404l, interfaceC2262l, interfaceC3685l, c13975l);
                interfaceC2901l = interfaceC2901l2;
                c6956l.m2147try(c4490l);
            } else {
                c4490l = objM2132native4;
                interfaceC2901l = interfaceC2901l2;
                c8232l3 = c8232l;
            }
            InterfaceC2948l interfaceC2948l = (InterfaceC2948l) c4490l;
            EnumC7283l enumC7283l = z ? EnumC7283l.f15126l : EnumC7283l.f15125l;
            if (z2) {
                c6956l.m2123default(27281635);
                if (((i7 ^ 6) <= 4 || !c6956l.billing(c8232l3)) && (i6 & 6) != 4) {
                    z4 = false;
                }
                Object objM2132native5 = c6956l.m2132native();
                if (z4 || objM2132native5 == c13863l) {
                    objM2132native5 = new C17101l(c8232l3);
                    c6956l.m2147try(objM2132native5);
                }
                interfaceC17242lSubs = AbstractC10565l.subs((C17101l) objM2132native5, c8232l3.vip, enumC7283l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(27577840);
                c6956l.startapp(false);
                interfaceC17242lSubs = C4346l.f8873l;
            }
            c8232l2 = c8232l3;
            AbstractC18377l.yandex(interfaceC2901l, AbstractC18377l.amazon(AbstractC0019l.billing(AbstractC2648l.purchase(interfaceC17242l.premium(c8232l3.firebase).premium(c8232l3.smaato), interfaceC2901l, c1787l, enumC7283l, z2).premium(interfaceC17242lSubs), c8232l3.remoteconfig), c8232l3, enumC7283l, c10306l, z2, interfaceC14745l, c8232l3.billing, null), c8232l2.metrica, interfaceC2948l, c6956l, 0);
        } else {
            c8232l2 = c8232l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17652l(interfaceC17242l, c8232l2, c1232l, c17253l, z, interfaceC14745l, z2, c10306l, interfaceC3501l, interfaceC5404l, function1, i, i2);
        }
    }
}
