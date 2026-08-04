package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٗؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16814l {
    public static File loadAd;
    public static final StackTraceElement[] yandex = new StackTraceElement[0];

    public static C10815l admob(Context context, C17484l c17484l) {
        long j = c17484l.f34059l;
        int i = c17484l.f34058l;
        if (i == 1) {
            C16917l c16917l = c17484l.f34066l;
            byte[] bArr = c16917l != null ? c16917l.f32994l : c17484l.f34055l;
            if (bArr != null) {
                return new C10815l(j, 1, bArr, null, null);
            }
            C6541l.subs("Payload bytes cannot be null if type is BYTES.");
            return null;
        }
        if (i != 2) {
            if (i != 3) {
                Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", Long.valueOf(j), Integer.valueOf(c17484l.f34058l)));
                return null;
            }
            ParcelFileDescriptor parcelFileDescriptor = c17484l.f34062l;
            if (parcelFileDescriptor != null) {
                return new C10815l(j, 3, null, null, new C2494l(parcelFileDescriptor));
            }
            C6541l.subs("Data ParcelFileDescriptor cannot be null for type STREAM");
            return null;
        }
        String str = c17484l.f34061l;
        Uri uri = c17484l.f34057l;
        if (str == null || uri == null) {
            if (uri != null && c17484l.f34062l == null) {
                Log.d("NearbyConnections", "Created file payload based on uri instead pfd");
                return C10815l.crashlytics(new C0093l((File) null, (ParcelFileDescriptor) null, c17484l.f34063l, uri), j);
            }
            ParcelFileDescriptor parcelFileDescriptor2 = c17484l.f34062l;
            if (parcelFileDescriptor2 != null) {
                return C10815l.crashlytics(new C0093l((File) null, parcelFileDescriptor2, parcelFileDescriptor2.getStatSize(), (Uri) null), j);
            }
            C6541l.subs("Data ParcelFileDescriptor cannot be null for type FILE");
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                Log.w("NearbyConnections", String.format("Failed to get ParcelFileDescriptor for %s", uri));
                return null;
            }
            C10815l c10815lCrashlytics = C10815l.crashlytics(new C0093l(new File(str), parcelFileDescriptorOpenFileDescriptor, c17484l.f34065l, uri), j);
            if (!TextUtils.isEmpty(c17484l.f34067l)) {
                c10815lCrashlytics.loadAd(c17484l.f34067l);
            }
            if (!TextUtils.isEmpty(c17484l.f34054l)) {
                c10815lCrashlytics.yandex(c17484l.f34054l);
            }
            return c10815lCrashlytics;
        } catch (FileNotFoundException e) {
            Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e);
            return null;
        } catch (SecurityException e2) {
            Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e2);
            return null;
        }
    }

    public static final C16413l amazon(String str, AbstractC2021l abstractC2021l, InterfaceC18035l[] interfaceC18035lArr, Function1 function1) {
        if (AbstractC12024l.m3315catch(str)) {
            C8339l.metrica("Blank serial names are prohibited");
            return null;
        }
        if (abstractC2021l.equals(C16015l.amazon)) {
            C8339l.metrica("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C14416l c14416l = new C14416l(str);
        function1.invoke(c14416l);
        return new C16413l(str, abstractC2021l, c14416l.crashlytics.size(), AbstractC8669l.m2415super(interfaceC18035lArr), c14416l);
    }

    public static final int billing(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return 0;
        }
        return i == 0 ? 1 : 2;
    }

    public static final C17606l crashlytics(String str) {
        C15358l c15358l = C15358l.smaato;
        if (AbstractC12024l.m3315catch(str)) {
            C8339l.metrica("Blank serial names are prohibited");
            return null;
        }
        Object it = ((C4764l) AbstractC14414l.yandex.values()).iterator();
        while (((AbstractC15951l) it).hasNext()) {
            InterfaceC16588l interfaceC16588l = (InterfaceC16588l) ((C0437l) it).next();
            if (str.equals(interfaceC16588l.purchase().yandex())) {
                StringBuilder sbIsVip = AbstractC5020l.isVip("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbIsVip.append(AbstractC18202l.yandex.loadAd(interfaceC16588l.getClass()).license());
                sbIsVip.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                C8339l.metrica(AbstractC1833l.firebase(sbIsVip.toString()));
                return null;
            }
        }
        return new C17606l(str, c15358l);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0180  */
    /* JADX WARN: Code duplicated, block: B:62:0x0183  */
    /* JADX WARN: Code duplicated, block: B:63:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x018c  */
    /* JADX WARN: Code duplicated, block: B:67:0x018f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0192  */
    /* JADX WARN: Code duplicated, block: B:70:0x01db  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void loadAd(final boolean z, final Function0 function0, final C15578l c15578l, InterfaceC17242l interfaceC17242l, boolean z2, Function2 function2, final Function3 function3, C1338l c1338l, C5041l c5041l, C17115l c17115l, C12941l c12941l, C16818l c16818l, C6956l c6956l, final int i, final int i2) {
        int i3;
        Function0 function1;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        Function2 function4;
        int i5;
        boolean z3;
        final boolean z4;
        final C1338l c1338l2;
        final C5041l c5041l2;
        final C17115l c17115l2;
        final C12941l c12941l2;
        final C16818l c16818l2;
        final InterfaceC17242l interfaceC17242l3;
        final Function2 function5;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        boolean z5;
        boolean z6;
        boolean z7;
        float f;
        c6956l.m2133new(398022744);
        if ((i & 6) == 0) {
            i3 = i | (c6956l.mopub(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i3 |= c6956l.admob(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i3 | 3072;
            interfaceC17242l2 = interfaceC17242l;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i4 = i3 | (c6956l.billing(interfaceC17242l2) ? 2048 : 1024);
        }
        int i7 = 1794048 | i4;
        int i8 = i2 & 128;
        if (i8 == 0) {
            if ((i & 12582912) == 0) {
                function4 = function2;
                i7 |= c6956l.admob(function4) ? 8388608 : 4194304;
            }
            i5 = i7 | 805306368;
            if ((306783379 & i5) == 306783378) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (c6956l.m2127for(i5 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i6 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    }
                    C6839l c6839l = AbstractC2235l.yandex;
                    C1338l c1338l3 = new C1338l(c6839l, c6839l, c6839l, c6839l, c6839l, c6839l, c6839l, c6839l);
                    long j = C9735l.isPro;
                    C10707l c10707l = AbstractC10689l.yandex;
                    long jPurchase = ((C10936l) c6956l.isPro(c10707l)).purchase();
                    long jAmazon = ((C10936l) c6956l.isPro(c10707l)).amazon();
                    long jYandex = AbstractC10689l.yandex(jAmazon, c6956l);
                    long jYandex2 = AbstractC10689l.yandex(jAmazon, c6956l);
                    C5041l c5041l3 = new C5041l(j, jPurchase, jAmazon, jYandex, jAmazon, jYandex2, C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(c10707l)).admob()), ((C9735l) ((C10936l) c6956l.isPro(c10707l)).subs.getValue()).yandex, j, ((C10936l) c6956l.isPro(c10707l)).purchase(), jAmazon, jYandex, jAmazon, jYandex2);
                    C17115l c17115l3 = new C17115l();
                    C2209l c2209l = C2209l.crashlytics;
                    C12941l c12941l3 = new C12941l(c2209l, c2209l, c2209l, c2209l, c2209l, c2209l, new C2209l(AbstractC2576l.yandex(2.0f, ((C10936l) c6956l.isPro(c10707l)).yandex()), null, 6), c2209l);
                    C4442l c4442l = C4442l.loadAd;
                    function5 = function4;
                    c17115l2 = c17115l3;
                    c1338l2 = c1338l3;
                    c5041l2 = c5041l3;
                    c12941l2 = c12941l3;
                    c16818l2 = new C16818l(c4442l, c4442l, c4442l, c4442l, c4442l, c4442l);
                    z5 = true;
                } else {
                    c6956l.m2124else();
                    c1338l2 = c1338l;
                    c17115l2 = c17115l;
                    c12941l2 = c12941l;
                    c16818l2 = c16818l;
                    interfaceC17242l4 = interfaceC17242l2;
                    c5041l2 = c5041l;
                    function5 = function4;
                    z5 = z2;
                }
                c6956l.adcel();
                C17253l c17253l = AbstractC2235l.loadAd;
                if (function3 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function5 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    f = AbstractC2235l.billing;
                } else if (z6) {
                    f = AbstractC2235l.purchase;
                } else {
                    f = AbstractC2235l.amazon;
                }
                C10707l c10707l2 = AbstractC3459l.yandex;
                int i9 = (i5 & 14) | 384 | (i5 & 112);
                int i10 = i5 << 3;
                Function0 function6 = function1;
                interfaceC17242l3 = interfaceC17242l4;
                z4 = z5;
                yandex(z, function6, c17253l, c15578l, interfaceC17242l3, z4, function5, function3, c1338l2, c5041l2, c17115l2, c12941l2, c16818l2, f, ((C9472l) c6956l.isPro(c10707l2)).admob, ((C9472l) c6956l.isPro(c10707l2)).remoteconfig, c6956l, i9 | 3072 | (i10 & 57344) | 14352384 | (i10 & 234881024) | 805306368, 100663350, 48);
            } else {
                c6956l.m2124else();
                z4 = z2;
                c1338l2 = c1338l;
                c5041l2 = c5041l;
                c17115l2 = c17115l;
                c12941l2 = c12941l;
                c16818l2 = c16818l;
                interfaceC17242l3 = interfaceC17242l2;
                function5 = function4;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lِْۙ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iPurchase = AbstractC0545l.purchase(i | 1);
                        AbstractC16814l.loadAd(z, function0, c15578l, interfaceC17242l3, z4, function5, function3, c1338l2, c5041l2, c17115l2, c12941l2, c16818l2, (C6956l) obj, iPurchase, i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i7 = 14376960 | i4;
        function4 = function2;
        i5 = i7 | 805306368;
        if ((306783379 & i5) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (c6956l.m2127for(i5 & 1, z3)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if (i8 != 0) {
                    function4 = null;
                }
                C6839l c6839l2 = AbstractC2235l.yandex;
                C1338l c1338l4 = new C1338l(c6839l2, c6839l2, c6839l2, c6839l2, c6839l2, c6839l2, c6839l2, c6839l2);
                long j2 = C9735l.isPro;
                C10707l c10707l3 = AbstractC10689l.yandex;
                long jPurchase2 = ((C10936l) c6956l.isPro(c10707l3)).purchase();
                long jAmazon2 = ((C10936l) c6956l.isPro(c10707l3)).amazon();
                long jYandex3 = AbstractC10689l.yandex(jAmazon2, c6956l);
                long jYandex4 = AbstractC10689l.yandex(jAmazon2, c6956l);
                C5041l c5041l4 = new C5041l(j2, jPurchase2, jAmazon2, jYandex3, jAmazon2, jYandex4, C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(c10707l3)).admob()), ((C9735l) ((C10936l) c6956l.isPro(c10707l3)).subs.getValue()).yandex, j2, ((C10936l) c6956l.isPro(c10707l3)).purchase(), jAmazon2, jYandex3, jAmazon2, jYandex4);
                C17115l c17115l4 = new C17115l();
                C2209l c2209l2 = C2209l.crashlytics;
                C12941l c12941l4 = new C12941l(c2209l2, c2209l2, c2209l2, c2209l2, c2209l2, c2209l2, new C2209l(AbstractC2576l.yandex(2.0f, ((C10936l) c6956l.isPro(c10707l3)).yandex()), null, 6), c2209l2);
                C4442l c4442l2 = C4442l.loadAd;
                function5 = function4;
                c17115l2 = c17115l4;
                c1338l2 = c1338l4;
                c5041l2 = c5041l4;
                c12941l2 = c12941l4;
                c16818l2 = new C16818l(c4442l2, c4442l2, c4442l2, c4442l2, c4442l2, c4442l2);
                z5 = true;
            } else {
                if (i6 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if (i8 != 0) {
                    function4 = null;
                }
                C6839l c6839l3 = AbstractC2235l.yandex;
                C1338l c1338l5 = new C1338l(c6839l3, c6839l3, c6839l3, c6839l3, c6839l3, c6839l3, c6839l3, c6839l3);
                long j3 = C9735l.isPro;
                C10707l c10707l4 = AbstractC10689l.yandex;
                long jPurchase3 = ((C10936l) c6956l.isPro(c10707l4)).purchase();
                long jAmazon3 = ((C10936l) c6956l.isPro(c10707l4)).amazon();
                long jYandex5 = AbstractC10689l.yandex(jAmazon3, c6956l);
                long jYandex6 = AbstractC10689l.yandex(jAmazon3, c6956l);
                C5041l c5041l5 = new C5041l(j3, jPurchase3, jAmazon3, jYandex5, jAmazon3, jYandex6, C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(c10707l4)).admob()), ((C9735l) ((C10936l) c6956l.isPro(c10707l4)).subs.getValue()).yandex, j3, ((C10936l) c6956l.isPro(c10707l4)).purchase(), jAmazon3, jYandex5, jAmazon3, jYandex6);
                C17115l c17115l5 = new C17115l();
                C2209l c2209l3 = C2209l.crashlytics;
                C12941l c12941l5 = new C12941l(c2209l3, c2209l3, c2209l3, c2209l3, c2209l3, c2209l3, new C2209l(AbstractC2576l.yandex(2.0f, ((C10936l) c6956l.isPro(c10707l4)).yandex()), null, 6), c2209l3);
                C4442l c4442l3 = C4442l.loadAd;
                function5 = function4;
                c17115l2 = c17115l5;
                c1338l2 = c1338l5;
                c5041l2 = c5041l5;
                c12941l2 = c12941l5;
                c16818l2 = new C16818l(c4442l3, c4442l3, c4442l3, c4442l3, c4442l3, c4442l3);
                z5 = true;
            }
            c6956l.adcel();
            C17253l c17253l2 = AbstractC2235l.loadAd;
            if (function3 != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (function5 != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                f = AbstractC2235l.billing;
            } else if (z6) {
                f = AbstractC2235l.purchase;
            } else {
                f = AbstractC2235l.amazon;
            }
            C10707l c10707l5 = AbstractC3459l.yandex;
            int i11 = (i5 & 14) | 384 | (i5 & 112);
            int i12 = i5 << 3;
            Function0 function7 = function1;
            interfaceC17242l3 = interfaceC17242l4;
            z4 = z5;
            yandex(z, function7, c17253l2, c15578l, interfaceC17242l3, z4, function5, function3, c1338l2, c5041l2, c17115l2, c12941l2, c16818l2, f, ((C9472l) c6956l.isPro(c10707l5)).admob, ((C9472l) c6956l.isPro(c10707l5)).remoteconfig, c6956l, i11 | 3072 | (i12 & 57344) | 14352384 | (i12 & 234881024) | 805306368, 100663350, 48);
        } else {
            c6956l.m2124else();
            z4 = z2;
            c1338l2 = c1338l;
            c5041l2 = c5041l;
            c17115l2 = c17115l;
            c12941l2 = c12941l;
            c16818l2 = c16818l;
            interfaceC17242l3 = interfaceC17242l2;
            function5 = function4;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lِْۙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    AbstractC16814l.loadAd(z, function0, c15578l, interfaceC17242l3, z4, function5, function3, c1338l2, c5041l2, c17115l2, c12941l2, c16818l2, (C6956l) obj, iPurchase, i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static long mopub(int i, int i2) {
        int i3 = -1;
        int i4 = i2 == 0 ? -1 : AbstractC1197l.yandex[AbstractC5020l.inmobi(i2)];
        if (i4 != -1) {
            i3 = 1;
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 != 2) {
                C18725l.billing();
                return 0L;
            }
        }
        return (((long) i) << 32) | (((long) i3) & 4294967295L);
    }

    public static C16413l purchase(String str, AbstractC2021l abstractC2021l, InterfaceC18035l[] interfaceC18035lArr) {
        if (AbstractC12024l.m3315catch(str)) {
            C8339l.metrica("Blank serial names are prohibited");
            return null;
        }
        if (abstractC2021l.equals(C16015l.amazon)) {
            C8339l.metrica("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C14416l c14416l = new C14416l(str);
        Unit unit = Unit.INSTANCE;
        return new C16413l(str, abstractC2021l, c14416l.crashlytics.size(), AbstractC8669l.m2415super(interfaceC18035lArr), c14416l);
    }

    public static final void yandex(final boolean z, final Function0 function0, final InterfaceC11780l interfaceC11780l, final C15578l c15578l, final InterfaceC17242l interfaceC17242l, final boolean z2, final Function2 function2, final Function3 function3, final C1338l c1338l, final C5041l c5041l, final C17115l c17115l, final C12941l c12941l, final C16818l c16818l, final float f, final C11090l c11090l, final C11090l c11090l2, C6956l c6956l, final int i, final int i2, final int i3) {
        int i4;
        Function0 function1;
        InterfaceC11780l interfaceC11780l2;
        C15578l c15578l2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        c6956l.m2133new(1047318944);
        if ((i & 6) == 0) {
            i4 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i4 |= c6956l.admob(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            interfaceC11780l2 = interfaceC11780l;
            i4 |= c6956l.billing(interfaceC11780l2) ? 256 : 128;
        } else {
            interfaceC11780l2 = interfaceC11780l;
        }
        if ((i & 3072) == 0) {
            c15578l2 = c15578l;
            i4 |= c6956l.admob(c15578l2) ? 2048 : 1024;
        } else {
            c15578l2 = c15578l;
        }
        if ((i & 24576) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            z3 = z2;
            i4 |= c6956l.mopub(z3) ? 131072 : 65536;
        } else {
            z3 = z2;
        }
        if ((i & 1572864) == 0) {
            i4 |= c6956l.admob(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= c6956l.admob(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= c6956l.admob(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= c6956l.admob(function3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = (c6956l.admob(null) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c6956l.crashlytics(0.0f) ? 32 : 16;
        }
        int i9 = i5;
        if ((i2 & 384) == 0) {
            i6 = i9 | (c6956l.billing(c1338l) ? 256 : 128);
        } else {
            i6 = i9;
        }
        int i10 = i6;
        if ((i2 & 3072) == 0) {
            i7 = i10 | (c6956l.billing(c5041l) ? 2048 : 1024);
        } else {
            i7 = i10;
        }
        int i11 = i7;
        if ((i2 & 24576) == 0) {
            i11 |= c6956l.billing(c17115l) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i11 |= c6956l.billing(c12941l) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i11 |= c6956l.billing(c16818l) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i11 |= c6956l.crashlytics(f) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i11 |= c6956l.crashlytics(32.0f) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i11 |= c6956l.billing(c11090l) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i8 = i3 | (c6956l.billing(c11090l2) ? 4 : 2);
        } else {
            i8 = i3;
        }
        if ((i3 & 48) == 0) {
            i8 |= c6956l.billing(null) ? 32 : 16;
        }
        int i12 = i4;
        if (c6956l.m2127for(i12 & 1, ((i4 & 306783379) == 306783378 && (i11 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            boolean z4 = (i12 & 14) == 4;
            Object objM2132native = c6956l.m2132native();
            if (z4 || objM2132native == C1867l.yandex) {
                objM2132native = new C13816l(z, 3);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lAdmob = AbstractC15560l.admob(new C15986l((Function1) objM2132native, true), interfaceC17242l);
            InterfaceC6347l interfaceC6347l = c1338l.yandex;
            InterfaceC6347l interfaceC6347l2 = c1338l.loadAd;
            InterfaceC6347l interfaceC6347l3 = c1338l.crashlytics;
            InterfaceC6347l interfaceC6347l4 = c1338l.amazon;
            InterfaceC6347l interfaceC6347l5 = c1338l.purchase;
            InterfaceC6347l interfaceC6347l6 = c1338l.billing;
            InterfaceC6347l interfaceC6347l7 = c1338l.mopub;
            C12331l c12331l = new C12331l(interfaceC6347l, interfaceC6347l2, interfaceC6347l3, interfaceC6347l4, interfaceC6347l5, interfaceC6347l6, interfaceC6347l7, c1338l.admob, interfaceC6347l5, interfaceC6347l7);
            C7307l c7307l = new C7307l(c5041l.yandex, c5041l.loadAd, c5041l.crashlytics, c5041l.amazon, c5041l.purchase, c5041l.billing, c5041l.mopub, c5041l.admob, c5041l.subs, c5041l.isPro, c5041l.firebase, c5041l.smaato, c5041l.remoteconfig, c5041l.vip);
            c17115l.getClass();
            C11001l c11001l = new C11001l(1.05f, 1.05f);
            C2209l c2209l = c12941l.yandex;
            C2209l c2209l2 = c12941l.loadAd;
            C2209l c2209l3 = c12941l.crashlytics;
            C2209l c2209l4 = c12941l.amazon;
            C2209l c2209l5 = c12941l.purchase;
            C2209l c2209l6 = c12941l.billing;
            C2209l c2209l7 = c12941l.mopub;
            final C15578l c15578l3 = c15578l2;
            final InterfaceC11780l interfaceC11780l3 = interfaceC11780l2;
            int i13 = i12 >> 6;
            AbstractC16291l.amazon(z, function1, interfaceC17242lAdmob, z3, c12331l, c7307l, c11001l, new C3104l(c2209l, c2209l2, c2209l3, c2209l4, c2209l5, c2209l6, c2209l7, c12941l.admob, c2209l5, c2209l7), new C13891l(c16818l.yandex, c16818l.loadAd, c16818l.crashlytics, c16818l.amazon, c16818l.purchase, c16818l.billing), AbstractC14566l.amazon(-284944704, new Function3(f, interfaceC11780l3, function3, c11090l, c15578l3, function2, c11090l2) { // from class: lْ۠ۦ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ Function3 f26776l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC11780l f26777l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ float f26778l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f26779l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ C11090l f26780l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ Function2 f26781l;

                /* JADX WARN: Failed to calculate best type for var: r10v7 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: long
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v7 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: long
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v8 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v8 ??, new type: long
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r17v0 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 ??, new type: long
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /*  JADX ERROR: Types fix failed
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: long
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                    */
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
                    /*
                        Method dump skipped, instruction units count: 460
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C13723l.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, c6956l), c6956l, (i12 & 126) | (i13 & 7168) | (i13 & 57344) | ((i11 << 12) & 458752), (i8 & 112) | 384, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٗ۟ؑ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    int iPurchase3 = AbstractC0545l.purchase(i3);
                    AbstractC16814l.yandex(z, function0, interfaceC11780l, c15578l, interfaceC17242l, z2, function2, function3, c1338l, c5041l, c17115l, c12941l, c16818l, f, c11090l, c11090l2, (C6956l) obj, iPurchase, iPurchase2, iPurchase3);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
