package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SizeF;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3308l {
    public static volatile Handler yandex;
    public static final C4733l loadAd = new C4733l(C13618l.class, new C10754l(20));
    public static final C8873l crashlytics = new C8873l("type.googleapis.com/google.crypto.tink.XAesGcmKey", new C10754l(21));
    public static final C5773l amazon = new C5773l(C2846l.class, new C10754l(22));
    public static final C9439l purchase = new C9439l("type.googleapis.com/google.crypto.tink.XAesGcmKey", new C10754l(23));

    public static final String admob(String str, String str2) {
        return str.length() == 0 ? str2 : AbstractC11043l.admob('.', str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void amazon(boolean z, InterfaceC17242l interfaceC17242l, C3000l c3000l, C0274l c0274l, String str, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        C3000l c3000l2;
        int i5;
        int i6;
        C0274l c0274l2;
        int i7;
        int i8;
        C15578l c15578l2;
        boolean z2;
        InterfaceC17242l interfaceC17242l3;
        C3000l c3000lYandex;
        C0274l c0274lYandex;
        String str2;
        C4224l c4224lAds;
        float f;
        Object objM2132native;
        int i9;
        C14855l c14855l = C18450l.f36032l;
        c6956l.m2133new(-1448730565);
        if ((i & 6) == 0) {
            i3 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    c3000l2 = c3000l;
                    if (c6956l.billing(c3000l2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        c0274l2 = c0274l;
                        if (c6956l.billing(c0274l2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 24576;
                    if ((196608 & i) == 0) {
                        c15578l2 = c15578l;
                        if (c6956l.admob(c15578l2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i8 |= i9;
                    } else {
                        c15578l2 = c15578l;
                    }
                    if ((74899 & i8) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c6956l.m2127for(i8 & 1, z2)) {
                        if (i10 != 0) {
                            interfaceC17242l3 = C4346l.f8873l;
                        } else {
                            interfaceC17242l3 = interfaceC17242l2;
                        }
                        if (i4 != 0) {
                            C3000l c3000lPurchase = AbstractC4523l.purchase(null, 3);
                            C8896l c8896l = AbstractC11922l.yandex;
                            f = 0.0f;
                            c3000lYandex = c3000lPurchase.yandex(AbstractC4523l.crashlytics(c14855l, AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31849l));
                        } else {
                            f = 0.0f;
                            c3000lYandex = c3000l2;
                        }
                        if (i6 != 0) {
                            C0010l c0010l = AbstractC4523l.yandex;
                            C8896l c8896l2 = AbstractC11922l.yandex;
                            c0274lYandex = AbstractC4523l.admob(c14855l, AbstractC0532l.admob(f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31864l).yandex(AbstractC4523l.billing(null, 3));
                        } else {
                            c0274lYandex = c0274l2;
                        }
                        C18656l c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, (i8 & 14) | ((i8 >> 9) & 112), 0);
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == C1867l.yandex) {
                            objM2132native = C11192l.f22525l;
                            c6956l.m2147try(objM2132native);
                        }
                        int i11 = i8 << 3;
                        purchase(c18656lIsPro, (Function1) objM2132native, interfaceC17242l3, c3000lYandex, c0274lYandex, c15578l2, c6956l, (i11 & 896) | 48 | (i11 & 7168) | (57344 & i11) | (i11 & 3670016));
                        str2 = "AnimatedVisibility";
                    } else {
                        c6956l.m2124else();
                        interfaceC17242l3 = interfaceC17242l2;
                        c3000lYandex = c3000l2;
                        c0274lYandex = c0274l2;
                        str2 = str;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new C9242l(z, interfaceC17242l3, c3000lYandex, c0274lYandex, str2, c15578l, i, i2);
                    }
                }
                i3 |= 3072;
                c0274l2 = c0274l;
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    c15578l2 = c15578l;
                    if (c6956l.admob(c15578l2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                } else {
                    c15578l2 = c15578l;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i8 & 1, z2)) {
                    if (i10 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l2;
                    }
                    if (i4 != 0) {
                        C3000l c3000lPurchase2 = AbstractC4523l.purchase(null, 3);
                        C8896l c8896l3 = AbstractC11922l.yandex;
                        f = 0.0f;
                        c3000lYandex = c3000lPurchase2.yandex(AbstractC4523l.crashlytics(c14855l, AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31849l));
                    } else {
                        f = 0.0f;
                        c3000lYandex = c3000l2;
                    }
                    if (i6 != 0) {
                        C0010l c0010l2 = AbstractC4523l.yandex;
                        C8896l c8896l4 = AbstractC11922l.yandex;
                        c0274lYandex = AbstractC4523l.admob(c14855l, AbstractC0532l.admob(f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31864l).yandex(AbstractC4523l.billing(null, 3));
                    } else {
                        c0274lYandex = c0274l2;
                    }
                    C18656l c18656lIsPro2 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = C11192l.f22525l;
                        c6956l.m2147try(objM2132native);
                    }
                    int i12 = i8 << 3;
                    purchase(c18656lIsPro2, (Function1) objM2132native, interfaceC17242l3, c3000lYandex, c0274lYandex, c15578l2, c6956l, (i12 & 896) | 48 | (i12 & 7168) | (57344 & i12) | (i12 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    c3000lYandex = c3000l2;
                    c0274lYandex = c0274l2;
                    str2 = str;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C9242l(z, interfaceC17242l3, c3000lYandex, c0274lYandex, str2, c15578l, i, i2);
                }
            }
            i3 |= 384;
            c3000l2 = c3000l;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    c0274l2 = c0274l;
                    if (c6956l.billing(c0274l2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    c15578l2 = c15578l;
                    if (c6956l.admob(c15578l2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                } else {
                    c15578l2 = c15578l;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i8 & 1, z2)) {
                    if (i10 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l2;
                    }
                    if (i4 != 0) {
                        C3000l c3000lPurchase3 = AbstractC4523l.purchase(null, 3);
                        C8896l c8896l5 = AbstractC11922l.yandex;
                        f = 0.0f;
                        c3000lYandex = c3000lPurchase3.yandex(AbstractC4523l.crashlytics(c14855l, AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31849l));
                    } else {
                        f = 0.0f;
                        c3000lYandex = c3000l2;
                    }
                    if (i6 != 0) {
                        C0010l c0010l3 = AbstractC4523l.yandex;
                        C8896l c8896l6 = AbstractC11922l.yandex;
                        c0274lYandex = AbstractC4523l.admob(c14855l, AbstractC0532l.admob(f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31864l).yandex(AbstractC4523l.billing(null, 3));
                    } else {
                        c0274lYandex = c0274l2;
                    }
                    C18656l c18656lIsPro3 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = C11192l.f22525l;
                        c6956l.m2147try(objM2132native);
                    }
                    int i13 = i8 << 3;
                    purchase(c18656lIsPro3, (Function1) objM2132native, interfaceC17242l3, c3000lYandex, c0274lYandex, c15578l2, c6956l, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    c3000lYandex = c3000l2;
                    c0274lYandex = c0274l2;
                    str2 = str;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C9242l(z, interfaceC17242l3, c3000lYandex, c0274lYandex, str2, c15578l, i, i2);
                }
            }
            i3 |= 3072;
            c0274l2 = c0274l;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                c15578l2 = c15578l;
                if (c6956l.admob(c15578l2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            } else {
                c15578l2 = c15578l;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i8 & 1, z2)) {
                if (i10 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l2;
                }
                if (i4 != 0) {
                    C3000l c3000lPurchase4 = AbstractC4523l.purchase(null, 3);
                    C8896l c8896l7 = AbstractC11922l.yandex;
                    f = 0.0f;
                    c3000lYandex = c3000lPurchase4.yandex(AbstractC4523l.crashlytics(c14855l, AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31849l));
                } else {
                    f = 0.0f;
                    c3000lYandex = c3000l2;
                }
                if (i6 != 0) {
                    C0010l c0010l4 = AbstractC4523l.yandex;
                    C8896l c8896l8 = AbstractC11922l.yandex;
                    c0274lYandex = AbstractC4523l.admob(c14855l, AbstractC0532l.admob(f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31864l).yandex(AbstractC4523l.billing(null, 3));
                } else {
                    c0274lYandex = c0274l2;
                }
                C18656l c18656lIsPro4 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = C11192l.f22525l;
                    c6956l.m2147try(objM2132native);
                }
                int i14 = i8 << 3;
                purchase(c18656lIsPro4, (Function1) objM2132native, interfaceC17242l3, c3000lYandex, c0274lYandex, c15578l2, c6956l, (i14 & 896) | 48 | (i14 & 7168) | (57344 & i14) | (i14 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                c3000lYandex = c3000l2;
                c0274lYandex = c0274l2;
                str2 = str;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C9242l(z, interfaceC17242l3, c3000lYandex, c0274lYandex, str2, c15578l, i, i2);
            }
        }
        i3 |= 48;
        interfaceC17242l2 = interfaceC17242l;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                c3000l2 = c3000l;
                if (c6956l.billing(c3000l2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    c0274l2 = c0274l;
                    if (c6956l.billing(c0274l2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    c15578l2 = c15578l;
                    if (c6956l.admob(c15578l2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                } else {
                    c15578l2 = c15578l;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i8 & 1, z2)) {
                    if (i10 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l2;
                    }
                    if (i4 != 0) {
                        C3000l c3000lPurchase5 = AbstractC4523l.purchase(null, 3);
                        C8896l c8896l9 = AbstractC11922l.yandex;
                        f = 0.0f;
                        c3000lYandex = c3000lPurchase5.yandex(AbstractC4523l.crashlytics(c14855l, AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31849l));
                    } else {
                        f = 0.0f;
                        c3000lYandex = c3000l2;
                    }
                    if (i6 != 0) {
                        C0010l c0010l5 = AbstractC4523l.yandex;
                        C8896l c8896l10 = AbstractC11922l.yandex;
                        c0274lYandex = AbstractC4523l.admob(c14855l, AbstractC0532l.admob(f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31864l).yandex(AbstractC4523l.billing(null, 3));
                    } else {
                        c0274lYandex = c0274l2;
                    }
                    C18656l c18656lIsPro5 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = C11192l.f22525l;
                        c6956l.m2147try(objM2132native);
                    }
                    int i15 = i8 << 3;
                    purchase(c18656lIsPro5, (Function1) objM2132native, interfaceC17242l3, c3000lYandex, c0274lYandex, c15578l2, c6956l, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    c3000lYandex = c3000l2;
                    c0274lYandex = c0274l2;
                    str2 = str;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C9242l(z, interfaceC17242l3, c3000lYandex, c0274lYandex, str2, c15578l, i, i2);
                }
            }
            i3 |= 3072;
            c0274l2 = c0274l;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                c15578l2 = c15578l;
                if (c6956l.admob(c15578l2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            } else {
                c15578l2 = c15578l;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i8 & 1, z2)) {
                if (i10 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l2;
                }
                if (i4 != 0) {
                    C3000l c3000lPurchase6 = AbstractC4523l.purchase(null, 3);
                    C8896l c8896l11 = AbstractC11922l.yandex;
                    f = 0.0f;
                    c3000lYandex = c3000lPurchase6.yandex(AbstractC4523l.crashlytics(c14855l, AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31849l));
                } else {
                    f = 0.0f;
                    c3000lYandex = c3000l2;
                }
                if (i6 != 0) {
                    C0010l c0010l6 = AbstractC4523l.yandex;
                    C8896l c8896l12 = AbstractC11922l.yandex;
                    c0274lYandex = AbstractC4523l.admob(c14855l, AbstractC0532l.admob(f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31864l).yandex(AbstractC4523l.billing(null, 3));
                } else {
                    c0274lYandex = c0274l2;
                }
                C18656l c18656lIsPro6 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = C11192l.f22525l;
                    c6956l.m2147try(objM2132native);
                }
                int i16 = i8 << 3;
                purchase(c18656lIsPro6, (Function1) objM2132native, interfaceC17242l3, c3000lYandex, c0274lYandex, c15578l2, c6956l, (i16 & 896) | 48 | (i16 & 7168) | (57344 & i16) | (i16 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                c3000lYandex = c3000l2;
                c0274lYandex = c0274l2;
                str2 = str;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C9242l(z, interfaceC17242l3, c3000lYandex, c0274lYandex, str2, c15578l, i, i2);
            }
        }
        i3 |= 384;
        c3000l2 = c3000l;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                c0274l2 = c0274l;
                if (c6956l.billing(c0274l2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                c15578l2 = c15578l;
                if (c6956l.admob(c15578l2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            } else {
                c15578l2 = c15578l;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i8 & 1, z2)) {
                if (i10 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l2;
                }
                if (i4 != 0) {
                    C3000l c3000lPurchase7 = AbstractC4523l.purchase(null, 3);
                    C8896l c8896l13 = AbstractC11922l.yandex;
                    f = 0.0f;
                    c3000lYandex = c3000lPurchase7.yandex(AbstractC4523l.crashlytics(c14855l, AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31849l));
                } else {
                    f = 0.0f;
                    c3000lYandex = c3000l2;
                }
                if (i6 != 0) {
                    C0010l c0010l7 = AbstractC4523l.yandex;
                    C8896l c8896l14 = AbstractC11922l.yandex;
                    c0274lYandex = AbstractC4523l.admob(c14855l, AbstractC0532l.admob(f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31864l).yandex(AbstractC4523l.billing(null, 3));
                } else {
                    c0274lYandex = c0274l2;
                }
                C18656l c18656lIsPro7 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = C11192l.f22525l;
                    c6956l.m2147try(objM2132native);
                }
                int i17 = i8 << 3;
                purchase(c18656lIsPro7, (Function1) objM2132native, interfaceC17242l3, c3000lYandex, c0274lYandex, c15578l2, c6956l, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                c3000lYandex = c3000l2;
                c0274lYandex = c0274l2;
                str2 = str;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C9242l(z, interfaceC17242l3, c3000lYandex, c0274lYandex, str2, c15578l, i, i2);
            }
        }
        i3 |= 3072;
        c0274l2 = c0274l;
        i8 = i3 | 24576;
        if ((196608 & i) == 0) {
            c15578l2 = c15578l;
            if (c6956l.admob(c15578l2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        } else {
            c15578l2 = c15578l;
        }
        if ((74899 & i8) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i8 & 1, z2)) {
            if (i10 != 0) {
                interfaceC17242l3 = C4346l.f8873l;
            } else {
                interfaceC17242l3 = interfaceC17242l2;
            }
            if (i4 != 0) {
                C3000l c3000lPurchase8 = AbstractC4523l.purchase(null, 3);
                C8896l c8896l15 = AbstractC11922l.yandex;
                f = 0.0f;
                c3000lYandex = c3000lPurchase8.yandex(AbstractC4523l.crashlytics(c14855l, AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31849l));
            } else {
                f = 0.0f;
                c3000lYandex = c3000l2;
            }
            if (i6 != 0) {
                C0010l c0010l8 = AbstractC4523l.yandex;
                C8896l c8896l16 = AbstractC11922l.yandex;
                c0274lYandex = AbstractC4523l.admob(c14855l, AbstractC0532l.admob(f, 400.0f, new C4999l(4294967297L), 1), C16274l.f31864l).yandex(AbstractC4523l.billing(null, 3));
            } else {
                c0274lYandex = c0274l2;
            }
            C18656l c18656lIsPro8 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, (i8 & 14) | ((i8 >> 9) & 112), 0);
            objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C11192l.f22525l;
                c6956l.m2147try(objM2132native);
            }
            int i18 = i8 << 3;
            purchase(c18656lIsPro8, (Function1) objM2132native, interfaceC17242l3, c3000lYandex, c0274lYandex, c15578l2, c6956l, (i18 & 896) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
            c3000lYandex = c3000l2;
            c0274lYandex = c0274l2;
            str2 = str;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9242l(z, interfaceC17242l3, c3000lYandex, c0274lYandex, str2, c15578l, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    public static final void billing(int i, final long j, C6956l c6956l, InterfaceC18579l interfaceC18579l, Function2 function2) {
        List listRemoteconfig;
        Object next;
        C8195l c8195l;
        List listSingletonList;
        ?? SingletonList;
        ?? SingletonList2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(361732211);
        int i2 = 16;
        Function2 function3 = function2;
        int i3 = i | (c6956l.billing(interfaceC18579l) ? 4 : 2) | (c6956l2.purchase(j) ? 32 : 16) | (c6956l2.admob(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if ((i3 & 147) == 146 && c6956l2.isVip()) {
            c6956l2.m2124else();
        } else {
            if (interfaceC18579l instanceof C7261l) {
                SingletonList2 = Collections.singletonList(new C2261l(j));
            } else {
                boolean z = true;
                boolean z2 = false;
                if (!(interfaceC18579l instanceof C13418l)) {
                    if (!(interfaceC18579l instanceof C18698l)) {
                        C18725l.billing();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        c6956l2.m2123default(292006649);
                        c6956l2.startapp(false);
                        SingletonList2 = ((C18698l) interfaceC18579l).yandex;
                    } else {
                        c6956l2.m2123default(292075221);
                        Set set = ((C18698l) interfaceC18579l).yandex;
                        long j2 = ((C2261l) AbstractC16901l.m4243this(set, AbstractC2920l.loadAd(new C13206l(15), new C13206l(i2))).get(0)).yandex;
                        ArrayList arrayListPurchase = AbstractC13743l.purchase((Bundle) c6956l2.isPro(AbstractC3941l.yandex));
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListPurchase, 10));
                        Iterator it = arrayListPurchase.iterator();
                        while (it.hasNext()) {
                            boolean z3 = z;
                            long j3 = ((C2261l) it.next()).yandex;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = set.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                boolean z4 = z2;
                                Set set2 = set;
                                long j4 = ((C2261l) it2.next()).yandex;
                                if (((float) Math.ceil(C2261l.loadAd(j3))) + 1.0f <= C2261l.loadAd(j4) || ((float) Math.ceil(C2261l.yandex(j3))) + 1.0f <= C2261l.yandex(j4)) {
                                    c8195l = null;
                                } else {
                                    C2261l c2261l = new C2261l(j4);
                                    float fLoadAd = C2261l.loadAd(j3) - C2261l.loadAd(j4);
                                    float fYandex = C2261l.yandex(j3) - C2261l.yandex(j4);
                                    c8195l = new C8195l(c2261l, Float.valueOf((fYandex * fYandex) + (fLoadAd * fLoadAd)));
                                }
                                if (c8195l != null) {
                                    arrayList2.add(c8195l);
                                }
                                z2 = z4;
                                set = set2;
                            }
                            Set set3 = set;
                            boolean z5 = z2;
                            Iterator it3 = arrayList2.iterator();
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (it3.hasNext()) {
                                    float fFloatValue = ((Number) ((C8195l) next).f17097l).floatValue();
                                    do {
                                        Object next2 = it3.next();
                                        float fFloatValue2 = ((Number) ((C8195l) next2).f17097l).floatValue();
                                        if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                                            next = next2;
                                            fFloatValue = fFloatValue2;
                                        }
                                    } while (it3.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            C8195l c8195l2 = (C8195l) next;
                            C2261l c2261l2 = c8195l2 != null ? (C2261l) c8195l2.f17098l : null;
                            arrayList.add(new C2261l(c2261l2 != null ? c2261l2.yandex : j2));
                            z = z3;
                            z2 = z5;
                            set = set3;
                        }
                        boolean z6 = z;
                        boolean z7 = z2;
                        if (arrayList.isEmpty()) {
                            C2261l c2261l3 = new C2261l(j2);
                            C2261l c2261l4 = new C2261l(j2);
                            C2261l[] c2261lArr = new C2261l[2];
                            c2261lArr[z7 ? 1 : 0] = c2261l3;
                            c2261lArr[z6 ? 1 : 0] = c2261l4;
                            listRemoteconfig = AbstractC14055l.remoteconfig(c2261lArr);
                        } else {
                            listRemoteconfig = arrayList;
                        }
                        c6956l2.startapp(z7);
                        SingletonList2 = listRemoteconfig;
                    }
                } else if (Build.VERSION.SDK_INT >= 31) {
                    c6956l2.m2123default(291633998);
                    Bundle bundle = (Bundle) c6956l2.isPro(AbstractC3941l.yandex);
                    boolean z8 = (i3 & 112) == 32;
                    Object objM2132native = c6956l2.m2132native();
                    if (z8 || objM2132native == C1867l.yandex) {
                        objM2132native = new Function0() { // from class: lُْؖ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return new C2261l(j);
                            }
                        };
                        c6956l2.m2147try(objM2132native);
                    }
                    Function0 function0 = (Function0) objM2132native;
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i4 = bundle.getInt("appWidgetMinHeight", 0);
                        int i5 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i6 = bundle.getInt("appWidgetMinWidth", 0);
                        int i7 = bundle.getInt("appWidgetMaxWidth", 0);
                        SingletonList = (i4 == 0 || i5 == 0 || i6 == 0 || i7 == 0) ? Collections.singletonList(function0.invoke()) : AbstractC14055l.remoteconfig(new C2261l(AbstractC9027l.yandex(i6, i5)), new C2261l(AbstractC9027l.yandex(i7, i4)));
                    } else {
                        SingletonList = new ArrayList(AbstractC14055l.billing(parcelableArrayList, 10));
                        for (SizeF sizeF : parcelableArrayList) {
                            SingletonList.add(new C2261l(AbstractC9027l.yandex(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    c6956l2.startapp(false);
                    SingletonList2 = SingletonList;
                } else {
                    c6956l2.m2123default(291738344);
                    ArrayList arrayListPurchase2 = AbstractC13743l.purchase((Bundle) c6956l2.isPro(AbstractC3941l.yandex));
                    if (arrayListPurchase2.isEmpty()) {
                        listSingletonList = arrayListPurchase2;
                        listSingletonList = Collections.singletonList(new C2261l(j));
                    }
                    listSingletonList = arrayListPurchase2;
                    c6956l2.startapp(false);
                    SingletonList2 = listSingletonList;
                }
            }
            List listM4245throws = AbstractC16901l.m4245throws((Iterable) SingletonList2);
            ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(listM4245throws, 10));
            Iterator it4 = listM4245throws.iterator();
            while (it4.hasNext()) {
                mopub((i3 & 896) | ((i3 << 3) & 112), ((C2261l) it4.next()).yandex, c6956l2, interfaceC18579l, function3);
                arrayList3.add(Unit.INSTANCE);
                c6956l2 = c6956l;
                function3 = function2;
            }
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4489l(interfaceC18579l, j, function2, i);
        }
    }

    public static final void crashlytics(InterfaceC15451l interfaceC15451l, boolean z, InterfaceC17242l interfaceC17242l, C3000l c3000l, C0274l c0274l, String str, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        C0274l c0274l2;
        String str2;
        c6956l.m2133new(234057107);
        if ((i & 48) == 0) {
            i3 = (c6956l.mopub(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 |= c6956l.billing(c3000l) ? 2048 : 1024;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= c6956l.billing(c0274l) ? 16384 : 8192;
        }
        int i6 = i4 | 196608;
        if ((1572864 & i) == 0) {
            i6 |= c6956l.admob(c15578l) ? 1048576 : 524288;
        }
        if (c6956l.m2127for(i6 & 1, (599185 & i6) != 599184)) {
            C0274l c0274lYandex = i5 != 0 ? AbstractC4523l.billing(null, 3).yandex(AbstractC4523l.mopub(null, null, 15)) : c0274l;
            C18656l c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, ((i6 >> 3) & 14) | ((i6 >> 12) & 112), 0);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C11192l.f22521l;
                c6956l.m2147try(objM2132native);
            }
            C4346l c4346l = C4346l.f8873l;
            purchase(c18656lIsPro, (Function1) objM2132native, c4346l, c3000l, c0274lYandex, c15578l, c6956l, (i6 & 3670016) | (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6));
            interfaceC17242l2 = c4346l;
            c0274l2 = c0274lYandex;
            str2 = "AnimatedVisibility";
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            c0274l2 = c0274l;
            str2 = str;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4046l(interfaceC15451l, z, interfaceC17242l2, c3000l, c0274l2, str2, c15578l, i, i2, 0);
        }
    }

    public static final EnumC18226l firebase(C18656l c18656l, Function1 function1, Object obj, C6956l c6956l) {
        c6956l.m2121class(-422486690, c18656l);
        boolean zMopub = c18656l.mopub();
        EnumC18226l enumC18226l = EnumC18226l.f35692l;
        EnumC18226l enumC18226l2 = EnumC18226l.f35693l;
        EnumC18226l enumC18226l3 = EnumC18226l.f35694l;
        if (zMopub) {
            c6956l.m2123default(-212166497);
            c6956l.startapp(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enumC18226l = enumC18226l2;
            } else if (!((Boolean) function1.invoke(c18656l.crashlytics())).booleanValue()) {
                enumC18226l = enumC18226l3;
            }
        } else {
            c6956l.m2123default(-211890659);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            if (((Boolean) function1.invoke(c18656l.crashlytics())).booleanValue()) {
                interfaceC8714l.setValue(Boolean.TRUE);
            }
            Object value = c18656l.purchase.getValue();
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enumC18226l = enumC18226l2;
            } else if ((value != null && ((Boolean) function1.invoke(value)).booleanValue()) || !((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                enumC18226l = enumC18226l3;
            }
            c6956l.startapp(false);
        }
        c6956l.startapp(false);
        return enumC18226l;
    }

    public static final /* synthetic */ Integer isPro(int i) {
        Integer numValueOf = Integer.valueOf(i);
        if (i != Integer.MIN_VALUE) {
            return numValueOf;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void loadAd(C0397l c0397l, boolean z, InterfaceC17242l interfaceC17242l, C3000l c3000l, C0274l c0274l, String str, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        C3000l c3000lYandex;
        int i4;
        C0274l c0274lYandex;
        int i5;
        int i6;
        boolean z2;
        InterfaceC17242l interfaceC17242l2;
        String str2;
        C0274l c0274l2;
        C3000l c3000l2;
        C4224l c4224lAds;
        Object objM2132native;
        int i7;
        c6956l.m2133new(1799879339);
        if ((i & 48) == 0) {
            i3 = (c6956l.mopub(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i3 | 384;
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                c3000lYandex = c3000l;
                i8 |= c6956l.billing(c3000lYandex) ? 2048 : 1024;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    c0274lYandex = c0274l;
                    if (c6956l.billing(c0274lYandex)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i8 |= i5;
                }
                i6 = i8 | 196608;
                if ((1572864 & i) == 0) {
                    if (c6956l.admob(c15578l)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i6 |= i7;
                }
                if ((599185 & i6) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i6 & 1, z2)) {
                    if (i9 != 0) {
                        c3000lYandex = AbstractC4523l.purchase(null, 3).yandex(AbstractC4523l.amazon(null, 15));
                    }
                    C3000l c3000l3 = c3000lYandex;
                    if (i4 != 0) {
                        c0274lYandex = AbstractC4523l.billing(null, 3).yandex(AbstractC4523l.subs(null, 15));
                    }
                    C18656l c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, ((i6 >> 3) & 14) | ((i6 >> 12) & 112), 0);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = C11192l.f22520l;
                        c6956l.m2147try(objM2132native);
                    }
                    C4346l c4346l = C4346l.f8873l;
                    purchase(c18656lIsPro, (Function1) objM2132native, c4346l, c3000l3, c0274lYandex, c15578l, c6956l, (i6 & 3670016) | (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6));
                    c0274l2 = c0274lYandex;
                    str2 = "AnimatedVisibility";
                    c3000l2 = c3000l3;
                    interfaceC17242l2 = c4346l;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    str2 = str;
                    c0274l2 = c0274lYandex;
                    c3000l2 = c3000lYandex;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C4046l(c0397l, z, interfaceC17242l2, c3000l2, c0274l2, str2, c15578l, i, i2, 1);
                }
            }
            i8 |= 24576;
            c0274lYandex = c0274l;
            i6 = i8 | 196608;
            if ((1572864 & i) == 0) {
                if (c6956l.admob(c15578l)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i6 |= i7;
            }
            if ((599185 & i6) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i6 & 1, z2)) {
                if (i9 != 0) {
                    c3000lYandex = AbstractC4523l.purchase(null, 3).yandex(AbstractC4523l.amazon(null, 15));
                }
                C3000l c3000l4 = c3000lYandex;
                if (i4 != 0) {
                    c0274lYandex = AbstractC4523l.billing(null, 3).yandex(AbstractC4523l.subs(null, 15));
                }
                C18656l c18656lIsPro2 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, ((i6 >> 3) & 14) | ((i6 >> 12) & 112), 0);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = C11192l.f22520l;
                    c6956l.m2147try(objM2132native);
                }
                C4346l c4346l2 = C4346l.f8873l;
                purchase(c18656lIsPro2, (Function1) objM2132native, c4346l2, c3000l4, c0274lYandex, c15578l, c6956l, (i6 & 3670016) | (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6));
                c0274l2 = c0274lYandex;
                str2 = "AnimatedVisibility";
                c3000l2 = c3000l4;
                interfaceC17242l2 = c4346l2;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                str2 = str;
                c0274l2 = c0274lYandex;
                c3000l2 = c3000lYandex;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C4046l(c0397l, z, interfaceC17242l2, c3000l2, c0274l2, str2, c15578l, i, i2, 1);
            }
        }
        i8 = i3 | 3456;
        c3000lYandex = c3000l;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                c0274lYandex = c0274l;
                if (c6956l.billing(c0274lYandex)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i8 |= i5;
            }
            i6 = i8 | 196608;
            if ((1572864 & i) == 0) {
                if (c6956l.admob(c15578l)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i6 |= i7;
            }
            if ((599185 & i6) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i6 & 1, z2)) {
                if (i9 != 0) {
                    c3000lYandex = AbstractC4523l.purchase(null, 3).yandex(AbstractC4523l.amazon(null, 15));
                }
                C3000l c3000l5 = c3000lYandex;
                if (i4 != 0) {
                    c0274lYandex = AbstractC4523l.billing(null, 3).yandex(AbstractC4523l.subs(null, 15));
                }
                C18656l c18656lIsPro3 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, ((i6 >> 3) & 14) | ((i6 >> 12) & 112), 0);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = C11192l.f22520l;
                    c6956l.m2147try(objM2132native);
                }
                C4346l c4346l3 = C4346l.f8873l;
                purchase(c18656lIsPro3, (Function1) objM2132native, c4346l3, c3000l5, c0274lYandex, c15578l, c6956l, (i6 & 3670016) | (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6));
                c0274l2 = c0274lYandex;
                str2 = "AnimatedVisibility";
                c3000l2 = c3000l5;
                interfaceC17242l2 = c4346l3;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                str2 = str;
                c0274l2 = c0274lYandex;
                c3000l2 = c3000lYandex;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C4046l(c0397l, z, interfaceC17242l2, c3000l2, c0274l2, str2, c15578l, i, i2, 1);
            }
        }
        i8 |= 24576;
        c0274lYandex = c0274l;
        i6 = i8 | 196608;
        if ((1572864 & i) == 0) {
            if (c6956l.admob(c15578l)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i6 |= i7;
        }
        if ((599185 & i6) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i6 & 1, z2)) {
            if (i9 != 0) {
                c3000lYandex = AbstractC4523l.purchase(null, 3).yandex(AbstractC4523l.amazon(null, 15));
            }
            C3000l c3000l6 = c3000lYandex;
            if (i4 != 0) {
                c0274lYandex = AbstractC4523l.billing(null, 3).yandex(AbstractC4523l.subs(null, 15));
            }
            C18656l c18656lIsPro4 = AbstractC2438l.isPro(Boolean.valueOf(z), "AnimatedVisibility", c6956l, ((i6 >> 3) & 14) | ((i6 >> 12) & 112), 0);
            objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C11192l.f22520l;
                c6956l.m2147try(objM2132native);
            }
            C4346l c4346l4 = C4346l.f8873l;
            purchase(c18656lIsPro4, (Function1) objM2132native, c4346l4, c3000l6, c0274lYandex, c15578l, c6956l, (i6 & 3670016) | (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6));
            c0274l2 = c0274lYandex;
            str2 = "AnimatedVisibility";
            c3000l2 = c3000l6;
            interfaceC17242l2 = c4346l4;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            str2 = str;
            c0274l2 = c0274lYandex;
            c3000l2 = c3000lYandex;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4046l(c0397l, z, interfaceC17242l2, c3000l2, c0274l2, str2, c15578l, i, i2, 1);
        }
    }

    public static final void mopub(int i, long j, C6956l c6956l, InterfaceC18579l interfaceC18579l, Function2 function2) {
        c6956l.m2133new(-771692794);
        int i2 = (c6956l.purchase(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c6956l.billing(interfaceC18579l) : c6956l.admob(interfaceC18579l) ? 32 : 16;
        }
        if (((i2 | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128)) & 147) == 146 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            AbstractC10478l.yandex(AbstractC9404l.yandex.yandex(new C2261l(j)), AbstractC14566l.amazon(-367769018, new C4489l(function2, j, interfaceC18579l), c6956l), c6956l, 56);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17027l(j, interfaceC18579l, function2, i, 2);
        }
    }

    public static final void purchase(C18656l c18656l, Function1 function1, InterfaceC17242l interfaceC17242l, C3000l c3000l, C0274l c0274l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        C3000l c3000l2;
        C0274l c0274l2;
        C15578l c15578l2;
        c6956l.m2133new(-497872534);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c18656l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            c3000l2 = c3000l;
            i2 |= c6956l.billing(c3000l2) ? 2048 : 1024;
        } else {
            c3000l2 = c3000l;
        }
        if ((i & 24576) == 0) {
            c0274l2 = c0274l;
            i2 |= c6956l.billing(c0274l2) ? 16384 : 8192;
        } else {
            c0274l2 = c0274l;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            c15578l2 = c15578l;
            i3 |= c6956l.admob(c15578l2) ? 1048576 : 524288;
        } else {
            c15578l2 = c15578l;
        }
        if (c6956l.m2127for(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z || objM2132native == c13863l) {
                objM2132native = new C17444l(function1, c18656l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lM3537else = AbstractC13095l.m3537else(interfaceC17242l, (Function3) objM2132native);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = C6415l.f13412l;
                c6956l.m2147try(objM2132native2);
            }
            int i6 = 196608 | i5 | i4 | (i3 & 7168) | (57344 & i3);
            int i7 = i3 << 6;
            yandex(c18656l, function1, interfaceC17242lM3537else, c3000l2, c0274l2, (Function2) objM2132native2, c15578l2, c6956l, i6 | (29360128 & i7) | (i7 & 234881024));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5770l(c18656l, function1, interfaceC17242l, c3000l, c0274l, c15578l, i);
        }
    }

    public static int remoteconfig(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static C9358l smaato(C1693l c1693l) {
        if (c1693l.equals(C1693l.f4071l)) {
            return C9358l.crashlytics;
        }
        if (c1693l.equals(C1693l.f4076l)) {
            return C9358l.purchase;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c1693l)));
    }

    public static Handler subs() {
        if (yandex != null) {
            return yandex;
        }
        synchronized (AbstractC3308l.class) {
            try {
                if (yandex == null) {
                    yandex = AbstractC15300l.billing(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yandex;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x0393  */
    /* JADX WARN: Code duplicated, block: B:190:0x0397  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:196:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:198:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:200:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:202:0x040a  */
    /* JADX WARN: Code duplicated, block: B:204:0x0416  */
    /* JADX WARN: Code duplicated, block: B:206:0x042e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0442  */
    /* JADX WARN: Code duplicated, block: B:211:0x0460  */
    /* JADX WARN: Code duplicated, block: B:213:0x0489  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:229:0x04be  */
    /* JADX WARN: Code duplicated, block: B:231:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:233:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:235:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:237:0x0506  */
    /* JADX WARN: Code duplicated, block: B:239:0x0512  */
    /* JADX WARN: Code duplicated, block: B:241:0x052b  */
    /* JADX WARN: Code duplicated, block: B:243:0x053d  */
    /* JADX WARN: Code duplicated, block: B:244:0x055a  */
    /* JADX WARN: Code duplicated, block: B:250:0x059b  */
    /* JADX WARN: Code duplicated, block: B:254:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:257:0x0615  */
    /* JADX WARN: Code duplicated, block: B:258:0x0620  */
    /* JADX WARN: Code duplicated, block: B:261:0x0640  */
    /* JADX WARN: Code duplicated, block: B:262:0x0644  */
    public static final void yandex(C18656l c18656l, Function1 function1, InterfaceC17242l interfaceC17242l, C3000l c3000l, C0274l c0274l, Function2 function2, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        C15578l c15578l2;
        C6956l c6956l2;
        boolean z;
        C15457l c15457l;
        boolean z2;
        boolean z3;
        boolean z4;
        C0010l c0010l;
        C18656l c18656l2;
        C3313l c3313l;
        C15738l c15738l;
        C15738l c15738l2;
        C15738l c15738l3;
        boolean z5;
        C0777l c0777l;
        InterfaceC17242l interfaceC17242l2;
        boolean z6;
        C13551l c13551l;
        C3000l c3000l2;
        InterfaceC17242l interfaceC17242l3;
        C0010l c0010l2;
        boolean z7;
        boolean z8;
        InterfaceC17242l interfaceC17242l4;
        C13551l c13551l2;
        C0010l c0010l3;
        C15738l c15738l4;
        boolean z9;
        C15738l c15738l5;
        C15738l c15738lPurchase;
        boolean zAdmob;
        Object objM2132native;
        C13551l c13551l3;
        C3000l c3000l3;
        C0274l c0274l2;
        boolean zMopub;
        Object objM2132native2;
        Object objM2132native3;
        C1209l c1209l;
        C16395l c16395l;
        boolean z10;
        Object objM2132native4;
        Object objM2132native5;
        Object objM2132native6;
        Object objM2132native7;
        Object objM2132native8;
        Object objM2132native9;
        C15578l c15578l3;
        boolean z11;
        EnumC18226l enumC18226lFirebase;
        InterfaceC17242l interfaceC17242l5 = interfaceC17242l;
        C15578l c15578l4 = c15578l;
        C6956l c6956l3 = c6956l;
        C10086l c10086l = c18656l.purchase;
        c6956l3.m2133new(-1310802509);
        if ((i & 6) == 0) {
            i2 = (c6956l3.billing(c18656l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l3.admob(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l3.billing(interfaceC17242l5) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l3.billing(c3000l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l3.billing(c0274l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l3.admob(function2) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= c6956l3.admob(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= c6956l3.admob(c15578l4) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (c6956l3.m2127for(i4 & 1, (i4 & 38347923) != 38347922)) {
            C10086l c10086l2 = c18656l.amazon;
            Object value = c10086l.getValue();
            if (((Boolean) function1.invoke(c10086l2.getValue())).booleanValue() || ((Boolean) function1.invoke(c18656l.crashlytics())).booleanValue() || ((value != null && ((Boolean) function1.invoke(value)).booleanValue()) || c18656l.mopub() || c18656l.amazon())) {
                c6956l3.m2123default(-274042349);
                int i5 = i4 & 14;
                int i6 = i5 | 48;
                int i7 = i6 & 14;
                boolean z12 = ((i7 ^ 6) > 4 && c6956l3.billing(c18656l)) || (i6 & 6) == 4;
                Object objM2132native10 = c6956l3.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (z12 || objM2132native10 == c13863l) {
                    objM2132native10 = c18656l.crashlytics();
                    c6956l3.m2147try(objM2132native10);
                }
                if (c18656l.mopub()) {
                    objM2132native10 = c18656l.crashlytics();
                }
                c6956l3.m2123default(-1270450094);
                EnumC18226l enumC18226lFirebase2 = firebase(c18656l, function1, objM2132native10, c6956l3);
                c6956l3.startapp(false);
                Object value2 = c10086l2.getValue();
                c6956l3.m2123default(-1270450094);
                EnumC18226l enumC18226lFirebase3 = firebase(c18656l, function1, value2, c6956l3);
                c6956l3.startapp(false);
                C18656l c18656lAmazon = AbstractC2438l.amazon(c18656l, enumC18226lFirebase2, enumC18226lFirebase3, "EnterExitTransition", c6956l, i7 | 3072);
                C6956l c6956l4 = c6956l;
                if (c18656l.mopub()) {
                    c6956l4.m2123default(782538635);
                    c6956l4.startapp(false);
                } else {
                    c6956l4.m2123default(782386797);
                    Object value3 = c10086l.getValue();
                    if (value3 == null) {
                        c6956l4.m2123default(782437481);
                        z11 = false;
                        c6956l4.startapp(false);
                        enumC18226lFirebase = null;
                    } else {
                        z11 = false;
                        c6956l4.m2123default(782437482);
                        c6956l4.m2123default(-1270450094);
                        enumC18226lFirebase = firebase(c18656l, function1, value3, c6956l4);
                        c6956l4.startapp(false);
                        c6956l4.startapp(false);
                    }
                    c18656lAmazon.purchase.setValue(enumC18226lFirebase);
                    c6956l4.startapp(z11);
                }
                C0010l c0010l4 = AbstractC4523l.yandex;
                boolean zBilling = c6956l4.billing(c18656lAmazon);
                Object objM2132native11 = c6956l4.m2132native();
                if (zBilling || objM2132native11 == c13863l) {
                    objM2132native11 = AbstractC8020l.smaato(c3000l);
                    c6956l4.m2147try(objM2132native11);
                }
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native11;
                Object objCrashlytics = c18656lAmazon.crashlytics();
                C10086l c10086l3 = c18656lAmazon.amazon;
                Object value4 = c10086l3.getValue();
                EnumC18226l enumC18226l = EnumC18226l.f35692l;
                EnumC18226l enumC18226l2 = EnumC18226l.f35693l;
                if (objCrashlytics == value4 && c18656lAmazon.crashlytics() == enumC18226l2) {
                    if (c18656lAmazon.mopub()) {
                        interfaceC8714l.setValue(c3000l);
                    } else {
                        interfaceC8714l.setValue(C3000l.loadAd);
                    }
                } else if (c10086l3.getValue() != enumC18226l) {
                    interfaceC8714l.setValue(((C3000l) interfaceC8714l.getValue()).yandex(c3000l));
                }
                C3000l c3000l4 = (C3000l) interfaceC8714l.getValue();
                boolean zBilling2 = c6956l4.billing(c18656lAmazon);
                Object objM2132native12 = c6956l4.m2132native();
                if (zBilling2 || objM2132native12 == c13863l) {
                    objM2132native12 = AbstractC8020l.smaato(c0274l);
                    c6956l4.m2147try(objM2132native12);
                }
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native12;
                if (c18656lAmazon.crashlytics() == c10086l3.getValue() && c18656lAmazon.crashlytics() == enumC18226l2) {
                    if (c18656lAmazon.mopub()) {
                        interfaceC8714l2.setValue(c0274l);
                    } else {
                        interfaceC8714l2.setValue(C0274l.loadAd);
                    }
                } else if (c10086l3.getValue() != enumC18226l2) {
                    interfaceC8714l2.setValue(((C0274l) interfaceC8714l2.getValue()).yandex(c0274l));
                }
                C0274l c0274l3 = (C0274l) interfaceC8714l2.getValue();
                InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(function2, c6956l4);
                Object objInvoke = function2.invoke(c18656lAmazon.crashlytics(), c10086l3.getValue());
                boolean zBilling3 = c6956l4.billing(c18656lAmazon) | c6956l4.billing(interfaceC8714lVip);
                Object objM2132native13 = c6956l4.m2132native();
                if (zBilling3 || objM2132native13 == c13863l) {
                    objM2132native13 = new C7641l(c18656lAmazon, interfaceC8714lVip, null, 5);
                    c6956l4.m2147try(objM2132native13);
                }
                InterfaceC8714l interfaceC8714lRemoteconfig = AbstractC8020l.remoteconfig(c6956l4, objInvoke, (Function2) objM2132native13);
                if (c18656lAmazon.crashlytics() == enumC18226l && c10086l3.getValue() == enumC18226l && ((Boolean) interfaceC8714lRemoteconfig.getValue()).booleanValue()) {
                    c6956l4.m2123default(-270853937);
                    c6956l4.startapp(false);
                    z10 = false;
                    c15578l3 = c15578l4;
                } else {
                    c6956l4.m2123default(-272355980);
                    boolean z13 = i5 == 4;
                    Object objM2132native14 = c6956l4.m2132native();
                    if (z13 || objM2132native14 == c13863l) {
                        objM2132native14 = new C1209l(c18656lAmazon);
                        c6956l4.m2147try(objM2132native14);
                    }
                    C1209l c1209l2 = (C1209l) objM2132native14;
                    c1209l2.crashlytics.getClass();
                    C13551l c13551l4 = c1209l2.crashlytics;
                    C0010l c0010l5 = AbstractC3483l.firebase;
                    Object objM2132native15 = c6956l4.m2132native();
                    if (objM2132native15 == c13863l) {
                        objM2132native15 = C16395l.f32075l;
                        c6956l4.m2147try(objM2132native15);
                    }
                    Function0 function0 = (Function0) objM2132native15;
                    c6956l4.m2123default(-1491182875);
                    c6956l4.startapp(false);
                    c6956l4.m2123default(-1491180092);
                    c6956l4.startapp(false);
                    if (c13551l4 == null) {
                        c6956l4.m2123default(-968938819);
                        boolean zBilling4 = c6956l4.billing(c18656lAmazon);
                        Object objM2132native16 = c6956l4.m2132native();
                        if (zBilling4 || objM2132native16 == c13863l) {
                            objM2132native16 = new C13551l();
                            c6956l4.m2147try(objM2132native16);
                        }
                        c13551l4 = (C13551l) objM2132native16;
                        z = false;
                    } else {
                        z = false;
                        c6956l4.m2123default(-31257052);
                    }
                    c6956l4.startapp(z);
                    C13551l c13551l5 = c13551l4;
                    c13551l5.crashlytics(c18656lAmazon.purchase.getValue() != null);
                    boolean zAdmob2 = c6956l4.admob(c13551l5);
                    Object objM2132native17 = c6956l4.m2132native();
                    if (zAdmob2 || objM2132native17 == c13863l) {
                        objM2132native17 = new C11029l(6, c13551l5);
                        c6956l4.m2147try(objM2132native17);
                    }
                    AbstractC4523l.yandex(c18656lAmazon, (Function0) objM2132native17, c6956l4, 0);
                    C3313l c3313l2 = c3000l4.yandex;
                    C3313l c3313l3 = c0274l3.yandex;
                    boolean zCrashlytics = C9735l.crashlytics(c13551l5.purchase, C9735l.isPro);
                    C5487l c5487l = c3313l2.loadAd;
                    C15457l c15457l2 = c3313l2.crashlytics;
                    if (c5487l == null && c3313l3.loadAd == null) {
                        z2 = zCrashlytics;
                        c15457l = c15457l2;
                        if (C5177l.loadAd(c13551l5.subs, 0L)) {
                            z3 = false;
                        }
                        if (c15457l == null || c3313l3.crashlytics != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3) {
                            c6956l4.m2123default(1018653691);
                            objM2132native9 = c6956l4.m2132native();
                            if (objM2132native9 == c13863l) {
                                objM2132native9 = "Built-in slide";
                                c6956l4.m2147try("Built-in slide");
                            }
                            String str = (String) objM2132native9;
                            c3313l = c3313l3;
                            c18656l2 = c18656lAmazon;
                            C15738l c15738lPurchase2 = AbstractC2438l.purchase(c18656l2, c0010l5, str, c6956l4, 384, 0);
                            c0010l = c0010l5;
                            c6956l4.startapp(false);
                            c15738l = c15738lPurchase2;
                        } else {
                            c0010l = c0010l5;
                            c18656l2 = c18656lAmazon;
                            c3313l = c3313l3;
                            c6956l4.m2123default(1018759494);
                            c6956l4.startapp(false);
                            c15738l = null;
                        }
                        if (z4 != 0) {
                            c6956l4.m2123default(1018851285);
                            C0010l c0010l6 = AbstractC3483l.smaato;
                            objM2132native8 = c6956l4.m2132native();
                            if (objM2132native8 == c13863l) {
                                objM2132native8 = "Built-in shrink/expand";
                                c6956l4.m2147try("Built-in shrink/expand");
                            }
                            C15738l c15738lPurchase3 = AbstractC2438l.purchase(c18656l2, c0010l6, (String) objM2132native8, c6956l4, 384, 0);
                            c6956l4.startapp(false);
                            c15738l2 = c15738lPurchase3;
                        } else {
                            c6956l4.m2123default(1018962109);
                            c6956l4.startapp(false);
                            c15738l2 = null;
                        }
                        if (z4 != 0) {
                            c6956l4.m2123default(1019035735);
                            objM2132native7 = c6956l4.m2132native();
                            if (objM2132native7 == c13863l) {
                                objM2132native7 = "Built-in InterruptionHandlingOffset";
                                c6956l4.m2147try("Built-in InterruptionHandlingOffset");
                            }
                            C15738l c15738lPurchase4 = AbstractC2438l.purchase(c18656l2, c0010l, (String) objM2132native7, c6956l4, 384, 0);
                            c6956l4.startapp(false);
                            c15738l3 = c15738lPurchase4;
                        } else {
                            c6956l4.m2123default(1019206141);
                            c6956l4.startapp(false);
                            c15738l3 = null;
                        }
                        z5 = !z4;
                        c0777l = C3955l.purchase;
                        interfaceC17242l2 = C4346l.f8873l;
                        if (z2) {
                            z6 = z5;
                            c13551l = c13551l5;
                            c3000l2 = c3000l4;
                            interfaceC17242l3 = interfaceC17242l2;
                            c6956l4.m2123default(1020031362);
                            c6956l4.startapp(false);
                        } else {
                            c6956l4.m2123default(1019733235);
                            C18656l c18656l3 = c18656l2;
                            C0010l c0010l7 = new C0010l(C11192l.f22516l, new C3006l(10, c0777l));
                            objM2132native6 = c6956l4.m2132native();
                            if (objM2132native6 == c13863l) {
                                objM2132native6 = "Built-in veil";
                                c6956l4.m2147try("Built-in veil");
                            }
                            String str2 = (String) objM2132native6;
                            interfaceC17242l3 = interfaceC17242l2;
                            z6 = z5;
                            c18656l2 = c18656l3;
                            C14837l c14837l = new C14837l(c18656l3, AbstractC2438l.purchase(c18656l2, c0010l7, str2, c6956l4, 384, 0), c3000l4, c0274l3, c13551l5);
                            c3000l2 = c3000l4;
                            c13551l = c13551l5;
                            c6956l4.startapp(false);
                            interfaceC17242l2 = c14837l;
                        }
                        c0010l2 = AbstractC3483l.purchase;
                        if (c3313l2.yandex != null && c3313l.yandex == null && c13551l.billing == 1.0f) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (c3313l2.amazon != null && c3313l.amazon == null && c13551l.mopub == 1.0f) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z7) {
                            c6956l4.m2123default(-1511865571);
                            objM2132native5 = c6956l4.m2132native();
                            if (objM2132native5 == c13863l) {
                                objM2132native5 = "Built-in alpha";
                                c6956l4.m2147try("Built-in alpha");
                            }
                            C13551l c13551l6 = c13551l;
                            c0010l3 = c0010l2;
                            interfaceC17242l4 = interfaceC17242l2;
                            c13551l2 = c13551l6;
                            C15738l c15738lPurchase5 = AbstractC2438l.purchase(c18656l2, c0010l3, (String) objM2132native5, c6956l4, 384, 0);
                            c6956l4.startapp(false);
                            c15738l4 = c15738lPurchase5;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                            c13551l2 = c13551l;
                            c0010l3 = c0010l2;
                            c6956l4.m2123default(-1511696126);
                            c6956l4.startapp(false);
                            c15738l4 = null;
                        }
                        if (z8 != 0) {
                            c6956l4.m2123default(-1511628483);
                            objM2132native4 = c6956l4.m2132native();
                            if (objM2132native4 == c13863l) {
                                objM2132native4 = "Built-in scale";
                                c6956l4.m2147try("Built-in scale");
                            }
                            C15738l c15738lPurchase6 = AbstractC2438l.purchase(c18656l2, c0010l3, (String) objM2132native4, c6956l4, 384, 0);
                            z9 = false;
                            c6956l4.startapp(false);
                            c15738l5 = c15738lPurchase6;
                        } else {
                            z9 = false;
                            c6956l4.m2123default(-1511459038);
                            c6956l4.startapp(false);
                            c15738l5 = null;
                        }
                        if (z8) {
                            c6956l4.m2123default(-1511381382);
                            c15738lPurchase = AbstractC2438l.purchase(c18656l2, AbstractC4523l.yandex, "TransformOriginInterruptionHandling", c6956l4, 384, 0);
                            c6956l4.startapp(z9);
                        } else {
                            c6956l4.m2123default(-1511209054);
                            c6956l4.startapp(z9);
                            c15738lPurchase = null;
                        }
                        zAdmob = c6956l4.admob(c15738l4) | c6956l4.billing(c3000l2) | c6956l4.billing(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x058a: ARITH (r1v41 'zAdmob' boolean) = (wrap boolean:0x0585: ARITH (wrap boolean:0x0580: ARITH (wrap boolean:0x057b: ARITH (wrap boolean:0x0576: ARITH (wrap boolean:0x0571: ARITH (wrap boolean:0x0569: INVOKE (r3v4 'c6956l4' l￘ﾚ￘ﾑ￙ﾐ), (r23v4 'c15738l4' l￙ﾕ￙ﾗￛﾠ) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.admob(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1386)) | (wrap boolean:0x056d: INVOKE (r3v4 'c6956l4' l￘ﾚ￘ﾑ￙ﾐ), (r15v12 'c3000l2' l￘ﾔￛﾣ￙ﾜ) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.billing(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1390)) A[DONT_WRAP, WRAPPED] (LINE:1394)) | (wrap boolean:0x0572: INVOKE (r3v4 'c6956l4' l￘ﾚ￘ﾑ￙ﾐ), (r26v0 l￘ﾑ￙ﾑ￙ﾔ) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.billing(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1395)) A[DONT_WRAP, WRAPPED] (LINE:1399)) | (wrap boolean:0x0577: INVOKE (r3v4 'c6956l4' l￘ﾚ￘ﾑ￙ﾐ), (r8v12 'c13551l2' l￙ﾒ￙ﾞￛﾗ) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.admob(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1400)) A[DONT_WRAP, WRAPPED] (LINE:1404)) | (wrap boolean:0x057c: INVOKE (r3v4 'c6956l4' l￘ﾚ￘ﾑ￙ﾐ), (r25v1 'c15738l5' l￙ﾕ￙ﾗￛﾠ) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.admob(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1405)) A[DONT_WRAP, WRAPPED] (LINE:1409)) | (wrap boolean:0x0581: INVOKE (r3v4 'c6956l4' l￘ﾚ￘ﾑ￙ﾐ), (r0v14 'c18656l2' lￛﾣ￘ﾘ) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.billing(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1410)) A[DONT_WRAP, WRAPPED] (LINE:1414)) | (wrap boolean:0x0586: INVOKE (r3v4 'c6956l4' l￘ﾚ￘ﾑ￙ﾐ), (r4v29 'c15738lPurchase' l￙ﾕ￙ﾗￛﾠ) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.admob(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1415)) (LINE:1419) in method: l￘ﾕ￙ﾎ￙ﾗ.yandex(lￛﾣ￘ﾘ, kotlin.jvm.functions.Function1, l￙ﾗ￙ﾛ￙ﾗ, l￘ﾔￛﾣ￙ﾜ, l￘ﾑ￙ﾑ￙ﾔ, kotlin.jvm.functions.Function2, l￙ﾕ￙ﾍ￘ﾚ, l￘ﾚ￘ﾑ￙ﾐ, int):void, file: classes.dex
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 l￘ﾑ￙ﾑ￙ﾔ
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1693
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3308l.yandex(lؘۣ, kotlin.jvm.functions.Function1, lٗٛٗ, lۣٜؔ, lّؑٔ, kotlin.jvm.functions.Function2, lٍؚٕ, lؚِؑ, int):void");
                    }
                }
