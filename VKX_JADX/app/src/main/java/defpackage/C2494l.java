package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.NativePointer;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌَؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2494l implements InterfaceC10346l, InterfaceC16228l, InterfaceC6211l, InterfaceC12954l, InterfaceC13504l, InterfaceC4034l, InterfaceC0713l, InterfaceC9474l, InterfaceC12833l, InterfaceC2353l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f5290l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f5291l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5292l;

    public C2494l(C8117l c8117l, C1503l c1503l, C5868l c5868l, long j, boolean z) throws C13768l, EOFException {
        boolean z2;
        boolean z3;
        boolean z4;
        C3397l c3397l;
        int i;
        boolean z5;
        int i2;
        C3397l c3397l2;
        C8117l c8117l2;
        C6096l c6096l;
        C15599l c15599l;
        C9912l c9912l;
        C8117l c8117l3;
        C3397l c3397l3;
        C8117l c8117l4;
        C6096l c6096l2;
        C15599l c15599l2;
        C9912l c9912l2;
        C13975l c13975l;
        C8117l c8117l5;
        int i3;
        C8117l c8117l6;
        int i4;
        C3397l c3397l4;
        C8117l c8117l7;
        C8117l c8117l8;
        C9912l c9912l3;
        C13975l c13975l2;
        C8117l c8117l9;
        int i5;
        C3397l c3397l5;
        C8117l c8117l10;
        C8117l c8117l11;
        C8117l c8117l12;
        int i6;
        C8117l c8117l13;
        int i7;
        int i8;
        C8117l c8117l14;
        int i9;
        boolean z6 = z;
        this.f5292l = 7;
        EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
        AbstractC12442l.admob("moov".equals(c8117l.yandex));
        C11566l c11566l = new C11566l(j);
        this.f5291l = c11566l;
        C3397l c3397l6 = new C3397l();
        this.f5290l = c3397l6;
        c11566l.adcel = c5868l.f12361l;
        int iYandex = c8117l.yandex();
        if (C6356l.amazon().subscription) {
            c1503l.subscription(iYandex);
        }
        boolean z7 = false;
        C9687l c9687l = null;
        C9912l c9912l4 = null;
        C6096l c6096l3 = null;
        C15599l c15599l3 = null;
        while (true) {
            if (iYandex < 8 || z7) {
                break;
            }
            C8117l c8117l15 = new C8117l(c1503l);
            int iOrdinal = c8117l15.amazon().ordinal();
            if (iOrdinal == 70) {
                iYandex = iYandex;
                C3397l c3397l7 = c3397l6;
                c8117l15 = c8117l15;
                z2 = z7;
                z3 = true;
                z4 = z;
                c3397l = c3397l7;
                c15599l3 = new C15599l(c8117l15, c1503l, c3397l, z4);
            } else if (iOrdinal != 82) {
                int i10 = 6;
                if (iOrdinal != 142) {
                    if (iOrdinal != 148) {
                        c1503l.skip(c8117l15.yandex());
                        z2 = z7;
                    } else {
                        c6096l3 = new C6096l(i10);
                        EnumC8101l enumC8101l2 = EnumC8101l.UNKNOWN;
                        AbstractC12442l.admob("udta".equals(c8117l15.yandex));
                        int iYandex2 = c8117l15.yandex();
                        C15599l c15599l4 = null;
                        for (int i11 = 8; iYandex2 >= i11 && c15599l4 == null; i11 = 8) {
                            C8117l c8117l16 = new C8117l(c1503l);
                            if (c8117l16.amazon().ordinal() != 70) {
                                c1503l.skip(c8117l16.yandex());
                            } else {
                                c15599l4 = new C15599l(c8117l16, c1503l, c3397l6, z6);
                            }
                            iYandex2 -= c8117l16.loadAd;
                            z7 = z7;
                            c9687l = c9687l;
                        }
                        z2 = z7;
                        C9687l c9687l2 = c9687l;
                        if (c15599l4 == null) {
                            throw new C13768l("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
                        }
                        c1503l.skip(iYandex2);
                        c9687l = c9687l2;
                    }
                    z3 = true;
                    c3397l = c3397l6;
                    z4 = z6;
                } else {
                    z2 = z7;
                    C9687l c9687l3 = c9687l;
                    boolean z8 = c9912l4 != null;
                    C9912l c9912l5 = new C9912l(i10);
                    EnumC8101l enumC8101l3 = EnumC8101l.UNKNOWN;
                    AbstractC12442l.admob("trak".equals(c8117l15.yandex));
                    int iYandex3 = c8117l15.yandex();
                    boolean z9 = false;
                    C13975l c13975l3 = null;
                    int i12 = 8;
                    while (iYandex3 >= i12 && !z9) {
                        C8117l c8117l17 = new C8117l(c1503l);
                        int i13 = iYandex;
                        if (c8117l17.amazon().ordinal() != 65) {
                            z5 = z8;
                            c1503l.skip(c8117l17.yandex());
                            c3397l2 = c3397l6;
                            c8117l2 = c8117l15;
                            c6096l = c6096l3;
                            c15599l = c15599l3;
                            c9912l = c9912l5;
                            c8117l3 = c8117l17;
                            i2 = 8;
                        } else {
                            C9912l c9912l6 = c9912l5;
                            z5 = z8;
                            C13975l c13975l4 = new C13975l(6);
                            EnumC8101l enumC8101l4 = EnumC8101l.UNKNOWN;
                            AbstractC12442l.admob("mdia".equals(c8117l17.yandex));
                            int iYandex4 = c8117l17.yandex();
                            int i14 = 8;
                            C16839l c16839l = null;
                            C17486l c17486l = null;
                            boolean z10 = false;
                            while (true) {
                                if (iYandex4 < i14) {
                                    i2 = i14;
                                    break;
                                }
                                if (z10) {
                                    i2 = 8;
                                    break;
                                }
                                C8117l c8117l18 = new C8117l(c1503l);
                                C16839l c16839l2 = c16839l;
                                int iOrdinal2 = c8117l18.amazon().ordinal();
                                C17486l c17486l2 = c17486l;
                                if (iOrdinal2 == 64) {
                                    c3397l3 = c3397l6;
                                    c8117l4 = c8117l15;
                                    c6096l2 = c6096l3;
                                    c15599l2 = c15599l3;
                                    c9912l2 = c9912l6;
                                    c13975l = c13975l4;
                                    c8117l5 = c8117l17;
                                    i3 = 8;
                                    c17486l = new C17486l(0);
                                    EnumC8101l enumC8101l5 = EnumC8101l.UNKNOWN;
                                    c8117l6 = c8117l18;
                                    AbstractC12442l.admob("mdhd".equals(c8117l6.yandex));
                                    int iYandex5 = c8117l6.yandex();
                                    if (z5) {
                                        c1503l.skip(iYandex5);
                                    } else {
                                        if (c1503l.readByte() == 1) {
                                            c1503l.skip(19L);
                                            c17486l.f34069l = c1503l.readInt();
                                            c1503l.vip();
                                            i4 = iYandex5 - 32;
                                        } else {
                                            c1503l.skip(11L);
                                            c17486l.f34069l = c1503l.readInt();
                                            c1503l.readInt();
                                            C13975l c13975l5 = AbstractC14375l.yandex;
                                            i4 = iYandex5 - 20;
                                        }
                                        if (i4 > 0) {
                                            C13975l c13975l6 = C17486l.f34068l;
                                            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                                            c13975l6.getClass();
                                            int i15 = C17500l.yandex;
                                            c1503l.skip(i4);
                                        }
                                        c11566l.billing = c17486l.f34069l;
                                    }
                                    c16839l = c16839l2;
                                } else if (iOrdinal2 != 74) {
                                    c1503l.skip(c8117l18.yandex());
                                    c3397l3 = c3397l6;
                                    c8117l4 = c8117l15;
                                    c8117l6 = c8117l18;
                                    c6096l2 = c6096l3;
                                    c15599l2 = c15599l3;
                                    c9912l2 = c9912l6;
                                    c13975l = c13975l4;
                                    c8117l5 = c8117l17;
                                    c17486l = c17486l2;
                                    c16839l = c16839l2;
                                    i3 = 8;
                                } else {
                                    C16839l c16839l3 = new C16839l();
                                    EnumC8101l enumC8101l6 = EnumC8101l.UNKNOWN;
                                    AbstractC12442l.admob("minf".equals(c8117l18.yandex));
                                    int iYandex6 = c8117l18.yandex();
                                    boolean z11 = z5;
                                    int i16 = 8;
                                    boolean z12 = false;
                                    C16222l c16222l = null;
                                    while (true) {
                                        if (iYandex6 < i16) {
                                            i3 = i16;
                                            break;
                                        }
                                        if (z12) {
                                            i3 = 8;
                                            break;
                                        }
                                        C8117l c8117l19 = new C8117l(c1503l);
                                        C6096l c6096l4 = c6096l3;
                                        int iOrdinal3 = c8117l19.amazon().ordinal();
                                        C15599l c15599l5 = c15599l3;
                                        if (iOrdinal3 == 115) {
                                            c3397l4 = c3397l6;
                                            c8117l7 = c8117l15;
                                            c8117l8 = c8117l18;
                                            c9912l3 = c9912l6;
                                            c13975l2 = c13975l4;
                                            c8117l9 = c8117l17;
                                            i5 = 8;
                                            c1503l.skip(c8117l19.yandex());
                                            z11 = true;
                                        } else if (iOrdinal3 == 119) {
                                            C16222l c16222l2 = new C16222l(6);
                                            EnumC8101l enumC8101l7 = EnumC8101l.UNKNOWN;
                                            c16222l = c16222l2;
                                            AbstractC12442l.admob("stbl".equals(c8117l19.yandex));
                                            int iYandex7 = c8117l19.yandex();
                                            if (z5) {
                                                c3397l4 = c3397l6;
                                                c8117l7 = c8117l15;
                                                c8117l8 = c8117l18;
                                                c9912l3 = c9912l6;
                                                c13975l2 = c13975l4;
                                                c8117l9 = c8117l17;
                                                i5 = 8;
                                            } else {
                                                int i17 = iYandex7;
                                                int i18 = 8;
                                                C18319l c18319l = null;
                                                C15599l c15599l6 = null;
                                                boolean z13 = false;
                                                while (true) {
                                                    if (i17 < i18) {
                                                        i5 = i18;
                                                        break;
                                                    }
                                                    if (z13) {
                                                        i5 = 8;
                                                        break;
                                                    }
                                                    C8117l c8117l20 = new C8117l(c1503l);
                                                    int i19 = i17;
                                                    int iOrdinal4 = c8117l20.amazon().ordinal();
                                                    C9912l c9912l7 = c9912l6;
                                                    if (iOrdinal4 == 120) {
                                                        c3397l5 = c3397l6;
                                                        c8117l10 = c8117l15;
                                                        c8117l11 = c8117l18;
                                                        c8117l12 = c8117l17;
                                                        i6 = 8;
                                                        C18319l c18319l2 = new C18319l(0);
                                                        EnumC8101l enumC8101l8 = EnumC8101l.UNKNOWN;
                                                        AbstractC12442l.admob("stco".equals(c8117l20.yandex));
                                                        int iYandex8 = c8117l20.yandex();
                                                        c1503l.skip(4L);
                                                        c18319l2.f35824l = c1503l.readInt();
                                                        int i20 = c1503l.readInt();
                                                        c18319l2.f35823l = i20;
                                                        long j2 = i20;
                                                        c11566l.loadAd = j2;
                                                        long j3 = c11566l.vip;
                                                        c11566l.crashlytics = j3;
                                                        c11566l.yandex = j3 - j2;
                                                        c1503l.skip(iYandex8 - 12);
                                                        c18319l = c18319l2;
                                                    } else if (iOrdinal4 != 123) {
                                                        c1503l.skip(c8117l20.yandex());
                                                        c3397l5 = c3397l6;
                                                        c8117l10 = c8117l15;
                                                        c8117l11 = c8117l18;
                                                        c8117l12 = c8117l17;
                                                        i6 = 8;
                                                    } else {
                                                        C15599l c15599l7 = new C15599l(0);
                                                        EnumC8101l enumC8101l9 = EnumC8101l.UNKNOWN;
                                                        AbstractC12442l.admob("stsd".equals(c8117l20.yandex));
                                                        c15599l7.f33215l = c8117l20;
                                                        int iYandex9 = c8117l20.yandex();
                                                        c1503l.skip(8L);
                                                        int i21 = iYandex9 - 8;
                                                        int i22 = 8;
                                                        C15599l c15599l8 = null;
                                                        boolean z14 = false;
                                                        while (true) {
                                                            if (i21 < i22) {
                                                                i6 = i22;
                                                                break;
                                                            }
                                                            if (z14) {
                                                                i6 = 8;
                                                                break;
                                                            }
                                                            C8117l c8117l21 = new C8117l(c1503l);
                                                            C15599l c15599l9 = c15599l8;
                                                            int iOrdinal5 = c8117l21.amazon().ordinal();
                                                            if (iOrdinal5 == 0) {
                                                                c3397l6 = c3397l6;
                                                                c8117l15 = c8117l15;
                                                                c8117l18 = c8117l18;
                                                                c8117l13 = c8117l17;
                                                                i7 = 8;
                                                                c15599l8 = new C15599l(c8117l21, c1503l, c11566l, false);
                                                            } else if (iOrdinal5 != 21) {
                                                                if (iOrdinal5 != 78) {
                                                                    c1503l.skip(c8117l21.yandex());
                                                                    c8117l13 = c8117l17;
                                                                } else {
                                                                    C15599l c15599l10 = new C15599l(0);
                                                                    EnumC8101l enumC8101l10 = EnumC8101l.UNKNOWN;
                                                                    AbstractC12442l.admob("mp4a".equals(c8117l21.yandex));
                                                                    c15599l10.f33215l = c8117l21;
                                                                    int iYandex10 = c8117l21.yandex();
                                                                    c1503l.skip(28L);
                                                                    int i23 = iYandex10 - 28;
                                                                    C14443l c14443l = null;
                                                                    while (i23 >= 8 && c14443l == null) {
                                                                        C8117l c8117l22 = new C8117l(c1503l);
                                                                        C14443l c14443l2 = c14443l;
                                                                        C15599l c15599l11 = c15599l10;
                                                                        if (c8117l22.amazon().ordinal() != 27) {
                                                                            c1503l.skip(c8117l22.yandex());
                                                                            c14443l = c14443l2;
                                                                        } else {
                                                                            c14443l = new C14443l(c8117l22, c1503l, c11566l, 1);
                                                                        }
                                                                        i23 -= c8117l22.loadAd;
                                                                        c15599l10 = c15599l11;
                                                                        c8117l17 = c8117l17;
                                                                    }
                                                                    c15599l9 = c15599l10;
                                                                    c8117l13 = c8117l17;
                                                                    c1503l.skip(i23);
                                                                }
                                                                c15599l8 = c15599l9;
                                                                i7 = 8;
                                                            } else {
                                                                c3397l6 = c3397l6;
                                                                c8117l15 = c8117l15;
                                                                c8117l13 = c8117l17;
                                                                C15599l c15599l12 = new C15599l(0);
                                                                EnumC8101l enumC8101l11 = EnumC8101l.UNKNOWN;
                                                                AbstractC12442l.admob("drms".equals(c8117l21.yandex));
                                                                long jYandex = c8117l21.yandex();
                                                                C0869l c0869l = new C0869l();
                                                                c1503l.mopub(c0869l, jYandex);
                                                                int i24 = 0;
                                                                int i25 = -1;
                                                                while (true) {
                                                                    if (i24 >= c0869l.f2526l - 8) {
                                                                        i8 = -1;
                                                                        break;
                                                                    }
                                                                    i8 = -1;
                                                                    if (i25 != -1) {
                                                                        break;
                                                                    }
                                                                    c0869l.subscription(i24 + 8);
                                                                    int i26 = i25;
                                                                    int i27 = 0;
                                                                    while (i27 < 8) {
                                                                        int i28 = i24 + i27;
                                                                        int i29 = i24;
                                                                        int i30 = i27;
                                                                        if (c0869l.ads(i28) != 101) {
                                                                            i24 = i28 + 1;
                                                                            break;
                                                                        }
                                                                        c0869l.subscription(i28 + 3);
                                                                        if (c0869l.ads(i28 + 1) == 115) {
                                                                            c8117l14 = c8117l18;
                                                                            long j4 = i28 + 2;
                                                                            i9 = i26;
                                                                            if (c0869l.ads(j4) == 100 && c0869l.ads(j4) == 115) {
                                                                                i26 = i28 - 4;
                                                                            }
                                                                            i27 = i30 + 1;
                                                                            c8117l18 = c8117l14;
                                                                            i24 = i29;
                                                                        } else {
                                                                            c8117l14 = c8117l18;
                                                                            i9 = i26;
                                                                        }
                                                                        i26 = i9;
                                                                        i27 = i30 + 1;
                                                                        c8117l18 = c8117l14;
                                                                        i24 = i29;
                                                                    }
                                                                    i24 += 8;
                                                                    c8117l18 = c8117l18;
                                                                    i25 = i26;
                                                                }
                                                                c8117l18 = c8117l18;
                                                                i7 = 8;
                                                                if (i25 != i8) {
                                                                    c0869l.skip(i25);
                                                                    new C14443l(new C8117l(c1503l), c1503l, c11566l, 2);
                                                                }
                                                                c15599l8 = c15599l12;
                                                            }
                                                            i21 -= c8117l21.loadAd;
                                                            if (c15599l8 != null) {
                                                                z14 = true;
                                                            }
                                                            i22 = i7;
                                                            c8117l18 = c8117l18;
                                                            c3397l6 = c3397l6;
                                                            c8117l15 = c8117l15;
                                                            c8117l17 = c8117l13;
                                                        }
                                                        c3397l5 = c3397l6;
                                                        c8117l10 = c8117l15;
                                                        c8117l11 = c8117l18;
                                                        c8117l12 = c8117l17;
                                                        if (i21 > 0) {
                                                            c1503l.skip(i21);
                                                        }
                                                        c15599l6 = c15599l7;
                                                    }
                                                    i17 = i19 - c8117l20.loadAd;
                                                    if (c18319l != null && c15599l6 != null) {
                                                        z13 = true;
                                                    }
                                                    i18 = i6;
                                                    c8117l18 = c8117l11;
                                                    c9912l6 = c9912l7;
                                                    c13975l4 = c13975l4;
                                                    c3397l6 = c3397l5;
                                                    c8117l15 = c8117l10;
                                                    c8117l17 = c8117l12;
                                                }
                                                c3397l4 = c3397l6;
                                                c8117l7 = c8117l15;
                                                c8117l8 = c8117l18;
                                                c9912l3 = c9912l6;
                                                c13975l2 = c13975l4;
                                                c8117l9 = c8117l17;
                                                iYandex7 = i17;
                                            }
                                            c1503l.skip(iYandex7);
                                        } else {
                                            if (iOrdinal3 == 153) {
                                                throw new C9225l("This file appears to be an Mp4 Video file, video files are not supported ");
                                            }
                                            c1503l.skip(c8117l19.yandex());
                                            c3397l4 = c3397l6;
                                            c8117l7 = c8117l15;
                                            c8117l8 = c8117l18;
                                            c9912l3 = c9912l6;
                                            c13975l2 = c13975l4;
                                            c8117l9 = c8117l17;
                                            i5 = 8;
                                        }
                                        iYandex6 -= c8117l19.loadAd;
                                        if (c16222l != null && z11) {
                                            z12 = true;
                                        }
                                        i16 = i5;
                                        c15599l3 = c15599l5;
                                        c6096l3 = c6096l4;
                                        c8117l18 = c8117l8;
                                        c9912l6 = c9912l3;
                                        c13975l4 = c13975l2;
                                        c3397l6 = c3397l4;
                                        c8117l15 = c8117l7;
                                        c8117l17 = c8117l9;
                                    }
                                    c3397l3 = c3397l6;
                                    c8117l4 = c8117l15;
                                    C8117l c8117l23 = c8117l18;
                                    c6096l2 = c6096l3;
                                    c15599l2 = c15599l3;
                                    c9912l2 = c9912l6;
                                    c13975l = c13975l4;
                                    c8117l5 = c8117l17;
                                    if (iYandex6 > 0) {
                                        C13975l c13975l7 = C16839l.yandex;
                                        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                                        c13975l7.getClass();
                                        int i31 = C17500l.yandex;
                                        c1503l.skip(iYandex6);
                                    }
                                    c17486l = c17486l2;
                                    c16839l = c16839l3;
                                    c8117l6 = c8117l23;
                                }
                                iYandex4 -= c8117l6.loadAd;
                                if (c16839l != null && c17486l != null) {
                                    z10 = true;
                                }
                                i14 = i3;
                                c15599l3 = c15599l2;
                                c6096l3 = c6096l2;
                                c9912l6 = c9912l2;
                                c13975l4 = c13975l;
                                c3397l6 = c3397l3;
                                c8117l15 = c8117l4;
                                c8117l17 = c8117l5;
                            }
                            c3397l2 = c3397l6;
                            c8117l2 = c8117l15;
                            c6096l = c6096l3;
                            c15599l = c15599l3;
                            c9912l = c9912l6;
                            C13975l c13975l8 = c13975l4;
                            C8117l c8117l24 = c8117l17;
                            c1503l.skip(iYandex4);
                            c13975l3 = c13975l8;
                            c8117l3 = c8117l24;
                            z9 = true;
                        }
                        iYandex3 -= c8117l3.loadAd;
                        iYandex = i13;
                        i12 = i2;
                        z8 = z5;
                        c15599l3 = c15599l;
                        c6096l3 = c6096l;
                        c9912l5 = c9912l;
                        c3397l6 = c3397l2;
                        c8117l15 = c8117l2;
                    }
                    iYandex = iYandex;
                    C3397l c3397l8 = c3397l6;
                    C8117l c8117l25 = c8117l15;
                    C9912l c9912l8 = c9912l5;
                    C6096l c6096l5 = c6096l3;
                    C15599l c15599l13 = c15599l3;
                    if (c13975l3 == null) {
                        throw new C13768l("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
                    }
                    c1503l.skip(iYandex3);
                    z4 = z;
                    c9687l = c9687l3;
                    c15599l3 = c15599l13;
                    c6096l3 = c6096l5;
                    c9912l4 = c9912l8;
                    c3397l = c3397l8;
                    c8117l15 = c8117l25;
                    z3 = true;
                }
            } else {
                iYandex = iYandex;
                C3397l c3397l9 = c3397l6;
                z2 = z7;
                C6096l c6096l6 = c6096l3;
                C15599l c15599l14 = c15599l3;
                c9687l = new C9687l(0);
                EnumC8101l enumC8101l12 = EnumC8101l.UNKNOWN;
                c8117l15 = c8117l15;
                AbstractC12442l.admob("mvhd".equals(c8117l15.yandex));
                c9687l.f33215l = c8117l15;
                int iYandex11 = c8117l15.yandex();
                z3 = true;
                if (c1503l.readByte() == 1) {
                    c1503l.skip(19L);
                    c9687l.f19763l = c1503l.readInt();
                    c9687l.f19762l = c1503l.vip();
                    i = iYandex11 - 32;
                } else {
                    c1503l.skip(11L);
                    c9687l.f19763l = c1503l.readInt();
                    int i32 = c1503l.readInt();
                    C13975l c13975l9 = AbstractC14375l.yandex;
                    c9687l.f19762l = ((long) i32) & 4294967295L;
                    i = iYandex11 - 20;
                }
                if (i > 0) {
                    C13975l c13975l10 = C9687l.f19761l;
                    EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                    c13975l10.getClass();
                    int i33 = C17500l.yandex;
                    c1503l.skip(i);
                }
                c11566l.firebase = (int) (c9687l.f19762l / ((long) c9687l.f19763l));
                z4 = z;
                c15599l3 = c15599l14;
                c6096l3 = c6096l6;
                c3397l = c3397l9;
            }
            z7 = (c15599l3 == null || c6096l3 == null || c9912l4 == null || c9687l == null) ? z2 : z3;
            iYandex -= c8117l15.loadAd;
            z6 = z4;
            c3397l6 = c3397l;
        }
        C9687l c9687l4 = c9687l;
        if (c9912l4 == null || c9687l4 == null) {
            throw new C13768l("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
        }
        if (c11566l.purchase == -1) {
            c11566l.purchase = 2;
        }
        if (c11566l.amazon == -1) {
            c11566l.amazon = 128;
        }
        if (c11566l.mopub == -1) {
            c11566l.mopub = 16;
        }
        if (AbstractC1315l.purchase(c11566l.admob)) {
            c11566l.admob = "AAC";
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:7:0x0010->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:7:0x0010, B:9:0x0020, B:11:0x002c, B:13:0x0035, B:15:0x0047, B:17:0x004f, B:20:0x0055, B:23:0x005d, B:24:0x0060), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0060 A[EDGE_INSN: B:32:0x0060->B:24:0x0060 BREAK  A[LOOP:0: B:7:0x0010->B:23:0x005d], SYNTHETIC] */
    public static final void amazon(C2494l c2494l) {
        synchronized (c2494l.f5291l) {
            try {
                C16977l c16977l = (C16977l) c2494l.f5290l;
                long[] jArr = c16977l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    int i5 = c16977l.loadAd[i4];
                                    C2517l c2517l = (C2517l) c16977l.crashlytics[i4];
                                    if (c2517l.crashlytics != 5 && !c2517l.loadAd.purchase()) {
                                        c16977l.admob(i4);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public static C11644l m1150l(C3251l c3251l) {
        return C11644l.m3137l(c3251l.appmetrica().inmobi(), c3251l.appmetrica().m740throws(), AbstractC15901l.crashlytics(c3251l.appmetrica().appmetrica()), AbstractC15901l.amazon(c3251l.m1310throws()), c3251l.m1310throws() == EnumC9483l.RAW ? null : Integer.valueOf(c3251l.inmobi()));
    }

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public static void m1151l(C8082l c8082l) throws GeneralSecurityException {
        for (C3251l c3251l : c8082l.appmetrica()) {
            if (c3251l.appmetrica().appmetrica() == EnumC17341l.UNKNOWN_KEYMATERIAL || c3251l.appmetrica().appmetrica() == EnumC17341l.SYMMETRIC || c3251l.appmetrica().appmetrica() == EnumC17341l.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(AbstractC14814l.adcel("keyset contains key material of type ", c3251l.appmetrica().appmetrica().name(), " for type url ", c3251l.appmetrica().inmobi()));
            }
        }
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public static final C2494l m1152l(C8082l c8082l) throws GeneralSecurityException {
        AbstractC6968l c0624l;
        boolean z;
        if (c8082l.applovin() <= 0) {
            C18262l.ads("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(c8082l.applovin());
        for (C3251l c3251l : c8082l.appmetrica()) {
            int iInmobi = c3251l.inmobi();
            try {
                c0624l = m1155l(c3251l);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) AbstractC5910l.yandex.f21690l).get()) {
                    throw e;
                }
                c0624l = new C0624l(m1150l(c3251l), C2782l.f6068l);
                z = true;
            }
            if (((AtomicBoolean) AbstractC5910l.yandex.f21690l).get() && !m1157l(c3251l.m1308package())) {
                C18262l.ads("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            arrayList.add(new C4003l(c0624l, c3251l.m1308package(), iInmobi, iInmobi == c8082l.inmobi(), z));
        }
        return new C2494l(DesugarCollections.unmodifiableList(arrayList), new HashMap());
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public static final C2494l m1153l(AbstractC3302l abstractC3302l) throws GeneralSecurityException {
        int i;
        C8634l c8634l = new C8634l(12);
        ArrayList<C13760l> arrayList = (ArrayList) c8634l.f17792l;
        C13760l c13760l = new C13760l(abstractC3302l);
        C14823l c14823l = C14823l.f28997l;
        c13760l.crashlytics = c14823l;
        c13760l.yandex = true;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C13760l) it.next()).yandex = false;
        }
        arrayList.add(c13760l);
        if (c8634l.f17793l) {
            C18262l.ads("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        c8634l.f17793l = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
            if (((C13760l) arrayList.get(i2)).crashlytics == c14823l && ((C13760l) arrayList.get(i2 + 1)).crashlytics != c14823l) {
                C18262l.ads("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
        }
        HashSet hashSet = new HashSet();
        Integer numValueOf = null;
        for (C13760l c13760l2 : arrayList) {
            c13760l2.getClass();
            AbstractC3302l abstractC3302l2 = c13760l2.loadAd;
            C14823l c14823l2 = c13760l2.crashlytics;
            if (c14823l2 == null) {
                C18262l.ads("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            if (c14823l2 == c14823l) {
                int i3 = 0;
                while (true) {
                    if (i3 != 0 && !hashSet.contains(Integer.valueOf(i3))) {
                        break;
                    }
                    Charset charset = AbstractC0647l.yandex;
                    i3 = 0;
                    while (i3 == 0) {
                        byte[] bArrYandex = AbstractC14640l.yandex(4);
                        i3 = (bArrYandex[3] & 255) | ((bArrYandex[0] & 255) << 24) | ((bArrYandex[1] & 255) << 16) | ((bArrYandex[2] & 255) << 8);
                    }
                }
                i = i3;
            } else {
                i = 0;
            }
            if (hashSet.contains(Integer.valueOf(i))) {
                throw new GeneralSecurityException(AbstractC15560l.tapsense("Id ", i, " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(i));
            C4003l c4003l = new C4003l(C13002l.loadAd.loadAd(abstractC3302l2, abstractC3302l2.yandex() ? Integer.valueOf(i) : null), EnumC8938l.ENABLED, i, c13760l2.yandex, false);
            if (c13760l2.yandex) {
                if (numValueOf != null) {
                    C18262l.ads("Two primaries were set");
                    return null;
                }
                numValueOf = Integer.valueOf(i);
            }
            arrayList2.add(c4003l);
        }
        if (numValueOf == null) {
            C18262l.ads("No primary was set");
            return null;
        }
        C2494l c2494l = new C2494l(arrayList2, (HashMap) c8634l.f17795l);
        c2494l.m1177l();
        return c2494l;
    }

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public static C3251l m1154l(AbstractC6968l abstractC6968l, EnumC8938l enumC8938l, int i) throws GeneralSecurityException {
        if (((C0824l) (C0824l.class.equals(C0824l.class) ? C0824l.class.cast(AbstractC8513l.yandex) : null)) == null) {
            C18262l.ads("Passed in configuration cannot be used to parse and serialize proto keysets.");
            return null;
        }
        C11644l c11644lMopub = C5535l.loadAd.mopub(abstractC6968l);
        Integer numAmazon = abstractC6968l.amazon();
        if (numAmazon != null && numAmazon.intValue() != i) {
            C18262l.ads("Wrong ID set for key with ID requirement");
            return null;
        }
        C3824l c3824lM1307strictfp = C3251l.m1307strictfp();
        C7341l c7341lM739package = C0874l.m739package();
        String str = (String) c11644lMopub.f23358l;
        c7341lM739package.purchase();
        C0874l.signatures((C0874l) c7341lM739package.f19242l, str);
        AbstractC15257l abstractC15257l = (AbstractC15257l) c11644lMopub.f23357l;
        c7341lM739package.purchase();
        C0874l.premium((C0874l) c7341lM739package.f19242l, abstractC15257l);
        EnumC17341l enumC17341lFirebase = AbstractC15901l.firebase((C18176l) c11644lMopub.f23361l);
        c7341lM739package.purchase();
        C0874l.isVip((C0874l) c7341lM739package.f19242l, enumC17341lFirebase);
        c3824lM1307strictfp.purchase();
        C3251l.isVip((C3251l) c3824lM1307strictfp.f19242l, (C0874l) c7341lM739package.yandex());
        c3824lM1307strictfp.purchase();
        C3251l.applovin((C3251l) c3824lM1307strictfp.f19242l, enumC8938l);
        c3824lM1307strictfp.purchase();
        C3251l.signatures((C3251l) c3824lM1307strictfp.f19242l, i);
        EnumC9483l enumC9483lSmaato = AbstractC15901l.smaato((C9358l) c11644lMopub.f23360l);
        c3824lM1307strictfp.purchase();
        C3251l.premium((C3251l) c3824lM1307strictfp.f19242l, enumC9483lSmaato);
        return (C3251l) c3824lM1307strictfp.yandex();
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public static AbstractC6968l m1155l(C3251l c3251l) throws GeneralSecurityException {
        C11644l c11644lM1150l = m1150l(c3251l);
        if (((C0824l) (C0824l.class.equals(C0824l.class) ? C0824l.class.cast(AbstractC8513l.yandex) : null)) == null) {
            C18262l.ads("Passed in configuration cannot be used to serialize into proto keyset format.");
            return null;
        }
        C2782l c2782l = C2782l.f6068l;
        C5535l c5535l = C5535l.loadAd;
        return !((C3344l) c5535l.yandex.get()).loadAd.containsKey((String) c11644lM1150l.f23358l) ? new C0624l(c11644lM1150l, c2782l) : c5535l.yandex(c11644lM1150l);
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public static C2494l m1156l(EnumC1618l enumC1618l) throws GeneralSecurityException {
        int iOrdinal = enumC1618l.ordinal();
        boolean z = false;
        int i = 9;
        int i2 = 2;
        if (iOrdinal == 0) {
            return new C2494l(new C10828l("HmacSha256", i2), EnumC1618l.f3954l, z, i);
        }
        if (iOrdinal == 1) {
            return new C2494l(new C10828l("HmacSha384", i2), EnumC1618l.f3953l, z, i);
        }
        if (iOrdinal == 2) {
            return new C2494l(new C10828l("HmacSha512", i2), EnumC1618l.f3952l, z, i);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(enumC1618l)));
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static boolean m1157l(EnumC8938l enumC8938l) {
        int iOrdinal = enumC8938l.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    @Override // defpackage.InterfaceC0713l
    public void Signature(C10756l c10756l) {
        ((C5807l) this.f5291l).amazon(c10756l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public boolean mo1158abstract(InterfaceC0583l interfaceC0583l) {
        AbstractC15211l abstractC15211lMopub = AbstractC13095l.mopub(interfaceC0583l);
        return (abstractC15211lMopub != null ? mo1213return(abstractC15211lMopub) : null) != null;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean ad(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.premium(AbstractC13095l.m3542import(interfaceC0583l));
    }

    @Override // defpackage.InterfaceC14555l
    public void adcel(InterfaceC13789l interfaceC13789l) {
        AbstractC13095l.billing(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    public boolean admob(InterfaceC13340l interfaceC13340l) {
        return interfaceC13340l instanceof C18655l;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC13789l ads(InterfaceC0218l interfaceC0218l) {
        return AbstractC13095l.tapsense(this, interfaceC0218l);
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0218l advert(InterfaceC0583l interfaceC0583l, int i) {
        if (i < 0 || i >= AbstractC13095l.loadAd(interfaceC0583l)) {
            return null;
        }
        return AbstractC13095l.remoteconfig(interfaceC0583l, i);
    }

    @Override // defpackage.InterfaceC0713l
    public void applovin() {
        ((C5807l) this.f5291l).loadAd(null);
    }

    @Override // defpackage.InterfaceC10346l
    public InterfaceC6797l apply() {
        C9117l c9117l = (C9117l) this.f5291l;
        C14346l c14346lM1187l = m1187l();
        if (c14346lM1187l != null) {
            c9117l.amazon(c14346lM1187l, false);
        }
        return c9117l.billing(this.f5290l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ Collection appmetrica(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3541goto(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC10346l
    public boolean billing(C15263l c15263l) {
        C14346l c14346lM1187l = m1187l();
        C15492l c15492l = c14346lM1187l != null ? c14346lM1187l.billing : null;
        if (c15492l == null || c15492l.crashlytics()) {
            return true;
        }
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            boolean zPurchase = c15492l.purchase(c15263l);
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            return zPurchase;
        } catch (Throwable th) {
            try {
                c14346lM1187l.getClass();
                throw th;
            } catch (Throwable th2) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: break, reason: not valid java name */
    public /* bridge */ boolean mo1159break(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3547package(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC10346l
    public void cancel() {
        C14346l c14346lM1187l = m1187l();
        if ((c14346lM1187l != null ? c14346lM1187l.billing : null) != null) {
            C9117l.crashlytics((C9117l) this.f5291l, this.f5290l);
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public /* bridge */ void mo1160case(InterfaceC0583l interfaceC0583l) {
        AbstractC13095l.m3555throw(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public /* bridge */ Collection mo1161catch(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3544interface(this, interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public InterfaceC0583l mo1162class(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lM3531abstract;
        AbstractC4317l abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l);
        return (abstractC4317lBilling == null || (abstractC15211lM3531abstract = AbstractC13095l.m3531abstract(abstractC4317lBilling)) == null) ? AbstractC13095l.mopub(interfaceC13789l) : abstractC15211lM3531abstract;
    }

    @Override // defpackage.InterfaceC16228l
    public void close() {
        ((NativePointer) this.f5290l).release();
        ((InterfaceC16228l) this.f5291l).close();
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: const, reason: not valid java name */
    public /* bridge */ InterfaceC0583l mo1163const(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.mopub(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC0713l
    /* JADX INFO: renamed from: continue */
    public void mo670continue(C14722l c14722l) {
        boolean z;
        int i;
        C3551l c3551l = (C3551l) this.f5290l;
        C17219l c17219l = c3551l.Signature;
        if (c3551l.firebase) {
            AbstractC5088l.yandex("Recorder", "Drop video data since recording is stopping.");
            c14722l.close();
            return;
        }
        C14722l c14722l2 = c3551l.tapsense;
        int i2 = 1;
        if (c14722l2 != null) {
            c14722l2.close();
            c3551l.tapsense = null;
            z = true;
        } else {
            z = false;
        }
        if ((c14722l.f28784l.flags & 1) == 0) {
            if (z) {
                AbstractC5088l.yandex("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
            }
            AbstractC5088l.yandex("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
            C7025l c7025l = c3551l.subscription;
            c7025l.admob.execute(new RunnableC5229l(c7025l, i2));
            c14722l.close();
            return;
        }
        c3551l.tapsense = c14722l;
        if (c3551l.remoteconfig() && c17219l.m4284else()) {
            if (z) {
                AbstractC5088l.yandex("Recorder", "Replaced cached video keyframe with newer keyframe.");
                return;
            } else {
                AbstractC5088l.yandex("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                return;
            }
        }
        AbstractC5088l.yandex("Recorder", "Received video keyframe. Starting muxer...");
        if (c3551l.remoteconfig() && c17219l.m4284else()) {
            C8339l.subs("Audio is enabled but no audio sample is ready. Cannot start muxer.");
            return;
        }
        C14722l c14722l3 = c3551l.tapsense;
        if (c14722l3 == null) {
            C8339l.subs("Muxer cannot be started without an encoded video frame.");
            return;
        }
        try {
            c3551l.tapsense = null;
            long j = c14722l3.f28784l.presentationTimeUs;
            ArrayList arrayList = new ArrayList();
            while (!c17219l.m4284else()) {
                C14722l c14722l4 = (C14722l) c17219l.license();
                if (c14722l4.f28784l.presentationTimeUs >= j) {
                    arrayList.add(c14722l4);
                }
            }
            c14722l3.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C14722l) it.next()).size();
            }
            try {
                if (((C1858l) C3551l.firebase(c3551l.ads)).loadAd != -1) {
                    throw null;
                }
                C5680l c5680l = c3551l.smaato;
                int i3 = C3551l.f7462package.loadAd;
                if (c5680l != null && (i = c5680l.loadAd) != 1 && i != 2) {
                    throw null;
                }
                throw null;
            } catch (IOException e) {
                if (!AbstractC6974l.smaato(e)) {
                    throw null;
                }
                c3551l.metrica(3, e);
                c14722l3.close();
            }
        } catch (Throwable th) {
            try {
                c14722l3.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC4034l
    public void crashlytics() {
        C13143l c13143l = (C13143l) this.f5290l;
        byte[] bArr = AbstractC15323l.loadAd;
        c13143l.getClass();
        c13143l.m3565private(bArr.length, bArr);
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: default */
    public ListenableFuture mo1118default(C3852l c3852l) {
        ListenableFuture listenableFutureMo1118default = ((InterfaceC9474l) this.f5291l).mo1118default(c3852l);
        if (listenableFutureMo1118default == null) {
            return null;
        }
        return AbstractC7151l.mopub(listenableFutureMo1118default, new C12023l(2, this), EnumC1535l.f3808l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public InterfaceC13789l mo1164else(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.m3535continue(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public /* bridge */ InterfaceC0218l mo1165final(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.admob(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public /* bridge */ InterfaceC5272l mo1166finally(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.billing(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC0583l firebase(InterfaceC5272l interfaceC5272l) {
        return AbstractC13095l.m3531abstract(interfaceC5272l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public boolean mo1167for(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3547package(AbstractC13095l.m3542import(interfaceC0583l));
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public /* bridge */ boolean mo1168goto(InterfaceC0583l interfaceC0583l, InterfaceC0583l interfaceC0583l2) {
        return AbstractC13095l.isVip(interfaceC0583l, interfaceC0583l2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public C1473l mo404implements(View view, C1473l c1473l) {
        boolean z;
        C6921l c6921l = (C6921l) this.f5291l;
        C15380l c15380l = (C15380l) this.f5290l;
        int i = c15380l.loadAd;
        int i2 = c15380l.crashlytics;
        int i3 = c15380l.amazon;
        C17212l c17212l = c1473l.yandex;
        C15496l c15496lSubs = c17212l.subs(519);
        C15496l c15496lSubs2 = c17212l.subs(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c6921l.f14493l;
        int i4 = c15496lSubs.loadAd;
        int i5 = c15496lSubs.crashlytics;
        int i6 = c15496lSubs.yandex;
        bottomSheetBehavior.pro = i4;
        boolean zCrashlytics = AbstractC0545l.crashlytics(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.metrica;
        if (z2) {
            int iYandex = c1473l.yandex();
            bottomSheetBehavior.license = iYandex;
            paddingBottom = iYandex + i3;
        }
        if (bottomSheetBehavior.startapp) {
            paddingLeft = (zCrashlytics ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.adcel) {
            if (!zCrashlytics) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z3 = true;
        if (!bottomSheetBehavior.subscription || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.tapsense && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.Signature) {
            int i7 = marginLayoutParams.topMargin;
            int i8 = c15496lSubs.loadAd;
            if (i7 != i8) {
                marginLayoutParams.topMargin = i8;
            } else {
                z3 = z;
            }
        } else {
            z3 = z;
        }
        if (z3) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z4 = c6921l.f14494l;
        if (z4) {
            bottomSheetBehavior.remoteconfig = c15496lSubs2.amazon;
        }
        if (!z2 && !z4) {
            return c1473l;
        }
        bottomSheetBehavior.m176native();
        return c1473l;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public boolean mo1169import(InterfaceC2224l interfaceC2224l, InterfaceC2224l interfaceC2224l2) {
        if (!(interfaceC2224l instanceof InterfaceC1925l)) {
            C8339l.metrica("Failed requirement.");
            return false;
        }
        if (!(interfaceC2224l2 instanceof InterfaceC1925l)) {
            C8339l.metrica("Failed requirement.");
            return false;
        }
        if (AbstractC13095l.yandex(interfaceC2224l, interfaceC2224l2)) {
            return true;
        }
        InterfaceC1925l interfaceC1925l = (InterfaceC1925l) interfaceC2224l;
        InterfaceC1925l interfaceC1925l2 = (InterfaceC1925l) interfaceC2224l2;
        Map map = (Map) this.f5291l;
        if (((InterfaceC1326l) this.f5290l).billing(interfaceC1925l, interfaceC1925l2)) {
            return true;
        }
        if (map != null) {
            InterfaceC1925l interfaceC1925l3 = (InterfaceC1925l) map.get(interfaceC1925l);
            InterfaceC1925l interfaceC1925l4 = (InterfaceC1925l) map.get(interfaceC1925l2);
            if (interfaceC1925l3 != null && interfaceC1925l3.equals(interfaceC1925l2)) {
                return true;
            }
            if (interfaceC1925l4 != null && interfaceC1925l4.equals(interfaceC1925l)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean inmobi(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.appmetrica(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public boolean mo1170instanceof(InterfaceC13789l interfaceC13789l) {
        return interfaceC13789l instanceof C7530l;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public /* bridge */ InterfaceC13340l mo1171interface(InterfaceC6913l interfaceC6913l) {
        return AbstractC13095l.amazon(this, interfaceC6913l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC0583l isPro(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3549public(interfaceC0583l, false);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ int isVip(InterfaceC13199l interfaceC13199l) {
        return AbstractC13095l.ad(interfaceC13199l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean license(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.premium(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC6211l
    public C10758l loadAd(byte[] bArr) throws GeneralSecurityException {
        EnumC1618l enumC1618l = (EnumC1618l) this.f5291l;
        KeyPair keyPairBilling = C17423l.billing(C17423l.mopub(enumC1618l));
        ECParameterSpec eCParameterSpecMopub = C17423l.mopub(enumC1618l);
        EllipticCurve curve = eCParameterSpecMopub.getCurve();
        EnumC5521l enumC5521l = EnumC5521l.f11790l;
        byte[] bArrYandex = C17423l.yandex((ECPrivateKey) keyPairBilling.getPrivate(), (ECPublicKey) ((KeyFactory) C12437l.billing.yandex.appmetrica("EC")).generatePublic(new ECPublicKeySpec(C17423l.subs(curve, enumC5521l, bArr), eCParameterSpecMopub)));
        byte[] bArrIsPro = C17423l.isPro(C17423l.mopub(enumC1618l).getCurve(), enumC5521l, ((ECPublicKey) keyPairBilling.getPublic()).getW());
        byte[] bArrAmazon = AbstractC17265l.amazon(bArrIsPro, bArr);
        byte[] bArrAmazon2 = AbstractC17265l.amazon(AbstractC2383l.remoteconfig, mo1224while());
        C10828l c10828l = (C10828l) this.f5290l;
        int macLength = Mac.getInstance(c10828l.f21889l).getMacLength();
        byte[] bArr2 = AbstractC2383l.metrica;
        Charset charset = AbstractC0647l.yandex;
        return new C10758l(c10828l.yandex(c10828l.loadAd(AbstractC17265l.amazon(bArr2, bArrAmazon2, "eae_prk".getBytes(charset), bArrYandex), null), macLength, AbstractC17265l.amazon(AbstractC2383l.loadAd(2, macLength), bArr2, bArrAmazon2, "shared_secret".getBytes(charset), bArrAmazon)), bArrIsPro);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public void m1172l(C0432l c0432l) {
        int i;
        C16977l c16977l = (C16977l) this.f5290l;
        int[] iArr = c16977l.loadAd;
        Object[] objArr = c16977l.crashlytics;
        long[] jArr = c16977l.yandex;
        int i2 = 2;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j) < 128) {
                        int i7 = (i3 << 3) + i6;
                        int i8 = iArr[i7];
                        C2517l c2517l = (C2517l) objArr[i7];
                        int i9 = c2517l.crashlytics;
                        C2494l c2494l = c2517l.purchase;
                        int iInmobi = AbstractC5020l.inmobi(i9);
                        if (iInmobi != 0) {
                            int i10 = 13;
                            i = i4;
                            InterfaceC14029l interfaceC14029l = null;
                            if (iInmobi == i2) {
                                c2517l.crashlytics = 5;
                                InterfaceC2262l interfaceC2262lM3914l = c0432l.m3914l();
                                C7504l c7504l = c2517l.amazon;
                                if (c7504l != null) {
                                    c7504l.ads(null);
                                }
                                c2517l.amazon = AbstractC10999l.mopub(interfaceC2262lM3914l, null, 0, new C15352l(c2494l, c2517l, interfaceC14029l, i10), 3);
                            } else if (iInmobi == 3) {
                                InterfaceC2262l interfaceC2262lM3914l2 = c0432l.m3914l();
                                C7504l c7504l2 = c2517l.amazon;
                                if (c7504l2 != null) {
                                    c7504l2.ads(null);
                                }
                                c2517l.amazon = AbstractC10999l.mopub(interfaceC2262lM3914l2, null, 0, new C15352l(c2494l, c2517l, interfaceC14029l, i10), 3);
                            }
                        } else {
                            i = i4;
                            c2517l.crashlytics = 6;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                        i2 = 2;
                    } else {
                        i = i4;
                    }
                    j >>= i;
                    i6++;
                    i4 = i;
                    i2 = 2;
                }
                if (i5 != i4) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            }
            i3++;
            i2 = 2;
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public /* bridge */ boolean mo1173l(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.m3551strictfp(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public /* bridge */ InterfaceC6440l mo1174l(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.crashlytics(interfaceC0583l);
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public AbstractC18041l m1175l(InterfaceC16902l interfaceC16902l, C9188l c9188l) {
        return (AbstractC18041l) ((C0098l) this.f5290l).invoke(new C3592l(interfaceC16902l, c9188l));
    }

    @Override // defpackage.InterfaceC16228l
    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public AbstractC1872l mo1176l() {
        return ((InterfaceC16228l) this.f5291l).mo1176l();
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public void m1177l() {
        if (((Map) this.f5290l).get(AbstractC1068l.class) == null) {
            return;
        }
        C18725l.loadAd();
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public /* bridge */ boolean mo1178l(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.applovin(interfaceC2224l);
    }

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public Object m1179l(Class cls) throws GeneralSecurityException {
        C0346l c0346lSubs;
        List arrayList;
        C0346l c0346lSubs2;
        List list;
        C0346l c0346lSubs3;
        List arrayList2;
        C0346l c0346lSubs4;
        List arrayList3;
        C0346l c0346lSubs5;
        List arrayList4;
        List list2 = (List) this.f5291l;
        C8082l c8082lM1196l = m1196l();
        int i = AbstractC4001l.yandex;
        int iInmobi = c8082lM1196l.inmobi();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        for (C3251l c3251l : c8082lM1196l.appmetrica()) {
            if (c3251l.m1308package() == EnumC8938l.ENABLED) {
                if (!c3251l.m1309synchronized()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c3251l.inmobi())));
                }
                if (c3251l.m1310throws() == EnumC9483l.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c3251l.inmobi())));
                }
                if (c3251l.m1308package() == EnumC8938l.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c3251l.inmobi())));
                }
                if (c3251l.inmobi() == iInmobi) {
                    if (z) {
                        C18262l.ads("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                if (c3251l.appmetrica().appmetrica() != EnumC17341l.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i3++;
            }
        }
        if (i3 == 0) {
            C18262l.ads("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z && !z2) {
            C18262l.ads("keyset doesn't contain a valid primary key");
            return null;
        }
        for (int i4 = 0; i4 < list2.size(); i4++) {
            if (((C4003l) list2.get(i4)).billing || !m1157l(((C4003l) list2.get(i4)).loadAd)) {
                throw new GeneralSecurityException("Key parsing of key with index " + i4 + " and type_url " + c8082lM1196l.premium(i4).appmetrica().inmobi() + " failed, unable to get primitive");
            }
        }
        C3300l c3300l = (C3300l) C16233l.loadAd.yandex.get();
        HashMap map = c3300l.loadAd;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls)));
        }
        C12107l c12107l = (C12107l) map.get(cls);
        C15263l c15263l = new C15263l(c3300l, c12107l, 16);
        switch (c12107l.yandex) {
            case 0:
                HashMap map2 = new HashMap();
                while (i2 < ((List) this.f5291l).size()) {
                    C4003l c4003lM1180l = m1180l(i2);
                    if (c4003lM1180l.crashlytics.equals(C1693l.f4069l)) {
                        AbstractC6968l abstractC6968lYandex = c4003lM1180l.yandex();
                        if (abstractC6968lYandex instanceof AbstractC14615l) {
                            c0346lSubs = ((AbstractC14615l) abstractC6968lYandex).subs();
                        } else {
                            if (!(abstractC6968lYandex instanceof C0624l)) {
                                throw new GeneralSecurityException(AbstractC14814l.adcel("Cannot get output prefix for key of class ", abstractC6968lYandex.getClass().getName(), " with parameters ", String.valueOf(abstractC6968lYandex.purchase())));
                            }
                            c0346lSubs = ((C0624l) abstractC6968lYandex).subs();
                        }
                        C8492l c8492l = new C8492l((InterfaceC13883l) c15263l.mopub(c4003lM1180l), c4003lM1180l.amazon);
                        byte[] bArr = c0346lSubs.yandex;
                        if (bArr.length != 0 && bArr.length != 5) {
                            C18262l.ads("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map2.containsKey(c0346lSubs)) {
                            arrayList = (List) map2.get(c0346lSubs);
                        } else {
                            arrayList = new ArrayList();
                            map2.put(c0346lSubs, arrayList);
                        }
                        arrayList.add(c8492l);
                    }
                    i2++;
                }
                m1177l();
                return new C1918l(new C8492l((InterfaceC13883l) c15263l.mopub(m1181l()), m1181l().amazon), new C2308l(map2));
            case 1:
                C4003l c4003lM1181l = m1181l();
                HashMap map3 = new HashMap();
                while (i2 < ((List) this.f5291l).size()) {
                    C4003l c4003lM1180l2 = m1180l(i2);
                    if (c4003lM1180l2.crashlytics.equals(C1693l.f4069l)) {
                        C8375l c8375l = (C8375l) c15263l.mopub(c4003lM1180l2);
                        AbstractC6968l abstractC6968lYandex2 = c4003lM1180l2.yandex();
                        if (abstractC6968lYandex2 instanceof AbstractC1798l) {
                            c0346lSubs2 = ((AbstractC1798l) abstractC6968lYandex2).subs();
                        } else {
                            if (!(abstractC6968lYandex2 instanceof C0624l)) {
                                throw new GeneralSecurityException(AbstractC14814l.adcel("Cannot get output prefix for key of class ", abstractC6968lYandex2.getClass().getName(), " with parameters ", String.valueOf(abstractC6968lYandex2.purchase())));
                            }
                            c0346lSubs2 = ((C0624l) abstractC6968lYandex2).subs();
                        }
                        byte[] bArr2 = c0346lSubs2.yandex;
                        if (bArr2.length != 0 && bArr2.length != 5) {
                            C18262l.ads("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map3.containsKey(c0346lSubs2)) {
                            list = (List) map3.get(c0346lSubs2);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            map3.put(c0346lSubs2, arrayList5);
                            list = arrayList5;
                        }
                        list.add(c8375l);
                    }
                    i2++;
                }
                return new C8375l();
            case 2:
                HashMap map4 = new HashMap();
                while (i2 < ((List) this.f5291l).size()) {
                    C4003l c4003lM1180l3 = m1180l(i2);
                    if (c4003lM1180l3.crashlytics.equals(C1693l.f4069l)) {
                        InterfaceC10135l interfaceC10135l = (InterfaceC10135l) c15263l.mopub(c4003lM1180l3);
                        AbstractC6968l abstractC6968lYandex3 = c4003lM1180l3.yandex();
                        if (abstractC6968lYandex3 instanceof C5925l) {
                            c0346lSubs3 = ((C5925l) abstractC6968lYandex3).isPro;
                        } else {
                            if (!(abstractC6968lYandex3 instanceof C0624l)) {
                                throw new GeneralSecurityException(AbstractC14814l.adcel("Cannot get output prefix for key of class ", abstractC6968lYandex3.getClass().getName(), " with parameters ", String.valueOf(abstractC6968lYandex3.purchase())));
                            }
                            c0346lSubs3 = ((C0624l) abstractC6968lYandex3).subs();
                        }
                        C12864l c12864l = new C12864l(interfaceC10135l, c4003lM1180l3.amazon);
                        byte[] bArr3 = c0346lSubs3.yandex;
                        if (bArr3.length != 0 && bArr3.length != 5) {
                            C18262l.ads("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map4.containsKey(c0346lSubs3)) {
                            arrayList2 = (List) map4.get(c0346lSubs3);
                        } else {
                            arrayList2 = new ArrayList();
                            map4.put(c0346lSubs3, arrayList2);
                        }
                        arrayList2.add(c12864l);
                    }
                    i2++;
                }
                m1177l();
                return new C6102l(new C12864l((InterfaceC10135l) c15263l.mopub(m1181l()), m1181l().amazon), new C2308l(map4));
            case 3:
                HashMap map5 = new HashMap();
                while (i2 < ((List) this.f5291l).size()) {
                    C4003l c4003lM1180l4 = m1180l(i2);
                    if (c4003lM1180l4.crashlytics.equals(C1693l.f4069l)) {
                        InterfaceC11416l interfaceC11416l = (InterfaceC11416l) c15263l.mopub(c4003lM1180l4);
                        AbstractC6968l abstractC6968lYandex4 = c4003lM1180l4.yandex();
                        if (abstractC6968lYandex4 instanceof AbstractC1975l) {
                            c0346lSubs4 = ((AbstractC1975l) abstractC6968lYandex4).subs().subs();
                        } else {
                            if (!(abstractC6968lYandex4 instanceof C0624l)) {
                                throw new GeneralSecurityException(AbstractC14814l.adcel("Cannot get output prefix for key of class ", abstractC6968lYandex4.getClass().getName(), " with parameters ", String.valueOf(abstractC6968lYandex4.purchase())));
                            }
                            c0346lSubs4 = ((C0624l) abstractC6968lYandex4).subs();
                        }
                        C9587l c9587l = new C9587l(interfaceC11416l, c4003lM1180l4.amazon);
                        byte[] bArr4 = c0346lSubs4.yandex;
                        if (bArr4.length != 0 && bArr4.length != 5) {
                            C18262l.ads("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map5.containsKey(c0346lSubs4)) {
                            arrayList3 = (List) map5.get(c0346lSubs4);
                        } else {
                            arrayList3 = new ArrayList();
                            map5.put(c0346lSubs4, arrayList3);
                        }
                        arrayList3.add(c9587l);
                    }
                    i2++;
                }
                m1177l();
                return new C6231l(new C2308l(map5));
            case 4:
                m1177l();
                C4003l c4003lM1181l2 = m1181l();
                InterfaceC10634l interfaceC10634l = (InterfaceC10634l) c15263l.mopub(c4003lM1181l2);
                int i5 = c4003lM1181l2.amazon;
                C18675l c18675l = new C18675l();
                c18675l.f36444l = interfaceC10634l;
                return new C14871l(c18675l);
            default:
                HashMap map6 = new HashMap();
                while (i2 < ((List) this.f5291l).size()) {
                    C4003l c4003lM1180l5 = m1180l(i2);
                    if (c4003lM1180l5.crashlytics.equals(C1693l.f4069l)) {
                        InterfaceC1218l interfaceC1218l = (InterfaceC1218l) c15263l.mopub(c4003lM1180l5);
                        AbstractC6968l abstractC6968lYandex5 = c4003lM1180l5.yandex();
                        if (abstractC6968lYandex5 instanceof AbstractC1798l) {
                            c0346lSubs5 = ((AbstractC1798l) abstractC6968lYandex5).subs();
                        } else {
                            if (!(abstractC6968lYandex5 instanceof C0624l)) {
                                throw new GeneralSecurityException(AbstractC14814l.adcel("Cannot get output prefix for key of class ", abstractC6968lYandex5.getClass().getName(), " with parameters ", String.valueOf(abstractC6968lYandex5.purchase())));
                            }
                            c0346lSubs5 = ((C0624l) abstractC6968lYandex5).subs();
                        }
                        C12899l c12899l = new C12899l(interfaceC1218l, c4003lM1180l5.amazon);
                        byte[] bArr5 = c0346lSubs5.yandex;
                        if (bArr5.length != 0 && bArr5.length != 5) {
                            C18262l.ads("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map6.containsKey(c0346lSubs5)) {
                            arrayList4 = (List) map6.get(c0346lSubs5);
                        } else {
                            arrayList4 = new ArrayList();
                            map6.put(c0346lSubs5, arrayList4);
                        }
                        arrayList4.add(c12899l);
                    }
                    i2++;
                }
                m1177l();
                new C12899l((InterfaceC1218l) c15263l.mopub(m1181l()), m1181l().amazon);
                new C2308l(map6);
                return new C7113l();
        }
    }

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public C4003l m1180l(int i) {
        List list = (List) this.f5291l;
        if (i < 0 || i >= list.size()) {
            C18262l.adcel(AbstractC12589l.premium(i, list.size(), "Invalid index ", " for keyset of size "));
            return null;
        }
        C4003l c4003l = (C4003l) list.get(i);
        if (!m1157l(c4003l.loadAd)) {
            C8339l.smaato(AbstractC15560l.tapsense("Keyset-Entry at position ", i, " has wrong status"));
            return null;
        }
        if (!c4003l.billing) {
            return (C4003l) list.get(i);
        }
        C8339l.smaato(AbstractC15560l.tapsense("Keyset-Entry at position ", i, " didn't parse correctly"));
        return null;
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public C4003l m1181l() {
        for (C4003l c4003l : (List) this.f5291l) {
            if (c4003l != null && c4003l.purchase) {
                if (c4003l.crashlytics == C1693l.f4069l) {
                    return c4003l;
                }
                C8339l.smaato("Keyset has primary which isn't enabled");
                return null;
            }
        }
        C8339l.smaato("Keyset has no valid primary");
        return null;
    }

    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public C2494l m1182l() throws GeneralSecurityException {
        AbstractC6968l c0624l;
        List<C4003l> list = (List) this.f5291l;
        ArrayList arrayList = new ArrayList(list.size());
        for (C4003l c4003l : list) {
            if (c4003l.yandex() instanceof AbstractC1975l) {
                c0624l = ((AbstractC1975l) c4003l.yandex()).isPro();
            } else {
                if (!(c4003l.yandex() instanceof C0624l)) {
                    throw new GeneralSecurityException("Cannot get Public Key for key of type ".concat(String.valueOf(c4003l.yandex().getClass())));
                }
                C11644l c11644l = ((C0624l) c4003l.yandex()).admob;
                String str = (String) c11644l.f23358l;
                InterfaceC18729l interfaceC18729lLoadAd = C16365l.amazon.loadAd(str);
                if (!(interfaceC18729lLoadAd instanceof C3322l)) {
                    throw new GeneralSecurityException(AbstractC15560l.Signature("manager for key type ", str, " is not a PrivateKeyManager"));
                }
                C3322l c3322l = (C3322l) interfaceC18729lLoadAd;
                C11644l c11644lM3137l = C11644l.m3137l(c3322l.yandex, (AbstractC15257l) c11644l.f23357l, AbstractC15901l.crashlytics(c3322l.crashlytics), AbstractC15901l.amazon(EnumC9483l.RAW), null);
                C5535l c5535l = C5535l.loadAd;
                AbstractC6968l abstractC6968lYandex = c5535l.yandex(c11644lM3137l);
                if (!(abstractC6968lYandex instanceof AbstractC1975l)) {
                    C18262l.ads("Key not private key");
                    return null;
                }
                C11644l c11644lMopub = c5535l.mopub(((AbstractC1975l) abstractC6968lYandex).isPro());
                C7341l c7341lM739package = C0874l.m739package();
                String str2 = (String) c11644lMopub.f23358l;
                c7341lM739package.purchase();
                C0874l.signatures((C0874l) c7341lM739package.f19242l, str2);
                AbstractC15257l abstractC15257l = (AbstractC15257l) c11644lMopub.f23357l;
                c7341lM739package.purchase();
                C0874l.premium((C0874l) c7341lM739package.f19242l, abstractC15257l);
                EnumC17341l enumC17341lFirebase = AbstractC15901l.firebase((C18176l) c11644lMopub.f23361l);
                c7341lM739package.purchase();
                C0874l.isVip((C0874l) c7341lM739package.f19242l, enumC17341lFirebase);
                C0874l c0874l = (C0874l) c7341lM739package.yandex();
                c0624l = new C0624l(C11644l.m3137l(c0874l.inmobi(), c0874l.m740throws(), AbstractC15901l.crashlytics(c0874l.appmetrica()), (C9358l) c11644l.f23360l, (Integer) c11644l.f23362l), null);
            }
            C4003l c4003l2 = new C4003l(c0624l, c4003l.loadAd, c4003l.amazon, c4003l.purchase, false);
            int i = c4003l.amazon;
            Integer numAmazon = c0624l.amazon();
            if (numAmazon != null && numAmazon.intValue() != i) {
                C18262l.ads("Wrong ID set for key with ID requirement");
                return null;
            }
            arrayList.add(c4003l2);
        }
        C2494l c2494l = new C2494l(arrayList, (Map) this.f5290l);
        c2494l.m1177l();
        return c2494l;
    }

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public View m1183l(int i, int i2, int i3, int i4) {
        C12280l c12280l = (C12280l) this.f5290l;
        InterfaceC17061l interfaceC17061l = (InterfaceC17061l) this.f5291l;
        int iPremium = interfaceC17061l.premium();
        int iMo1317else = interfaceC17061l.mo1317else();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo1318new = interfaceC17061l.mo1318new(i);
            int iIsPro = interfaceC17061l.isPro(viewMo1318new);
            int iMo1319public = interfaceC17061l.mo1319public(viewMo1318new);
            c12280l.crashlytics = iPremium;
            c12280l.amazon = iMo1317else;
            c12280l.purchase = iIsPro;
            c12280l.billing = iMo1319public;
            if (i3 != 0) {
                c12280l.loadAd = i3;
                if (c12280l.yandex()) {
                    return viewMo1318new;
                }
            }
            if (i4 != 0) {
                c12280l.loadAd = i4;
                if (c12280l.yandex()) {
                    view = viewMo1318new;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public boolean m1184l(C14996l c14996l, String str) {
        int i = c14996l.loadAd;
        Context context = (Context) this.f5291l;
        if (i < 0) {
            return context.getPackageManager().checkPermission(str, c14996l.yandex) == 0;
        }
        return context.checkPermission(str, i, c14996l.crashlytics) == 0;
    }

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public AbstractC14318l m1185l(C9188l c9188l) {
        AbstractC14318l abstractC14318lFirebase;
        AbstractC15211l abstractC15211l = c9188l.billing;
        return (abstractC15211l == null || (abstractC14318lFirebase = AbstractC12300l.firebase(abstractC15211l)) == null) ? (C14487l) ((C8688l) this.f5291l).getValue() : abstractC14318lFirebase;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public /* bridge */ boolean mo1186l(InterfaceC13340l interfaceC13340l) {
        return AbstractC13095l.m3538extends(interfaceC13340l);
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public C14346l m1187l() {
        C9117l c9117l = (C9117l) this.f5291l;
        C3654l c3654l = (C3654l) c9117l.f18733l.mopub(this.f5290l);
        if (c3654l != null) {
            return (C14346l) c9117l.f18739l.mopub(c3654l);
        }
        return null;
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public boolean m1188l(View view) {
        C12280l c12280l = (C12280l) this.f5290l;
        InterfaceC17061l interfaceC17061l = (InterfaceC17061l) this.f5291l;
        int iPremium = interfaceC17061l.premium();
        int iMo1317else = interfaceC17061l.mo1317else();
        int iIsPro = interfaceC17061l.isPro(view);
        int iMo1319public = interfaceC17061l.mo1319public(view);
        c12280l.crashlytics = iPremium;
        c12280l.amazon = iMo1317else;
        c12280l.purchase = iIsPro;
        c12280l.billing = iMo1319public;
        c12280l.loadAd = 24579;
        return c12280l.yandex();
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public float m1189l(int i) {
        synchronized (this.f5291l) {
            C2517l c2517l = (C2517l) ((C16977l) this.f5290l).loadAd(i);
            float fFloatValue = 0.0f;
            if (c2517l == null) {
                return 0.0f;
            }
            if (c2517l.crashlytics != 5) {
                fFloatValue = ((Number) c2517l.loadAd.amazon()).floatValue();
            }
            return fFloatValue;
        }
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public boolean m1190l() {
        String str;
        Signature signature;
        PackageManager packageManager = (PackageManager) this.f5290l;
        String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null && (str = packagesForUid[0]) != null) {
            for (C8195l c8195l : ((C8341l) this.f5291l).f17268l) {
                if (AbstractC8576l.yandex(c8195l.f17098l, str)) {
                    String str2 = "";
                    try {
                        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
                        if (signatureArr != null && (signature = signatureArr[0]) != null) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                            messageDigest.update(signature.toByteArray());
                            byte[] bArrDigest = messageDigest.digest();
                            str2 = String.format("%0" + (bArrDigest.length << 1) + 'X', Arrays.copyOf(new Object[]{new BigInteger(1, bArrDigest)}, 1));
                        }
                    } catch (Exception unused) {
                    }
                    if (str2.equalsIgnoreCase((String) c8195l.f17097l)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC10346l
    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public boolean mo1191l() {
        C15492l c15492l;
        C14346l c14346lM1187l = m1187l();
        if (c14346lM1187l == null || (c15492l = c14346lM1187l.billing) == null) {
            return true;
        }
        return c15492l.crashlytics();
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public boolean mo1192l(InterfaceC13789l interfaceC13789l) {
        return !AbstractC8576l.yandex(AbstractC13095l.m3542import(signatures(interfaceC13789l)), AbstractC13095l.m3542import(mo1162class(interfaceC13789l)));
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public void m1193l() {
        C10086l c10086l = (C10086l) this.f5290l;
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            C0574l c0574l = (C0574l) c10086l.getValue();
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            if (c0574l != null) {
                C9106l c9106l = (C9106l) this.f5291l;
                C11362l c11362l = c9106l.loadAd;
                C11362l c11362l2 = c9106l.crashlytics;
                c11362l2.clear();
                while (c11362l2.size() + c11362l.size() > c9106l.yandex - 1) {
                    AbstractC3984l.advert(c11362l);
                }
                c11362l.add(c0574l);
            }
            c10086l.setValue(null);
        } catch (Throwable th) {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC12954l
    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public /* bridge */ AbstractC14318l mo1194l(InterfaceC6913l interfaceC6913l, InterfaceC6913l interfaceC6913l2) {
        return AbstractC13095l.firebase(this, interfaceC6913l, interfaceC6913l2);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public /* bridge */ InterfaceC13789l mo1195l(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.m3543instanceof(this, interfaceC13789l);
    }

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public C8082l m1196l() {
        try {
            C2150l c2150lM2258throws = C8082l.m2258throws();
            for (C4003l c4003l : (List) this.f5291l) {
                AbstractC6968l abstractC6968lYandex = c4003l.yandex();
                int i = c4003l.amazon;
                C3251l c3251lM1154l = m1154l(abstractC6968lYandex, c4003l.loadAd, i);
                c2150lM2258throws.purchase();
                C8082l.isVip((C8082l) c2150lM2258throws.f19242l, c3251lM1154l);
                if (c4003l.purchase) {
                    c2150lM2258throws.purchase();
                    C8082l.signatures((C8082l) c2150lM2258throws.f19242l, i);
                }
            }
            return (C8082l) c2150lM2258throws.yandex();
        } catch (GeneralSecurityException e) {
            C11467l.tapsense(e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public InterfaceC0218l mo1197l(InterfaceC6440l interfaceC6440l, int i) {
        if (interfaceC6440l instanceof InterfaceC6913l) {
            return AbstractC13095l.remoteconfig((InterfaceC13789l) interfaceC6440l, i);
        }
        if (interfaceC6440l instanceof C8469l) {
            return (InterfaceC0218l) ((C8469l) interfaceC6440l).get(i);
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC6440l);
        C11983l.adcel(sb, AbstractC18202l.yandex.loadAd(interfaceC6440l.getClass()));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public void m1198l(C0574l c0574l) {
        C0574l c0574l2;
        C0574l c0574l3;
        C10086l c10086l = (C10086l) this.f5290l;
        String str = c0574l.crashlytics;
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            C0574l c0574l4 = (C0574l) c10086l.getValue();
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            if (c0574l4 == null) {
                c10086l.setValue(c0574l);
                return;
            }
            boolean z = c0574l4.mopub;
            String str2 = c0574l4.loadAd;
            String str3 = c0574l4.crashlytics;
            int i = c0574l4.yandex;
            int i2 = c0574l4.admob;
            if (z) {
                boolean z2 = c0574l.mopub;
                String str4 = c0574l.loadAd;
                int i3 = c0574l.yandex;
                if (z2) {
                    long j = c0574l.billing;
                    long j2 = c0574l4.billing;
                    if (j < j2 || j - j2 >= 5000 || AbstractC8576l.yandex(str3, "\n") || AbstractC8576l.yandex(str3, "\r\n") || AbstractC8576l.yandex(str, "\n") || AbstractC8576l.yandex(str, "\r\n") || i2 != c0574l.admob) {
                        c0574l2 = null;
                    } else {
                        if (i2 == 1 && str3.length() + i == i3) {
                            c0574l3 = new C0574l(c0574l4.yandex, "", AbstractC12900l.firebase(str3, str), c0574l4.amazon, c0574l.purchase, c0574l4.billing, false, 64);
                        } else if (i2 != 2 || c0574l4.yandex() != c0574l.yandex() || (c0574l4.yandex() != 1 && c0574l4.yandex() != 2)) {
                            c0574l2 = null;
                        } else if (i == str4.length() + i3) {
                            c0574l3 = new C0574l(c0574l.yandex, AbstractC12900l.firebase(str4, str2), "", c0574l4.amazon, c0574l.purchase, c0574l4.billing, false, 64);
                        } else {
                            int i4 = c0574l4.yandex;
                            if (i4 == i3) {
                                c0574l2 = new C0574l(i4, AbstractC12900l.firebase(str2, str4), "", c0574l4.amazon, c0574l.purchase, c0574l4.billing, false, 64);
                            } else {
                                c0574l2 = null;
                            }
                        }
                        c0574l2 = c0574l3;
                    }
                } else {
                    c0574l2 = null;
                }
            } else {
                c0574l2 = null;
            }
            if (c0574l2 != null) {
                c10086l.setValue(c0574l2);
            } else {
                m1193l();
                c10086l.setValue(c0574l);
            }
        } catch (Throwable th) {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public /* bridge */ InterfaceC0218l mo1199l(InterfaceC13789l interfaceC13789l, int i) {
        return AbstractC13095l.remoteconfig(interfaceC13789l, i);
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public C4344l m1200l(C2201l c2201l, List list, C9188l c9188l) {
        AbstractC14318l abstractC14318lSmaato;
        AbstractC10794l abstractC10794l = c2201l.yandex;
        C4344l c4344l = new C4344l();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC18041l abstractC18041l = (AbstractC18041l) it.next();
            InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
            if (interfaceC15234lPro instanceof InterfaceC17477l) {
                Set set = c9188l.purchase;
                AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
                if (abstractC14318lMo3847class instanceof AbstractC4317l) {
                    AbstractC4317l abstractC4317l = (AbstractC4317l) abstractC14318lMo3847class;
                    AbstractC15211l abstractC15211lSmaato = abstractC4317l.f8857l;
                    if (!abstractC15211lSmaato.mo1339native().getParameters().isEmpty() && abstractC15211lSmaato.mo1339native().pro() != null) {
                        List<InterfaceC16902l> parameters = abstractC15211lSmaato.mo1339native().getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(parameters, 10));
                        for (InterfaceC16902l interfaceC16902l : parameters) {
                            AbstractC4946l c12768l = (AbstractC4946l) AbstractC16901l.m4220for(interfaceC16902l.getIndex(), abstractC18041l.inmobi());
                            boolean z = set != null && set.contains(interfaceC16902l);
                            if (c12768l == null || z || abstractC10794l.amazon(c12768l.loadAd()) == null) {
                                c12768l = new C12768l(interfaceC16902l);
                            }
                            arrayList.add(c12768l);
                        }
                        abstractC15211lSmaato = AbstractC6419l.smaato(abstractC15211lSmaato, arrayList, null, 2);
                    }
                    AbstractC15211l abstractC15211lSmaato2 = abstractC4317l.f8856l;
                    if (!abstractC15211lSmaato2.mo1339native().getParameters().isEmpty() && abstractC15211lSmaato2.mo1339native().pro() != null) {
                        List<InterfaceC16902l> parameters2 = abstractC15211lSmaato2.mo1339native().getParameters();
                        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(parameters2, 10));
                        for (InterfaceC16902l interfaceC16902l2 : parameters2) {
                            AbstractC4946l c12768l2 = (AbstractC4946l) AbstractC16901l.m4220for(interfaceC16902l2.getIndex(), abstractC18041l.inmobi());
                            boolean z2 = set != null && set.contains(interfaceC16902l2);
                            if (c12768l2 == null || z2 || abstractC10794l.amazon(c12768l2.loadAd()) == null) {
                                c12768l2 = new C12768l(interfaceC16902l2);
                            }
                            arrayList2.add(c12768l2);
                        }
                        abstractC15211lSmaato2 = AbstractC6419l.smaato(abstractC15211lSmaato2, arrayList2, null, 2);
                    }
                    abstractC14318lSmaato = AbstractC3605l.subs(abstractC15211lSmaato, abstractC15211lSmaato2);
                } else {
                    if (!(abstractC14318lMo3847class instanceof AbstractC15211l)) {
                        C18725l.billing();
                        return null;
                    }
                    AbstractC15211l abstractC15211l = (AbstractC15211l) abstractC14318lMo3847class;
                    if (abstractC15211l.mo1339native().getParameters().isEmpty() || abstractC15211l.mo1339native().pro() == null) {
                        abstractC14318lSmaato = abstractC15211l;
                    } else {
                        List<InterfaceC16902l> parameters3 = abstractC15211l.mo1339native().getParameters();
                        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(parameters3, 10));
                        for (InterfaceC16902l interfaceC16902l3 : parameters3) {
                            AbstractC4946l c12768l3 = (AbstractC4946l) AbstractC16901l.m4220for(interfaceC16902l3.getIndex(), abstractC18041l.inmobi());
                            boolean z3 = set != null && set.contains(interfaceC16902l3);
                            if (c12768l3 == null || z3 || abstractC10794l.amazon(c12768l3.loadAd()) == null) {
                                c12768l3 = new C12768l(interfaceC16902l3);
                            }
                            arrayList3.add(c12768l3);
                        }
                        abstractC14318lSmaato = AbstractC6419l.smaato(abstractC15211l, arrayList3, null, 2);
                    }
                }
                c4344l.add(c2201l.billing(3, AbstractC5170l.purchase(abstractC14318lSmaato, AbstractC5170l.amazon(abstractC14318lMo3847class))));
            } else if (interfaceC15234lPro instanceof InterfaceC16902l) {
                Set set2 = c9188l.purchase;
                if (set2 == null || !set2.contains(interfaceC15234lPro)) {
                    c4344l.addAll(m1200l(c2201l, ((InterfaceC16902l) interfaceC15234lPro).getUpperBounds(), c9188l));
                } else {
                    c4344l.add(m1185l(c9188l));
                }
            }
        }
        return AbstractC9905l.yandex(c4344l);
    }

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public boolean m1201l() {
        boolean z;
        synchronized (this.f5291l) {
            z = ((C16977l) this.f5290l).purchase == 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[DONT_INVERT, PHI: r5
  0x0069: PHI (r5v3 long) = (r5v2 long), (r5v4 long) binds: [B:8:0x0025, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:0: B:7:0x0017->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e A[EDGE_INSN: B:34:0x006e->B:27:0x006e BREAK  A[LOOP:0: B:7:0x0017->B:26:0x006b], SYNTHETIC] */
    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public long m1202l() {
        long j;
        int i;
        synchronized (this.f5291l) {
            C16977l c16977l = (C16977l) this.f5290l;
            int[] iArr = c16977l.loadAd;
            Object[] objArr = c16977l.crashlytics;
            long[] jArr = c16977l.yandex;
            int length = jArr.length - 2;
            j = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                C2517l c2517l = (C2517l) objArr[i6];
                                i = i3;
                                if (c2517l.crashlytics == 5 || c2517l.loadAd.purchase()) {
                                    j |= 1 << i7;
                                }
                            } else {
                                i = i3;
                            }
                            j2 >>= i;
                            i5++;
                            i3 = i;
                        }
                        if (i4 != i3) {
                            break;
                        }
                        if (i2 != length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public /* bridge */ boolean mo1203l(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3557volatile(interfaceC2224l);
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public C18396l m1204l(String str) {
        String strAdmob = AbstractC3308l.admob((String) this.f5290l, str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5291l;
        boolean z = false;
        if (strAdmob.length() != 0 && !linkedHashMap.containsKey(strAdmob) && !linkedHashMap.containsKey(strAdmob.concat(".size"))) {
            Set<String> setKeySet = linkedHashMap.keySet();
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                return null;
            }
            for (String str2 : setKeySet) {
                if (!AbstractC16648l.isVip(str2, strAdmob, false) || str2.length() <= strAdmob.length() || str2.charAt(strAdmob.length()) != '.') {
                }
            }
            return null;
        }
        return new C18396l(linkedHashMap, strAdmob, z, 5);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public /* bridge */ boolean mo1205l(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.signatures(interfaceC2224l);
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public C5425l m1206l() {
        return new C5425l(true, true, true, this, C13231l.purchase, C14945l.amazon);
    }

    @Override // defpackage.InterfaceC14555l
    public int metrica(InterfaceC6440l interfaceC6440l) {
        if (interfaceC6440l instanceof InterfaceC0583l) {
            return AbstractC13095l.loadAd((InterfaceC13789l) interfaceC6440l);
        }
        if (interfaceC6440l instanceof C8469l) {
            return ((C8469l) interfaceC6440l).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC6440l);
        C11983l.adcel(sb, AbstractC18202l.yandex.loadAd(interfaceC6440l.getClass()));
        return 0;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ int mopub(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.loadAd(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC12954l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public /* bridge */ AbstractC15211l mo1207native(AbstractC18041l abstractC18041l) {
        return AbstractC13095l.mopub(abstractC18041l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public /* bridge */ InterfaceC0218l mo1208new(InterfaceC1633l interfaceC1633l) {
        return AbstractC13095l.m3550static(interfaceC1633l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public /* bridge */ InterfaceC2224l mo1209package(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3542import(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC13789l premium(InterfaceC13340l interfaceC13340l) {
        return AbstractC13095l.m3553switch(interfaceC13340l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public boolean mo1210private(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.purchase(interfaceC0583l) != null;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean pro(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3557volatile(mo1219this(interfaceC0583l)) && !AbstractC13095l.m3545native(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public /* bridge */ InterfaceC0583l mo1211protected(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.subs(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public /* bridge */ void mo1212public(InterfaceC0583l interfaceC0583l) {
        AbstractC13095l.m3533catch(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean purchase(InterfaceC13199l interfaceC13199l, InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.advert(interfaceC13199l, interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean remoteconfig(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.inmobi(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public InterfaceC13340l mo1213return(InterfaceC0583l interfaceC0583l) {
        InterfaceC6913l interfaceC6913l;
        C15110l c15110lPurchase = AbstractC13095l.purchase(interfaceC0583l);
        if (c15110lPurchase == null || (interfaceC6913l = c15110lPurchase.f29644l) == null) {
            interfaceC6913l = (InterfaceC6913l) interfaceC0583l;
        }
        return AbstractC13095l.amazon(this, interfaceC6913l);
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0583l signatures(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lM3532case;
        AbstractC4317l abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l);
        return (abstractC4317lBilling == null || (abstractC15211lM3532case = AbstractC13095l.m3532case(abstractC4317lBilling)) == null) ? AbstractC13095l.mopub(interfaceC13789l) : abstractC15211lM3532case;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC0583l smaato(InterfaceC5272l interfaceC5272l) {
        return AbstractC13095l.m3532case(interfaceC5272l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ int startapp(InterfaceC0218l interfaceC0218l) {
        return AbstractC13095l.pro(interfaceC0218l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public InterfaceC13789l mo1214static(ArrayList arrayList) {
        return AbstractC5712l.crashlytics(arrayList);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public boolean mo1215strictfp(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.m3551strictfp(signatures(interfaceC13789l)) != AbstractC13095l.m3551strictfp(mo1162class(interfaceC13789l));
    }

    @Override // defpackage.InterfaceC12954l
    public AbstractC16860l subs() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean subscription(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3554synchronized(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public /* bridge */ InterfaceC13199l mo1216super(InterfaceC2224l interfaceC2224l, int i) {
        return AbstractC13095l.adcel(interfaceC2224l, i);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public /* bridge */ int mo1217switch(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3534class(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public /* bridge */ int mo1218synchronized(InterfaceC13340l interfaceC13340l) {
        return AbstractC13095l.isPro(interfaceC13340l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC1633l tapsense(InterfaceC13340l interfaceC13340l) {
        return AbstractC13095l.m3552super(interfaceC13340l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public InterfaceC2224l mo1219this(InterfaceC13789l interfaceC13789l) {
        InterfaceC0583l interfaceC0583lMopub = AbstractC13095l.mopub(interfaceC13789l);
        if (interfaceC0583lMopub == null) {
            interfaceC0583lMopub = signatures(interfaceC13789l);
        }
        return AbstractC13095l.m3542import(interfaceC0583lMopub);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public /* bridge */ AbstractC12027l mo1220throw(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3546new(this, interfaceC0583l);
    }

    @Override // defpackage.InterfaceC13504l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public byte[] mo1221throws(int i, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i > 16) {
            C18073l.pro("outputLength must not be larger than 16");
            return null;
        }
        Mac mac = Mac.getInstance("AESCMAC", (Provider) this.f5290l);
        mac.init((SecretKeySpec) this.f5291l);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
    }

    public String toString() {
        switch (this.f5292l) {
            case 1:
                return AbstractC4001l.yandex(m1196l()).toString();
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return AbstractC1833l.firebase("\nif (" + ((C5501l) this.f5291l) + ") {\n    " + AbstractC16901l.m4210case((List) this.f5290l, ";\n", null, null, null, 62) + "\n};\n            ");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC6211l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public byte[] mo1222transient(byte[] bArr, C18595l c18595l) throws GeneralSecurityException {
        EnumC1618l enumC1618l = (EnumC1618l) this.f5291l;
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(AbstractC17185l.loadAd(((C0346l) c18595l.f36317l).loadAd()), C17423l.mopub(enumC1618l));
        C12437l c12437l = C12437l.billing;
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) c12437l.yandex.appmetrica("EC")).generatePrivate(eCPrivateKeySpec);
        ECParameterSpec eCParameterSpecMopub = C17423l.mopub(enumC1618l);
        byte[] bArrYandex = C17423l.yandex(eCPrivateKey, (ECPublicKey) ((KeyFactory) c12437l.yandex.appmetrica("EC")).generatePublic(new ECPublicKeySpec(C17423l.subs(eCParameterSpecMopub.getCurve(), EnumC5521l.f11790l, bArr), eCParameterSpecMopub)));
        byte[] bArrAmazon = AbstractC17265l.amazon(bArr, ((C0346l) c18595l.f36316l).loadAd());
        byte[] bArrAmazon2 = AbstractC17265l.amazon(AbstractC2383l.remoteconfig, mo1224while());
        C10828l c10828l = (C10828l) this.f5290l;
        int macLength = Mac.getInstance(c10828l.f21889l).getMacLength();
        byte[] bArr2 = AbstractC2383l.metrica;
        Charset charset = AbstractC0647l.yandex;
        return c10828l.yandex(c10828l.loadAd(AbstractC17265l.amazon(bArr2, bArrAmazon2, "eae_prk".getBytes(charset), bArrYandex), null), macLength, AbstractC17265l.amazon(AbstractC2383l.loadAd(2, macLength), bArr2, bArrAmazon2, "shared_secret".getBytes(charset), bArrAmazon));
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: try */
    public ListenableFuture mo1119try(byte[] bArr) {
        return AbstractC7151l.mopub(((InterfaceC9474l) this.f5291l).mo1119try(bArr), new C12023l(2, this), EnumC1535l.f3808l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean vip(InterfaceC0218l interfaceC0218l) {
        return AbstractC13095l.m3540for(interfaceC0218l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean mo1223volatile(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        return (abstractC15211lMopub != null ? AbstractC13095l.purchase(abstractC15211lMopub) : null) != null;
    }

    @Override // defpackage.InterfaceC6211l
    /* JADX INFO: renamed from: while, reason: not valid java name */
    public byte[] mo1224while() throws GeneralSecurityException {
        int iOrdinal = ((EnumC1618l) this.f5291l).ordinal();
        if (iOrdinal == 0) {
            return AbstractC2383l.crashlytics;
        }
        if (iOrdinal == 1) {
            return AbstractC2383l.amazon;
        }
        if (iOrdinal == 2) {
            return AbstractC2383l.purchase;
        }
        C18262l.ads("Could not determine HPKE KEM ID");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    @Override // defpackage.InterfaceC4034l
    public C0386l yandex(InterfaceC10430l interfaceC10430l, long j) {
        int iYandex;
        long position = interfaceC10430l.getPosition();
        int iMin = (int) Math.min(20000L, interfaceC10430l.getLength() - position);
        C13143l c13143l = (C13143l) this.f5290l;
        c13143l.m3563native(iMin);
        interfaceC10430l.yandex(0, iMin, c13143l.yandex);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (c13143l.yandex() >= 4) {
            if (C16269l.yandex(c13143l.loadAd, c13143l.yandex) != 442) {
                c13143l.m3568throw(1);
            } else {
                c13143l.m3568throw(4);
                long jCrashlytics = C12587l.crashlytics(c13143l);
                if (jCrashlytics != -9223372036854775807L) {
                    long jLoadAd = ((C16391l) this.f5291l).loadAd(jCrashlytics);
                    if (jLoadAd > j) {
                        return j2 == -9223372036854775807L ? new C0386l(-1, jLoadAd, position) : new C0386l(0, -9223372036854775807L, position + ((long) i2));
                    }
                    j2 = jLoadAd;
                    long j3 = 100000 + j2;
                    i2 = c13143l.loadAd;
                    if (j3 > j) {
                        return new C0386l(0, -9223372036854775807L, position + ((long) i2));
                    }
                }
                int i3 = c13143l.crashlytics;
                if (c13143l.yandex() >= 10) {
                    c13143l.m3568throw(9);
                    int iSignatures = c13143l.signatures() & 7;
                    if (c13143l.yandex() >= iSignatures) {
                        c13143l.m3568throw(iSignatures);
                        if (c13143l.yandex() >= 4) {
                            if (C16269l.yandex(c13143l.loadAd, c13143l.yandex) != 443) {
                                while (c13143l.yandex() >= 4) {
                                    iYandex = C16269l.yandex(c13143l.loadAd, c13143l.yandex);
                                    if (iYandex == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            c13143l.m3568throw(4);
                            int iM3567synchronized = c13143l.m3567synchronized();
                            if (c13143l.yandex() < iM3567synchronized) {
                                c13143l.m3562for(i3);
                            } else {
                                c13143l.m3568throw(iM3567synchronized);
                                while (c13143l.yandex() >= 4) {
                                    iYandex = C16269l.yandex(c13143l.loadAd, c13143l.yandex);
                                    if (iYandex == 442 || iYandex == 441 || (iYandex >>> 8) != 1) {
                                        break;
                                    }
                                    c13143l.m3568throw(4);
                                    if (c13143l.yandex() < 2) {
                                        c13143l.m3562for(i3);
                                        break;
                                    }
                                    c13143l.m3562for(Math.min(c13143l.crashlytics, c13143l.loadAd + c13143l.m3567synchronized()));
                                }
                            }
                        } else {
                            c13143l.m3562for(i3);
                        }
                    } else {
                        c13143l.m3562for(i3);
                    }
                } else {
                    c13143l.m3562for(i3);
                }
                i = c13143l.loadAd;
            }
        }
        return j2 != -9223372036854775807L ? new C0386l(-2, j2, position + ((long) i)) : C0386l.purchase;
    }

    @Override // defpackage.InterfaceC12954l, defpackage.InterfaceC14555l
    public /* bridge */ AbstractC15211l firebase(InterfaceC5272l interfaceC5272l) {
        return AbstractC13095l.m3531abstract(interfaceC5272l);
    }

    @Override // defpackage.InterfaceC12954l, defpackage.InterfaceC14555l
    public /* bridge */ AbstractC15211l smaato(InterfaceC5272l interfaceC5272l) {
        return AbstractC13095l.m3532case(interfaceC5272l);
    }

    @Override // defpackage.InterfaceC12954l, defpackage.InterfaceC14555l
    public /* bridge */ AbstractC15211l isPro(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3549public(interfaceC0583l, true);
    }

    @Override // defpackage.InterfaceC0713l
    /* JADX INFO: renamed from: extends */
    public void mo671extends(C18262l c18262l) {
    }

    public C2494l(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5292l = 12;
        this.f5291l = parcelFileDescriptor;
        this.f5290l = null;
    }

    public /* synthetic */ C2494l(Object obj, Object obj2, int i) {
        this.f5292l = i;
        this.f5291l = obj;
        this.f5290l = obj2;
    }

    public /* synthetic */ C2494l(Object obj, Object obj2, boolean z, int i) {
        this.f5292l = i;
        this.f5290l = obj;
        this.f5291l = obj2;
    }

    public C2494l(Context context) {
        this.f5292l = 18;
        this.f5291l = new C8341l();
        this.f5290l = context.getPackageManager();
    }

    public C2494l(C9912l c9912l) {
        this.f5292l = 26;
        C16412l c16412l = new C16412l("Type parameter upper bound erasure results");
        this.f5291l = new C8688l(new C8467l(13, this));
        this.f5290l = c16412l.loadAd(new C17330l(11, this));
    }

    public C2494l(C0574l c0574l, C9106l c9106l) {
        this.f5292l = 25;
        this.f5291l = c9106l;
        this.f5290l = AbstractC8020l.smaato(c0574l);
    }

    public /* synthetic */ C2494l(int i, boolean z) {
        this.f5292l = i;
    }

    public C2494l(C16391l c16391l) {
        this.f5292l = 14;
        this.f5291l = c16391l;
        this.f5290l = new C13143l();
    }

    public C2494l(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.f5292l = 13;
        if (AbstractC12589l.pro(1)) {
            this.f5291l = new SecretKeySpec(bArr, "AES");
            this.f5290l = provider;
        } else {
            C18262l.ads("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
    }

    public C2494l(int i) {
        this.f5292l = i;
        switch (i) {
            case 10:
                this.f5291l = new AtomicInteger();
                this.f5290l = new AtomicInteger();
                break;
            case 16:
                this.f5291l = null;
                this.f5290l = null;
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f5291l = new LinkedHashMap();
                this.f5290l = new LinkedHashMap();
                break;
            case 23:
                this.f5291l = new Object();
                C16977l c16977l = AbstractC6903l.yandex;
                this.f5290l = new C16977l();
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f5291l = new C17951l(128);
                this.f5290l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                break;
            default:
                this.f5291l = new LinkedHashMap();
                this.f5290l = "";
                break;
        }
    }

    public C2494l(Context context, String str, String str2) {
        this.f5292l = 20;
        if (str != null) {
            this.f5290l = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f5291l = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f5291l = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        C8339l.metrica("keysetName cannot be null");
        throw null;
    }

    public C2494l(InterfaceC16228l interfaceC16228l) {
        this.f5292l = 3;
        this.f5291l = interfaceC16228l;
        this.f5290l = (NativePointer) AbstractC10999l.subs(C17218l.f33421l, new C8912l(this, null, 16));
    }

    public C2494l(InterfaceC17061l interfaceC17061l) {
        this.f5292l = 27;
        this.f5291l = interfaceC17061l;
        C12280l c12280l = new C12280l();
        c12280l.loadAd = 0;
        this.f5290l = c12280l;
    }

    public C2494l(C13708l c13708l, int[] iArr) {
        this.f5292l = 8;
        this.f5291l = AbstractC1186l.Signature(c13708l);
        this.f5290l = iArr;
    }

    public C2494l(List list, Map map) throws GeneralSecurityException {
        this.f5292l = 1;
        this.f5291l = list;
        this.f5290l = map;
        if (((AtomicBoolean) AbstractC5910l.yandex.f21690l).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C4003l c4003l = (C4003l) it.next();
                int i = c4003l.amazon;
                if (!hashSet.contains(Integer.valueOf(i))) {
                    hashSet.add(Integer.valueOf(i));
                    if (c4003l.purchase) {
                        z = true;
                    }
                } else {
                    throw new GeneralSecurityException(AbstractC15560l.tapsense("KeyID ", i, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (z) {
                return;
            }
            C18262l.ads("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            throw null;
        }
    }

    public C2494l(String str, Bundle bundle) {
        this.f5292l = 5;
        if (str != null) {
            this.f5291l = str;
            this.f5290l = bundle;
        } else {
            C8339l.metrica("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            throw null;
        }
    }
}
