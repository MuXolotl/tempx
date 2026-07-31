package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٖۥٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16763l {
    public static Field admob = null;
    public static Method billing = null;
    public static boolean mopub = false;
    public static boolean purchase = false;
    public static final byte[] yandex = {0, 0, 0, 1};
    public static final float[] loadAd = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object crashlytics = new Object();
    public static int[] amazon = new int[10];

    public static void Signature(C7200l c7200l) {
        int iBilling = c7200l.billing() + 1;
        c7200l.isPro(8);
        for (int i = 0; i < iBilling; i++) {
            c7200l.billing();
            c7200l.billing();
            c7200l.subs();
        }
        c7200l.isPro(20);
    }

    public static C14513l adcel(int i, int i2, byte[] bArr) {
        byte b;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b == 0 || i2 <= i3) {
            return null;
        }
        C7200l c7200l = new C7200l(bArr, i3, i2 + 1);
        while (c7200l.loadAd(16)) {
            int iPurchase = c7200l.purchase(8);
            byte b2 = 0;
            int i4 = 0;
            while (iPurchase == 255) {
                i4 += 255;
                iPurchase = c7200l.purchase(8);
            }
            int i5 = i4 + iPurchase;
            int iPurchase2 = c7200l.purchase(8);
            int i6 = 0;
            while (iPurchase2 == 255) {
                i6 += 255;
                iPurchase2 = c7200l.purchase(8);
            }
            int i7 = i6 + iPurchase2;
            if (i7 == 0 || !c7200l.loadAd(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iBilling = c7200l.billing();
                boolean zAmazon = c7200l.amazon();
                int iBilling2 = zAmazon ? c7200l.billing() : 0;
                int iBilling3 = c7200l.billing();
                int iBilling4 = -1;
                int i8 = 0;
                while (true) {
                    int i9 = 10;
                    if (i8 > iBilling3) {
                        return new C14513l(iBilling4, i9, b2);
                    }
                    iBilling4 = c7200l.billing();
                    c7200l.billing();
                    int iPurchase3 = c7200l.purchase(6);
                    if (iPurchase3 == 63) {
                        return null;
                    }
                    c7200l.purchase(iPurchase3 == 0 ? Math.max(0, iBilling - 30) : Math.max(0, (iPurchase3 + iBilling) - 31));
                    if (zAmazon) {
                        int iPurchase4 = c7200l.purchase(6);
                        if (iPurchase4 == 63) {
                            return null;
                        }
                        c7200l.purchase(iPurchase4 == 0 ? Math.max(0, iBilling2 - 30) : Math.max(0, (iPurchase4 + iBilling2) - 31));
                    }
                    if (c7200l.amazon()) {
                        c7200l.isPro(10);
                    }
                    i8++;
                }
            } else {
                c7200l.isPro(i7 * 8);
            }
        }
        return null;
    }

    public static int admob(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        AbstractC12442l.subscription(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            purchase(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            purchase(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            purchase(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    purchase(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    public static C11849l ads(byte[] bArr, int i, int i2, C10038l c10038l) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iBilling;
        int i7;
        int iBilling2;
        int i8;
        int i9;
        int iMax;
        int i10;
        int i11;
        int i12;
        int iBilling3;
        int iMopub;
        int i13;
        C13568l c13568l;
        C18396l c18396l;
        C15380l c15380lMetrica = metrica(new C7200l(bArr, i, i2));
        C7200l c7200l = new C7200l(bArr, i + 2, i2);
        int i14 = 4;
        c7200l.isPro(4);
        int iPurchase = c7200l.purchase(3);
        int i15 = c15380lMetrica.crashlytics;
        boolean z = i15 != 0 && iPurchase == 7;
        if (c10038l != null) {
            AbstractC1186l abstractC1186l = (AbstractC1186l) c10038l.f20463l;
            if (abstractC1186l.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((C7275l) abstractC1186l.get(Math.min(i15, abstractC1186l.size() - 1))).yandex;
            }
        } else {
            i3 = 0;
        }
        C18741l c18741lStartapp = null;
        if (!z) {
            c7200l.subs();
            c18741lStartapp = startapp(c7200l, true, iPurchase, null);
        } else if (c10038l != null) {
            C2494l c2494l = (C2494l) c10038l.f20462l;
            int[] iArr = (int[]) c2494l.f5290l;
            AbstractC1186l abstractC1186l2 = (AbstractC1186l) c2494l.f5291l;
            int i16 = iArr[i3];
            if (abstractC1186l2.size() > i16) {
                c18741lStartapp = (C18741l) abstractC1186l2.get(i16);
            }
        }
        c7200l.billing();
        if (z) {
            int iPurchase2 = c7200l.amazon() ? c7200l.purchase(8) : -1;
            if (c10038l == null || (c18396l = (C18396l) c10038l.f20466l) == null) {
                iBilling = 0;
                iBilling2 = 0;
                i7 = 0;
                i9 = 0;
                i6 = 0;
                i8 = 0;
            } else {
                AbstractC1186l abstractC1186l3 = (AbstractC1186l) c18396l.f35934l;
                if (iPurchase2 == -1) {
                    iPurchase2 = ((int[]) c18396l.f35933l)[i3];
                }
                if (iPurchase2 == -1 || abstractC1186l3.size() <= iPurchase2) {
                    iBilling = 0;
                    iBilling2 = 0;
                    i7 = 0;
                    i9 = 0;
                    i6 = 0;
                    i8 = 0;
                } else {
                    C7617l c7617l = (C7617l) abstractC1186l3.get(iPurchase2);
                    int i17 = c7617l.yandex;
                    i7 = c7617l.amazon;
                    int i18 = c7617l.purchase;
                    iBilling = c7617l.loadAd;
                    iBilling2 = c7617l.crashlytics;
                    i6 = i18;
                    i8 = i6;
                    i9 = i7;
                }
            }
        } else {
            int iBilling4 = c7200l.billing();
            if (iBilling4 == 3) {
                c7200l.subs();
            }
            int iBilling5 = c7200l.billing();
            int iBilling6 = c7200l.billing();
            if (c7200l.amazon()) {
                int iBilling7 = c7200l.billing();
                int iBilling8 = c7200l.billing();
                int iBilling9 = c7200l.billing();
                int iBilling10 = c7200l.billing();
                i4 = iBilling5 - ((iBilling7 + iBilling8) * ((iBilling4 == 1 || iBilling4 == 2) ? 2 : 1));
                i5 = iBilling6 - ((iBilling9 + iBilling10) * (iBilling4 == 1 ? 2 : 1));
            } else {
                i4 = iBilling5;
                i5 = iBilling6;
            }
            i6 = i5;
            iBilling = c7200l.billing();
            i7 = i4;
            iBilling2 = c7200l.billing();
            i8 = iBilling6;
            i9 = iBilling5;
        }
        int iBilling11 = c7200l.billing();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i19 = c7200l.amazon() ? 0 : iPurchase; i19 <= iPurchase; i19++) {
                c7200l.billing();
                iMax = Math.max(c7200l.billing(), iMax);
                c7200l.billing();
            }
        }
        c7200l.billing();
        c7200l.billing();
        c7200l.billing();
        c7200l.billing();
        c7200l.billing();
        c7200l.billing();
        if (c7200l.amazon()) {
            int i20 = 6;
            if (z ? c7200l.amazon() : false) {
                c7200l.isPro(6);
            } else if (c7200l.amazon()) {
                int i21 = 0;
                while (i21 < i14) {
                    int i22 = 0;
                    while (i22 < i20) {
                        if (c7200l.amazon()) {
                            int iMin = Math.min(64, 1 << ((i21 << 1) + 4));
                            if (i21 > 1) {
                                c7200l.mopub();
                            }
                            for (int i23 = 0; i23 < iMin; i23++) {
                                c7200l.mopub();
                            }
                        } else {
                            c7200l.billing();
                        }
                        i22 += i21 == 3 ? 3 : 1;
                        i20 = 6;
                    }
                    i21++;
                    i14 = 4;
                    i20 = 6;
                }
            }
        }
        c7200l.isPro(2);
        if (c7200l.amazon()) {
            c7200l.isPro(8);
            c7200l.billing();
            c7200l.billing();
            c7200l.subs();
        }
        int iBilling12 = c7200l.billing();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i24 = 0;
        int iBilling13 = -1;
        int i25 = -1;
        while (i24 < iBilling12) {
            if (i24 == 0 || !c7200l.amazon()) {
                int iBilling14 = c7200l.billing();
                iBilling13 = c7200l.billing();
                int[] iArr3 = new int[iBilling14];
                int i26 = 0;
                while (i26 < iBilling14) {
                    iArr3[i26] = (i26 > 0 ? iArr3[i26 - 1] : 0) - (c7200l.billing() + 1);
                    c7200l.subs();
                    i26++;
                }
                int[] iArr4 = new int[iBilling13];
                int i27 = 0;
                while (i27 < iBilling13) {
                    iArr4[i27] = c7200l.billing() + 1 + (i27 > 0 ? iArr4[i27 - 1] : 0);
                    c7200l.subs();
                    i27++;
                }
                i25 = iBilling14;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i28 = i25 + iBilling13;
                int iBilling15 = (1 - ((c7200l.amazon() ? 1 : 0) * 2)) * (c7200l.billing() + 1);
                int i29 = i28 + 1;
                boolean[] zArr = new boolean[i29];
                for (int i30 = 0; i30 <= i28; i30++) {
                    if (c7200l.amazon()) {
                        zArr[i30] = true;
                    } else {
                        zArr[i30] = c7200l.amazon();
                    }
                }
                int[] iArr5 = new int[i29];
                int[] iArr6 = new int[i29];
                int i31 = 0;
                for (int i32 = iBilling13 - 1; i32 >= 0; i32--) {
                    int i33 = iArrCopyOf[i32] + iBilling15;
                    if (i33 < 0 && zArr[i25 + i32]) {
                        iArr5[i31] = i33;
                        i31++;
                    }
                }
                if (iBilling15 < 0 && zArr[i28]) {
                    iArr5[i31] = iBilling15;
                    i31++;
                }
                int i34 = i31;
                int[] iArr7 = iArr2;
                for (int i35 = 0; i35 < i25; i35++) {
                    int i36 = iArr7[i35] + iBilling15;
                    if (i36 < 0 && zArr[i35]) {
                        iArr5[i34] = i36;
                        i34++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i34);
                int i37 = 0;
                for (int i38 = i25 - 1; i38 >= 0; i38--) {
                    int i39 = iArr7[i38] + iBilling15;
                    if (i39 > 0 && zArr[i38]) {
                        iArr6[i37] = i39;
                        i37++;
                    }
                }
                if (iBilling15 > 0 && zArr[i28]) {
                    iArr6[i37] = iBilling15;
                    i37++;
                }
                int i40 = i34;
                int i41 = i37;
                for (int i42 = 0; i42 < iBilling13; i42++) {
                    int i43 = iArrCopyOf[i42] + iBilling15;
                    if (i43 > 0 && zArr[i25 + i42]) {
                        iArr6[i41] = i43;
                        i41++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i41);
                iBilling13 = i41;
                i25 = i40;
                iArr2 = iArrCopyOf2;
            }
            i24++;
            iBilling12 = iBilling12;
            i3 = i3;
        }
        int i44 = i3;
        if (c7200l.amazon()) {
            int iBilling16 = c7200l.billing();
            for (int i45 = 0; i45 < iBilling16; i45++) {
                c7200l.isPro(iBilling11 + 5);
            }
        }
        c7200l.isPro(2);
        float f = 1.0f;
        if (c7200l.amazon()) {
            if (c7200l.amazon()) {
                int iPurchase3 = c7200l.purchase(8);
                if (iPurchase3 == 255) {
                    int iPurchase4 = c7200l.purchase(16);
                    int iPurchase5 = c7200l.purchase(16);
                    if (iPurchase4 != 0 && iPurchase5 != 0) {
                        f = iPurchase4 / iPurchase5;
                    }
                } else if (iPurchase3 < 17) {
                    f = loadAd[iPurchase3];
                } else {
                    AbstractC12900l.subscription("Unexpected aspect_ratio_idc value: ", iPurchase3, "NalUnitUtil");
                }
            }
            if (c7200l.amazon()) {
                c7200l.subs();
            }
            if (c7200l.amazon()) {
                c7200l.isPro(3);
                i13 = c7200l.amazon() ? 1 : 2;
                if (c7200l.amazon()) {
                    int iPurchase6 = c7200l.purchase(8);
                    int iPurchase7 = c7200l.purchase(8);
                    c7200l.isPro(8);
                    iBilling3 = C1591l.billing(iPurchase6);
                    iMopub = C1591l.mopub(iPurchase7);
                } else {
                    iBilling3 = -1;
                    iMopub = -1;
                }
            } else if (c10038l == null || (c13568l = (C13568l) c10038l.f20465l) == null) {
                iBilling3 = -1;
                iMopub = -1;
                i13 = -1;
            } else {
                AbstractC1186l abstractC1186l4 = (AbstractC1186l) c13568l.f26581l;
                int i46 = ((int[]) c13568l.f26580l)[i44];
                if (abstractC1186l4.size() > i46) {
                    C10476l c10476l = (C10476l) abstractC1186l4.get(i46);
                    int i47 = c10476l.yandex;
                    int i48 = c10476l.loadAd;
                    iMopub = c10476l.crashlytics;
                    iBilling3 = i47;
                    i13 = i48;
                } else {
                    iBilling3 = -1;
                    iMopub = -1;
                    i13 = -1;
                }
            }
            if (c7200l.amazon()) {
                c7200l.billing();
                c7200l.billing();
            }
            c7200l.subs();
            if (c7200l.amazon()) {
                i6 *= 2;
            }
            i10 = iBilling3;
            i12 = iMopub;
            i11 = i13;
        } else {
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        return new C11849l(iPurchase, c18741lStartapp, iBilling, iBilling2, i7, i6, i9, i8, f, iMax, i10, i11, i12);
    }

    public static boolean billing(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = C9519l.amazon;
            C9519l c9519l = (C9519l) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (c9519l == null) {
                c9519l = new C9519l();
                c9519l.yandex = null;
                c9519l.loadAd = null;
                c9519l.crashlytics = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, c9519l);
            }
            WeakReference weakReference2 = c9519l.crashlytics;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                c9519l.crashlytics = new WeakReference(keyEvent);
                if (c9519l.loadAd == null) {
                    c9519l.loadAd = new SparseArray();
                }
                SparseArray sparseArray = c9519l.loadAd;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    C18725l.loadAd();
                    return false;
                }
            }
        }
        return false;
    }

    public static final void crashlytics(C12217l c12217l, boolean z, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        InterfaceC17242l interfaceC17242lBilling;
        c6956l.m2133new(-1442752422);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c12217l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            c6956l.m2123default(-1299459355);
            if (z) {
                c6956l.m2123default(-1299415211);
                boolean zAdmob = c6956l.admob(c12217l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == C1867l.yandex) {
                    objM2132native = new C17773l(c12217l, null, i3);
                    c6956l.m2147try(objM2132native);
                }
                interfaceC17242lBilling = AbstractC3739l.billing((Function2) objM2132native);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1298836224);
                c6956l.startapp(false);
                interfaceC17242lBilling = C4346l.f8873l;
            }
            AbstractC6419l.amazon((i2 >> 3) & 112, c15578l, c6956l, interfaceC17242lBilling);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1973l(c12217l, z, c15578l, i, 0);
        }
    }

    public static boolean firebase(FileChannel fileChannel) throws C13768l {
        long size = fileChannel.size() - fileChannel.position();
        int i = AbstractC11306l.purchase;
        if (size < i) {
            throw new C13768l("This is not a WAV File (<12 bytes)");
        }
        ByteBuffer byteBufferSubs = AbstractC14375l.subs(fileChannel, i);
        if (!AbstractC14375l.isPro(byteBufferSubs).equals("RIFF")) {
            return false;
        }
        byteBufferSubs.getInt();
        return AbstractC14375l.isPro(byteBufferSubs).equals("WAVE");
    }

    public static boolean isPro(byte[] bArr, int i, C5978l c5978l) {
        int i2;
        if (Objects.equals(c5978l.metrica, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i2 = b & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(c5978l.metrica, "video/hevc")) {
            C15380l c15380lMetrica = metrica(new C7200l(bArr, 4, i + 4));
            int i3 = c15380lMetrica.loadAd;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && c15380lMetrica.amazon == c5978l.f12624throws - 1) {
                return false;
            }
        }
        return true;
    }

    public static int license(int i, byte[] bArr) {
        int i2;
        synchronized (crashlytics) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = amazon;
                    if (iArr.length <= i4) {
                        amazon = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    amazon[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = amazon[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static final void loadAd(C16173l c16173l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        InterfaceC17242l interfaceC17242lCrashlytics;
        c6956l.m2133new(1533506138);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c16173l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        int i4 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            c6956l.m2123default(-885604480);
            if (c16173l.firebase()) {
                InterfaceC14029l interfaceC14029l = null;
                interfaceC17242lCrashlytics = AbstractC17332l.crashlytics(AbstractC3739l.billing(new C17092l(c16173l, interfaceC14029l, i4)), c16173l.ad, new C13954l(c16173l, interfaceC14029l, 7), new C5806l(c16173l, interfaceC14029l, i4), new C14701l(c16173l, i3));
            } else {
                interfaceC17242lCrashlytics = C4346l.f8873l;
            }
            AbstractC6419l.amazon(i2 & 112, c15578l, c6956l, interfaceC17242lCrashlytics);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1993l(c16173l, c15578l, i, i4);
        }
    }

    public static C15380l metrica(C7200l c7200l) {
        c7200l.subs();
        return new C15380l(c7200l.purchase(6), c7200l.purchase(6), c7200l.purchase(3) - 1, 6);
    }

    public static boolean mopub(InterfaceC10671l interfaceC10671l, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC10671l != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC10671l.purchase(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!purchase) {
                            try {
                                billing = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            purchase = true;
                        }
                        Method method = billing;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC15872l.crashlytics(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!mopub) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        admob = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    mopub = true;
                }
                Field field = admob;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC15872l.crashlytics(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC15872l.crashlytics(view, keyEvent)) || interfaceC10671l.purchase(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static void purchase(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int smaato(C5978l c5978l) {
        String strSubs = subs(c5978l);
        if (Objects.equals(strSubs, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strSubs, "video/hevc") || Objects.equals(strSubs, "video/vvc")) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static C18741l startapp(C7200l c7200l, boolean z, int i, C18741l c18741l) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zAmazon;
        int iPurchase;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (!z) {
            if (c18741l != null) {
                int i7 = c18741l.yandex;
                zAmazon = c18741l.loadAd;
                iPurchase = c18741l.crashlytics;
                i5 = c18741l.amazon;
                iArr2 = c18741l.purchase;
                i2 = i7;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int iPurchase2 = c7200l.purchase(8);
            i6 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                if (c7200l.amazon()) {
                    i6 += 88;
                }
                if (c7200l.amazon()) {
                    i6 += 8;
                }
            }
            c7200l.isPro(i6);
            if (i > 0) {
                c7200l.isPro((8 - i) * 2);
            }
            return new C18741l(i2, z2, i3, i4, iArr, iPurchase2);
        }
        int iPurchase3 = c7200l.purchase(2);
        zAmazon = c7200l.amazon();
        iPurchase = c7200l.purchase(5);
        i5 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (c7200l.amazon()) {
                i5 |= 1 << i9;
            }
        }
        for (int i10 = 0; i10 < 6; i10++) {
            iArr2[i10] = c7200l.purchase(8);
        }
        i2 = iPurchase3;
        iArr = iArr2;
        z2 = zAmazon;
        i3 = iPurchase;
        i4 = i5;
        int iPurchase4 = c7200l.purchase(8);
        i6 = 0;
        while (i8 < i) {
            if (c7200l.amazon()) {
                i6 += 88;
            }
            if (c7200l.amazon()) {
                i6 += 8;
            }
        }
        c7200l.isPro(i6);
        if (i > 0) {
            c7200l.isPro((8 - i) * 2);
        }
        return new C18741l(i2, z2, i3, i4, iArr, iPurchase4);
    }

    public static String subs(C5978l c5978l) {
        String str = c5978l.metrica;
        String str2 = c5978l.firebase;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return c5978l.metrica;
    }

    /* JADX WARN: Code duplicated, block: B:475:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static C10038l subscription(int i, int i2, byte[] bArr) {
        int[] iArr;
        C13568l c13568l;
        int iPurchase;
        int iPurchase2;
        int iPurchase3;
        int i3;
        C13708l c13708l;
        boolean[][] zArr;
        int i4;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z;
        int i5;
        boolean zAmazon;
        int i6;
        int i7;
        int i8;
        boolean zAmazon2;
        boolean zAmazon3;
        int iBilling;
        int i9;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        C7200l c7200l = new C7200l(bArr, i, i2);
        metrica(c7200l);
        c7200l.isPro(4);
        boolean zAmazon4 = c7200l.amazon();
        boolean zAmazon5 = c7200l.amazon();
        int iPurchase4 = c7200l.purchase(6);
        int i12 = iPurchase4 + 1;
        int iPurchase5 = c7200l.purchase(3);
        c7200l.isPro(17);
        C18741l c18741lStartapp = startapp(c7200l, true, iPurchase5, null);
        for (int i13 = c7200l.amazon() ? 0 : iPurchase5; i13 <= iPurchase5; i13++) {
            c7200l.billing();
            c7200l.billing();
            c7200l.billing();
        }
        int iPurchase6 = c7200l.purchase(6);
        int iBilling2 = c7200l.billing() + 1;
        int i14 = 6;
        C2494l c2494l = new C2494l(AbstractC1186l.isVip(c18741lStartapp), new int[1]);
        boolean z4 = i12 >= 2 && iBilling2 >= 2;
        boolean z5 = zAmazon4 && zAmazon5;
        int i15 = iPurchase6 + 1;
        boolean z6 = i15 >= i12;
        if (!z4 || !z5 || !z6) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iBilling2, i15);
        int i16 = 1;
        int[] iArr5 = new int[iBilling2];
        int[] iArr6 = new int[iBilling2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i17 = 1; i17 < iBilling2; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 <= iPurchase6; i19++) {
                if (c7200l.amazon()) {
                    iArr4[i17][i18] = i19;
                    iArr6[i17] = i19;
                    i18++;
                }
                iArr5[i17] = i18;
            }
        }
        if (c7200l.amazon()) {
            c7200l.isPro(64);
            if (c7200l.amazon()) {
                c7200l.billing();
            }
            int iBilling3 = c7200l.billing();
            int i20 = 0;
            while (i20 < iBilling3) {
                c7200l.billing();
                if (i20 == 0 || c7200l.amazon()) {
                    boolean zAmazon6 = c7200l.amazon();
                    boolean zAmazon7 = c7200l.amazon();
                    z3 = zAmazon6;
                    z2 = zAmazon7;
                    if (zAmazon6 || zAmazon7) {
                        zAmazon = c7200l.amazon();
                        if (zAmazon) {
                            c7200l.isPro(19);
                        }
                        c7200l.isPro(8);
                        if (zAmazon) {
                            c7200l.isPro(4);
                        }
                        c7200l.isPro(15);
                        i7 = zAmazon6;
                        i6 = zAmazon7;
                    }
                    i8 = 0;
                    while (i8 <= iPurchase5) {
                        zAmazon2 = c7200l.amazon();
                        if (!zAmazon2) {
                            zAmazon2 = c7200l.amazon();
                        }
                        if (zAmazon2) {
                            c7200l.billing();
                            zAmazon3 = false;
                        } else {
                            zAmazon3 = c7200l.amazon();
                        }
                        if (zAmazon3) {
                            iBilling = 0;
                        } else {
                            iBilling = c7200l.billing();
                        }
                        int[][] iArr7 = iArr4;
                        i9 = i7 + i6;
                        int[] iArr8 = iArr6;
                        i10 = 0;
                        while (i10 < i9) {
                            int i21 = i9;
                            for (i11 = 0; i11 <= iBilling; i11++) {
                                c7200l.billing();
                                c7200l.billing();
                                if (zAmazon) {
                                    c7200l.billing();
                                    c7200l.billing();
                                }
                                c7200l.subs();
                            }
                            i10++;
                            i9 = i21;
                        }
                        i8++;
                        i20 = i20;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i20++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zAmazon = false;
                i7 = z3;
                i6 = z2;
                i8 = 0;
                while (i8 <= iPurchase5) {
                    zAmazon2 = c7200l.amazon();
                    if (!zAmazon2) {
                        zAmazon2 = c7200l.amazon();
                    }
                    if (zAmazon2) {
                        c7200l.billing();
                        zAmazon3 = false;
                    } else {
                        zAmazon3 = c7200l.amazon();
                    }
                    if (zAmazon3) {
                        iBilling = c7200l.billing();
                    } else {
                        iBilling = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i9 = i7 + i6;
                    int[] iArr10 = iArr6;
                    i10 = 0;
                    while (i10 < i9) {
                        int i22 = i9;
                        while (i11 <= iBilling) {
                            c7200l.billing();
                            c7200l.billing();
                            if (zAmazon) {
                                c7200l.billing();
                                c7200l.billing();
                            }
                            c7200l.subs();
                        }
                        i10++;
                        i9 = i22;
                    }
                    i8++;
                    i20 = i20;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i20++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!c7200l.amazon()) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        int i23 = c7200l.amazon;
        if (i23 > 0) {
            c7200l.isPro(8 - i23);
        }
        C18741l c18741lStartapp2 = startapp(c7200l, false, iPurchase5, c18741lStartapp);
        boolean zAmazon8 = c7200l.amazon();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zAmazon9 = c7200l.amazon();
            zArr3[i25] = zAmazon9;
            if (zAmazon9) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        int[] iArr13 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zAmazon8 ? 1 : 0); i26++) {
            iArr13[i26] = c7200l.purchase(3);
        }
        int[] iArr14 = new int[i24 + 1];
        if (zAmazon8) {
            int i27 = 1;
            while (i27 < i24) {
                int[] iArr15 = iArr14;
                for (int i28 = 0; i28 < i27; i28++) {
                    iArr15[i27] = iArr13[i28] + 1 + iArr15[i27];
                }
                i27++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i24] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i12, i24);
        int[] iArr17 = new int[i12];
        iArr17[0] = 0;
        boolean zAmazon10 = c7200l.amazon();
        int i29 = 1;
        while (i29 < i12) {
            if (zAmazon10) {
                i5 = i29;
                iArr17[i5] = c7200l.purchase(i14);
            } else {
                i5 = i29;
                iArr17[i5] = i5;
            }
            if (zAmazon8) {
                int i30 = 0;
                while (i30 < i24) {
                    int i31 = i30 + 1;
                    iArr16[i5][i30] = (iArr17[i5] & ((1 << iArr[i31]) - 1)) >> iArr[i30];
                    i30 = i31;
                }
            } else {
                int i32 = 0;
                while (i32 < i24) {
                    int i33 = i32;
                    iArr16[i5][i33] = c7200l.purchase(iArr13[i32] + 1);
                    i32 = i33 + 1;
                }
            }
            i29 = i5 + 1;
            i14 = 6;
        }
        int[] iArr18 = new int[i15];
        int i34 = 1;
        int i35 = 0;
        while (i35 < i12) {
            iArr18[iArr17[i35]] = -1;
            int[] iArr19 = iArr18;
            int i36 = 0;
            int i37 = 0;
            while (i36 < 16) {
                if (zArr3[i36]) {
                    if (i36 == i16) {
                        iArr19[iArr17[i35]] = iArr16[i35][i37];
                    }
                    i37++;
                }
                i36++;
                i16 = 1;
            }
            if (i35 > 0) {
                int i38 = 0;
                while (true) {
                    if (i38 >= i35) {
                        z = true;
                        break;
                    }
                    int i39 = i38;
                    if (iArr19[iArr17[i35]] == iArr19[iArr17[i38]]) {
                        z = false;
                        break;
                    }
                    i38 = i39 + 1;
                }
                if (z) {
                    i34++;
                }
            }
            i35++;
            iArr18 = iArr19;
            i16 = 1;
        }
        int[] iArr20 = iArr18;
        int iPurchase7 = c7200l.purchase(4);
        if (i34 < 2 || iPurchase7 == 0) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        int[] iArr21 = new int[i34];
        for (int i40 = 0; i40 < i34; i40++) {
            iArr21[i40] = c7200l.purchase(iPurchase7);
        }
        int[] iArr22 = new int[i15];
        for (int i41 = 0; i41 < i12; i41++) {
            iArr22[Math.min(iArr17[i41], iPurchase6)] = i41;
        }
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        int i42 = 0;
        while (i42 <= iPurchase6) {
            int[] iArr23 = iArr22;
            int i43 = i34;
            int iMin = Math.min(iArr20[i42], i43 - 1);
            c16971lMetrica.crashlytics(new C7275l(iArr23[i42], iMin >= 0 ? iArr21[iMin] : -1));
            i42++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i34 = i43;
        }
        int[] iArr24 = iArr17;
        C13708l c13708lMopub = c16971lMetrica.mopub();
        if (((C7275l) c13708lMopub.get(0)).loadAd == -1) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        int i44 = 1;
        while (true) {
            if (i44 > iPurchase6) {
                i44 = -1;
                break;
            }
            if (((C7275l) c13708lMopub.get(i44)).loadAd != -1) {
                break;
            }
            i44++;
        }
        if (i44 == -1) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        for (int i45 = 1; i45 < i12; i45++) {
            for (int i46 = 0; i46 < i45; i46++) {
                boolean[] zArr6 = zArr4[i45];
                boolean[] zArr7 = zArr5[i45];
                boolean zAmazon11 = c7200l.amazon();
                zArr7[i46] = zAmazon11;
                zArr6[i46] = zAmazon11;
            }
        }
        for (int i47 = 1; i47 < i12; i47++) {
            int i48 = 0;
            while (i48 < iPurchase4) {
                boolean[][] zArr8 = zArr4;
                for (int i49 = 0; i49 < i47; i49++) {
                    boolean[] zArr9 = zArr5[i47];
                    if (zArr9[i49] && zArr5[i49][i48]) {
                        zArr9[i48] = true;
                        break;
                    }
                }
                i48++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i15];
        for (int i50 = 0; i50 < i12; i50++) {
            int i51 = 0;
            for (int i52 = 0; i52 < i50; i52++) {
                i51 += zArr10[i50][i52] ? 1 : 0;
            }
            iArr25[iArr24[i50]] = i51;
        }
        int i53 = 0;
        for (int i54 = 0; i54 < i12; i54++) {
            if (iArr25[iArr24[i54]] == 0) {
                i53++;
            }
        }
        if (i53 > 1) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        int[] iArr26 = new int[i12];
        int[] iArr27 = new int[iBilling2];
        if (c7200l.amazon()) {
            int i55 = 0;
            while (i55 < i12) {
                int i56 = i55;
                iArr26[i56] = c7200l.purchase(3);
                i55 = i56 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i12, iPurchase5);
        }
        int i57 = 0;
        while (i57 < iBilling2) {
            int i58 = i57;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i59 = 0; i59 < iArr5[i58]; i59++) {
                iMax = Math.max(iMax, iArr28[((C7275l) c13708lMopub.get(iArr11[i58][i59])).yandex]);
            }
            iArr27[i58] = iMax + 1;
            i57 = i58 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (c7200l.amazon()) {
            int i60 = 0;
            while (i60 < iPurchase4) {
                int i61 = i60 + 1;
                int i62 = i61;
                while (i62 < i12) {
                    if (zArr10[i62][i60]) {
                        c7200l.isPro(3);
                    }
                    i62++;
                    iPurchase4 = iPurchase4;
                }
                i60 = i61;
            }
        }
        c7200l.subs();
        int iBilling4 = c7200l.billing() + 1;
        C16971l c16971lMetrica2 = AbstractC1186l.metrica();
        c16971lMetrica2.crashlytics(c18741lStartapp);
        if (iBilling4 > 1) {
            c16971lMetrica2.crashlytics(c18741lStartapp2);
            for (int i63 = 2; i63 < iBilling4; i63++) {
                c18741lStartapp2 = startapp(c7200l, c7200l.amazon(), iPurchase5, c18741lStartapp2);
                c16971lMetrica2.crashlytics(c18741lStartapp2);
            }
        }
        C13708l c13708lMopub2 = c16971lMetrica2.mopub();
        int iBilling5 = c7200l.billing() + iBilling2;
        if (iBilling5 > iBilling2) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        int iPurchase8 = c7200l.purchase(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iBilling5, i15);
        int[] iArr29 = new int[iBilling5];
        int i64 = 0;
        int[] iArr30 = new int[iBilling5];
        int i65 = 0;
        while (i65 < iBilling2) {
            iArr29[i65] = i64;
            iArr30[i65] = iArr12[i65];
            if (iPurchase8 == 0) {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i4], i64, iArr5[i4], true);
                iArr2[i4] = iArr5[i4];
            } else {
                i4 = i65;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iPurchase8 == 1) {
                    int i66 = iArr12[i4];
                    for (int i67 = 0; i67 < iArr5[i4]; i67++) {
                        zArr2[i4][i67] = iArr11[i4][i67] == i66;
                    }
                    iArr2[i4] = 1;
                } else {
                    i64 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i65 = i4 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i64 = 0;
            i65 = i4 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i15];
        int i68 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i15;
        iArr34[i64] = iBilling5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i69 = 1;
        int i70 = 0;
        while (i69 < iBilling5) {
            if (iPurchase8 == i68) {
                for (int i71 = 0; i71 < iArr5[i69]; i71++) {
                    zArr14[i69][i71] = c7200l.amazon();
                    int i72 = iArr31[i69];
                    boolean z7 = zArr14[i69][i71];
                    iArr31[i69] = i72 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i69] = iArr11[i69][i71];
                    }
                }
            }
            if (i70 == 0) {
                i3 = 0;
                if (iArr11[i69][0] == 0 && zArr14[i69][0]) {
                    for (int i73 = 1; i73 < iArr5[i69]; i73++) {
                        if (iArr11[i69][i73] == i44 && zArr14[i69][i44]) {
                            i70 = i69;
                        }
                    }
                }
            } else {
                i3 = 0;
            }
            int i74 = i3;
            while (i74 < iArr5[i69]) {
                if (iBilling4 > 1) {
                    zArr15[i69][i74] = zArr14[i69][i74];
                    c13708l = c13708lMopub2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iCrashlytics = AbstractC4771l.crashlytics(iBilling4);
                    if (!zArr[i69][i74]) {
                        int i75 = ((C7275l) c13708lMopub.get(iArr11[i69][i74])).yandex;
                        int i76 = i3;
                        while (i76 < i74) {
                            int i77 = i76;
                            if (zArr12[i75][((C7275l) c13708lMopub.get(iArr11[i69][i77])).yandex]) {
                                zArr[i69][i74] = true;
                                break;
                            }
                            i76 = i77 + 1;
                        }
                    }
                    if (zArr[i69][i74]) {
                        if (i70 <= 0 || i69 != i70) {
                            c7200l.isPro(iCrashlytics);
                        } else {
                            iArr33[i74] = c7200l.purchase(iCrashlytics);
                        }
                    }
                } else {
                    c13708l = c13708lMopub2;
                    zArr = zArr15;
                }
                i74++;
                c13708lMopub2 = c13708l;
                zArr15 = zArr;
            }
            C13708l c13708l2 = c13708lMopub2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i69] == 1 && iArr25[iArr30[i69]] > 0) {
                c7200l.subs();
            }
            i69++;
            c13708lMopub2 = c13708l2;
            zArr15 = zArr16;
            i68 = 2;
        }
        C13708l c13708l3 = c13708lMopub2;
        boolean[][] zArr17 = zArr15;
        if (i70 == 0) {
            return new C10038l((C13708l) null, c2494l, (C18396l) null, (C13568l) null);
        }
        int iBilling6 = c7200l.billing();
        int i78 = iBilling6 + 1;
        C16971l c16971lAds = AbstractC1186l.ads(i78);
        int[] iArr35 = new int[i12];
        for (int i79 = 0; i79 < i78; i79++) {
            int iPurchase9 = c7200l.purchase(16);
            int iPurchase10 = c7200l.purchase(16);
            if (c7200l.amazon()) {
                iPurchase = c7200l.purchase(2);
                if (iPurchase == 3) {
                    c7200l.subs();
                }
                iPurchase2 = c7200l.purchase(4);
                iPurchase3 = c7200l.purchase(4);
            } else {
                iPurchase = 0;
                iPurchase2 = 0;
                iPurchase3 = 0;
            }
            if (c7200l.amazon()) {
                int iBilling7 = c7200l.billing();
                int iBilling8 = c7200l.billing();
                int iBilling9 = c7200l.billing();
                int iBilling10 = c7200l.billing();
                iPurchase9 -= (iBilling7 + iBilling8) * ((iPurchase == 1 || iPurchase == 2) ? 2 : 1);
                iPurchase10 -= (iBilling9 + iBilling10) * (iPurchase == 1 ? 2 : 1);
            }
            c16971lAds.crashlytics(new C7617l(iPurchase, iPurchase2, iPurchase3, iPurchase9, iPurchase10));
        }
        if (i78 <= 1 || !c7200l.amazon()) {
            for (int i80 = 1; i80 < i12; i80++) {
                iArr35[i80] = Math.min(i80, iBilling6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iCrashlytics2 = AbstractC4771l.crashlytics(i78);
            for (int i81 = 1; i81 < i12; i81++) {
                iArr35[i81] = c7200l.purchase(iCrashlytics2);
            }
        }
        C18396l c18396l = new C18396l(c16971lAds.mopub(), iArr35);
        c7200l.isPro(2);
        for (int i82 = 1; i82 < i12; i82++) {
            if (iArr25[iArr24[i82]] == 0) {
                c7200l.subs();
            }
        }
        for (int i83 = 1; i83 < iBilling5; i83++) {
            boolean zAmazon12 = c7200l.amazon();
            int i84 = 0;
            while (i84 < iArr32[i83]) {
                if ((i84 <= 0 || !zAmazon12) ? i84 == 0 : c7200l.amazon()) {
                    for (int i85 = 0; i85 < iArr5[i83]; i85++) {
                        if (zArr17[i83][i85]) {
                            c7200l.billing();
                        }
                    }
                    c7200l.billing();
                    c7200l.billing();
                }
                i84++;
            }
        }
        int iBilling11 = c7200l.billing() + 2;
        if (c7200l.amazon()) {
            c7200l.isPro(iBilling11);
        } else {
            for (int i86 = 1; i86 < i12; i86++) {
                for (int i87 = 0; i87 < i86; i87++) {
                    if (zArr10[i86][i87]) {
                        c7200l.isPro(iBilling11);
                    }
                }
            }
        }
        int iBilling12 = c7200l.billing();
        for (int i88 = 1; i88 <= iBilling12; i88++) {
            c7200l.isPro(8);
        }
        if (c7200l.amazon()) {
            int i89 = c7200l.amazon;
            if (i89 > 0) {
                c7200l.isPro(8 - i89);
            }
            if (!c7200l.amazon() ? c7200l.amazon() : true) {
                c7200l.subs();
            }
            boolean zAmazon13 = c7200l.amazon();
            boolean zAmazon14 = c7200l.amazon();
            if (zAmazon13 || zAmazon14) {
                for (int i90 = 0; i90 < iBilling2; i90++) {
                    for (int i91 = 0; i91 < iArr32[i90]; i91++) {
                        boolean zAmazon15 = zAmazon13 ? c7200l.amazon() : false;
                        boolean zAmazon16 = zAmazon14 ? c7200l.amazon() : false;
                        if (zAmazon15) {
                            c7200l.isPro(32);
                        }
                        if (zAmazon16) {
                            c7200l.isPro(18);
                        }
                    }
                }
            }
            boolean zAmazon17 = c7200l.amazon();
            int iPurchase11 = zAmazon17 ? c7200l.purchase(4) + 1 : i12;
            C16971l c16971lAds2 = AbstractC1186l.ads(iPurchase11);
            int[] iArr36 = new int[i12];
            for (int i92 = 0; i92 < iPurchase11; i92++) {
                c7200l.isPro(3);
                int i93 = c7200l.amazon() ? 1 : 2;
                int iBilling13 = C1591l.billing(c7200l.purchase(8));
                int iMopub = C1591l.mopub(c7200l.purchase(8));
                c7200l.isPro(8);
                c16971lAds2.crashlytics(new C10476l(iBilling13, i93, iMopub));
            }
            if (zAmazon17 && iPurchase11 > 1) {
                for (int i94 = 0; i94 < i12; i94++) {
                    iArr36[i94] = c7200l.purchase(4);
                }
            }
            c13568l = new C13568l(c16971lAds2.mopub(), iArr36);
        } else {
            c13568l = null;
        }
        return new C10038l(c13708lMopub, new C2494l(c13708l3, iArr33), c18396l, c13568l);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
  0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static C15055l tapsense(int i, int i2, byte[] bArr) {
        int iBilling;
        int iBilling2;
        int i3;
        boolean z;
        int i4;
        int iBilling3;
        boolean z2;
        boolean zAmazon;
        int i5;
        int i6;
        int i7;
        int iBilling4;
        int iBilling5;
        float f;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int iMopub;
        boolean zAmazon2;
        boolean zAmazon3;
        int iPurchase;
        int iPurchase2;
        int iPurchase3;
        int i13;
        int i14;
        C7200l c7200l = new C7200l(bArr, i + 1, i2);
        int iPurchase4 = c7200l.purchase(8);
        int iPurchase5 = c7200l.purchase(8);
        int iPurchase6 = c7200l.purchase(8);
        int iBilling6 = c7200l.billing();
        if (iPurchase4 == 100 || iPurchase4 == 110 || iPurchase4 == 122 || iPurchase4 == 244 || iPurchase4 == 44 || iPurchase4 == 83 || iPurchase4 == 86 || iPurchase4 == 118 || iPurchase4 == 128 || iPurchase4 == 138) {
            iBilling = c7200l.billing();
            boolean zAmazon4 = iBilling == 3 ? c7200l.amazon() : false;
            int iBilling7 = c7200l.billing();
            iBilling2 = c7200l.billing();
            c7200l.subs();
            if (c7200l.amazon()) {
                int i15 = iBilling != 3 ? 8 : 12;
                i3 = 16;
                int i16 = 0;
                while (i16 < i15) {
                    if (c7200l.amazon()) {
                        int i17 = i16 < 6 ? 16 : 64;
                        int iMopub2 = 8;
                        int i18 = 8;
                        for (int i19 = 0; i19 < i17; i19++) {
                            if (iMopub2 != 0) {
                                iMopub2 = ((c7200l.mopub() + i18) + PSKKeyManager.MAX_KEY_LENGTH_BYTES) % PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            if (iMopub2 != 0) {
                                i18 = iMopub2;
                            }
                        }
                    }
                    i16++;
                }
            } else {
                i3 = 16;
            }
            z = zAmazon4;
            i4 = iBilling7;
        } else {
            iBilling = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            iBilling2 = 0;
        }
        int iBilling8 = c7200l.billing() + 4;
        int iBilling9 = c7200l.billing();
        if (iBilling9 != 0) {
            if (iBilling9 == 1) {
                boolean zAmazon5 = c7200l.amazon();
                c7200l.mopub();
                c7200l.mopub();
                iPurchase4 = iPurchase4;
                long jBilling = c7200l.billing();
                iBilling9 = iBilling9;
                for (int i20 = 0; i20 < jBilling; i20++) {
                    c7200l.billing();
                }
                iBilling2 = iBilling2;
                z2 = zAmazon5;
                iBilling3 = 0;
            } else {
                iBilling3 = 0;
            }
            c7200l.billing();
            c7200l.subs();
            int iBilling10 = c7200l.billing() + 1;
            int iBilling11 = c7200l.billing() + 1;
            zAmazon = c7200l.amazon();
            i5 = 2 - (zAmazon ? 1 : 0);
            int i21 = iBilling11 * i5;
            if (!zAmazon) {
                c7200l.subs();
            }
            c7200l.subs();
            i6 = iBilling10 * 16;
            i7 = i21 * 16;
            if (c7200l.amazon()) {
                int iBilling12 = c7200l.billing();
                int iBilling13 = c7200l.billing();
                int iBilling14 = c7200l.billing();
                int iBilling15 = c7200l.billing();
                if (iBilling == 0) {
                    i13 = 1;
                } else {
                    if (iBilling == 3) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (iBilling == 1) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    i5 *= i14;
                }
                i6 -= (iBilling12 + iBilling13) * i13;
                i7 -= (iBilling14 + iBilling15) * i5;
            }
            int i22 = i7;
            int i23 = i6;
            int i24 = iPurchase4;
            iBilling4 = ((i24 != 44 || i24 == 86 || i24 == 100 || i24 == 110 || i24 == 122 || i24 == 244) && (iPurchase5 & 16) != 0) ? 0 : i3;
            iBilling5 = -1;
            f = 1.0f;
            if (c7200l.amazon()) {
                if (!c7200l.amazon()) {
                    iPurchase = c7200l.purchase(8);
                    if (iPurchase == 255) {
                        int i25 = i3;
                        iPurchase2 = c7200l.purchase(i25);
                        iPurchase3 = c7200l.purchase(i25);
                        if (iPurchase2 != 0 && iPurchase3 != 0) {
                            f = iPurchase2 / iPurchase3;
                        }
                    } else if (iPurchase < 17) {
                        f = loadAd[iPurchase];
                    } else {
                        AbstractC12900l.subscription("Unexpected aspect_ratio_idc value: ", iPurchase, "NalUnitUtil");
                    }
                }
                if (c7200l.amazon()) {
                    c7200l.subs();
                }
                if (c7200l.amazon()) {
                    c7200l.isPro(3);
                    if (c7200l.amazon()) {
                        i12 = 1;
                    } else {
                        i12 = 2;
                    }
                    if (c7200l.amazon()) {
                        int iPurchase7 = c7200l.purchase(8);
                        int iPurchase8 = c7200l.purchase(8);
                        c7200l.isPro(8);
                        iBilling5 = C1591l.billing(iPurchase7);
                        iMopub = C1591l.mopub(iPurchase8);
                    } else {
                        iMopub = -1;
                    }
                } else {
                    i12 = -1;
                    iMopub = -1;
                }
                if (c7200l.amazon()) {
                    c7200l.billing();
                    c7200l.billing();
                }
                if (c7200l.amazon()) {
                    c7200l.isPro(65);
                }
                zAmazon2 = c7200l.amazon();
                if (zAmazon2) {
                    Signature(c7200l);
                }
                zAmazon3 = c7200l.amazon();
                if (zAmazon3) {
                    Signature(c7200l);
                }
                if (zAmazon2 || zAmazon3) {
                    c7200l.subs();
                }
                c7200l.subs();
                if (c7200l.amazon()) {
                    c7200l.subs();
                    c7200l.billing();
                    c7200l.billing();
                    c7200l.billing();
                    c7200l.billing();
                    iBilling4 = c7200l.billing();
                    c7200l.billing();
                }
                f2 = f;
                i11 = iBilling5;
                i9 = i12;
                i10 = iMopub;
                i8 = iBilling4;
            } else {
                iBilling8 = iBilling8;
                i8 = iBilling4;
                i9 = -1;
                i10 = -1;
                f2 = 1.0f;
                i11 = -1;
            }
            return new C15055l(i24, iPurchase5, iPurchase6, iBilling6, i23, i22, f2, i4, iBilling2, z, zAmazon, iBilling8, iBilling9, iBilling3, z2, i11, i9, i10, i8);
        }
        iBilling3 = c7200l.billing() + 4;
        z2 = false;
        c7200l.billing();
        c7200l.subs();
        int iBilling16 = c7200l.billing() + 1;
        int iBilling17 = c7200l.billing() + 1;
        zAmazon = c7200l.amazon();
        i5 = 2 - (zAmazon ? 1 : 0);
        int i26 = iBilling17 * i5;
        if (!zAmazon) {
            c7200l.subs();
        }
        c7200l.subs();
        i6 = iBilling16 * 16;
        i7 = i26 * 16;
        if (c7200l.amazon()) {
            int iBilling18 = c7200l.billing();
            int iBilling19 = c7200l.billing();
            int iBilling110 = c7200l.billing();
            int iBilling111 = c7200l.billing();
            if (iBilling == 0) {
                i13 = 1;
            } else {
                if (iBilling == 3) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (iBilling == 1) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                i5 *= i14;
            }
            i6 -= (iBilling18 + iBilling19) * i13;
            i7 -= (iBilling110 + iBilling111) * i5;
        }
        int i27 = i7;
        int i28 = i6;
        int i29 = iPurchase4;
        if (i29 != 44) {
        }
        iBilling5 = -1;
        f = 1.0f;
        if (c7200l.amazon()) {
            if (!c7200l.amazon()) {
                iPurchase = c7200l.purchase(8);
                if (iPurchase == 255) {
                    int i210 = i3;
                    iPurchase2 = c7200l.purchase(i210);
                    iPurchase3 = c7200l.purchase(i210);
                    if (iPurchase2 != 0) {
                        f = iPurchase2 / iPurchase3;
                    }
                } else if (iPurchase < 17) {
                    f = loadAd[iPurchase];
                } else {
                    AbstractC12900l.subscription("Unexpected aspect_ratio_idc value: ", iPurchase, "NalUnitUtil");
                }
            }
            if (c7200l.amazon()) {
                c7200l.subs();
            }
            if (c7200l.amazon()) {
                c7200l.isPro(3);
                if (c7200l.amazon()) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                if (c7200l.amazon()) {
                    int iPurchase9 = c7200l.purchase(8);
                    int iPurchase10 = c7200l.purchase(8);
                    c7200l.isPro(8);
                    iBilling5 = C1591l.billing(iPurchase9);
                    iMopub = C1591l.mopub(iPurchase10);
                } else {
                    iMopub = -1;
                }
            } else {
                i12 = -1;
                iMopub = -1;
            }
            if (c7200l.amazon()) {
                c7200l.billing();
                c7200l.billing();
            }
            if (c7200l.amazon()) {
                c7200l.isPro(65);
            }
            zAmazon2 = c7200l.amazon();
            if (zAmazon2) {
                Signature(c7200l);
            }
            zAmazon3 = c7200l.amazon();
            if (zAmazon3) {
                Signature(c7200l);
            }
            if (zAmazon2) {
                c7200l.subs();
            } else {
                c7200l.subs();
            }
            c7200l.subs();
            if (c7200l.amazon()) {
                c7200l.subs();
                c7200l.billing();
                c7200l.billing();
                c7200l.billing();
                c7200l.billing();
                iBilling4 = c7200l.billing();
                c7200l.billing();
            }
            f2 = f;
            i11 = iBilling5;
            i9 = i12;
            i10 = iMopub;
            i8 = iBilling4;
        } else {
            iBilling8 = iBilling8;
            i8 = iBilling4;
            i9 = -1;
            i10 = -1;
            f2 = 1.0f;
            i11 = -1;
        }
        return new C15055l(i29, iPurchase5, iPurchase6, iBilling6, i28, i27, f2, i4, iBilling2, z, zAmazon, iBilling8, iBilling9, iBilling3, z2, i11, i9, i10, i8);
    }

    public static final void yandex(C0205l c0205l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-614342087);
        int i2 = (c6956l.admob(c0205l) ? 4 : 2) | i;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            c6956l.m2123default(-1009319487);
            InterfaceC14029l interfaceC14029l = null;
            AbstractC6419l.amazon(48, c15578l, c6956l, AbstractC17332l.crashlytics(AbstractC3739l.billing(new C17972l(c0205l, interfaceC14029l, 14)), c0205l.f1157l, new C13954l(c0205l, interfaceC14029l, 5), null, new C15531l(c0205l, 3)));
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6959l(c0205l, c15578l, i, i3);
        }
    }

    public void amazon(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC9534l(this, i, 9));
    }

    public abstract void remoteconfig(int i);

    public abstract void vip(Typeface typeface);
}
