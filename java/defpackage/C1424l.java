package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؒۢۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1424l implements InterfaceC3710l, InterfaceC0252l, InterfaceC15837l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static HashSet f3599l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final byte[] f3600l = new byte[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f3601l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f3602l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f3603l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f3604l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f3605l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f3606l;

    public C1424l(int i) {
        switch (i) {
            case 4:
                this.f3603l = new AtomicBoolean(false);
                this.f3602l = new CountDownLatch(1);
                this.f3606l = "PublicSuffixDatabase.list";
                break;
            case 15:
                AbstractC3326l abstractC3326l = (AbstractC3326l) ((C8688l) AbstractC8310l.yandex.f20465l).getValue();
                if (!(abstractC3326l instanceof C0513l)) {
                    new C15562l(abstractC3326l);
                }
                new ConcurrentHashMap();
                this.f3603l = new ConcurrentHashMap();
                this.f3602l = new ConcurrentHashMap();
                this.f3601l = new ConcurrentHashMap();
                new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f3605l = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f3604l = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f3606l = new ConcurrentHashMap();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.f3603l = C1908l.f4358synchronized.smaato(C10444l.mopub);
                this.f3602l = C14023l.loadAd;
                this.f3601l = C16616l.loadAd;
                this.f3605l = C13708l.f26763l;
                this.f3604l = Bundle.EMPTY;
                this.f3606l = null;
                break;
            default:
                this.f3603l = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.f3602l = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f3601l = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.f3605l = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f3604l = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f3606l = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static C12876l m887abstract(AbstractC14080l abstractC14080l, InterfaceC3588l interfaceC3588l, C14965l c14965l, int i, boolean z) {
        C10459l c10459l;
        if (abstractC14080l instanceof C13347l) {
            C3429l c3429l = C11682l.yandex;
            C0166l c0166lYandex = C11682l.yandex((C13347l) abstractC14080l, interfaceC3588l, c14965l);
            if (c0166lYandex != null) {
                return AbstractC12754l.yandex(c0166lYandex);
            }
        } else if (abstractC14080l instanceof C14036l) {
            C3429l c3429l2 = C11682l.yandex;
            C0166l c0166lCrashlytics = C11682l.crashlytics((C14036l) abstractC14080l, interfaceC3588l, c14965l);
            if (c0166lCrashlytics != null) {
                return AbstractC12754l.yandex(c0166lCrashlytics);
            }
        } else if ((abstractC14080l instanceof C13146l) && (c10459l = (C10459l) AbstractC0714l.loadAd((AbstractC2597l) abstractC14080l, AbstractC8450l.amazon)) != null) {
            int iInmobi = AbstractC5020l.inmobi(i);
            if (iInmobi == 1) {
                return AbstractC0837l.crashlytics((C13146l) abstractC14080l, interfaceC3588l, c14965l, true, true, z);
            }
            if (iInmobi != 2) {
                if (iInmobi != 3 || (c10459l.f21279l & 8) != 8) {
                    return null;
                }
                C6431l c6431l = c10459l.f21284l;
                return new C12876l(interfaceC3588l.getString(c6431l.f13452l).concat(interfaceC3588l.getString(c6431l.f13456l)));
            }
            if (c10459l.subs()) {
                C6431l c6431l2 = c10459l.f21281l;
                return new C12876l(interfaceC3588l.getString(c6431l2.f13452l).concat(interfaceC3588l.getString(c6431l2.f13456l)));
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix applovin(defpackage.C10006l r9, defpackage.C10006l r10, defpackage.C3299l r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            lٔٗٞ r1 = r11.yandex
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.amazon
            float r3 = r10.amazon
            float r2 = r2 / r3
            float r3 = r9.purchase
            float r4 = r10.purchase
            float r3 = r3 / r4
            float r4 = r10.loadAd
            float r4 = -r4
            float r5 = r10.crashlytics
            float r5 = -r5
            lٍؕۤ r6 = defpackage.C3299l.crashlytics
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.loadAd
            float r9 = r9.crashlytics
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.loadAd
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.amazon
            float r2 = r2 / r11
            float r3 = r9.purchase
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.amazon
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.amazon
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.purchase
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.purchase
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.loadAd
            float r9 = r9.crashlytics
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1424l.applovin(lَؙؑ, lَؙؑ, lٍؕۤ):android.graphics.Matrix");
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static boolean m888break(C5019l c5019l, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = c5019l.yandex;
        int i4 = c5019l.loadAd;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && c5019l.crashlytics == i2) {
            return true;
        }
        return !z && i4 == -1 && c5019l.purchase == i3;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static void m889catch(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static void m890class(C6292l c6292l, String str) {
        AbstractC12707l abstractC12707lIsPro = c6292l.yandex.isPro(str);
        if (abstractC12707lIsPro == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(abstractC12707lIsPro instanceof C6292l)) {
            m889catch("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (abstractC12707lIsPro == c6292l) {
            m889catch("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C6292l c6292l2 = (C6292l) abstractC12707lIsPro;
        if (c6292l.startapp == null) {
            c6292l.startapp = c6292l2.startapp;
        }
        if (c6292l.adcel == null) {
            c6292l.adcel = c6292l2.adcel;
        }
        if (c6292l.ads == null) {
            c6292l.ads = c6292l2.ads;
        }
        if (c6292l.subscription == null) {
            c6292l.subscription = c6292l2.subscription;
        }
        if (c6292l.tapsense == null) {
            c6292l.tapsense = c6292l2.tapsense;
        }
        if (c6292l.Signature == null) {
            c6292l.Signature = c6292l2.Signature;
        }
        if (c6292l.license == null) {
            c6292l.license = c6292l2.license;
        }
        if (c6292l.subs.isEmpty()) {
            c6292l.subs = c6292l2.subs;
        }
        if (c6292l.metrica == null) {
            c6292l.metrica = c6292l2.metrica;
        }
        if (c6292l.vip == null) {
            c6292l.vip = c6292l2.vip;
        }
        String str2 = c6292l2.pro;
        if (str2 != null) {
            m890class(c6292l, str2);
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static void m891continue(C0973l c0973l, C0973l c0973l2) {
        if (c0973l.remoteconfig == null) {
            c0973l.remoteconfig = c0973l2.remoteconfig;
        }
        if (c0973l.vip == null) {
            c0973l.vip = c0973l2.vip;
        }
        if (c0973l.metrica == null) {
            c0973l.metrica = c0973l2.metrica;
        }
        if (c0973l.startapp == null) {
            c0973l.startapp = c0973l2.startapp;
        }
        if (c0973l.adcel == null) {
            c0973l.adcel = c0973l2.adcel;
        }
    }

    public static void crashlytics(C9056l c9056l, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = c9056l.loadAd.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static C5019l m892default(InterfaceC9814l interfaceC9814l, AbstractC1186l abstractC1186l, C5019l c5019l, C3904l c3904l) {
        AbstractC10759l abstractC10759lMo2791l = interfaceC9814l.mo2791l();
        int iAd = interfaceC9814l.ad();
        Object objSmaato = abstractC10759lMo2791l.startapp() ? null : abstractC10759lMo2791l.smaato(iAd);
        int iLoadAd = (interfaceC9814l.subs() || abstractC10759lMo2791l.startapp()) ? -1 : abstractC10759lMo2791l.billing(iAd, c3904l, false).loadAd(AbstractC15323l.m3962continue(interfaceC9814l.mo2771l()) - c3904l.purchase);
        for (int i = 0; i < abstractC1186l.size(); i++) {
            C5019l c5019l2 = (C5019l) abstractC1186l.get(i);
            if (m888break(c5019l2, objSmaato, interfaceC9814l.subs(), interfaceC9814l.mo2815while(), interfaceC9814l.mo2805strictfp(), iLoadAd)) {
                return c5019l2;
            }
        }
        if (abstractC1186l.isEmpty() && c5019l != null && m888break(c5019l, objSmaato, interfaceC9814l.subs(), interfaceC9814l.mo2815while(), interfaceC9814l.mo2805strictfp(), iLoadAd)) {
            return c5019l;
        }
        return null;
    }

    public static final void firebase(C1424l c1424l, Throwable th) {
        C11315l c11315l = (C11315l) c1424l.f3606l;
        C7119l c7119l = (C7119l) c1424l.f3604l;
        if (c7119l.firebase(th, false)) {
            for (Object objTapsense = c7119l.tapsense(); !(objTapsense instanceof C15230l); objTapsense = c7119l.tapsense()) {
                C0381l.loadAd(objTapsense);
                c11315l.addLast(objTapsense);
            }
            if (c11315l.isEmpty()) {
                return;
            }
            ((Function1) c1424l.f3602l).invoke(new ArrayList(c11315l));
            c11315l.clear();
        }
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public static void m893l(C16539l c16539l, boolean z, AbstractC18728l abstractC18728l) {
        int i;
        C2071l c2071l = c16539l.yandex;
        float fFloatValue = (z ? c2071l.f4614l : c2071l.f4633l).floatValue();
        if (abstractC18728l instanceof C13555l) {
            i = ((C13555l) abstractC18728l).f26574l;
        } else if (!(abstractC18728l instanceof C2128l)) {
            return;
        } else {
            i = c16539l.yandex.f4642l.f26574l;
        }
        int iM896package = m896package(i, fFloatValue);
        if (z) {
            c16539l.amazon.setColor(iM896package);
        } else {
            c16539l.purchase.setColor(iM896package);
        }
    }

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public static void m894l(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C7862l.loadAd;
        }
        drawableMutate.setColorFilter(C7862l.crashlytics(i, mode));
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static Path m895l(C15075l c15075l) {
        Path path = new Path();
        float[] fArr = c15075l.metrica;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c15075l.metrica;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c15075l instanceof C10292l) {
            path.close();
        }
        if (c15075l.admob == null) {
            c15075l.admob = signatures(path);
        }
        return path;
    }

    public static void mopub(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, InterfaceC1767l interfaceC1767l) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC1767l.purchase(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = d26 / dSqrt3;
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (d27 < -1.0d ? 3.141592653589793d : d27 > 1.0d ? 0.0d : Math.acos(d27));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d28 = dAcos2 % 6.283185307179586d;
        double d29 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d28) * 2.0d) / 3.141592653589793d);
        double d30 = d28 / ((double) iCeil);
        double d31 = d30 / 2.0d;
        double dSin2 = (Math.sin(d31) * 1.3333333333333333d) / (Math.cos(d31) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d32 = d29;
            double d33 = (((double) i2) * d30) + d32;
            double dCos2 = Math.cos(d33);
            double dSin3 = Math.sin(d33);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d34 = d33 + d30;
            double dCos3 = Math.cos(d34);
            double dSin4 = Math.sin(d34);
            fArr[i5 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i5 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i5 + 4] = (float) dCos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) dSin4;
            i2 = i4 + 1;
            d29 = d32;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            interfaceC1767l.crashlytics(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static int m896package(int i, float f) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static boolean pro(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static LayerDrawable m897public(C7521l c7521l, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableBilling = c7521l.billing(context, R.drawable.abc_star_black_48dp);
        Drawable drawableBilling2 = c7521l.billing(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableBilling instanceof BitmapDrawable) && drawableBilling.getIntrinsicWidth() == dimensionPixelSize && drawableBilling.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableBilling;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableBilling.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableBilling.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableBilling2 instanceof BitmapDrawable) && drawableBilling2.getIntrinsicWidth() == dimensionPixelSize && drawableBilling2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableBilling2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableBilling2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableBilling2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static C10006l signatures(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C10006l(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static /* synthetic */ List m898static(C1424l c1424l, AbstractC3031l abstractC3031l, C12876l c12876l, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return c1424l.m915interface(abstractC3031l, c12876l, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static ColorStateList m899strictfp(Context context, int i) {
        int iCrashlytics = AbstractC1035l.crashlytics(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC1035l.loadAd, AbstractC1035l.amazon, AbstractC1035l.crashlytics, AbstractC1035l.billing}, new int[]{AbstractC1035l.loadAd(context, R.attr.colorButtonNormal), AbstractC14093l.mopub(iCrashlytics, i), AbstractC14093l.mopub(iCrashlytics, i), i});
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static void m900switch(AbstractC16054l abstractC16054l, String str) {
        AbstractC12707l abstractC12707lIsPro = abstractC16054l.yandex.isPro(str);
        if (abstractC12707lIsPro == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(abstractC12707lIsPro instanceof AbstractC16054l)) {
            m889catch("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (abstractC12707lIsPro == abstractC16054l) {
            m889catch("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        AbstractC16054l abstractC16054l2 = (AbstractC16054l) abstractC12707lIsPro;
        if (abstractC16054l.subs == null) {
            abstractC16054l.subs = abstractC16054l2.subs;
        }
        if (abstractC16054l.isPro == null) {
            abstractC16054l.isPro = abstractC16054l2.isPro;
        }
        if (abstractC16054l.firebase == 0) {
            abstractC16054l.firebase = abstractC16054l2.firebase;
        }
        if (abstractC16054l.admob.isEmpty()) {
            abstractC16054l.admob = abstractC16054l2.admob;
        }
        try {
            if (abstractC16054l instanceof C9766l) {
                C9766l c9766l = (C9766l) abstractC16054l;
                C9766l c9766l2 = (C9766l) abstractC12707lIsPro;
                if (c9766l.remoteconfig == null) {
                    c9766l.remoteconfig = c9766l2.remoteconfig;
                }
                if (c9766l.vip == null) {
                    c9766l.vip = c9766l2.vip;
                }
                if (c9766l.metrica == null) {
                    c9766l.metrica = c9766l2.metrica;
                }
                if (c9766l.startapp == null) {
                    c9766l.startapp = c9766l2.startapp;
                }
            } else {
                m891continue((C0973l) abstractC16054l, (C0973l) abstractC12707lIsPro);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC16054l2.smaato;
        if (str2 != null) {
            m900switch(abstractC16054l, str2);
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static Typeface m901throws(int i, Integer num, String str) {
        int i2;
        boolean z = i == 2;
        if (num.intValue() > 500) {
            i2 = z ? 3 : 1;
        } else {
            i2 = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static boolean m902transient(C2071l c2071l, long j) {
        return (j & c2071l.f4624l) != 0;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static C1424l m903volatile(byte[] bArr, byte[] bArr2, byte[] bArr3, InterfaceC6211l interfaceC6211l, C10828l c10828l, InterfaceC3881l interfaceC3881l, byte[] bArr4) throws GeneralSecurityException {
        byte[] bArr5;
        byte[] bArrMo1224while = interfaceC6211l.mo1224while();
        switch (c10828l.f21889l) {
            case "HmacSha256":
                bArr5 = AbstractC2383l.billing;
                break;
            case "HmacSha384":
                bArr5 = AbstractC2383l.mopub;
                break;
            case "HmacSha512":
                bArr5 = AbstractC2383l.admob;
                break;
            default:
                C18262l.ads("Could not determine HPKE KDF ID");
                return null;
        }
        byte[] bArrAmazon = AbstractC17265l.amazon(AbstractC2383l.vip, bArrMo1224while, bArr5, interfaceC3881l.adcel());
        byte[] bArr6 = AbstractC2383l.smaato;
        byte[] bArr7 = AbstractC2383l.metrica;
        Charset charset = AbstractC0647l.yandex;
        byte[] bytes = "psk_id_hash".getBytes(charset);
        byte[] bArr8 = f3600l;
        byte[] bArrAmazon2 = AbstractC17265l.amazon(bArr, c10828l.loadAd(AbstractC17265l.amazon(bArr7, bArrAmazon, bytes, bArr8), bArr6), c10828l.loadAd(AbstractC17265l.amazon(bArr7, bArrAmazon, "info_hash".getBytes(charset), bArr4), bArr6));
        byte[] bArrLoadAd = c10828l.loadAd(AbstractC17265l.amazon(bArr7, bArrAmazon, "secret".getBytes(charset), bArr8), bArr3);
        int iRemoteconfig = interfaceC3881l.remoteconfig();
        byte[] bArrYandex = c10828l.yandex(bArrLoadAd, iRemoteconfig, AbstractC17265l.amazon(AbstractC2383l.loadAd(2, iRemoteconfig), bArr7, bArrAmazon, "key".getBytes(charset), bArrAmazon2));
        byte[] bArrYandex2 = c10828l.yandex(bArrLoadAd, 12, AbstractC17265l.amazon(AbstractC2383l.loadAd(2, 12), bArr7, bArrAmazon, "base_nonce".getBytes(charset), bArrAmazon2));
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger.shiftLeft(96).subtract(bigInteger);
        C1424l c1424l = new C1424l();
        c1424l.f3604l = bArr2;
        c1424l.f3601l = bArrYandex;
        c1424l.f3605l = bArrYandex2;
        c1424l.f3606l = BigInteger.ZERO;
        c1424l.f3602l = bigIntegerSubtract;
        c1424l.f3603l = interfaceC3881l;
        return c1424l;
    }

    public static C9056l yandex(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                C18262l.metrica(AbstractC0653l.vip(i3, "Invalid value size: "));
                return null;
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = AbstractC15323l.loadAd;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new C9056l(map);
    }

    public C8378l ad() throws GeneralSecurityException {
        if (((Integer) this.f3603l) == null) {
            C18262l.ads("AES key size is not set");
            return null;
        }
        if (((Integer) this.f3602l) == null) {
            C18262l.ads("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.f3601l) == null) {
            C18262l.ads("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.f3605l;
        if (num == null) {
            C18262l.ads("tag size is not set");
            return null;
        }
        if (((C11534l) this.f3604l) == null) {
            C18262l.ads("hash type is not set");
            return null;
        }
        if (((C6932l) this.f3606l) == null) {
            C18262l.ads("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        C11534l c11534l = (C11534l) this.f3604l;
        if (c11534l == C11534l.f23190l) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c11534l == C11534l.f23195l) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c11534l == C11534l.f23194l) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c11534l == C11534l.f23198l) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c11534l != C11534l.f23191l) {
                C18262l.ads("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C8378l(((Integer) this.f3603l).intValue(), ((Integer) this.f3602l).intValue(), ((Integer) this.f3601l).intValue(), ((Integer) this.f3605l).intValue(), (C6932l) this.f3606l, (C11534l) this.f3604l);
    }

    @Override // defpackage.InterfaceC0252l
    public Object adcel(AbstractC3031l abstractC3031l, C13146l c13146l, AbstractC18041l abstractC18041l) {
        return m963while(abstractC3031l, c13146l, 2, abstractC18041l, C15460l.f30232l);
    }

    @Override // defpackage.InterfaceC3710l
    public void admob(InterfaceC1286l interfaceC1286l) {
        AbstractC10999l.mopub(C16499l.f32230l, null, 0, new C3649l((Activity) this.f3605l, (String) this.f3604l, (String) this.f3606l, interfaceC1286l, null), 3);
    }

    @Override // defpackage.InterfaceC15837l
    public List ads(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i, int i2, C18426l c18426l) {
        return !AbstractC1305l.crashlytics.purchase(c18426l.f35990l).booleanValue() ? C2580l.f5619l : (List) new C15112l(this, abstractC3031l, abstractC14080l, i, i2).invoke();
    }

    public C5416l advert() throws GeneralSecurityException {
        C15059l c15059l = (C15059l) this.f3603l;
        if (c15059l == null) {
            C18262l.ads("Elliptic curve type is not set");
            return null;
        }
        if (((C13114l) this.f3602l) == null) {
            C18262l.ads("Hash type is not set");
            return null;
        }
        if (((AbstractC3302l) this.f3605l) == null) {
            C18262l.ads("DEM parameters are not set");
            return null;
        }
        if (((C10828l) this.f3604l) == null) {
            C18262l.ads("Variant is not set");
            return null;
        }
        C15059l c15059l2 = C15059l.purchase;
        if (c15059l != c15059l2 && ((C12247l) this.f3601l) == null) {
            C18262l.ads("Point format is not set");
            return null;
        }
        if (c15059l != c15059l2 || ((C12247l) this.f3601l) == null) {
            return new C5416l((C15059l) this.f3603l, (C13114l) this.f3602l, (C12247l) this.f3601l, (AbstractC3302l) this.f3605l, (C10828l) this.f3604l, (C0346l) this.f3606l);
        }
        C18262l.ads("For Curve25519 point format must not be set");
        return null;
    }

    @Override // defpackage.InterfaceC15837l
    public ArrayList amazon(C18128l c18128l, InterfaceC3588l interfaceC3588l) {
        List list = c18128l.f35440l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0458l) this.f3604l).applovin((C7899l) it.next(), interfaceC3588l));
        }
        return arrayList;
    }

    public void appmetrica(AbstractC11678l abstractC11678l, C10006l c10006l) {
        Path pathIsVip;
        if (((C16539l) this.f3601l).yandex.f4622l == null || (pathIsVip = isVip(abstractC11678l, c10006l)) == null) {
            return;
        }
        ((Canvas) this.f3603l).clipPath(pathIsVip);
    }

    @Override // defpackage.InterfaceC0252l
    public Object billing(AbstractC3031l abstractC3031l, C13146l c13146l, AbstractC18041l abstractC18041l) {
        return m963while(abstractC3031l, c13146l, 3, abstractC18041l, C15460l.f30239l);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public C3823l m904case(C3823l c3823l) {
        return c3823l.mopub(new ExecutorC11374l(2), new C18262l(this));
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public List m905const(AbstractC3031l abstractC3031l, C13146l c13146l, int i) {
        C14965l c14965l = (C14965l) abstractC3031l.f6544l;
        Boolean boolMopub = AbstractC1305l.appmetrica.purchase(c13146l.f25731l);
        boolean zAmazon = C11682l.amazon(c13146l);
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) abstractC3031l.f6545l;
        if (i == 1) {
            C12876l c12876lCrashlytics = AbstractC0837l.crashlytics(c13146l, interfaceC3588l, c14965l, (40 & 8) == 0, (40 & 16) == 0, true);
            if (c12876lCrashlytics != null) {
                return m898static(this, abstractC3031l, c12876lCrashlytics, boolMopub, zAmazon, 8);
            }
        } else {
            C12876l c12876lCrashlytics2 = AbstractC0837l.crashlytics(c13146l, interfaceC3588l, c14965l, (40 & 8) == 0, (40 & 16) == 0, true);
            if (c12876lCrashlytics2 != null) {
                if (AbstractC12024l.appmetrica(c12876lCrashlytics2.yandex, "$delegate", false) == (i == 3)) {
                    return m915interface(abstractC3031l, c12876lCrashlytics2, true, true, boolMopub, zAmazon);
                }
            }
        }
        return C2580l.f5619l;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void m906else(AbstractC17931l abstractC17931l, StringBuilder sb) {
        Iterator it = abstractC17931l.subs.iterator();
        boolean z = true;
        while (it.hasNext()) {
            AbstractC15046l abstractC15046l = (AbstractC15046l) it.next();
            if (abstractC15046l instanceof AbstractC17931l) {
                m906else((AbstractC17931l) abstractC15046l, sb);
            } else if (abstractC15046l instanceof C4222l) {
                sb.append(m923l(((C4222l) abstractC15046l).crashlytics, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void m907extends(AbstractC11678l abstractC11678l, Path path) {
        float fPurchase;
        float fAmazon;
        float fPurchase2;
        float fAmazon2;
        boolean z;
        boolean z2;
        Canvas canvas = (Canvas) this.f3603l;
        AbstractC18728l abstractC18728l = ((C16539l) this.f3601l).yandex.f4623l;
        if (abstractC18728l instanceof C0172l) {
            AbstractC12707l abstractC12707lIsPro = ((C4816l) this.f3602l).isPro(((C0172l) abstractC18728l).f1123l);
            if (abstractC12707lIsPro instanceof C6292l) {
                C6292l c6292l = (C6292l) abstractC12707lIsPro;
                Boolean bool = c6292l.startapp;
                boolean z3 = bool != null && bool.booleanValue();
                String str = c6292l.pro;
                if (str != null) {
                    m890class(c6292l, str);
                }
                C12671l c12671l = c6292l.subscription;
                if (z3) {
                    fAmazon = c12671l != null ? c12671l.amazon(this) : 0.0f;
                    C12671l c12671l2 = c6292l.tapsense;
                    fPurchase2 = c12671l2 != null ? c12671l2.purchase(this) : 0.0f;
                    C12671l c12671l3 = c6292l.Signature;
                    fAmazon2 = c12671l3 != null ? c12671l3.amazon(this) : 0.0f;
                    C12671l c12671l4 = c6292l.license;
                    fPurchase = c12671l4 != null ? c12671l4.purchase(this) : 0.0f;
                } else {
                    float fLoadAd = c12671l != null ? c12671l.loadAd(this, 1.0f) : 0.0f;
                    C12671l c12671l5 = c6292l.tapsense;
                    float fLoadAd2 = c12671l5 != null ? c12671l5.loadAd(this, 1.0f) : 0.0f;
                    C12671l c12671l6 = c6292l.Signature;
                    float fLoadAd3 = c12671l6 != null ? c12671l6.loadAd(this, 1.0f) : 0.0f;
                    C12671l c12671l7 = c6292l.license;
                    float fLoadAd4 = c12671l7 != null ? c12671l7.loadAd(this, 1.0f) : 0.0f;
                    C10006l c10006l = abstractC11678l.admob;
                    float f = c10006l.loadAd;
                    float f2 = c10006l.amazon;
                    float f3 = (fLoadAd * f2) + f;
                    float f4 = c10006l.crashlytics;
                    float f5 = c10006l.purchase;
                    float f6 = fLoadAd3 * f2;
                    fPurchase = fLoadAd4 * f5;
                    fAmazon = f3;
                    fPurchase2 = (fLoadAd2 * f5) + f4;
                    fAmazon2 = f6;
                }
                if (fAmazon2 == 0.0f || fPurchase == 0.0f) {
                    return;
                }
                C3299l c3299l = c6292l.vip;
                if (c3299l == null) {
                    c3299l = C3299l.amazon;
                }
                m931l();
                canvas.clipPath(path);
                C16539l c16539l = new C16539l();
                m946l(c16539l, C2071l.yandex());
                c16539l.yandex.f4632l = Boolean.FALSE;
                m954new(c6292l, c16539l);
                this.f3601l = c16539l;
                C10006l c10006l2 = abstractC11678l.admob;
                Matrix matrix = c6292l.ads;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c6292l.ads.invert(matrix2)) {
                        C10006l c10006l3 = abstractC11678l.admob;
                        float f7 = c10006l3.loadAd;
                        float f8 = c10006l3.crashlytics;
                        float fCrashlytics = c10006l3.crashlytics();
                        z = true;
                        C10006l c10006l4 = abstractC11678l.admob;
                        z2 = false;
                        float f9 = c10006l4.crashlytics;
                        float fCrashlytics2 = c10006l4.crashlytics();
                        float fAmazon3 = abstractC11678l.admob.amazon();
                        C10006l c10006l5 = abstractC11678l.admob;
                        float[] fArr = {f7, f8, fCrashlytics, f9, fCrashlytics2, fAmazon3, c10006l5.loadAd, c10006l5.amazon()};
                        matrix2.mapPoints(fArr);
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        RectF rectF = new RectF(f10, f11, f10, f11);
                        for (int i = 2; i <= 6; i += 2) {
                            float f12 = fArr[i];
                            if (f12 < rectF.left) {
                                rectF.left = f12;
                            }
                            if (f12 > rectF.right) {
                                rectF.right = f12;
                            }
                            float f13 = fArr[i + 1];
                            if (f13 < rectF.top) {
                                rectF.top = f13;
                            }
                            if (f13 > rectF.bottom) {
                                rectF.bottom = f13;
                            }
                        }
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        c10006l2 = new C10006l(f14, f15, rectF.right - f14, rectF.bottom - f15);
                    } else {
                        z = true;
                        z2 = false;
                    }
                } else {
                    z = true;
                    z2 = false;
                }
                float fFloor = (((float) Math.floor((c10006l2.loadAd - fAmazon) / fAmazon2)) * fAmazon2) + fAmazon;
                float fCrashlytics3 = c10006l2.crashlytics();
                float fAmazon4 = c10006l2.amazon();
                C10006l c10006l6 = new C10006l(0.0f, 0.0f, fAmazon2, fPurchase);
                boolean zM935l = m935l();
                for (float fFloor2 = (((float) Math.floor((c10006l2.crashlytics - fPurchase2) / fPurchase)) * fPurchase) + fPurchase2; fFloor2 < fAmazon4; fFloor2 += fPurchase) {
                    float f16 = fFloor;
                    while (f16 < fCrashlytics3) {
                        c10006l6.loadAd = f16;
                        c10006l6.crashlytics = fFloor2;
                        m931l();
                        if (!((C16539l) this.f3601l).yandex.f4632l.booleanValue()) {
                            m926l(c10006l6.loadAd, c10006l6.crashlytics, c10006l6.amazon, c10006l6.purchase);
                        }
                        C10006l c10006l7 = c6292l.metrica;
                        if (c10006l7 != null) {
                            canvas.concat(applovin(c10006l6, c10006l7, c3299l));
                        } else {
                            Boolean bool2 = c6292l.adcel;
                            boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            canvas.translate(f16, fFloor2);
                            if (!z4) {
                                C10006l c10006l8 = abstractC11678l.admob;
                                canvas.scale(c10006l8.amazon, c10006l8.purchase);
                            }
                        }
                        Iterator it = c6292l.subs.iterator();
                        while (it.hasNext()) {
                            m919l((AbstractC15046l) it.next());
                        }
                        m941l();
                        f16 += fAmazon2;
                        fAmazon4 = fAmazon4;
                        fFloor = fFloor;
                    }
                }
                if (zM935l) {
                    m944l(c6292l.admob);
                }
                m941l();
                return;
            }
        }
        canvas.drawPath(path, ((C16539l) this.f3601l).amazon);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public C16539l m908final(AbstractC12707l abstractC12707l) {
        C16539l c16539l = new C16539l();
        m946l(c16539l, C2071l.yandex());
        m954new(abstractC12707l, c16539l);
        return c16539l;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public ColorStateList m909finally(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC7720l.crashlytics(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC7720l.crashlytics(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m899strictfp(context, AbstractC1035l.crashlytics(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m899strictfp(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m899strictfp(context, AbstractC1035l.crashlytics(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC7720l.crashlytics(context, R.color.abc_tint_spinner);
            }
            if (pro((int[]) this.f3602l, i)) {
                return AbstractC1035l.amazon(context, R.attr.colorControlNormal);
            }
            if (pro((int[]) this.f3604l, i)) {
                return AbstractC7720l.crashlytics(context, R.color.abc_tint_default);
            }
            if (pro((int[]) this.f3606l, i)) {
                return AbstractC7720l.crashlytics(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC7720l.crashlytics(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListAmazon = AbstractC1035l.amazon(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListAmazon == null || !colorStateListAmazon.isStateful()) {
            iArr[0] = AbstractC1035l.loadAd;
            iArr2[0] = AbstractC1035l.loadAd(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1035l.purchase;
            iArr2[1] = AbstractC1035l.crashlytics(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1035l.billing;
            iArr2[2] = AbstractC1035l.crashlytics(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1035l.loadAd;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListAmazon.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1035l.purchase;
            iArr2[1] = AbstractC1035l.crashlytics(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1035l.billing;
            iArr2[2] = colorStateListAmazon.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m910for(Path path) {
        C16539l c16539l = (C16539l) this.f3601l;
        int i = c16539l.yandex.f4619l;
        Canvas canvas = (Canvas) this.f3603l;
        if (i != 2) {
            canvas.drawPath(path, c16539l.purchase);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((C16539l) this.f3601l).purchase.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((C16539l) this.f3601l).purchase);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public void m911goto() {
        Messenger messenger;
        C10100l c10100l = ((C2987l) this.f3606l).yandex;
        C13645l c13645l = c10100l.billing;
        if (c13645l != null && (messenger = c10100l.mopub) != null) {
            try {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.arg1 = 1;
                messageObtain.setData(null);
                messageObtain.replyTo = messenger;
                ((Messenger) c13645l.f26671l).send(messageObtain);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        c10100l.loadAd.disconnect();
        ((BroadcastReceiver.PendingResult) this.f3604l).finish();
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public List m912implements(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i, int i2) {
        C12876l c12876lM887abstract = m887abstract(abstractC14080l, (InterfaceC3588l) abstractC3031l.f6545l, (C14965l) abstractC3031l.f6544l, i, false);
        if (c12876lM887abstract == null) {
            return C2580l.f5619l;
        }
        return m898static(this, abstractC3031l, new C12876l(c12876lM887abstract.yandex + '@' + i2), null, false, 60);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public int m913import() {
        int i;
        C2071l c2071l = ((C16539l) this.f3601l).yandex;
        if (c2071l.f4621l == 1 || (i = c2071l.f4631l) == 2) {
            return c2071l.f4631l;
        }
        return i == 1 ? 3 : 1;
    }

    public void inmobi(AbstractC11678l abstractC11678l) {
        AbstractC18728l abstractC18728l = ((C16539l) this.f3601l).yandex.f4623l;
        if (abstractC18728l instanceof C0172l) {
            m953native(true, abstractC11678l.admob, (C0172l) abstractC18728l);
        }
        AbstractC18728l abstractC18728l2 = ((C16539l) this.f3601l).yandex.f4634l;
        if (abstractC18728l2 instanceof C0172l) {
            m953native(false, abstractC11678l.admob, (C0172l) abstractC18728l2);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public C1013l m914instanceof(String str) {
        HashMap map = (HashMap) this.f3603l;
        C1013l c1013l = (C1013l) map.get(str);
        if (c1013l != null) {
            return c1013l;
        }
        SparseArray sparseArray = (SparseArray) this.f3602l;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C1013l c1013l2 = new C1013l(iKeyAt, str, C9056l.crashlytics);
        map.put(str, c1013l2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.f3605l).put(iKeyAt, true);
        ((InterfaceC13158l) this.f3604l).pro(c1013l2);
        return c1013l2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public List m915interface(AbstractC3031l abstractC3031l, C12876l c12876l, boolean z, boolean z2, Boolean bool, boolean z3) {
        List list;
        C5222l c5222lLoadAd = AbstractC6616l.loadAd(abstractC3031l, z, z2, bool, z3, (C15053l) this.f3603l, (C4995l) this.f3606l);
        if (c5222lLoadAd == null) {
            if (abstractC3031l instanceof C15627l) {
                InterfaceC5706l interfaceC5706l = (InterfaceC5706l) ((C15627l) abstractC3031l).f6547l;
                C3820l c3820l = interfaceC5706l instanceof C3820l ? (C3820l) interfaceC5706l : null;
                if (c3820l != null) {
                    c5222lLoadAd = c3820l.f7939l;
                } else {
                    c5222lLoadAd = null;
                }
            } else {
                c5222lLoadAd = null;
            }
        }
        return (c5222lLoadAd == null || (list = (List) ((C5366l) ((C0098l) this.f3602l).invoke(c5222lLoadAd)).yandex.get(c12876l)) == null) ? C2580l.f5619l : list;
    }

    @Override // defpackage.InterfaceC15837l
    public List isPro(AbstractC3031l abstractC3031l, C13146l c13146l) {
        return !AbstractC1305l.crashlytics.purchase(c13146l.f25731l).booleanValue() ? C2580l.f5619l : m905const(abstractC3031l, c13146l, 2);
    }

    public Path isVip(AbstractC11678l abstractC11678l, C10006l c10006l) {
        Path pathM921l;
        AbstractC12707l abstractC12707lIsPro = abstractC11678l.yandex.isPro(((C16539l) this.f3601l).yandex.f4622l);
        if (abstractC12707lIsPro == null) {
            m889catch("ClipPath reference '%s' not found", ((C16539l) this.f3601l).yandex.f4622l);
            return null;
        }
        C11932l c11932l = (C11932l) abstractC12707lIsPro;
        ((Stack) this.f3605l).push((C16539l) this.f3601l);
        this.f3601l = m908final(c11932l);
        Boolean bool = c11932l.metrica;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c10006l.loadAd, c10006l.crashlytics);
            matrix.preScale(c10006l.amazon, c10006l.purchase);
        }
        Matrix matrix2 = c11932l.vip;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (AbstractC15046l abstractC15046l : c11932l.subs) {
            if ((abstractC15046l instanceof AbstractC11678l) && (pathM921l = m921l((AbstractC11678l) abstractC15046l, true)) != null) {
                path.op(pathM921l, Path.Op.UNION);
            }
        }
        if (((C16539l) this.f3601l).yandex.f4622l != null) {
            if (c11932l.admob == null) {
                c11932l.admob = signatures(path);
            }
            Path pathIsVip = isVip(c11932l, c11932l.admob);
            if (pathIsVip != null) {
                path.op(pathIsVip, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f3601l = (C16539l) ((Stack) this.f3605l).pop();
        return path;
    }

    public void license(C13698l c13698l, C5019l c5019l, AbstractC10759l abstractC10759l) {
        if (c5019l == null) {
            return;
        }
        if (abstractC10759l.loadAd(c5019l.yandex) != -1) {
            c13698l.mo3668catch(c5019l, abstractC10759l);
            return;
        }
        AbstractC10759l abstractC10759l2 = (AbstractC10759l) ((C15333l) this.f3601l).get(c5019l);
        if (abstractC10759l2 != null) {
            c13698l.mo3668catch(c5019l, abstractC10759l2);
        }
    }

    @Override // defpackage.InterfaceC15837l
    public List loadAd(AbstractC3031l abstractC3031l, C16400l c16400l) {
        return m898static(this, abstractC3031l, new C12876l(AbstractC11043l.admob('#', ((InterfaceC3588l) abstractC3031l.f6545l).getString(c16400l.f32097l), AbstractC11214l.loadAd(((C15627l) abstractC3031l).f30549l.loadAd()))), null, false, 60);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public void m916l(String str) {
        AbstractC16181l.isPro(AbstractC15467l.yandex.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        AbstractC16181l.isPro(!AbstractC15467l.crashlytics.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f3601l = str;
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public void m917l(C15965l c15965l, C10006l c10006l, C10006l c10006l2, C3299l c3299l) {
        if (c10006l.amazon == 0.0f || c10006l.purchase == 0.0f) {
            return;
        }
        if (c3299l == null && (c3299l = c15965l.vip) == null) {
            c3299l = C3299l.amazon;
        }
        m927l((C16539l) this.f3601l, c15965l);
        if (m955private()) {
            C16539l c16539l = (C16539l) this.f3601l;
            c16539l.billing = c10006l;
            if (!c16539l.yandex.f4632l.booleanValue()) {
                C10006l c10006l3 = ((C16539l) this.f3601l).billing;
                m926l(c10006l3.loadAd, c10006l3.crashlytics, c10006l3.amazon, c10006l3.purchase);
            }
            appmetrica(c15965l, ((C16539l) this.f3601l).billing);
            Canvas canvas = (Canvas) this.f3603l;
            C16539l c16539l2 = (C16539l) this.f3601l;
            if (c10006l2 != null) {
                canvas.concat(applovin(c16539l2.billing, c10006l2, c3299l));
                ((C16539l) this.f3601l).mopub = c15965l.metrica;
            } else {
                C10006l c10006l4 = c16539l2.billing;
                canvas.translate(c10006l4.loadAd, c10006l4.crashlytics);
            }
            boolean zM935l = m935l();
            m947l();
            m939l(c15965l, true);
            if (zM935l) {
                m944l(c15965l.admob);
            }
            m948l(c15965l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c7  */
    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public void m918l(AbstractC3901l abstractC3901l) {
        C15662l c15662l;
        C15662l c15662l2;
        C15662l c15662l3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        C6074l c6074l;
        C6074l c6074l2;
        int i2;
        C6074l c6074l3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        C2071l c2071l = ((C16539l) this.f3601l).yandex;
        String str = c2071l.f4626l;
        if (str == null && c2071l.f4646l == null && c2071l.f4625l == null) {
            return;
        }
        if (str == null) {
            c15662l = null;
        } else {
            AbstractC12707l abstractC12707lIsPro = abstractC3901l.yandex.isPro(str);
            if (abstractC12707lIsPro != null) {
                c15662l = (C15662l) abstractC12707lIsPro;
            } else {
                m889catch("Marker reference '%s' not found", ((C16539l) this.f3601l).yandex.f4626l);
                c15662l = null;
            }
        }
        String str2 = ((C16539l) this.f3601l).yandex.f4646l;
        if (str2 == null) {
            c15662l2 = null;
        } else {
            AbstractC12707l abstractC12707lIsPro2 = abstractC3901l.yandex.isPro(str2);
            if (abstractC12707lIsPro2 != null) {
                c15662l2 = (C15662l) abstractC12707lIsPro2;
            } else {
                m889catch("Marker reference '%s' not found", ((C16539l) this.f3601l).yandex.f4646l);
                c15662l2 = null;
            }
        }
        String str3 = ((C16539l) this.f3601l).yandex.f4625l;
        if (str3 == null) {
            c15662l3 = null;
        } else {
            AbstractC12707l abstractC12707lIsPro3 = abstractC3901l.yandex.isPro(str3);
            if (abstractC12707lIsPro3 != null) {
                c15662l3 = (C15662l) abstractC12707lIsPro3;
            } else {
                m889catch("Marker reference '%s' not found", ((C16539l) this.f3601l).yandex.f4625l);
                c15662l3 = null;
            }
        }
        float f9 = 0.0f;
        if (!(abstractC3901l instanceof C10878l)) {
            if (abstractC3901l instanceof C5474l) {
                C5474l c5474l = (C5474l) abstractC3901l;
                C12671l c12671l = c5474l.metrica;
                float fAmazon = c12671l != null ? c12671l.amazon(this) : 0.0f;
                C12671l c12671l2 = c5474l.startapp;
                float fPurchase = c12671l2 != null ? c12671l2.purchase(this) : 0.0f;
                C12671l c12671l3 = c5474l.adcel;
                float fAmazon2 = c12671l3 != null ? c12671l3.amazon(this) : 0.0f;
                C12671l c12671l4 = c5474l.ads;
                float fPurchase2 = c12671l4 != null ? c12671l4.purchase(this) : 0.0f;
                ArrayList arrayList2 = new ArrayList(2);
                float f10 = fAmazon2 - fAmazon;
                i = 1;
                float f11 = fPurchase2 - fPurchase;
                arrayList2.add(new C6074l(fAmazon, fPurchase, f10, f11));
                arrayList2.add(new C6074l(fAmazon2, fPurchase2, f10, f11));
                f2 = 0.0f;
                arrayList = arrayList2;
            } else {
                i = 1;
                C15075l c15075l = (C15075l) abstractC3901l;
                int length = c15075l.metrica.length;
                if (length < 2) {
                    arrayList = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    float[] fArr = c15075l.metrica;
                    C6074l c6074l4 = new C6074l(fArr[0], fArr[1], 0.0f, 0.0f);
                    int i3 = 2;
                    float f12 = 0.0f;
                    float f13 = 0.0f;
                    while (true) {
                        f = c6074l4.loadAd;
                        f2 = f9;
                        f3 = c6074l4.yandex;
                        if (i3 >= length) {
                            break;
                        }
                        float[] fArr2 = c15075l.metrica;
                        float f14 = fArr2[i3];
                        float f15 = fArr2[i3 + 1];
                        c6074l4.yandex(f14, f15);
                        arrayList3.add(c6074l4);
                        c6074l4 = new C6074l(f14, f15, f14 - f3, f15 - f);
                        i3 += 2;
                        f13 = f15;
                        f12 = f14;
                        f9 = f2;
                    }
                    if (c15075l instanceof C10292l) {
                        float[] fArr3 = c15075l.metrica;
                        float f16 = fArr3[0];
                        if (f12 != f16) {
                            float f17 = fArr3[1];
                            if (f13 != f17) {
                                c6074l4.yandex(f16, f17);
                                arrayList3.add(c6074l4);
                                C6074l c6074l5 = new C6074l(f16, f17, f16 - f3, f17 - f);
                                c6074l5.loadAd((C6074l) arrayList3.get(0));
                                arrayList3.add(c6074l5);
                                arrayList3.set(0, c6074l5);
                            }
                        }
                    } else {
                        arrayList3.add(c6074l4);
                    }
                    arrayList = arrayList3;
                }
            }
            if (arrayList == null && (size = arrayList.size()) != 0) {
                C2071l c2071l2 = ((C16539l) this.f3601l).yandex;
                c2071l2.f4625l = null;
                c2071l2.f4646l = null;
                c2071l2.f4626l = null;
                if (c15662l != null) {
                    m940l(c15662l, (C6074l) arrayList.get(0));
                }
                if (c15662l2 != null && arrayList.size() > 2) {
                    c6074l = (C6074l) arrayList.get(0);
                    c6074l2 = (C6074l) arrayList.get(i);
                    i2 = 1;
                    while (i2 < size - 1) {
                        i2++;
                        c6074l3 = (C6074l) arrayList.get(i2);
                        if (c6074l2.purchase) {
                            f4 = c6074l2.crashlytics;
                            f5 = c6074l2.amazon;
                            f6 = c6074l2.yandex;
                            float f18 = f6 - c6074l.yandex;
                            f7 = c6074l2.loadAd;
                            f8 = ((f7 - c6074l.loadAd) * f5) + (f18 * f4);
                            if (f8 == f2) {
                                f8 = ((c6074l3.yandex - f6) * f4) + ((c6074l3.loadAd - f7) * f5);
                            }
                            if (f8 <= f2 && (f8 != f2 || (f4 <= f2 && f5 < f2))) {
                                c6074l2.crashlytics = -f4;
                                c6074l2.amazon = -f5;
                            }
                        }
                        m940l(c15662l2, c6074l2);
                        c6074l = c6074l2;
                        c6074l2 = c6074l3;
                    }
                }
                if (c15662l3 != null) {
                    m940l(c15662l3, (C6074l) arrayList.get(size - 1));
                }
            }
            return;
        }
        arrayList = new C3863l(this, ((C10878l) abstractC3901l).metrica).yandex;
        i = 1;
        f2 = 0.0f;
        if (arrayList == null) {
            return;
        }
        C2071l c2071l3 = ((C16539l) this.f3601l).yandex;
        c2071l3.f4625l = null;
        c2071l3.f4646l = null;
        c2071l3.f4626l = null;
        if (c15662l != null) {
            m940l(c15662l, (C6074l) arrayList.get(0));
        }
        if (c15662l2 != null) {
            c6074l = (C6074l) arrayList.get(0);
            c6074l2 = (C6074l) arrayList.get(i);
            i2 = 1;
            while (i2 < size - 1) {
                i2++;
                c6074l3 = (C6074l) arrayList.get(i2);
                if (c6074l2.purchase) {
                    f4 = c6074l2.crashlytics;
                    f5 = c6074l2.amazon;
                    f6 = c6074l2.yandex;
                    float f19 = f6 - c6074l.yandex;
                    f7 = c6074l2.loadAd;
                    f8 = ((f7 - c6074l.loadAd) * f5) + (f19 * f4);
                    if (f8 == f2) {
                        f8 = ((c6074l3.yandex - f6) * f4) + ((c6074l3.loadAd - f7) * f5);
                    }
                    if (f8 <= f2) {
                        c6074l2.crashlytics = -f4;
                        c6074l2.amazon = -f5;
                    }
                }
                m940l(c15662l2, c6074l2);
                c6074l = c6074l2;
                c6074l2 = c6074l3;
            }
        }
        if (c15662l3 != null) {
            m940l(c15662l3, (C6074l) arrayList.get(size - 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public void m919l(AbstractC15046l abstractC15046l) {
        C12671l c12671l;
        String str;
        int iIndexOf;
        Set setYandex;
        C12671l c12671l2;
        Boolean bool;
        if (abstractC15046l instanceof InterfaceC2110l) {
            return;
        }
        m931l();
        if ((abstractC15046l instanceof AbstractC12707l) && (bool = ((AbstractC12707l) abstractC15046l).amazon) != null) {
            ((C16539l) this.f3601l).admob = bool.booleanValue();
        }
        if (abstractC15046l instanceof C15965l) {
            C15965l c15965l = (C15965l) abstractC15046l;
            m917l(c15965l, m942l(c15965l.startapp, c15965l.adcel, c15965l.ads, c15965l.subscription), c15965l.metrica, c15965l.vip);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fPurchase = 0.0f;
            if (abstractC15046l instanceof C12573l) {
                C12573l c12573l = (C12573l) abstractC15046l;
                Canvas canvas = (Canvas) this.f3603l;
                C12671l c12671l3 = c12573l.ads;
                if ((c12671l3 == null || !c12671l3.admob()) && ((c12671l2 = c12573l.subscription) == null || !c12671l2.admob())) {
                    m927l((C16539l) this.f3601l, c12573l);
                    if (m955private()) {
                        AbstractC15046l abstractC15046lIsPro = c12573l.yandex.isPro(c12573l.metrica);
                        if (abstractC15046lIsPro == null) {
                            m889catch("Use reference '%s' not found", c12573l.metrica);
                        } else {
                            Matrix matrix = c12573l.vip;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            C12671l c12671l4 = c12573l.startapp;
                            float fAmazon = c12671l4 != null ? c12671l4.amazon(this) : 0.0f;
                            C12671l c12671l5 = c12573l.adcel;
                            canvas.translate(fAmazon, c12671l5 != null ? c12671l5.purchase(this) : 0.0f);
                            appmetrica(c12573l, c12573l.admob);
                            boolean zM935l = m935l();
                            ((Stack) this.f3604l).push(c12573l);
                            ((Stack) this.f3606l).push(((Canvas) this.f3603l).getMatrix());
                            if (abstractC15046lIsPro instanceof C15965l) {
                                C15965l c15965l2 = (C15965l) abstractC15046lIsPro;
                                C10006l c10006lM942l = m942l(null, null, c12573l.ads, c12573l.subscription);
                                m931l();
                                m917l(c15965l2, c10006lM942l, c15965l2.metrica, c15965l2.vip);
                                m941l();
                            } else if (abstractC15046lIsPro instanceof C11316l) {
                                C12671l c12671l6 = c12573l.ads;
                                if (c12671l6 == null) {
                                    c12671l6 = new C12671l(9, 100.0f);
                                }
                                C12671l c12671l7 = c12573l.subscription;
                                if (c12671l7 == null) {
                                    c12671l7 = new C12671l(9, 100.0f);
                                }
                                C10006l c10006lM942l2 = m942l(null, null, c12671l6, c12671l7);
                                m931l();
                                C11316l c11316l = (C11316l) abstractC15046lIsPro;
                                if (c10006lM942l2.amazon != 0.0f && c10006lM942l2.purchase != 0.0f) {
                                    C3299l c3299l = c11316l.vip;
                                    if (c3299l == null) {
                                        c3299l = C3299l.amazon;
                                    }
                                    m927l((C16539l) this.f3601l, c11316l);
                                    C16539l c16539l = (C16539l) this.f3601l;
                                    c16539l.billing = c10006lM942l2;
                                    if (!c16539l.yandex.f4632l.booleanValue()) {
                                        C10006l c10006l = ((C16539l) this.f3601l).billing;
                                        m926l(c10006l.loadAd, c10006l.crashlytics, c10006l.amazon, c10006l.purchase);
                                    }
                                    C10006l c10006l2 = c11316l.metrica;
                                    C16539l c16539l2 = (C16539l) this.f3601l;
                                    if (c10006l2 != null) {
                                        canvas.concat(applovin(c16539l2.billing, c10006l2, c3299l));
                                        ((C16539l) this.f3601l).mopub = c11316l.metrica;
                                    } else {
                                        C10006l c10006l3 = c16539l2.billing;
                                        canvas.translate(c10006l3.loadAd, c10006l3.crashlytics);
                                    }
                                    boolean zM935l2 = m935l();
                                    m939l(c11316l, true);
                                    if (zM935l2) {
                                        m944l(c11316l.admob);
                                    }
                                    m948l(c11316l);
                                }
                                m941l();
                            } else {
                                m919l(abstractC15046lIsPro);
                            }
                            ((Stack) this.f3604l).pop();
                            ((Stack) this.f3606l).pop();
                            if (zM935l) {
                                m944l(c12573l.admob);
                            }
                            m948l(c12573l);
                        }
                    }
                }
            } else if (abstractC15046l instanceof C14957l) {
                C14957l c14957l = (C14957l) abstractC15046l;
                m927l((C16539l) this.f3601l, c14957l);
                if (m955private()) {
                    Matrix matrix2 = c14957l.vip;
                    if (matrix2 != null) {
                        ((Canvas) this.f3603l).concat(matrix2);
                    }
                    appmetrica(c14957l, c14957l.admob);
                    boolean zM935l3 = m935l();
                    String language = Locale.getDefault().getLanguage();
                    for (AbstractC15046l abstractC15046l2 : c14957l.subs) {
                        if (abstractC15046l2 instanceof InterfaceC15969l) {
                            InterfaceC15969l interfaceC15969l = (InterfaceC15969l) abstractC15046l2;
                            if (interfaceC15969l.loadAd() == null && ((setYandex = interfaceC15969l.yandex()) == null || (!setYandex.isEmpty() && setYandex.contains(language)))) {
                                Set setBilling = interfaceC15969l.billing();
                                if (setBilling != null) {
                                    if (f3599l == null) {
                                        synchronized (C1424l.class) {
                                            HashSet hashSet = new HashSet();
                                            f3599l = hashSet;
                                            hashSet.add("Structure");
                                            f3599l.add("BasicStructure");
                                            f3599l.add("ConditionalProcessing");
                                            f3599l.add("Image");
                                            f3599l.add("Style");
                                            f3599l.add("ViewportAttribute");
                                            f3599l.add("Shape");
                                            f3599l.add("BasicText");
                                            f3599l.add("PaintAttribute");
                                            f3599l.add("BasicPaintAttribute");
                                            f3599l.add("OpacityAttribute");
                                            f3599l.add("BasicGraphicsAttribute");
                                            f3599l.add("Marker");
                                            f3599l.add("Gradient");
                                            f3599l.add("Pattern");
                                            f3599l.add("Clip");
                                            f3599l.add("BasicClip");
                                            f3599l.add("Mask");
                                            f3599l.add("View");
                                        }
                                    }
                                    if (setBilling.isEmpty() || !f3599l.containsAll(setBilling)) {
                                    }
                                }
                                Set setSmaato = interfaceC15969l.smaato();
                                if (setSmaato == null) {
                                    Set setRemoteconfig = interfaceC15969l.remoteconfig();
                                    if (setRemoteconfig == null) {
                                        m919l(abstractC15046l2);
                                        break;
                                    }
                                    setRemoteconfig.isEmpty();
                                } else {
                                    setSmaato.isEmpty();
                                }
                            }
                        }
                    }
                    if (zM935l3) {
                        m944l(c14957l.admob);
                    }
                    m948l(c14957l);
                }
            } else if (abstractC15046l instanceof C7471l) {
                C7471l c7471l = (C7471l) abstractC15046l;
                m927l((C16539l) this.f3601l, c7471l);
                if (m955private()) {
                    Matrix matrix3 = c7471l.vip;
                    if (matrix3 != null) {
                        ((Canvas) this.f3603l).concat(matrix3);
                    }
                    appmetrica(c7471l, c7471l.admob);
                    boolean zM935l4 = m935l();
                    m939l(c7471l, true);
                    if (zM935l4) {
                        m944l(c7471l.admob);
                    }
                    m948l(c7471l);
                }
            } else if (abstractC15046l instanceof C7556l) {
                C7556l c7556l = (C7556l) abstractC15046l;
                Canvas canvas2 = (Canvas) this.f3603l;
                C12671l c12671l8 = c7556l.ads;
                if (c12671l8 != null && !c12671l8.admob() && (c12671l = c7556l.subscription) != null && !c12671l.admob() && (str = c7556l.metrica) != null) {
                    C3299l c3299l2 = c7556l.vip;
                    if (c3299l2 == null) {
                        c3299l2 = C3299l.amazon;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        C10006l c10006l4 = new C10006l(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        m927l((C16539l) this.f3601l, c7556l);
                        if (m955private() && m932l()) {
                            Matrix matrix4 = c7556l.tapsense;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            C12671l c12671l9 = c7556l.startapp;
                            float fAmazon2 = c12671l9 != null ? c12671l9.amazon(this) : 0.0f;
                            C12671l c12671l10 = c7556l.adcel;
                            float fPurchase2 = c12671l10 != null ? c12671l10.purchase(this) : 0.0f;
                            float fAmazon3 = c7556l.ads.amazon(this);
                            float fAmazon4 = c7556l.subscription.amazon(this);
                            C16539l c16539l3 = (C16539l) this.f3601l;
                            c16539l3.billing = new C10006l(fAmazon2, fPurchase2, fAmazon3, fAmazon4);
                            if (!c16539l3.yandex.f4632l.booleanValue()) {
                                C10006l c10006l5 = ((C16539l) this.f3601l).billing;
                                m926l(c10006l5.loadAd, c10006l5.crashlytics, c10006l5.amazon, c10006l5.purchase);
                            }
                            c7556l.admob = ((C16539l) this.f3601l).billing;
                            m948l(c7556l);
                            appmetrica(c7556l, c7556l.admob);
                            boolean zM935l5 = m935l();
                            m947l();
                            canvas2.save();
                            canvas2.concat(applovin(((C16539l) this.f3601l).billing, c10006l4, c3299l2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((C16539l) this.f3601l).yandex.f4611l != 3 ? 2 : 0));
                            canvas2.restore();
                            if (zM935l5) {
                                m944l(c7556l.admob);
                            }
                        }
                    }
                }
            } else if (abstractC15046l instanceof C10878l) {
                C10878l c10878l = (C10878l) abstractC15046l;
                if (c10878l.metrica != null) {
                    m927l((C16539l) this.f3601l, c10878l);
                    if (m955private() && m932l()) {
                        C16539l c16539l4 = (C16539l) this.f3601l;
                        if (c16539l4.crashlytics || c16539l4.loadAd) {
                            Matrix matrix5 = c10878l.vip;
                            if (matrix5 != null) {
                                ((Canvas) this.f3603l).concat(matrix5);
                            }
                            Path path = new C16009l(c10878l.metrica).yandex;
                            if (c10878l.admob == null) {
                                c10878l.admob = signatures(path);
                            }
                            m948l(c10878l);
                            inmobi(c10878l);
                            appmetrica(c10878l, c10878l.admob);
                            boolean zM935l6 = m935l();
                            C16539l c16539l5 = (C16539l) this.f3601l;
                            if (c16539l5.loadAd) {
                                int i = c16539l5.yandex.f4645l;
                                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                m907extends(c10878l, path);
                            }
                            if (((C16539l) this.f3601l).crashlytics) {
                                m910for(path);
                            }
                            m918l(c10878l);
                            if (zM935l6) {
                                m944l(c10878l.admob);
                            }
                        }
                    }
                }
            } else if (abstractC15046l instanceof C0096l) {
                C0096l c0096l = (C0096l) abstractC15046l;
                C12671l c12671l11 = c0096l.adcel;
                if (c12671l11 != null && c0096l.ads != null && !c12671l11.admob() && !c0096l.ads.admob()) {
                    m927l((C16539l) this.f3601l, c0096l);
                    if (m955private() && m932l()) {
                        Matrix matrix6 = c0096l.vip;
                        if (matrix6 != null) {
                            ((Canvas) this.f3603l).concat(matrix6);
                        }
                        Path pathM949l = m949l(c0096l);
                        m948l(c0096l);
                        inmobi(c0096l);
                        appmetrica(c0096l, c0096l.admob);
                        boolean zM935l7 = m935l();
                        if (((C16539l) this.f3601l).loadAd) {
                            m907extends(c0096l, pathM949l);
                        }
                        if (((C16539l) this.f3601l).crashlytics) {
                            m910for(pathM949l);
                        }
                        if (zM935l7) {
                            m944l(c0096l.admob);
                        }
                    }
                }
            } else if (abstractC15046l instanceof C5540l) {
                C5540l c5540l = (C5540l) abstractC15046l;
                C12671l c12671l12 = c5540l.adcel;
                if (c12671l12 != null && !c12671l12.admob()) {
                    m927l((C16539l) this.f3601l, c5540l);
                    if (m955private() && m932l()) {
                        Matrix matrix7 = c5540l.vip;
                        if (matrix7 != null) {
                            ((Canvas) this.f3603l).concat(matrix7);
                        }
                        Path pathM957return = m957return(c5540l);
                        m948l(c5540l);
                        inmobi(c5540l);
                        appmetrica(c5540l, c5540l.admob);
                        boolean zM935l8 = m935l();
                        if (((C16539l) this.f3601l).loadAd) {
                            m907extends(c5540l, pathM957return);
                        }
                        if (((C16539l) this.f3601l).crashlytics) {
                            m910for(pathM957return);
                        }
                        if (zM935l8) {
                            m944l(c5540l.admob);
                        }
                    }
                }
            } else if (abstractC15046l instanceof C13233l) {
                C13233l c13233l = (C13233l) abstractC15046l;
                C12671l c12671l13 = c13233l.adcel;
                if (c12671l13 != null && c13233l.ads != null && !c12671l13.admob() && !c13233l.ads.admob()) {
                    m927l((C16539l) this.f3601l, c13233l);
                    if (m955private() && m932l()) {
                        Matrix matrix8 = c13233l.vip;
                        if (matrix8 != null) {
                            ((Canvas) this.f3603l).concat(matrix8);
                        }
                        Path pathM951l = m951l(c13233l);
                        m948l(c13233l);
                        inmobi(c13233l);
                        appmetrica(c13233l, c13233l.admob);
                        boolean zM935l9 = m935l();
                        if (((C16539l) this.f3601l).loadAd) {
                            m907extends(c13233l, pathM951l);
                        }
                        if (((C16539l) this.f3601l).crashlytics) {
                            m910for(pathM951l);
                        }
                        if (zM935l9) {
                            m944l(c13233l.admob);
                        }
                    }
                }
            } else if (abstractC15046l instanceof C5474l) {
                C5474l c5474l = (C5474l) abstractC15046l;
                m927l((C16539l) this.f3601l, c5474l);
                if (m955private() && m932l() && ((C16539l) this.f3601l).crashlytics) {
                    Matrix matrix9 = c5474l.vip;
                    if (matrix9 != null) {
                        ((Canvas) this.f3603l).concat(matrix9);
                    }
                    C12671l c12671l14 = c5474l.metrica;
                    float fAmazon5 = c12671l14 == null ? 0.0f : c12671l14.amazon(this);
                    C12671l c12671l15 = c5474l.startapp;
                    float fPurchase3 = c12671l15 == null ? 0.0f : c12671l15.purchase(this);
                    C12671l c12671l16 = c5474l.adcel;
                    float fAmazon6 = c12671l16 == null ? 0.0f : c12671l16.amazon(this);
                    C12671l c12671l17 = c5474l.ads;
                    fPurchase = c12671l17 != null ? c12671l17.purchase(this) : 0.0f;
                    if (c5474l.admob == null) {
                        c5474l.admob = new C10006l(Math.min(fAmazon5, fAmazon6), Math.min(fPurchase3, fPurchase), Math.abs(fAmazon6 - fAmazon5), Math.abs(fPurchase - fPurchase3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fAmazon5, fPurchase3);
                    path2.lineTo(fAmazon6, fPurchase);
                    m948l(c5474l);
                    inmobi(c5474l);
                    appmetrica(c5474l, c5474l.admob);
                    boolean zM935l10 = m935l();
                    m910for(path2);
                    m918l(c5474l);
                    if (zM935l10) {
                        m944l(c5474l.admob);
                    }
                }
            } else if (abstractC15046l instanceof C10292l) {
                C10292l c10292l = (C10292l) abstractC15046l;
                m927l((C16539l) this.f3601l, c10292l);
                if (m955private() && m932l()) {
                    C16539l c16539l6 = (C16539l) this.f3601l;
                    if (c16539l6.crashlytics || c16539l6.loadAd) {
                        Matrix matrix10 = c10292l.vip;
                        if (matrix10 != null) {
                            ((Canvas) this.f3603l).concat(matrix10);
                        }
                        if (c10292l.metrica.length >= 2) {
                            Path pathM895l = m895l(c10292l);
                            m948l(c10292l);
                            inmobi(c10292l);
                            appmetrica(c10292l, c10292l.admob);
                            boolean zM935l11 = m935l();
                            if (((C16539l) this.f3601l).loadAd) {
                                m907extends(c10292l, pathM895l);
                            }
                            if (((C16539l) this.f3601l).crashlytics) {
                                m910for(pathM895l);
                            }
                            m918l(c10292l);
                            if (zM935l11) {
                                m944l(c10292l.admob);
                            }
                        }
                    }
                }
            } else if (abstractC15046l instanceof C15075l) {
                C15075l c15075l = (C15075l) abstractC15046l;
                m927l((C16539l) this.f3601l, c15075l);
                if (m955private() && m932l()) {
                    C16539l c16539l7 = (C16539l) this.f3601l;
                    if (c16539l7.crashlytics || c16539l7.loadAd) {
                        Matrix matrix11 = c15075l.vip;
                        if (matrix11 != null) {
                            ((Canvas) this.f3603l).concat(matrix11);
                        }
                        if (c15075l.metrica.length >= 2) {
                            Path pathM895l2 = m895l(c15075l);
                            m948l(c15075l);
                            int i2 = ((C16539l) this.f3601l).yandex.f4645l;
                            pathM895l2.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            inmobi(c15075l);
                            appmetrica(c15075l, c15075l.admob);
                            boolean zM935l12 = m935l();
                            if (((C16539l) this.f3601l).loadAd) {
                                m907extends(c15075l, pathM895l2);
                            }
                            if (((C16539l) this.f3601l).crashlytics) {
                                m910for(pathM895l2);
                            }
                            m918l(c15075l);
                            if (zM935l12) {
                                m944l(c15075l.admob);
                            }
                        }
                    }
                }
            } else if (abstractC15046l instanceof C15298l) {
                C15298l c15298l = (C15298l) abstractC15046l;
                m927l((C16539l) this.f3601l, c15298l);
                if (m955private()) {
                    Matrix matrix12 = c15298l.ads;
                    if (matrix12 != null) {
                        ((Canvas) this.f3603l).concat(matrix12);
                    }
                    ArrayList arrayList = c15298l.vip;
                    float fAmazon7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C12671l) c15298l.vip.get(0)).amazon(this);
                    ArrayList arrayList2 = c15298l.metrica;
                    float fPurchase4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C12671l) c15298l.metrica.get(0)).purchase(this);
                    ArrayList arrayList3 = c15298l.startapp;
                    float fAmazon8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C12671l) c15298l.startapp.get(0)).amazon(this);
                    ArrayList arrayList4 = c15298l.adcel;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fPurchase = ((C12671l) c15298l.adcel.get(0)).purchase(this);
                    }
                    int iM913import = m913import();
                    if (iM913import != 1) {
                        float fPremium = premium(c15298l);
                        if (iM913import == 2) {
                            fPremium /= 2.0f;
                        }
                        fAmazon7 -= fPremium;
                    }
                    if (c15298l.admob == null) {
                        C5855l c5855l = new C5855l(this, fAmazon7, fPurchase4);
                        m961throw(c15298l, c5855l);
                        RectF rectF = (RectF) c5855l.purchase;
                        c15298l.admob = new C10006l(rectF.left, rectF.top, rectF.width(), ((RectF) c5855l.purchase).height());
                    }
                    m948l(c15298l);
                    inmobi(c15298l);
                    appmetrica(c15298l, c15298l.admob);
                    boolean zM935l13 = m935l();
                    m961throw(c15298l, new C12005l(this, fAmazon7 + fAmazon8, fPurchase4 + fPurchase));
                    if (zM935l13) {
                        m944l(c15298l.admob);
                    }
                }
            }
        }
        m941l();
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public C3823l m920l(String str, String str2, Bundle bundle) {
        int i;
        try {
            m937l(str, str2, bundle);
            C14302l c14302l = (C14302l) this.f3601l;
            ExecutorC12908l executorC12908l = ExecutorC12908l.f25368l;
            C5601l c5601l = c14302l.crashlytics;
            if (c5601l.firebase() < 12000000) {
                return c5601l.vip() != 0 ? c14302l.yandex(bundle).admob(executorC12908l, new C0848l(c14302l, bundle, 15)) : AbstractC4311l.billing(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C17219l c17219lM4278new = C17219l.m4278new(c14302l.loadAd);
            synchronized (c17219lM4278new) {
                i = c17219lM4278new.f33424l;
                c17219lM4278new.f33424l = i + 1;
            }
            return c17219lM4278new.m4287goto(new C7075l(i, 1, bundle, 1)).mopub(executorC12908l, C14823l.f29015l);
        } catch (InterruptedException | ExecutionException e) {
            return AbstractC4311l.billing(e);
        }
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public Path m921l(AbstractC11678l abstractC11678l, boolean z) {
        Path path;
        Path pathM921l;
        Path pathIsVip;
        ((Stack) this.f3605l).push((C16539l) this.f3601l);
        C16539l c16539l = new C16539l((C16539l) this.f3601l);
        this.f3601l = c16539l;
        m927l(c16539l, abstractC11678l);
        if (!m955private() || !m932l()) {
            this.f3601l = (C16539l) ((Stack) this.f3605l).pop();
            return null;
        }
        if (abstractC11678l instanceof C12573l) {
            if (!z) {
                m889catch("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C12573l c12573l = (C12573l) abstractC11678l;
            AbstractC12707l abstractC12707lIsPro = abstractC11678l.yandex.isPro(c12573l.metrica);
            if (abstractC12707lIsPro == null) {
                m889catch("Use reference '%s' not found", c12573l.metrica);
                this.f3601l = (C16539l) ((Stack) this.f3605l).pop();
                return null;
            }
            if (!(abstractC12707lIsPro instanceof AbstractC11678l)) {
                this.f3601l = (C16539l) ((Stack) this.f3605l).pop();
                return null;
            }
            pathM921l = m921l((AbstractC11678l) abstractC12707lIsPro, false);
            if (pathM921l != null) {
                if (c12573l.admob == null) {
                    c12573l.admob = signatures(pathM921l);
                }
                Matrix matrix = c12573l.vip;
                if (matrix != null) {
                    pathM921l.transform(matrix);
                }
                if (((C16539l) this.f3601l).yandex.f4622l != null && (pathIsVip = isVip(abstractC11678l, abstractC11678l.admob)) != null) {
                    pathM921l.op(pathIsVip, Path.Op.INTERSECT);
                }
                this.f3601l = (C16539l) ((Stack) this.f3605l).pop();
                return pathM921l;
            }
            return null;
        }
        if (abstractC11678l instanceof AbstractC3901l) {
            AbstractC3901l abstractC3901l = (AbstractC3901l) abstractC11678l;
            if (abstractC11678l instanceof C10878l) {
                C16009l c16009l = new C16009l(((C10878l) abstractC11678l).metrica);
                C10006l c10006l = abstractC11678l.admob;
                Path path2 = c16009l.yandex;
                if (c10006l == null) {
                    abstractC11678l.admob = signatures(path2);
                }
                path = path2;
            } else if (abstractC11678l instanceof C0096l) {
                path = m949l((C0096l) abstractC11678l);
            } else if (abstractC11678l instanceof C5540l) {
                path = m957return((C5540l) abstractC11678l);
            } else if (abstractC11678l instanceof C13233l) {
                path = m951l((C13233l) abstractC11678l);
            } else {
                path = abstractC11678l instanceof C15075l ? m895l((C15075l) abstractC11678l) : null;
            }
            if (path != null) {
                if (abstractC3901l.admob == null) {
                    abstractC3901l.admob = signatures(path);
                }
                Matrix matrix2 = abstractC3901l.vip;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((C16539l) this.f3601l).yandex.f4637l;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(abstractC11678l instanceof C15298l)) {
            m889catch("Invalid %s element found in clipPath definition", abstractC11678l.vip());
            return null;
        }
        C15298l c15298l = (C15298l) abstractC11678l;
        ArrayList arrayList = c15298l.vip;
        float fPurchase = 0.0f;
        float fAmazon = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C12671l) c15298l.vip.get(0)).amazon(this);
        ArrayList arrayList2 = c15298l.metrica;
        float fPurchase2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C12671l) c15298l.metrica.get(0)).purchase(this);
        ArrayList arrayList3 = c15298l.startapp;
        float fAmazon2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C12671l) c15298l.startapp.get(0)).amazon(this);
        ArrayList arrayList4 = c15298l.adcel;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fPurchase = ((C12671l) c15298l.adcel.get(0)).purchase(this);
        }
        if (((C16539l) this.f3601l).yandex.f4631l != 1) {
            float fPremium = premium(c15298l);
            if (((C16539l) this.f3601l).yandex.f4631l == 2) {
                fPremium /= 2.0f;
            }
            fAmazon -= fPremium;
        }
        if (c15298l.admob == null) {
            C5855l c5855l = new C5855l(this, fAmazon, fPurchase2);
            m961throw(c15298l, c5855l);
            Object obj = c5855l.purchase;
            RectF rectF = (RectF) obj;
            c15298l.admob = new C10006l(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
        }
        path = new Path();
        m961throw(c15298l, new C5855l(this, fAmazon + fAmazon2, fPurchase2 + fPurchase, path));
        Matrix matrix3 = c15298l.ads;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        int i2 = ((C16539l) this.f3601l).yandex.f4637l;
        path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        pathM921l = path;
        if (((C16539l) this.f3601l).yandex.f4622l != null) {
            pathM921l.op(pathIsVip, Path.Op.INTERSECT);
        }
        this.f3601l = (C16539l) ((Stack) this.f3605l).pop();
        return pathM921l;
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public void m922l(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f3605l;
        HashMap map = (HashMap) this.f3603l;
        C1013l c1013l = (C1013l) map.get(str);
        if (c1013l != null && c1013l.crashlytics.isEmpty() && c1013l.amazon.isEmpty()) {
            map.remove(str);
            int i = c1013l.yandex;
            boolean z = sparseBooleanArray.get(i);
            ((InterfaceC13158l) this.f3604l).startapp(c1013l, z);
            SparseArray sparseArray = (SparseArray) this.f3602l;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.f3601l).put(i, true);
            }
        }
    }

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public String m923l(String str, boolean z, boolean z2) {
        if (((C16539l) this.f3601l).admob) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public void m924l() {
        ((InterfaceC13158l) this.f3604l).isVip((HashMap) this.f3603l);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f3601l;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.f3602l).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.f3605l).clear();
    }

    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public void m925l(AbstractC10759l abstractC10759l) {
        AbstractC1186l abstractC1186l;
        C13698l c13698lYandex = AbstractC13675l.yandex();
        if (((AbstractC1186l) this.f3602l).isEmpty()) {
            license(c13698lYandex, (C5019l) this.f3604l, abstractC10759l);
            if (!Objects.equals((C5019l) this.f3606l, (C5019l) this.f3604l)) {
                license(c13698lYandex, (C5019l) this.f3606l, abstractC10759l);
            }
            if (!Objects.equals((C5019l) this.f3605l, (C5019l) this.f3604l) && !Objects.equals((C5019l) this.f3605l, (C5019l) this.f3606l)) {
                license(c13698lYandex, (C5019l) this.f3605l, abstractC10759l);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((AbstractC1186l) this.f3602l).size();
                abstractC1186l = (AbstractC1186l) this.f3602l;
                if (i >= size) {
                    break;
                }
                license(c13698lYandex, (C5019l) abstractC1186l.get(i), abstractC10759l);
                i++;
            }
            if (!abstractC1186l.contains((C5019l) this.f3605l)) {
                license(c13698lYandex, (C5019l) this.f3605l, abstractC10759l);
            }
        }
        this.f3601l = c13698lYandex.metrica(true);
    }

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public void m926l(float f, float f2, float f3, float f4) {
        float fAmazon = f3 + f;
        float fPurchase = f4 + f2;
        C12014l c12014l = ((C16539l) this.f3601l).yandex.f4620l;
        if (c12014l != null) {
            f += ((C12671l) c12014l.f23943l).amazon(this);
            f2 += ((C12671l) ((C16539l) this.f3601l).yandex.f4620l.f23941l).purchase(this);
            fAmazon -= ((C12671l) ((C16539l) this.f3601l).yandex.f4620l.f23940l).amazon(this);
            fPurchase -= ((C12671l) ((C16539l) this.f3601l).yandex.f4620l.f23944l).purchase(this);
        }
        ((Canvas) this.f3603l).clipRect(f, f2, fAmazon, fPurchase);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public void m927l(C16539l c16539l, AbstractC12707l abstractC12707l) {
        boolean z = abstractC12707l.loadAd == null;
        C2071l c2071l = c16539l.yandex;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        c2071l.f4617l = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c2071l.f4632l = bool;
        c2071l.f4620l = null;
        c2071l.f4622l = null;
        c2071l.f4630l = fValueOf;
        c2071l.f4612l = C13555l.f26573l;
        c2071l.f4647l = fValueOf;
        c2071l.f4629l = null;
        c2071l.f4636l = null;
        c2071l.f4610l = fValueOf;
        c2071l.f4628l = null;
        c2071l.f4635l = fValueOf;
        c2071l.f4619l = 1;
        C2071l c2071l2 = abstractC12707l.purchase;
        if (c2071l2 != null) {
            m946l(c16539l, c2071l2);
        }
        ArrayList arrayList = ((C3927l) ((C4816l) this.f3602l).f9859l).loadAd;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (C0398l c0398l : ((C3927l) ((C4816l) this.f3602l).f9859l).loadAd) {
                if (appmetrica.m153for(c0398l.yandex, abstractC12707l)) {
                    m946l(c16539l, c0398l.loadAd);
                }
            }
        }
        C2071l c2071l3 = abstractC12707l.billing;
        if (c2071l3 != null) {
            m946l(c16539l, c2071l3);
        }
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public void m928l(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f3602l = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public void m929l(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f3601l = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public void m930l(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f3605l = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public void m931l() {
        ((Canvas) this.f3603l).save();
        ((Stack) this.f3605l).push((C16539l) this.f3601l);
        this.f3601l = new C16539l((C16539l) this.f3601l);
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public boolean m932l() {
        Boolean bool = ((C16539l) this.f3601l).yandex.f4616l;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public void m933l(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f3603l = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public void m934l(C6250l c6250l, C10006l c10006l) {
        float fAmazon;
        float fPurchase;
        Canvas canvas = (Canvas) this.f3603l;
        Boolean bool = c6250l.vip;
        if (bool == null || !bool.booleanValue()) {
            C12671l c12671l = c6250l.startapp;
            float fLoadAd = c12671l != null ? c12671l.loadAd(this, 1.0f) : 1.2f;
            C12671l c12671l2 = c6250l.adcel;
            float fLoadAd2 = c12671l2 != null ? c12671l2.loadAd(this, 1.0f) : 1.2f;
            fAmazon = fLoadAd * c10006l.amazon;
            fPurchase = fLoadAd2 * c10006l.purchase;
        } else {
            C12671l c12671l3 = c6250l.startapp;
            fAmazon = c12671l3 != null ? c12671l3.amazon(this) : c10006l.amazon;
            C12671l c12671l4 = c6250l.adcel;
            fPurchase = c12671l4 != null ? c12671l4.purchase(this) : c10006l.purchase;
        }
        if (fAmazon == 0.0f || fPurchase == 0.0f) {
            return;
        }
        m931l();
        C16539l c16539lM908final = m908final(c6250l);
        this.f3601l = c16539lM908final;
        c16539lM908final.yandex.f4630l = Float.valueOf(1.0f);
        boolean zM935l = m935l();
        canvas.save();
        Boolean bool2 = c6250l.metrica;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c10006l.loadAd, c10006l.crashlytics);
            canvas.scale(c10006l.amazon, c10006l.purchase);
        }
        m939l(c6250l, false);
        canvas.restore();
        if (zM935l) {
            m944l(c10006l);
        }
        m941l();
    }

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public boolean m935l() {
        AbstractC12707l abstractC12707lIsPro;
        if (((C16539l) this.f3601l).yandex.f4630l.floatValue() >= 1.0f && ((C16539l) this.f3601l).yandex.f4629l == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.f3603l;
        int iFloatValue = (int) (((C16539l) this.f3601l).yandex.f4630l.floatValue() * 256.0f);
        if (iFloatValue < 0) {
            iFloatValue = 0;
        } else if (iFloatValue > 255) {
            iFloatValue = 255;
        }
        canvas.saveLayerAlpha(null, iFloatValue, 31);
        ((Stack) this.f3605l).push((C16539l) this.f3601l);
        C16539l c16539l = new C16539l((C16539l) this.f3601l);
        this.f3601l = c16539l;
        String str = c16539l.yandex.f4629l;
        if (str != null && ((abstractC12707lIsPro = ((C4816l) this.f3602l).isPro(str)) == null || !(abstractC12707lIsPro instanceof C6250l))) {
            m889catch("Mask reference '%s' not found", ((C16539l) this.f3601l).yandex.f4629l);
            ((C16539l) this.f3601l).yandex.f4629l = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public void m936l() {
        try {
            AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
            Object obj = AbstractC16844l.yandex;
            C15900l c15900lPurchase = null;
            InterfaceC12058l interfaceC12058l = obj != null ? (InterfaceC12058l) obj : null;
            Context contextLoadAd = interfaceC12058l != null ? interfaceC12058l.loadAd() : null;
            AssetManager assets = contextLoadAd != null ? contextLoadAd.getAssets() : null;
            if (assets != null) {
                c15900lPurchase = AbstractC7709l.purchase(assets.open((String) this.f3606l));
            } else if (Build.FINGERPRINT == null) {
                C18262l.metrica("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            } else {
                C18262l.metrica("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            }
            C1503l c1503l = new C1503l(c15900lPurchase);
            try {
                C3844l c3844lPremium = c1503l.premium(c1503l.readInt());
                C3844l c3844lPremium2 = c1503l.premium(c1503l.readInt());
                Unit unit = Unit.INSTANCE;
                c1503l.close();
                synchronized (this) {
                    this.f3601l = c3844lPremium;
                    this.f3605l = c3844lPremium2;
                }
                ((CountDownLatch) this.f3602l).countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(c1503l, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ((CountDownLatch) this.f3602l).countDown();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public void m937l(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        int iYandex;
        PackageInfo packageInfoBilling;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C14184l c14184l = (C14184l) this.f3603l;
        c14184l.yandex();
        bundle.putString("gmp_app_id", c14184l.crashlytics.loadAd);
        C1577l c1577l = (C1577l) this.f3602l;
        synchronized (c1577l) {
            try {
                if (c1577l.f3898l == 0 && (packageInfoBilling = c1577l.billing("com.google.android.gms")) != null) {
                    c1577l.f3898l = packageInfoBilling.versionCode;
                }
                i = c1577l.f3898l;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C1577l) this.f3602l).crashlytics());
        bundle.putString("app_ver_name", ((C1577l) this.f3602l).amazon());
        C14184l c14184l2 = (C14184l) this.f3603l;
        c14184l2.yandex();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(c14184l2.loadAd.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((C5204l) AbstractC4311l.crashlytics(((C17059l) ((InterfaceC6095l) this.f3606l)).purchase())).yandex;
            if (TextUtils.isEmpty(str3)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) AbstractC4311l.crashlytics(((C17059l) ((InterfaceC6095l) this.f3606l)).amazon()));
        bundle.putString("cliv", "fcm-25.0.1");
        InterfaceC15251l interfaceC15251l = (InterfaceC15251l) ((InterfaceC15189l) this.f3604l).get();
        C8404l c8404l = (C8404l) ((InterfaceC15189l) this.f3605l).get();
        if (interfaceC15251l == null || c8404l == null || (iYandex = ((C2762l) interfaceC15251l).yandex()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC5020l.inmobi(iYandex)));
        bundle.putString("Firebase-Client", c8404l.yandex());
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public void m938l(AbstractC3302l abstractC3302l) throws GeneralSecurityException {
        if (!C5416l.mopub.contains(abstractC3302l)) {
            throw new GeneralSecurityException(AbstractC15560l.Signature("Invalid DEM parameters ", String.valueOf(abstractC3302l), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
        }
        this.f3605l = abstractC3302l;
    }

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public void m939l(AbstractC11837l abstractC11837l, boolean z) {
        if (z) {
            ((Stack) this.f3604l).push(abstractC11837l);
            ((Stack) this.f3606l).push(((Canvas) this.f3603l).getMatrix());
        }
        Iterator it = abstractC11837l.subs.iterator();
        while (it.hasNext()) {
            m919l((AbstractC15046l) it.next());
        }
        if (z) {
            ((Stack) this.f3604l).pop();
            ((Stack) this.f3606l).pop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public void m940l(C15662l c15662l, C6074l c6074l) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        Canvas canvas = (Canvas) this.f3603l;
        m931l();
        Float f4 = c15662l.Signature;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = c6074l.crashlytics;
            if (f6 == 0.0f && c6074l.amazon == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(c6074l.amazon, f6));
            }
        } else {
            fFloatValue = c15662l.Signature.floatValue();
        }
        float fCrashlytics = c15662l.startapp ? 1.0f : ((C16539l) this.f3601l).yandex.f4641l.crashlytics();
        this.f3601l = m908final(c15662l);
        Matrix matrix = new Matrix();
        matrix.preTranslate(c6074l.yandex, c6074l.loadAd);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fCrashlytics, fCrashlytics);
        C12671l c12671l = c15662l.adcel;
        float fAmazon = c12671l != null ? c12671l.amazon(this) : 0.0f;
        C12671l c12671l2 = c15662l.ads;
        float fPurchase = c12671l2 != null ? c12671l2.purchase(this) : 0.0f;
        C12671l c12671l3 = c15662l.subscription;
        float fAmazon2 = c12671l3 != null ? c12671l3.amazon(this) : 3.0f;
        C12671l c12671l4 = c15662l.tapsense;
        float fPurchase2 = c12671l4 != null ? c12671l4.purchase(this) : 3.0f;
        C10006l c10006l = c15662l.metrica;
        if (c10006l != null) {
            float fMax = fAmazon2 / c10006l.amazon;
            float f7 = fPurchase2 / c10006l.purchase;
            C3299l c3299l = c15662l.vip;
            if (c3299l == null) {
                c3299l = C3299l.amazon;
            }
            boolean zEquals = c3299l.equals(C3299l.crashlytics);
            EnumC14937l enumC14937l = c3299l.yandex;
            if (!zEquals) {
                fMax = c3299l.loadAd == 2 ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fAmazon) * fMax, (-fPurchase) * f7);
            canvas.concat(matrix);
            C10006l c10006l2 = c15662l.metrica;
            float f8 = c10006l2.amazon * fMax;
            float f9 = c10006l2.purchase * f7;
            int iOrdinal = enumC14937l.ordinal();
            if (iOrdinal == 2) {
                f = (fAmazon2 - f8) / 2.0f;
                f2 = 0.0f - f;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f2 = 0.0f;
                                }
                            }
                        }
                    }
                    f = (fAmazon2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                }
                f = fAmazon2 - f8;
                f2 = 0.0f - f;
            }
            switch (enumC14937l.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f3 = (fPurchase2 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                    if (!((C16539l) this.f3601l).yandex.f4632l.booleanValue()) {
                        m926l(f2, f5, fAmazon2, fPurchase2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f3 = fPurchase2 - f9;
                    f5 = 0.0f - f3;
                    if (!((C16539l) this.f3601l).yandex.f4632l.booleanValue()) {
                        m926l(f2, f5, fAmazon2, fPurchase2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((C16539l) this.f3601l).yandex.f4632l.booleanValue()) {
                        m926l(f2, f5, fAmazon2, fPurchase2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fAmazon, -fPurchase);
            canvas.concat(matrix);
            if (!((C16539l) this.f3601l).yandex.f4632l.booleanValue()) {
                m926l(0.0f, 0.0f, fAmazon2, fPurchase2);
            }
        }
        boolean zM935l = m935l();
        m939l(c15662l, false);
        if (zM935l) {
            m944l(c15662l.admob);
        }
        m941l();
    }

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public void m941l() {
        ((Canvas) this.f3603l).restore();
        this.f3601l = (C16539l) ((Stack) this.f3605l).pop();
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public C10006l m942l(C12671l c12671l, C12671l c12671l2, C12671l c12671l3, C12671l c12671l4) {
        float fAmazon = c12671l != null ? c12671l.amazon(this) : 0.0f;
        float fPurchase = c12671l2 != null ? c12671l2.purchase(this) : 0.0f;
        C16539l c16539l = (C16539l) this.f3601l;
        C10006l c10006l = c16539l.mopub;
        if (c10006l == null) {
            c10006l = c16539l.billing;
        }
        return new C10006l(fAmazon, fPurchase, c12671l3 != null ? c12671l3.amazon(this) : c10006l.amazon, c12671l4 != null ? c12671l4.purchase(this) : c10006l.purchase);
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public Uri m943l() {
        String strAd;
        String str = (String) this.f3602l;
        String str2 = (String) this.f3601l;
        Account account = AbstractC17151l.yandex;
        Account account2 = (Account) this.f3605l;
        AbstractC16181l.isPro(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        AbstractC16181l.isPro(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        AbstractC16181l.isPro(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (AbstractC17151l.yandex.equals(account2)) {
            strAd = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strAd = AbstractC9361l.ad(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f3604l;
        StringBuilder sb = new StringBuilder(strAd.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        AbstractC9361l.appmetrica(sb, "/", str, "/", str2);
        String strAdvert = AbstractC9361l.advert(sb, "/", strAd, "/", str5);
        C13708l c13708lMopub = ((C16971l) this.f3606l).mopub();
        Pattern pattern = AbstractC3260l.yandex;
        return new Uri.Builder().scheme("android").authority((String) this.f3603l).path(strAdvert).encodedFragment(c13708lMopub.isEmpty() ? null : "transform=".concat(new C1693l("+").billing(c13708lMopub))).build();
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public void m944l(C10006l c10006l) {
        Canvas canvas = (Canvas) this.f3603l;
        if (((C16539l) this.f3601l).yandex.f4629l != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C6250l c6250l = (C6250l) ((C4816l) this.f3602l).isPro(((C16539l) this.f3601l).yandex.f4629l);
            m934l(c6250l, c10006l);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            m934l(c6250l, c10006l);
            canvas.restore();
            canvas.restore();
        }
        m941l();
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public AbstractC2722l m945l(int i) {
        EnumC1535l enumC1535l;
        AtomicLong atomicLong = (AtomicLong) this.f3602l;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            C9674l c9674l = C9674l.f19753l;
            return c9674l != null ? c9674l : new C9674l();
        }
        C6730l c6730l = new C6730l(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f3601l;
            C6730l c6730l2 = (C6730l) atomicReference.get();
            if (c6730l2 != null && c6730l2.f14089l > i) {
                C9674l c9674l2 = C9674l.f19753l;
                return c9674l2 != null ? c9674l2 : new C9674l();
            }
            do {
                if (atomicReference.compareAndSet(c6730l2, c6730l)) {
                    if (((int) (atomicLong.get() >>> 32)) > i) {
                        c6730l.cancel(true);
                        while (!atomicReference.compareAndSet(c6730l, null) && atomicReference.get() == c6730l) {
                        }
                        return c6730l;
                    }
                    RunnableC16301l runnableC16301l = (RunnableC16301l) this.f3603l;
                    InterfaceC9526l interfaceC9526l = (InterfaceC9526l) runnableC16301l.f31893l;
                    if (interfaceC9526l == null || (enumC1535l = (EnumC1535l) runnableC16301l.f31892l) == null) {
                        c6730l.vip((C1090l) this.f3606l);
                        return c6730l;
                    }
                    C17516l c17516lYandex = AbstractC6854l.yandex(interfaceC9526l);
                    RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l();
                    runnableFutureC13286l.f26066l = new C16753l(runnableFutureC13286l, c17516lYandex);
                    enumC1535l.execute(runnableFutureC13286l);
                    c6730l.vip(runnableFutureC13286l);
                    return c6730l;
                }
            } while (atomicReference.get() == c6730l2);
        }
    }

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public void m946l(C16539l c16539l, C2071l c2071l) {
        if (m902transient(c2071l, 4096L)) {
            c16539l.yandex.f4642l = c2071l.f4642l;
        }
        if (m902transient(c2071l, 2048L)) {
            c16539l.yandex.f4630l = c2071l.f4630l;
        }
        boolean zM902transient = m902transient(c2071l, 1L);
        C13555l c13555l = C13555l.f26572l;
        if (zM902transient) {
            c16539l.yandex.f4623l = c2071l.f4623l;
            AbstractC18728l abstractC18728l = c2071l.f4623l;
            c16539l.loadAd = (abstractC18728l == null || abstractC18728l == c13555l) ? false : true;
        }
        if (m902transient(c2071l, 4L)) {
            c16539l.yandex.f4614l = c2071l.f4614l;
        }
        if (m902transient(c2071l, 6149L)) {
            m893l(c16539l, true, c16539l.yandex.f4623l);
        }
        if (m902transient(c2071l, 2L)) {
            c16539l.yandex.f4645l = c2071l.f4645l;
        }
        if (m902transient(c2071l, 8L)) {
            c16539l.yandex.f4634l = c2071l.f4634l;
            AbstractC18728l abstractC18728l2 = c2071l.f4634l;
            c16539l.crashlytics = (abstractC18728l2 == null || abstractC18728l2 == c13555l) ? false : true;
        }
        if (m902transient(c2071l, 16L)) {
            c16539l.yandex.f4633l = c2071l.f4633l;
        }
        if (m902transient(c2071l, 6168L)) {
            m893l(c16539l, false, c16539l.yandex.f4634l);
        }
        if (m902transient(c2071l, 34359738368L)) {
            c16539l.yandex.f4619l = c2071l.f4619l;
        }
        if (m902transient(c2071l, 32L)) {
            C2071l c2071l2 = c16539l.yandex;
            C12671l c12671l = c2071l.f4641l;
            c2071l2.f4641l = c12671l;
            c16539l.purchase.setStrokeWidth(c12671l.yandex(this));
        }
        if (m902transient(c2071l, 64L)) {
            C2071l c2071l3 = c16539l.yandex;
            Paint paint = c16539l.purchase;
            c2071l3.f4627l = c2071l.f4627l;
            int iInmobi = AbstractC5020l.inmobi(c2071l.f4627l);
            if (iInmobi == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iInmobi == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iInmobi == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m902transient(c2071l, 128L)) {
            C2071l c2071l4 = c16539l.yandex;
            Paint paint2 = c16539l.purchase;
            c2071l4.f4639l = c2071l.f4639l;
            int iInmobi2 = AbstractC5020l.inmobi(c2071l.f4639l);
            if (iInmobi2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iInmobi2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iInmobi2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m902transient(c2071l, 256L)) {
            c16539l.yandex.f4615l = c2071l.f4615l;
            c16539l.purchase.setStrokeMiter(c2071l.f4615l.floatValue());
        }
        if (m902transient(c2071l, 512L)) {
            c16539l.yandex.f4618l = c2071l.f4618l;
        }
        if (m902transient(c2071l, 1024L)) {
            c16539l.yandex.f4640l = c2071l.f4640l;
        }
        Typeface typefaceM901throws = null;
        if (m902transient(c2071l, 1536L)) {
            C2071l c2071l5 = c16539l.yandex;
            Paint paint3 = c16539l.purchase;
            C12671l[] c12671lArr = c2071l5.f4618l;
            if (c12671lArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c12671lArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float fYandex = c2071l5.f4618l[i2 % length].yandex(this);
                    fArr[i2] = fYandex;
                    f += fYandex;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fYandex2 = c2071l5.f4640l.yandex(this);
                    if (fYandex2 < 0.0f) {
                        fYandex2 = (fYandex2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fYandex2));
                }
            }
        }
        if (m902transient(c2071l, 16384L)) {
            float textSize = ((C16539l) this.f3601l).amazon.getTextSize();
            c16539l.yandex.f4613l = c2071l.f4613l;
            c16539l.amazon.setTextSize(c2071l.f4613l.loadAd(this, textSize));
            c16539l.purchase.setTextSize(c2071l.f4613l.loadAd(this, textSize));
        }
        if (m902transient(c2071l, 8192L)) {
            c16539l.yandex.f4638l = c2071l.f4638l;
        }
        if (m902transient(c2071l, 32768L)) {
            if (c2071l.f4644l.intValue() == -1 && c16539l.yandex.f4644l.intValue() > 100) {
                C2071l c2071l6 = c16539l.yandex;
                c2071l6.f4644l = Integer.valueOf(c2071l6.f4644l.intValue() - 100);
            } else if (c2071l.f4644l.intValue() != 1 || c16539l.yandex.f4644l.intValue() >= 900) {
                c16539l.yandex.f4644l = c2071l.f4644l;
            } else {
                C2071l c2071l7 = c16539l.yandex;
                c2071l7.f4644l = Integer.valueOf(c2071l7.f4644l.intValue() + 100);
            }
        }
        if (m902transient(c2071l, 65536L)) {
            c16539l.yandex.f4609l = c2071l.f4609l;
        }
        if (m902transient(c2071l, 106496L)) {
            C2071l c2071l8 = c16539l.yandex;
            ArrayList arrayList = c2071l8.f4638l;
            if (arrayList != null && ((C4816l) this.f3602l) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typefaceM901throws = m901throws(c2071l8.f4609l, c2071l8.f4644l, (String) it.next());
                    if (typefaceM901throws != null) {
                        break;
                    }
                }
            }
            if (typefaceM901throws == null) {
                typefaceM901throws = m901throws(c2071l8.f4609l, c2071l8.f4644l, "serif");
            }
            c16539l.amazon.setTypeface(typefaceM901throws);
            c16539l.purchase.setTypeface(typefaceM901throws);
        }
        if (m902transient(c2071l, 131072L)) {
            C2071l c2071l9 = c16539l.yandex;
            Paint paint4 = c16539l.purchase;
            Paint paint5 = c16539l.amazon;
            c2071l9.f4643l = c2071l.f4643l;
            paint5.setStrikeThruText(c2071l.f4643l == 4);
            paint5.setUnderlineText(c2071l.f4643l == 2);
            paint4.setStrikeThruText(c2071l.f4643l == 4);
            paint4.setUnderlineText(c2071l.f4643l == 2);
        }
        if (m902transient(c2071l, 68719476736L)) {
            c16539l.yandex.f4621l = c2071l.f4621l;
        }
        if (m902transient(c2071l, 262144L)) {
            c16539l.yandex.f4631l = c2071l.f4631l;
        }
        if (m902transient(c2071l, 524288L)) {
            c16539l.yandex.f4632l = c2071l.f4632l;
        }
        if (m902transient(c2071l, 2097152L)) {
            c16539l.yandex.f4626l = c2071l.f4626l;
        }
        if (m902transient(c2071l, 4194304L)) {
            c16539l.yandex.f4646l = c2071l.f4646l;
        }
        if (m902transient(c2071l, 8388608L)) {
            c16539l.yandex.f4625l = c2071l.f4625l;
        }
        if (m902transient(c2071l, 16777216L)) {
            c16539l.yandex.f4617l = c2071l.f4617l;
        }
        if (m902transient(c2071l, 33554432L)) {
            c16539l.yandex.f4616l = c2071l.f4616l;
        }
        if (m902transient(c2071l, 1048576L)) {
            c16539l.yandex.f4620l = c2071l.f4620l;
        }
        if (m902transient(c2071l, 268435456L)) {
            c16539l.yandex.f4622l = c2071l.f4622l;
        }
        if (m902transient(c2071l, 536870912L)) {
            c16539l.yandex.f4637l = c2071l.f4637l;
        }
        if (m902transient(c2071l, 1073741824L)) {
            c16539l.yandex.f4629l = c2071l.f4629l;
        }
        if (m902transient(c2071l, 67108864L)) {
            c16539l.yandex.f4612l = c2071l.f4612l;
        }
        if (m902transient(c2071l, 134217728L)) {
            c16539l.yandex.f4647l = c2071l.f4647l;
        }
        if (m902transient(c2071l, 8589934592L)) {
            c16539l.yandex.f4628l = c2071l.f4628l;
        }
        if (m902transient(c2071l, 17179869184L)) {
            c16539l.yandex.f4635l = c2071l.f4635l;
        }
        if (m902transient(c2071l, 137438953472L)) {
            c16539l.yandex.f4611l = c2071l.f4611l;
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public void m947l() {
        int iM896package;
        C2071l c2071l = ((C16539l) this.f3601l).yandex;
        AbstractC18728l abstractC18728l = c2071l.f4628l;
        if (abstractC18728l instanceof C13555l) {
            iM896package = ((C13555l) abstractC18728l).f26574l;
        } else if (!(abstractC18728l instanceof C2128l)) {
            return;
        } else {
            iM896package = c2071l.f4642l.f26574l;
        }
        Float f = c2071l.f4635l;
        if (f != null) {
            iM896package = m896package(iM896package, f.floatValue());
        }
        ((Canvas) this.f3603l).drawColor(iM896package);
    }

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public void m948l(AbstractC11678l abstractC11678l) {
        if (abstractC11678l.loadAd == null || abstractC11678l.admob == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f3606l).peek()).invert(matrix)) {
            C10006l c10006l = abstractC11678l.admob;
            float f = c10006l.loadAd;
            float f2 = c10006l.crashlytics;
            float fCrashlytics = c10006l.crashlytics();
            C10006l c10006l2 = abstractC11678l.admob;
            float f3 = c10006l2.crashlytics;
            float fCrashlytics2 = c10006l2.crashlytics();
            float fAmazon = abstractC11678l.admob.amazon();
            C10006l c10006l3 = abstractC11678l.admob;
            float[] fArr = {f, f2, fCrashlytics, f3, fCrashlytics2, fAmazon, c10006l3.loadAd, c10006l3.amazon()};
            matrix.preConcat(((Canvas) this.f3603l).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            AbstractC11678l abstractC11678l2 = (AbstractC11678l) ((Stack) this.f3604l).peek();
            C10006l c10006l4 = abstractC11678l2.admob;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (c10006l4 == null) {
                abstractC11678l2.admob = new C10006l(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < c10006l4.loadAd) {
                c10006l4.loadAd = f8;
            }
            if (f9 < c10006l4.crashlytics) {
                c10006l4.crashlytics = f9;
            }
            if (f8 + f10 > c10006l4.crashlytics()) {
                c10006l4.amazon = (f8 + f10) - c10006l4.loadAd;
            }
            if (f9 + f11 > c10006l4.amazon()) {
                c10006l4.purchase = (f9 + f11) - c10006l4.crashlytics;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public Path m949l(C0096l c0096l) {
        float fAmazon;
        float fPurchase;
        float fMin;
        C12671l c12671l;
        float fAmazon2;
        C12671l c12671l2;
        float fPurchase2;
        float fAmazon3;
        float fPurchase3;
        float f;
        float f2;
        Path path;
        C12671l c12671l3 = c0096l.subscription;
        if (c12671l3 == null && c0096l.tapsense == null) {
            fAmazon = 0.0f;
        } else {
            C12671l c12671l4 = c0096l.tapsense;
            if (c12671l3 != null) {
                if (c12671l4 == null) {
                    fAmazon = c12671l3.amazon(this);
                } else {
                    fAmazon = c12671l3.amazon(this);
                    fPurchase = c0096l.tapsense.purchase(this);
                }
                fMin = Math.min(fAmazon, c0096l.adcel.amazon(this) / 2.0f);
                float fMin2 = Math.min(fPurchase, c0096l.ads.purchase(this) / 2.0f);
                c12671l = c0096l.metrica;
                if (c12671l != null) {
                    fAmazon2 = c12671l.amazon(this);
                } else {
                    fAmazon2 = 0.0f;
                }
                c12671l2 = c0096l.startapp;
                if (c12671l2 != null) {
                    fPurchase2 = c12671l2.purchase(this);
                } else {
                    fPurchase2 = 0.0f;
                }
                fAmazon3 = c0096l.adcel.amazon(this);
                fPurchase3 = c0096l.ads.purchase(this);
                if (c0096l.admob == null) {
                    c0096l.admob = new C10006l(fAmazon2, fPurchase2, fAmazon3, fPurchase3);
                }
                f = fAmazon3 + fAmazon2;
                f2 = fPurchase2 + fPurchase3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fAmazon2, fPurchase2);
                    path.lineTo(f, fPurchase2);
                    path.lineTo(f, f2);
                    path.lineTo(fAmazon2, f2);
                    path.lineTo(fAmazon2, fPurchase2);
                } else {
                    float f3 = fMin * 0.5522848f;
                    float f4 = 0.5522848f * fMin2;
                    float f5 = fPurchase2 + fMin2;
                    path.moveTo(fAmazon2, f5);
                    float f6 = f5 - f4;
                    float f7 = fAmazon2 + fMin;
                    float f8 = f7 - f3;
                    path.cubicTo(fAmazon2, f6, f8, fPurchase2, f7, fPurchase2);
                    float f9 = f - fMin;
                    path.lineTo(f9, fPurchase2);
                    float f10 = f9 + f3;
                    path.cubicTo(f10, fPurchase2, f, f6, f, f5);
                    float f11 = f2 - fMin2;
                    path.lineTo(f, f11);
                    float f12 = f11 + f4;
                    path.cubicTo(f, f12, f10, f2, f9, f2);
                    path.lineTo(f7, f2);
                    float f13 = fAmazon2;
                    path.cubicTo(f8, f2, f13, f12, fAmazon2, f11);
                    path.lineTo(f13, f5);
                }
                path.close();
                return path;
            }
            fAmazon = c12671l4.purchase(this);
        }
        fPurchase = fAmazon;
        fMin = Math.min(fAmazon, c0096l.adcel.amazon(this) / 2.0f);
        float fMin3 = Math.min(fPurchase, c0096l.ads.purchase(this) / 2.0f);
        c12671l = c0096l.metrica;
        if (c12671l != null) {
            fAmazon2 = c12671l.amazon(this);
        } else {
            fAmazon2 = 0.0f;
        }
        c12671l2 = c0096l.startapp;
        if (c12671l2 != null) {
            fPurchase2 = c12671l2.purchase(this);
        } else {
            fPurchase2 = 0.0f;
        }
        fAmazon3 = c0096l.adcel.amazon(this);
        fPurchase3 = c0096l.ads.purchase(this);
        if (c0096l.admob == null) {
            c0096l.admob = new C10006l(fAmazon2, fPurchase2, fAmazon3, fPurchase3);
        }
        f = fAmazon3 + fAmazon2;
        f2 = fPurchase2 + fPurchase3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fAmazon2, fPurchase2);
            path.lineTo(f, fPurchase2);
            path.lineTo(f, f2);
            path.lineTo(fAmazon2, f2);
            path.lineTo(fAmazon2, fPurchase2);
        } else {
            path.moveTo(fAmazon2, fPurchase2);
            path.lineTo(f, fPurchase2);
            path.lineTo(f, f2);
            path.lineTo(fAmazon2, f2);
            path.lineTo(fAmazon2, fPurchase2);
        }
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public void m950l(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = AbstractC15467l.yandex;
        this.f3604l = str;
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public Path m951l(C13233l c13233l) {
        C12671l c12671l = c13233l.metrica;
        float fAmazon = c12671l != null ? c12671l.amazon(this) : 0.0f;
        C12671l c12671l2 = c13233l.startapp;
        float fPurchase = c12671l2 != null ? c12671l2.purchase(this) : 0.0f;
        float fAmazon2 = c13233l.adcel.amazon(this);
        float fPurchase2 = c13233l.ads.purchase(this);
        float f = fAmazon - fAmazon2;
        float f2 = fPurchase - fPurchase2;
        float f3 = fAmazon + fAmazon2;
        float f4 = fPurchase + fPurchase2;
        if (c13233l.admob == null) {
            c13233l.admob = new C10006l(f, f2, fAmazon2 * 2.0f, 2.0f * fPurchase2);
        }
        float f5 = fAmazon2 * 0.5522848f;
        float f6 = fPurchase2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fAmazon, f2);
        float f7 = fAmazon + f5;
        float f8 = fPurchase - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fPurchase);
        float f9 = fPurchase + f6;
        path.cubicTo(f3, f9, f7, f4, fAmazon, f4);
        float f10 = fAmazon - f5;
        path.cubicTo(f10, f4, f, f9, f, fPurchase);
        path.cubicTo(f, f8, f10, f2, fAmazon, f2);
        path.close();
        return path;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public AbstractC2722l m952l() {
        AtomicLong atomicLong;
        long j;
        final int i;
        ListenableFuture listenableFutureLoadAd;
        EnumC1535l enumC1535l = EnumC1535l.f3808l;
        C1090l c1090l = (C1090l) this.f3606l;
        if (c1090l.isDone()) {
            return c1090l;
        }
        do {
            atomicLong = (AtomicLong) this.f3602l;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) (((int) j) + 1)) & 4294967295L) | (((long) i) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f3605l;
        C1090l c1090l2 = new C1090l();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(c1090l2);
        if (listenableFuture == null) {
            C17516l c17516lYandex = AbstractC6854l.yandex(new C14785l(this, i, 28));
            RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l();
            runnableFutureC13286l.f26066l = new C16753l(runnableFutureC13286l, c17516lYandex);
            enumC1535l.execute(runnableFutureC13286l);
            listenableFutureLoadAd = runnableFutureC13286l;
        } else {
            listenableFutureLoadAd = AbstractC7151l.loadAd(listenableFuture, Throwable.class, AbstractC6854l.loadAd(new InterfaceC12538l() { // from class: lؘْٝ
                @Override // defpackage.InterfaceC12538l
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.yandex.m945l(i);
                }
            }), (ExecutorC1688l) this.f3604l);
        }
        c1090l2.vip(listenableFutureLoadAd);
        C9096l c9096l = new C9096l(this, i);
        c1090l2.yandex(new RunnableC7706l(this, c1090l2, c9096l, false, 17), enumC1535l);
        return c9096l;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009f A[PHI: r12 r13 r15 r17
  0x009f: PHI (r12v18 float) = (r12v15 float), (r12v25 float) binds: [B:67:0x00cf, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r13v17 float) = (r13v15 float), (r13v24 float) binds: [B:67:0x00cf, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r15v17 float) = (r15v15 float), (r15v32 float) binds: [B:67:0x00cf, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:67:0x00cf, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void m953native(boolean z, C10006l c10006l, C0172l c0172l) {
        float fLoadAd;
        float f;
        float fLoadAd2;
        float f2;
        float fLoadAd3;
        float fLoadAd4;
        float fLoadAd5;
        float fLoadAd6;
        AbstractC12707l abstractC12707lIsPro = ((C4816l) this.f3602l).isPro(c0172l.f1123l);
        int i = 0;
        if (abstractC12707lIsPro == null) {
            m889catch("%s reference '%s' not found", z ? "Fill" : "Stroke", c0172l.f1123l);
            AbstractC18728l abstractC18728l = c0172l.f1122l;
            C16539l c16539l = (C16539l) this.f3601l;
            if (abstractC18728l != null) {
                m893l(c16539l, z, abstractC18728l);
                return;
            } else if (z) {
                c16539l.loadAd = false;
                return;
            } else {
                c16539l.crashlytics = false;
                return;
            }
        }
        boolean z2 = abstractC12707lIsPro instanceof C9766l;
        C13555l c13555l = C13555l.f26573l;
        if (z2) {
            C9766l c9766l = (C9766l) abstractC12707lIsPro;
            String str = c9766l.smaato;
            if (str != null) {
                m900switch(c9766l, str);
            }
            Boolean bool = c9766l.subs;
            boolean z3 = bool != null && bool.booleanValue();
            C16539l c16539l2 = (C16539l) this.f3601l;
            Paint paint = z ? c16539l2.amazon : c16539l2.purchase;
            if (z3) {
                C10006l c10006l2 = c16539l2.mopub;
                if (c10006l2 == null) {
                    c10006l2 = c16539l2.billing;
                }
                C12671l c12671l = c9766l.remoteconfig;
                fLoadAd3 = c12671l != null ? c12671l.amazon(this) : 0.0f;
                C12671l c12671l2 = c9766l.vip;
                fLoadAd4 = c12671l2 != null ? c12671l2.purchase(this) : 0.0f;
                f2 = 0.0f;
                C12671l c12671l3 = c9766l.metrica;
                fLoadAd5 = c12671l3 != null ? c12671l3.amazon(this) : c10006l2.amazon;
                C12671l c12671l4 = c9766l.startapp;
                if (c12671l4 != null) {
                    fLoadAd6 = c12671l4.purchase(this);
                } else {
                    fLoadAd6 = f2;
                }
            } else {
                f2 = 0.0f;
                C12671l c12671l5 = c9766l.remoteconfig;
                fLoadAd3 = c12671l5 != null ? c12671l5.loadAd(this, 1.0f) : 0.0f;
                C12671l c12671l6 = c9766l.vip;
                fLoadAd4 = c12671l6 != null ? c12671l6.loadAd(this, 1.0f) : 0.0f;
                C12671l c12671l7 = c9766l.metrica;
                fLoadAd5 = c12671l7 != null ? c12671l7.loadAd(this, 1.0f) : 1.0f;
                C12671l c12671l8 = c9766l.startapp;
                if (c12671l8 != null) {
                    fLoadAd6 = c12671l8.loadAd(this, 1.0f);
                } else {
                    fLoadAd6 = f2;
                }
            }
            float f3 = fLoadAd4;
            float f4 = fLoadAd5;
            float f5 = fLoadAd6;
            float f6 = fLoadAd3;
            m931l();
            this.f3601l = m908final(c9766l);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(c10006l.loadAd, c10006l.crashlytics);
                matrix.preScale(c10006l.amazon, c10006l.purchase);
            }
            Matrix matrix2 = c9766l.isPro;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c9766l.admob.size();
            if (size == 0) {
                m941l();
                C16539l c16539l3 = (C16539l) this.f3601l;
                if (z) {
                    c16539l3.loadAd = false;
                    return;
                } else {
                    c16539l3.crashlytics = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c9766l.admob.iterator();
            int i2 = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                C6999l c6999l = (C6999l) ((AbstractC15046l) it.next());
                Float f8 = c6999l.admob;
                float fFloatValue = f8 != null ? f8.floatValue() : f2;
                if (i2 == 0 || fFloatValue >= f7) {
                    fArr[i2] = fFloatValue;
                    f7 = fFloatValue;
                } else {
                    fArr[i2] = f7;
                }
                m931l();
                m927l((C16539l) this.f3601l, c6999l);
                C2071l c2071l = ((C16539l) this.f3601l).yandex;
                C13555l c13555l2 = (C13555l) c2071l.f4612l;
                if (c13555l2 == null) {
                    c13555l2 = c13555l;
                }
                iArr[i2] = m896package(c13555l2.f26574l, c2071l.f4647l.floatValue());
                i2++;
                m941l();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                m941l();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i3 = c9766l.firebase;
            if (i3 != 0) {
                if (i3 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i3 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            m941l();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((C16539l) this.f3601l).yandex.f4614l.floatValue() * 256.0f);
            if (iFloatValue >= 0) {
                i = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i);
            return;
        }
        if (!(abstractC12707lIsPro instanceof C0973l)) {
            if (abstractC12707lIsPro instanceof C2390l) {
                C2390l c2390l = (C2390l) abstractC12707lIsPro;
                C2071l c2071l2 = c2390l.purchase;
                if (z) {
                    if (m902transient(c2071l2, 2147483648L)) {
                        C16539l c16539l4 = (C16539l) this.f3601l;
                        C2071l c2071l3 = c16539l4.yandex;
                        AbstractC18728l abstractC18728l2 = c2390l.purchase.f4636l;
                        c2071l3.f4623l = abstractC18728l2;
                        c16539l4.loadAd = abstractC18728l2 != null;
                    }
                    if (m902transient(c2390l.purchase, 4294967296L)) {
                        ((C16539l) this.f3601l).yandex.f4614l = c2390l.purchase.f4610l;
                    }
                    if (m902transient(c2390l.purchase, 6442450944L)) {
                        C16539l c16539l5 = (C16539l) this.f3601l;
                        m893l(c16539l5, z, c16539l5.yandex.f4623l);
                        return;
                    }
                    return;
                }
                if (m902transient(c2071l2, 2147483648L)) {
                    C16539l c16539l6 = (C16539l) this.f3601l;
                    C2071l c2071l4 = c16539l6.yandex;
                    AbstractC18728l abstractC18728l3 = c2390l.purchase.f4636l;
                    c2071l4.f4634l = abstractC18728l3;
                    c16539l6.crashlytics = abstractC18728l3 != null;
                }
                if (m902transient(c2390l.purchase, 4294967296L)) {
                    ((C16539l) this.f3601l).yandex.f4633l = c2390l.purchase.f4610l;
                }
                if (m902transient(c2390l.purchase, 6442450944L)) {
                    C16539l c16539l7 = (C16539l) this.f3601l;
                    m893l(c16539l7, z, c16539l7.yandex.f4634l);
                    return;
                }
                return;
            }
            return;
        }
        C0973l c0973l = (C0973l) abstractC12707lIsPro;
        String str2 = c0973l.smaato;
        if (str2 != null) {
            m900switch(c0973l, str2);
        }
        Boolean bool2 = c0973l.subs;
        boolean z4 = bool2 != null && bool2.booleanValue();
        C16539l c16539l8 = (C16539l) this.f3601l;
        Paint paint2 = z ? c16539l8.amazon : c16539l8.purchase;
        if (z4) {
            C12671l c12671l9 = new C12671l(9, 50.0f);
            C12671l c12671l10 = c0973l.remoteconfig;
            float fAmazon = c12671l10 != null ? c12671l10.amazon(this) : c12671l9.amazon(this);
            C12671l c12671l11 = c0973l.vip;
            fLoadAd = c12671l11 != null ? c12671l11.purchase(this) : c12671l9.purchase(this);
            C12671l c12671l12 = c0973l.metrica;
            fLoadAd2 = c12671l12 != null ? c12671l12.yandex(this) : c12671l9.yandex(this);
            f = fAmazon;
        } else {
            C12671l c12671l13 = c0973l.remoteconfig;
            float fLoadAd7 = c12671l13 != null ? c12671l13.loadAd(this, 1.0f) : 0.5f;
            C12671l c12671l14 = c0973l.vip;
            fLoadAd = c12671l14 != null ? c12671l14.loadAd(this, 1.0f) : 0.5f;
            C12671l c12671l15 = c0973l.metrica;
            f = fLoadAd7;
            fLoadAd2 = c12671l15 != null ? c12671l15.loadAd(this, 1.0f) : 0.5f;
        }
        float f9 = fLoadAd;
        m931l();
        this.f3601l = m908final(c0973l);
        Matrix matrix3 = new Matrix();
        if (!z4) {
            matrix3.preTranslate(c10006l.loadAd, c10006l.crashlytics);
            matrix3.preScale(c10006l.amazon, c10006l.purchase);
        }
        Matrix matrix4 = c0973l.isPro;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = c0973l.admob.size();
        if (size2 == 0) {
            m941l();
            C16539l c16539l9 = (C16539l) this.f3601l;
            if (z) {
                c16539l9.loadAd = false;
                return;
            } else {
                c16539l9.crashlytics = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = c0973l.admob.iterator();
        int i4 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            C6999l c6999l2 = (C6999l) ((AbstractC15046l) it2.next());
            Float f11 = c6999l2.admob;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            if (i4 == 0 || fFloatValue2 >= f10) {
                fArr2[i4] = fFloatValue2;
                f10 = fFloatValue2;
            } else {
                fArr2[i4] = f10;
            }
            m931l();
            m927l((C16539l) this.f3601l, c6999l2);
            C2071l c2071l5 = ((C16539l) this.f3601l).yandex;
            C13555l c13555l3 = (C13555l) c2071l5.f4612l;
            if (c13555l3 == null) {
                c13555l3 = c13555l;
            }
            iArr2[i4] = m896package(c13555l3.f26574l, c2071l5.f4647l.floatValue());
            i4++;
            m941l();
        }
        if (fLoadAd2 == 0.0f || size2 == 1) {
            m941l();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i5 = c0973l.firebase;
        if (i5 != 0) {
            if (i5 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i5 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        m941l();
        RadialGradient radialGradient = new RadialGradient(f, f9, fLoadAd2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((C16539l) this.f3601l).yandex.f4614l.floatValue() * 256.0f);
        if (iFloatValue2 >= 0) {
            i = iFloatValue2 > 255 ? 255 : iFloatValue2;
        }
        paint2.setAlpha(i);
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public void m954new(AbstractC15046l abstractC15046l, C16539l c16539l) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (abstractC15046l instanceof AbstractC12707l) {
                arrayList.add(0, (AbstractC12707l) abstractC15046l);
            }
            Object obj = abstractC15046l.loadAd;
            if (obj == null) {
                break;
            } else {
                abstractC15046l = (AbstractC15046l) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m927l(c16539l, (AbstractC12707l) it.next());
        }
        C16539l c16539l2 = (C16539l) this.f3601l;
        c16539l.mopub = c16539l2.mopub;
        c16539l.billing = c16539l2.billing;
    }

    public float premium(AbstractC17931l abstractC17931l) {
        C17933l c17933l = new C17933l(this);
        m961throw(abstractC17931l, c17933l);
        return c17933l.yandex;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public boolean m955private() {
        Boolean bool = ((C16539l) this.f3601l).yandex.f4617l;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public C12714l m956protected(C3624l c3624l, C7155l c7155l, List list) {
        if (AbstractC2721l.yandex.contains(c3624l)) {
            return null;
        }
        return new C12714l(this, AbstractC9033l.billing((C10202l) this.f3601l, c3624l, (C12014l) this.f3605l), c3624l, list, c7155l);
    }

    @Override // defpackage.InterfaceC15837l
    public ArrayList purchase(C17586l c17586l, InterfaceC3588l interfaceC3588l) {
        List list = c17586l.f34247l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0458l) this.f3604l).applovin((C7899l) it.next(), interfaceC3588l));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC15837l
    public List remoteconfig(AbstractC3031l abstractC3031l, C13146l c13146l) {
        return !AbstractC1305l.crashlytics.purchase(c13146l.f25731l).booleanValue() ? C2580l.f5619l : m905const(abstractC3031l, c13146l, 3);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public Path m957return(C5540l c5540l) {
        C12671l c12671l = c5540l.metrica;
        float fAmazon = c12671l != null ? c12671l.amazon(this) : 0.0f;
        C12671l c12671l2 = c5540l.startapp;
        float fPurchase = c12671l2 != null ? c12671l2.purchase(this) : 0.0f;
        float fYandex = c5540l.adcel.yandex(this);
        float f = fAmazon - fYandex;
        float f2 = fPurchase - fYandex;
        float f3 = fAmazon + fYandex;
        float f4 = fPurchase + fYandex;
        if (c5540l.admob == null) {
            float f5 = 2.0f * fYandex;
            c5540l.admob = new C10006l(f, f2, f5, f5);
        }
        float f6 = fYandex * 0.5522848f;
        Path path = new Path();
        path.moveTo(fAmazon, f2);
        float f7 = fAmazon + f6;
        float f8 = fPurchase - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fPurchase);
        float f9 = fPurchase + f6;
        path.cubicTo(f3, f9, f7, f4, fAmazon, f4);
        float f10 = fAmazon - f6;
        path.cubicTo(f10, f4, f, f9, f, fPurchase);
        path.cubicTo(f, f8, f10, f2, fAmazon, f2);
        path.close();
        return path;
    }

    @Override // defpackage.InterfaceC15837l
    public List smaato(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i) {
        int size;
        if (abstractC14080l instanceof C14036l) {
            size = ((C14036l) abstractC14080l).f27369l.size();
        } else {
            size = abstractC14080l instanceof C13146l ? ((C13146l) abstractC14080l).f25729l.size() : 0;
        }
        return m912implements(abstractC3031l, abstractC14080l, i, size);
    }

    @Override // defpackage.InterfaceC15837l
    public List startapp(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i, int i2, C18426l c18426l) {
        return !AbstractC1305l.crashlytics.purchase(c18426l != null ? c18426l.f35990l : 0).booleanValue() ? C2580l.f5619l : m912implements(abstractC3031l, abstractC14080l, i, i2);
    }

    @Override // defpackage.InterfaceC3710l
    public void subs(InterfaceC1286l interfaceC1286l) {
        C16499l c16499l = C16499l.f32230l;
        Activity activity = (Activity) this.f3603l;
        String str = (String) this.f3602l;
        String str2 = (String) this.f3601l;
        c16499l.getClass();
        C16499l.yandex(activity, str, str2, null);
    }

    @Override // defpackage.InterfaceC15837l
    public List subscription(C15627l c15627l) {
        if (!AbstractC1305l.crashlytics.purchase(c15627l.f30551l.f13789l).booleanValue()) {
            return C2580l.f5619l;
        }
        InterfaceC5706l interfaceC5706l = (InterfaceC5706l) c15627l.f6547l;
        C3820l c3820l = interfaceC5706l instanceof C3820l ? (C3820l) interfaceC5706l : null;
        C5222l c5222l = c3820l != null ? c3820l.f7939l : null;
        if (c5222l == null) {
            C11983l.advert(c15627l.f30549l.yandex(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        for (Annotation annotation : c5222l.yandex.getDeclaredAnnotations()) {
            Class clsMo1730private = ((InterfaceC13937l) AbstractC16131l.billing(annotation)).mo1730private();
            C12714l c12714lM956protected = m956protected(AbstractC1845l.yandex(clsMo1730private), new C7155l(annotation), arrayList);
            if (c12714lM956protected != null) {
                AbstractC1788l.subs(c12714lM956protected, annotation, clsMo1730private);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public C1013l m958super(String str) {
        return (C1013l) ((HashMap) this.f3603l).get(str);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public synchronized byte[] m959synchronized() {
        byte[] bArrFirebase;
        byte[] bArr = (byte[]) this.f3605l;
        BigInteger bigInteger = (BigInteger) this.f3606l;
        ((InterfaceC3881l) this.f3603l).getClass();
        bArrFirebase = AbstractC17265l.firebase(bArr, AbstractC17185l.mopub(12, bigInteger));
        if (((BigInteger) this.f3606l).compareTo((BigInteger) this.f3602l) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f3606l = ((BigInteger) this.f3606l).add(BigInteger.ONE);
        return bArrFirebase;
    }

    @Override // defpackage.InterfaceC15837l
    public List tapsense(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i) {
        int i2;
        if (abstractC14080l instanceof C13347l) {
            i2 = ((C13347l) abstractC14080l).f26207l;
        } else if (abstractC14080l instanceof C14036l) {
            i2 = ((C14036l) abstractC14080l).f27371l;
        } else if (abstractC14080l instanceof C13146l) {
            C13146l c13146l = (C13146l) abstractC14080l;
            int iInmobi = AbstractC5020l.inmobi(i);
            if (iInmobi != 2) {
                i2 = (iInmobi == 3 && (c13146l.f25716l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) ? c13146l.f25740l : c13146l.f25731l;
            } else {
                i2 = (c13146l.f25716l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? c13146l.f25725l : c13146l.f25731l;
            }
        } else {
            i2 = 0;
        }
        if (AbstractC1305l.crashlytics.purchase(i2).booleanValue()) {
            if (i == 2) {
                return m905const(abstractC3031l, (C13146l) abstractC14080l, 1);
            }
            C12876l c12876lM887abstract = m887abstract(abstractC14080l, (InterfaceC3588l) abstractC3031l.f6545l, (C14965l) abstractC3031l.f6544l, i, false);
            if (c12876lM887abstract != null) {
                return m898static(this, abstractC3031l, c12876lM887abstract, null, false, 60);
            }
        }
        return C2580l.f5619l;
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public void m960this(long j) {
        InterfaceC13158l interfaceC13158l;
        SparseArray sparseArray = (SparseArray) this.f3602l;
        HashMap map = (HashMap) this.f3603l;
        InterfaceC13158l interfaceC13158l2 = (InterfaceC13158l) this.f3604l;
        interfaceC13158l2.signatures(j);
        InterfaceC13158l interfaceC13158l3 = (InterfaceC13158l) this.f3606l;
        if (interfaceC13158l3 != null) {
            interfaceC13158l3.signatures(j);
        }
        if (interfaceC13158l2.advert() || (interfaceC13158l = (InterfaceC13158l) this.f3606l) == null || !interfaceC13158l.advert()) {
            interfaceC13158l2.mo2863synchronized(map, sparseArray);
        } else {
            ((InterfaceC13158l) this.f3606l).mo2863synchronized(map, sparseArray);
            interfaceC13158l2.subs(map);
        }
        InterfaceC13158l interfaceC13158l4 = (InterfaceC13158l) this.f3606l;
        if (interfaceC13158l4 != null) {
            interfaceC13158l4.amazon();
            this.f3606l = null;
        }
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void m961throw(AbstractC17931l abstractC17931l, AbstractC10033l abstractC10033l) {
        float f;
        float fPurchase;
        float fAmazon;
        int iM913import;
        if (m955private()) {
            Iterator it = abstractC17931l.subs.iterator();
            boolean z = true;
            while (it.hasNext()) {
                AbstractC15046l abstractC15046l = (AbstractC15046l) it.next();
                if (abstractC15046l instanceof C4222l) {
                    abstractC10033l.subs(m923l(((C4222l) abstractC15046l).crashlytics, z, !it.hasNext()));
                } else if (abstractC10033l.crashlytics((AbstractC17931l) abstractC15046l)) {
                    float fPurchase2 = 0.0f;
                    if (abstractC15046l instanceof C8596l) {
                        m931l();
                        C8596l c8596l = (C8596l) abstractC15046l;
                        m927l((C16539l) this.f3601l, c8596l);
                        if (m955private() && m932l()) {
                            AbstractC12707l abstractC12707lIsPro = c8596l.yandex.isPro(c8596l.vip);
                            if (abstractC12707lIsPro == null) {
                                m889catch("TextPath reference '%s' not found", c8596l.vip);
                            } else {
                                C10878l c10878l = (C10878l) abstractC12707lIsPro;
                                C16009l c16009l = new C16009l(c10878l.metrica);
                                Matrix matrix = c10878l.vip;
                                Path path = c16009l.yandex;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                C12671l c12671l = c8596l.metrica;
                                fPurchase2 = c12671l != null ? c12671l.loadAd(this, pathMeasure.getLength()) : 0.0f;
                                int iM913import2 = m913import();
                                if (iM913import2 != 1) {
                                    float fPremium = premium(c8596l);
                                    if (iM913import2 == 2) {
                                        fPremium /= 2.0f;
                                    }
                                    fPurchase2 -= fPremium;
                                }
                                inmobi(c8596l.startapp);
                                boolean zM935l = m935l();
                                m961throw(c8596l, new C8839l(this, path, fPurchase2));
                                if (zM935l) {
                                    m944l(c8596l.admob);
                                }
                            }
                        }
                        m941l();
                    } else if (abstractC15046l instanceof C14015l) {
                        m931l();
                        C14015l c14015l = (C14015l) abstractC15046l;
                        m927l((C16539l) this.f3601l, c14015l);
                        if (m955private()) {
                            ArrayList arrayList = c14015l.vip;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = abstractC10033l instanceof C12005l;
                            if (z3) {
                                float fAmazon2 = !z2 ? ((C12005l) abstractC10033l).yandex : ((C12671l) c14015l.vip.get(0)).amazon(this);
                                ArrayList arrayList2 = c14015l.metrica;
                                fPurchase = (arrayList2 == null || arrayList2.size() == 0) ? ((C12005l) abstractC10033l).loadAd : ((C12671l) c14015l.metrica.get(0)).purchase(this);
                                ArrayList arrayList3 = c14015l.startapp;
                                fAmazon = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C12671l) c14015l.startapp.get(0)).amazon(this);
                                ArrayList arrayList4 = c14015l.adcel;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fPurchase2 = ((C12671l) c14015l.adcel.get(0)).purchase(this);
                                }
                                float f2 = fAmazon2;
                                f = fPurchase2;
                                fPurchase2 = f2;
                            } else {
                                f = 0.0f;
                                fPurchase = 0.0f;
                                fAmazon = 0.0f;
                            }
                            if (z2 && (iM913import = m913import()) != 1) {
                                float fPremium2 = premium(c14015l);
                                if (iM913import == 2) {
                                    fPremium2 /= 2.0f;
                                }
                                fPurchase2 -= fPremium2;
                            }
                            inmobi(c14015l.ads);
                            if (z3) {
                                C12005l c12005l = (C12005l) abstractC10033l;
                                c12005l.yandex = fPurchase2 + fAmazon;
                                c12005l.loadAd = fPurchase + f;
                            }
                            boolean zM935l2 = m935l();
                            m961throw(c14015l, abstractC10033l);
                            if (zM935l2) {
                                m944l(c14015l.admob);
                            }
                        }
                        m941l();
                    } else if (abstractC15046l instanceof C0549l) {
                        m931l();
                        C0549l c0549l = (C0549l) abstractC15046l;
                        m927l((C16539l) this.f3601l, c0549l);
                        if (m955private()) {
                            inmobi(c0549l.metrica);
                            AbstractC12707l abstractC12707lIsPro2 = abstractC15046l.yandex.isPro(c0549l.vip);
                            if (abstractC12707lIsPro2 == null || !(abstractC12707lIsPro2 instanceof AbstractC17931l)) {
                                m889catch("Tref reference '%s' not found", c0549l.vip);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                m906else((AbstractC17931l) abstractC12707lIsPro2, sb);
                                if (sb.length() > 0) {
                                    abstractC10033l.subs(sb.toString());
                                }
                            }
                        }
                        m941l();
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public boolean m962try(C3624l c3624l) {
        C5222l c5222lYandex;
        if (c3624l.purchase() != null && AbstractC8576l.yandex(c3624l.billing().loadAd(), "Container") && (c5222lYandex = AbstractC4115l.yandex((C15053l) this.f3603l, c3624l, (C4995l) this.f3606l)) != null) {
            LinkedHashSet linkedHashSet = AbstractC2721l.yandex;
            boolean z = false;
            for (Annotation annotation : c5222lYandex.yandex.getDeclaredAnnotations()) {
                if (AbstractC1845l.yandex(((InterfaceC13937l) AbstractC16131l.billing(annotation)).mo1730private()).equals(AbstractC4792l.loadAd)) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX INFO: renamed from: while, reason: not valid java name */
    public Object m963while(AbstractC3031l abstractC3031l, C13146l c13146l, int i, AbstractC18041l abstractC18041l, Function2 function2) {
        Object objInvoke;
        C5222l c5222lLoadAd = AbstractC6616l.loadAd(abstractC3031l, true, true, AbstractC1305l.appmetrica.purchase(c13146l.f25731l), C11682l.amazon(c13146l), (C15053l) this.f3603l, (C4995l) this.f3606l);
        if (c5222lLoadAd == null) {
            if (abstractC3031l instanceof C15627l) {
                InterfaceC5706l interfaceC5706l = (InterfaceC5706l) ((C15627l) abstractC3031l).f6547l;
                C3820l c3820l = interfaceC5706l instanceof C3820l ? (C3820l) interfaceC5706l : null;
                if (c3820l != null) {
                    c5222lLoadAd = c3820l.f7939l;
                } else {
                    c5222lLoadAd = null;
                }
            } else {
                c5222lLoadAd = null;
            }
        }
        if (c5222lLoadAd != null) {
            C4995l c4995l = (C4995l) c5222lLoadAd.loadAd.amazon;
            C4995l c4995l2 = C17367l.purchase;
            C12876l c12876lM887abstract = m887abstract(c13146l, (InterfaceC3588l) abstractC3031l.f6545l, (C14965l) abstractC3031l.f6544l, i, c4995l.yandex(c4995l2.loadAd, c4995l2.crashlytics, c4995l2.amazon));
            if (c12876lM887abstract != null && (objInvoke = function2.invoke(((C0098l) this.f3602l).invoke(c5222lLoadAd), c12876lM887abstract)) != null) {
                if (AbstractC4056l.yandex(abstractC18041l)) {
                    objInvoke = (AbstractC0757l) objInvoke;
                    if (objInvoke instanceof C14548l) {
                        return new C11889l(((Number) ((C14548l) objInvoke).yandex).byteValue());
                    }
                    if (objInvoke instanceof C3001l) {
                        return new C11889l(((Number) ((C3001l) objInvoke).yandex).shortValue());
                    }
                    if (objInvoke instanceof C18009l) {
                        return new C11889l(((Number) ((C18009l) objInvoke).yandex).intValue());
                    }
                    if (objInvoke instanceof C16954l) {
                        return new C11889l(((Number) ((C16954l) objInvoke).yandex).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC3710l
    public void metrica(InterfaceC1286l interfaceC1286l) {
    }

    public C1424l(InterfaceC9526l interfaceC9526l) {
        this.f3602l = new AtomicLong(-9223372034707292160L);
        this.f3601l = new AtomicReference(null);
        this.f3605l = new AtomicReference(null);
        EnumC1535l enumC1535l = EnumC1535l.f3808l;
        this.f3604l = new ExecutorC1688l(enumC1535l);
        C1090l c1090l = new C1090l();
        this.f3606l = c1090l;
        RunnableC16301l runnableC16301l = new RunnableC16301l();
        runnableC16301l.f31893l = interfaceC9526l;
        runnableC16301l.f31892l = enumC1535l;
        this.f3603l = runnableC16301l;
        c1090l.yandex(runnableC16301l, enumC1535l);
    }

    public C1424l(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f3603l = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f3601l = str;
        this.f3605l = str2;
        this.f3604l = C18273l.loadAd;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f3602l = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw AbstractC15560l.adcel(it);
    }

    public C1424l(Context context, int i) {
        switch (i) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f3602l = "files";
                this.f3601l = "common";
                this.f3605l = AbstractC15467l.loadAd;
                this.f3604l = "";
                this.f3606l = AbstractC1186l.metrica();
                AbstractC16181l.isPro(context != null, "Context cannot be null", new Object[0]);
                this.f3603l = context.getPackageName();
                break;
            default:
                C18673l c18673l = AbstractC4086l.loadAd;
                InterfaceC13922l interfaceC13922l = AbstractC4086l.yandex[0];
                InterfaceC15829l interfaceC15829l = (InterfaceC15829l) c18673l.yandex(context);
                C18673l c18673l2 = AbstractC11267l.loadAd;
                InterfaceC13922l interfaceC13922l2 = AbstractC11267l.yandex[0];
                InterfaceC15829l interfaceC15829l2 = (InterfaceC15829l) c18673l2.yandex(context);
                C18673l c18673l3 = AbstractC16312l.loadAd;
                InterfaceC13922l interfaceC13922l3 = AbstractC16312l.yandex[0];
                InterfaceC15829l interfaceC15829l3 = (InterfaceC15829l) c18673l3.yandex(context);
                C18673l c18673l4 = AbstractC12091l.loadAd;
                InterfaceC13922l interfaceC13922l4 = AbstractC12091l.yandex[0];
                InterfaceC15829l interfaceC15829l4 = (InterfaceC15829l) c18673l4.yandex(context);
                InterfaceC15829l interfaceC15829lYandex = AbstractC15925l.yandex(context);
                C18673l c18673l5 = AbstractC2639l.loadAd;
                InterfaceC13922l interfaceC13922l5 = AbstractC2639l.yandex[0];
                InterfaceC15829l interfaceC15829l5 = (InterfaceC15829l) c18673l5.yandex(context);
                this.f3603l = interfaceC15829l;
                this.f3602l = interfaceC15829l2;
                this.f3601l = interfaceC15829l3;
                this.f3605l = interfaceC15829l4;
                this.f3604l = interfaceC15829lYandex;
                this.f3606l = interfaceC15829l5;
                break;
        }
    }

    public /* synthetic */ C1424l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f3603l = obj;
        this.f3602l = obj2;
        this.f3601l = obj3;
        this.f3605l = obj4;
        this.f3604l = obj5;
        this.f3606l = obj6;
    }

    public C1424l(C1908l c1908l, C14023l c14023l, C16616l c16616l, AbstractC1186l abstractC1186l, Bundle bundle, C18503l c18503l) {
        this.f3603l = c1908l;
        this.f3602l = c14023l;
        this.f3601l = c16616l;
        this.f3605l = abstractC1186l;
        this.f3604l = bundle == null ? Bundle.EMPTY : bundle;
        this.f3606l = c18503l;
    }
}
