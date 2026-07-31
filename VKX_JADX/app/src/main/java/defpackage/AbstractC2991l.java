package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۣؔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2991l {
    public static ExecutorService yandex;
    public static final int[] loadAd = {1, 2, 3, 6};
    public static final int[] crashlytics = {48000, 44100, 32000};
    public static final int[] amazon = {24000, 22050, AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE};
    public static final int[] purchase = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] billing = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 320, 384, 448, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 576, 640};
    public static final int[] mopub = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static C15004l[] admob = new C15004l[0];

    public static final void admob(InterfaceC11730l interfaceC11730l, char c) {
        interfaceC11730l.amazon(String.valueOf(c));
    }

    public static final void amazon(String str, String str2, Function1 function1, C6956l c6956l, int i) {
        String str3;
        Function1 function2;
        c6956l.m2133new(-1551197982);
        int i2 = i | 24960;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = new C1698l(5);
                c6956l.m2147try(objM2132native);
            }
            Function1 function3 = (Function1) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                SharedPreferences sharedPreferences = AbstractC3957l.amazon;
                Object c11279l = new C11279l(sharedPreferences != null ? sharedPreferences : null, str, false, function3, new C1698l(7));
                c6956l.m2147try(c11279l);
                objM2132native2 = c11279l;
            }
            C11279l c11279l2 = (C11279l) objM2132native2;
            c6956l.m2123default(2109515355);
            c6956l.startapp(false);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(c11279l2);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob || objM2132native3 == obj) {
                objM2132native3 = new C10832l(0, c11279l2, C11279l.class, "switch", "switch()V", 0, 0, 7);
                c6956l.m2147try(objM2132native3);
            }
            str3 = str2;
            AbstractC13319l.yandex(AbstractC14566l.amazon(2013501892, new C4210l(str3, 18), c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native3), 15), null, null, null, AbstractC14566l.amazon(-1178722465, new C3083l(c11279l2, i3), c6956l), null, c6956l, 196614, 468);
            function2 = function3;
        } else {
            str3 = str2;
            c6956l.m2124else();
            function2 = function1;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(str, str3, function2, i, 2);
        }
    }

    public static final void billing(String str, int i, String str2, Throwable th) {
        String strConcat;
        for (C15004l c15004l : admob) {
            c15004l.getClass();
            if (th != null) {
                StringWriter stringWriter = new StringWriter(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                strConcat = str2.concat("\n".concat(stringWriter.toString()));
            } else {
                strConcat = str2;
            }
            Log.println(i, str, strConcat);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x016b  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void crashlytics(final String str, final int i, int i2, final boolean z, boolean z2, Function1 function1, C6956l c6956l, final int i3, final int i4) {
        String str2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        Function1 function2;
        int i9;
        int i10;
        byte b;
        boolean z4;
        final int i11;
        final boolean z5;
        final Function1 function3;
        C4224l c4224lAds;
        int i12;
        boolean z6;
        Object obj;
        Function1 function4;
        Object objM2132native;
        C11279l c11279l;
        C15578l c15578l;
        boolean zAdmob;
        Object objM2132native2;
        Object objM2132native3;
        c6956l.m2133new(-209309724);
        if ((i3 & 6) == 0) {
            str2 = str;
            i5 = (c6956l.billing(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i5 = i3;
        }
        int i13 = i5 | (c6956l.amazon(i) ? 32 : 16);
        int i14 = i4 & 4;
        if (i14 != 0) {
            i7 = i13 | 384;
            i6 = i2;
        } else {
            i6 = i2;
            i7 = i13 | (c6956l.amazon(i6) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i15 = i4 & 16;
        if (i15 == 0) {
            if ((i3 & 24576) == 0) {
                z3 = z2;
                i7 |= c6956l.mopub(z3) ? 16384 : 8192;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                i10 = i7 | 196608;
                function2 = function1;
            } else {
                function2 = function1;
                if (c6956l.admob(function2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i10 = i7 | i9;
            }
            b = 0;
            if ((74899 & i10) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c6956l.m2127for(i10 & 1, z4)) {
                if (i14 != 0) {
                    i12 = 0;
                } else {
                    i12 = i6;
                }
                if (i15 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                obj = C1867l.yandex;
                if (i8 != 0) {
                    objM2132native3 = c6956l.m2132native();
                    if (objM2132native3 == obj) {
                        objM2132native3 = new C1698l(9);
                        c6956l.m2147try(objM2132native3);
                    }
                    function4 = (Function1) objM2132native3;
                } else {
                    function4 = function2;
                }
                objM2132native = c6956l.m2132native();
                if (objM2132native != obj) {
                    SharedPreferences sharedPreferences = z6 ? null : null;
                    objM2132native = new C11279l(sharedPreferences, str2, z, function4, new C1698l(7));
                    c6956l.m2147try(objM2132native);
                }
                c11279l = (C11279l) objM2132native;
                if (i12 != 0) {
                    c6956l.m2123default(747038137);
                    C15578l c15578lAmazon = AbstractC14566l.amazon(713203909, new C4314l(i12, 20, b), c6956l);
                    c6956l.startapp(false);
                    c15578l = c15578lAmazon;
                } else {
                    c6956l.m2123default(747141273);
                    c6956l.startapp(false);
                    c15578l = null;
                }
                InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                zAdmob = c6956l.admob(c11279l);
                objM2132native2 = c6956l.m2132native();
                if (zAdmob || objM2132native2 == obj) {
                    objM2132native2 = new C10832l(0, c11279l, C11279l.class, "switch", "switch()V", 0, 0, 6);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC13319l.yandex(AbstractC14566l.amazon(-1916633018, new C4314l(i, 19, b), c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, c15578l, null, AbstractC14566l.amazon(1257376545, new C3083l(c11279l, b), c6956l), null, c6956l, 196614, 468);
                function3 = function4;
                i11 = i12;
                z5 = z6;
            } else {
                c6956l.m2124else();
                i11 = i6;
                z5 = z3;
                function3 = function2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؒۖۡ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        AbstractC2991l.crashlytics(str, i, i11, z, z5, function3, (C6956l) obj2, AbstractC0545l.purchase(i3 | 1), i4);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i7 |= 24576;
        z3 = z2;
        i8 = i4 & 32;
        if (i8 != 0) {
            i10 = i7 | 196608;
            function2 = function1;
        } else {
            function2 = function1;
            if (c6956l.admob(function2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i10 = i7 | i9;
        }
        b = 0;
        if ((74899 & i10) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c6956l.m2127for(i10 & 1, z4)) {
            if (i14 != 0) {
                i12 = 0;
            } else {
                i12 = i6;
            }
            if (i15 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            obj = C1867l.yandex;
            if (i8 != 0) {
                objM2132native3 = c6956l.m2132native();
                if (objM2132native3 == obj) {
                    objM2132native3 = new C1698l(9);
                    c6956l.m2147try(objM2132native3);
                }
                function4 = (Function1) objM2132native3;
            } else {
                function4 = function2;
            }
            objM2132native = c6956l.m2132native();
            if (objM2132native != obj) {
                if (z6) {
                }
                objM2132native = new C11279l(sharedPreferences, str2, z, function4, new C1698l(7));
                c6956l.m2147try(objM2132native);
            }
            c11279l = (C11279l) objM2132native;
            if (i12 != 0) {
                c6956l.m2123default(747038137);
                C15578l c15578lAmazon2 = AbstractC14566l.amazon(713203909, new C4314l(i12, 20, b), c6956l);
                c6956l.startapp(false);
                c15578l = c15578lAmazon2;
            } else {
                c6956l.m2123default(747141273);
                c6956l.startapp(false);
                c15578l = null;
            }
            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            zAdmob = c6956l.admob(c11279l);
            objM2132native2 = c6956l.m2132native();
            if (zAdmob) {
                objM2132native2 = new C10832l(0, c11279l, C11279l.class, "switch", "switch()V", 0, 0, 6);
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C10832l(0, c11279l, C11279l.class, "switch", "switch()V", 0, 0, 6);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-1916633018, new C4314l(i, 19, b), c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, c15578l, null, AbstractC14566l.amazon(1257376545, new C3083l(c11279l, b), c6956l), null, c6956l, 196614, 468);
            function3 = function4;
            i11 = i12;
            z5 = z6;
        } else {
            c6956l.m2124else();
            i11 = i6;
            z5 = z3;
            function3 = function2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؒۖۡ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC2991l.crashlytics(str, i, i11, z, z5, function3, (C6956l) obj2, AbstractC0545l.purchase(i3 | 1), i4);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static synchronized Executor firebase() {
        try {
            if (yandex == null) {
                String str = AbstractC15323l.yandex;
                yandex = Executors.newSingleThreadExecutor(new ThreadFactoryC17493l("ExoPlayer:BackgroundExecutor", 2));
            }
        } catch (Throwable th) {
            throw th;
        }
        return yandex;
    }

    public static void isPro(String str, String str2, Exception exc) {
        String strRemoteconfig = remoteconfig(str);
        if (Log.isLoggable(strRemoteconfig, 6)) {
            Log.e(strRemoteconfig, str2, exc);
        }
    }

    public static final void loadAd(Function1 function1, C6956l c6956l, int i) {
        Function1 function2;
        c6956l.m2133new(1045600533);
        int i2 = (c6956l.amazon(R.string.st_ac) ? 32 : 16) | i | (c6956l.amazon(R.array.AutoCacheConfig) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.amazon(R.array.AutoCacheConfigValues) ? 2048 : 1024) | 196608;
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C1698l(6);
                c6956l.m2147try(objM2132native);
            }
            function2 = (Function1) objM2132native;
            C8540l c8540l = AbstractC1242l.crashlytics;
            Object[] stringArray = ((Resources) c6956l.isPro(c8540l)).getStringArray(R.array.AutoCacheConfig);
            String[] stringArray2 = ((Resources) c6956l.isPro(c8540l)).getStringArray(R.array.AutoCacheConfigValues);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                SharedPreferences sharedPreferences = AbstractC3957l.amazon;
                if (sharedPreferences == null) {
                    sharedPreferences = null;
                }
                objM2132native2 = new C17310l(sharedPreferences, function2);
                c6956l.m2147try(objM2132native2);
            }
            C17310l c17310l = (C17310l) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native3;
            boolean zBilling = c6956l.billing((String) c17310l.crashlytics.getValue());
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling || objM2132native4 == c13863l) {
                objM2132native4 = stringArray[AbstractC8669l.m2398catch((String) c17310l.crashlytics.getValue(), stringArray2)];
                c6956l.m2147try(objM2132native4);
            }
            String str = (String) objM2132native4;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            Object objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == c13863l) {
                objM2132native5 = new C0289l(interfaceC8714l, 28);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-819931789, new C14813l(b, 3), c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native5, 15), null, AbstractC14566l.amazon(1967383606, new C4210l(str, 17), c6956l), null, AbstractC14566l.amazon(-1901029192, new C2104l(interfaceC8714l, stringArray2, c17310l, stringArray, 18), c6956l), null, c6956l, 199686, 468);
        } else {
            c6956l.m2124else();
            function2 = function1;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C18039l(i, function2);
        }
    }

    public static final void mopub(InterfaceC11730l interfaceC11730l, Function1[] function1Arr, Function1 function1) {
        if (!(interfaceC11730l instanceof InterfaceC17211l)) {
            C8339l.smaato("impossible");
            return;
        }
        Function1[] function1Arr2 = (Function1[]) Arrays.copyOf(function1Arr, function1Arr.length);
        AbstractC9464l.purchase(1, function1);
        ((InterfaceC17211l) interfaceC11730l).subs(function1Arr2, function1);
    }

    public static final void purchase(final C4348l c4348l, boolean z, Function1 function1, Function1 function2, C6956l c6956l, int i, int i2) {
        boolean z2;
        int i3;
        Function1 function3;
        int i4;
        Function1 function4;
        int i5;
        boolean z3;
        Function1 function5;
        Function1 function6;
        Function1 function7;
        Function1 function8;
        C15578l c15578lAmazon;
        c6956l.m2133new(-724741042);
        int i6 = i | (c6956l.admob(c4348l) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (c6956l.mopub(z2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 384;
            function3 = function1;
        } else {
            function3 = function1;
            i4 = i3 | (c6956l.admob(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            function4 = function2;
        } else {
            function4 = function2;
            i5 = i4 | (c6956l.admob(function4) ? 2048 : 1024);
        }
        final int i10 = 0;
        final int i11 = 1;
        if (c6956l.m2127for(i5 & 1, (i5 & 1171) != 1170)) {
            final boolean z4 = i7 != 0 ? true : z2;
            C13863l c13863l = C1867l.yandex;
            if (i8 != 0) {
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == c13863l) {
                    objM2132native = new C1698l(7);
                    c6956l.m2147try(objM2132native);
                }
                function7 = (Function1) objM2132native;
            } else {
                function7 = function3;
            }
            if (i9 != 0) {
                Object objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = new C1698l(8);
                    c6956l.m2147try(objM2132native2);
                }
                function8 = (Function1) objM2132native2;
            } else {
                function8 = function4;
            }
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                SharedPreferences sharedPreferences = AbstractC13273l.billing;
                C11279l c11279l = new C11279l(sharedPreferences != null ? sharedPreferences : null, c4348l.yandex, ((Boolean) c4348l.crashlytics).booleanValue(), function8, function7);
                c6956l.m2147try(c11279l);
                objM2132native3 = c11279l;
            }
            C11279l c11279l2 = (C11279l) objM2132native3;
            if (c4348l.purchase != null) {
                c6956l.m2123default(40884372);
                c15578lAmazon = AbstractC14566l.amazon(2103377805, new Function2() { // from class: lؙۥؓ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i12 = i10;
                        C4346l c4346l = C4346l.f8873l;
                        boolean z5 = z4;
                        C4348l c4348l2 = c4348l;
                        switch (i12) {
                            case 0:
                                C6956l c6956l2 = (C6956l) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (c6956l2.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    Integer num = c4348l2.purchase;
                                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, num != null ? num.intValue() : 0), AbstractC15788l.yandex(c4346l, z5 ? 1.0f : 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262140);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l3 = (C6956l) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, c4348l2.amazon), AbstractC15788l.yandex(c4346l, z5 ? 1.0f : 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262140);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, c6956l);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(41105711);
                c6956l.startapp(false);
                c15578lAmazon = null;
            }
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(c11279l2);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob || objM2132native4 == c13863l) {
                objM2132native4 = new C10832l(0, c11279l2, C11279l.class, "switch", "switch()V", 0, 0, 8);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-2112155604, new Function2() { // from class: lؙۥؓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i12 = i11;
                    C4346l c4346l = C4346l.f8873l;
                    boolean z5 = z4;
                    C4348l c4348l2 = c4348l;
                    switch (i12) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                                Integer num = c4348l2.purchase;
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, num != null ? num.intValue() : 0), AbstractC15788l.yandex(c4346l, z5 ? 1.0f : 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262140);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, c4348l2.amazon), AbstractC15788l.yandex(c4346l, z5 ? 1.0f : 0.75f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262140);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, z4, null, (Function0) ((InterfaceC5059l) objM2132native4), 14), null, c15578lAmazon, null, AbstractC14566l.amazon(1792860337, new C7371l(z4, c11279l2, 10), c6956l), null, c6956l, 196614, 468);
            z3 = z4;
            function6 = function8;
            function5 = function7;
        } else {
            c6956l.m2124else();
            z3 = z2;
            function5 = function3;
            function6 = function4;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5485l(c4348l, z3, function5, function6, i, i2);
        }
    }

    public static String remoteconfig(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static int smaato(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = crashlytics[i];
        if (i4 == 44100) {
            return ((i2 % 2) + mopub[i3]) * 2;
        }
        int i5 = billing[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static void startapp(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C6541l.subs(AbstractC0653l.vip(i2, "at index "));
                return;
            }
        }
    }

    public static void subs(String str, String str2, Object obj) {
        String strRemoteconfig = remoteconfig(str);
        if (Log.isLoggable(strRemoteconfig, 3)) {
            Log.d(strRemoteconfig, String.format(str2, obj));
        }
    }

    public static final void vip(InterfaceC11730l interfaceC11730l, String str, Function1 function1) {
        if (!(interfaceC11730l instanceof InterfaceC17211l)) {
            C8339l.smaato("impossible");
        } else {
            AbstractC9464l.purchase(1, function1);
            ((InterfaceC17211l) interfaceC11730l).crashlytics(str, function1);
        }
    }

    public static final void yandex(String str, C6956l c6956l, int i) {
        c6956l.m2133new(-753066479);
        int i2 = i | (c6956l.billing(str) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC13010l.loadAd(str, AbstractC3605l.remoteconfig(C4346l.f8873l, 16.0f, 12.0f), C9735l.loadAd(0.7f, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, (i2 & 14) | 48, 0, 262136);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4210l(str, i, 16);
        }
    }
}
