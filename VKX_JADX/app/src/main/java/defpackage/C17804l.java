package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: lٍ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17804l implements InterfaceC9814l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final C1183l f34671l;

    /* JADX INFO: renamed from: lؑٔۦ, reason: contains not printable characters */
    public C16684l f34672l;

    /* JADX INFO: renamed from: lؑۚؓ, reason: contains not printable characters */
    public C15074l f34673l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C4619l f34674l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public int f34675l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C18527l f34676l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C8961l f34677l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public C12800l f34678l;

    /* JADX INFO: renamed from: lؓٗؗ, reason: contains not printable characters */
    public long f34679l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16616l f34680l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AbstractC1091l[] f34681l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public Object f34682l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C7713l f34683l;

    /* JADX INFO: renamed from: lّؔ۟, reason: contains not printable characters */
    public C2848l f34684l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final Looper f34685l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final AbstractC1091l[] f34686l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public final int f34687l;

    /* JADX INFO: renamed from: lۣؕ٘, reason: contains not printable characters */
    public boolean f34688l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public boolean f34689l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public boolean f34690l;

    /* JADX INFO: renamed from: lؖٙؓ, reason: contains not printable characters */
    public C10749l f34691l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public int f34692l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final ArrayList f34693l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final C13829l f34694l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final C10023l f34695l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C16621l f34696l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public C16616l f34697l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C9598l f34698l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4322l f34699l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public float f34700l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C17505l f34701l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f34702l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final C1080l f34703l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public C3852l f34704l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C4619l f34705l;

    /* JADX INFO: renamed from: lؚٕۤ, reason: contains not printable characters */
    public int f34706l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public C5989l f34707l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C11919l f34708l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C14500l f34709l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public int f34710l;

    /* JADX INFO: renamed from: lٍٜٛ, reason: contains not printable characters */
    public final long f34711l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C3904l f34712l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Context f34713l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C5811l f34714l;

    /* JADX INFO: renamed from: lٍۥ۟, reason: contains not printable characters */
    public final boolean f34715l;

    /* JADX INFO: renamed from: lُۨ, reason: contains not printable characters */
    public final long f34716l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public C3852l f34717l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public C13736l f34718l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public float f34719l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final long f34720l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C1080l f34721l;

    /* JADX INFO: renamed from: lٌْؔ, reason: contains not printable characters */
    public final int f34722l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public boolean f34723l;

    /* JADX INFO: renamed from: lٓؔۧ, reason: contains not printable characters */
    public final long f34724l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C0477l f34725l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final C18289l f34726l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C16717l f34727l;

    /* JADX INFO: renamed from: lٕؑٞ, reason: contains not printable characters */
    public C3852l f34728l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C17804l f34729l;

    /* JADX INFO: renamed from: lٕٖٙ, reason: contains not printable characters */
    public boolean f34730l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C6788l f34731l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final C10023l f34732l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public Surface f34733l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f34734l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public boolean f34735l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final C10685l f34736l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public SurfaceHolder f34737l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final InterfaceC11445l f34738l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC18330l f34739l;

    static {
        AbstractC17959l.yandex("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [lٍ٘ؖ] */
    /* JADX WARN: Type inference failed for: r10v16, types: [lٍ٘ؖ] */
    /* JADX WARN: Type inference failed for: r10v18, types: [lٍ٘ؖ] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r12v9, types: [lۣٗۙ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lٍ٘ؖ] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v14, types: [lٍ٘ؖ] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [lٍ٘ؖ] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4, types: [lٍ٘ؖ] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, lٍ٘ؖ] */
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
    public C17804l(C15670l c15670l) throws Throwable {
        ?? r1;
        int i;
        ?? r2;
        Looper looper;
        C18527l c18527l;
        int i2;
        C18527l c18527l2;
        C1183l c1183l;
        ?? r3;
        Looper looper2 = c15670l.admob;
        Context context = c15670l.yandex;
        ?? obj = new Object();
        obj.f34699l = new C4322l();
        obj.f34714l = new C5811l();
        try {
            AbstractC6427l.firebase("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(obj)) + " [AndroidXMedia3/1.10.1] [" + AbstractC15323l.yandex + "]");
            C18527l c18527l3 = c15670l.loadAd;
            obj.f34713l = context.getApplicationContext();
            obj.f34701l = new C17505l(c18527l3);
            obj.f34722l = c15670l.subs;
            obj.f34718l = c15670l.isPro;
            obj.f34687l = c15670l.vip;
            obj.f34735l = false;
            obj.f34720l = c15670l.pro;
            SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = new SurfaceHolderCallbackC18330l(obj);
            obj.f34739l = surfaceHolderCallbackC18330l;
            obj.f34696l = new C16621l();
            AbstractC1091l[] abstractC1091lArrCrashlytics = ((C1298l) c15670l.crashlytics.f2282l).crashlytics(new Handler(looper2), surfaceHolderCallbackC18330l, surfaceHolderCallbackC18330l, surfaceHolderCallbackC18330l, surfaceHolderCallbackC18330l);
            obj.f34681l = abstractC1091lArrCrashlytics;
            AbstractC12442l.subscription(abstractC1091lArrCrashlytics.length > 0);
            obj.f34686l = new AbstractC1091l[abstractC1091lArrCrashlytics.length];
            int i3 = 0;
            while (true) {
                AbstractC1091l[] abstractC1091lArr = obj.f34686l;
                if (i3 >= abstractC1091lArr.length) {
                    break;
                }
                int i4 = obj.f34681l[i3].f3012l;
                abstractC1091lArr[i3] = null;
                i3++;
                r1.f34714l.amazon();
                throw th;
            }
            C16717l c16717l = (C16717l) c15670l.purchase.get();
            obj.f34727l = c16717l;
            obj.f34738l = (C15291l) c15670l.amazon.f2282l;
            C7713l c7713l = (C7713l) c15670l.mopub.get();
            obj.f34683l = c7713l;
            obj.f34702l = c15670l.metrica;
            C17654l c17654l = c15670l.startapp;
            obj.f34724l = c15670l.ads;
            obj.f34711l = c15670l.subscription;
            obj.f34716l = c15670l.tapsense;
            obj.f34694l = c15670l.adcel;
            obj.f34685l = looper2;
            obj.f34676l = c18527l3;
            obj.f34729l = obj;
            obj.f34677l = new C8961l(looper2, c18527l3, new C6788l(obj, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            obj.f34734l = copyOnWriteArraySet;
            obj.f34693l = new ArrayList();
            obj.f34678l = new C12800l();
            AbstractC1091l[] abstractC1091lArr2 = obj.f34681l;
            C9598l c9598l = new C9598l(new C17614l[abstractC1091lArr2.length], new InterfaceC10376l[abstractC1091lArr2.length], C1047l.loadAd, (Object) null);
            obj.f34698l = c9598l;
            obj.f34712l = new C3904l();
            C6921l c6921l = new C6921l(5);
            c6921l.amazon(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            c6921l.loadAd(29);
            if (c15670l.remoteconfig) {
                c6921l.loadAd(23);
            }
            if (c15670l.remoteconfig) {
                c6921l.loadAd(25);
            }
            if (c15670l.remoteconfig) {
                c6921l.loadAd(33);
            }
            if (c15670l.remoteconfig) {
                c6921l.loadAd(26);
            }
            if (c15670l.remoteconfig) {
                c6921l.loadAd(34);
            }
            C4094l c4094lPurchase = c6921l.purchase();
            obj.f34680l = new C16616l(c4094lPurchase);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i5 = 0; i5 < c4094lPurchase.yandex.size(); i5++) {
                int iLoadAd = c4094lPurchase.loadAd(i5);
                AbstractC12442l.subscription(!false);
                sparseBooleanArray.append(iLoadAd, true);
            }
            AbstractC12442l.subscription(!false);
            sparseBooleanArray.append(4, true);
            AbstractC12442l.subscription(!false);
            sparseBooleanArray.append(10, true);
            AbstractC12442l.subscription(!false);
            obj.f34697l = new C16616l(new C4094l(sparseBooleanArray));
            obj.f34709l = c18527l3.yandex(looper2, null);
            C6788l c6788l = new C6788l(obj, 1);
            obj.f34731l = c6788l;
            obj.f34691l = C10749l.firebase(c9598l);
            obj.f34701l.m4398import(obj, looper2);
            C17849l c17849l = new C17849l(c15670l.inmobi);
            C0477l c0477l = new C0477l(obj.f34713l, obj.f34681l, obj.f34686l, c16717l, c9598l, (C7865l) c15670l.billing.get(), c7713l, obj.f34710l, obj.f34723l, obj.f34701l, c17654l, c15670l.Signature, c15670l.license, looper2, c18527l3, c6788l, c17849l, obj.f34696l, c15670l.f30636package);
            C14500l c14500l = c0477l.f1746l;
            obj.f34725l = c0477l;
            Looper looper3 = c0477l.f1766l;
            obj.f34700l = 1.0f;
            obj.f34710l = 0;
            C3852l c3852l = C3852l.f7980private;
            obj.f34717l = c3852l;
            obj.f34704l = c3852l;
            obj.f34728l = c3852l;
            obj.f34706l = -1;
            obj.f34672l = C16684l.amazon;
            obj.f34715l = true;
            obj.Signature(obj.f34701l);
            Handler handler = new Handler(looper2);
            C17505l c17505l = obj.f34701l;
            c7713l.getClass();
            c17505l.getClass();
            C8663l c8663l = c7713l.crashlytics;
            c8663l.getClass();
            CopyOnWriteArrayList<C1766l> copyOnWriteArrayList = c8663l.yandex;
            for (C1766l c1766l : copyOnWriteArrayList) {
                if (c1766l.loadAd == c17505l) {
                    c1766l.crashlytics = true;
                    copyOnWriteArrayList.remove(c1766l);
                }
            }
            copyOnWriteArrayList.add(new C1766l(handler, c17505l));
            copyOnWriteArraySet.add(obj.f34739l);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 31) {
                try {
                    Context context2 = obj.f34713l;
                    try {
                        boolean z = c15670l.premium;
                        C14500l c14500lYandex = c18527l3.yandex(c0477l.f1766l, null);
                        i = 5;
                        try {
                            RunnableC14553l runnableC14553l = new RunnableC14553l(context2, z, this, c17849l, 0);
                            r2 = this;
                            c14500lYandex.amazon(runnableC14553l);
                        } catch (Throwable th) {
                            th = th;
                            r1 = this;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = this;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r1 = obj;
                }
            } else {
                i = 5;
                r2 = obj;
            }
            ?? r9 = r2;
            try {
                C1080l c1080l = new C1080l((Object) 0, looper3, looper2, c18527l3, (InterfaceC14342l) new C6788l(r2, 2));
                r9.f34703l = c1080l;
                c1080l.m797private(new RunnableC11297l(i, (Object) r9));
                ?? r10 = context;
                try {
                    C11919l c11919l = new C11919l(r10, looper3, c15670l.admob, r9.f34739l, c18527l3);
                    r9.f34708l = c11919l;
                    c11919l.ads(c15670l.smaato);
                    if (c15670l.appmetrica) {
                        C10685l c10685l = c15670l.f30637throws;
                        r9.f34736l = c10685l;
                        looper = looper3;
                        i2 = 2;
                        c10685l.pro(new C6788l(r9, 1), r9.f34713l, looper2, looper, c18527l3);
                        c18527l = c18527l3;
                    } else {
                        looper = looper3;
                        c18527l = c18527l3;
                        i2 = 2;
                        r9.f34736l = null;
                    }
                    try {
                        if (c15670l.remoteconfig) {
                            try {
                                ?? r4 = r10;
                                ?? r11 = r9;
                                C18527l c18527l4 = c18527l;
                                C1080l c1080l2 = new C1080l(r4, r9.f34739l, r9.f34718l.amazon(), looper, looper2, c18527l4);
                                c18527l2 = c18527l4;
                                r11.f34721l = c1080l2;
                                c1183l = null;
                                r3 = r4;
                                r10 = r11;
                            } catch (Throwable th4) {
                                th = th4;
                                r10 = r9;
                                r1 = r10;
                                r1.f34714l.amazon();
                                throw th;
                            }
                        } else {
                            r3 = r10;
                            c18527l2 = c18527l;
                            c1183l = null;
                            ?? r12 = r9;
                            r12.f34721l = null;
                            r10 = r12;
                        }
                        boolean z2 = (c15670l.ad == Integer.MAX_VALUE || c15670l.advert == Integer.MAX_VALUE || c15670l.isVip == Integer.MAX_VALUE || c15670l.signatures == Integer.MAX_VALUE) ? false : true;
                        C4619l c4619l = new C4619l(r3, looper, c18527l2, 4);
                        r10.f34674l = c4619l;
                        c4619l.m1565private(z2);
                        C4619l c4619l2 = new C4619l(r3, looper, c18527l2, i);
                        r10.f34705l = c4619l2;
                        c4619l2.m1565private(false);
                        r10.f34684l = C2848l.purchase;
                        r10.f34673l = C15074l.amazon;
                        r10.f34707l = C5989l.crashlytics;
                        r10.f34671l = i6 >= 34 ? new C1183l(r10, r3) : c1183l;
                        r10.f34732l = new C10023l(23);
                        r10.f34695l = new C10023l(23);
                        obj = r10;
                        obj.f34726l = new C18289l((C17804l) obj, r10.f34739l, r10.f34676l, c15670l.ad, c15670l.advert, c15670l.isVip, c15670l.signatures);
                        c14500l.loadAd(38, obj.f34694l).loadAd();
                        C13736l c13736l = obj.f34718l;
                        boolean z3 = c15670l.firebase;
                        c14500l.getClass();
                        C3485l c3485lCrashlytics = C14500l.crashlytics();
                        c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(31, z3 ? 1 : 0, 0, c13736l);
                        c3485lCrashlytics.loadAd();
                        obj.m4417l(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03ea: INVOKE 
                              (r1v14 'obj' ?? I:l￙ﾘ￙ﾍ￘ﾖ)
                              (r4v17 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                              (3 int)
                              (wrap l￙ﾒￛﾢ:0x03e7: IGET (r1v14 'obj' ?? I:l￙ﾘ￙ﾍ￘ﾖ) A[Catch: all -> 0x00b4, WRAPPED] (LINE:1000) l￙ﾘ￙ﾍ￘ﾖ.l￙ﾐ￙ﾟ l￙ﾒￛﾢ)
                             VIRTUAL call: l￙ﾘ￙ﾍ￘ﾖ.l￘ﾓￛﾚￛﾟ(int, int, java.lang.Object):void A[Catch: all -> 0x00b4, MD:(int, int, java.lang.Object):void (m)] (LINE:1003) in method: l￙ﾘ￙ﾍ￘ﾖ.<init>(l￙ﾕ￙ﾓￛﾖ):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v17 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1108
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17804l.<init>(lٕٓۖ):void");
                    }

                    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
                    public static long m4409l(C10749l c10749l) {
                        C4322l c4322l = new C4322l();
                        C3904l c3904l = new C3904l();
                        c10749l.yandex.mopub(c10749l.loadAd.yandex, c3904l);
                        long j = c10749l.crashlytics;
                        return j == -9223372036854775807L ? c10749l.yandex.remoteconfig(c3904l.crashlytics, c4322l, 0L).smaato : c3904l.purchase + j;
                    }

                    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
                    public static C10749l m4410l(C10749l c10749l, int i) {
                        C10749l c10749lAdmob = c10749l.admob(i);
                        return (i == 1 || i == 4) ? c10749lAdmob.loadAd(false) : c10749lAdmob;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void Signature(InterfaceC13521l interfaceC13521l) {
                        interfaceC13521l.getClass();
                        this.f34677l.yandex(interfaceC13521l);
                    }

                    /* JADX INFO: renamed from: abstract, reason: not valid java name */
                    public final C3852l m4411abstract() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        if (abstractC10759lMo2791l.startapp()) {
                            return this.f34728l;
                        }
                        C2427l c2427l = abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f34699l, 0L).crashlytics;
                        C3117l c3117lYandex = this.f34728l.yandex();
                        C3852l c3852l = c2427l.amazon;
                        if (c3852l != null) {
                            AbstractC1186l abstractC1186l = c3852l.f7992native;
                            byte[] bArr = c3852l.firebase;
                            CharSequence charSequence = c3852l.yandex;
                            if (charSequence != null) {
                                c3117lYandex.yandex = charSequence;
                            }
                            CharSequence charSequence2 = c3852l.loadAd;
                            if (charSequence2 != null) {
                                c3117lYandex.loadAd = charSequence2;
                            }
                            CharSequence charSequence3 = c3852l.crashlytics;
                            if (charSequence3 != null) {
                                c3117lYandex.crashlytics = charSequence3;
                            }
                            CharSequence charSequence4 = c3852l.amazon;
                            if (charSequence4 != null) {
                                c3117lYandex.amazon = charSequence4;
                            }
                            CharSequence charSequence5 = c3852l.purchase;
                            if (charSequence5 != null) {
                                c3117lYandex.purchase = charSequence5;
                            }
                            CharSequence charSequence6 = c3852l.billing;
                            if (charSequence6 != null) {
                                c3117lYandex.billing = charSequence6;
                            }
                            CharSequence charSequence7 = c3852l.mopub;
                            if (charSequence7 != null) {
                                c3117lYandex.mopub = charSequence7;
                            }
                            Long l = c3852l.admob;
                            if (l != null) {
                                c3117lYandex.crashlytics(l);
                            }
                            AbstractC7778l abstractC7778l = c3852l.subs;
                            if (abstractC7778l != null) {
                                c3117lYandex.subs = abstractC7778l;
                            }
                            AbstractC7778l abstractC7778l2 = c3852l.isPro;
                            if (abstractC7778l2 != null) {
                                c3117lYandex.isPro = abstractC7778l2;
                            }
                            Uri uri = c3852l.vip;
                            if (uri != null || bArr != null) {
                                c3117lYandex.vip = uri;
                                c3117lYandex.loadAd(bArr, c3852l.remoteconfig);
                                c3117lYandex.smaato = c3852l.smaato;
                            }
                            Integer num = c3852l.metrica;
                            if (num != null) {
                                c3117lYandex.metrica = num;
                            }
                            Integer num2 = c3852l.startapp;
                            if (num2 != null) {
                                c3117lYandex.startapp = num2;
                            }
                            Integer num3 = c3852l.adcel;
                            if (num3 != null) {
                                c3117lYandex.adcel = num3;
                            }
                            Boolean bool = c3852l.ads;
                            if (bool != null) {
                                c3117lYandex.ads = bool;
                            }
                            Boolean bool2 = c3852l.subscription;
                            if (bool2 != null) {
                                c3117lYandex.subscription = bool2;
                            }
                            Integer num4 = c3852l.tapsense;
                            if (num4 != null) {
                                c3117lYandex.tapsense = num4;
                            }
                            Integer num5 = c3852l.Signature;
                            if (num5 != null) {
                                c3117lYandex.tapsense = num5;
                            }
                            Integer num6 = c3852l.license;
                            if (num6 != null) {
                                c3117lYandex.Signature = num6;
                            }
                            Integer num7 = c3852l.pro;
                            if (num7 != null) {
                                c3117lYandex.license = num7;
                            }
                            Integer num8 = c3852l.ad;
                            if (num8 != null) {
                                c3117lYandex.pro = num8;
                            }
                            Integer num9 = c3852l.advert;
                            if (num9 != null) {
                                c3117lYandex.ad = num9;
                            }
                            Integer num10 = c3852l.isVip;
                            if (num10 != null) {
                                c3117lYandex.advert = num10;
                            }
                            CharSequence charSequence8 = c3852l.signatures;
                            if (charSequence8 != null) {
                                c3117lYandex.isVip = charSequence8;
                            }
                            CharSequence charSequence9 = c3852l.premium;
                            if (charSequence9 != null) {
                                c3117lYandex.signatures = charSequence9;
                            }
                            CharSequence charSequence10 = c3852l.applovin;
                            if (charSequence10 != null) {
                                c3117lYandex.premium = charSequence10;
                            }
                            Integer num11 = c3852l.appmetrica;
                            if (num11 != null) {
                                c3117lYandex.applovin = num11;
                            }
                            Integer num12 = c3852l.inmobi;
                            if (num12 != null) {
                                c3117lYandex.appmetrica = num12;
                            }
                            CharSequence charSequence11 = c3852l.f7996throws;
                            if (charSequence11 != null) {
                                c3117lYandex.inmobi = charSequence11;
                            }
                            CharSequence charSequence12 = c3852l.f7993package;
                            if (charSequence12 != null) {
                                c3117lYandex.f6663throws = charSequence12;
                            }
                            CharSequence charSequence13 = c3852l.f7995synchronized;
                            if (charSequence13 != null) {
                                c3117lYandex.f6660package = charSequence13;
                            }
                            Integer num13 = c3852l.f7994strictfp;
                            if (num13 != null) {
                                c3117lYandex.f6662synchronized = num13;
                            }
                            Bundle bundle = c3852l.f7997volatile;
                            if (bundle != null) {
                                c3117lYandex.f6661strictfp = bundle;
                            }
                            if (!abstractC1186l.isEmpty()) {
                                c3117lYandex.f6664volatile = AbstractC1186l.Signature(abstractC1186l);
                            }
                        }
                        return new C3852l(c3117lYandex);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final int ad() {
                        m4415l();
                        if (!this.f34691l.yandex.startapp()) {
                            C10749l c10749l = this.f34691l;
                            return c10749l.yandex.loadAd(c10749l.loadAd.yandex);
                        }
                        int i = this.f34706l;
                        if (i == -1) {
                            return 0;
                        }
                        return i;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void adcel() {
                        mo2810throw(0, Alert.DURATION_SHOW_INDEFINITELY);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final int admob() {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            return ((C12551l) ((C1080l) c1080l.f2974l).tapsense()).loadAd;
                        }
                        return 0;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void ads(boolean z) {
                        m4415l();
                        if (this.f34723l != z) {
                            this.f34723l = z;
                            C14500l c14500l = this.f34725l.f1746l;
                            c14500l.getClass();
                            C3485l c3485lCrashlytics = C14500l.crashlytics();
                            c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(12, z ? 1 : 0, 0);
                            c3485lCrashlytics.loadAd();
                            C7603l c7603l = new C7603l(z, 1);
                            C8961l c8961l = this.f34677l;
                            c8961l.crashlytics(9, c7603l);
                            m4430l();
                            c8961l.loadAd();
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final C15074l advert() {
                        m4415l();
                        return this.f34673l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final boolean amazon() {
                        m4415l();
                        return this.f34691l.mopub;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final C13736l applovin() {
                        m4415l();
                        return this.f34718l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void appmetrica(int i, boolean z) {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            ((C1080l) c1080l.f2974l).m799switch(new C10191l(c1080l, z), new C11770l(c1080l, z, i));
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final C1372l billing() {
                        m4415l();
                        return this.f34691l.metrica;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: break */
                    public final void mo2748break(C13736l c13736l, boolean z) {
                        m4415l();
                        if (this.f34688l) {
                            return;
                        }
                        boolean zEquals = Objects.equals(this.f34718l, c13736l);
                        int i = 0;
                        C8961l c8961l = this.f34677l;
                        if (!zEquals) {
                            this.f34718l = c13736l;
                            m4417l(1, 3, c13736l);
                            C1080l c1080l = this.f34721l;
                            if (c1080l != null) {
                                int iAmazon = c13736l.amazon();
                                C1080l c1080l2 = (C1080l) c1080l.f2974l;
                                C1283l c1283l = new C1283l(c1080l, iAmazon, 2);
                                c1080l2.getClass();
                                AbstractC12442l.subscription(Looper.myLooper() == ((C14500l) c1080l2.f2975l).yandex.getLooper());
                                c1080l2.f2972l++;
                                c1080l2.m797private(new RunnableC7762l(c1080l2, c1283l, 11));
                                C12551l c12551l = (C12551l) c1080l2.f2976l;
                                c1080l2.m789continue(new C12551l(c12551l.crashlytics, iAmazon, c12551l.loadAd, c12551l.amazon, c12551l.purchase));
                            }
                            c8961l.crashlytics(20, new C2741l(c13736l, i));
                        }
                        C13736l c13736l2 = this.f34718l;
                        C14500l c14500l = this.f34725l.f1746l;
                        c14500l.getClass();
                        C3485l c3485lCrashlytics = C14500l.crashlytics();
                        c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(31, z ? 1 : 0, 0, c13736l2);
                        c3485lCrashlytics.loadAd();
                        c8961l.loadAd();
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: case */
                    public final void mo2749case() {
                        if (mo2791l().startapp() || subs()) {
                            m4415l();
                            return;
                        }
                        boolean zM4425l = m4425l();
                        if (mo2777l() && !mo2793l()) {
                            if (zM4425l) {
                                m4424l();
                                return;
                            } else {
                                m4415l();
                                return;
                            }
                        }
                        if (zM4425l) {
                            long jMo2771l = mo2771l();
                            m4415l();
                            if (jMo2771l <= this.f34716l) {
                                m4424l();
                                return;
                            }
                        }
                        m4414l(mo2761implements(), 0L, false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: catch */
                    public final void mo2750catch(SurfaceHolder surfaceHolder) {
                        m4415l();
                        if (surfaceHolder == null) {
                            m4415l();
                            m4429l();
                            m4423l(null);
                            m4433l(0, 0);
                            return;
                        }
                        m4429l();
                        this.f34689l = true;
                        this.f34737l = surfaceHolder;
                        surfaceHolder.addCallback(this.f34739l);
                        Surface surface = surfaceHolder.getSurface();
                        if (surface == null || !surface.isValid()) {
                            m4423l(null);
                            m4433l(0, 0);
                        } else {
                            m4423l(surface);
                            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                            m4433l(surfaceFrame.width(), surfaceFrame.height());
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: class */
                    public final void mo2751class(int i) {
                        m4414l(i, -9223372036854775807L, false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: const */
                    public final void mo2752const(int i) {
                        m4415l();
                        if (this.f34710l != i) {
                            this.f34710l = i;
                            C14500l c14500l = this.f34725l.f1746l;
                            c14500l.getClass();
                            C3485l c3485lCrashlytics = C14500l.crashlytics();
                            c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(11, i, 0);
                            c3485lCrashlytics.loadAd();
                            C10503l c10503l = new C10503l(i, 0);
                            C8961l c8961l = this.f34677l;
                            c8961l.crashlytics(8, c10503l);
                            m4430l();
                            c8961l.loadAd();
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: continue */
                    public final void mo2753continue(boolean z) {
                        m4415l();
                        m4412l(1, z);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void crashlytics(float f) {
                        loadAd(new C1372l(f, billing().loadAd));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: default */
                    public final void mo2754default(int i, List list) {
                        m4415l();
                        ArrayList arrayListM4416l = m4416l(list);
                        m4415l();
                        AbstractC12442l.admob(i >= 0);
                        int iMin = Math.min(i, this.f34693l.size());
                        if (!this.f34691l.yandex.startapp()) {
                            m4427l(remoteconfig(this.f34691l, iMin, arrayListM4416l), 0, false, 5, -9223372036854775807L, -1, false);
                            return;
                        }
                        boolean z = this.f34706l == -1;
                        m4415l();
                        m4426l(arrayListM4416l, -1, -9223372036854775807L, z);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: else */
                    public final void mo2755else(float f) {
                        m4415l();
                        float fSubs = AbstractC15323l.subs(f, 0.0f, 1.0f);
                        float f2 = this.f34700l;
                        if (f2 == fSubs) {
                            return;
                        }
                        if (fSubs != 0.0f) {
                            f2 = fSubs;
                        }
                        this.f34719l = f2;
                        this.f34700l = fSubs;
                        this.f34725l.f1746l.loadAd(32, Float.valueOf(fSubs)).loadAd();
                        this.f34677l.mopub(22, new C4605l(0, fSubs));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: extends */
                    public final void mo2756extends(int i) {
                        mo2810throw(i, i + 1);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: final */
                    public final void mo2757final() {
                        m4415l();
                        if (this.f34700l == 0.0f) {
                            float f = this.f34719l;
                            if (f != 0.0f) {
                                mo2755else(f);
                            }
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: finally */
                    public final boolean mo2758finally() {
                        return purchase() == 3 && startapp() && mo2770l() == 0;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final long firebase() {
                        m4415l();
                        return AbstractC15323l.m3986try(this.f34691l.ads);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: for */
                    public final void mo2759for(long j) {
                        m4414l(mo2761implements(), j, false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final long getDuration() {
                        m4415l();
                        if (!subs()) {
                            return pro();
                        }
                        C10749l c10749l = this.f34691l;
                        C5019l c5019l = c10749l.loadAd;
                        AbstractC10759l abstractC10759l = c10749l.yandex;
                        Object obj = c5019l.yandex;
                        C3904l c3904l = this.f34712l;
                        abstractC10759l.mopub(obj, c3904l);
                        return AbstractC15323l.m3986try(c3904l.yandex(c5019l.loadAd, c5019l.crashlytics));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: goto */
                    public final void mo2760goto() {
                        int iMo2813try = mo2813try();
                        if (iMo2813try == -1) {
                            m4415l();
                        } else if (iMo2813try == mo2761implements()) {
                            m4414l(mo2761implements(), -9223372036854775807L, true);
                        } else {
                            m4414l(iMo2813try, -9223372036854775807L, false);
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: implements */
                    public final int mo2761implements() {
                        m4415l();
                        int iM4420l = m4420l(this.f34691l);
                        if (iM4420l == -1) {
                            return 0;
                        }
                        return iM4420l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: import */
                    public final C1047l mo2762import() {
                        m4415l();
                        return (C1047l) this.f34691l.subs.f19552l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final C2848l inmobi() {
                        m4415l();
                        return this.f34684l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: instanceof */
                    public final boolean mo2763instanceof() {
                        return mo2813try() != -1;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: interface */
                    public final long mo2764interface() {
                        m4415l();
                        return this.f34711l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final long isPro() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        if (abstractC10759lMo2791l.startapp()) {
                            return -9223372036854775807L;
                        }
                        int iMo2761implements = mo2761implements();
                        C4322l c4322l = this.f34699l;
                        if (abstractC10759lMo2791l.remoteconfig(iMo2761implements, c4322l, 0L).billing == -9223372036854775807L) {
                            return -9223372036854775807L;
                        }
                        return (AbstractC15323l.inmobi(c4322l.mopub) - c4322l.billing) - mo2804static();
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void isVip() {
                        m4424l();
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final int license() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        if (abstractC10759lMo2791l.startapp()) {
                            return -1;
                        }
                        int iMo2761implements = mo2761implements();
                        m4415l();
                        int i = this.f34710l;
                        if (i == 1) {
                            i = 0;
                        }
                        m4415l();
                        return abstractC10759lMo2791l.firebase(iMo2761implements, i, this.f34723l);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void loadAd(C1372l c1372l) {
                        m4415l();
                        if (c1372l == null) {
                            c1372l = C1372l.amazon;
                        }
                        if (this.f34691l.metrica.equals(c1372l)) {
                            return;
                        }
                        C10749l c10749lMopub = this.f34691l.mopub(c1372l);
                        this.f34692l++;
                        this.f34725l.f1746l.loadAd(4, c1372l).loadAd();
                        m4427l(c10749lMopub, 0, false, 5, -9223372036854775807L, -1, false);
                    }

                    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
                    public final void m4412l(int i, boolean z) {
                        int i2;
                        C10685l c10685l = this.f34736l;
                        if (c10685l == null || ((InterfaceC17224l) c10685l.f21690l).vip()) {
                            i2 = (this.f34691l.vip != 1 || z) ? 0 : 1;
                        } else {
                            i2 = 3;
                        }
                        C10749l c10749lYandex = this.f34691l;
                        if (c10749lYandex.smaato == z && c10749lYandex.vip == i2 && c10749lYandex.remoteconfig == i) {
                            return;
                        }
                        this.f34692l++;
                        if (c10749lYandex.startapp) {
                            c10749lYandex = c10749lYandex.yandex();
                        }
                        C10749l c10749lPurchase = c10749lYandex.purchase(i, i2, z);
                        int i3 = i | (i2 << 4);
                        C14500l c14500l = this.f34725l.f1746l;
                        c14500l.getClass();
                        C3485l c3485lCrashlytics = C14500l.crashlytics();
                        c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(1, z ? 1 : 0, i3);
                        c3485lCrashlytics.loadAd();
                        m4427l(c10749lPurchase, 0, false, 5, -9223372036854775807L, -1, false);
                    }

                    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
                    public final C10749l m4413l(C10749l c10749l, AbstractC10759l abstractC10759l, Pair pair) {
                        List list;
                        AbstractC12442l.admob(abstractC10759l.startapp() || pair != null);
                        AbstractC10759l abstractC10759l2 = c10749l.yandex;
                        long jM4432l = m4432l(c10749l);
                        C10749l c10749lIsPro = c10749l.isPro(abstractC10759l);
                        if (abstractC10759l.startapp()) {
                            C5019l c5019l = C10749l.Signature;
                            long jM3962continue = AbstractC15323l.m3962continue(this.f34679l);
                            C10749l c10749lCrashlytics = c10749lIsPro.amazon(c5019l, jM3962continue, jM3962continue, jM3962continue, 0L, C8750l.amazon, this.f34698l, C13708l.f26763l).crashlytics(c5019l);
                            c10749lCrashlytics.adcel = c10749lCrashlytics.subscription;
                            return c10749lCrashlytics;
                        }
                        Object obj = c10749lIsPro.loadAd.yandex;
                        String str = AbstractC15323l.yandex;
                        boolean zEquals = obj.equals(pair.first);
                        C5019l c5019l2 = !zEquals ? new C5019l(pair.first) : c10749lIsPro.loadAd;
                        long jLongValue = ((Long) pair.second).longValue();
                        long jM3962continue2 = AbstractC15323l.m3962continue(jM4432l);
                        if (!abstractC10759l2.startapp()) {
                            jM3962continue2 -= abstractC10759l2.mopub(obj, this.f34712l).purchase;
                            if (zEquals && jM3962continue2 - jLongValue == 1 && jM3962continue2 == abstractC10759l2.mopub(obj, this.f34712l).amazon) {
                                jM3962continue2--;
                            }
                        }
                        if (!zEquals || jLongValue < jM3962continue2) {
                            C5019l c5019l3 = c5019l2;
                            AbstractC12442l.subscription(!c5019l3.loadAd());
                            C8750l c8750l = !zEquals ? C8750l.amazon : c10749lIsPro.admob;
                            C9598l c9598l = !zEquals ? this.f34698l : c10749lIsPro.subs;
                            if (zEquals) {
                                list = c10749lIsPro.isPro;
                            } else {
                                C9258l c9258l = AbstractC1186l.f3181l;
                                list = C13708l.f26763l;
                            }
                            C10749l c10749lCrashlytics2 = c10749lIsPro.amazon(c5019l3, jLongValue, jLongValue, jLongValue, 0L, c8750l, c9598l, list).crashlytics(c5019l3);
                            c10749lCrashlytics2.adcel = jLongValue;
                            return c10749lCrashlytics2;
                        }
                        if (jLongValue != jM3962continue2) {
                            C5019l c5019l4 = c5019l2;
                            AbstractC12442l.subscription(!c5019l4.loadAd());
                            long jMax = Math.max(0L, c10749lIsPro.ads - (jLongValue - jM3962continue2));
                            long j = c10749lIsPro.adcel;
                            if (c10749lIsPro.firebase.equals(c10749lIsPro.loadAd)) {
                                j = jLongValue + jMax;
                            }
                            C10749l c10749lAmazon = c10749lIsPro.amazon(c5019l4, jLongValue, jLongValue, jLongValue, jMax, c10749lIsPro.admob, c10749lIsPro.subs, c10749lIsPro.isPro);
                            c10749lAmazon.adcel = j;
                            return c10749lAmazon;
                        }
                        int iLoadAd = abstractC10759l.loadAd(c10749lIsPro.firebase.yandex);
                        if (iLoadAd != -1 && abstractC10759l.billing(iLoadAd, this.f34712l, false).crashlytics == abstractC10759l.mopub(c5019l2.yandex, this.f34712l).crashlytics) {
                            return c10749lIsPro;
                        }
                        abstractC10759l.mopub(c5019l2.yandex, this.f34712l);
                        boolean zLoadAd = c5019l2.loadAd();
                        C3904l c3904l = this.f34712l;
                        long jYandex = zLoadAd ? c3904l.yandex(c5019l2.loadAd, c5019l2.crashlytics) : c3904l.amazon;
                        C5019l c5019l5 = c5019l2;
                        C10749l c10749lCrashlytics3 = c10749lIsPro.amazon(c5019l5, c10749lIsPro.subscription, c10749lIsPro.subscription, c10749lIsPro.amazon, jYandex - c10749lIsPro.subscription, c10749lIsPro.admob, c10749lIsPro.subs, c10749lIsPro.isPro).crashlytics(c5019l5);
                        c10749lCrashlytics3.adcel = jYandex;
                        return c10749lCrashlytics3;
                    }

                    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
                    public final void m4414l(int i, long j, boolean z) {
                        m4415l();
                        if (i == -1) {
                            return;
                        }
                        AbstractC12442l.admob(i >= 0);
                        AbstractC10759l abstractC10759l = this.f34691l.yandex;
                        if (abstractC10759l.startapp() || i < abstractC10759l.metrica()) {
                            C17505l c17505l = this.f34701l;
                            if (!c17505l.f34109l) {
                                C5597l c5597lM4400static = c17505l.m4400static();
                                c17505l.f34109l = true;
                                c17505l.m4401super(c5597lM4400static, -1, new C18725l(c5597lM4400static, 15));
                            }
                            this.f34692l++;
                            if (subs()) {
                                AbstractC6427l.vip("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                                C5453l c5453l = new C5453l(this.f34691l);
                                c5453l.purchase(1);
                                C17804l c17804l = this.f34731l.f14221l;
                                c17804l.f34709l.amazon(new RunnableC0336l(c17804l, c5453l, 22));
                                return;
                            }
                            C10749l c10749lAdmob = this.f34691l;
                            int i2 = c10749lAdmob.purchase;
                            if (i2 == 3 || (i2 == 4 && !abstractC10759l.startapp())) {
                                c10749lAdmob = this.f34691l.admob(2);
                            }
                            int iMo2761implements = mo2761implements();
                            C10749l c10749lM4413l = m4413l(c10749lAdmob, abstractC10759l, m4435l(abstractC10759l, i, j));
                            this.f34725l.f1746l.loadAd(3, new C6817l(abstractC10759l, i, AbstractC15323l.m3962continue(j))).loadAd();
                            m4427l(c10749lM4413l, 0, true, 1, m4421l(c10749lM4413l), iMo2761implements, z);
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؚۣؒ */
                    public final void mo2765l() {
                        m4415l();
                        if (this.f34700l != 0.0f) {
                            mo2755else(0.0f);
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lۣؒٞ */
                    public final C4970l mo2766l() {
                        m4415l();
                        return this.f34727l.admob();
                    }

                    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
                    public final void m4415l() {
                        this.f34714l.loadAd();
                        Thread threadCurrentThread = Thread.currentThread();
                        Looper looper = this.f34685l;
                        if (threadCurrentThread != looper.getThread()) {
                            String name = Thread.currentThread().getName();
                            String name2 = looper.getThread().getName();
                            String str = AbstractC15323l.yandex;
                            Locale locale = Locale.US;
                            String strAds = AbstractC14814l.ads("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
                            if (this.f34715l) {
                                C8339l.smaato(strAds);
                            } else {
                                AbstractC6427l.metrica("ExoPlayerImpl", strAds, this.f34730l ? null : new IllegalStateException());
                                this.f34730l = true;
                            }
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؒۢۜ */
                    public final void mo2767l(C2427l c2427l) {
                        mo2769l(AbstractC1186l.isVip(c2427l));
                    }

                    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
                    public final ArrayList m4416l(List list) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < list.size(); i++) {
                            arrayList.add(this.f34738l.amazon((C2427l) list.get(i)));
                        }
                        return arrayList;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lٜؓ۠ */
                    public final void mo2768l(List list) {
                        mo2754default(Alert.DURATION_SHOW_INDEFINITELY, list);
                    }

                    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
                    public final void m4417l(int i, int i2, Object obj) {
                        C0477l c0477l;
                        AbstractC1091l[] abstractC1091lArr = this.f34681l;
                        int length = abstractC1091lArr.length;
                        int i3 = 0;
                        while (true) {
                            c0477l = this.f34725l;
                            if (i3 >= length) {
                                break;
                            }
                            AbstractC1091l abstractC1091l = abstractC1091lArr[i3];
                            if (i == -1 || abstractC1091l.f3012l == i) {
                                int iM4420l = m4420l(this.f34691l);
                                AbstractC10759l abstractC10759l = this.f34691l.yandex;
                                if (iM4420l == -1) {
                                    iM4420l = 0;
                                }
                                C9087l c9087l = new C9087l(c0477l, abstractC1091l, abstractC10759l, iM4420l, c0477l.f1766l);
                                AbstractC12442l.subscription(!c9087l.billing);
                                c9087l.crashlytics = i2;
                                AbstractC12442l.subscription(!c9087l.billing);
                                c9087l.amazon = obj;
                                c9087l.loadAd();
                            }
                            i3++;
                        }
                        for (AbstractC1091l abstractC1091l2 : this.f34686l) {
                            if (abstractC1091l2 != null && (i == -1 || abstractC1091l2.f3012l == i)) {
                                int iM4420l2 = m4420l(this.f34691l);
                                AbstractC10759l abstractC10759l2 = this.f34691l.yandex;
                                if (iM4420l2 == -1) {
                                    iM4420l2 = 0;
                                }
                                C9087l c9087l2 = new C9087l(c0477l, abstractC1091l2, abstractC10759l2, iM4420l2, c0477l.f1766l);
                                AbstractC12442l.subscription(!c9087l2.billing);
                                c9087l2.crashlytics = i2;
                                AbstractC12442l.subscription(!c9087l2.billing);
                                c9087l2.amazon = obj;
                                c9087l2.loadAd();
                            }
                        }
                    }

                    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
                    public final void m4418l(C17361l c17361l) {
                        C10749l c10749l = this.f34691l;
                        C10749l c10749lCrashlytics = c10749l.crashlytics(c10749l.loadAd);
                        c10749lCrashlytics.adcel = c10749lCrashlytics.subscription;
                        c10749lCrashlytics.ads = 0L;
                        C10749l c10749lM4410l = m4410l(c10749lCrashlytics, 1);
                        if (c17361l != null) {
                            c10749lM4410l = c10749lM4410l.billing(c17361l);
                        }
                        this.f34692l++;
                        this.f34725l.f1746l.yandex(6).loadAd();
                        m4427l(c10749lM4410l, 0, false, 5, -9223372036854775807L, -1, false);
                    }

                    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
                    public final void m4419l(boolean z) {
                        m4415l();
                        if (this.f34735l == z) {
                            return;
                        }
                        this.f34735l = z;
                        m4417l(1, 9, Boolean.valueOf(z));
                        this.f34677l.mopub(23, new C7603l(z, 0));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؙؔؑ */
                    public final void mo2769l(List list) {
                        m4415l();
                        ArrayList arrayListM4416l = m4416l(list);
                        m4415l();
                        m4426l(arrayListM4416l, -1, -9223372036854775807L, true);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؔٙؕ */
                    public final int mo2770l() {
                        m4415l();
                        return this.f34691l.vip;
                    }

                    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
                    public final int m4420l(C10749l c10749l) {
                        return c10749l.yandex.startapp() ? this.f34706l : c10749l.yandex.mopub(c10749l.loadAd.yandex, this.f34712l).crashlytics;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lّؗؑ */
                    public final long mo2771l() {
                        m4415l();
                        return AbstractC15323l.m3986try(m4421l(this.f34691l));
                    }

                    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
                    public final long m4421l(C10749l c10749l) {
                        if (c10749l.yandex.startapp()) {
                            return AbstractC15323l.m3962continue(this.f34679l);
                        }
                        long jSmaato = c10749l.startapp ? c10749l.smaato() : c10749l.subscription;
                        if (c10749l.loadAd.loadAd()) {
                            return jSmaato;
                        }
                        AbstractC10759l abstractC10759l = c10749l.yandex;
                        Object obj = c10749l.loadAd.yandex;
                        C3904l c3904l = this.f34712l;
                        abstractC10759l.mopub(obj, c3904l);
                        return jSmaato + c3904l.purchase;
                    }

                    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
                    public final Pair m4422l(AbstractC10759l abstractC10759l, C12164l c12164l, int i, long j) {
                        if (abstractC10759l.startapp() || c12164l.startapp()) {
                            boolean z = !abstractC10759l.startapp() && c12164l.startapp();
                            return m4435l(c12164l, z ? -1 : i, z ? -9223372036854775807L : j);
                        }
                        Pair pairSubs = abstractC10759l.subs(this.f34699l, this.f34712l, i, AbstractC15323l.m3962continue(j));
                        Object obj = pairSubs.first;
                        if (c12164l.loadAd(obj) != -1) {
                            return pairSubs;
                        }
                        int iM568continue = C0477l.m568continue(this.f34699l, this.f34712l, this.f34710l, this.f34723l, obj, abstractC10759l, c12164l);
                        if (iM568continue == -1) {
                            return m4435l(c12164l, -1, -9223372036854775807L);
                        }
                        C4322l c4322l = this.f34699l;
                        c12164l.remoteconfig(iM568continue, c4322l, 0L);
                        return m4435l(c12164l, iM568continue, AbstractC15323l.m3986try(c4322l.smaato));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؘِٞ */
                    public final void mo2772l(int i) {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            int i2 = 1;
                            ((C1080l) c1080l.f2974l).m799switch(new C1153l(i, i2), new C9602l(c1080l, i, i2));
                        }
                    }

                    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
                    public final void m4423l(Surface surface) {
                        Object obj = this.f34682l;
                        boolean zCrashlytics = true;
                        boolean z = (obj == null || obj == surface) ? false : true;
                        long j = z ? this.f34720l : -9223372036854775807L;
                        C0477l c0477l = this.f34725l;
                        if (!c0477l.f1767l && c0477l.f1766l.getThread().isAlive()) {
                            C5811l c5811l = new C5811l(c0477l.f1751l);
                            c0477l.f1746l.loadAd(30, new Pair(surface, c5811l)).loadAd();
                            if (j != -9223372036854775807L) {
                                zCrashlytics = c5811l.crashlytics(j);
                            }
                        }
                        if (z) {
                            Object obj2 = this.f34682l;
                            Surface surface2 = this.f34733l;
                            if (obj2 == surface2) {
                                surface2.release();
                                this.f34733l = null;
                            }
                        }
                        this.f34682l = surface;
                        if (zCrashlytics) {
                            return;
                        }
                        m4418l(new C17361l(2, new C6451l("Detaching surface timed out.", 3, (byte) 0), 1003));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؙٗۛ */
                    public final void mo2773l() {
                        m4415l();
                        long jMo2771l = mo2771l() + (-this.f34724l);
                        long duration = getDuration();
                        if (duration != -9223372036854775807L) {
                            jMo2771l = Math.min(jMo2771l, duration);
                        }
                        m4414l(mo2761implements(), Math.max(jMo2771l, 0L), false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؙ۟ٙ */
                    public final C3852l mo2774l() {
                        m4415l();
                        return this.f34717l;
                    }

                    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
                    public final void m4424l() {
                        int iLicense = license();
                        if (iLicense == -1) {
                            m4415l();
                        } else if (iLicense == mo2761implements()) {
                            m4414l(mo2761implements(), -9223372036854775807L, true);
                        } else {
                            m4414l(iLicense, -9223372036854775807L, false);
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lٍؚۖ */
                    public final long mo2775l() {
                        m4415l();
                        return this.f34724l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؚۦ۠ */
                    public final void mo2776l(C2427l c2427l) {
                        mo2769l(AbstractC1186l.isVip(c2427l));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lًَٙ */
                    public final boolean mo2777l() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        return !abstractC10759lMo2791l.startapp() && abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f34699l, 0L).yandex();
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lًٚٔ */
                    public final C2427l mo2778l() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        if (abstractC10759lMo2791l.startapp()) {
                            return null;
                        }
                        return abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f34699l, 0L).crashlytics;
                    }

                    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
                    public final boolean m4425l() {
                        return license() != -1;
                    }

                    /* JADX WARN: Code duplicated, block: B:21:0x00a5  */
                    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
                    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
                    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
                    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
                    public final void m4426l(ArrayList arrayList, int i, long j, boolean z) {
                        long j2;
                        int i2;
                        int i3;
                        C10749l c10749lM4410l;
                        boolean z2;
                        int iYandex = i;
                        int iM4420l = m4420l(this.f34691l);
                        long jMo2771l = mo2771l();
                        this.f34692l++;
                        ArrayList arrayList2 = this.f34693l;
                        arrayList2.clear();
                        ArrayList arrayList3 = new ArrayList();
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            C16548l c16548l = new C16548l((AbstractC14384l) arrayList.get(i4), this.f34702l);
                            arrayList3.add(c16548l);
                            arrayList2.add(i4, new C14986l(c16548l.loadAd, c16548l.yandex));
                        }
                        C12800l c12800l = this.f34678l;
                        int size = arrayList3.size();
                        c12800l.getClass();
                        this.f34678l = new C12800l(new Random(c12800l.yandex.nextLong())).yandex(0, size);
                        C12164l c12164l = new C12164l(arrayList2, this.f34678l);
                        boolean zStartapp = c12164l.startapp();
                        int i5 = c12164l.mopub;
                        if (!zStartapp && iYandex >= i5) {
                            throw new C17072l(5);
                        }
                        if (!z) {
                            if (iYandex == -1) {
                                i2 = iM4420l;
                                j2 = jMo2771l;
                            } else {
                                j2 = j;
                            }
                            C10749l c10749lM4413l = m4413l(this.f34691l, c12164l, m4435l(c12164l, i2, j2));
                            i3 = c10749lM4413l.purchase;
                            if (i3 == 1) {
                                i3 = 1;
                            } else if (!c12164l.startapp()) {
                                i3 = 4;
                            } else if (i2 != -1) {
                                if (i2 >= i5) {
                                    i3 = 4;
                                } else {
                                    i3 = 2;
                                }
                            }
                            c10749lM4410l = m4410l(c10749lM4413l, i3);
                            this.f34725l.f1746l.loadAd(17, new C6428l(arrayList3, this.f34678l, i2, AbstractC15323l.m3962continue(j2))).loadAd();
                            if (!this.f34691l.loadAd.yandex.equals(c10749lM4410l.loadAd.yandex) || this.f34691l.yandex.startapp()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            m4427l(c10749lM4410l, 0, z2, 4, m4421l(c10749lM4410l), -1, false);
                        }
                        iYandex = c12164l.yandex(this.f34723l);
                        j2 = -9223372036854775807L;
                        i2 = iYandex;
                        C10749l c10749lM4413l2 = m4413l(this.f34691l, c12164l, m4435l(c12164l, i2, j2));
                        i3 = c10749lM4413l2.purchase;
                        if (i3 == 1) {
                            i3 = 1;
                        } else if (!c12164l.startapp()) {
                            i3 = 4;
                        } else if (i2 != -1) {
                            if (i2 >= i5) {
                                i3 = 4;
                            } else {
                                i3 = 2;
                            }
                        }
                        c10749lM4410l = m4410l(c10749lM4413l2, i3);
                        this.f34725l.f1746l.loadAd(17, new C6428l(arrayList3, this.f34678l, i2, AbstractC15323l.m3962continue(j2))).loadAd();
                        if (this.f34691l.loadAd.yandex.equals(c10749lM4410l.loadAd.yandex)) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        m4427l(c10749lM4410l, 0, z2, 4, m4421l(c10749lM4410l), -1, false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lٍۤٙ */
                    public final boolean mo2779l(int i) {
                        m4415l();
                        return this.f34697l.yandex(i);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lُٔۨ */
                    public final Looper mo2780l() {
                        return this.f34685l;
                    }

                    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
                    public final void m4427l(final C10749l c10749l, int i, boolean z, int i2, long j, int i3, boolean z2) {
                        Pair pair;
                        int i4;
                        C2427l c2427l;
                        final int i5;
                        int i6;
                        int i7;
                        Object obj;
                        C2427l c2427l2;
                        Object obj2;
                        long j2;
                        long j3;
                        long jM4409l;
                        long jM4409l2;
                        Object obj3;
                        C2427l c2427l3;
                        Object obj4;
                        C10749l c10749l2 = this.f34691l;
                        this.f34691l = c10749l;
                        boolean zEquals = c10749l2.yandex.equals(c10749l.yandex);
                        C4322l c4322l = this.f34699l;
                        C3904l c3904l = this.f34712l;
                        AbstractC10759l abstractC10759l = c10749l2.yandex;
                        C5019l c5019l = c10749l2.loadAd;
                        AbstractC10759l abstractC10759l2 = c10749l.yandex;
                        C5019l c5019l2 = c10749l.loadAd;
                        int i8 = 2;
                        if (abstractC10759l2.startapp() && abstractC10759l.startapp()) {
                            pair = new Pair(Boolean.FALSE, -1);
                        } else if (abstractC10759l2.startapp() != abstractC10759l.startapp()) {
                            pair = new Pair(Boolean.TRUE, 3);
                        } else if (!abstractC10759l.remoteconfig(abstractC10759l.mopub(c5019l.yandex, c3904l).crashlytics, c4322l, 0L).yandex.equals(abstractC10759l2.remoteconfig(abstractC10759l2.mopub(c5019l2.yandex, c3904l).crashlytics, c4322l, 0L).yandex)) {
                            if (z && i2 == 0) {
                                i4 = 1;
                            } else if (z && i2 == 1) {
                                i4 = 2;
                            } else {
                                if (zEquals) {
                                    C18073l.admob();
                                    return;
                                }
                                i4 = 3;
                            }
                            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
                        } else if (z && i2 == 0 && c5019l.amazon < c5019l2.amazon) {
                            pair = new Pair(Boolean.TRUE, 0);
                        } else {
                            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
                        }
                        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
                        int iIntValue = ((Integer) pair.second).intValue();
                        if (zBooleanValue) {
                            c2427l = c10749l.yandex.startapp() ? null : c10749l.yandex.remoteconfig(c10749l.yandex.mopub(c10749l.loadAd.yandex, this.f34712l).crashlytics, this.f34699l, 0L).crashlytics;
                            this.f34728l = C3852l.f7980private;
                        } else {
                            c2427l = null;
                        }
                        if (zBooleanValue || !c10749l2.isPro.equals(c10749l.isPro)) {
                            C3117l c3117lYandex = this.f34728l.yandex();
                            List list = c10749l.isPro;
                            for (int i9 = 0; i9 < list.size(); i9++) {
                                C7417l c7417l = (C7417l) list.get(i9);
                                int i10 = 0;
                                while (true) {
                                    InterfaceC1525l[] interfaceC1525lArr = c7417l.yandex;
                                    if (i10 < interfaceC1525lArr.length) {
                                        interfaceC1525lArr[i10].loadAd(c3117lYandex);
                                        i10++;
                                    }
                                }
                            }
                            this.f34728l = new C3852l(c3117lYandex);
                        }
                        C3852l c3852lM4411abstract = m4411abstract();
                        boolean zEquals2 = c3852lM4411abstract.equals(this.f34717l);
                        this.f34717l = c3852lM4411abstract;
                        boolean z3 = c10749l2.smaato != c10749l.smaato;
                        boolean z4 = c10749l2.purchase != c10749l.purchase;
                        if (z4 || z3) {
                            m4431l();
                        }
                        boolean z5 = c10749l2.mopub != c10749l.mopub;
                        if (!zEquals) {
                            this.f34677l.crashlytics(0, new C8677l(c10749l, i, 1));
                        }
                        if (z) {
                            C3904l c3904l2 = new C3904l();
                            if (c10749l2.yandex.startapp()) {
                                i6 = i3;
                                i7 = i6;
                                obj = null;
                                c2427l2 = null;
                                obj2 = null;
                            } else {
                                Object obj5 = c10749l2.loadAd.yandex;
                                c10749l2.yandex.mopub(obj5, c3904l2);
                                int i11 = c3904l2.crashlytics;
                                int iLoadAd = c10749l2.yandex.loadAd(obj5);
                                obj = c10749l2.yandex.remoteconfig(i11, this.f34699l, 0L).yandex;
                                c2427l2 = this.f34699l.crashlytics;
                                obj2 = obj5;
                                i6 = i11;
                                i7 = iLoadAd;
                            }
                            C5019l c5019l3 = c10749l2.loadAd;
                            if (i2 == 0) {
                                boolean zLoadAd = c5019l3.loadAd();
                                C5019l c5019l4 = c10749l2.loadAd;
                                if (zLoadAd) {
                                    jM4409l = c3904l2.yandex(c5019l4.loadAd, c5019l4.crashlytics);
                                    jM4409l2 = m4409l(c10749l2);
                                } else {
                                    if (c5019l4.purchase != -1) {
                                        jM4409l = m4409l(this.f34691l);
                                    } else {
                                        j2 = c3904l2.purchase;
                                        j3 = c3904l2.amazon;
                                        jM4409l = j2 + j3;
                                    }
                                    jM4409l2 = jM4409l;
                                }
                            } else if (c5019l3.loadAd()) {
                                jM4409l = c10749l2.subscription;
                                jM4409l2 = m4409l(c10749l2);
                            } else {
                                j2 = c3904l2.purchase;
                                j3 = c10749l2.subscription;
                                jM4409l = j2 + j3;
                                jM4409l2 = jM4409l;
                            }
                            long jM3986try = AbstractC15323l.m3986try(jM4409l);
                            long jM3986try2 = AbstractC15323l.m3986try(jM4409l2);
                            C5019l c5019l5 = c10749l2.loadAd;
                            C4262l c4262l = new C4262l(obj, i6, c2427l2, obj2, i7, jM3986try, jM3986try2, c5019l5.loadAd, c5019l5.crashlytics);
                            C4322l c4322l2 = this.f34699l;
                            int iMo2761implements = mo2761implements();
                            int iAd = ad();
                            if (this.f34691l.yandex.startapp()) {
                                obj3 = null;
                                c2427l3 = null;
                                obj4 = null;
                            } else {
                                C10749l c10749l3 = this.f34691l;
                                Object obj6 = c10749l3.loadAd.yandex;
                                c10749l3.yandex.mopub(obj6, this.f34712l);
                                iAd = this.f34691l.yandex.loadAd(obj6);
                                Object obj7 = this.f34691l.yandex.remoteconfig(iMo2761implements, c4322l2, 0L).yandex;
                                c2427l3 = c4322l2.crashlytics;
                                obj4 = obj6;
                                obj3 = obj7;
                            }
                            int i12 = iAd;
                            long jM3986try3 = AbstractC15323l.m3986try(j);
                            long jM3986try4 = this.f34691l.loadAd.loadAd() ? AbstractC15323l.m3986try(m4409l(this.f34691l)) : jM3986try3;
                            C5019l c5019l6 = this.f34691l.loadAd;
                            this.f34677l.crashlytics(11, new C0743l(i2, c4262l, new C4262l(obj3, iMo2761implements, c2427l3, obj4, i12, jM3986try3, jM3986try4, c5019l6.loadAd, c5019l6.crashlytics)));
                        } else {
                            zBooleanValue = zBooleanValue;
                            zEquals2 = zEquals2;
                            z4 = z4;
                        }
                        if (zBooleanValue) {
                            this.f34677l.crashlytics(1, new C8677l(c2427l, iIntValue, i8));
                        }
                        final int i13 = 7;
                        if (c10749l2.billing != c10749l.billing) {
                            this.f34677l.crashlytics(10, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj8) {
                                    int i14 = i13;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj8;
                                    switch (i14) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                            if (c10749l.billing != null) {
                                final int i14 = 8;
                                this.f34677l.crashlytics(10, new InterfaceC16975l() { // from class: lٕۗؒ
                                    @Override // defpackage.InterfaceC16975l
                                    public final void invoke(Object obj8) {
                                        int i15 = i14;
                                        C10749l c10749l4 = c10749l;
                                        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj8;
                                        switch (i15) {
                                            case 0:
                                                interfaceC13521l.admob(c10749l4.mopub);
                                                interfaceC13521l.vip(c10749l4.mopub);
                                                break;
                                            case 1:
                                                interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                                break;
                                            case 2:
                                                interfaceC13521l.Signature(c10749l4.purchase);
                                                break;
                                            case 3:
                                                interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                                break;
                                            case 4:
                                                interfaceC13521l.mopub(c10749l4.vip);
                                                break;
                                            case 5:
                                                interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                                break;
                                            case 6:
                                                interfaceC13521l.mo2732catch(c10749l4.metrica);
                                                break;
                                            case 7:
                                                interfaceC13521l.appmetrica(c10749l4.billing);
                                                break;
                                            case 8:
                                                interfaceC13521l.signatures(c10749l4.billing);
                                                break;
                                            default:
                                                interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                        C9598l c9598l = c10749l2.subs;
                        C9598l c9598l2 = c10749l.subs;
                        if (c9598l != c9598l2) {
                            C16717l c16717l = this.f34727l;
                            Object obj8 = c9598l2.f19554l;
                            c16717l.getClass();
                            final int i15 = 9;
                            this.f34677l.crashlytics(2, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj9) {
                                    int i16 = i15;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj9;
                                    switch (i16) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                        }
                        if (zEquals2) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            this.f34677l.crashlytics(14, new C4750l(this.f34717l, i5));
                        }
                        if (z5) {
                            this.f34677l.crashlytics(3, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj9) {
                                    int i16 = i5;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj9;
                                    switch (i16) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                        }
                        if (z4 || z3) {
                            final int i16 = 1;
                            this.f34677l.crashlytics(-1, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj9) {
                                    int i17 = i16;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj9;
                                    switch (i17) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                        }
                        final int i17 = 4;
                        if (z4) {
                            final int i18 = 2;
                            this.f34677l.crashlytics(4, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj9) {
                                    int i19 = i18;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj9;
                                    switch (i19) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                        }
                        final int i19 = 5;
                        if (z3 || c10749l2.remoteconfig != c10749l.remoteconfig) {
                            final int i20 = 3;
                            this.f34677l.crashlytics(5, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj9) {
                                    int i110 = i20;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj9;
                                    switch (i110) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                        }
                        final int i21 = 6;
                        if (c10749l2.vip != c10749l.vip) {
                            this.f34677l.crashlytics(6, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj9) {
                                    int i110 = i17;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj9;
                                    switch (i110) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                        }
                        if (c10749l2.remoteconfig() != c10749l.remoteconfig()) {
                            this.f34677l.crashlytics(7, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj9) {
                                    int i110 = i19;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj9;
                                    switch (i110) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                        }
                        if (!c10749l2.metrica.equals(c10749l.metrica)) {
                            this.f34677l.crashlytics(12, new InterfaceC16975l() { // from class: lٕۗؒ
                                @Override // defpackage.InterfaceC16975l
                                public final void invoke(Object obj9) {
                                    int i110 = i21;
                                    C10749l c10749l4 = c10749l;
                                    InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj9;
                                    switch (i110) {
                                        case 0:
                                            interfaceC13521l.admob(c10749l4.mopub);
                                            interfaceC13521l.vip(c10749l4.mopub);
                                            break;
                                        case 1:
                                            interfaceC13521l.mo2736for(c10749l4.purchase, c10749l4.smaato);
                                            break;
                                        case 2:
                                            interfaceC13521l.Signature(c10749l4.purchase);
                                            break;
                                        case 3:
                                            interfaceC13521l.startapp(c10749l4.remoteconfig, c10749l4.smaato);
                                            break;
                                        case 4:
                                            interfaceC13521l.mopub(c10749l4.vip);
                                            break;
                                        case 5:
                                            interfaceC13521l.mo2737interface(c10749l4.remoteconfig());
                                            break;
                                        case 6:
                                            interfaceC13521l.mo2732catch(c10749l4.metrica);
                                            break;
                                        case 7:
                                            interfaceC13521l.appmetrica(c10749l4.billing);
                                            break;
                                        case 8:
                                            interfaceC13521l.signatures(c10749l4.billing);
                                            break;
                                        default:
                                            interfaceC13521l.premium((C1047l) c10749l4.subs.f19552l);
                                            break;
                                    }
                                }
                            });
                        }
                        m4430l();
                        this.f34677l.loadAd();
                        if (c10749l2.startapp != c10749l.startapp) {
                            Iterator it = this.f34734l.iterator();
                            while (it.hasNext()) {
                                ((SurfaceHolderCallbackC18330l) it.next()).yandex.m4431l();
                            }
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؘْؒ */
                    public final void mo2781l(int i, long j, List list) {
                        m4415l();
                        ArrayList arrayListM4416l = m4416l(list);
                        m4415l();
                        m4426l(arrayListM4416l, i, j, false);
                    }

                    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
                    public final void m4428l(int i) {
                        m4415l();
                        C4619l c4619l = this.f34705l;
                        C4619l c4619l2 = this.f34674l;
                        if (i == 0) {
                            c4619l2.m1565private(false);
                            c4619l.m1565private(false);
                        } else if (i == 1) {
                            c4619l2.m1565private(true);
                            c4619l.m1565private(false);
                        } else {
                            if (i != 2) {
                                return;
                            }
                            c4619l2.m1565private(true);
                            c4619l.m1565private(true);
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؚْٟ */
                    public final long mo2782l() {
                        m4415l();
                        if (this.f34691l.yandex.startapp()) {
                            return this.f34679l;
                        }
                        C10749l c10749l = this.f34691l;
                        if (c10749l.firebase.amazon != c10749l.loadAd.amazon) {
                            return AbstractC15323l.m3986try(c10749l.yandex.remoteconfig(mo2761implements(), this.f34699l, 0L).remoteconfig);
                        }
                        long j = c10749l.adcel;
                        if (this.f34691l.firebase.loadAd()) {
                            C10749l c10749l2 = this.f34691l;
                            C3904l c3904lMopub = c10749l2.yandex.mopub(c10749l2.firebase.yandex, this.f34712l);
                            long jAmazon = c3904lMopub.amazon(this.f34691l.firebase.loadAd);
                            j = jAmazon == Long.MIN_VALUE ? c3904lMopub.amazon : jAmazon;
                        }
                        C10749l c10749l3 = this.f34691l;
                        AbstractC10759l abstractC10759l = c10749l3.yandex;
                        Object obj = c10749l3.firebase.yandex;
                        C3904l c3904l = this.f34712l;
                        abstractC10759l.mopub(obj, c3904l);
                        return AbstractC15323l.m3986try(j + c3904l.purchase);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lْٓؒ */
                    public final boolean mo2783l() {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            return ((C12551l) ((C1080l) c1080l.f2974l).tapsense()).crashlytics;
                        }
                        return false;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lْ٘ۚ */
                    public final void mo2784l(int i, C2427l c2427l) {
                        mo2797native(i, i + 1, AbstractC1186l.isVip(c2427l));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lْۥٞ */
                    public final void mo2785l() {
                        if (mo2791l().startapp() || subs()) {
                            m4415l();
                            return;
                        }
                        if (!mo2763instanceof()) {
                            if (mo2777l() && mo2789l()) {
                                m4414l(mo2761implements(), -9223372036854775807L, false);
                                return;
                            } else {
                                m4415l();
                                return;
                            }
                        }
                        int iMo2813try = mo2813try();
                        if (iMo2813try == -1) {
                            m4415l();
                        } else if (iMo2813try == mo2761implements()) {
                            m4414l(mo2761implements(), -9223372036854775807L, true);
                        } else {
                            m4414l(iMo2813try, -9223372036854775807L, false);
                        }
                    }

                    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
                    public final void m4429l() {
                        SurfaceHolder surfaceHolder = this.f34737l;
                        if (surfaceHolder != null) {
                            surfaceHolder.removeCallback(this.f34739l);
                            this.f34737l = null;
                        }
                    }

                    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
                    public final void m4430l() {
                        C16616l c16616l = this.f34697l;
                        String str = AbstractC15323l.yandex;
                        C17804l c17804l = this.f34729l;
                        boolean zSubs = c17804l.subs();
                        boolean zMo2793l = c17804l.mo2793l();
                        boolean zM4425l = c17804l.m4425l();
                        boolean zMo2763instanceof = c17804l.mo2763instanceof();
                        boolean zMo2777l = c17804l.mo2777l();
                        boolean zMo2789l = c17804l.mo2789l();
                        boolean zStartapp = c17804l.mo2791l().startapp();
                        C3316l c3316l = new C3316l(1);
                        C6921l c6921l = (C6921l) c3316l.f7072l;
                        c6921l.crashlytics(this.f34680l.yandex);
                        boolean z = !zSubs;
                        c3316l.mopub(4, z);
                        c3316l.mopub(5, zMo2793l && !zSubs);
                        c3316l.mopub(6, zM4425l && !zSubs);
                        c3316l.mopub(7, !zStartapp && (zM4425l || !zMo2777l || zMo2793l) && !zSubs);
                        c3316l.mopub(8, zMo2763instanceof && !zSubs);
                        c3316l.mopub(9, !zStartapp && (zMo2763instanceof || (zMo2777l && zMo2789l)) && !zSubs);
                        c3316l.mopub(10, z);
                        c3316l.mopub(11, zMo2793l && !zSubs);
                        c3316l.mopub(12, zMo2793l && !zSubs);
                        C16616l c16616l2 = new C16616l(c6921l.purchase());
                        this.f34697l = c16616l2;
                        if (c16616l2.equals(c16616l)) {
                            return;
                        }
                        this.f34677l.crashlytics(13, new C6788l(this, 4));
                    }

                    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
                    public final void m4431l() {
                        int iPurchase = purchase();
                        C4619l c4619l = this.f34705l;
                        C4619l c4619l2 = this.f34674l;
                        boolean z = false;
                        if (iPurchase != 1) {
                            if (iPurchase == 2 || iPurchase == 3) {
                                m4415l();
                                boolean z2 = this.f34691l.startapp;
                                if (startapp() && !z2) {
                                    z = true;
                                }
                                c4619l2.m1564for(z);
                                c4619l.m1564for(startapp());
                                return;
                            }
                            if (iPurchase != 4) {
                                C18073l.admob();
                                return;
                            }
                        }
                        c4619l2.m1564for(false);
                        c4619l.m1564for(false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lٔٙٝ */
                    public final void mo2786l() {
                        m4415l();
                        long jMo2771l = mo2771l() + this.f34711l;
                        long duration = getDuration();
                        if (duration != -9223372036854775807L) {
                            jMo2771l = Math.min(jMo2771l, duration);
                        }
                        m4414l(mo2761implements(), Math.max(jMo2771l, 0L), false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lٍٔ۠ */
                    public final void mo2787l() {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            C1080l c1080l2 = (C1080l) c1080l.f2974l;
                            C1283l c1283l = new C1283l(c1080l, 1, 0 == true ? 1 : 0);
                            c1080l2.getClass();
                            AbstractC12442l.subscription(Looper.myLooper() == ((C14500l) c1080l2.f2975l).yandex.getLooper());
                            c1080l2.f2972l++;
                            c1080l2.m797private(new RunnableC7762l(c1080l2, c1283l, 11));
                            C12551l c12551l = (C12551l) c1080l2.f2976l;
                            int i = c12551l.yandex;
                            int i2 = c12551l.loadAd;
                            int i3 = c12551l.purchase;
                            c1080l2.m789continue(new C12551l(false, i, i2 < i3 ? i2 + 1 : i3, c12551l.amazon, i3));
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lٕؓٗ */
                    public final boolean mo2788l() {
                        m4415l();
                        return this.f34723l;
                    }

                    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
                    public final long m4432l(C10749l c10749l) {
                        C5019l c5019l = c10749l.loadAd;
                        long j = c10749l.crashlytics;
                        AbstractC10759l abstractC10759l = c10749l.yandex;
                        if (!c5019l.loadAd()) {
                            return AbstractC15323l.m3986try(m4421l(c10749l));
                        }
                        Object obj = c10749l.loadAd.yandex;
                        C3904l c3904l = this.f34712l;
                        abstractC10759l.mopub(obj, c3904l);
                        if (j == -9223372036854775807L) {
                            return AbstractC15323l.m3986try(abstractC10759l.remoteconfig(m4420l(c10749l), this.f34699l, 0L).smaato);
                        }
                        return AbstractC15323l.m3986try(j) + AbstractC15323l.m3986try(c3904l.purchase);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lٕۗٞ */
                    public final boolean mo2789l() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        return !abstractC10759lMo2791l.startapp() && abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f34699l, 0L).subs;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lَٖؔ */
                    public final void mo2790l(int i, int i2, int i3) {
                        m4415l();
                        AbstractC12442l.admob(i >= 0 && i <= i2 && i3 >= 0);
                        ArrayList arrayList = this.f34693l;
                        int size = arrayList.size();
                        int iMin = Math.min(i2, size);
                        int iMin2 = Math.min(i3, size - (iMin - i));
                        if (i >= size || i == iMin || i == iMin2) {
                            return;
                        }
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        this.f34692l++;
                        AbstractC15323l.m3981switch(arrayList, i, iMin, iMin2);
                        C12800l c12800l = this.f34678l;
                        c12800l.getClass();
                        this.f34678l = c12800l;
                        C12164l c12164l = new C12164l(arrayList, this.f34678l);
                        C10749l c10749l = this.f34691l;
                        C10749l c10749lM4413l = m4413l(c10749l, c12164l, m4422l(abstractC10759lMo2791l, c12164l, m4420l(c10749l), m4432l(this.f34691l)));
                        C12800l c12800l2 = this.f34678l;
                        C0477l c0477l = this.f34725l;
                        c0477l.getClass();
                        c0477l.f1746l.loadAd(19, new C9771l(i, iMin, iMin2, c12800l2)).loadAd();
                        m4427l(c10749lM4413l, 0, false, 5, -9223372036854775807L, -1, false);
                    }

                    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
                    public final void m4433l(int i, int i2) {
                        C5989l c5989l = this.f34707l;
                        if (i == c5989l.yandex && i2 == c5989l.loadAd) {
                            return;
                        }
                        this.f34707l = new C5989l(i, i2);
                        this.f34677l.mopub(24, new C12153l(i, i2, 0));
                        m4417l(2, 14, new C5989l(i, i2));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lَٖؕ */
                    public final AbstractC10759l mo2791l() {
                        m4415l();
                        return this.f34691l.yandex;
                    }

                    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
                    public final C10749l m4434l(C10749l c10749l, int i, int i2) {
                        ArrayList arrayList;
                        int iM4420l = m4420l(c10749l);
                        long jM4432l = m4432l(c10749l);
                        AbstractC10759l abstractC10759l = c10749l.yandex;
                        this.f34692l++;
                        int i3 = i2 - 1;
                        while (true) {
                            arrayList = this.f34693l;
                            if (i3 < i) {
                                break;
                            }
                            arrayList.remove(i3);
                            i3--;
                        }
                        C12800l c12800l = this.f34678l;
                        int i4 = i2 - i;
                        int[] iArr = c12800l.loadAd;
                        int[] iArr2 = new int[iArr.length - i4];
                        int i5 = 0;
                        for (int i6 = 0; i6 < iArr.length; i6++) {
                            int i7 = iArr[i6];
                            if (i7 < i || i7 >= i2) {
                                int i8 = i6 - i5;
                                if (i7 >= i) {
                                    i7 -= i4;
                                }
                                iArr2[i8] = i7;
                            } else {
                                i5++;
                            }
                        }
                        this.f34678l = new C12800l(iArr2, new Random(c12800l.yandex.nextLong()));
                        C12164l c12164l = new C12164l(arrayList, this.f34678l);
                        C10749l c10749lM4413l = m4413l(c10749l, c12164l, m4422l(abstractC10759l, c12164l, iM4420l, jM4432l));
                        int i9 = c10749lM4413l.purchase;
                        if (i9 != 1 && i9 != 4 && iM4420l >= i && iM4420l < i2) {
                            if (C0477l.m568continue(this.f34699l, this.f34712l, this.f34710l, this.f34723l, c10749l.loadAd.yandex, abstractC10759l, c12164l) == -1) {
                                c10749lM4413l = m4410l(c10749lM4413l, 4);
                            }
                        }
                        C12800l c12800l2 = this.f34678l;
                        C14500l c14500l = this.f34725l.f1746l;
                        c14500l.getClass();
                        C3485l c3485lCrashlytics = C14500l.crashlytics();
                        c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(20, i, i2, c12800l2);
                        c3485lCrashlytics.loadAd();
                        return c10749lM4413l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lٖۥۡ */
                    public final int mo2792l() {
                        return mo2791l().metrica();
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؘٗۦ */
                    public final boolean mo2793l() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        return !abstractC10759lMo2791l.startapp() && abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f34699l, 0L).admob;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lْٗٔ */
                    public final boolean mo2794l() {
                        return true;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: lؙٗٙ */
                    public final void mo2795l(int i, int i2) {
                        if (i != i2) {
                            mo2790l(i, i + 1, i2);
                        }
                    }

                    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
                    public final Pair m4435l(AbstractC10759l abstractC10759l, int i, long j) {
                        if (abstractC10759l.startapp()) {
                            this.f34706l = i;
                            if (j == -9223372036854775807L) {
                                j = 0;
                            }
                            this.f34679l = j;
                            return null;
                        }
                        if (i == -1 || i >= abstractC10759l.metrica()) {
                            i = abstractC10759l.yandex(this.f34723l);
                            j = AbstractC15323l.m3986try(abstractC10759l.remoteconfig(i, this.f34699l, 0L).smaato);
                        }
                        return abstractC10759l.subs(this.f34699l, this.f34712l, i, AbstractC15323l.m3962continue(j));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: l٘ٚۥ */
                    public final void mo2796l(InterfaceC13521l interfaceC13521l) {
                        m4415l();
                        interfaceC13521l.getClass();
                        this.f34677l.purchase(interfaceC13521l);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void metrica(C2427l c2427l, long j) {
                        mo2781l(0, j, AbstractC1186l.isVip(c2427l));
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final int mopub() {
                        m4415l();
                        return this.f34710l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: native */
                    public final void mo2797native(int i, int i2, List list) {
                        m4415l();
                        AbstractC12442l.admob(i >= 0 && i2 >= i);
                        ArrayList arrayList = this.f34693l;
                        int size = arrayList.size();
                        if (i > size) {
                            return;
                        }
                        int iMin = Math.min(i2, size);
                        if (iMin - i == list.size()) {
                            int i3 = i;
                            while (true) {
                                if (i3 >= iMin) {
                                    this.f34692l++;
                                    C14500l c14500l = this.f34725l.f1746l;
                                    c14500l.getClass();
                                    C3485l c3485lCrashlytics = C14500l.crashlytics();
                                    c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(27, i, iMin, list);
                                    c3485lCrashlytics.loadAd();
                                    for (int i4 = i; i4 < iMin; i4++) {
                                        C14986l c14986l = (C14986l) arrayList.get(i4);
                                        AbstractC10759l abstractC10759l = c14986l.crashlytics;
                                        C2427l c2427l = (C2427l) list.get(i4 - i);
                                        c14986l.crashlytics = abstractC10759l instanceof C2733l ? new C2733l(((C2733l) abstractC10759l).purchase, c2427l) : new C2733l(abstractC10759l, c2427l);
                                    }
                                    m4427l(this.f34691l.isPro(new C12164l(arrayList, this.f34678l)), 0, false, 4, -9223372036854775807L, -1, false);
                                    return;
                                }
                                if (!((C14986l) arrayList.get(i3)).loadAd.firebase.yandex((C2427l) list.get(i3 - i))) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        ArrayList arrayListM4416l = m4416l(list);
                        if (!this.f34691l.yandex.startapp()) {
                            C10749l c10749lM4434l = m4434l(remoteconfig(this.f34691l, iMin, arrayListM4416l), i, iMin);
                            m4427l(c10749lM4434l, 0, !c10749lM4434l.loadAd.yandex.equals(this.f34691l.loadAd.yandex), 4, m4421l(c10749lM4434l), -1, false);
                        } else {
                            boolean z = this.f34706l == -1;
                            m4415l();
                            m4426l(arrayListM4416l, -1, -9223372036854775807L, z);
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: new */
                    public final long mo2798new() {
                        m4415l();
                        if (!subs()) {
                            return mo2782l();
                        }
                        C10749l c10749l = this.f34691l;
                        return c10749l.firebase.equals(c10749l.loadAd) ? AbstractC15323l.m3986try(this.f34691l.adcel) : getDuration();
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: package */
                    public final void mo2799package(int i, int i2) {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            ((C1080l) c1080l.f2974l).m799switch(new C1153l(i, 1), new C9602l(c1080l, i, i2));
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void premium() {
                        m4414l(mo2761implements(), -9223372036854775807L, false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: private */
                    public final void mo2800private(C4970l c4970l) {
                        m4415l();
                        C16717l c16717l = this.f34727l;
                        c16717l.getClass();
                        C4970l c4970lMo2766l = mo2766l();
                        if (!c4970l.equals(c16717l.admob())) {
                            if (c4970l instanceof C9205l) {
                                c16717l.startapp((C9205l) c4970l);
                            }
                            C0725l c0725l = new C0725l(c16717l.admob());
                            c0725l.amazon(c4970l);
                            c16717l.startapp(new C9205l(c0725l));
                        }
                        if (c4970lMo2766l.equals(c4970l)) {
                            return;
                        }
                        this.f34677l.mopub(19, new C16998l(c4970l, 0));
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final long pro() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        if (abstractC10759lMo2791l.startapp()) {
                            return -9223372036854775807L;
                        }
                        return AbstractC15323l.m3986try(abstractC10759lMo2791l.remoteconfig(mo2761implements(), this.f34699l, 0L).remoteconfig);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: protected */
                    public final void mo2801protected() {
                        mo2753continue(true);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: public */
                    public final C3852l mo2802public() {
                        m4415l();
                        return this.f34704l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final int purchase() {
                        m4415l();
                        return this.f34691l.purchase;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void release() {
                        boolean zCrashlytics;
                        AbstractC6427l.firebase("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + AbstractC15323l.yandex + "] [" + AbstractC17959l.loadAd() + "]");
                        m4415l();
                        this.f34708l.ads(false);
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            C1080l c1080l2 = (C1080l) c1080l.f2974l;
                            C12023l c12023l = new C12023l(4, c1080l);
                            c1080l2.getClass();
                            AbstractC12442l.subscription(Looper.myLooper() == ((C14500l) c1080l2.f2975l).yandex.getLooper());
                            c1080l2.f2972l++;
                            c1080l2.m797private(new RunnableC7762l(c1080l2, c12023l, 11));
                            c1080l2.m789continue((C12551l) c1080l2.f2976l);
                        }
                        this.f34674l.m1564for(false);
                        this.f34705l.m1564for(false);
                        C10685l c10685l = this.f34736l;
                        if (c10685l != null) {
                            c10685l.admob();
                        }
                        C1183l c1183l = this.f34671l;
                        if (c1183l != null && Build.VERSION.SDK_INT >= 34) {
                            C1183l.yandex(c1183l);
                        }
                        C18289l c18289l = this.f34726l;
                        ((C14500l) c18289l.mopub).purchase();
                        ((C17804l) c18289l.loadAd).mo2796l((C15523l) c18289l.crashlytics);
                        C0477l c0477l = this.f34725l;
                        if (c0477l.f1767l || !c0477l.f1766l.getThread().isAlive()) {
                            zCrashlytics = true;
                        } else {
                            c0477l.f1767l = true;
                            C5811l c5811l = new C5811l(c0477l.f1751l);
                            c0477l.f1746l.loadAd(7, c5811l).loadAd();
                            zCrashlytics = c5811l.crashlytics(c0477l.f1744l);
                        }
                        if (!zCrashlytics) {
                            this.f34677l.mopub(10, new C8876l(17));
                        }
                        this.f34677l.amazon();
                        this.f34709l.purchase();
                        C7713l c7713l = this.f34683l;
                        C17505l c17505l = this.f34701l;
                        CopyOnWriteArrayList<C1766l> copyOnWriteArrayList = c7713l.crashlytics.yandex;
                        for (C1766l c1766l : copyOnWriteArrayList) {
                            if (c1766l.loadAd == c17505l) {
                                c1766l.crashlytics = true;
                                copyOnWriteArrayList.remove(c1766l);
                            }
                        }
                        C10749l c10749l = this.f34691l;
                        if (c10749l.startapp) {
                            this.f34691l = c10749l.yandex();
                        }
                        C10749l c10749lM4410l = m4410l(this.f34691l, 1);
                        this.f34691l = c10749lM4410l;
                        C10749l c10749lCrashlytics = c10749lM4410l.crashlytics(c10749lM4410l.loadAd);
                        this.f34691l = c10749lCrashlytics;
                        c10749lCrashlytics.adcel = c10749lCrashlytics.subscription;
                        this.f34691l.ads = 0L;
                        C17505l c17505l2 = this.f34701l;
                        C14500l c14500l = c17505l2.f34104l;
                        c14500l.getClass();
                        c14500l.amazon(new RunnableC16112l(20, c17505l2));
                        m4429l();
                        Surface surface = this.f34733l;
                        if (surface != null) {
                            surface.release();
                            this.f34733l = null;
                        }
                        this.f34672l = C16684l.amazon;
                        this.f34688l = true;
                    }

                    public final C10749l remoteconfig(C10749l c10749l, int i, ArrayList arrayList) {
                        AbstractC10759l abstractC10759l = c10749l.yandex;
                        this.f34692l++;
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        while (true) {
                            int size = arrayList.size();
                            ArrayList arrayList3 = this.f34693l;
                            if (i2 >= size) {
                                this.f34678l = this.f34678l.yandex(i, arrayList2.size());
                                C12164l c12164l = new C12164l(arrayList3, this.f34678l);
                                C10749l c10749lM4413l = m4413l(c10749l, c12164l, m4422l(abstractC10759l, c12164l, m4420l(c10749l), m4432l(c10749l)));
                                C12800l c12800l = this.f34678l;
                                C14500l c14500l = this.f34725l.f1746l;
                                C6428l c6428l = new C6428l(arrayList2, c12800l, -1, -9223372036854775807L);
                                c14500l.getClass();
                                C3485l c3485lCrashlytics = C14500l.crashlytics();
                                c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(18, i, 0, c6428l);
                                c3485lCrashlytics.loadAd();
                                return c10749lM4413l;
                            }
                            C16548l c16548l = new C16548l((AbstractC14384l) arrayList.get(i2), this.f34702l);
                            arrayList2.add(c16548l);
                            arrayList3.add(i2 + i, new C14986l(c16548l.loadAd, c16548l.yandex));
                            i2++;
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: return */
                    public final void mo2803return(boolean z) {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            ((C1080l) c1080l.f2974l).m799switch(new C10191l(c1080l, z), new C11770l(c1080l, z, 1));
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final float signatures() {
                        m4415l();
                        return this.f34700l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void smaato(int i, long j) {
                        m4414l(i, j, false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final boolean startapp() {
                        m4415l();
                        return this.f34691l.smaato;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: static */
                    public final long mo2804static() {
                        m4415l();
                        return m4432l(this.f34691l);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void stop() {
                        m4415l();
                        m4418l(null);
                        this.f34672l = new C16684l(this.f34691l.subscription, C13708l.f26763l);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: strictfp */
                    public final int mo2805strictfp() {
                        m4415l();
                        if (subs()) {
                            return this.f34691l.loadAd.crashlytics;
                        }
                        return -1;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final boolean subs() {
                        m4415l();
                        return this.f34691l.loadAd.loadAd();
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final int subscription() {
                        if (!mo2779l(16)) {
                            return 0;
                        }
                        long jMo2798new = mo2798new();
                        long duration = getDuration();
                        if (jMo2798new == -9223372036854775807L || duration == -9223372036854775807L) {
                            return 0;
                        }
                        if (duration == 0) {
                            return 100;
                        }
                        return AbstractC15323l.isPro(AbstractC15323l.m3963default(jMo2798new, duration), 0, 100);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: super */
                    public final void mo2806super(int i) {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            ((C1080l) c1080l.f2974l).m799switch(new C2922l(17), new C1283l(c1080l, i, 1));
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: switch */
                    public final C14723l mo2807switch() {
                        m4415l();
                        return this.f34691l.billing;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: synchronized */
                    public final void mo2808synchronized(int i) {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            C1080l c1080l2 = (C1080l) c1080l.f2974l;
                            C1283l c1283l = new C1283l(c1080l, i, 0 == true ? 1 : 0);
                            c1080l2.getClass();
                            AbstractC12442l.subscription(Looper.myLooper() == ((C14500l) c1080l2.f2975l).yandex.getLooper());
                            c1080l2.f2972l++;
                            c1080l2.m797private(new RunnableC7762l(c1080l2, c1283l, 11));
                            C12551l c12551l = (C12551l) c1080l2.f2976l;
                            int i2 = c12551l.yandex;
                            int i3 = c12551l.loadAd;
                            int i4 = c12551l.purchase;
                            c1080l2.m789continue(new C12551l(false, i2, i3 < i4 ? i3 + 1 : i4, c12551l.amazon, i4));
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final long tapsense() {
                        m4415l();
                        return this.f34716l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: this */
                    public final C16684l mo2809this() {
                        m4415l();
                        return this.f34672l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: throw */
                    public final void mo2810throw(int i, int i2) {
                        m4415l();
                        AbstractC12442l.admob(i >= 0 && i2 >= i);
                        int size = this.f34693l.size();
                        int iMin = Math.min(i2, size);
                        if (i >= size || i == iMin) {
                            return;
                        }
                        C10749l c10749lM4434l = m4434l(this.f34691l, i, iMin);
                        m4427l(c10749lM4434l, 0, !c10749lM4434l.loadAd.yandex.equals(this.f34691l.loadAd.yandex), 4, m4421l(c10749lM4434l), -1, false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: throws */
                    public final void mo2811throws() {
                        m4415l();
                        C1080l c1080l = this.f34721l;
                        if (c1080l != null) {
                            int i = 1;
                            ((C1080l) c1080l.f2974l).m799switch(new C2922l(17), new C1283l(c1080l, i, i));
                        }
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: transient */
                    public final void mo2812transient(C3852l c3852l) {
                        m4415l();
                        c3852l.getClass();
                        if (c3852l.equals(this.f34704l)) {
                            return;
                        }
                        this.f34704l = c3852l;
                        this.f34677l.mopub(15, new C6788l(this, 3));
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: try */
                    public final int mo2813try() {
                        AbstractC10759l abstractC10759lMo2791l = mo2791l();
                        if (abstractC10759lMo2791l.startapp()) {
                            return -1;
                        }
                        int iMo2761implements = mo2761implements();
                        m4415l();
                        int i = this.f34710l;
                        if (i == 1) {
                            i = 0;
                        }
                        m4415l();
                        return abstractC10759lMo2791l.purchase(iMo2761implements, i, this.f34723l);
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final C16616l vip() {
                        m4415l();
                        return this.f34697l;
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: volatile */
                    public final void mo2814volatile() {
                        mo2753continue(false);
                    }

                    @Override // defpackage.InterfaceC9814l
                    /* JADX INFO: renamed from: while */
                    public final int mo2815while() {
                        m4415l();
                        if (subs()) {
                            return this.f34691l.loadAd.loadAd;
                        }
                        return -1;
                    }

                    @Override // defpackage.InterfaceC9814l
                    public final void yandex() {
                        m4415l();
                        C10749l c10749l = this.f34691l;
                        if (c10749l.purchase != 1) {
                            return;
                        }
                        C10749l c10749lBilling = c10749l.billing(null);
                        C10749l c10749lM4410l = m4410l(c10749lBilling, c10749lBilling.yandex.startapp() ? 4 : 2);
                        this.f34692l++;
                        this.f34725l.f1746l.yandex(29).loadAd();
                        m4427l(c10749lM4410l, 1, false, 5, -9223372036854775807L, -1, false);
                    }
                }
