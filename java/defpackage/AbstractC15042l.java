package defpackage;

import android.content.Context;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٔٝ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15042l {
    public static final C15578l yandex = new C15578l(1709539737, false, new C14484l(2));
    public static final C15578l loadAd = new C15578l(339606970, false, new C14484l(16));
    public static final C15578l crashlytics = new C15578l(1713692003, false, new C14484l(3));
    public static final C15578l amazon = new C15578l(-1774739862, false, new C11112l(14));
    public static final C15578l purchase = new C15578l(1979857579, false, new C14484l(4));
    public static final C15578l billing = new C15578l(719500744, false, new C14484l(5));
    public static final C15578l mopub = new C15578l(1738160266, false, new C14484l(6));
    public static final C15578l admob = new C15578l(477803431, false, new C14484l(7));
    public static final C15578l subs = new C15578l(1496462953, false, new C14484l(8));
    public static final C15578l isPro = new C15578l(236106118, false, new C14484l(9));
    public static final C15578l firebase = new C15578l(1254765640, false, new C14484l(10));
    public static final C15578l smaato = new C15578l(-5591195, false, new C14484l(11));
    public static final C15578l remoteconfig = new C15578l(1013068327, false, new C14484l(12));
    public static final C15578l vip = new C15578l(-247288508, false, new C14484l(13));
    public static final C15578l metrica = new C15578l(771371014, false, new C14484l(14));
    public static final C15578l startapp = new C15578l(-488985821, false, new C14484l(15));
    public static final C15578l adcel = new C15578l(828346243, false, new C11112l(15));
    public static final C15578l ads = new C15578l(586648930, false, new C11112l(16));

    public static final C6906l Signature() {
        Float fValueOf = Float.valueOf(0.0f);
        long j = C9735l.isPro;
        C8195l c8195l = new C8195l(fValueOf, new C9735l(j));
        Float fValueOf2 = Float.valueOf(0.1f);
        long j2 = C9735l.loadAd;
        return C1083l.ads(new C8195l[]{c8195l, new C8195l(fValueOf2, new C9735l(j2)), new C8195l(Float.valueOf(0.9f), new C9735l(j2)), new C8195l(Float.valueOf(1.0f), new C9735l(j))});
    }

    public static final float ad(C6956l c6956l) {
        float f = ((C14467l) c6956l.isPro(AbstractC16434l.crashlytics)).f28331l;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - 24.0f) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    public static final InterfaceC17242l adcel(InterfaceC17242l interfaceC17242l, C6906l c6906l) {
        return AbstractC14289l.smaato(AbstractC7477l.crashlytics(interfaceC17242l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 983039), new C14938l(c6906l, 0));
    }

    public static final void admob(C14473l c14473l, C10507l c10507l, C6956l c6956l, int i) {
        C7819l c7819lVip;
        c6956l.m2133new(1682774240);
        int i2 = (c6956l.billing(c14473l) ? 4 : 2) | i | (c6956l.billing(c10507l) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j = c6956l.f14595continue;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC18643l abstractC18643l = c10507l != null ? c10507l.loadAd : null;
            if (abstractC18643l == null) {
                c6956l.m2123default(-1976115529);
                c6956l.startapp(false);
                c7819lVip = null;
            } else {
                c6956l.m2123default(-1976115528);
                c7819lVip = vip(abstractC18643l, (Context) c6956l.isPro(AbstractC1242l.loadAd), 1, c14473l);
                c6956l.startapp(false);
            }
            AbstractC7741l.purchase(c7819lVip, null, AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC16759l.crashlytics(R.drawable.generic_audio_nowplaying, 0, c6956l), AbstractC16759l.crashlytics(R.drawable.generic_audio_nowplaying, 0, c6956l), C4176l.yandex, c6956l, 37296, 6, 31712);
            AbstractC4959l.yandex(c10507l != null ? c10507l.loadAd : null, AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l, 48);
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.crashlytics(c4346l, 1.0f), C9735l.loadAd(0.25f, C9735l.loadAd), AbstractC16837l.yandex), c6956l, 6);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(c14473l, c10507l, i, 12);
        }
    }

    public static final boolean ads(AbstractC18643l abstractC18643l) {
        if (abstractC18643l instanceof AudioTrack) {
            AudioTrack audioTrack = (AudioTrack) abstractC18643l;
            AudioAlbum audioAlbum = audioTrack.vip;
            C14025l c14025lAdmob = null;
            if ((audioAlbum != null ? audioAlbum.purchase : null) != null || AbstractC0653l.purchase(audioTrack)) {
                return true;
            }
            if (!audioTrack.inmobi) {
                int i = audioTrack.loadAd;
                long j = audioTrack.crashlytics;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append('_');
                sb.append(i);
                String string = sb.toString();
                C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string}, 1))) : null;
                if (cachedTrack != null) {
                    c14025lAdmob = AbstractC5309l.amazon(cachedTrack);
                }
            } else if (audioTrack.f36608synchronized) {
                c14025lAdmob = AbstractC0825l.admob(3, AbstractC16676l.mopub(audioTrack));
            } else if (audioTrack.f36609throws) {
                c14025lAdmob = AbstractC0825l.admob(2, AbstractC16676l.mopub(audioTrack));
            } else if (audioAlbum != null) {
                c14025lAdmob = AbstractC0825l.admob(4, audioAlbum.loadAd());
            }
            if (c14025lAdmob != null) {
                return AbstractC5921l.f12465l.isVip(c14025lAdmob);
            }
        } else if (abstractC18643l.getAmazon() != null) {
            return true;
        }
        return false;
    }

    public static final InterfaceC17242l advert(InterfaceC17242l interfaceC17242l, boolean z, AbstractC17824l abstractC17824l, C6956l c6956l) {
        InterfaceC17242l interfaceC17242lStartapp;
        if (z && (abstractC17824l instanceof C15618l)) {
            c6956l.m2123default(-2119688641);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C5562l(2);
                c6956l.m2147try(objM2132native);
            }
            interfaceC17242lStartapp = AbstractC3605l.startapp(new C15986l((Function1) objM2132native, true), 0.0f, license(c6956l), 0.0f, 0.0f, 13);
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(-2119398202);
            c6956l.startapp(false);
            interfaceC17242lStartapp = C4346l.f8873l;
        }
        return interfaceC17242l.premium(interfaceC17242lStartapp);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:131:0x0220  */
    /* JADX WARN: Code duplicated, block: B:133:0x0224  */
    /* JADX WARN: Code duplicated, block: B:145:0x0248  */
    /* JADX WARN: Code duplicated, block: B:195:0x0369  */
    /* JADX WARN: Code duplicated, block: B:207:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:211:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:219:0x040b A[PHI: r13
  0x040b: PHI (r13v37 lٕؑؐ) = (r13v36 lٕؑؐ), (r13v36 lٕؑؐ), (r13v43 lٕؑؐ) binds: [B:226:0x042c, B:231:0x043d, B:217:0x0403] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:221:0x040f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0412  */
    /* JADX WARN: Code duplicated, block: B:238:0x0455  */
    /* JADX WARN: Code duplicated, block: B:241:0x0475  */
    /* JADX WARN: Code duplicated, block: B:244:0x047b  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:248:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:251:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:255:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:259:0x04df  */
    /* JADX WARN: Code duplicated, block: B:264:0x0522 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:265:0x0524  */
    /* JADX WARN: Code duplicated, block: B:266:0x0543  */
    /* JADX WARN: Code duplicated, block: B:268:0x0546  */
    /* JADX WARN: Code duplicated, block: B:270:0x0564  */
    /* JADX WARN: Code duplicated, block: B:275:0x0576 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x0578  */
    /* JADX WARN: Code duplicated, block: B:280:0x05da  */
    /* JADX WARN: Code duplicated, block: B:283:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:288:0x0602  */
    /* JADX WARN: Code duplicated, block: B:290:0x0606  */
    /* JADX WARN: Code duplicated, block: B:293:0x060b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0610  */
    /* JADX WARN: Code duplicated, block: B:297:0x0613  */
    /* JADX WARN: Code duplicated, block: B:300:0x0696  */
    /* JADX WARN: Code duplicated, block: B:301:0x06bb  */
    public static final void amazon(InterfaceC12244l interfaceC12244l, C1351l c1351l, boolean z, boolean z2, boolean z3, boolean z4, C18656l c18656l, C11090l c11090l, C11090l c11090l2, Function3 function3, C6956l c6956l, int i) {
        long j;
        C10086l c10086l;
        C11192l c11192l;
        C5689l c5689l;
        boolean z5;
        int i2;
        C6956l c6956l2;
        C9459l c9459lBilling;
        boolean z6;
        Object objMopub;
        C9459l c9459l;
        boolean z7;
        int i3;
        Object objMopub2;
        boolean z8;
        Object objM2132native;
        C9459l c9459l2;
        float fFloatValue;
        C11090l c11090l3;
        InterfaceC12750l interfaceC12750l;
        InterfaceC12750l interfaceC12750l2;
        boolean z9;
        C15368l c15368l;
        C15368l c15368l2;
        InterfaceC12750l c16686l;
        C6886l c6886l;
        C6886l c6886l2;
        C10524l c10524l;
        float f;
        C10524l c10524l2;
        float f2;
        C16810l c16810l;
        C16810l c16810l2;
        C16810l c16810l3;
        C16810l c16810l4;
        C0387l c0387l;
        C0387l c0387l2;
        C0387l c0387lPurchase;
        C0387l c0387lPurchase2;
        C1354l c1354l;
        C1354l c1354l2;
        C13299l c13299l;
        C13299l c13299l2;
        C4361l c4361l;
        C4361l c4361l2;
        C4361l c4361l3;
        boolean z10;
        boolean z11;
        C4361l c4361l4;
        C11090l c11090lYandex;
        int i4;
        boolean z12;
        Object objMopub3;
        boolean z13;
        Object objM2132native2;
        EnumC7278l enumC7278l;
        long j2;
        boolean z14;
        Object objM2132native3;
        Function3 function4 = function3;
        C10086l c10086l2 = c18656l.amazon;
        C11192l c11192l2 = C11192l.f22516l;
        c6956l.m2133new(376119213);
        int i5 = i | (c6956l.billing(interfaceC12244l) ? 4 : 2) | (c6956l.billing(c1351l) ? 32 : 16) | (c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.mopub(z2) ? 2048 : 1024) | (c6956l.mopub(z3) ? 16384 : 8192) | (c6956l.mopub(z4) ? 131072 : 65536) | (c6956l.billing(c18656l) ? 1048576 : 524288) | (c6956l.billing(c11090l) ? 8388608 : 4194304) | (c6956l.billing(c11090l2) ? 67108864 : 33554432) | (c6956l.admob(function4) ? 536870912 : 268435456);
        if (c6956l.m2127for(i5 & 1, (i5 & 306783379) != 306783378)) {
            Object objM2132native4 = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native4 == c13863l) {
                objM2132native4 = new C5689l();
                c6956l.m2147try(objM2132native4);
            }
            C5689l c5689l2 = (C5689l) objM2132native4;
            if (!z) {
                j = c1351l.isVip;
            } else if (z2) {
                j = c1351l.signatures;
            } else {
                j = z3 ? c1351l.ad : c1351l.advert;
            }
            if (z4) {
                i2 = 14;
                c6956l.m2123default(-601510006);
                long jCrashlytics = c11090l.crashlytics();
                if (z4 && jCrashlytics == 16) {
                    jCrashlytics = j;
                }
                long jCrashlytics2 = c11090l2.crashlytics();
                if (z4 && jCrashlytics2 == 16) {
                    jCrashlytics2 = j;
                }
                InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 5);
                int i6 = ((i5 >> 18) & 14) | 384;
                EnumC7278l enumC7278l2 = (EnumC7278l) c10086l2.getValue();
                c6956l.m2123default(-759924327);
                int[] iArr = AbstractC5147l.yandex;
                long j3 = iArr[enumC7278l2.ordinal()] == 1 ? jCrashlytics : jCrashlytics2;
                c6956l.startapp(false);
                AbstractC11833l abstractC11833lBilling = C9735l.billing(j3);
                boolean zBilling = c6956l.billing(abstractC11833lBilling);
                Object objM2132native5 = c6956l.m2132native();
                if (zBilling || objM2132native5 == c13863l) {
                    C0010l c0010l = new C0010l(c11192l2, new C3006l(10, abstractC11833lBilling));
                    c6956l.m2147try(c0010l);
                    objM2132native5 = c0010l;
                }
                C0010l c0010l2 = (C0010l) objM2132native5;
                int i7 = (i6 & 14) | 3072;
                if (c18656l.mopub()) {
                    i4 = i7;
                    c0010l2 = c0010l2;
                    z12 = false;
                    objMopub3 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656l);
                } else {
                    c6956l.m2123default(1666573488);
                    i4 = i7;
                    boolean z15 = (((i7 & 14) ^ 6) > 4 && c6956l.billing(c18656l)) || (i4 & 6) == 4;
                    objMopub3 = c6956l.m2132native();
                    if (z15 || objMopub3 == c13863l) {
                        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        try {
                            Object objCrashlytics = c18656l.crashlytics();
                            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                            c6956l.m2147try(objCrashlytics);
                            objMopub3 = objCrashlytics;
                        } catch (Throwable th) {
                            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                            throw th;
                        }
                    }
                    z12 = false;
                    c6956l.startapp(false);
                }
                c6956l.m2123default(-759924327);
                long j4 = iArr[((EnumC7278l) objMopub3).ordinal()] == 1 ? jCrashlytics : jCrashlytics2;
                c6956l.startapp(z12);
                C9735l c9735l = new C9735l(j4);
                int i8 = i4 & 14;
                int i9 = i8 ^ 6;
                if (i9 <= 4 || !c6956l.billing(c18656l)) {
                    c10086l = c10086l2;
                    if ((i4 & 6) != 4) {
                        z13 = false;
                    }
                    objM2132native2 = c6956l.m2132native();
                    if (z13 || objM2132native2 == c13863l) {
                        objM2132native2 = AbstractC8020l.mopub(new C17648l(c18656l, 8));
                        c6956l.m2147try(objM2132native2);
                    }
                    enumC7278l = (EnumC7278l) ((InterfaceC12244l) objM2132native2).getValue();
                    c6956l.m2123default(-759924327);
                    if (iArr[enumC7278l.ordinal()] == 1) {
                        j2 = jCrashlytics;
                    } else {
                        j2 = jCrashlytics2;
                    }
                    c6956l.startapp(false);
                    C9735l c9735l2 = new C9735l(j2);
                    z14 = (i9 <= 4 && c6956l.billing(c18656l)) || (i4 & 6) == 4;
                    objM2132native3 = c6956l.m2132native();
                    if (z14 || objM2132native3 == c13863l) {
                        objM2132native3 = AbstractC8020l.mopub(new C17648l(c18656l, 9));
                        c6956l.m2147try(objM2132native3);
                    }
                    c6956l.m2123default(1730286052);
                    c6956l.startapp(false);
                    int i10 = i8 | 196608;
                    c11192l = c11192l2;
                    z5 = false;
                    c6956l2 = c6956l;
                    c5689l = c5689l2;
                    c9459lBilling = AbstractC2438l.billing(c18656l, c9735l, c9735l2, interfaceC17807lRemoteconfig, c0010l2, c6956l2, i10);
                    c6956l2.startapp(false);
                } else {
                    c10086l = c10086l2;
                }
                z13 = true;
                objM2132native2 = c6956l.m2132native();
                if (z13) {
                    objM2132native2 = AbstractC8020l.mopub(new C17648l(c18656l, 8));
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = AbstractC8020l.mopub(new C17648l(c18656l, 8));
                    c6956l.m2147try(objM2132native2);
                }
                enumC7278l = (EnumC7278l) ((InterfaceC12244l) objM2132native2).getValue();
                c6956l.m2123default(-759924327);
                if (iArr[enumC7278l.ordinal()] == 1) {
                    j2 = jCrashlytics;
                } else {
                    j2 = jCrashlytics2;
                }
                c6956l.startapp(false);
                C9735l c9735l3 = new C9735l(j2);
                if (i9 <= 4) {
                }
                objM2132native3 = c6956l.m2132native();
                if (z14) {
                    objM2132native3 = AbstractC8020l.mopub(new C17648l(c18656l, 9));
                    c6956l.m2147try(objM2132native3);
                } else {
                    objM2132native3 = AbstractC8020l.mopub(new C17648l(c18656l, 9));
                    c6956l.m2147try(objM2132native3);
                }
                c6956l.m2123default(1730286052);
                c6956l.startapp(false);
                int i11 = i8 | 196608;
                c11192l = c11192l2;
                z5 = false;
                c6956l2 = c6956l;
                c5689l = c5689l2;
                c9459lBilling = AbstractC2438l.billing(c18656l, c9735l, c9735l3, interfaceC17807lRemoteconfig, c0010l2, c6956l2, i11);
                c6956l2.startapp(false);
            } else {
                c10086l = c10086l2;
                c11192l = c11192l2;
                c5689l = c5689l2;
                z5 = false;
                i2 = 14;
                c6956l2 = c6956l;
                c6956l2.m2123default(-601031335);
                c6956l2.startapp(false);
                c9459lBilling = null;
            }
            InterfaceC17807l interfaceC17807lRemoteconfig2 = C17423l.remoteconfig(c6956l2, 5);
            int i12 = ((i5 >> 18) & 14) | 384;
            c6956l2.m2123default(1139343725);
            c6956l2.startapp(z5);
            AbstractC11833l abstractC11833lBilling2 = C9735l.billing(j);
            boolean zBilling2 = c6956l2.billing(abstractC11833lBilling2);
            Object objM2132native6 = c6956l2.m2132native();
            if (zBilling2 || objM2132native6 == c13863l) {
                C0010l c0010l3 = new C0010l(c11192l, new C3006l(10, abstractC11833lBilling2));
                c6956l2.m2147try(c0010l3);
                objM2132native6 = c0010l3;
            }
            C0010l c0010l4 = (C0010l) objM2132native6;
            int i13 = (i12 & 14) | 3072;
            if (c18656l.mopub()) {
                i13 = i13;
                z6 = false;
                objMopub = AbstractC11043l.mopub(c6956l2, 1666827533, false, c18656l);
            } else {
                c6956l2.m2123default(1666573488);
                boolean z16 = (((i13 & 14) ^ 6) > 4 && c6956l2.billing(c18656l)) || (i13 & 6) == 4;
                objMopub = c6956l2.m2132native();
                if (z16 || objMopub == c13863l) {
                    AbstractC18620l abstractC18620lBilling2 = AbstractC7572l.billing();
                    Function1 function1Purchase2 = abstractC18620lBilling2 != null ? abstractC18620lBilling2.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                    try {
                        Object objCrashlytics2 = c18656l.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        c6956l2.m2147try(objCrashlytics2);
                        objMopub = objCrashlytics2;
                    } catch (Throwable th2) {
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        throw th2;
                    }
                }
                z6 = false;
                c6956l2.startapp(false);
            }
            c6956l2.m2123default(1139343725);
            c6956l2.startapp(z6);
            C9459l c9459l3 = c9459lBilling;
            C9735l c9735l4 = new C9735l(j);
            int i14 = i13 & 14;
            int i15 = i14 ^ 6;
            if (i15 <= 4 || !c6956l2.billing(c18656l)) {
                c9459l = c9459l3;
                if ((i13 & 6) != 4) {
                    z7 = false;
                }
                Object objM2132native7 = c6956l2.m2132native();
                if (!z7 || objM2132native7 == c13863l) {
                    i3 = 4;
                    objMopub2 = AbstractC8020l.mopub(new C17648l(c18656l, i3));
                    c6956l2.m2147try(objMopub2);
                } else {
                    objMopub2 = objM2132native7;
                    i3 = 4;
                }
                c6956l2.m2123default(1139343725);
                c6956l2.startapp(false);
                C9735l c9735l5 = new C9735l(j);
                z8 = (i15 <= i3 && c6956l2.billing(c18656l)) || (i13 & 6) == i3;
                objM2132native = c6956l2.m2132native();
                if (z8 || objM2132native == c13863l) {
                    objM2132native = AbstractC8020l.mopub(new C17648l(c18656l, 5));
                    c6956l2.m2147try(objM2132native);
                }
                c6956l2.m2123default(-1207102280);
                c6956l2.startapp(false);
                c9459l2 = c9459l;
                C9459l c9459lBilling2 = AbstractC2438l.billing(c18656l, c9735l4, c9735l5, interfaceC17807lRemoteconfig2, c0010l4, c6956l2, i14 | 196608);
                if (interfaceC12244l != null) {
                    fFloatValue = ((Number) interfaceC12244l.getValue()).floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                C14264l c14264l = c11090l2.yandex;
                C14264l c14264l2 = c11090l.yandex;
                InterfaceC12750l interfaceC12750l3 = AbstractC2828l.amazon;
                interfaceC12750l = c14264l.yandex;
                interfaceC12750l2 = c14264l2.yandex;
                z9 = interfaceC12750l instanceof C16686l;
                c15368l = C15368l.yandex;
                if (!z9 || (interfaceC12750l2 instanceof C16686l)) {
                    c15368l2 = c15368l;
                    if (z9 || !(interfaceC12750l2 instanceof C16686l)) {
                        c16686l = (InterfaceC12750l) AbstractC2828l.loadAd(fFloatValue, interfaceC12750l, interfaceC12750l2);
                    } else {
                        C16686l c16686l2 = (C16686l) interfaceC12750l;
                        C16686l c16686l3 = (C16686l) interfaceC12750l2;
                        AbstractC9544l abstractC9544l = (AbstractC9544l) AbstractC2828l.loadAd(fFloatValue, c16686l2.yandex, c16686l3.yandex);
                        float fFirebase = AbstractC7572l.firebase(c16686l2.loadAd, c16686l3.loadAd, fFloatValue);
                        if (abstractC9544l == null) {
                            c16686l = c15368l2;
                        } else if (abstractC9544l instanceof C8990l) {
                            long jAmazon = AbstractC2069l.amazon(fFirebase, ((C8990l) abstractC9544l).yandex);
                            if (jAmazon != 16) {
                                c16686l = new C8245l(jAmazon);
                            } else {
                                c16686l = c15368l2;
                            }
                        } else {
                            if (!(abstractC9544l instanceof AbstractC17404l)) {
                                C18725l.billing();
                                return;
                            }
                            c16686l = new C16686l((AbstractC17404l) abstractC9544l, fFirebase);
                        }
                    }
                } else {
                    c15368l2 = c15368l;
                    long jRemoteconfig = AbstractC12953l.remoteconfig(interfaceC12750l.loadAd(), interfaceC12750l2.loadAd(), fFloatValue);
                    if (jRemoteconfig != 16) {
                        c16686l = new C8245l(jRemoteconfig);
                    } else {
                        c16686l = c15368l2;
                    }
                }
                InterfaceC12750l interfaceC12750l4 = c16686l;
                AbstractC17569l abstractC17569l = (AbstractC17569l) AbstractC2828l.loadAd(fFloatValue, c14264l.billing, c14264l2.billing);
                long jCrashlytics3 = AbstractC2828l.crashlytics(c14264l.loadAd, c14264l2.loadAd, fFloatValue);
                c6886l = c14264l.crashlytics;
                if (c6886l == null) {
                    c6886l = C6886l.f14425l;
                }
                c6886l2 = c14264l2.crashlytics;
                if (c6886l2 == null) {
                    c6886l2 = C6886l.f14425l;
                }
                C6886l c6886l3 = new C6886l(AbstractC8576l.purchase(AbstractC7572l.smaato(c6886l.f14426l, fFloatValue, c6886l2.f14426l), 1, 1000));
                C11617l c11617l = (C11617l) AbstractC2828l.loadAd(fFloatValue, c14264l.amazon, c14264l2.amazon);
                C8689l c8689l = (C8689l) AbstractC2828l.loadAd(fFloatValue, c14264l.purchase, c14264l2.purchase);
                String str = (String) AbstractC2828l.loadAd(fFloatValue, c14264l.mopub, c14264l2.mopub);
                long jCrashlytics4 = AbstractC2828l.crashlytics(c14264l.admob, c14264l2.admob, fFloatValue);
                c10524l = c14264l.subs;
                if (c10524l != null) {
                    f = c10524l.yandex;
                } else {
                    f = 0.0f;
                }
                c10524l2 = c14264l2.subs;
                if (c10524l2 != null) {
                    f2 = c10524l2.yandex;
                } else {
                    f2 = 0.0f;
                }
                float fFirebase2 = AbstractC7572l.firebase(f, f2, fFloatValue);
                c16810l = c14264l.isPro;
                c16810l2 = C16810l.crashlytics;
                if (c16810l == null) {
                    c16810l = c16810l2;
                }
                c16810l3 = c14264l2.isPro;
                if (c16810l3 != null) {
                    c16810l2 = c16810l3;
                }
                c16810l4 = new C16810l(AbstractC7572l.firebase(c16810l.yandex, c16810l2.yandex, fFloatValue), AbstractC7572l.firebase(c16810l.loadAd, c16810l2.loadAd, fFloatValue));
                C10537l c10537l = (C10537l) AbstractC2828l.loadAd(fFloatValue, c14264l.firebase, c14264l2.firebase);
                long jRemoteconfig2 = AbstractC12953l.remoteconfig(c14264l.smaato, c14264l2.smaato, fFloatValue);
                C9867l c9867l = (C9867l) AbstractC2828l.loadAd(fFloatValue, c14264l.remoteconfig, c14264l2.remoteconfig);
                c0387l = c14264l.vip;
                c0387l2 = c14264l2.vip;
                if (c0387l != null && c0387l2 == null) {
                    c16810l4 = c16810l4;
                    c0387lPurchase2 = null;
                } else if (c0387l == null) {
                    c0387lPurchase2 = C9552l.purchase(new C0387l(C9735l.loadAd(0.0f, c0387l2.yandex), c0387l2.loadAd, c0387l2.crashlytics), c0387l2, fFloatValue);
                    c16810l4 = c16810l4;
                } else {
                    if (c0387l2 == null) {
                        c0387lPurchase = C9552l.purchase(c0387l, new C0387l(C9735l.loadAd(0.0f, c0387l.yandex), c0387l.loadAd, c0387l.crashlytics), fFloatValue);
                    } else {
                        c0387lPurchase = C9552l.purchase(c0387l, c0387l2, fFloatValue);
                    }
                    c0387lPurchase2 = c0387lPurchase;
                }
                c1354l = c14264l.metrica;
                C1354l c1354l3 = c14264l2.metrica;
                if (c1354l == null || c1354l3 != null) {
                    if (c1354l == null) {
                        c1354l = C1354l.yandex;
                    }
                    c1354l2 = c1354l;
                } else {
                    c1354l2 = null;
                }
                C14264l c14264l3 = new C14264l(interfaceC12750l4, jCrashlytics3, c6886l3, c11617l, c8689l, abstractC17569l, str, jCrashlytics4, new C10524l(fFirebase2), c16810l4, c10537l, jRemoteconfig2, c9867l, c0387lPurchase2, c1354l2, (AbstractC3239l) AbstractC2828l.loadAd(fFloatValue, c14264l.startapp, c14264l2.startapp));
                C9077l c9077l = c11090l2.loadAd;
                C9077l c9077l2 = c11090l.loadAd;
                int i16 = AbstractC6992l.loadAd;
                int i17 = ((C10258l) AbstractC2828l.loadAd(fFloatValue, new C10258l(c9077l.yandex), new C10258l(c9077l2.yandex))).yandex;
                int i18 = ((C16546l) AbstractC2828l.loadAd(fFloatValue, new C16546l(c9077l.loadAd), new C16546l(c9077l2.loadAd))).yandex;
                long jCrashlytics5 = AbstractC2828l.crashlytics(c9077l.crashlytics, c9077l2.crashlytics, fFloatValue);
                c13299l = c9077l.amazon;
                if (c13299l == null) {
                    c13299l = C13299l.crashlytics;
                }
                c13299l2 = c9077l2.amazon;
                if (c13299l2 == null) {
                    c13299l2 = C13299l.crashlytics;
                }
                C13299l c13299l3 = new C13299l(AbstractC2828l.crashlytics(c13299l.yandex, c13299l2.yandex, fFloatValue), AbstractC2828l.crashlytics(c13299l.loadAd, c13299l2.loadAd, fFloatValue));
                c4361l = c9077l.purchase;
                c4361l2 = c9077l2.purchase;
                if (c4361l == null || c4361l2 != null) {
                    c4361l3 = C4361l.crashlytics;
                    if (c4361l == null) {
                        c4361l = c4361l3;
                    }
                    z10 = c4361l.yandex;
                    if (c4361l2 == null) {
                        c4361l2 = c4361l3;
                    }
                    z11 = c4361l2.yandex;
                    if (z10 == z11) {
                        c4361l4 = c4361l;
                    } else {
                        c4361l4 = new C4361l(((C8405l) AbstractC2828l.loadAd(fFloatValue, new C8405l(c4361l.loadAd), new C8405l(c4361l2.loadAd))).yandex, ((Boolean) AbstractC2828l.loadAd(fFloatValue, Boolean.valueOf(z10), Boolean.valueOf(z11))).booleanValue());
                    }
                } else {
                    c4361l4 = null;
                }
                c11090l3 = new C11090l(c14264l3, new C9077l(i17, i18, jCrashlytics5, c13299l3, c4361l4, (C3183l) AbstractC2828l.loadAd(fFloatValue, c9077l.billing, c9077l2.billing), ((C17427l) AbstractC2828l.loadAd(fFloatValue, new C17427l(c9077l.mopub), new C17427l(c9077l2.mopub))).yandex, ((C0106l) AbstractC2828l.loadAd(fFloatValue, new C0106l(c9077l.admob), new C0106l(c9077l2.admob))).yandex, (C10068l) AbstractC2828l.loadAd(fFloatValue, c9077l.subs, c9077l2.subs)));
                if (z4) {
                    c11090lYandex = C11090l.yandex(c11090l3, ((C9735l) c9459l2.f19321l.getValue()).yandex, 0L, null, null, 0L, 0L, null, null, 16777214);
                } else {
                    c11090lYandex = c11090l3;
                }
                function4 = function3;
                purchase(((C9735l) c9459lBilling2.f19321l.getValue()).yandex, c11090lYandex, AbstractC14566l.amazon(57043598, new C2736l(function4, c5689l, i2), c6956l), c6956l, 384);
            } else {
                c9459l = c9459l3;
            }
            z7 = true;
            Object objM2132native8 = c6956l2.m2132native();
            if (z7) {
                i3 = 4;
                objMopub2 = AbstractC8020l.mopub(new C17648l(c18656l, i3));
                c6956l2.m2147try(objMopub2);
            } else {
                i3 = 4;
                objMopub2 = AbstractC8020l.mopub(new C17648l(c18656l, i3));
                c6956l2.m2147try(objMopub2);
            }
            c6956l2.m2123default(1139343725);
            c6956l2.startapp(false);
            C9735l c9735l6 = new C9735l(j);
            if (i15 <= i3) {
            }
            objM2132native = c6956l2.m2132native();
            if (z8) {
                objM2132native = AbstractC8020l.mopub(new C17648l(c18656l, 5));
                c6956l2.m2147try(objM2132native);
            } else {
                objM2132native = AbstractC8020l.mopub(new C17648l(c18656l, 5));
                c6956l2.m2147try(objM2132native);
            }
            c6956l2.m2123default(-1207102280);
            c6956l2.startapp(false);
            c9459l2 = c9459l;
            C9459l c9459lBilling3 = AbstractC2438l.billing(c18656l, c9735l4, c9735l6, interfaceC17807lRemoteconfig2, c0010l4, c6956l2, i14 | 196608);
            if (interfaceC12244l != null) {
                fFloatValue = ((Number) interfaceC12244l.getValue()).floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C14264l c14264l4 = c11090l2.yandex;
            C14264l c14264l5 = c11090l.yandex;
            InterfaceC12750l interfaceC12750l5 = AbstractC2828l.amazon;
            interfaceC12750l = c14264l4.yandex;
            interfaceC12750l2 = c14264l5.yandex;
            z9 = interfaceC12750l instanceof C16686l;
            c15368l = C15368l.yandex;
            if (z9) {
                c15368l2 = c15368l;
                if (z9) {
                    c16686l = (InterfaceC12750l) AbstractC2828l.loadAd(fFloatValue, interfaceC12750l, interfaceC12750l2);
                } else {
                    c16686l = (InterfaceC12750l) AbstractC2828l.loadAd(fFloatValue, interfaceC12750l, interfaceC12750l2);
                }
            } else {
                c15368l2 = c15368l;
                if (z9) {
                    c16686l = (InterfaceC12750l) AbstractC2828l.loadAd(fFloatValue, interfaceC12750l, interfaceC12750l2);
                } else {
                    c16686l = (InterfaceC12750l) AbstractC2828l.loadAd(fFloatValue, interfaceC12750l, interfaceC12750l2);
                }
            }
            InterfaceC12750l interfaceC12750l6 = c16686l;
            AbstractC17569l abstractC17569l2 = (AbstractC17569l) AbstractC2828l.loadAd(fFloatValue, c14264l4.billing, c14264l5.billing);
            long jCrashlytics6 = AbstractC2828l.crashlytics(c14264l4.loadAd, c14264l5.loadAd, fFloatValue);
            c6886l = c14264l4.crashlytics;
            if (c6886l == null) {
                c6886l = C6886l.f14425l;
            }
            c6886l2 = c14264l5.crashlytics;
            if (c6886l2 == null) {
                c6886l2 = C6886l.f14425l;
            }
            C6886l c6886l4 = new C6886l(AbstractC8576l.purchase(AbstractC7572l.smaato(c6886l.f14426l, fFloatValue, c6886l2.f14426l), 1, 1000));
            C11617l c11617l2 = (C11617l) AbstractC2828l.loadAd(fFloatValue, c14264l4.amazon, c14264l5.amazon);
            C8689l c8689l2 = (C8689l) AbstractC2828l.loadAd(fFloatValue, c14264l4.purchase, c14264l5.purchase);
            String str2 = (String) AbstractC2828l.loadAd(fFloatValue, c14264l4.mopub, c14264l5.mopub);
            long jCrashlytics7 = AbstractC2828l.crashlytics(c14264l4.admob, c14264l5.admob, fFloatValue);
            c10524l = c14264l4.subs;
            if (c10524l != null) {
                f = c10524l.yandex;
            } else {
                f = 0.0f;
            }
            c10524l2 = c14264l5.subs;
            if (c10524l2 != null) {
                f2 = c10524l2.yandex;
            } else {
                f2 = 0.0f;
            }
            float fFirebase3 = AbstractC7572l.firebase(f, f2, fFloatValue);
            c16810l = c14264l4.isPro;
            c16810l2 = C16810l.crashlytics;
            if (c16810l == null) {
                c16810l = c16810l2;
            }
            c16810l3 = c14264l5.isPro;
            if (c16810l3 != null) {
                c16810l2 = c16810l3;
            }
            c16810l4 = new C16810l(AbstractC7572l.firebase(c16810l.yandex, c16810l2.yandex, fFloatValue), AbstractC7572l.firebase(c16810l.loadAd, c16810l2.loadAd, fFloatValue));
            C10537l c10537l2 = (C10537l) AbstractC2828l.loadAd(fFloatValue, c14264l4.firebase, c14264l5.firebase);
            long jRemoteconfig3 = AbstractC12953l.remoteconfig(c14264l4.smaato, c14264l5.smaato, fFloatValue);
            C9867l c9867l2 = (C9867l) AbstractC2828l.loadAd(fFloatValue, c14264l4.remoteconfig, c14264l5.remoteconfig);
            c0387l = c14264l4.vip;
            c0387l2 = c14264l5.vip;
            if (c0387l != null) {
                if (c0387l == null) {
                    c0387lPurchase2 = C9552l.purchase(new C0387l(C9735l.loadAd(0.0f, c0387l2.yandex), c0387l2.loadAd, c0387l2.crashlytics), c0387l2, fFloatValue);
                    c16810l4 = c16810l4;
                } else {
                    if (c0387l2 == null) {
                        c0387lPurchase = C9552l.purchase(c0387l, new C0387l(C9735l.loadAd(0.0f, c0387l.yandex), c0387l.loadAd, c0387l.crashlytics), fFloatValue);
                    } else {
                        c0387lPurchase = C9552l.purchase(c0387l, c0387l2, fFloatValue);
                    }
                    c0387lPurchase2 = c0387lPurchase;
                }
            } else if (c0387l == null) {
                c0387lPurchase2 = C9552l.purchase(new C0387l(C9735l.loadAd(0.0f, c0387l2.yandex), c0387l2.loadAd, c0387l2.crashlytics), c0387l2, fFloatValue);
                c16810l4 = c16810l4;
            } else {
                if (c0387l2 == null) {
                    c0387lPurchase = C9552l.purchase(c0387l, new C0387l(C9735l.loadAd(0.0f, c0387l.yandex), c0387l.loadAd, c0387l.crashlytics), fFloatValue);
                } else {
                    c0387lPurchase = C9552l.purchase(c0387l, c0387l2, fFloatValue);
                }
                c0387lPurchase2 = c0387lPurchase;
            }
            c1354l = c14264l4.metrica;
            C1354l c1354l4 = c14264l5.metrica;
            if (c1354l == null) {
                if (c1354l == null) {
                    c1354l = C1354l.yandex;
                }
                c1354l2 = c1354l;
            } else {
                if (c1354l == null) {
                    c1354l = C1354l.yandex;
                }
                c1354l2 = c1354l;
            }
            C14264l c14264l6 = new C14264l(interfaceC12750l6, jCrashlytics6, c6886l4, c11617l2, c8689l2, abstractC17569l2, str2, jCrashlytics7, new C10524l(fFirebase3), c16810l4, c10537l2, jRemoteconfig3, c9867l2, c0387lPurchase2, c1354l2, (AbstractC3239l) AbstractC2828l.loadAd(fFloatValue, c14264l4.startapp, c14264l5.startapp));
            C9077l c9077l3 = c11090l2.loadAd;
            C9077l c9077l4 = c11090l.loadAd;
            int i19 = AbstractC6992l.loadAd;
            int i110 = ((C10258l) AbstractC2828l.loadAd(fFloatValue, new C10258l(c9077l3.yandex), new C10258l(c9077l4.yandex))).yandex;
            int i111 = ((C16546l) AbstractC2828l.loadAd(fFloatValue, new C16546l(c9077l3.loadAd), new C16546l(c9077l4.loadAd))).yandex;
            long jCrashlytics8 = AbstractC2828l.crashlytics(c9077l3.crashlytics, c9077l4.crashlytics, fFloatValue);
            c13299l = c9077l3.amazon;
            if (c13299l == null) {
                c13299l = C13299l.crashlytics;
            }
            c13299l2 = c9077l4.amazon;
            if (c13299l2 == null) {
                c13299l2 = C13299l.crashlytics;
            }
            C13299l c13299l4 = new C13299l(AbstractC2828l.crashlytics(c13299l.yandex, c13299l2.yandex, fFloatValue), AbstractC2828l.crashlytics(c13299l.loadAd, c13299l2.loadAd, fFloatValue));
            c4361l = c9077l3.purchase;
            c4361l2 = c9077l4.purchase;
            if (c4361l == null) {
                c4361l3 = C4361l.crashlytics;
                if (c4361l == null) {
                    c4361l = c4361l3;
                }
                z10 = c4361l.yandex;
                if (c4361l2 == null) {
                    c4361l2 = c4361l3;
                }
                z11 = c4361l2.yandex;
                if (z10 == z11) {
                    c4361l4 = c4361l;
                } else {
                    c4361l4 = new C4361l(((C8405l) AbstractC2828l.loadAd(fFloatValue, new C8405l(c4361l.loadAd), new C8405l(c4361l2.loadAd))).yandex, ((Boolean) AbstractC2828l.loadAd(fFloatValue, Boolean.valueOf(z10), Boolean.valueOf(z11))).booleanValue());
                }
            } else {
                c4361l3 = C4361l.crashlytics;
                if (c4361l == null) {
                    c4361l = c4361l3;
                }
                z10 = c4361l.yandex;
                if (c4361l2 == null) {
                    c4361l2 = c4361l3;
                }
                z11 = c4361l2.yandex;
                if (z10 == z11) {
                    c4361l4 = c4361l;
                } else {
                    c4361l4 = new C4361l(((C8405l) AbstractC2828l.loadAd(fFloatValue, new C8405l(c4361l.loadAd), new C8405l(c4361l2.loadAd))).yandex, ((Boolean) AbstractC2828l.loadAd(fFloatValue, Boolean.valueOf(z10), Boolean.valueOf(z11))).booleanValue());
                }
            }
            c11090l3 = new C11090l(c14264l6, new C9077l(i110, i111, jCrashlytics8, c13299l4, c4361l4, (C3183l) AbstractC2828l.loadAd(fFloatValue, c9077l3.billing, c9077l4.billing), ((C17427l) AbstractC2828l.loadAd(fFloatValue, new C17427l(c9077l3.mopub), new C17427l(c9077l4.mopub))).yandex, ((C0106l) AbstractC2828l.loadAd(fFloatValue, new C0106l(c9077l3.admob), new C0106l(c9077l4.admob))).yandex, (C10068l) AbstractC2828l.loadAd(fFloatValue, c9077l3.subs, c9077l4.subs)));
            if (z4) {
                c11090lYandex = C11090l.yandex(c11090l3, ((C9735l) c9459l2.f19321l.getValue()).yandex, 0L, null, null, 0L, 0L, null, null, 16777214);
            } else {
                c11090lYandex = c11090l3;
            }
            function4 = function3;
            purchase(((C9735l) c9459lBilling3.f19321l.getValue()).yandex, c11090lYandex, AbstractC14566l.amazon(57043598, new C2736l(function4, c5689l, i2), c6956l), c6956l, 384);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8845l(interfaceC12244l, c1351l, z, z2, z3, z4, c18656l, c11090l, c11090l2, function4, i);
        }
    }

    public static final void billing(long j, Function2 function2, C6956l c6956l, int i) {
        c6956l.m2133new(590397809);
        int i2 = (c6956l.purchase(j) ? 4 : 2) | i | (c6956l.admob(function2) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC10478l.yandex(AbstractC5020l.startapp(j, AbstractC12502l.yandex), function2, c6956l, (i2 & 112) | 8);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15626l(j, function2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:262:0x0571  */
    /* JADX WARN: Code duplicated, block: B:264:0x0575  */
    /* JADX WARN: Code duplicated, block: B:267:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:268:0x05b7  */
    public static final void crashlytics(final Function2 function2, final Function3 function3, final Function2 function4, final Function2 function5, final Function2 function6, Function2 function7, final Function2 function8, final boolean z, final AbstractC17824l abstractC17824l, final C10643l c10643l, final C10643l c10643l2, final C10643l c10643l3, final Function1 function1, final C15578l c15578l, Function2 function9, InterfaceC11780l interfaceC11780l, C6956l c6956l, final int i, final int i2) {
        int i3;
        int i4;
        Function2 function10;
        InterfaceC11780l interfaceC11780l2;
        C6956l c6956l2;
        float f;
        Object c16940l;
        C14855l c14855l;
        char c;
        boolean z2;
        C14855l c14855l2;
        InterfaceC17242l interfaceC17242l;
        Function2 function11;
        boolean z3;
        C10643l c10643l4;
        boolean z4;
        Object objM2132native;
        final Function2 function12 = function7;
        C14855l c14855l3 = C18450l.f36026l;
        c6956l.m2133new(-1572199315);
        int i5 = i & 6;
        C4346l c4346l = C4346l.f8873l;
        if (i5 == 0) {
            i3 = i | (c6956l.billing(c4346l) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.admob(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.admob(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c6956l.admob(function4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c6956l.admob(function5) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c6956l.admob(function6) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c6956l.admob(function12) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c6956l.admob(function8) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c6956l.mopub(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c6956l.billing(abstractC17824l) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? c6956l.billing(c10643l) : c6956l.admob(c10643l) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? c6956l.billing(c10643l2) : c6956l.admob(c10643l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c6956l.billing(c10643l3) : c6956l.admob(c10643l3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c6956l.admob(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c6956l.admob(c15578l) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= c6956l.admob(function9) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= c6956l.billing(interfaceC11780l) ? 1048576 : 524288;
        }
        int i6 = i4;
        if (c6956l.m2127for(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
            float fAd = ad(c6956l);
            int i7 = i6 & 14;
            boolean zCrashlytics = ((i6 & 7168) == 2048) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && c6956l.billing(c10643l))) | ((i6 & 112) == 32 || ((i6 & 64) != 0 && c6956l.billing(c10643l2))) | ((i6 & 896) == 256 || ((i6 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 && c6956l.billing(c10643l3))) | ((3670016 & i6) == 1048576) | c6956l.crashlytics(fAd);
            Object objM2132native2 = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zCrashlytics || objM2132native2 == c13863l) {
                f = fAd;
                c6956l2 = c6956l;
                c14855l = c14855l3;
                c = ' ';
                interfaceC11780l2 = interfaceC11780l;
                c16940l = new C16940l(function1, z, abstractC17824l, c10643l, c10643l2, c10643l3, interfaceC11780l2, f);
                c6956l2.m2147try(c16940l);
            } else {
                c6956l2 = c6956l;
                c14855l = c14855l3;
                c = ' ';
                interfaceC11780l2 = interfaceC11780l;
                f = fAd;
                c16940l = objM2132native2;
            }
            C16940l c16940l2 = (C16940l) c16940l;
            EnumC9931l enumC9931l = (EnumC9931l) c6956l2.isPro(AbstractC4751l.vip);
            long j = c6956l2.f14595continue;
            int i8 = (int) (j ^ (j >>> c));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c16940l2, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i8);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            c15578l.invoke(c6956l2, Integer.valueOf((i6 >> 12) & 14));
            C18158l c18158l = C18158l.f35556l;
            if (function5 != null) {
                c6956l2.m2123default(1051742060);
                InterfaceC17242l interfaceC17242lPremium = AbstractC14312l.isPro(c4346l, "Leading").premium(c18158l);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                long j2 = c6956l2.f14595continue;
                int i9 = (int) (j2 ^ (j2 >>> c));
                InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium);
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                AbstractC11043l.isPro(i9, c6956l2, c6415l3, c6956l2, c11192l);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                function5.invoke(c6956l2, Integer.valueOf((i3 >> 12) & 14));
                c6956l2.startapp(true);
                z2 = false;
                c6956l2.startapp(false);
            } else {
                z2 = false;
                c6956l2.m2123default(1051988076);
                c6956l2.startapp(false);
            }
            if (function6 != null) {
                c6956l2.m2123default(1052030794);
                InterfaceC17242l interfaceC17242lPremium2 = AbstractC14312l.isPro(c4346l, "Trailing").premium(c18158l);
                InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, z2);
                long j3 = c6956l2.f14595continue;
                int i10 = (int) (j3 ^ (j3 >>> c));
                InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium2);
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                AbstractC11043l.isPro(i10, c6956l2, c6415l3, c6956l2, c11192l);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                function6.invoke(c6956l2, Integer.valueOf((i3 >> 15) & 14));
                c6956l2.startapp(true);
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(1052278732);
                c6956l2.startapp(z2);
            }
            float fBilling = AbstractC3605l.billing(interfaceC11780l2, enumC9931l);
            float fPurchase = AbstractC3605l.purchase(interfaceC11780l2, enumC9931l);
            if (function5 != null) {
                fBilling -= f;
                if (fBilling < 0.0f) {
                    fBilling = 0.0f;
                }
            }
            float f2 = fBilling;
            if (function6 != null) {
                fPurchase -= f;
                if (fPurchase < 0.0f) {
                    fPurchase = 0.0f;
                }
            }
            if (function7 != null) {
                c6956l2.m2123default(1052982711);
                interfaceC17242l = c4346l;
                InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC0080l.startapp(AbstractC0080l.mopub(AbstractC14312l.isPro(interfaceC17242l, "Prefix"), 24.0f, 0.0f, 2)), f2, 0.0f, 2.0f, 0.0f, 10);
                c14855l2 = c14855l;
                InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(c14855l2, false);
                long j4 = c6956l2.f14595continue;
                int i11 = (int) (j4 ^ (j4 >>> c));
                InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon3, c6415l);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l2);
                AbstractC11043l.isPro(i11, c6956l2, c6415l3, c6956l2, c11192l);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l4);
                function12 = function7;
                function12.invoke(c6956l2, Integer.valueOf((i3 >> 18) & 14));
                c6956l2.startapp(true);
                c6956l2.startapp(false);
            } else {
                function12 = function7;
                c14855l2 = c14855l;
                interfaceC17242l = c4346l;
                c6956l2.m2123default(1053310412);
                c6956l2.startapp(false);
            }
            if (function8 != null) {
                c6956l2.m2123default(1053353657);
                InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(AbstractC0080l.startapp(AbstractC0080l.mopub(AbstractC14312l.isPro(interfaceC17242l, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, fPurchase, 0.0f, 10);
                InterfaceC10835l interfaceC10835lAmazon4 = AbstractC9383l.amazon(c14855l2, false);
                long j5 = c6956l2.f14595continue;
                int i12 = (int) (j5 ^ (j5 >>> c));
                InterfaceC18556l interfaceC18556lSmaato5 = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp2);
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon4, c6415l);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato5, c6415l2);
                AbstractC11043l.isPro(i12, c6956l2, c6415l3, c6956l2, c11192l);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling5, c6415l4);
                function11 = function8;
                function11.invoke(c6956l2, Integer.valueOf((i3 >> 21) & 14));
                c6956l2.startapp(true);
                c6956l2.startapp(false);
            } else {
                function11 = function8;
                c6956l2.m2123default(1053679436);
                c6956l2.startapp(false);
            }
            InterfaceC17242l interfaceC17242lStartapp3 = AbstractC3605l.startapp(AbstractC0080l.startapp(AbstractC0080l.mopub(interfaceC17242l, 24.0f, 0.0f, 2)), function12 == null ? f2 : 0.0f, 0.0f, function11 == null ? fPurchase : 0.0f, 0.0f, 10);
            if (function3 != null) {
                c6956l2.m2123default(1054049421);
                function3.invoke(AbstractC14312l.isPro(interfaceC17242l, "Hint").premium(interfaceC17242lStartapp3), c6956l2, Integer.valueOf((i3 >> 3) & 112));
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(1054140716);
                c6956l2.startapp(false);
            }
            InterfaceC17242l interfaceC17242lPremium3 = AbstractC14312l.isPro(interfaceC17242l, "TextField").premium(interfaceC17242lStartapp3);
            InterfaceC10835l interfaceC10835lAmazon5 = AbstractC9383l.amazon(c14855l2, true);
            long j6 = c6956l2.f14595continue;
            int i13 = (int) (j6 ^ (j6 >>> c));
            InterfaceC18556l interfaceC18556lSmaato6 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium3);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon5, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato6, c6415l2);
            AbstractC11043l.isPro(i13, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling6, c6415l4);
            function2.invoke(c6956l2, Integer.valueOf((i3 >> 3) & 14));
            c6956l2.startapp(true);
            if (function4 != null) {
                c6956l2.m2123default(1054793359);
                if (i7 != 4) {
                    if ((i6 & 8) != 0) {
                        c10643l4 = c10643l;
                        if (c6956l2.admob(c10643l4)) {
                        }
                        objM2132native = c6956l2.m2132native();
                        if (z4 || objM2132native == c13863l) {
                            objM2132native = new C18629l(c10643l4, 1);
                            c6956l2.m2147try(objM2132native);
                        }
                        InterfaceC17242l interfaceC17242lPremium4 = AbstractC14312l.isPro(AbstractC0080l.startapp(AbstractC13095l.m3537else(interfaceC17242l, new C9680l(2, (Function0) objM2132native))), "Label").premium(interfaceC17242l);
                        InterfaceC10835l interfaceC10835lAmazon6 = AbstractC9383l.amazon(c14855l2, false);
                        long j7 = c6956l2.f14595continue;
                        int i14 = (int) (j7 ^ (j7 >>> c));
                        InterfaceC18556l interfaceC18556lSmaato7 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium4);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon6, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato7, c6415l2);
                        AbstractC11043l.isPro(i14, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling7, c6415l4);
                        function4.invoke(c6956l2, Integer.valueOf((i3 >> 9) & 14));
                        c6956l2.startapp(true);
                        c6956l2.startapp(false);
                    } else {
                        c10643l4 = c10643l;
                    }
                    z4 = false;
                    objM2132native = c6956l2.m2132native();
                    if (z4) {
                        objM2132native = new C18629l(c10643l4, 1);
                        c6956l2.m2147try(objM2132native);
                    } else {
                        objM2132native = new C18629l(c10643l4, 1);
                        c6956l2.m2147try(objM2132native);
                    }
                    InterfaceC17242l interfaceC17242lPremium5 = AbstractC14312l.isPro(AbstractC0080l.startapp(AbstractC13095l.m3537else(interfaceC17242l, new C9680l(2, (Function0) objM2132native))), "Label").premium(interfaceC17242l);
                    InterfaceC10835l interfaceC10835lAmazon7 = AbstractC9383l.amazon(c14855l2, false);
                    long j8 = c6956l2.f14595continue;
                    int i15 = (int) (j8 ^ (j8 >>> c));
                    InterfaceC18556l interfaceC18556lSmaato8 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium5);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon7, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato8, c6415l2);
                    AbstractC11043l.isPro(i15, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling8, c6415l4);
                    function4.invoke(c6956l2, Integer.valueOf((i3 >> 9) & 14));
                    c6956l2.startapp(true);
                    c6956l2.startapp(false);
                } else {
                    c10643l4 = c10643l;
                }
                z4 = true;
                objM2132native = c6956l2.m2132native();
                if (z4) {
                    objM2132native = new C18629l(c10643l4, 1);
                    c6956l2.m2147try(objM2132native);
                } else {
                    objM2132native = new C18629l(c10643l4, 1);
                    c6956l2.m2147try(objM2132native);
                }
                InterfaceC17242l interfaceC17242lPremium6 = AbstractC14312l.isPro(AbstractC0080l.startapp(AbstractC13095l.m3537else(interfaceC17242l, new C9680l(2, (Function0) objM2132native))), "Label").premium(interfaceC17242l);
                InterfaceC10835l interfaceC10835lAmazon8 = AbstractC9383l.amazon(c14855l2, false);
                long j9 = c6956l2.f14595continue;
                int i16 = (int) (j9 ^ (j9 >>> c));
                InterfaceC18556l interfaceC18556lSmaato9 = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling9 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium6);
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon8, c6415l);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato9, c6415l2);
                AbstractC11043l.isPro(i16, c6956l2, c6415l3, c6956l2, c11192l);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling9, c6415l4);
                function4.invoke(c6956l2, Integer.valueOf((i3 >> 9) & 14));
                c6956l2.startapp(true);
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(1055190252);
                c6956l2.startapp(false);
            }
            if (function9 != null) {
                c6956l2.m2123default(1055238767);
                InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.startapp(AbstractC0080l.mopub(AbstractC14312l.isPro(interfaceC17242l, "Supporting"), 16.0f, 0.0f, 2)), new C17253l(16.0f, 4.0f, 16.0f, 0.0f));
                InterfaceC10835l interfaceC10835lAmazon9 = AbstractC9383l.amazon(c14855l2, false);
                long j10 = c6956l2.f14595continue;
                int i17 = (int) (j10 ^ (j10 >>> c));
                InterfaceC18556l interfaceC18556lSmaato10 = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling10 = AbstractC17541l.billing(c6956l2, interfaceC17242lFirebase);
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon9, c6415l);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato10, c6415l2);
                AbstractC11043l.isPro(i17, c6956l2, c6415l3, c6956l2, c11192l);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling10, c6415l4);
                function10 = function9;
                function10.invoke(c6956l2, Integer.valueOf((i6 >> 15) & 14));
                z3 = true;
                c6956l2.startapp(true);
                c6956l2.startapp(false);
            } else {
                function10 = function9;
                z3 = true;
                c6956l2.m2123default(1055574156);
                c6956l2.startapp(false);
            }
            c6956l2.startapp(z3);
        } else {
            function10 = function9;
            interfaceC11780l2 = interfaceC11780l;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            final InterfaceC11780l interfaceC11780l3 = interfaceC11780l2;
            final Function2 function13 = function10;
            c4224lAds.amazon = new Function2() { // from class: lٍؒۜ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    AbstractC15042l.crashlytics(function2, function3, function4, function5, function6, function12, function8, z, abstractC17824l, c10643l, c10643l2, c10643l3, function1, c15578l, function13, interfaceC11780l3, (C6956l) obj, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void firebase(AbstractC18643l abstractC18643l, InterfaceC6347l interfaceC6347l, boolean z, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(978949037);
        int i2 = (c6956l.billing(abstractC18643l) ? 4 : 2) | i | (c6956l.billing(interfaceC6347l) ? 32 : 16) | (c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            AbstractC11308l.yandex(AbstractC3605l.smaato(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f), C18450l.f36043l, AbstractC14566l.amazon(1895909763, new C2346l(abstractC18643l, interfaceC17242l, interfaceC6347l, z, 0), c6956l), c6956l, 3126, 4);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(abstractC18643l, interfaceC6347l, z, interfaceC17242l, i, 6);
        }
    }

    public static final void isPro(C10507l c10507l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        AbstractC18643l abstractC18643l;
        c6956l.m2133new(2125910541);
        int i2 = (c6956l.billing(c10507l) ? 4 : 2) | i | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = Boolean.valueOf((c10507l == null || (abstractC18643l = c10507l.loadAd) == null || !AbstractC1214l.loadAd(abstractC18643l)) ? false : true);
                c6956l.m2147try(objM2132native);
            }
            boolean zBooleanValue = ((Boolean) objM2132native).booleanValue();
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j = c6956l.f14595continue;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            subs(c10507l != null ? c10507l.loadAd : null, zBooleanValue ? AbstractC4927l.amazon(interfaceC17242l, C9735l.purchase, AbstractC16837l.yandex) : interfaceC17242l, c6956l, 0);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(c10507l, interfaceC17242l, i, 13);
        }
    }

    public static final C6906l isVip() {
        Float fValueOf = Float.valueOf(0.0f);
        long j = C9735l.isPro;
        C8195l c8195l = new C8195l(fValueOf, new C9735l(j));
        Float fValueOf2 = Float.valueOf(0.06f);
        long j2 = C9735l.loadAd;
        return C1083l.pro(new C8195l[]{c8195l, new C8195l(fValueOf2, new C9735l(j2)), new C8195l(Float.valueOf(0.9f), new C9735l(j2)), new C8195l(Float.valueOf(1.0f), new C9735l(j))});
    }

    public static final float license(C6956l c6956l) {
        long j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.smaato.loadAd.crashlytics;
        long j2 = AbstractC18138l.smaato;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).inmobi(j) / 2.0f;
    }

    /* JADX WARN: Code duplicated, block: B:248:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:267:0x040d  */
    public static final void loadAd(final CharSequence charSequence, final Function2 function2, final AbstractC17824l abstractC17824l, final Function3 function3, final Function2 function4, final Function2 function5, final Function2 function6, final Function2 function7, final Function2 function8, final boolean z, final boolean z2, final boolean z3, final C2403l c2403l, final InterfaceC11780l interfaceC11780l, final C1351l c1351l, final C15578l c15578l, C6956l c6956l, final int i, final int i2) {
        int i3;
        int i4;
        C6956l c6956l2;
        EnumC7278l enumC7278l;
        C18656l c18656l;
        C9459l c9459lBilling;
        boolean z4;
        C9459l c9459lBilling2;
        Object objMopub;
        float f;
        int i5;
        C18656l c18656l2;
        C9459l c9459lBilling3;
        C6956l c6956l3;
        C9459l c9459l;
        boolean z5;
        C9459l c9459l2;
        C1351l c1351l2;
        C15578l c15578l2;
        long j;
        C15578l c15578l3;
        long j2;
        C9459l c9459l3;
        C15578l c15578l4;
        long j3;
        C15578l c15578l5;
        long j4;
        C15578l c15578l6;
        long j5;
        C15578l c15578l7;
        char c;
        Object objMopub2;
        float f2;
        Object objMopub3;
        float f3;
        Object objMopub4;
        float f4;
        float f5;
        Object objMopub5;
        C7472l c7472l = C7472l.f15463l;
        C0010l c0010l = AbstractC3483l.purchase;
        c6956l.m2133new(-1478429597);
        if ((i & 6) == 0) {
            i3 = i | (c6956l.admob(charSequence) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.admob(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.billing(abstractC17824l) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c6956l.admob(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c6956l.admob(function4) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c6956l.admob(function5) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c6956l.admob(function6) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c6956l.admob(function7) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c6956l.admob(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= c6956l.admob(function8) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (c6956l.mopub(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c6956l.mopub(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c6956l.mopub(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c6956l.billing(c2403l) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c6956l.billing(interfaceC11780l) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= c6956l.billing(c1351l) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= c6956l.admob(c15578l) ? 1048576 : 524288;
        }
        int i7 = i4;
        if (c6956l.m2127for(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 599187) == 599186) ? false : true)) {
            boolean zBooleanValue = ((Boolean) AbstractC8317l.loadAd(c2403l, c6956l, (i7 >> 9) & 14).getValue()).booleanValue();
            EnumC7278l enumC7278l2 = EnumC7278l.f15119l;
            EnumC7278l enumC7278l3 = EnumC7278l.f15120l;
            EnumC7278l enumC7278l4 = EnumC7278l.f15121l;
            if (zBooleanValue) {
                enumC7278l = enumC7278l4;
            } else {
                enumC7278l = charSequence.length() == 0 ? enumC7278l3 : enumC7278l2;
            }
            C13494l c13494l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd;
            C11090l c11090l = c13494l.isPro;
            C11090l c11090l2 = c13494l.smaato;
            long jCrashlytics = c11090l.crashlytics();
            long j6 = C9735l.firebase;
            boolean z6 = (C9735l.crashlytics(jCrashlytics, j6) && !C9735l.crashlytics(c11090l2.crashlytics(), j6)) || (!C9735l.crashlytics(c11090l.crashlytics(), j6) && C9735l.crashlytics(c11090l2.crashlytics(), j6));
            C18656l c18656lIsPro = AbstractC2438l.isPro(enumC7278l, "TextFieldInputState", c6956l, 48, 0);
            boolean z7 = function3 != null && ((abstractC17824l instanceof C10871l) || (abstractC17824l instanceof C15618l));
            float f6 = 1.0f;
            C13863l c13863l = C1867l.yandex;
            if (function3 != null) {
                c6956l.m2123default(994993276);
                InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 2);
                if (c18656lIsPro.mopub()) {
                    z7 = z7;
                    objMopub4 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
                } else {
                    c6956l.m2123default(1666573488);
                    boolean zBilling = c6956l.billing(c18656lIsPro);
                    objMopub4 = c6956l.m2132native();
                    if (zBilling || objMopub4 == c13863l) {
                        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        try {
                            Object objCrashlytics = c18656lIsPro.crashlytics();
                            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                            c6956l.m2147try(objCrashlytics);
                            objMopub4 = objCrashlytics;
                        } catch (Throwable th) {
                            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                            throw th;
                        }
                    }
                    c6956l.startapp(false);
                }
                c6956l.m2123default(1071902915);
                int iOrdinal = ((EnumC7278l) objMopub4).ordinal();
                if (iOrdinal == 0) {
                    f4 = 1.0f;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            C18725l.billing();
                            return;
                        }
                    } else if (z7) {
                        f4 = 0.0f;
                    }
                    f4 = 1.0f;
                }
                c6956l.startapp(false);
                Float fValueOf = Float.valueOf(f4);
                boolean zBilling2 = c6956l.billing(c18656lIsPro);
                Object objM2132native = c6956l.m2132native();
                if (zBilling2 || objM2132native == c13863l) {
                    objM2132native = AbstractC8020l.mopub(new C17648l(c18656lIsPro, 6));
                    c6956l.m2147try(objM2132native);
                }
                EnumC7278l enumC7278l5 = (EnumC7278l) ((InterfaceC12244l) objM2132native).getValue();
                c6956l.m2123default(1071902915);
                int iOrdinal2 = enumC7278l5.ordinal();
                if (iOrdinal2 == 0) {
                    f5 = 1.0f;
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            C18725l.billing();
                            return;
                        }
                    } else if (z7) {
                        f5 = 0.0f;
                    }
                    f5 = 1.0f;
                }
                c6956l.startapp(false);
                Float fValueOf2 = Float.valueOf(f5);
                boolean zBilling3 = c6956l.billing(c18656lIsPro);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling3 || objM2132native2 == c13863l) {
                    objMopub5 = AbstractC8020l.mopub(new C17648l(c18656lIsPro, 7));
                    c6956l.m2147try(objMopub5);
                } else {
                    objMopub5 = objM2132native2;
                }
                c6956l.m2123default(1806589607);
                c6956l.startapp(false);
                c9459lBilling = AbstractC2438l.billing(c18656lIsPro, fValueOf, fValueOf2, interfaceC17807lRemoteconfig, c0010l, c6956l, 196608);
                c18656l = c18656lIsPro;
                c6956l.startapp(false);
            } else {
                z6 = z6;
                z7 = z7;
                c18656l = c18656lIsPro;
                c6956l.m2123default(995064483);
                c6956l.startapp(false);
                c9459lBilling = null;
            }
            if (function4 != null) {
                c6956l.m2123default(995155127);
                InterfaceC17807l interfaceC17807lRemoteconfig2 = C17423l.remoteconfig(c6956l, 5);
                InterfaceC17807l interfaceC17807lRemoteconfig3 = C17423l.remoteconfig(c6956l, 6);
                if (c18656l.mopub()) {
                    c9459lBilling = c9459lBilling;
                    interfaceC17807lRemoteconfig2 = interfaceC17807lRemoteconfig2;
                    objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656l);
                } else {
                    c6956l.m2123default(1666573488);
                    boolean zBilling4 = c6956l.billing(c18656l);
                    objMopub2 = c6956l.m2132native();
                    if (zBilling4 || objMopub2 == c13863l) {
                        AbstractC18620l abstractC18620lBilling2 = AbstractC7572l.billing();
                        Function1 function1Purchase2 = abstractC18620lBilling2 != null ? abstractC18620lBilling2.purchase() : null;
                        AbstractC18620l abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                        try {
                            Object objCrashlytics2 = c18656l.crashlytics();
                            AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                            c6956l.m2147try(objCrashlytics2);
                            objMopub2 = objCrashlytics2;
                        } catch (Throwable th2) {
                            AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                            throw th2;
                        }
                    }
                    c6956l.startapp(false);
                }
                c6956l.m2123default(-2037958114);
                int iOrdinal3 = ((EnumC7278l) objMopub2).ordinal();
                if (iOrdinal3 == 0) {
                    f2 = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            C18725l.billing();
                            return;
                        }
                    } else if (!z7) {
                        f2 = 1.0f;
                    }
                    f2 = 0.0f;
                }
                c6956l.startapp(false);
                Float fValueOf3 = Float.valueOf(f2);
                boolean zBilling5 = c6956l.billing(c18656l);
                Object objM2132native3 = c6956l.m2132native();
                if (zBilling5 || objM2132native3 == c13863l) {
                    objMopub3 = AbstractC8020l.mopub(new C17648l(c18656l, 10));
                    c6956l.m2147try(objMopub3);
                } else {
                    objMopub3 = objM2132native3;
                }
                EnumC7278l enumC7278l6 = (EnumC7278l) ((InterfaceC12244l) objMopub3).getValue();
                c6956l.m2123default(-2037958114);
                int iOrdinal4 = enumC7278l6.ordinal();
                if (iOrdinal4 == 0) {
                    f3 = 1.0f;
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            C18725l.billing();
                            return;
                        }
                    } else if (!z7) {
                        f3 = 1.0f;
                    }
                    f3 = 0.0f;
                }
                c6956l.startapp(false);
                Float fValueOf4 = Float.valueOf(f3);
                boolean zBilling6 = c6956l.billing(c18656l);
                Object objM2132native4 = c6956l.m2132native();
                if (zBilling6 || objM2132native4 == c13863l) {
                    objM2132native4 = AbstractC8020l.mopub(new C17648l(c18656l, 11));
                    c6956l.m2147try(objM2132native4);
                }
                InterfaceC17460l interfaceC17460l = (InterfaceC17460l) ((InterfaceC12244l) objM2132native4).getValue();
                c6956l.m2123default(-1370891590);
                InterfaceC17807l interfaceC17807l = (!interfaceC17460l.crashlytics(enumC7278l4, enumC7278l3) && (interfaceC17460l.crashlytics(enumC7278l3, enumC7278l4) || interfaceC17460l.crashlytics(enumC7278l2, enumC7278l3))) ? interfaceC17807lRemoteconfig3 : interfaceC17807lRemoteconfig2;
                z4 = false;
                c6956l.startapp(false);
                c9459lBilling2 = AbstractC2438l.billing(c18656l, fValueOf3, fValueOf4, interfaceC17807l, c0010l, c6956l, 196608);
                c6956l.startapp(false);
            } else {
                c9459lBilling = c9459lBilling;
                z4 = false;
                c6956l.m2123default(995231139);
                c6956l.startapp(false);
                c9459lBilling2 = null;
            }
            int i8 = 3;
            if (function7 == null) {
                c6956l.m2123default(995398787);
                c6956l.startapp(z4);
                c18656l2 = c18656l;
                c6956l3 = c6956l;
                c9459lBilling3 = null;
            } else {
                c6956l.m2123default(995328541);
                InterfaceC17807l interfaceC17807lRemoteconfig4 = C17423l.remoteconfig(c6956l, 5);
                if (c18656l.mopub()) {
                    objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656l);
                } else {
                    c6956l.m2123default(1666573488);
                    boolean zBilling7 = c6956l.billing(c18656l);
                    objMopub = c6956l.m2132native();
                    if (zBilling7 || objMopub == c13863l) {
                        AbstractC18620l abstractC18620lBilling3 = AbstractC7572l.billing();
                        Function1 function1Purchase3 = abstractC18620lBilling3 != null ? abstractC18620lBilling3.purchase() : null;
                        AbstractC18620l abstractC18620lRemoteconfig3 = AbstractC7572l.remoteconfig(abstractC18620lBilling3);
                        try {
                            Object objCrashlytics3 = c18656l.crashlytics();
                            AbstractC7572l.startapp(abstractC18620lBilling3, abstractC18620lRemoteconfig3, function1Purchase3);
                            c6956l.m2147try(objCrashlytics3);
                            objMopub = objCrashlytics3;
                        } catch (Throwable th3) {
                            AbstractC7572l.startapp(abstractC18620lBilling3, abstractC18620lRemoteconfig3, function1Purchase3);
                            throw th3;
                        }
                    }
                    c6956l.startapp(false);
                }
                c6956l.m2123default(-2144425951);
                int iOrdinal5 = ((EnumC7278l) objMopub).ordinal();
                if (iOrdinal5 == 0) {
                    f = 1.0f;
                } else {
                    if (iOrdinal5 != 1) {
                        if (iOrdinal5 != 2) {
                            C18725l.billing();
                            return;
                        }
                    } else if (z7) {
                        f = 0.0f;
                    }
                    f = 1.0f;
                }
                c6956l.startapp(false);
                Float fValueOf5 = Float.valueOf(f);
                boolean zBilling8 = c6956l.billing(c18656l);
                Object objM2132native5 = c6956l.m2132native();
                if (zBilling8 || objM2132native5 == c13863l) {
                    i5 = 2;
                    objM2132native5 = AbstractC8020l.mopub(new C17648l(c18656l, i5));
                    c6956l.m2147try(objM2132native5);
                } else {
                    i5 = 2;
                }
                EnumC7278l enumC7278l7 = (EnumC7278l) ((InterfaceC12244l) objM2132native5).getValue();
                c6956l.m2123default(-2144425951);
                int iOrdinal6 = enumC7278l7.ordinal();
                if (iOrdinal6 != 0) {
                    if (iOrdinal6 != 1) {
                        if (iOrdinal6 != i5) {
                            C18725l.billing();
                            return;
                        }
                    } else if (z7) {
                        f6 = 0.0f;
                    }
                }
                c6956l.startapp(false);
                Float fValueOf6 = Float.valueOf(f6);
                boolean zBilling9 = c6956l.billing(c18656l);
                Object objM2132native6 = c6956l.m2132native();
                if (zBilling9 || objM2132native6 == c13863l) {
                    objM2132native6 = AbstractC8020l.mopub(new C17648l(c18656l, i8));
                    c6956l.m2147try(objM2132native6);
                }
                c6956l.m2123default(-735253059);
                z4 = false;
                c6956l.startapp(false);
                c18656l2 = c18656l;
                c9459lBilling3 = AbstractC2438l.billing(c18656l2, fValueOf5, fValueOf6, interfaceC17807lRemoteconfig4, c0010l, c6956l, 196608);
                c6956l3 = c6956l;
                c6956l3.startapp(false);
            }
            if (function3 == null) {
                c6956l3.m2123default(995485028);
                c6956l3.startapp(z4);
                c1351l2 = c1351l;
                c9459l = c9459lBilling3;
                c6956l2 = c6956l3;
                z5 = z4;
                c15578l2 = null;
                c9459l2 = c9459lBilling;
            } else {
                c6956l3.m2123default(995485029);
                c6956l2 = c6956l3;
                c9459l = c9459lBilling3;
                z5 = z4;
                C9459l c9459l4 = c9459lBilling;
                c9459l2 = c9459l4;
                c1351l2 = c1351l;
                C15578l c15578lAmazon = AbstractC14566l.amazon(-568812970, new C8845l(c9459l4, c1351l, z2, z3, zBooleanValue, z6, c18656l2, c11090l2, c11090l, function3), c6956l2);
                c6956l2.startapp(z5);
                c15578l2 = c15578lAmazon;
            }
            if (!z2) {
                j = c1351l2.appmetrica;
            } else if (z3) {
                j = c1351l2.inmobi;
            } else {
                j = zBooleanValue ? c1351l2.premium : c1351l2.applovin;
            }
            Object objM2132native7 = c6956l2.m2132native();
            if (objM2132native7 == c13863l) {
                objM2132native7 = AbstractC8020l.billing(c7472l, new C18355l(c9459lBilling2, 9));
                c6956l2.m2147try(objM2132native7);
            }
            InterfaceC12244l interfaceC12244l = (InterfaceC12244l) objM2132native7;
            if (function4 != null && charSequence.length() == 0 && ((Boolean) interfaceC12244l.getValue()).booleanValue()) {
                c6956l2.m2123default(996556513);
                C15578l c15578lAmazon2 = AbstractC14566l.amazon(1789869489, new C6224l(j, c11090l, function4), c6956l2);
                c6956l2.startapp(z5);
                c15578l3 = c15578lAmazon2;
            } else {
                c6956l2.m2123default(996868186);
                c6956l2.startapp(z5);
                c15578l3 = null;
            }
            if (!z2) {
                j2 = c1351l2.f3465private;
            } else if (z3) {
                j2 = c1351l2.f3461extends;
            } else {
                j2 = zBooleanValue ? c1351l2.f3470volatile : c1351l2.f3463native;
            }
            long j7 = j2;
            Object objM2132native8 = c6956l2.m2132native();
            if (objM2132native8 == c13863l) {
                c9459l3 = c9459l;
                objM2132native8 = AbstractC8020l.billing(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0660: INVOKE (r3v77 'objM2132native8' java.lang.Object) = 
                      (r23v0 ?? I:??[OBJECT, ARRAY])
                      (wrap l￙ﾘￛﾦￛﾢ:0x065d: CONSTRUCTOR (r7v35 'c9459l3' l￙ﾍ￙ﾎￛﾦ), (10 int) A[MD:(l￙ﾐￛﾦ￘ﾘ, int):void (m), WRAPPED] (LINE:156) call: l￙ﾘￛﾦￛﾢ.<init>(l￙ﾐￛﾦ￘ﾘ, int):void type: CONSTRUCTOR)
                     STATIC call: l￙ﾋ￙ﾕ￙ﾟ.billing(l￘ﾙ￙ﾟ￘ﾙ, kotlin.jvm.functions.Function0):l￙ﾌ￘ﾙ￙ﾑ A[MD:(l￘ﾙ￙ﾟ￘ﾙ, kotlin.jvm.functions.Function0):l￙ﾌ￘ﾙ￙ﾑ (m)] (LINE:156) in method: l￙ﾔ￙ﾝￛﾟ.loadAd(java.lang.CharSequence, kotlin.jvm.functions.Function2, l￙ﾘ￙ﾎ￙ﾓ, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, l￘ﾔ￘ﾖ￙ﾕ, l￙ﾐ￙ﾐ￙ﾟ, l￘ﾒￛﾜￛﾗ, l￙ﾕ￙ﾍ￘ﾚ, l￘ﾚ￘ﾑ￙ﾐ, int, int):void, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2282
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15042l.loadAd(java.lang.CharSequence, kotlin.jvm.functions.Function2, lَ٘ٓ, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, lٕؔؖ, lِِٟ, lؒۜۗ, lٍؚٕ, lؚِؑ, int, int):void");
            }

            public static C6570l metrica(C6570l c6570l, float f, float f2, int i) {
                if ((i & 1) != 0) {
                    f = ((Number) c6570l.f13720l.getValue()).floatValue();
                }
                if ((i & 2) != 0) {
                    f2 = ((C11951l) c6570l.f13719l).yandex;
                }
                return new C6570l(c6570l.f13721l, Float.valueOf(f), new C11951l(f2), c6570l.f13723l, c6570l.f13722l, c6570l.f13724l);
            }

            /* JADX WARN: Code duplicated, block: B:235:0x04c1  */
            /* JADX WARN: Code duplicated, block: B:239:0x04c8  */
            /* JADX WARN: Code duplicated, block: B:242:0x0500  */
            /* JADX WARN: Code duplicated, block: B:243:0x0504  */
            public static final void mopub(Function2 function2, final Function2 function3, Function3 function4, final Function2 function5, final Function2 function6, final Function2 function7, final Function2 function8, final boolean z, final AbstractC17824l abstractC17824l, final C10643l c10643l, final C10643l c10643l2, final C10643l c10643l3, final C15578l c15578l, Function2 function9, InterfaceC11780l interfaceC11780l, C6956l c6956l, final int i, final int i2) {
                int i3;
                int i4;
                Function3 function10;
                Function2 function11;
                final InterfaceC11780l interfaceC11780l2;
                C6956l c6956l2;
                Function2 function12;
                char c;
                boolean z2;
                C14855l c14855l;
                float f;
                boolean z3;
                C10643l c10643l4;
                boolean z4;
                Object objM2132native;
                Function2 function13 = function6;
                C14855l c14855l2 = C18450l.f36043l;
                C14855l c14855l3 = C18450l.f36026l;
                c6956l.m2133new(-766806902);
                int i5 = i & 6;
                C4346l c4346l = C4346l.f8873l;
                if (i5 == 0) {
                    i3 = i | (c6956l.billing(c4346l) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= c6956l.admob(function2) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i3 |= c6956l.admob(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                }
                if ((i & 3072) == 0) {
                    i3 |= c6956l.admob(function4) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i3 |= c6956l.admob(function5) ? 16384 : 8192;
                }
                if ((i & 196608) == 0) {
                    i3 |= c6956l.admob(function13) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i3 |= c6956l.admob(function7) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i3 |= c6956l.admob(function8) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i3 |= c6956l.mopub(z) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    i3 |= c6956l.billing(abstractC17824l) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i4 = i2 | ((i2 & 8) == 0 ? c6956l.billing(c10643l) : c6956l.admob(c10643l) ? 4 : 2);
                } else {
                    i4 = i2;
                }
                if ((i2 & 48) == 0) {
                    i4 |= (i2 & 64) == 0 ? c6956l.billing(c10643l2) : c6956l.admob(c10643l2) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i4 |= (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c6956l.billing(c10643l3) : c6956l.admob(c10643l3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                }
                if ((i2 & 3072) == 0) {
                    i4 |= c6956l.admob(c15578l) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    i4 |= c6956l.admob(function9) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i4 |= c6956l.billing(interfaceC11780l) ? 131072 : 65536;
                }
                int i6 = i4;
                if (c6956l.m2127for(i3 & 1, ((i3 & 306783379) == 306783378 && (74899 & i6) == 74898) ? false : true)) {
                    float fLicense = license(c6956l);
                    int i7 = i6 & 14;
                    boolean zCrashlytics = ((i6 & 896) == 256 || ((i6 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 && c6956l.billing(c10643l3))) | ((i3 & 1879048192) == 536870912) | ((i3 & 234881024) == 67108864) | (i7 == 4 || ((i6 & 8) != 0 && c6956l.billing(c10643l))) | ((i6 & 112) == 32 || ((i6 & 64) != 0 && c6956l.billing(c10643l2))) | ((458752 & i6) == 131072) | c6956l.crashlytics(fLicense);
                    Object objM2132native2 = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zCrashlytics || objM2132native2 == c13863l) {
                        c = ' ';
                        c6956l2 = c6956l;
                        objM2132native2 = new C1472l(z, abstractC17824l, c10643l, c10643l2, c10643l3, interfaceC11780l, fLicense);
                        c6956l2.m2147try(objM2132native2);
                    } else {
                        c = ' ';
                        c6956l2 = c6956l;
                    }
                    C1472l c1472l = (C1472l) objM2132native2;
                    EnumC9931l enumC9931l = (EnumC9931l) c6956l2.isPro(AbstractC4751l.vip);
                    long j = c6956l2.f14595continue;
                    int i8 = (int) (j ^ (j >>> c));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c1472l, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i8);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                    c15578l.invoke(c6956l2, Integer.valueOf((i6 >> 9) & 14));
                    C18158l c18158l = C18158l.f35556l;
                    if (function5 != null) {
                        c6956l2.m2123default(-42889297);
                        InterfaceC17242l interfaceC17242lIsPro = AbstractC14312l.isPro(c4346l, "Leading");
                        C17857l c17857l = AbstractC16434l.yandex;
                        InterfaceC17242l interfaceC17242lPremium = interfaceC17242lIsPro.premium(c18158l);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02b4: INVOKE (r9v25 'interfaceC10835lAmazon' l￙ﾏ￘ﾕￛﾤ) = (r16v0 ?? I:??[OBJECT, ARRAY]), false STATIC call: l￙ﾍ￘ﾚ￘ﾚ.amazon(l￙ﾒ￙ﾙ￙ﾖ, boolean):l￙ﾏ￘ﾕￛﾤ A[DECLARE_VAR, MD:(l￙ﾒ￙ﾙ￙ﾖ, boolean):l￙ﾏ￘ﾕￛﾤ (m)] (LINE:39) in method: l￙ﾔ￙ﾝￛﾟ.mopub(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, l￙ﾘ￙ﾎ￙ﾓ, l￙ﾎￛﾢ, l￙ﾎￛﾢ, l￙ﾎￛﾢ, l￙ﾕ￙ﾍ￘ﾚ, kotlin.jvm.functions.Function2, l￙ﾐ￙ﾐ￙ﾟ, l￘ﾚ￘ﾑ￙ﾐ, int, int):void, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1675
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15042l.mopub(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, lَ٘ٓ, lَۢ, lَۢ, lَۢ, lٍؚٕ, kotlin.jvm.functions.Function2, lِِٟ, lؚِؑ, int, int):void");
                    }

                    public static final C6906l pro() {
                        return C1083l.ads(new C8195l[]{new C8195l(Float.valueOf(0.92f), new C9735l(C9735l.loadAd)), new C8195l(Float.valueOf(1.0f), new C9735l(C9735l.isPro))});
                    }

                    public static final void purchase(long j, C11090l c11090l, Function2 function2, C6956l c6956l, int i) {
                        long j2;
                        C11090l c11090l2;
                        Function2 function3;
                        C6956l c6956l2;
                        c6956l.m2133new(396611577);
                        int i2 = (c6956l.purchase(j) ? 4 : 2) | i | (c6956l.billing(c11090l) ? 32 : 16);
                        if ((i & 384) == 0) {
                            i2 |= c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                        }
                        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
                            c6956l2 = c6956l;
                            AbstractC3383l.billing(j, c11090l, function2, c6956l2, i2 & 1022);
                            j2 = j;
                            c11090l2 = c11090l;
                            function3 = function2;
                        } else {
                            j2 = j;
                            c11090l2 = c11090l;
                            function3 = function2;
                            c6956l2 = c6956l;
                            c6956l2.m2124else();
                        }
                        C4224l c4224lAds = c6956l2.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new C4173l(j2, c11090l2, function3, i, 1);
                        }
                    }

                    public static final void remoteconfig(C13450l c13450l, C6956l c6956l, int i) {
                        C13450l c13450l2;
                        C6956l c6956l2;
                        c6956l.m2133new(1229882433);
                        int i2 = (c6956l.billing(c13450l) ? 4 : 2) | i;
                        if (!c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
                            c13450l2 = c13450l;
                            c6956l2 = c6956l;
                            c6956l2.m2124else();
                        } else if (c13450l == null) {
                            c6956l.m2123default(-938283688);
                            c6956l.startapp(false);
                            c13450l2 = c13450l;
                            c6956l2 = c6956l;
                        } else {
                            c6956l.m2123default(-938283687);
                            c13450l2 = c13450l;
                            c6956l2 = c6956l;
                            AbstractC18037l.crashlytics(c13450l2, null, AbstractC0532l.subs(750, 6, null), "", AbstractC1805l.yandex, c6956l2, 28032, 2);
                            c6956l2.startapp(false);
                        }
                        C4224l c4224lAds = c6956l2.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new C4951l(c13450l2, i, 16);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:102:0x0169  */
                    /* JADX WARN: Code duplicated, block: B:103:0x016c  */
                    /* JADX WARN: Code duplicated, block: B:109:0x0182  */
                    /* JADX WARN: Code duplicated, block: B:113:0x01a4  */
                    /* JADX WARN: Code duplicated, block: B:117:0x01b0  */
                    /* JADX WARN: Code duplicated, block: B:119:0x01ed  */
                    /* JADX WARN: Code duplicated, block: B:122:0x01f9  */
                    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
                    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
                    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
                    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
                    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
                    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
                    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
                    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
                    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
                    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
                    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
                    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
                    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
                    /* JADX WARN: Code duplicated, block: B:78:0x00ed A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
                    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
                    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
                    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
                    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
                    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
                    /* JADX WARN: Code duplicated, block: B:91:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:95:0x012b  */
                    /* JADX WARN: Code duplicated, block: B:99:0x014e  */
                    public static final void smaato(final C14632l c14632l, final C6678l c6678l, final Function1 function1, final InterfaceC17242l interfaceC17242l, final boolean z, InterfaceC11780l interfaceC11780l, InterfaceC6347l interfaceC6347l, InterfaceC17242l interfaceC17242l2, final boolean z2, final C14473l c14473l, final InterfaceC9085l interfaceC9085l, C6956l c6956l, final int i, final int i2, final int i3) {
                        int i4;
                        InterfaceC11780l interfaceC11780lLoadAd;
                        int i5;
                        InterfaceC6347l interfaceC6347l2;
                        int i6;
                        int i7;
                        int i8;
                        InterfaceC17242l interfaceC17242l3;
                        int i9;
                        int i10;
                        boolean z3;
                        final InterfaceC17242l interfaceC17242l4;
                        final InterfaceC11780l interfaceC11780l2;
                        final InterfaceC6347l interfaceC6347l3;
                        C4224l c4224lAds;
                        final InterfaceC6347l interfaceC6347l4;
                        Object objM2132native;
                        C13863l c13863l;
                        InterfaceC8714l interfaceC8714l;
                        int i11;
                        boolean z4;
                        Object objM2132native2;
                        C2887l c2887lLoadAd;
                        boolean zBilling;
                        Object objM2132native3;
                        InterfaceC14029l interfaceC14029l;
                        boolean z5;
                        boolean z6;
                        Object c17949l;
                        InterfaceC14029l interfaceC14029l2;
                        boolean z7;
                        C2887l c2887l;
                        boolean zBilling2;
                        Object objM2132native4;
                        int i12;
                        int i13;
                        int i14 = c6678l.loadAd;
                        c6956l.m2133new(-1594491760);
                        if ((i & 6) == 0) {
                            i4 = (c6956l.billing(c14632l) ? 4 : 2) | i;
                        } else {
                            i4 = i;
                        }
                        int i15 = i4 | (c6956l.billing(c6678l) ? 32 : 16) | (c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
                        if ((i & 24576) == 0) {
                            i15 |= c6956l.mopub(z) ? 16384 : 8192;
                        }
                        int i16 = i3 & 16;
                        if (i16 == 0) {
                            if ((196608 & i) == 0) {
                                interfaceC11780lLoadAd = interfaceC11780l;
                                i15 |= c6956l.billing(interfaceC11780lLoadAd) ? 131072 : 65536;
                            }
                            i5 = i3 & 32;
                            if (i5 != 0) {
                                i7 = i15 | 1572864;
                                interfaceC6347l2 = interfaceC6347l;
                            } else {
                                interfaceC6347l2 = interfaceC6347l;
                                if (c6956l.billing(interfaceC6347l2)) {
                                    i6 = 1048576;
                                } else {
                                    i6 = 524288;
                                }
                                i7 = i15 | i6;
                            }
                            i8 = i3 & 64;
                            if (i8 != 0) {
                                i7 |= 12582912;
                                interfaceC17242l3 = interfaceC17242l2;
                            } else {
                                interfaceC17242l3 = interfaceC17242l2;
                                if ((i & 12582912) == 0) {
                                    if (c6956l.billing(interfaceC17242l3)) {
                                        i9 = 8388608;
                                    } else {
                                        i9 = 4194304;
                                    }
                                    i7 |= i9;
                                }
                            }
                            if ((i & 805306368) == 0) {
                                if (c6956l.billing(c14473l)) {
                                    i13 = 536870912;
                                } else {
                                    i13 = 268435456;
                                }
                                i7 |= i13;
                            }
                            if ((i2 & 6) == 0) {
                                if (c6956l.admob(interfaceC9085l)) {
                                    i12 = 4;
                                } else {
                                    i12 = 2;
                                }
                                i10 = i2 | i12;
                            } else {
                                i10 = i2;
                            }
                            if ((i7 & 306783379) == 306783378 || (i10 & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (c6956l.m2127for(i7 & 1, z3)) {
                                if (i16 != 0) {
                                    interfaceC11780lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
                                }
                                if (i5 != 0) {
                                    interfaceC6347l4 = AbstractC16837l.yandex;
                                } else {
                                    interfaceC6347l4 = interfaceC6347l2;
                                }
                                if (i8 != 0) {
                                    interfaceC17242l3 = C4346l.f8873l;
                                }
                                interfaceC17242l4 = interfaceC17242l3;
                                objM2132native = c6956l.m2132native();
                                c13863l = C1867l.yandex;
                                if (objM2132native == c13863l) {
                                    objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                                    c6956l.m2147try(objM2132native);
                                }
                                interfaceC8714l = (InterfaceC8714l) objM2132native;
                                i11 = i7 & 112;
                                if (i11 == 32) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objM2132native2 = c6956l.m2132native();
                                if (z4 || objM2132native2 == c13863l) {
                                    objM2132native2 = new C10740l(8, c6678l);
                                    c6956l.m2147try(objM2132native2);
                                }
                                int i17 = i7;
                                c2887lLoadAd = AbstractC10521l.loadAd(i14, (Function0) objM2132native2, c6956l, 0, 2);
                                zBilling = c6956l.billing(c2887lLoadAd);
                                objM2132native3 = c6956l.m2132native();
                                interfaceC14029l = null;
                                if (zBilling || objM2132native3 == c13863l) {
                                    objM2132native3 = new C5888l(c2887lLoadAd, interfaceC8714l, interfaceC14029l, 10);
                                    c6956l.m2147try(objM2132native3);
                                }
                                AbstractC12311l.amazon(c6956l, c2887lLoadAd, (Function2) objM2132native3);
                                Integer numValueOf = Integer.valueOf(i14);
                                boolean zBilling3 = c6956l.billing(c2887lLoadAd);
                                if (i11 == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                z6 = z5 | zBilling3;
                                Object objM2132native5 = c6956l.m2132native();
                                if (!z6 || objM2132native5 == c13863l) {
                                    interfaceC14029l2 = null;
                                    z7 = false;
                                    c2887l = c2887lLoadAd;
                                    c17949l = new C17949l(c2887l, c6678l, interfaceC8714l, interfaceC14029l2, 4);
                                    c6956l.m2147try(c17949l);
                                } else {
                                    c17949l = objM2132native5;
                                    interfaceC14029l2 = null;
                                    z7 = false;
                                    c2887l = c2887lLoadAd;
                                }
                                AbstractC12311l.amazon(c6956l, numValueOf, (Function2) c17949l);
                                zBilling2 = c6956l.billing(c2887l) | ((i17 & 896) != 256 ? z7 : true);
                                objM2132native4 = c6956l.m2132native();
                                if (zBilling2 || objM2132native4 == c13863l) {
                                    C17949l c17949l2 = new C17949l(c2887l, function1, interfaceC8714l, interfaceC14029l2, 5);
                                    c6956l.m2147try(c17949l2);
                                    objM2132native4 = c17949l2;
                                }
                                AbstractC12311l.amazon(c6956l, c2887l, (Function2) objM2132native4);
                                final InterfaceC11780l interfaceC11780l3 = interfaceC11780lLoadAd;
                                final C2887l c2887l2 = c2887l;
                                AbstractC10478l.yandex(AbstractC3643l.yandex.yandex(interfaceC14029l2), AbstractC14566l.amazon(3207120, new Function2() { // from class: lؘٙۙ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        C6956l c6956l2 = (C6956l) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            final AbstractC13264l abstractC13264l = c2887l2;
                                            final InterfaceC11780l interfaceC11780l4 = interfaceC11780l3;
                                            final C6678l c6678l2 = c6678l;
                                            final boolean z8 = z2;
                                            final C14473l c14473l2 = c14473l;
                                            final C14632l c14632l2 = c14632l;
                                            final InterfaceC17242l interfaceC17242l5 = interfaceC17242l4;
                                            final InterfaceC9085l interfaceC9085l2 = interfaceC9085l;
                                            final InterfaceC6347l interfaceC6347l5 = interfaceC6347l4;
                                            final boolean z9 = z;
                                            AbstractC11308l.yandex(interfaceC17242l, null, AbstractC14566l.amazon(1400531258, new Function3() { // from class: lٌٓۖ
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    C0923l c0923l = (C0923l) obj3;
                                                    C6956l c6956l3 = (C6956l) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= c6956l3.billing(c0923l) ? 4 : 2;
                                                    }
                                                    if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                        float fLoadAd = c0923l.loadAd();
                                                        InterfaceC13490l interfaceC13490l = c0923l.yandex;
                                                        long j = c0923l.loadAd;
                                                        final boolean z10 = C14467l.yandex(fLoadAd, C15519l.crashlytics(j) ? interfaceC13490l.mo872static(C15519l.mopub(j)) : Float.POSITIVE_INFINITY) > 0;
                                                        C15617l c15617l = C15617l.f30496l;
                                                        C2782l c2782l = C2782l.f6061l;
                                                        final C6678l c6678l3 = c6678l2;
                                                        final boolean z11 = z8;
                                                        final C14473l c14473l3 = c14473l2;
                                                        final C14632l c14632l3 = c14632l2;
                                                        final InterfaceC17242l interfaceC17242l6 = interfaceC17242l5;
                                                        final InterfaceC9085l interfaceC9085l3 = interfaceC9085l2;
                                                        final AbstractC13264l abstractC13264l2 = abstractC13264l;
                                                        final InterfaceC6347l interfaceC6347l6 = interfaceC6347l5;
                                                        final boolean z12 = z9;
                                                        AbstractC7252l.yandex(abstractC13264l2, null, interfaceC11780l4, c2782l, 0.0f, null, null, false, null, c15617l, null, AbstractC14566l.amazon(-1419166375, new Function4() { // from class: lؗ٘
                                                            @Override // kotlin.jvm.functions.Function4
                                                            public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                                long j2;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                C6956l c6956l4 = (C6956l) obj8;
                                                                int iIntValue4 = ((Integer) obj9).intValue();
                                                                C10507l c10507l = (C10507l) AbstractC16901l.m4220for(iIntValue3, c6678l3.yandex);
                                                                if (z11) {
                                                                    c6956l4.m2123default(1272690066);
                                                                    AbstractC15042l.admob(c14473l3, c10507l, c6956l4, 0);
                                                                    c6956l4.startapp(false);
                                                                } else {
                                                                    c6956l4.m2123default(1272960820);
                                                                    C14632l c14632l4 = c14632l3;
                                                                    InterfaceC17242l interfaceC17242lPro = interfaceC17242l6;
                                                                    if (c14632l4 != null) {
                                                                        c6956l4.m2123default(1272996935);
                                                                        StringBuilder sb = new StringBuilder("artwork:");
                                                                        sb.append(c10507l != null ? c10507l.yandex : null);
                                                                        interfaceC17242lPro = AbstractC0653l.pro(c14632l4, interfaceC17242lPro, c14632l4.amazon(sb.toString(), c6956l4), interfaceC9085l3);
                                                                        c6956l4.startapp(false);
                                                                    } else {
                                                                        c6956l4.m2123default(1273252716);
                                                                        c6956l4.startapp(false);
                                                                    }
                                                                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC17463l.loadAd(interfaceC17242lPro, z10);
                                                                    AbstractC13264l abstractC13264l3 = abstractC13264l2;
                                                                    int i18 = 1;
                                                                    boolean zBilling4 = ((((iIntValue4 & 112) ^ 48) > 32 && c6956l4.amazon(iIntValue3)) || (iIntValue4 & 48) == 32) | c6956l4.billing(abstractC13264l3);
                                                                    Object objM2132native6 = c6956l4.m2132native();
                                                                    if (zBilling4 || objM2132native6 == C1867l.yandex) {
                                                                        objM2132native6 = new C7365l(abstractC13264l3, iIntValue3, i18);
                                                                        c6956l4.m2147try(objM2132native6);
                                                                    }
                                                                    InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(interfaceC17242lLoadAd, (Function1) objM2132native6);
                                                                    InterfaceC6347l interfaceC6347l7 = interfaceC6347l6;
                                                                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(interfaceC17242lLoadAd2, interfaceC6347l7);
                                                                    if (z12) {
                                                                        c6956l4.m2123default(1980779020);
                                                                        j2 = ((C18718l) c6956l4.isPro(AbstractC5992l.yandex)).amazon;
                                                                        c6956l4.startapp(false);
                                                                    } else {
                                                                        c6956l4.m2123default(1980780004);
                                                                        c6956l4.startapp(false);
                                                                        j2 = C9735l.isPro;
                                                                    }
                                                                    AbstractC15042l.isPro(c10507l, AbstractC17551l.loadAd(interfaceC17242lCrashlytics, 1.0f, j2, interfaceC6347l7), c6956l4, 0);
                                                                    c6956l4.startapp(false);
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l3), c6956l3, 199680, 24960, 12242);
                                                    } else {
                                                        c6956l3.m2124else();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, c6956l2), c6956l2, 3072, 6);
                                        } else {
                                            c6956l2.m2124else();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, c6956l), c6956l, 56);
                                interfaceC11780l2 = interfaceC11780l3;
                                interfaceC6347l3 = interfaceC6347l4;
                            } else {
                                c6956l.m2124else();
                                interfaceC17242l4 = interfaceC17242l3;
                                interfaceC11780l2 = interfaceC11780lLoadAd;
                                interfaceC6347l3 = interfaceC6347l2;
                            }
                            c4224lAds = c6956l.ads();
                            if (c4224lAds != null) {
                                c4224lAds.amazon = new Function2() { // from class: lِ٘
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int iPurchase = AbstractC0545l.purchase(i | 1);
                                        int iPurchase2 = AbstractC0545l.purchase(i2);
                                        AbstractC15042l.smaato(c14632l, c6678l, function1, interfaceC17242l, z, interfaceC11780l2, interfaceC6347l3, interfaceC17242l4, z2, c14473l, interfaceC9085l, (C6956l) obj, iPurchase, iPurchase2, i3);
                                        return Unit.INSTANCE;
                                    }
                                };
                            }
                        }
                        i15 |= 196608;
                        interfaceC11780lLoadAd = interfaceC11780l;
                        i5 = i3 & 32;
                        if (i5 != 0) {
                            i7 = i15 | 1572864;
                            interfaceC6347l2 = interfaceC6347l;
                        } else {
                            interfaceC6347l2 = interfaceC6347l;
                            if (c6956l.billing(interfaceC6347l2)) {
                                i6 = 1048576;
                            } else {
                                i6 = 524288;
                            }
                            i7 = i15 | i6;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i7 |= 12582912;
                            interfaceC17242l3 = interfaceC17242l2;
                        } else {
                            interfaceC17242l3 = interfaceC17242l2;
                            if ((i & 12582912) == 0) {
                                if (c6956l.billing(interfaceC17242l3)) {
                                    i9 = 8388608;
                                } else {
                                    i9 = 4194304;
                                }
                                i7 |= i9;
                            }
                        }
                        if ((i & 805306368) == 0) {
                            if (c6956l.billing(c14473l)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i7 |= i13;
                        }
                        if ((i2 & 6) == 0) {
                            if (c6956l.admob(interfaceC9085l)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i10 = i2 | i12;
                        } else {
                            i10 = i2;
                        }
                        if ((i7 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (c6956l.m2127for(i7 & 1, z3)) {
                            if (i16 != 0) {
                                interfaceC11780lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
                            }
                            if (i5 != 0) {
                                interfaceC6347l4 = AbstractC16837l.yandex;
                            } else {
                                interfaceC6347l4 = interfaceC6347l2;
                            }
                            if (i8 != 0) {
                                interfaceC17242l3 = C4346l.f8873l;
                            }
                            interfaceC17242l4 = interfaceC17242l3;
                            objM2132native = c6956l.m2132native();
                            c13863l = C1867l.yandex;
                            if (objM2132native == c13863l) {
                                objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                                c6956l.m2147try(objM2132native);
                            }
                            interfaceC8714l = (InterfaceC8714l) objM2132native;
                            i11 = i7 & 112;
                            if (i11 == 32) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objM2132native2 = c6956l.m2132native();
                            if (z4) {
                                objM2132native2 = new C10740l(8, c6678l);
                                c6956l.m2147try(objM2132native2);
                            } else {
                                objM2132native2 = new C10740l(8, c6678l);
                                c6956l.m2147try(objM2132native2);
                            }
                            int i18 = i7;
                            c2887lLoadAd = AbstractC10521l.loadAd(i14, (Function0) objM2132native2, c6956l, 0, 2);
                            zBilling = c6956l.billing(c2887lLoadAd);
                            objM2132native3 = c6956l.m2132native();
                            interfaceC14029l = null;
                            if (zBilling) {
                                objM2132native3 = new C5888l(c2887lLoadAd, interfaceC8714l, interfaceC14029l, 10);
                                c6956l.m2147try(objM2132native3);
                            } else {
                                objM2132native3 = new C5888l(c2887lLoadAd, interfaceC8714l, interfaceC14029l, 10);
                                c6956l.m2147try(objM2132native3);
                            }
                            AbstractC12311l.amazon(c6956l, c2887lLoadAd, (Function2) objM2132native3);
                            Integer numValueOf2 = Integer.valueOf(i14);
                            boolean zBilling4 = c6956l.billing(c2887lLoadAd);
                            if (i11 == 32) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = z5 | zBilling4;
                            Object objM2132native6 = c6956l.m2132native();
                            if (z6) {
                                interfaceC14029l2 = null;
                                z7 = false;
                                c2887l = c2887lLoadAd;
                                c17949l = new C17949l(c2887l, c6678l, interfaceC8714l, interfaceC14029l2, 4);
                                c6956l.m2147try(c17949l);
                            } else {
                                interfaceC14029l2 = null;
                                z7 = false;
                                c2887l = c2887lLoadAd;
                                c17949l = new C17949l(c2887l, c6678l, interfaceC8714l, interfaceC14029l2, 4);
                                c6956l.m2147try(c17949l);
                            }
                            AbstractC12311l.amazon(c6956l, numValueOf2, (Function2) c17949l);
                            zBilling2 = c6956l.billing(c2887l) | ((i18 & 896) != 256 ? z7 : true);
                            objM2132native4 = c6956l.m2132native();
                            if (zBilling2) {
                                C17949l c17949l3 = new C17949l(c2887l, function1, interfaceC8714l, interfaceC14029l2, 5);
                                c6956l.m2147try(c17949l3);
                                objM2132native4 = c17949l3;
                            } else {
                                C17949l c17949l4 = new C17949l(c2887l, function1, interfaceC8714l, interfaceC14029l2, 5);
                                c6956l.m2147try(c17949l4);
                                objM2132native4 = c17949l4;
                            }
                            AbstractC12311l.amazon(c6956l, c2887l, (Function2) objM2132native4);
                            final InterfaceC11780l interfaceC11780l4 = interfaceC11780lLoadAd;
                            final C2887l c2887l3 = c2887l;
                            AbstractC10478l.yandex(AbstractC3643l.yandex.yandex(interfaceC14029l2), AbstractC14566l.amazon(3207120, new Function2() { // from class: lؘٙۙ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    C6956l c6956l2 = (C6956l) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        final AbstractC13264l abstractC13264l = c2887l3;
                                        final InterfaceC11780l interfaceC11780l5 = interfaceC11780l4;
                                        final C6678l c6678l2 = c6678l;
                                        final boolean z8 = z2;
                                        final C14473l c14473l2 = c14473l;
                                        final C14632l c14632l2 = c14632l;
                                        final InterfaceC17242l interfaceC17242l5 = interfaceC17242l4;
                                        final InterfaceC9085l interfaceC9085l2 = interfaceC9085l;
                                        final InterfaceC6347l interfaceC6347l5 = interfaceC6347l4;
                                        final boolean z9 = z;
                                        AbstractC11308l.yandex(interfaceC17242l, null, AbstractC14566l.amazon(1400531258, new Function3() { // from class: lٌٓۖ
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                C0923l c0923l = (C0923l) obj3;
                                                C6956l c6956l3 = (C6956l) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= c6956l3.billing(c0923l) ? 4 : 2;
                                                }
                                                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                    float fLoadAd = c0923l.loadAd();
                                                    InterfaceC13490l interfaceC13490l = c0923l.yandex;
                                                    long j = c0923l.loadAd;
                                                    final boolean z10 = C14467l.yandex(fLoadAd, C15519l.crashlytics(j) ? interfaceC13490l.mo872static(C15519l.mopub(j)) : Float.POSITIVE_INFINITY) > 0;
                                                    C15617l c15617l = C15617l.f30496l;
                                                    C2782l c2782l = C2782l.f6061l;
                                                    final C6678l c6678l3 = c6678l2;
                                                    final boolean z11 = z8;
                                                    final C14473l c14473l3 = c14473l2;
                                                    final C14632l c14632l3 = c14632l2;
                                                    final InterfaceC17242l interfaceC17242l6 = interfaceC17242l5;
                                                    final InterfaceC9085l interfaceC9085l3 = interfaceC9085l2;
                                                    final AbstractC13264l abstractC13264l2 = abstractC13264l;
                                                    final InterfaceC6347l interfaceC6347l6 = interfaceC6347l5;
                                                    final boolean z12 = z9;
                                                    AbstractC7252l.yandex(abstractC13264l2, null, interfaceC11780l5, c2782l, 0.0f, null, null, false, null, c15617l, null, AbstractC14566l.amazon(-1419166375, new Function4() { // from class: lؗ٘
                                                        @Override // kotlin.jvm.functions.Function4
                                                        public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                            long j2;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            C6956l c6956l4 = (C6956l) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            C10507l c10507l = (C10507l) AbstractC16901l.m4220for(iIntValue3, c6678l3.yandex);
                                                            if (z11) {
                                                                c6956l4.m2123default(1272690066);
                                                                AbstractC15042l.admob(c14473l3, c10507l, c6956l4, 0);
                                                                c6956l4.startapp(false);
                                                            } else {
                                                                c6956l4.m2123default(1272960820);
                                                                C14632l c14632l4 = c14632l3;
                                                                InterfaceC17242l interfaceC17242lPro = interfaceC17242l6;
                                                                if (c14632l4 != null) {
                                                                    c6956l4.m2123default(1272996935);
                                                                    StringBuilder sb = new StringBuilder("artwork:");
                                                                    sb.append(c10507l != null ? c10507l.yandex : null);
                                                                    interfaceC17242lPro = AbstractC0653l.pro(c14632l4, interfaceC17242lPro, c14632l4.amazon(sb.toString(), c6956l4), interfaceC9085l3);
                                                                    c6956l4.startapp(false);
                                                                } else {
                                                                    c6956l4.m2123default(1273252716);
                                                                    c6956l4.startapp(false);
                                                                }
                                                                InterfaceC17242l interfaceC17242lLoadAd = AbstractC17463l.loadAd(interfaceC17242lPro, z10);
                                                                AbstractC13264l abstractC13264l3 = abstractC13264l2;
                                                                int i19 = 1;
                                                                boolean zBilling5 = ((((iIntValue4 & 112) ^ 48) > 32 && c6956l4.amazon(iIntValue3)) || (iIntValue4 & 48) == 32) | c6956l4.billing(abstractC13264l3);
                                                                Object objM2132native7 = c6956l4.m2132native();
                                                                if (zBilling5 || objM2132native7 == C1867l.yandex) {
                                                                    objM2132native7 = new C7365l(abstractC13264l3, iIntValue3, i19);
                                                                    c6956l4.m2147try(objM2132native7);
                                                                }
                                                                InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(interfaceC17242lLoadAd, (Function1) objM2132native7);
                                                                InterfaceC6347l interfaceC6347l7 = interfaceC6347l6;
                                                                InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(interfaceC17242lLoadAd2, interfaceC6347l7);
                                                                if (z12) {
                                                                    c6956l4.m2123default(1980779020);
                                                                    j2 = ((C18718l) c6956l4.isPro(AbstractC5992l.yandex)).amazon;
                                                                    c6956l4.startapp(false);
                                                                } else {
                                                                    c6956l4.m2123default(1980780004);
                                                                    c6956l4.startapp(false);
                                                                    j2 = C9735l.isPro;
                                                                }
                                                                AbstractC15042l.isPro(c10507l, AbstractC17551l.loadAd(interfaceC17242lCrashlytics, 1.0f, j2, interfaceC6347l7), c6956l4, 0);
                                                                c6956l4.startapp(false);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, c6956l3), c6956l3, 199680, 24960, 12242);
                                                } else {
                                                    c6956l3.m2124else();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, c6956l2), c6956l2, 3072, 6);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, c6956l), c6956l, 56);
                            interfaceC11780l2 = interfaceC11780l4;
                            interfaceC6347l3 = interfaceC6347l4;
                        } else {
                            c6956l.m2124else();
                            interfaceC17242l4 = interfaceC17242l3;
                            interfaceC11780l2 = interfaceC11780lLoadAd;
                            interfaceC6347l3 = interfaceC6347l2;
                        }
                        c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new Function2() { // from class: lِ٘
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iPurchase = AbstractC0545l.purchase(i | 1);
                                    int iPurchase2 = AbstractC0545l.purchase(i2);
                                    AbstractC15042l.smaato(c14632l, c6678l, function1, interfaceC17242l, z, interfaceC11780l2, interfaceC6347l3, interfaceC17242l4, z2, c14473l, interfaceC9085l, (C6956l) obj, iPurchase, iPurchase2, i3);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }

                    public static final InterfaceC17242l startapp(InterfaceC17242l interfaceC17242l, boolean z, String str) {
                        return z ? AbstractC4962l.yandex(interfaceC17242l, false, new C6908l(str, 21)) : interfaceC17242l;
                    }

                    public static final void subs(AbstractC18643l abstractC18643l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
                        c6956l.m2133new(-1999332557);
                        int i2 = (c6956l.billing(abstractC18643l) ? 4 : 2) | i | (c6956l.billing(interfaceC17242l) ? 32 : 16);
                        int i3 = 0;
                        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
                            C7819l c7819lVip = null;
                            if (abstractC18643l == null) {
                                c6956l.m2123default(490445775);
                            } else {
                                c6956l.m2123default(490445776);
                                c7819lVip = vip(abstractC18643l, (Context) c6956l.isPro(AbstractC1242l.loadAd), 5, null);
                            }
                            c6956l.startapp(false);
                            AbstractC7741l.purchase(c7819lVip, null, interfaceC17242l, AbstractC16759l.crashlytics(R.drawable.generic_audio_nowplaying, 0, c6956l), AbstractC16759l.crashlytics(R.drawable.generic_audio_nowplaying, 0, c6956l), C4176l.loadAd, c6956l, ((i2 << 3) & 896) | 36912, 6, 31712);
                        } else {
                            c6956l.m2124else();
                        }
                        C4224l c4224lAds = c6956l.ads();
                        if (c4224lAds != null) {
                            c4224lAds.amazon = new C9825l(abstractC18643l, interfaceC17242l, i, i3);
                        }
                    }

                    public static final InterfaceC6947l subscription(AbstractC17824l abstractC17824l) {
                        if (abstractC17824l instanceof C10871l) {
                            return ((C10871l) abstractC17824l).adcel;
                        }
                        if (abstractC17824l instanceof C15618l) {
                            return ((C15618l) abstractC17824l).adcel;
                        }
                        C1759l.ads(abstractC17824l, "Unknown position: ");
                        return null;
                    }

                    public static final InterfaceC6947l tapsense(AbstractC17824l abstractC17824l) {
                        if (abstractC17824l instanceof C10871l) {
                            return ((C10871l) abstractC17824l).startapp;
                        }
                        if (abstractC17824l instanceof C15618l) {
                            return ((C15618l) abstractC17824l).startapp;
                        }
                        C1759l.ads(abstractC17824l, "Unknown position: ");
                        return null;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static final C7819l vip(AbstractC18643l abstractC18643l, Context context, int i, C14473l c14473l) {
                        String str;
                        Integer numValueOf = Integer.valueOf(R.drawable.generic_audio_nowplaying);
                        StringBuilder sb = new StringBuilder("np_");
                        sb.append(abstractC18643l != 0 ? abstractC18643l.startapp() : null);
                        if (c14473l != null) {
                            str = "_blur:" + c14473l.hashCode();
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        String string = sb.toString();
                        C9477l c9477l = new C9477l(context);
                        c9477l.crashlytics(AbstractC9029l.purchase(i));
                        c9477l.ads = 2;
                        C13767l c13767lLoadAd = c9477l.loadAd();
                        Boolean bool = Boolean.TRUE;
                        c13767lLoadAd.yandex(C12014l.f23937l, bool);
                        c9477l.loadAd().yandex(C12014l.f23938l, bool);
                        if (c14473l != null) {
                            AbstractC12872l.yandex(c9477l, false);
                            AbstractC10413l.yandex(c9477l, false);
                            c9477l.loadAd().yandex(AbstractC10413l.mopub, Boolean.FALSE);
                            AbstractC12872l.crashlytics(c9477l, new C5739l(c14473l));
                        } else {
                            AbstractC12872l.yandex(c9477l, true);
                            AbstractC10413l.yandex(c9477l, true);
                            c9477l.loadAd().yandex(AbstractC10413l.mopub, Boolean.valueOf(AbstractC4072l.inmobi(context)));
                        }
                        c9477l.remoteconfig = new C1791l(string, C14054l.f27396l);
                        c9477l.purchase = string;
                        if ((!C11489l.yandex.yandex() && (abstractC18643l == 0 || !ads(abstractC18643l))) || abstractC18643l == 0) {
                            abstractC18643l = numValueOf;
                        }
                        c9477l.crashlytics = abstractC18643l;
                        return c9477l.yandex();
                    }

                    public static C6570l yandex(float f, float f2, int i) {
                        if ((i & 2) != 0) {
                            f2 = 0.0f;
                        }
                        return new C6570l(AbstractC3483l.purchase, Float.valueOf(f), new C11951l(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
                    }
                }
