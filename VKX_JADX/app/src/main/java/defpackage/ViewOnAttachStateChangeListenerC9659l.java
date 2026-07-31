package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍٜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC9659l extends C10156l implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, Runnable {

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public static final C16761l f19703l;

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final C5991l f19704l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C16977l f19705l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public final RunnableC16112l f19706l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10834l f19707l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C15685l f19708l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AccessibilityManager f19709l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public Integer f19710l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f19711l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public final ArrayList f19713l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public final C4622l f19714l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C16977l f19715l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final C2565l f19716l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public C11873l f19717l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public long f19718l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C18152l f19719l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C16977l f19720l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final String f19721l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C4622l f19722l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f19723l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C1909l f19724l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public boolean f19725l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f19726l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l f19728l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final C13440l f19729l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C9396l f19730l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public final C13440l f19731l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f19732l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final String f19733l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f19734l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f19736l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final C16977l f19737l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C15685l f19738l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final C13440l f19739l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C18152l f19740l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f19741l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f19727l = RecyclerView.UNDEFINED_DURATION;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2565l f19735l = new C2565l(this, 0);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f19712l = 100;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C16761l c16761l = AbstractC7124l.yandex;
        C16761l c16761l2 = new C16761l(32);
        int i = c16761l2.loadAd;
        if (i < 0) {
            AbstractC13082l.amazon("");
            throw null;
        }
        int i2 = i + 32;
        c16761l2.loadAd(i2);
        int[] iArr2 = c16761l2.yandex;
        int i3 = c16761l2.loadAd;
        if (i != i3) {
            AbstractC8669l.ad(i2, i, iArr2, iArr2, i3);
        }
        AbstractC8669l.premium(i, 0, iArr, iArr2, 12);
        c16761l2.loadAd += 32;
        f19703l = c16761l2;
    }

    public ViewOnAttachStateChangeListenerC9659l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        this.f19728l = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.f19709l = (AccessibilityManager) viewTreeObserverOnGlobalLayoutListenerC13840l.getContext().getSystemService("accessibility");
        new Handler(Looper.getMainLooper());
        this.f19724l = new C1909l(this);
        this.f19736l = RecyclerView.UNDEFINED_DURATION;
        this.f19732l = RecyclerView.UNDEFINED_DURATION;
        this.f19715l = new C16977l();
        this.f19720l = new C16977l();
        this.f19740l = new C18152l(0);
        this.f19719l = new C18152l(0);
        this.f19711l = -1;
        this.f19707l = new C10834l(0);
        this.f19723l = true;
        C16977l c16977l = AbstractC6903l.yandex;
        this.f19705l = c16977l;
        this.f19722l = new C4622l();
        this.f19729l = new C13440l();
        this.f19739l = new C13440l();
        this.f19721l = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f19733l = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f19704l = new C5991l((byte) 0, 10);
        this.f19737l = new C16977l();
        this.f19717l = new C11873l(viewTreeObserverOnGlobalLayoutListenerC13840l.getSemanticsOwner().yandex(), c16977l);
        int i = AbstractC10498l.yandex;
        this.f19731l = new C13440l();
        this.f19714l = new C4622l();
        viewTreeObserverOnGlobalLayoutListenerC13840l.addOnAttachStateChangeListener(this);
        this.f19706l = new RunnableC16112l(2, this);
        this.f19713l = new ArrayList();
        this.f19716l = new C2565l(this, 1);
    }

    public static final boolean ad(C11601l c11601l) {
        Function0 function0 = c11601l.yandex;
        if (((Number) function0.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) c11601l.loadAd.invoke()).floatValue();
        return false;
    }

    public static final boolean advert(C11601l c11601l) {
        Function0 function0 = c11601l.yandex;
        if (((Number) function0.invoke()).floatValue() < ((Number) c11601l.loadAd.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void appmetrica(ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC9659l.applovin(i, i2, num, null);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static float[] m2705extends(AbstractC15342l abstractC15342l) {
        if (!(abstractC15342l instanceof C18521l)) {
            return null;
        }
        C3903l c3903l = ((C18521l) abstractC15342l).amazon;
        long j = c3903l.admob;
        long j2 = c3903l.mopub;
        long j3 = c3903l.billing;
        long j4 = c3903l.purchase;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static Region m2706for(AbstractC15342l abstractC15342l, float f, float f2) {
        if (abstractC15342l instanceof C13616l) {
            C13616l c13616l = (C13616l) abstractC15342l;
            C8896l c8896lRemoteconfig = c13616l.crashlytics().remoteconfig(f, f2);
            Region region = new Region(new Rect((int) (c8896lRemoteconfig.yandex + 0.0f), (int) (c8896lRemoteconfig.loadAd + 0.0f), (int) (c8896lRemoteconfig.crashlytics + 0.0f), (int) (c8896lRemoteconfig.amazon + 0.0f)));
            Region region2 = new Region();
            C9902l c9902l = c13616l.amazon;
            if (c9902l instanceof C9902l) {
                Path path = c9902l.yandex;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            C10754l.ads("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static Rect m2707native(AbstractC15342l abstractC15342l, float f, float f2) {
        if (!(abstractC15342l instanceof C13080l) && !(abstractC15342l instanceof C18521l)) {
            return null;
        }
        C8896l c8896lCrashlytics = abstractC15342l.crashlytics();
        return new Rect((int) (c8896lCrashlytics.yandex + f), (int) (c8896lCrashlytics.loadAd + f2), (int) (c8896lCrashlytics.crashlytics + f), (int) (c8896lCrashlytics.amazon + f2));
    }

    public static final boolean pro(C11601l c11601l, float f) {
        Function0 function0 = c11601l.yandex;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) c11601l.loadAd.invoke()).floatValue();
        }
        return true;
    }

    public static String subscription(C18666l c18666l) {
        C3625l c3625l;
        if (c18666l != null) {
            C6264l c6264l = c18666l.amazon;
            C13660l c13660l = c6264l.f13225l;
            C4707l c4707l = AbstractC0424l.yandex;
            if (c13660l.crashlytics(c4707l)) {
                return AbstractC2066l.yandex((List) c6264l.mopub(c4707l), ",", null, 62);
            }
            C4707l c4707l2 = AbstractC0424l.f1545package;
            if (c13660l.crashlytics(c4707l2)) {
                Object objMopub = c13660l.mopub(c4707l2);
                if (objMopub == null) {
                    objMopub = null;
                }
                C3625l c3625l2 = (C3625l) objMopub;
                if (c3625l2 != null) {
                    return c3625l2.f7563l;
                }
            } else {
                Object objMopub2 = c13660l.mopub(AbstractC0424l.applovin);
                if (objMopub2 == null) {
                    objMopub2 = null;
                }
                List list = (List) objMopub2;
                if (list != null && (c3625l = (C3625l) AbstractC16901l.m4217extends(list)) != null) {
                    return c3625l.f7563l;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static CharSequence m2708throw(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence;
    }

    public final boolean Signature() {
        AccessibilityManager accessibilityManager = this.f19709l;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f19734l;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f19734l = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final int adcel(C18666l c18666l) {
        C6264l c6264l = c18666l.amazon;
        if (!c6264l.f13225l.crashlytics(AbstractC0424l.yandex)) {
            C4707l c4707l = AbstractC0424l.f1549synchronized;
            if (c6264l.f13225l.crashlytics(c4707l)) {
                return (int) (((C12814l) c6264l.mopub(c4707l)).yandex >> 32);
            }
        }
        return this.f19711l;
    }

    public final AbstractC14183l ads() {
        if (this.f19723l) {
            this.f19723l = false;
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f19728l;
            this.f19705l = AbstractC14425l.amazon(viewTreeObserverOnGlobalLayoutListenerC13840l.getSemanticsOwner(), C11192l.f22533l);
            if (Signature()) {
                C16977l c16977l = this.f19705l;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC13840l.getContext().getResources();
                C13440l c13440l = this.f19729l;
                c13440l.yandex();
                C13440l c13440l2 = this.f19739l;
                c13440l2.yandex();
                C13874l c13874l = (C13874l) c16977l.loadAd(-1);
                C18666l c18666l = c13874l != null ? c13874l.yandex : null;
                ArrayList arrayListLoadAd = AbstractC0963l.loadAd(c18666l, new C3006l(3, c16977l), new C3006l(4, resources), Collections.singletonList(c18666l));
                int iSmaato = AbstractC14055l.smaato(arrayListLoadAd);
                int i = 1;
                if (1 <= iSmaato) {
                    while (true) {
                        int i2 = ((C18666l) arrayListLoadAd.get(i - 1)).billing;
                        int i3 = ((C18666l) arrayListLoadAd.get(i)).billing;
                        c13440l.billing(i2, i3);
                        c13440l2.billing(i3, i2);
                        if (i == iSmaato) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f19705l;
    }

    public final boolean applovin(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !Signature()) {
            return false;
        }
        AccessibilityEvent accessibilityEventVip = vip(i, i2);
        if (num != null) {
            accessibilityEventVip.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventVip.setContentDescription(AbstractC2066l.yandex(list, ",", null, 62));
        }
        return premium(accessibilityEventVip);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m2709catch() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        C11873l c11873l;
        C4622l c4622l = new C4622l();
        C4622l c4622l2 = this.f19722l;
        int[] iArr = c4622l2.loadAd;
        long[] jArr3 = c4622l2.yandex;
        int length = jArr3.length - 2;
        C16977l c16977l = this.f19737l;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            C13874l c13874l = (C13874l) ads().loadAd(i6);
                            Object obj = null;
                            C18666l c18666l = c13874l != null ? c13874l.yandex : null;
                            if (c18666l != null) {
                                if (!c18666l.amazon.f13225l.crashlytics(AbstractC0424l.amazon)) {
                                    c4622l.yandex(i6);
                                    c11873l = (C11873l) c16977l.loadAd(i6);
                                    if (c11873l != null) {
                                        Object objMopub = c11873l.yandex.f13225l.mopub(AbstractC0424l.amazon);
                                        obj = (String) (objMopub != null ? objMopub : null);
                                    }
                                    inmobi(i6, 32, obj);
                                }
                            } else {
                                c4622l.yandex(i6);
                                c11873l = (C11873l) c16977l.loadAd(i6);
                                if (c11873l != null) {
                                    Object objMopub2 = c11873l.yandex.f13225l.mopub(AbstractC0424l.amazon);
                                    obj = (String) (objMopub2 != null ? objMopub2 : null);
                                }
                                inmobi(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = c4622l.loadAd;
        long[] jArr4 = c4622l.yandex;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int i11 = (-862048943) * i10;
                            int i12 = i11 ^ (i11 << 16);
                            int i13 = i12 & 127;
                            int i14 = c4622l2.crashlytics;
                            int i15 = (i12 >>> 7) & i14;
                            i = i2;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = c4622l2.yandex;
                                int i17 = i15 >> 3;
                                jArr2 = jArr4;
                                int i18 = (i15 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i17] >>> i18) | ((jArr5[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
                                int i19 = i14;
                                long j8 = (((long) i13) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i19;
                                    int i20 = i19;
                                    if (c4622l2.loadAd[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i19 = i20;
                                }
                                int i21 = i19;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i16 += 8;
                                i15 = (i15 + i16) & i21;
                                jArr4 = jArr2;
                                i14 = i21;
                                j6 = j4;
                            }
                            int i22 = iNumberOfTrailingZeros;
                            if (i22 >= 0) {
                                c4622l2.admob(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        c16977l.crashlytics();
        AbstractC14183l abstractC14183lAds = ads();
        int[] iArr3 = abstractC14183lAds.loadAd;
        Object[] objArr = abstractC14183lAds.crashlytics;
        long[] jArr6 = abstractC14183lAds.yandex;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            C18666l c18666l2 = ((C13874l) objArr[i26]).yandex;
                            C6264l c6264l = c18666l2.amazon;
                            C4707l c4707l = AbstractC0424l.amazon;
                            if (c6264l.f13225l.crashlytics(c4707l) && c4622l2.yandex(i27)) {
                                inmobi(i27, 16, (String) c18666l2.amazon.mopub(c4707l));
                            }
                            c16977l.subs(i27, new C11873l(c18666l2, ads()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.f19717l = new C11873l(this.f19728l.getSemanticsOwner().yandex(), ads());
    }

    public final Rect firebase(C13874l c13874l) {
        C16918l c16918l = c13874l.loadAd;
        return m2711private(c16918l.yandex, c16918l.loadAd, c16918l.crashlytics, c16918l.amazon);
    }

    public final void inmobi(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventVip = vip(isVip(i), 32);
        accessibilityEventVip.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventVip.getText().add(str);
        }
        premium(accessibilityEventVip);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    public final void isPro(int i, C15685l c15685l, String str, Bundle bundle) {
        C18666l c18666l;
        RectF[] rectFArr;
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo = c15685l.yandex;
        C13874l c13874l = (C13874l) ads().loadAd(i);
        if (c13874l == null || (c18666l = c13874l.yandex) == null) {
            return;
        }
        C3654l c3654l = c18666l.crashlytics;
        C6264l c6264l = c18666l.amazon;
        C13660l c13660l = c6264l.f13225l;
        String strSubscription = subscription(c18666l);
        if (AbstractC8576l.yandex(str, this.f19721l)) {
            int iAmazon = this.f19729l.amazon(i);
            if (iAmazon != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iAmazon);
                return;
            }
            return;
        }
        if (AbstractC8576l.yandex(str, this.f19733l)) {
            int iAmazon2 = this.f19739l.amazon(i);
            if (iAmazon2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iAmazon2);
                return;
            }
            return;
        }
        boolean zCrashlytics = c13660l.crashlytics(AbstractC16601l.yandex);
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f19728l;
        int i3 = 0;
        if (zCrashlytics && bundle != null && AbstractC8576l.yandex(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strSubscription != null ? strSubscription.length() : Alert.DURATION_SHOW_INDEFINITELY)) {
                    C0327l c0327lBilling = AbstractC4603l.billing(c6264l);
                    if (c0327lBilling == null) {
                        rectFArr = null;
                    } else {
                        C11103l c11103l = (C11103l) c3654l.f7703l.amazon;
                        if (!c11103l.f22307l.f29462l) {
                            c11103l = null;
                        }
                        if (c11103l != null) {
                            long jMo2591strictfp = c11103l.mo2591strictfp(0L);
                            C8896l c8896lMopub = c18666l.mopub();
                            RectF[] rectFArr2 = new RectF[i5];
                            while (i3 < i5) {
                                int i6 = i4 + i3;
                                if (i6 >= c0327lBilling.yandex.yandex.f7563l.length()) {
                                    i2 = i3;
                                } else {
                                    C8896l c8896lVip = c0327lBilling.loadAd(i6).vip(jMo2591strictfp);
                                    C8896l c8896lIsPro = c8896lVip.smaato(c8896lMopub) ? c8896lVip.isPro(c8896lMopub) : null;
                                    if (c8896lIsPro != null) {
                                        i2 = i3;
                                        long jSubscription = viewTreeObserverOnGlobalLayoutListenerC13840l.subscription((((long) Float.floatToRawIntBits(c8896lIsPro.yandex)) << 32) | (((long) Float.floatToRawIntBits(c8896lIsPro.loadAd)) & 4294967295L));
                                        long jSubscription2 = viewTreeObserverOnGlobalLayoutListenerC13840l.subscription((((long) Float.floatToRawIntBits(c8896lIsPro.amazon)) & 4294967295L) | (((long) Float.floatToRawIntBits(c8896lIsPro.crashlytics)) << 32));
                                        int i7 = (int) (jSubscription >> 32);
                                        int i8 = (int) (jSubscription2 >> 32);
                                        int i9 = (int) (jSubscription & 4294967295L);
                                        int i10 = (int) (jSubscription2 & 4294967295L);
                                        rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                i3 = i2 + 1;
                                c0327lBilling = c0327lBilling;
                                i5 = i5;
                                c8896lMopub = c8896lMopub;
                                i4 = i4;
                            }
                            rectFArr = rectFArr2;
                        } else {
                            rectFArr = null;
                        }
                    }
                    if (rectFArr == null) {
                        return;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        C4707l c4707l = AbstractC0424l.signatures;
        if (c13660l.crashlytics(c4707l) && bundle != null && AbstractC8576l.yandex(str, "androidx.compose.ui.semantics.testTag")) {
            Object objMopub = c13660l.mopub(c4707l);
            String str2 = (String) (objMopub == null ? null : objMopub);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC8576l.yandex(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c18666l.billing);
            return;
        }
        if (AbstractC8576l.yandex(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objMopub2 = c13660l.mopub(AbstractC0424l.f1548switch);
            InterfaceC6347l interfaceC6347l = (InterfaceC6347l) (objMopub2 == null ? null : objMopub2);
            if (interfaceC6347l != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                C8896l c8896lTapsense = tapsense(c18666l, rect, interfaceC6347l);
                float f = c8896lTapsense.loadAd;
                float f2 = c8896lTapsense.yandex;
                AbstractC15342l abstractC15342lYandex = interfaceC6347l.yandex(c8896lTapsense.mopub(), c3654l.f7691l, viewTreeObserverOnGlobalLayoutListenerC13840l.getDensity());
                if (abstractC15342lYandex instanceof C13080l) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m2707native(abstractC15342lYandex, f2, f));
                    return;
                } else if (abstractC15342lYandex instanceof C18521l) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m2707native(abstractC15342lYandex, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m2705extends(abstractC15342lYandex));
                    return;
                } else if (!(abstractC15342lYandex instanceof C13616l)) {
                    C18725l.billing();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m2706for(abstractC15342lYandex, f2, f));
                    return;
                }
            }
            return;
        }
        if (AbstractC8576l.yandex(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objMopub3 = c13660l.mopub(AbstractC0424l.f1548switch);
            InterfaceC6347l interfaceC6347l2 = (InterfaceC6347l) (objMopub3 == null ? null : objMopub3);
            if (interfaceC6347l2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                C8896l c8896lTapsense2 = tapsense(c18666l, rect2, interfaceC6347l2);
                Rect rectM2707native = m2707native(interfaceC6347l2.yandex(c8896lTapsense2.mopub(), c3654l.f7691l, viewTreeObserverOnGlobalLayoutListenerC13840l.getDensity()), c8896lTapsense2.yandex, c8896lTapsense2.loadAd);
                if (rectM2707native != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM2707native);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC8576l.yandex(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objMopub4 = c13660l.mopub(AbstractC0424l.f1548switch);
            InterfaceC6347l interfaceC6347l3 = (InterfaceC6347l) (objMopub4 == null ? null : objMopub4);
            if (interfaceC6347l3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrM2705extends = m2705extends(interfaceC6347l3.yandex(tapsense(c18666l, rect3, interfaceC6347l3).mopub(), c3654l.f7691l, viewTreeObserverOnGlobalLayoutListenerC13840l.getDensity()));
                if (fArrM2705extends != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM2705extends);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC8576l.yandex(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objMopub5 = c13660l.mopub(AbstractC0424l.f1548switch);
            InterfaceC6347l interfaceC6347l4 = (InterfaceC6347l) (objMopub5 == null ? null : objMopub5);
            if (interfaceC6347l4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                C8896l c8896lTapsense3 = tapsense(c18666l, rect4, interfaceC6347l4);
                Region regionM2706for = m2706for(interfaceC6347l4.yandex(c8896lTapsense3.mopub(), c3654l.f7691l, viewTreeObserverOnGlobalLayoutListenerC13840l.getDensity()), c8896lTapsense3.yandex, c8896lTapsense3.loadAd);
                if (regionM2706for != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM2706for);
                }
            }
        }
    }

    public final int isVip(int i) {
        if (i == this.f19728l.getSemanticsOwner().yandex().billing) {
            return -1;
        }
        return i;
    }

    public final void license(C3654l c3654l) {
        if (this.f19707l.add(c3654l) && Signature() && !this.f19741l) {
            this.f19741l = true;
            long jUptimeMillis = (this.f19718l + this.f19712l) - SystemClock.uptimeMillis();
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f19728l;
            if (jUptimeMillis < 0) {
                viewTreeObserverOnGlobalLayoutListenerC13840l.post(this);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC13840l.postDelayed(this, jUptimeMillis);
            }
        }
    }

    @Override // defpackage.C10156l
    public final C3585l loadAd(View view) {
        return this.f19724l;
    }

    public final AccessibilityEvent metrica(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventVip = vip(i, 8192);
        if (num != null) {
            accessibilityEventVip.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventVip.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventVip.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventVip.getText().add(charSequence);
        }
        return accessibilityEventVip;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f19734l = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f19734l = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f19709l;
        if (accessibilityManager.isEnabled()) {
            this.f19734l = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f19728l;
        Handler handler = viewTreeObserverOnGlobalLayoutListenerC13840l.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC13840l.getHandler();
        if (handler2 != null) {
            handler2.removeCallbacks(this.f19706l);
        }
        this.f19741l = false;
        this.f19725l = false;
        AccessibilityManager accessibilityManager = this.f19709l;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0245  */
    /* JADX WARN: Code duplicated, block: B:103:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0259  */
    /* JADX WARN: Code duplicated, block: B:106:0x026a  */
    /* JADX WARN: Code duplicated, block: B:111:0x028c  */
    /* JADX WARN: Code duplicated, block: B:113:0x029d  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02de  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0305 A[LOOP:4: B:137:0x02f4->B:142:0x0305, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x0313  */
    /* JADX WARN: Code duplicated, block: B:150:0x0327 A[LOOP:5: B:145:0x030f->B:150:0x0327, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x034d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0357  */
    /* JADX WARN: Code duplicated, block: B:167:0x037f  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:174:0x03be  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:177:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:187:0x042e  */
    /* JADX WARN: Code duplicated, block: B:239:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:241:0x0500  */
    /* JADX WARN: Code duplicated, block: B:246:0x0513  */
    /* JADX WARN: Code duplicated, block: B:249:0x0524 A[LOOP:6: B:245:0x0511->B:249:0x0524, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x052e  */
    /* JADX WARN: Code duplicated, block: B:256:0x053b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0548  */
    /* JADX WARN: Code duplicated, block: B:260:0x054a  */
    /* JADX WARN: Code duplicated, block: B:286:0x061c  */
    /* JADX WARN: Code duplicated, block: B:308:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x030e A[EDGE_INSN: B:309:0x030e->B:144:0x030e BREAK  A[LOOP:4: B:137:0x02f4->B:142:0x0305], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x032c A[EDGE_INSN: B:311:0x032c->B:152:0x032c BREAK  A[LOOP:5: B:145:0x030f->B:150:0x0327], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x051d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0196  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x0212  */
    /* JADX WARN: Code duplicated, block: B:92:0x0220  */
    /* JADX WARN: Code duplicated, block: B:95:0x0233  */
    /* JADX WARN: Code duplicated, block: B:98:0x023b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0242  */
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m2710package(AbstractC14183l abstractC14183l) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        C6264l c6264l;
        C18666l c18666l;
        int i8;
        int i9;
        int i10;
        int i11;
        C13660l c13660l;
        C3654l c3654l;
        int i12;
        C6264l c6264l2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i13;
        C3654l c3654l2;
        int i14;
        Integer num6;
        int i15;
        C8764l c8764l;
        boolean z;
        C4707l c4707l;
        int i16;
        C4707l c4707l2;
        C4707l c4707l3;
        String str;
        C4707l c4707l4;
        int size;
        int i17;
        C8764l c8764l2;
        Object objMopub;
        Object objMopub2;
        boolean z2;
        InterfaceC14328l interfaceC14328l;
        int i18;
        Object objMopub3;
        C3625l c3625l;
        String str2;
        Object objMopub4;
        C3625l c3625l2;
        Object objMopub5;
        CharSequence charSequence;
        CharSequence charSequenceM2708throw;
        int length;
        int length2;
        int i19;
        Integer num7;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean zCrashlytics;
        boolean z3;
        boolean z4;
        AccessibilityEvent accessibilityEventMetrica;
        Object objMopub6;
        C6402l c6402l;
        boolean z5;
        Object objMopub7;
        AccessibilityEvent accessibilityEventVip;
        Object objMopub8;
        String strYandex;
        Object objMopub9;
        List list;
        String strYandex2;
        String str3;
        boolean zCrashlytics2;
        int i24;
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = this;
        AbstractC14183l abstractC14183l2 = abstractC14183l;
        Integer num8 = 64;
        ArrayList arrayList4 = viewOnAttachStateChangeListenerC9659l.f19713l;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = abstractC14183l2.loadAd;
        long[] jArr3 = abstractC14183l2.yandex;
        int i25 = 2;
        int length3 = jArr3.length - 2;
        int i26 = 0;
        Integer num9 = 0;
        if (length3 < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j2 = jArr3[i27];
            int i28 = i25;
            int i29 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i27 - i29)) >>> 31);
                long j3 = j2;
                int i32 = i26;
                while (i32 < i31) {
                    if ((j3 & 255) < 128) {
                        int i33 = iArr3[(i27 << 3) + i32];
                        C11873l c11873l = (C11873l) viewOnAttachStateChangeListenerC9659l.f19737l.loadAd(i33);
                        if (c11873l == null) {
                            i3 = i32;
                            num3 = num8;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i31;
                            i5 = i26;
                            i6 = i27;
                            num4 = num9;
                            i7 = i30;
                        } else {
                            C6264l c6264l3 = c11873l.yandex;
                            C13660l c13660l2 = c6264l3.f13225l;
                            C13874l c13874l = (C13874l) abstractC14183l2.loadAd(i33);
                            int i34 = i30;
                            C18666l c18666l2 = c13874l != null ? c13874l.yandex : null;
                            if (c18666l2 == null) {
                                throw AbstractC5020l.metrica("no value for specified key");
                            }
                            C3654l c3654l3 = c18666l2.crashlytics;
                            C6264l c6264l4 = c18666l2.amazon;
                            iArr2 = iArr3;
                            int i35 = c18666l2.billing;
                            jArr2 = jArr3;
                            C13660l c13660l3 = c6264l4.f13225l;
                            i6 = i27;
                            Object[] objArr = c13660l3.loadAd;
                            Object[] objArr2 = c13660l3.crashlytics;
                            long[] jArr4 = c13660l3.yandex;
                            i3 = i32;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                C3654l c3654l4 = c3654l3;
                                i4 = i31;
                                int i36 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i36];
                                    c18666l = c18666l2;
                                    int i37 = i36;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j4 & 255) < 128) {
                                                int i40 = (i37 << 3) + i39;
                                                Object obj = objArr[i40];
                                                int i41 = length4;
                                                Object obj2 = objArr2[i40];
                                                c6264l2 = c6264l3;
                                                C4707l c4707l5 = (C4707l) obj;
                                                j = j4;
                                                C4707l c4707l6 = AbstractC0424l.license;
                                                if (AbstractC8576l.yandex(c4707l5, c4707l6) || AbstractC8576l.yandex(c4707l5, AbstractC0424l.pro)) {
                                                    int size2 = arrayList5.size();
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (i42 >= size2) {
                                                            c8764l = null;
                                                            break;
                                                        }
                                                        int i43 = size2;
                                                        if (((C8764l) arrayList5.get(i42)).f18047l == i33) {
                                                            c8764l = (C8764l) arrayList5.get(i42);
                                                            break;
                                                        } else {
                                                            i42++;
                                                            size2 = i43;
                                                        }
                                                    }
                                                    if (c8764l != null) {
                                                        z = false;
                                                    } else {
                                                        c8764l = new C8764l(i33, arrayList4);
                                                        z = true;
                                                    }
                                                    arrayList4.add(c8764l);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    c4707l = AbstractC0424l.amazon;
                                                    if (AbstractC8576l.yandex(c4707l5, c4707l)) {
                                                        str3 = (String) obj2;
                                                        zCrashlytics2 = c13660l2.crashlytics(c4707l);
                                                        i24 = i34;
                                                        if (zCrashlytics2) {
                                                            viewOnAttachStateChangeListenerC9659l.inmobi(i33, i24, str3);
                                                        }
                                                        Unit unit = Unit.INSTANCE;
                                                    } else {
                                                        i16 = i34;
                                                        if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.loadAd)) {
                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num8, i16);
                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, i16);
                                                        } else if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.f1546private)) {
                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, 8192, 8);
                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, 8);
                                                        } else if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.f1550throw)) {
                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, 3072, 8);
                                                        } else if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.crashlytics)) {
                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num8, 8);
                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, 8);
                                                        } else {
                                                            c4707l2 = AbstractC0424l.f1544native;
                                                            arrayList3 = arrayList5;
                                                            if (AbstractC8576l.yandex(c4707l5, c4707l2)) {
                                                                objMopub6 = c13660l3.mopub(AbstractC0424l.isVip);
                                                                if (objMopub6 == null) {
                                                                    objMopub6 = null;
                                                                }
                                                                c6402l = (C6402l) objMopub6;
                                                                if (c6402l == null && c6402l.yandex == 4) {
                                                                    z5 = true;
                                                                } else {
                                                                    z5 = false;
                                                                }
                                                                if (z5) {
                                                                    objMopub7 = c13660l3.mopub(c4707l2);
                                                                    if (objMopub7 == null) {
                                                                        objMopub7 = null;
                                                                    }
                                                                    if (AbstractC8576l.yandex(objMopub7, Boolean.TRUE)) {
                                                                        accessibilityEventVip = viewOnAttachStateChangeListenerC9659l.vip(viewOnAttachStateChangeListenerC9659l.isVip(i33), 4);
                                                                        C18666l c18666l3 = c18666l;
                                                                        c3654l2 = c3654l4;
                                                                        C18666l c18666l4 = new C18666l(c18666l3.yandex, true, c3654l2, c6264l4);
                                                                        objMopub8 = c18666l4.firebase().f13225l.mopub(AbstractC0424l.yandex);
                                                                        if (objMopub8 == null) {
                                                                            objMopub8 = null;
                                                                        }
                                                                        List list2 = (List) objMopub8;
                                                                        c18666l = c18666l3;
                                                                        strYandex = list2 != null ? AbstractC2066l.yandex(list2, ",", null, 62) : null;
                                                                        objMopub9 = c18666l4.firebase().f13225l.mopub(AbstractC0424l.applovin);
                                                                        if (objMopub9 == null) {
                                                                            objMopub9 = null;
                                                                        }
                                                                        list = (List) objMopub9;
                                                                        i13 = i38;
                                                                        if (list != null) {
                                                                            strYandex2 = AbstractC2066l.yandex(list, ",", null, 62);
                                                                        } else {
                                                                            strYandex2 = null;
                                                                        }
                                                                        if (strYandex != null) {
                                                                            accessibilityEventVip.setContentDescription(strYandex);
                                                                            Unit unit2 = Unit.INSTANCE;
                                                                        }
                                                                        if (strYandex2 != null) {
                                                                            accessibilityEventVip.getText().add(strYandex2);
                                                                        }
                                                                        viewOnAttachStateChangeListenerC9659l.premium(accessibilityEventVip);
                                                                    } else {
                                                                        i13 = i38;
                                                                        c3654l2 = c3654l4;
                                                                        appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, 8);
                                                                    }
                                                                } else {
                                                                    i13 = i38;
                                                                    c3654l2 = c3654l4;
                                                                    appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num8, 8);
                                                                    appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, 8);
                                                                }
                                                            } else {
                                                                i13 = i38;
                                                                c3654l2 = c3654l4;
                                                                if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.yandex)) {
                                                                    viewOnAttachStateChangeListenerC9659l.applovin(viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, 4, (List) obj2);
                                                                } else {
                                                                    c4707l3 = AbstractC0424l.f1545package;
                                                                    str = "";
                                                                    if (AbstractC8576l.yandex(c4707l5, c4707l3)) {
                                                                        if (c13660l3.crashlytics(AbstractC16601l.firebase)) {
                                                                            objMopub4 = c13660l2.mopub(c4707l3);
                                                                            if (objMopub4 == null) {
                                                                                objMopub4 = null;
                                                                            }
                                                                            c3625l2 = (C3625l) objMopub4;
                                                                            if (c3625l2 == null) {
                                                                                c3625l2 = "";
                                                                            }
                                                                            objMopub5 = c13660l3.mopub(c4707l3);
                                                                            if (objMopub5 == null) {
                                                                                objMopub5 = null;
                                                                            }
                                                                            charSequence = (C3625l) objMopub5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceM2708throw = m2708throw(charSequence);
                                                                            length = c3625l2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i19 = length2;
                                                                            } else {
                                                                                i19 = length;
                                                                            }
                                                                            num7 = num9;
                                                                            i20 = 0;
                                                                            while (true) {
                                                                                num5 = num8;
                                                                                if (i20 < i19) {
                                                                                    i21 = length;
                                                                                    break;
                                                                                }
                                                                                i21 = length;
                                                                                if (c3625l2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                length = i21;
                                                                                num8 = num5;
                                                                            }
                                                                            i22 = 0;
                                                                            while (true) {
                                                                                if (i22 < i19 - i20) {
                                                                                    i23 = i22;
                                                                                    break;
                                                                                }
                                                                                i23 = i22;
                                                                                if (c3625l2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                    break;
                                                                                } else {
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                            }
                                                                            int i44 = (i21 - i23) - i20;
                                                                            int i45 = (length2 - i23) - i20;
                                                                            C4707l c4707l7 = AbstractC0424l.f1543for;
                                                                            boolean zCrashlytics3 = c13660l2.crashlytics(c4707l7);
                                                                            boolean zCrashlytics4 = c13660l3.crashlytics(c4707l7);
                                                                            zCrashlytics = c13660l2.crashlytics(AbstractC0424l.f1545package);
                                                                            if (zCrashlytics || zCrashlytics3 || !zCrashlytics4) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                            }
                                                                            if (zCrashlytics || !zCrashlytics3 || zCrashlytics4) {
                                                                                z4 = false;
                                                                            } else {
                                                                                z4 = true;
                                                                            }
                                                                            if (!z3 || z4) {
                                                                                i15 = i33;
                                                                                num9 = num7;
                                                                                accessibilityEventMetrica = viewOnAttachStateChangeListenerC9659l.metrica(viewOnAttachStateChangeListenerC9659l.isVip(i33), num9, num7, Integer.valueOf(length2), charSequenceM2708throw);
                                                                            } else {
                                                                                accessibilityEventMetrica = viewOnAttachStateChangeListenerC9659l.vip(viewOnAttachStateChangeListenerC9659l.isVip(i33), 16);
                                                                                accessibilityEventMetrica.setFromIndex(i20);
                                                                                accessibilityEventMetrica.setRemovedCount(i44);
                                                                                accessibilityEventMetrica.setAddedCount(i45);
                                                                                accessibilityEventMetrica.setBeforeText(c3625l2);
                                                                                accessibilityEventMetrica.getText().add(charSequenceM2708throw);
                                                                                i15 = i33;
                                                                                num9 = num7;
                                                                            }
                                                                            accessibilityEventMetrica.setClassName("android.widget.EditText");
                                                                            viewOnAttachStateChangeListenerC9659l.premium(accessibilityEventMetrica);
                                                                            if (z3 || z4) {
                                                                                long j5 = ((C12814l) c6264l4.mopub(AbstractC0424l.f1549synchronized)).yandex;
                                                                                accessibilityEventMetrica.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventMetrica.setToIndex((int) (j5 & 4294967295L));
                                                                                viewOnAttachStateChangeListenerC9659l.premium(accessibilityEventMetrica);
                                                                            }
                                                                            Unit unit3 = Unit.INSTANCE;
                                                                        } else {
                                                                            i15 = i33;
                                                                            c13660l2 = c13660l2;
                                                                            num5 = num8;
                                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i15), 2048, Integer.valueOf(i28), 8);
                                                                        }
                                                                        num6 = num9;
                                                                        i14 = i41;
                                                                    } else {
                                                                        i15 = i33;
                                                                        c13660l2 = c13660l2;
                                                                        num5 = num8;
                                                                        i14 = i41;
                                                                        c4707l4 = AbstractC0424l.f1549synchronized;
                                                                        if (AbstractC8576l.yandex(c4707l5, c4707l4)) {
                                                                            objMopub3 = c13660l3.mopub(c4707l3);
                                                                            if (objMopub3 == null) {
                                                                                objMopub3 = null;
                                                                            }
                                                                            c3625l = (C3625l) objMopub3;
                                                                            if (c3625l != null && (str2 = c3625l.f7563l) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((C12814l) c6264l4.mopub(c4707l4)).yandex;
                                                                            num6 = num9;
                                                                            viewOnAttachStateChangeListenerC9659l = this;
                                                                            viewOnAttachStateChangeListenerC9659l.premium(viewOnAttachStateChangeListenerC9659l.metrica(viewOnAttachStateChangeListenerC9659l.isVip(i15), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), m2708throw(str)));
                                                                            viewOnAttachStateChangeListenerC9659l.m2714throws(i35);
                                                                            Unit unit4 = Unit.INSTANCE;
                                                                        } else {
                                                                            num6 = num9;
                                                                            if (!AbstractC8576l.yandex(c4707l5, c4707l6) || AbstractC8576l.yandex(c4707l5, AbstractC0424l.pro)) {
                                                                                viewOnAttachStateChangeListenerC9659l.license(c3654l2);
                                                                                size = arrayList4.size();
                                                                                i17 = 0;
                                                                                while (true) {
                                                                                    if (i17 < size) {
                                                                                        c8764l2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((C8764l) arrayList4.get(i17)).f18047l == i15) {
                                                                                            c8764l2 = (C8764l) arrayList4.get(i17);
                                                                                            break;
                                                                                        }
                                                                                        i17++;
                                                                                    }
                                                                                }
                                                                                objMopub = c13660l3.mopub(c4707l6);
                                                                                if (objMopub == null) {
                                                                                    objMopub = null;
                                                                                }
                                                                                c8764l2.f18048l = (C11601l) objMopub;
                                                                                objMopub2 = c13660l3.mopub(AbstractC0424l.pro);
                                                                                if (objMopub2 == null) {
                                                                                    objMopub2 = null;
                                                                                }
                                                                                c8764l2.f18050l = (C11601l) objMopub2;
                                                                                if (!c8764l2.f18046l.contains(c8764l2)) {
                                                                                    viewOnAttachStateChangeListenerC9659l.f19728l.getSnapshotObserver().yandex.crashlytics(c8764l2, viewOnAttachStateChangeListenerC9659l.f19716l, new C4307l(c8764l2, viewOnAttachStateChangeListenerC9659l, 1));
                                                                                }
                                                                                Unit unit5 = Unit.INSTANCE;
                                                                            } else if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.smaato)) {
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i18 = 8;
                                                                                    viewOnAttachStateChangeListenerC9659l.premium(viewOnAttachStateChangeListenerC9659l.vip(viewOnAttachStateChangeListenerC9659l.isVip(i35), 8));
                                                                                } else {
                                                                                    i18 = 8;
                                                                                }
                                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i35), 2048, num6, i18);
                                                                            } else {
                                                                                C4707l c4707l8 = AbstractC16601l.ad;
                                                                                if (AbstractC8576l.yandex(c4707l5, c4707l8)) {
                                                                                    List list3 = (List) c6264l4.mopub(c4707l8);
                                                                                    Object objMopub10 = c13660l2.mopub(c4707l8);
                                                                                    if (objMopub10 == null) {
                                                                                        objMopub10 = null;
                                                                                    }
                                                                                    List list4 = (List) objMopub10;
                                                                                    if (list4 != null) {
                                                                                        C6295l c6295l = AbstractC13087l.yandex;
                                                                                        C6295l c6295l2 = new C6295l();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            C18725l.loadAd();
                                                                                            return;
                                                                                        }
                                                                                        C6295l c6295l3 = new C6295l();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            C18725l.loadAd();
                                                                                            return;
                                                                                        }
                                                                                        i10 = !c6295l2.equals(c6295l3) ? 1 : 0;
                                                                                    } else if (!list3.isEmpty()) {
                                                                                        i10 = 1;
                                                                                    }
                                                                                    Unit unit6 = Unit.INSTANCE;
                                                                                } else {
                                                                                    if (obj2 instanceof C7629l) {
                                                                                        C7629l c7629l = (C7629l) obj2;
                                                                                        Object objMopub11 = c13660l2.mopub(c4707l5);
                                                                                        if (objMopub11 == null) {
                                                                                            objMopub11 = null;
                                                                                        }
                                                                                        if (c7629l != objMopub11) {
                                                                                            if (objMopub11 instanceof C7629l) {
                                                                                                String str4 = c7629l.yandex;
                                                                                                C7629l c7629l2 = (C7629l) objMopub11;
                                                                                                InterfaceC14328l interfaceC14328l2 = c7629l2.loadAd;
                                                                                                if (AbstractC8576l.yandex(str4, c7629l2.yandex) && (((interfaceC14328l = c7629l.loadAd) != null || interfaceC14328l2 == null) && (interfaceC14328l == null || interfaceC14328l2 != null))) {
                                                                                                    z2 = true;
                                                                                                }
                                                                                            }
                                                                                            z2 = false;
                                                                                        } else {
                                                                                            z2 = true;
                                                                                        }
                                                                                        if (z2) {
                                                                                            i10 = 0;
                                                                                        } else {
                                                                                            i10 = 1;
                                                                                        }
                                                                                    } else {
                                                                                        i10 = 1;
                                                                                    }
                                                                                    Unit unit7 = Unit.INSTANCE;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num6 = num9;
                                                            i15 = i33;
                                                            c13660l2 = c13660l2;
                                                            num5 = num8;
                                                            i14 = i41;
                                                        }
                                                    }
                                                    i15 = i33;
                                                    num5 = num8;
                                                    arrayList3 = arrayList5;
                                                    i13 = i38;
                                                    c3654l2 = c3654l4;
                                                    i14 = i41;
                                                    num6 = num9;
                                                    c13660l2 = c13660l2;
                                                } else {
                                                    Object objMopub12 = c13660l2.mopub(c4707l5);
                                                    if (objMopub12 == null) {
                                                        objMopub12 = null;
                                                    }
                                                    if (AbstractC8576l.yandex(obj2, objMopub12)) {
                                                        i15 = i33;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i13 = i38;
                                                        c3654l2 = c3654l4;
                                                        i14 = i41;
                                                        num6 = num9;
                                                        c13660l2 = c13660l2;
                                                    } else {
                                                        c4707l = AbstractC0424l.amazon;
                                                        if (AbstractC8576l.yandex(c4707l5, c4707l)) {
                                                            str3 = (String) obj2;
                                                            zCrashlytics2 = c13660l2.crashlytics(c4707l);
                                                            i24 = i34;
                                                            if (zCrashlytics2) {
                                                                viewOnAttachStateChangeListenerC9659l.inmobi(i33, i24, str3);
                                                            }
                                                            Unit unit8 = Unit.INSTANCE;
                                                        } else {
                                                            i16 = i34;
                                                            if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.loadAd)) {
                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num8, i16);
                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, i16);
                                                            } else if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.f1546private)) {
                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, 8192, 8);
                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, 8);
                                                            } else if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.f1550throw)) {
                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, 3072, 8);
                                                            } else if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.crashlytics)) {
                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num8, 8);
                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, 8);
                                                            } else {
                                                                c4707l2 = AbstractC0424l.f1544native;
                                                                arrayList3 = arrayList5;
                                                                if (AbstractC8576l.yandex(c4707l5, c4707l2)) {
                                                                    objMopub6 = c13660l3.mopub(AbstractC0424l.isVip);
                                                                    if (objMopub6 == null) {
                                                                        objMopub6 = null;
                                                                    }
                                                                    c6402l = (C6402l) objMopub6;
                                                                    if (c6402l == null) {
                                                                        z5 = false;
                                                                    } else {
                                                                        z5 = true;
                                                                    }
                                                                    if (z5) {
                                                                        objMopub7 = c13660l3.mopub(c4707l2);
                                                                        if (objMopub7 == null) {
                                                                            objMopub7 = null;
                                                                        }
                                                                        if (AbstractC8576l.yandex(objMopub7, Boolean.TRUE)) {
                                                                            accessibilityEventVip = viewOnAttachStateChangeListenerC9659l.vip(viewOnAttachStateChangeListenerC9659l.isVip(i33), 4);
                                                                            C18666l c18666l5 = c18666l;
                                                                            c3654l2 = c3654l4;
                                                                            C18666l c18666l6 = new C18666l(c18666l5.yandex, true, c3654l2, c6264l4);
                                                                            objMopub8 = c18666l6.firebase().f13225l.mopub(AbstractC0424l.yandex);
                                                                            if (objMopub8 == null) {
                                                                                objMopub8 = null;
                                                                            }
                                                                            List list5 = (List) objMopub8;
                                                                            c18666l = c18666l5;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objMopub9 = c18666l6.firebase().f13225l.mopub(AbstractC0424l.applovin);
                                                                            if (objMopub9 == null) {
                                                                                objMopub9 = null;
                                                                            }
                                                                            list = (List) objMopub9;
                                                                            i13 = i38;
                                                                            if (list != null) {
                                                                                strYandex2 = AbstractC2066l.yandex(list, ",", null, 62);
                                                                            } else {
                                                                                strYandex2 = null;
                                                                            }
                                                                            if (strYandex != null) {
                                                                                accessibilityEventVip.setContentDescription(strYandex);
                                                                                Unit unit9 = Unit.INSTANCE;
                                                                            }
                                                                            if (strYandex2 != null) {
                                                                                accessibilityEventVip.getText().add(strYandex2);
                                                                            }
                                                                            viewOnAttachStateChangeListenerC9659l.premium(accessibilityEventVip);
                                                                        } else {
                                                                            i13 = i38;
                                                                            c3654l2 = c3654l4;
                                                                            appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, 8);
                                                                        }
                                                                    } else {
                                                                        i13 = i38;
                                                                        c3654l2 = c3654l4;
                                                                        appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num8, 8);
                                                                        appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, num9, 8);
                                                                    }
                                                                } else {
                                                                    i13 = i38;
                                                                    c3654l2 = c3654l4;
                                                                    if (AbstractC8576l.yandex(c4707l5, AbstractC0424l.yandex)) {
                                                                        viewOnAttachStateChangeListenerC9659l.applovin(viewOnAttachStateChangeListenerC9659l.isVip(i33), 2048, 4, (List) obj2);
                                                                    } else {
                                                                        c4707l3 = AbstractC0424l.f1545package;
                                                                        str = "";
                                                                        if (AbstractC8576l.yandex(c4707l5, c4707l3)) {
                                                                            if (c13660l3.crashlytics(AbstractC16601l.firebase)) {
                                                                                objMopub4 = c13660l2.mopub(c4707l3);
                                                                                if (objMopub4 == null) {
                                                                                    objMopub4 = null;
                                                                                }
                                                                                c3625l2 = (C3625l) objMopub4;
                                                                                if (c3625l2 == null) {
                                                                                    c3625l2 = "";
                                                                                }
                                                                                objMopub5 = c13660l3.mopub(c4707l3);
                                                                                if (objMopub5 == null) {
                                                                                    objMopub5 = null;
                                                                                }
                                                                                charSequence = (C3625l) objMopub5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceM2708throw = m2708throw(charSequence);
                                                                                length = c3625l2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i19 = length2;
                                                                                } else {
                                                                                    i19 = length;
                                                                                }
                                                                                num7 = num9;
                                                                                i20 = 0;
                                                                                while (true) {
                                                                                    num5 = num8;
                                                                                    if (i20 < i19) {
                                                                                        i21 = length;
                                                                                        break;
                                                                                    }
                                                                                    i21 = length;
                                                                                    if (c3625l2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i20++;
                                                                                        length = i21;
                                                                                        num8 = num5;
                                                                                    }
                                                                                }
                                                                                i22 = 0;
                                                                                while (true) {
                                                                                    if (i22 < i19 - i20) {
                                                                                        i23 = i22;
                                                                                        break;
                                                                                    }
                                                                                    i23 = i22;
                                                                                    if (c3625l2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                                int i46 = (i21 - i23) - i20;
                                                                                int i47 = (length2 - i23) - i20;
                                                                                C4707l c4707l9 = AbstractC0424l.f1543for;
                                                                                boolean zCrashlytics5 = c13660l2.crashlytics(c4707l9);
                                                                                boolean zCrashlytics6 = c13660l3.crashlytics(c4707l9);
                                                                                zCrashlytics = c13660l2.crashlytics(AbstractC0424l.f1545package);
                                                                                if (zCrashlytics) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (zCrashlytics) {
                                                                                    z4 = false;
                                                                                } else {
                                                                                    z4 = false;
                                                                                }
                                                                                if (z3) {
                                                                                    i15 = i33;
                                                                                    num9 = num7;
                                                                                    accessibilityEventMetrica = viewOnAttachStateChangeListenerC9659l.metrica(viewOnAttachStateChangeListenerC9659l.isVip(i33), num9, num7, Integer.valueOf(length2), charSequenceM2708throw);
                                                                                } else {
                                                                                    i15 = i33;
                                                                                    num9 = num7;
                                                                                    accessibilityEventMetrica = viewOnAttachStateChangeListenerC9659l.metrica(viewOnAttachStateChangeListenerC9659l.isVip(i33), num9, num7, Integer.valueOf(length2), charSequenceM2708throw);
                                                                                }
                                                                                accessibilityEventMetrica.setClassName("android.widget.EditText");
                                                                                viewOnAttachStateChangeListenerC9659l.premium(accessibilityEventMetrica);
                                                                                if (z3) {
                                                                                    long j7 = ((C12814l) c6264l4.mopub(AbstractC0424l.f1549synchronized)).yandex;
                                                                                    accessibilityEventMetrica.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventMetrica.setToIndex((int) (j7 & 4294967295L));
                                                                                    viewOnAttachStateChangeListenerC9659l.premium(accessibilityEventMetrica);
                                                                                } else {
                                                                                    long j8 = ((C12814l) c6264l4.mopub(AbstractC0424l.f1549synchronized)).yandex;
                                                                                    accessibilityEventMetrica.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventMetrica.setToIndex((int) (j8 & 4294967295L));
                                                                                    viewOnAttachStateChangeListenerC9659l.premium(accessibilityEventMetrica);
                                                                                }
                                                                                Unit unit10 = Unit.INSTANCE;
                                                                            } else {
                                                                                i15 = i33;
                                                                                c13660l2 = c13660l2;
                                                                                num5 = num8;
                                                                                appmetrica(viewOnAttachStateChangeListenerC9659l, viewOnAttachStateChangeListenerC9659l.isVip(i15), 2048, Integer.valueOf(i28), 8);
                                                                            }
                                                                            num6 = num9;
                                                                            i14 = i41;
                                                                        } else {
                                                                            i15 = i33;
                                                                            c13660l2 = c13660l2;
                                                                            num5 = num8;
                                                                            i14 = i41;
                                                                            c4707l4 = AbstractC0424l.f1549synchronized;
                                                                            if (AbstractC8576l.yandex(c4707l5, c4707l4)) {
                                                                                objMopub3 = c13660l3.mopub(c4707l3);
                                                                                if (objMopub3 == null) {
                                                                                    objMopub3 = null;
                                                                                }
                                                                                c3625l = (C3625l) objMopub3;
                                                                                if (c3625l != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((C12814l) c6264l4.mopub(c4707l4)).yandex;
                                                                                num6 = num9;
                                                                                viewOnAttachStateChangeListenerC9659l = this;
                                                                                viewOnAttachStateChangeListenerC9659l.premium(viewOnAttachStateChangeListenerC9659l.metrica(viewOnAttachStateChangeListenerC9659l.isVip(i15), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), m2708throw(str)));
                                                                                viewOnAttachStateChangeListenerC9659l.m2714throws(i35);
                                                                                Unit unit11 = Unit.INSTANCE;
                                                                            } else {
                                                                                num6 = num9;
                                                                                if (AbstractC8576l.yandex(c4707l5, c4707l6)) {
                                                                                }
                                                                                viewOnAttachStateChangeListenerC9659l.license(c3654l2);
                                                                                size = arrayList4.size();
                                                                                i17 = 0;
                                                                                while (true) {
                                                                                    if (i17 < size) {
                                                                                        c8764l2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((C8764l) arrayList4.get(i17)).f18047l == i15) {
                                                                                            c8764l2 = (C8764l) arrayList4.get(i17);
                                                                                            break;
                                                                                        }
                                                                                        i17++;
                                                                                    }
                                                                                }
                                                                                objMopub = c13660l3.mopub(c4707l6);
                                                                                if (objMopub == null) {
                                                                                    objMopub = null;
                                                                                }
                                                                                c8764l2.f18048l = (C11601l) objMopub;
                                                                                objMopub2 = c13660l3.mopub(AbstractC0424l.pro);
                                                                                if (objMopub2 == null) {
                                                                                    objMopub2 = null;
                                                                                }
                                                                                c8764l2.f18050l = (C11601l) objMopub2;
                                                                                if (!c8764l2.f18046l.contains(c8764l2)) {
                                                                                    viewOnAttachStateChangeListenerC9659l.f19728l.getSnapshotObserver().yandex.crashlytics(c8764l2, viewOnAttachStateChangeListenerC9659l.f19716l, new C4307l(c8764l2, viewOnAttachStateChangeListenerC9659l, 1));
                                                                                }
                                                                                Unit unit12 = Unit.INSTANCE;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                num6 = num9;
                                                                i15 = i33;
                                                                c13660l2 = c13660l2;
                                                                num5 = num8;
                                                                i14 = i41;
                                                            }
                                                        }
                                                        i15 = i33;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i13 = i38;
                                                        c3654l2 = c3654l4;
                                                        i14 = i41;
                                                        num6 = num9;
                                                        c13660l2 = c13660l2;
                                                    }
                                                }
                                            } else {
                                                c6264l2 = c6264l3;
                                                num5 = num8;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i13 = i38;
                                                i39 = i39;
                                                c3654l2 = c3654l4;
                                                i14 = length4;
                                                num6 = num9;
                                                i15 = i33;
                                                c13660l2 = c13660l2;
                                            }
                                            i34 = 8;
                                            i33 = i15;
                                            c3654l4 = c3654l2;
                                            c6264l3 = c6264l2;
                                            j4 = j >> 8;
                                            i39++;
                                            length4 = i14;
                                            num9 = num6;
                                            c13660l2 = c13660l2;
                                            i38 = i13;
                                            arrayList5 = arrayList3;
                                            num8 = num5;
                                        }
                                        i9 = i33;
                                        c6264l = c6264l3;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        c3654l = c3654l4;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num9;
                                        int i48 = i38;
                                        c13660l = c13660l2;
                                        if (i48 != i34) {
                                            break;
                                        }
                                    } else {
                                        i9 = i33;
                                        c6264l = c6264l3;
                                        c13660l = c13660l2;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        c3654l = c3654l4;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num9;
                                    }
                                    if (i37 == i12) {
                                        break;
                                    }
                                    num9 = num4;
                                    i33 = i9;
                                    c13660l2 = c13660l;
                                    c3654l4 = c3654l;
                                    c18666l2 = c18666l;
                                    c6264l3 = c6264l;
                                    arrayList5 = arrayList2;
                                    i34 = 8;
                                    i36 = i37 + 1;
                                    length4 = i12;
                                    num8 = num3;
                                }
                            } else {
                                c6264l = c6264l3;
                                num3 = num8;
                                arrayList2 = arrayList5;
                                i4 = i31;
                                c18666l = c18666l2;
                                i8 = 1;
                                num4 = num9;
                                i9 = i33;
                                i5 = 0;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = c6264l.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i5;
                                        break;
                                    }
                                    if (!c18666l.firebase().f13225l.crashlytics((C4707l) ((Map.Entry) it.next()).getKey())) {
                                        i11 = i8;
                                        break;
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                int iIsVip = viewOnAttachStateChangeListenerC9659l.isVip(i9);
                                i7 = 8;
                                appmetrica(viewOnAttachStateChangeListenerC9659l, iIsVip, 2048, num4, 8);
                            } else {
                                i7 = 8;
                            }
                        }
                    } else {
                        i3 = i32;
                        num3 = num8;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i31;
                        i5 = i26;
                        i6 = i27;
                        num4 = num9;
                        i7 = i30;
                    }
                    j3 >>= i7;
                    i32 = i3 + 1;
                    abstractC14183l2 = abstractC14183l;
                    i26 = i5;
                    num9 = num4;
                    i30 = i7;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i27 = i6;
                    i31 = i4;
                    arrayList5 = arrayList2;
                    num8 = num3;
                }
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                int i49 = i27;
                num2 = num9;
                if (i31 != i30) {
                    return;
                } else {
                    i2 = i49;
                }
            } else {
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                num2 = num9;
                i2 = i27;
            }
            if (i2 == i29) {
                return;
            }
            i27 = i2 + 1;
            abstractC14183l2 = abstractC14183l;
            length3 = i29;
            i26 = i;
            num9 = num2;
            i25 = i28;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num8 = num;
        }
    }

    public final boolean premium(AccessibilityEvent accessibilityEvent) {
        if (!Signature()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f19726l = true;
        }
        try {
            return ((Boolean) this.f19735l.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f19726l = false;
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final Rect m2711private(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f19728l;
        long jSubscription = viewTreeObserverOnGlobalLayoutListenerC13840l.subscription(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jSubscription2 = viewTreeObserverOnGlobalLayoutListenerC13840l.subscription((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jSubscription >> 32);
        int i2 = (int) (jSubscription2 >> 32);
        int i3 = (int) (jSubscription & 4294967295L);
        int i4 = (int) (jSubscription2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    public final void remoteconfig() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (Signature()) {
                signatures(this.f19728l.getSemanticsOwner().yandex(), this.f19717l);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m2710package(ads());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m2709catch();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4622l c4622l;
        C10834l c10834l = this.f19707l;
        int i = 0;
        this.f19741l = false;
        this.f19718l = SystemClock.uptimeMillis();
        try {
            if (Signature()) {
                int i2 = c10834l.f21897l;
                while (true) {
                    c4622l = this.f19714l;
                    if (i >= i2) {
                        break;
                    }
                    C3654l c3654l = (C3654l) c10834l.f21898l[i];
                    m2713synchronized(c3654l, c4622l);
                    m2712strictfp(c3654l);
                    i++;
                }
                c4622l.loadAd();
                if (!this.f19725l) {
                    this.f19725l = true;
                    this.f19706l.run();
                }
            }
            c10834l.clear();
            this.f19715l.crashlytics();
            this.f19720l.crashlytics();
        } finally {
            c10834l.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void signatures(C18666l c18666l, C11873l c11873l) {
        int[] iArr = AbstractC12047l.yandex;
        C4622l c4622l = new C4622l();
        List listIsPro = C18666l.isPro(4, c18666l);
        C3654l c3654l = c18666l.crashlytics;
        int size = listIsPro.size();
        for (int i = 0; i < size; i++) {
            C18666l c18666l2 = (C18666l) listIsPro.get(i);
            AbstractC14183l abstractC14183lAds = ads();
            int i2 = c18666l2.billing;
            if (abstractC14183lAds.yandex(i2)) {
                if (!c11873l.loadAd.crashlytics(i2)) {
                    license(c3654l);
                    return;
                }
                c4622l.yandex(i2);
            }
        }
        C4622l c4622l2 = c11873l.loadAd;
        int[] iArr2 = c4622l2.loadAd;
        long[] jArr = c4622l2.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !c4622l.crashlytics(iArr2[(i3 << 3) + i5])) {
                            license(c3654l);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listIsPro2 = C18666l.isPro(4, c18666l);
        int size2 = listIsPro2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C18666l c18666l3 = (C18666l) listIsPro2.get(i6);
            C11873l c11873l2 = (C11873l) this.f19737l.loadAd(c18666l3.billing);
            if (c11873l2 != null && ads().yandex(c18666l3.billing)) {
                signatures(c18666l3, c11873l2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean smaato(int i, long j, boolean z) {
        C4707l c4707l;
        int i2;
        if (AbstractC8576l.yandex(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC14183l abstractC14183lAds = ads();
            if (!C1187l.loadAd(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    c4707l = AbstractC0424l.pro;
                } else {
                    if (z) {
                        C18725l.billing();
                        return false;
                    }
                    c4707l = AbstractC0424l.license;
                }
                Object[] objArr = abstractC14183lAds.crashlytics;
                long[] jArr = abstractC14183lAds.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    C13874l c13874l = (C13874l) objArr[(i3 << 3) + i6];
                                    C16918l c16918l = c13874l.loadAd;
                                    float f = c16918l.yandex;
                                    i2 = i4;
                                    float f2 = c16918l.loadAd;
                                    float f3 = c16918l.crashlytics;
                                    float f4 = c16918l.amazon;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objMopub = c13874l.yandex.amazon.f13225l.mopub(c4707l);
                                        if (objMopub == null) {
                                            objMopub = null;
                                        }
                                        C11601l c11601l = (C11601l) objMopub;
                                        if (c11601l != null) {
                                            Function0 function0 = c11601l.yandex;
                                            if (i < 0) {
                                                if (((Number) function0.invoke()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) function0.invoke()).floatValue() < ((Number) c11601l.loadAd.invoke()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final int startapp(C18666l c18666l) {
        C6264l c6264l = c18666l.amazon;
        if (!c6264l.f13225l.crashlytics(AbstractC0424l.yandex)) {
            C4707l c4707l = AbstractC0424l.f1549synchronized;
            if (c6264l.f13225l.crashlytics(c4707l)) {
                return (int) (((C12814l) c6264l.mopub(c4707l)).yandex & 4294967295L);
            }
        }
        return this.f19711l;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m2712strictfp(C3654l c3654l) {
        HashMap<C3654l, AbstractC0290l> layoutNodeToHolder;
        if (c3654l.m1386native()) {
            C8697l androidViewsHandler = this.f19728l.getAndroidViewsHandler();
            if (androidViewsHandler == null || (layoutNodeToHolder = androidViewsHandler.getLayoutNodeToHolder()) == null || !layoutNodeToHolder.containsKey(c3654l)) {
                int i = c3654l.f7685l;
                C11601l c11601l = (C11601l) this.f19715l.loadAd(i);
                C11601l c11601l2 = (C11601l) this.f19720l.loadAd(i);
                if (c11601l == null && c11601l2 == null) {
                    return;
                }
                AccessibilityEvent accessibilityEventVip = vip(i, 4096);
                if (c11601l != null) {
                    accessibilityEventVip.setScrollX((int) ((Number) c11601l.yandex.invoke()).floatValue());
                    accessibilityEventVip.setMaxScrollX((int) ((Number) c11601l.loadAd.invoke()).floatValue());
                }
                if (c11601l2 != null) {
                    accessibilityEventVip.setScrollY((int) ((Number) c11601l2.yandex.invoke()).floatValue());
                    accessibilityEventVip.setMaxScrollY((int) ((Number) c11601l2.loadAd.invoke()).floatValue());
                }
                premium(accessibilityEventVip);
            }
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m2713synchronized(C3654l c3654l, C4622l c4622l) {
        C6264l c6264lAdvert;
        HashMap<C3654l, AbstractC0290l> layoutNodeToHolder;
        if (c3654l.m1386native()) {
            C8697l androidViewsHandler = this.f19728l.getAndroidViewsHandler();
            if (androidViewsHandler == null || (layoutNodeToHolder = androidViewsHandler.getLayoutNodeToHolder()) == null || !layoutNodeToHolder.containsKey(c3654l)) {
                C3654l c3654l2 = null;
                if (!c3654l.f7703l.admob(8)) {
                    c3654l = c3654l.license();
                    while (true) {
                        if (c3654l == null) {
                            c3654l = null;
                            break;
                        } else if (c3654l.f7703l.admob(8)) {
                            break;
                        } else {
                            c3654l = c3654l.license();
                        }
                    }
                }
                if (c3654l == null || (c6264lAdvert = c3654l.advert()) == null) {
                    return;
                }
                if (!c6264lAdvert.f13223l) {
                    for (C3654l c3654lLicense = c3654l.license(); c3654lLicense != null; c3654lLicense = c3654lLicense.license()) {
                        C6264l c6264lAdvert2 = c3654lLicense.advert();
                        if (c6264lAdvert2 != null && c6264lAdvert2.f13223l) {
                            c3654l2 = c3654lLicense;
                            break;
                        }
                    }
                    if (c3654l2 != null) {
                        c3654l = c3654l2;
                    }
                }
                int i = c3654l.f7685l;
                if (c4622l.yandex(i)) {
                    appmetrica(this, isVip(i), 2048, 1, 8);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    public final C8896l tapsense(C18666l c18666l, Rect rect, InterfaceC6347l interfaceC6347l) {
        C12004l c12004l = new C12004l(interfaceC6347l);
        C3654l c3654l = c18666l.crashlytics;
        AbstractC14971l abstractC14971l = (AbstractC14971l) c3654l.f7703l.mopub;
        InterfaceC8605l interfaceC8605l = null;
        if ((abstractC14971l.f29457l & 8) != 0) {
            loop0: while (abstractC14971l != null) {
                if ((abstractC14971l.f29450l & 8) == 0) {
                    if ((abstractC14971l.f29457l & 8) != 0) {
                        break;
                        break;
                    }
                    abstractC14971l = abstractC14971l.f29460l;
                } else {
                    AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                    C17893l c17893l = null;
                    while (abstractC14971lLoadAd != null) {
                        if (abstractC14971lLoadAd instanceof InterfaceC3703l) {
                            ((InterfaceC3703l) abstractC14971lLoadAd).isPro(c12004l);
                            if (c12004l.f23925l) {
                                interfaceC8605l = abstractC14971lLoadAd;
                                break loop0;
                            }
                        } else if ((abstractC14971lLoadAd.f29450l & 8) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                            int i = 0;
                            for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                if ((abstractC14971l2.f29450l & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC14971lLoadAd = abstractC14971l2;
                                    } else {
                                        if (c17893l == null) {
                                            c17893l = new C17893l(0, new AbstractC14971l[16]);
                                        }
                                        if (abstractC14971lLoadAd != null) {
                                            c17893l.crashlytics(abstractC14971lLoadAd);
                                            abstractC14971lLoadAd = null;
                                        }
                                        c17893l.crashlytics(abstractC14971l2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                    }
                    if ((abstractC14971l.f29457l & 8) != 0) {
                        break;
                    }
                    abstractC14971l = abstractC14971l.f29460l;
                }
            }
        }
        InterfaceC8605l interfaceC8605l2 = (InterfaceC3703l) interfaceC8605l;
        if (interfaceC8605l2 == null || !((AbstractC14971l) interfaceC8605l2).f29454l.f29462l) {
            return AbstractC9690l.loadAd((AbstractC18026l) c3654l.f7703l.purchase, false);
        }
        AbstractC18026l abstractC18026lVip = AbstractC5573l.vip(interfaceC8605l2);
        C8896l c8896lMo2592synchronized = AbstractC9690l.crashlytics(abstractC18026lVip).mo2592synchronized(abstractC18026lVip, false);
        Rect rectM2711private = m2711private(c8896lMo2592synchronized.yandex, c8896lMo2592synchronized.loadAd, c8896lMo2592synchronized.crashlytics, c8896lMo2592synchronized.amazon);
        float f = rectM2711private.left - rect.left;
        float f2 = rectM2711private.top - rect.top;
        return new C8896l(f, f2, rectM2711private.width() + f, rectM2711private.height() + f2);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m2714throws(int i) {
        C9396l c9396l = this.f19730l;
        if (c9396l != null) {
            C18666l c18666l = c9396l.yandex;
            if (i != c18666l.billing) {
                return;
            }
            if (SystemClock.uptimeMillis() - c9396l.billing <= 1000) {
                AccessibilityEvent accessibilityEventVip = vip(isVip(c18666l.billing), 131072);
                accessibilityEventVip.setFromIndex(c9396l.amazon);
                accessibilityEventVip.setToIndex(c9396l.purchase);
                accessibilityEventVip.setAction(c9396l.loadAd);
                accessibilityEventVip.setMovementGranularity(c9396l.crashlytics);
                accessibilityEventVip.getText().add(subscription(c18666l));
                premium(accessibilityEventVip);
            }
        }
        this.f19730l = null;
    }

    public final AccessibilityEvent vip(int i, int i2) {
        C13874l c13874l;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f19728l;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC13840l.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC13840l, i);
        if (Signature() && (c13874l = (C13874l) ads().loadAd(i)) != null) {
            C18666l c18666l = c13874l.yandex;
            accessibilityEventObtain.setPassword(c18666l.amazon.f13225l.crashlytics(AbstractC0424l.f1543for));
            Object objMopub = c18666l.amazon.f13225l.mopub(AbstractC0424l.metrica);
            if (objMopub == null) {
                objMopub = null;
            }
            boolean zYandex = AbstractC8576l.yandex(objMopub, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC5917l.m1872synchronized(accessibilityEventObtain, zYandex);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean m2715volatile(C18666l c18666l, int i, int i2, boolean z) {
        String strSubscription;
        C6264l c6264l = c18666l.amazon;
        int i3 = c18666l.billing;
        C4707l c4707l = AbstractC16601l.isPro;
        if (c6264l.f13225l.crashlytics(c4707l) && AbstractC3292l.loadAd(c18666l)) {
            Function3 function3 = (Function3) ((C7629l) c18666l.amazon.mopub(c4707l)).loadAd;
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f19711l) && (strSubscription = subscription(c18666l)) != null) {
            if (i < 0 || i != i2 || i2 > strSubscription.length()) {
                i = -1;
            }
            this.f19711l = i;
            boolean z2 = strSubscription.length() > 0;
            premium(metrica(isVip(i3), z2 ? Integer.valueOf(this.f19711l) : null, z2 ? Integer.valueOf(this.f19711l) : null, z2 ? Integer.valueOf(strSubscription.length()) : null, strSubscription));
            m2714throws(i3);
            return true;
        }
        return false;
    }
}
