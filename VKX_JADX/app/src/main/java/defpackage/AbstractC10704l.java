package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَۦؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10704l {
    public static final C15578l yandex = new C15578l(1616356710, false, new C13179l(22));
    public static final C15578l loadAd = new C15578l(-1087169018, false, new C13179l(23));
    public static final C15578l crashlytics = new C15578l(1744177100, false, new C13179l(24));
    public static final C15578l amazon = new C15578l(-1349648853, false, new C13179l(25));
    public static final C15578l purchase = new C15578l(-1725334404, false, new C13179l(26));
    public static final C15578l billing = new C15578l(773457279, false, new C13179l(27));
    public static final C15578l mopub = new C15578l(1606387840, false, new C13179l(28));
    public static final C15578l admob = new C15578l(-739969505, false, new C13179l(29));

    public static final void amazon(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(684127632);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, C4346l.f8873l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            int i5 = AbstractC15548l.yandex;
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13319l.yandex(AbstractC14905l.yandex, interfaceC17242l, null, null, AbstractC14905l.loadAd, AbstractC14905l.crashlytics, AbstractC15548l.yandex(0L, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, 0L, c6956l, 505), c6956l, ((i2 << 3) & 112) | 221190, 396);
            AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11003l(interfaceC17242l, i, i3);
        }
    }

    public static int billing(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final void crashlytics(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1959430837);
        if (c6956l2.m2127for(i & 1, (i & 3) != 2)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, ua.itaysonlab.vkx.R.string.global_search), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
            c6956l2 = c6956l;
            AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11003l(interfaceC17242l, i, 0);
        }
    }

    public static final void loadAd(int i, C6956l c6956l, InterfaceC17242l interfaceC17242l, String str, String str2, String str3, Function0 function0, boolean z) {
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(1022292961);
        int i2 = 2;
        int i3 = (c6956l.billing(str) ? 4 : 2) | i | (c6956l.billing(str2) ? 32 : 16) | (c6956l.billing(str3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.mopub(z) ? 2048 : 1024) | (c6956l.admob(function0) ? 16384 : 8192) | (c6956l.billing(interfaceC17242l) ? 131072 : 65536);
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            interfaceC17242l2 = interfaceC17242l;
            AbstractC0133l.amazon(AbstractC14566l.amazon(-1521855377, new C12273l(str, i2), c6956l), AbstractC14566l.amazon(-1218967986, new C0541l(str2, str3, 24), c6956l), AbstractC3605l.remoteconfig(interfaceC17242l2, 16.0f, 6.0f), AbstractC14566l.amazon(-613193204, new C0613l(z, function0, 3), c6956l), c6956l, 3126, 0);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2940l(i, interfaceC17242l2, str, str2, str3, function0, z);
        }
    }

    public static final void mopub(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof C5667l) {
            mopub(((C5667l) charSequence).f12057l, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb A[PHI: r1 r4 r5 r8
  0x00cb: PHI (r1v20 int) = (r1v15 int), (r1v13 int), (r1v22 int) binds: [B:77:0x00fe, B:64:0x00c7, B:65:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r4v16 kotlin.jvm.functions.Function0) = (r4v3 kotlin.jvm.functions.Function0), (r4v1 kotlin.jvm.functions.Function0), (r4v1 kotlin.jvm.functions.Function0) binds: [B:77:0x00fe, B:64:0x00c7, B:65:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r5v24 lُٜٗ) = (r5v12 lُٜٗ), (r5v10 lُٜٗ), (r5v10 lُٜٗ) binds: [B:77:0x00fe, B:64:0x00c7, B:65:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r8v10 lِِٟ) = (r8v5 lِِٟ), (r8v3 lِِٟ), (r8v3 lِِٟ) binds: [B:77:0x00fe, B:64:0x00c7, B:65:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0150  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void purchase(final String str, final Function1 function1, Function0 function0, final InterfaceC17242l interfaceC17242l, C11090l c11090l, final C15578l c15578l, final C15578l c15578l2, final C15578l c15578l3, InterfaceC11780l interfaceC11780l, C2403l c2403l, C6956l c6956l, final int i, final int i2) {
        Function0 function2;
        int i3;
        final C11090l c11090l2;
        int i4;
        int i5;
        InterfaceC11780l c17253l;
        int i6;
        int i7;
        C2403l c2403l2;
        int i8;
        int i9;
        boolean z;
        final Function0 function3;
        final InterfaceC11780l interfaceC11780l2;
        final C2403l c2403l3;
        C4224l c4224lAds;
        int i10;
        C13863l c13863l;
        int i11;
        Function0 function4;
        C11090l c11090l3;
        Object objM2132native;
        InterfaceC6497l interfaceC6497l;
        int i12;
        Object objM2132native2;
        c6956l.m2133new(-1186698162);
        int i13 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16);
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 = i13 | 384;
            function2 = function0;
        } else {
            function2 = function0;
            i3 = i13 | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i15 = i3 | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        if ((i2 & 16) == 0) {
            c11090l2 = c11090l;
            int i16 = c6956l.billing(c11090l2) ? 16384 : 8192;
            i4 = i15 | i16;
            i5 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i5 != 0) {
                if ((i & 100663296) == 0) {
                    c17253l = interfaceC11780l;
                    if (c6956l.billing(c17253l)) {
                        i6 = 67108864;
                    } else {
                        i6 = 33554432;
                    }
                    i4 |= i6;
                }
                i7 = i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                if (i7 != 0) {
                    if ((i & 805306368) == 0) {
                        c2403l2 = c2403l;
                        if (c6956l.billing(c2403l2)) {
                            i8 = 536870912;
                        } else {
                            i8 = 268435456;
                        }
                        i4 |= i8;
                    }
                    i9 = 0;
                    if ((306783379 & i4) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c6956l.m2127for(i4 & 1, z)) {
                        c6956l.m2141switch();
                        i10 = i & 1;
                        c13863l = C1867l.yandex;
                        if (i10 != 0 || c6956l.ad()) {
                            if (i14 != 0) {
                                objM2132native = c6956l.m2132native();
                                if (objM2132native == c13863l) {
                                    objM2132native = new C6573l(26);
                                    c6956l.m2147try(objM2132native);
                                }
                                function2 = (Function0) objM2132native;
                            }
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                                c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                            }
                            if (i5 != 0) {
                                c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                            }
                            if (i7 != 0) {
                                i11 = i4;
                                function4 = function2;
                                c11090l3 = c11090l2;
                                c2403l2 = null;
                            }
                            c6956l.adcel();
                            interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
                            C10707l c10707l = AbstractC16964l.yandex;
                            C8990l c8990l = new C8990l(((C14370l) c6956l.isPro(c10707l)).yandex.yandex);
                            C11090l c11090lYandex = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
                            C3790l c3790l = new C3790l(i9, 3, 119);
                            i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
                            objM2132native2 = c6956l.m2132native();
                            if (i12 == 0 || objM2132native2 == c13863l) {
                                objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                                c6956l.m2147try(objM2132native2);
                            }
                            InterfaceC11780l interfaceC11780l3 = c17253l;
                            AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex, c3790l, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l3, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
                            c11090l2 = c11090l3;
                            function3 = function4;
                            interfaceC11780l2 = interfaceC11780l3;
                        } else {
                            c6956l.m2124else();
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                            }
                        }
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                        c6956l.adcel();
                        interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
                        C10707l c10707l2 = AbstractC16964l.yandex;
                        C8990l c8990l2 = new C8990l(((C14370l) c6956l.isPro(c10707l2)).yandex.yandex);
                        C11090l c11090lYandex2 = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l2)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
                        C3790l c3790l2 = new C3790l(i9, 3, 119);
                        i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
                        objM2132native2 = c6956l.m2132native();
                        if (i12 == 0) {
                            objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                            c6956l.m2147try(objM2132native2);
                        }
                        InterfaceC11780l interfaceC11780l4 = c17253l;
                        AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex2, c3790l2, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l2, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l4, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
                        c11090l2 = c11090l3;
                        function3 = function4;
                        interfaceC11780l2 = interfaceC11780l4;
                    } else {
                        c6956l.m2124else();
                        function3 = function2;
                        interfaceC11780l2 = c17253l;
                    }
                    c2403l3 = c2403l2;
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lؗؔؓ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC10704l.purchase(str, function1, function3, interfaceC17242l, c11090l2, c15578l, c15578l2, c15578l3, interfaceC11780l2, c2403l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i4 |= 805306368;
                c2403l2 = c2403l;
                i9 = 0;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (c6956l.m2127for(i4 & 1, z)) {
                    c6956l.m2141switch();
                    i10 = i & 1;
                    c13863l = C1867l.yandex;
                    if (i10 != 0) {
                        if (i14 != 0) {
                            objM2132native = c6956l.m2132native();
                            if (objM2132native == c13863l) {
                                objM2132native = new C6573l(26);
                                c6956l.m2147try(objM2132native);
                            }
                            function2 = (Function0) objM2132native;
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                        }
                        if (i5 != 0) {
                            c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                        }
                        if (i7 != 0) {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                            c2403l2 = null;
                        } else {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                        }
                    } else {
                        if (i14 != 0) {
                            objM2132native = c6956l.m2132native();
                            if (objM2132native == c13863l) {
                                objM2132native = new C6573l(26);
                                c6956l.m2147try(objM2132native);
                            }
                            function2 = (Function0) objM2132native;
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                        }
                        if (i5 != 0) {
                            c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                        }
                        if (i7 != 0) {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                            c2403l2 = null;
                        } else {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                        }
                    }
                    c6956l.adcel();
                    interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    C8990l c8990l3 = new C8990l(((C14370l) c6956l.isPro(c10707l3)).yandex.yandex);
                    C11090l c11090lYandex3 = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l3)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
                    C3790l c3790l3 = new C3790l(i9, 3, 119);
                    i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
                    objM2132native2 = c6956l.m2132native();
                    if (i12 == 0) {
                        objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC11780l interfaceC11780l5 = c17253l;
                    AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex3, c3790l3, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l3, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l5, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
                    c11090l2 = c11090l3;
                    function3 = function4;
                    interfaceC11780l2 = interfaceC11780l5;
                } else {
                    c6956l.m2124else();
                    function3 = function2;
                    interfaceC11780l2 = c17253l;
                }
                c2403l3 = c2403l2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔؓ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC10704l.purchase(str, function1, function3, interfaceC17242l, c11090l2, c15578l, c15578l2, c15578l3, interfaceC11780l2, c2403l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 100663296;
            c17253l = interfaceC11780l;
            i7 = i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            if (i7 != 0) {
                if ((i & 805306368) == 0) {
                    c2403l2 = c2403l;
                    if (c6956l.billing(c2403l2)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i4 |= i8;
                }
                i9 = 0;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (c6956l.m2127for(i4 & 1, z)) {
                    c6956l.m2141switch();
                    i10 = i & 1;
                    c13863l = C1867l.yandex;
                    if (i10 != 0) {
                        if (i14 != 0) {
                            objM2132native = c6956l.m2132native();
                            if (objM2132native == c13863l) {
                                objM2132native = new C6573l(26);
                                c6956l.m2147try(objM2132native);
                            }
                            function2 = (Function0) objM2132native;
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                        }
                        if (i5 != 0) {
                            c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                        }
                        if (i7 != 0) {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                            c2403l2 = null;
                        } else {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                        }
                    } else {
                        if (i14 != 0) {
                            objM2132native = c6956l.m2132native();
                            if (objM2132native == c13863l) {
                                objM2132native = new C6573l(26);
                                c6956l.m2147try(objM2132native);
                            }
                            function2 = (Function0) objM2132native;
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                        }
                        if (i5 != 0) {
                            c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                        }
                        if (i7 != 0) {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                            c2403l2 = null;
                        } else {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                        }
                    }
                    c6956l.adcel();
                    interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    C8990l c8990l4 = new C8990l(((C14370l) c6956l.isPro(c10707l4)).yandex.yandex);
                    C11090l c11090lYandex4 = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l4)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
                    C3790l c3790l4 = new C3790l(i9, 3, 119);
                    i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
                    objM2132native2 = c6956l.m2132native();
                    if (i12 == 0) {
                        objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC11780l interfaceC11780l6 = c17253l;
                    AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex4, c3790l4, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l4, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l6, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
                    c11090l2 = c11090l3;
                    function3 = function4;
                    interfaceC11780l2 = interfaceC11780l6;
                } else {
                    c6956l.m2124else();
                    function3 = function2;
                    interfaceC11780l2 = c17253l;
                }
                c2403l3 = c2403l2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔؓ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC10704l.purchase(str, function1, function3, interfaceC17242l, c11090l2, c15578l, c15578l2, c15578l3, interfaceC11780l2, c2403l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 805306368;
            c2403l2 = c2403l;
            i9 = 0;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i4 & 1, z)) {
                c6956l.m2141switch();
                i10 = i & 1;
                c13863l = C1867l.yandex;
                if (i10 != 0) {
                    if (i14 != 0) {
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == c13863l) {
                            objM2132native = new C6573l(26);
                            c6956l.m2147try(objM2132native);
                        }
                        function2 = (Function0) objM2132native;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                    }
                    if (i5 != 0) {
                        c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                    }
                    if (i7 != 0) {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                        c2403l2 = null;
                    } else {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                    }
                } else {
                    if (i14 != 0) {
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == c13863l) {
                            objM2132native = new C6573l(26);
                            c6956l.m2147try(objM2132native);
                        }
                        function2 = (Function0) objM2132native;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                    }
                    if (i5 != 0) {
                        c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                    }
                    if (i7 != 0) {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                        c2403l2 = null;
                    } else {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                    }
                }
                c6956l.adcel();
                interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
                C10707l c10707l5 = AbstractC16964l.yandex;
                C8990l c8990l5 = new C8990l(((C14370l) c6956l.isPro(c10707l5)).yandex.yandex);
                C11090l c11090lYandex5 = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l5)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
                C3790l c3790l5 = new C3790l(i9, 3, 119);
                i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
                objM2132native2 = c6956l.m2132native();
                if (i12 == 0) {
                    objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC11780l interfaceC11780l7 = c17253l;
                AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex5, c3790l5, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l5, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l7, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
                c11090l2 = c11090l3;
                function3 = function4;
                interfaceC11780l2 = interfaceC11780l7;
            } else {
                c6956l.m2124else();
                function3 = function2;
                interfaceC11780l2 = c17253l;
            }
            c2403l3 = c2403l2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؗؔؓ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC10704l.purchase(str, function1, function3, interfaceC17242l, c11090l2, c15578l, c15578l2, c15578l3, interfaceC11780l2, c2403l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        c11090l2 = c11090l;
        i4 = i15 | i16;
        i5 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i5 != 0) {
            if ((i & 100663296) == 0) {
                c17253l = interfaceC11780l;
                if (c6956l.billing(c17253l)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            i7 = i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            if (i7 != 0) {
                if ((i & 805306368) == 0) {
                    c2403l2 = c2403l;
                    if (c6956l.billing(c2403l2)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i4 |= i8;
                }
                i9 = 0;
                if ((306783379 & i4) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (c6956l.m2127for(i4 & 1, z)) {
                    c6956l.m2141switch();
                    i10 = i & 1;
                    c13863l = C1867l.yandex;
                    if (i10 != 0) {
                        if (i14 != 0) {
                            objM2132native = c6956l.m2132native();
                            if (objM2132native == c13863l) {
                                objM2132native = new C6573l(26);
                                c6956l.m2147try(objM2132native);
                            }
                            function2 = (Function0) objM2132native;
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                        }
                        if (i5 != 0) {
                            c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                        }
                        if (i7 != 0) {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                            c2403l2 = null;
                        } else {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                        }
                    } else {
                        if (i14 != 0) {
                            objM2132native = c6956l.m2132native();
                            if (objM2132native == c13863l) {
                                objM2132native = new C6573l(26);
                                c6956l.m2147try(objM2132native);
                            }
                            function2 = (Function0) objM2132native;
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                        }
                        if (i5 != 0) {
                            c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                        }
                        if (i7 != 0) {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                            c2403l2 = null;
                        } else {
                            i11 = i4;
                            function4 = function2;
                            c11090l3 = c11090l2;
                        }
                    }
                    c6956l.adcel();
                    interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
                    C10707l c10707l6 = AbstractC16964l.yandex;
                    C8990l c8990l6 = new C8990l(((C14370l) c6956l.isPro(c10707l6)).yandex.yandex);
                    C11090l c11090lYandex6 = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l6)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
                    C3790l c3790l6 = new C3790l(i9, 3, 119);
                    i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
                    objM2132native2 = c6956l.m2132native();
                    if (i12 == 0) {
                        objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC11780l interfaceC11780l8 = c17253l;
                    AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex6, c3790l6, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l6, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l8, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
                    c11090l2 = c11090l3;
                    function3 = function4;
                    interfaceC11780l2 = interfaceC11780l8;
                } else {
                    c6956l.m2124else();
                    function3 = function2;
                    interfaceC11780l2 = c17253l;
                }
                c2403l3 = c2403l2;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؗؔؓ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC10704l.purchase(str, function1, function3, interfaceC17242l, c11090l2, c15578l, c15578l2, c15578l3, interfaceC11780l2, c2403l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 805306368;
            c2403l2 = c2403l;
            i9 = 0;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i4 & 1, z)) {
                c6956l.m2141switch();
                i10 = i & 1;
                c13863l = C1867l.yandex;
                if (i10 != 0) {
                    if (i14 != 0) {
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == c13863l) {
                            objM2132native = new C6573l(26);
                            c6956l.m2147try(objM2132native);
                        }
                        function2 = (Function0) objM2132native;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                    }
                    if (i5 != 0) {
                        c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                    }
                    if (i7 != 0) {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                        c2403l2 = null;
                    } else {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                    }
                } else {
                    if (i14 != 0) {
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == c13863l) {
                            objM2132native = new C6573l(26);
                            c6956l.m2147try(objM2132native);
                        }
                        function2 = (Function0) objM2132native;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                    }
                    if (i5 != 0) {
                        c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                    }
                    if (i7 != 0) {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                        c2403l2 = null;
                    } else {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                    }
                }
                c6956l.adcel();
                interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
                C10707l c10707l7 = AbstractC16964l.yandex;
                C8990l c8990l7 = new C8990l(((C14370l) c6956l.isPro(c10707l7)).yandex.yandex);
                C11090l c11090lYandex7 = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l7)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
                C3790l c3790l7 = new C3790l(i9, 3, 119);
                i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
                objM2132native2 = c6956l.m2132native();
                if (i12 == 0) {
                    objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC11780l interfaceC11780l9 = c17253l;
                AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex7, c3790l7, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l7, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l9, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
                c11090l2 = c11090l3;
                function3 = function4;
                interfaceC11780l2 = interfaceC11780l9;
            } else {
                c6956l.m2124else();
                function3 = function2;
                interfaceC11780l2 = c17253l;
            }
            c2403l3 = c2403l2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؗؔؓ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC10704l.purchase(str, function1, function3, interfaceC17242l, c11090l2, c15578l, c15578l2, c15578l3, interfaceC11780l2, c2403l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 100663296;
        c17253l = interfaceC11780l;
        i7 = i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        if (i7 != 0) {
            if ((i & 805306368) == 0) {
                c2403l2 = c2403l;
                if (c6956l.billing(c2403l2)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i4 |= i8;
            }
            i9 = 0;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i4 & 1, z)) {
                c6956l.m2141switch();
                i10 = i & 1;
                c13863l = C1867l.yandex;
                if (i10 != 0) {
                    if (i14 != 0) {
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == c13863l) {
                            objM2132native = new C6573l(26);
                            c6956l.m2147try(objM2132native);
                        }
                        function2 = (Function0) objM2132native;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                    }
                    if (i5 != 0) {
                        c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                    }
                    if (i7 != 0) {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                        c2403l2 = null;
                    } else {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                    }
                } else {
                    if (i14 != 0) {
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == c13863l) {
                            objM2132native = new C6573l(26);
                            c6956l.m2147try(objM2132native);
                        }
                        function2 = (Function0) objM2132native;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                    }
                    if (i5 != 0) {
                        c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                    }
                    if (i7 != 0) {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                        c2403l2 = null;
                    } else {
                        i11 = i4;
                        function4 = function2;
                        c11090l3 = c11090l2;
                    }
                }
                c6956l.adcel();
                interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
                C10707l c10707l8 = AbstractC16964l.yandex;
                C8990l c8990l8 = new C8990l(((C14370l) c6956l.isPro(c10707l8)).yandex.yandex);
                C11090l c11090lYandex8 = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l8)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
                C3790l c3790l8 = new C3790l(i9, 3, 119);
                i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
                objM2132native2 = c6956l.m2132native();
                if (i12 == 0) {
                    objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC11780l interfaceC11780l10 = c17253l;
                AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex8, c3790l8, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l8, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l10, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
                c11090l2 = c11090l3;
                function3 = function4;
                interfaceC11780l2 = interfaceC11780l10;
            } else {
                c6956l.m2124else();
                function3 = function2;
                interfaceC11780l2 = c17253l;
            }
            c2403l3 = c2403l2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؗؔؓ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC10704l.purchase(str, function1, function3, interfaceC17242l, c11090l2, c15578l, c15578l2, c15578l3, interfaceC11780l2, c2403l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 805306368;
        c2403l2 = c2403l;
        i9 = 0;
        if ((306783379 & i4) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i4 & 1, z)) {
            c6956l.m2141switch();
            i10 = i & 1;
            c13863l = C1867l.yandex;
            if (i10 != 0) {
                if (i14 != 0) {
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = new C6573l(26);
                        c6956l.m2147try(objM2132native);
                    }
                    function2 = (Function0) objM2132native;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                }
                if (i5 != 0) {
                    c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                }
                if (i7 != 0) {
                    i11 = i4;
                    function4 = function2;
                    c11090l3 = c11090l2;
                    c2403l2 = null;
                } else {
                    i11 = i4;
                    function4 = function2;
                    c11090l3 = c11090l2;
                }
            } else {
                if (i14 != 0) {
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = new C6573l(26);
                        c6956l.m2147try(objM2132native);
                    }
                    function2 = (Function0) objM2132native;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    c11090l2 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                }
                if (i5 != 0) {
                    c17253l = new C17253l(8.0f, 8.0f, 8.0f, 8.0f);
                }
                if (i7 != 0) {
                    i11 = i4;
                    function4 = function2;
                    c11090l3 = c11090l2;
                    c2403l2 = null;
                } else {
                    i11 = i4;
                    function4 = function2;
                    c11090l3 = c11090l2;
                }
            }
            c6956l.adcel();
            interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
            C10707l c10707l9 = AbstractC16964l.yandex;
            C8990l c8990l9 = new C8990l(((C14370l) c6956l.isPro(c10707l9)).yandex.yandex);
            C11090l c11090lYandex9 = C11090l.yandex(c11090l3, ((C14370l) c6956l.isPro(c10707l9)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214);
            C3790l c3790l9 = new C3790l(i9, 3, 119);
            i12 = ((i11 & 896) == 256 ? 1 : 0) | (c6956l.admob(interfaceC6497l) ? 1 : 0);
            objM2132native2 = c6956l.m2132native();
            if (i12 == 0) {
                objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C8854l(function4, interfaceC6497l, 17);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC11780l interfaceC11780l11 = c17253l;
            AbstractC16363l.amazon(str, function1, interfaceC17242l, false, c11090lYandex9, c3790l9, new C6973l(null, (Function1) objM2132native2, 47), true, 0, 0, null, null, c2403l2, c8990l9, AbstractC14566l.amazon(80549131, new C2669l(interfaceC11780l11, c15578l, c15578l3, str, c11090l3, c15578l2, 3), c6956l), c6956l, (i11 & 14) | 102236160 | (i11 & 112) | ((i11 >> 3) & 896), ((i11 >> 18) & 7168) | 196608, 7704);
            c11090l2 = c11090l3;
            function3 = function4;
            interfaceC11780l2 = interfaceC11780l11;
        } else {
            c6956l.m2124else();
            function3 = function2;
            interfaceC11780l2 = c17253l;
        }
        c2403l3 = c2403l2;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؗؔؓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC10704l.purchase(str, function1, function3, interfaceC17242l, c11090l2, c15578l, c15578l2, c15578l3, interfaceC11780l2, c2403l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void yandex(String str, String str2, String str3, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C15578l c15578lAmazon;
        c6956l.m2133new(1438658080);
        int i2 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.billing(str2) ? 32 : 16) | (c6956l.billing(str3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            if (str3.length() > 0) {
                c6956l.m2123default(-415403458);
                c15578lAmazon = AbstractC14566l.amazon(-1530915169, new C4210l(str3, 13), c6956l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-415332035);
                c6956l.startapp(false);
                c15578lAmazon = null;
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-1280103298, new C4210l(str2, 14), c6956l), interfaceC17242l, null, c15578lAmazon, AbstractC14566l.amazon(1613058434, new C4210l(str, 15), c6956l), null, null, c6956l, ((i2 >> 6) & 112) | 24582, 484);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(str, str2, str3, interfaceC17242l, i, 10);
        }
    }
}
