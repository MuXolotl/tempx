package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.inputmethodservice.InputMethodService;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُٚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C11140l implements InterfaceC5152l, InterfaceC3990l, InterfaceC15446l, InterfaceC18477l, InterfaceC13540l, InterfaceC16497l, InterfaceC10377l, InterfaceC8086l, InterfaceC0240l, InterfaceC4374l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22380l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C11140l f22366l = new C11140l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11140l f22360l = new C11140l(2);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C11140l f22372l = new C11140l(4);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C11140l f22371l = new C11140l(5);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C11140l f22375l = new C11140l(6);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C11140l f22361l = new C11140l(7);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C11140l f22364l = new C11140l(8);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C11140l f22374l = new C11140l(9);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C11140l f22369l = new C11140l(10);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C11140l f22376l = new C11140l(11);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C11140l f22373l = new C11140l(12);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C11140l f22359l = new C11140l(13);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C11140l f22377l = new C11140l(14);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C11140l f22370l = new C11140l(15);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C11140l f22365l = new C11140l(16);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C11140l f22368l = new C11140l(17);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ C11140l f22378l = new C11140l(18);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C11140l f22367l = new C11140l(19);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C11140l f22363l = new C11140l(20);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C11140l f22362l = new C11140l(21);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C11140l f22358l = new C11140l(22);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C11140l f22379l = new C11140l(23);

    public /* synthetic */ C11140l(int i) {
        this.f22380l = i;
    }

    public static C1351l admob(C6956l c6956l, int i) {
        return remoteconfig(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, c6956l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    public static C5819l firebase(Surface surface, Integer num, C15617l c15617l, C8259l c8259l, C4220l c4220l, C5565l c5565l, List list, Size size, boolean z, int i, String str, int i2) {
        Class cls;
        ?? Yandex = surface;
        C15617l c15617l2 = C15617l.f30495l;
        Integer num2 = (i2 & 2) != 0 ? null : num;
        C15617l c15617l3 = (i2 & 4) != 0 ? c15617l2 : c15617l;
        boolean z2 = (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? false : z;
        int i3 = (i2 & 1024) != 0 ? -1 : i;
        if (c15617l3 == C15617l.f30511l && Build.VERSION.SDK_INT >= 35) {
            if (num2 == null) {
                C8339l.smaato("Required value was null.");
                return null;
            }
            if (size == null) {
                C8339l.smaato("Required value was null.");
                return null;
            }
            Yandex = AbstractC9819l.yandex(num2.intValue(), size);
        } else if (c15617l3 != c15617l2) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 26) {
                C8339l.smaato(AbstractC15560l.tapsense("Deferred OutputConfigurations are not supported on API ", i4, " (requires API 26)"));
                return null;
            }
            if (size == null) {
                C8339l.smaato("Size must defined when creating a deferred OutputConfiguration.");
                return null;
            }
            if (c15617l3 == C15617l.f30503l) {
                cls = SurfaceTexture.class;
            } else if (c15617l3 == C15617l.f30509l) {
                cls = SurfaceHolder.class;
            } else if (c15617l3 != C15617l.f30508l) {
                if (c15617l3 != C15617l.f30490l) {
                    C11983l.ad(c15617l3, "Unsupported OutputType: ");
                    return null;
                }
                if (i4 < 35) {
                    C8339l.smaato("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                    return null;
                }
                cls = MediaRecorder.class;
            } else {
                if (i4 < 35) {
                    C8339l.smaato("OutputType.MEDIA_CODEC requires API 35 or higher.");
                    return null;
                }
                cls = MediaCodec.class;
            }
            Yandex = AbstractC5279l.yandex(size, cls);
        } else {
            if (Yandex == 0) {
                C8339l.smaato("non-null surface!");
                return null;
            }
            try {
                if (i3 != -1) {
                    AbstractC14238l.mopub();
                    Yandex = AbstractC14238l.yandex(i3, Yandex);
                } else {
                    AbstractC14238l.mopub();
                    Yandex = AbstractC14238l.loadAd(Yandex);
                }
            } catch (Throwable th) {
                Log.w("CXCP", "Failed to create an OutputConfiguration for " + Yandex + '!', th);
                return null;
            }
        }
        if (z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 24) {
                C8936l.subs(AbstractC15560l.tapsense("surfaceSharing is not supported on API ", i5, " (requires API 24)"));
                return null;
            }
            if (i5 >= 26) {
                AbstractC5941l.tapsense(Yandex);
            }
        }
        if (str != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 28) {
                C8936l.subs(AbstractC15560l.tapsense("physicalCameraId is not supported on API ", i6, " (requires API 28)"));
                return null;
            }
            if (i6 >= 28) {
                AbstractC13950l.m3813import(Yandex, str);
            }
        }
        if (c8259l != null) {
            int i7 = c8259l.yandex;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                AbstractC2847l.applovin(Yandex, i7);
            } else if (i7 != 0) {
                StringBuilder sbSignature = AbstractC2812l.Signature("Cannot set mirrorMode to a non-default value on API ", i8, ". This may result in unexpected behavior. Requested ");
                sbSignature.append((Object) C8259l.yandex(i7));
                Log.w("CXCP", sbSignature.toString());
            }
        }
        if (c4220l != null) {
            long j = c4220l.yandex;
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33) {
                AbstractC2847l.advert(Yandex, j);
            } else if (j != 1) {
                StringBuilder sbSignature2 = AbstractC2812l.Signature("Cannot set dynamicRangeProfile to a non-default value on API ", i9, ". This may result in unexpected behavior. Requested ");
                sbSignature2.append((Object) C4220l.yandex(j));
                Log.w("CXCP", sbSignature2.toString());
            }
        }
        if (c5565l != null && Build.VERSION.SDK_INT >= 33) {
            AbstractC2847l.appmetrica(Yandex, c5565l.yandex);
        }
        if (!list.isEmpty()) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
            } else {
                Log.w("CXCP", "Cannot add sensorPixelModeUsed value on API " + i10 + ". This may result in unexpected behavior. Requested " + list);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC13950l.Signature(Yandex);
        }
        return new C5819l(Yandex);
    }

    public static C0360l isPro(InterfaceC18477l interfaceC18477l, Function0 function0) {
        C16552l c16552l = AbstractC11463l.yandex;
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(ExecutorC6708l.f14063l, AbstractC1295l.crashlytics()));
        C15395l c15395l = new C15395l(interfaceC18477l, function0);
        InterfaceC12932l interfaceC12932lPurchase = AbstractC3234l.purchase(c18662lYandex);
        C6096l c6096l = new C6096l(8);
        C2580l c2580l = C2580l.f5619l;
        return new C0360l(c15395l, Collections.singletonList(new C6637l(AbstractC16901l.m4232new(c2580l, c2580l), null, 16)), c6096l, interfaceC12932lPurchase);
    }

    public static C1351l remoteconfig(C0764l c0764l, C6956l c6956l) {
        C1351l c1351lLoadAd = c0764l.f2312return;
        if (c1351lLoadAd == null) {
            c6956l.m2123default(390452338);
            c6956l.startapp(false);
            c1351lLoadAd = null;
        } else {
            c6956l.m2123default(390452339);
            C8620l c8620l = (C8620l) c6956l.isPro(AbstractC4524l.yandex);
            if (!AbstractC8576l.yandex(c1351lLoadAd.firebase, c8620l)) {
                c1351lLoadAd = c1351lLoadAd.loadAd(c1351lLoadAd.yandex, c1351lLoadAd.loadAd, c1351lLoadAd.crashlytics, c1351lLoadAd.amazon, c1351lLoadAd.purchase, c1351lLoadAd.billing, c1351lLoadAd.mopub, c1351lLoadAd.admob, c1351lLoadAd.subs, c1351lLoadAd.isPro, c8620l, c1351lLoadAd.smaato, c1351lLoadAd.remoteconfig, c1351lLoadAd.vip, c1351lLoadAd.metrica, c1351lLoadAd.startapp, c1351lLoadAd.adcel, c1351lLoadAd.ads, c1351lLoadAd.subscription, c1351lLoadAd.tapsense, c1351lLoadAd.Signature, c1351lLoadAd.license, c1351lLoadAd.pro, c1351lLoadAd.ad, c1351lLoadAd.advert, c1351lLoadAd.isVip, c1351lLoadAd.signatures, c1351lLoadAd.premium, c1351lLoadAd.applovin, c1351lLoadAd.appmetrica, c1351lLoadAd.inmobi, c1351lLoadAd.f3469throws, c1351lLoadAd.f3464package, c1351lLoadAd.f3467synchronized, c1351lLoadAd.f3466strictfp, c1351lLoadAd.f3470volatile, c1351lLoadAd.f3463native, c1351lLoadAd.f3465private, c1351lLoadAd.f3461extends, c1351lLoadAd.f3462for, c1351lLoadAd.f3468throw, c1351lLoadAd.f3459catch, c1351lLoadAd.f3460else);
                c0764l.f2312return = c1351lLoadAd;
            }
            c6956l.startapp(false);
        }
        if (c1351lLoadAd != null) {
            c6956l.m2123default(-1788515437);
            c6956l.startapp(false);
            return c1351lLoadAd;
        }
        c6956l.m2123default(-1788321191);
        long jAmazon = AbstractC15038l.amazon(c0764l, 18);
        long jAmazon2 = AbstractC15038l.amazon(c0764l, 18);
        long jLoadAd = C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18));
        long jAmazon3 = AbstractC15038l.amazon(c0764l, 18);
        long j = C9735l.isPro;
        C1351l c1351l = new C1351l(jAmazon, jAmazon2, jLoadAd, jAmazon3, j, j, j, j, AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 2), (C8620l) c6956l.isPro(AbstractC4524l.yandex), AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 24), C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 2), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 2), AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 2), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 2), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 19)), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 19)), AbstractC15038l.amazon(c0764l, 19));
        c0764l.f2312return = c1351l;
        c6956l.startapp(false);
        return c1351l;
    }

    public static byte[] smaato(AbstractC1186l abstractC1186l, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC1186l.size());
        Iterator<E> it = abstractC1186l.iterator();
        while (it.hasNext()) {
            C17456l c17456l = (C17456l) it.next();
            Bundle bundleLoadAd = c17456l.loadAd();
            Bitmap bitmap = c17456l.amazon;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                AbstractC12442l.subscription(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleLoadAd.putByteArray(C17456l.ad, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleLoadAd);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static C1351l subs(long j, long j2, long j3, long j4, C6956l c6956l, int i) {
        long j5 = C9735l.firebase;
        return remoteconfig(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, c6956l).loadAd(j5, j5, j5, j5, j, j2, j3, (i & 128) != 0 ? j5 : j4, j5, j5, null, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5, j5);
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        Log.w("NearbyConnections", "Failed to start discovery.", exc);
    }

    public realm_value_t ads(byte[] bArr) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(bArr == null ? 0 : 11);
        if (bArr != null) {
            realm_uuid_t realm_uuid_tVar = new realm_uuid_t(realmcJNI.new_realm_uuid_t(), true);
            short[] sArr = new short[16];
            C8934l c8934lAdcel = AbstractC8576l.adcel(0, 16);
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c8934lAdcel, 10));
            Iterator it = c8934lAdcel.iterator();
            while (it.hasNext()) {
                int iNextInt = ((C16991l) it).nextInt();
                sArr[iNextInt] = bArr[iNextInt];
                arrayList.add(Unit.INSTANCE);
            }
            realmcJNI.realm_uuid_t_bytes_set(realm_uuid_tVar.yandex, realm_uuid_tVar, sArr);
            realmcJNI.realm_value_t_uuid_set(realm_value_tVar.yandex, realm_value_tVar, realm_uuid_tVar.yandex, realm_uuid_tVar);
        }
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC16497l
    public C9742l amazon(Context context, InterfaceC1465l interfaceC1465l) {
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
        }
        if (baseContext instanceof Activity) {
            return crashlytics((Activity) baseContext, interfaceC1465l);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            C8339l.metrica("Must provide a UiContext or Application Context");
            return null;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new C9742l(new Rect(0, 0, point.x, point.y), interfaceC1465l.purchase(context));
    }

    @Override // defpackage.InterfaceC8086l
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC3990l
    public Rect billing(Activity activity) throws Exception {
        DisplayCutout displayCutoutCrashlytics;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (AbstractC11965l.ads(activity)) {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } else {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null));
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            InterfaceC3990l.loadAd.getClass();
            Log.w(C18496l.loadAd, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!AbstractC11965l.ads(activity)) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !AbstractC11965l.ads(activity) && (displayCutoutCrashlytics = AbstractC13950l.crashlytics(defaultDisplay)) != null) {
            if (rect.left == AbstractC13950l.m3804class(displayCutoutCrashlytics)) {
                rect.left = 0;
            }
            if (point.x - rect.right == AbstractC13950l.m3815interface(displayCutoutCrashlytics)) {
                rect.right = AbstractC13950l.m3815interface(displayCutoutCrashlytics) + rect.right;
            }
            if (rect.top == AbstractC13950l.m3821static(displayCutoutCrashlytics)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == AbstractC13950l.m3805continue(displayCutoutCrashlytics)) {
                rect.bottom = AbstractC13950l.m3805continue(displayCutoutCrashlytics) + rect.bottom;
            }
        }
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        boolean z = false;
        byte b = 0;
        InterfaceC14029l interfaceC14029l = null;
        switch (this.f22380l) {
            case 1:
                c16864l.f32921l.firebase(C8403l.f17381l, new C18182l((Function2) abstractC5563l, interfaceC14029l, b == true ? 1 : 0));
                break;
            default:
                c16864l.f32922l.firebase(C8403l.f17403l, new C7306l((Function5) abstractC5563l, z, interfaceC14029l, 12));
                break;
        }
    }

    @Override // defpackage.InterfaceC16497l
    public C9742l crashlytics(Activity activity, InterfaceC1465l interfaceC1465l) {
        InterfaceC3990l.loadAd.getClass();
        return new C9742l(new C10067l(C18496l.yandex().billing(activity)), interfaceC1465l.purchase(activity));
    }

    @Override // defpackage.InterfaceC0240l
    public void loadAd(C11442l c11442l) {
        c11442l.adcel("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public Object mo2330l() {
        return (C3259l) AbstractC10999l.subs(C17218l.f33421l, new C18160l(2, null, 8));
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public Object mo2331l(InputStream inputStream) throws C16916l {
        try {
            C16319l c16319l = C3259l.f6978l;
            c16319l.getClass();
            return (C3259l) c16319l.crashlytics(new C7084l(new C1503l(AbstractC7709l.purchase(inputStream))));
        } catch (ProtocolException unused) {
            throw new C16916l("Widget DataStore Proto was corrupted!", null);
        }
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٌّۡ */
    public Unit mo2332l(OutputStream outputStream, Object obj) {
        C3259l.f6978l.mopub(outputStream, (C3259l) obj);
        return Unit.INSTANCE;
    }

    public realm_value_t metrica(byte[] bArr) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(bArr == null ? 0 : 9);
        if (bArr != null) {
            realm_object_id_t realm_object_id_tVar = new realm_object_id_t(realmcJNI.new_realm_object_id_t(), true);
            short[] sArr = new short[12];
            C8934l c8934lAdcel = AbstractC8576l.adcel(0, 12);
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c8934lAdcel, 10));
            Iterator it = c8934lAdcel.iterator();
            while (it.hasNext()) {
                int iNextInt = ((C16991l) it).nextInt();
                sArr[iNextInt] = bArr[iNextInt];
                arrayList.add(Unit.INSTANCE);
            }
            realmcJNI.realm_object_id_t_bytes_set(realm_object_id_tVar.yandex, realm_object_id_tVar, sArr);
            realmcJNI.realm_value_t_object_id_set(realm_value_tVar.yandex, realm_value_tVar, realm_object_id_tVar.yandex, realm_object_id_tVar);
        }
        return realm_value_tVar;
    }

    public void mopub(final String str, final Function2 function2, final boolean z, final boolean z2, C10754l c10754l, final C2403l c2403l, final boolean z3, final Function2 function3, final Function2 function4, final Function2 function5, final Function2 function6, final C1351l c1351l, InterfaceC11780l interfaceC11780l, final C15578l c15578l, C6956l c6956l, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        C10754l c10754l2;
        final InterfaceC11780l interfaceC11780l2;
        InterfaceC11780l c17253l;
        int i3;
        C15578l c15578lAmazon;
        c6956l.m2133new(-1732281618);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z;
            i2 |= c6956l.mopub(z4) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            z5 = z2;
            i2 |= c6956l.mopub(z5) ? 2048 : 1024;
        } else {
            z5 = z2;
        }
        if ((i & 24576) == 0) {
            c10754l2 = c10754l;
            i2 |= c6956l.billing(c10754l2) ? 16384 : 8192;
        } else {
            c10754l2 = c10754l;
        }
        if ((i & 196608) == 0) {
            i2 |= c6956l.billing(c2403l) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= c6956l.mopub(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= c6956l.admob(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= c6956l.admob(function4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= c6956l.admob(null) ? 536870912 : 268435456;
        }
        int i4 = 14155776 | (c6956l.admob(function5) ? 4 : 2) | (c6956l.admob(function6) ? 32 : 16) | (c6956l.admob(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(null) ? 2048 : 1024) | (c6956l.billing(c1351l) ? 16384 : 8192) | 65536;
        int i5 = i2;
        if (c6956l.m2127for(i5 & 1, ((i2 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i4 & (-458753);
            } else {
                c6956l.m2124else();
                i3 = i4 & (-458753);
                c17253l = interfaceC11780l;
            }
            c6956l.adcel();
            int i6 = i3;
            boolean z6 = ((i5 & 14) == 4) | ((i5 & 57344) == 16384);
            Object objM2132native = c6956l.m2132native();
            if (z6 || objM2132native == C1867l.yandex) {
                C3625l c3625l = new C3625l(str);
                c10754l2.getClass();
                objM2132native = new C4991l(c3625l, C16313l.yandex);
                c6956l.m2147try(objM2132native);
            }
            String str2 = ((C4991l) objM2132native).yandex.f7563l;
            int i7 = 0;
            C15618l c15618l = new C15618l(0);
            if (function3 == null) {
                c6956l.m2123default(1927010204);
                c6956l.startapp(false);
                c15578lAmazon = null;
            } else {
                c6956l.m2123default(1927010205);
                c15578lAmazon = AbstractC14566l.amazon(-1819131923, new C15950l(i7, function3), c6956l);
                c6956l.startapp(false);
            }
            int i8 = i5 >> 12;
            int i9 = i6 << 18;
            int i10 = ((i5 >> 9) & 14) | ((i5 >> 3) & 112) | (i8 & 896) | ((i5 >> 6) & 7168) | ((i6 << 3) & 458752) | 1572864;
            AbstractC15042l.loadAd(str2, function2, c15618l, c15578lAmazon, function4, null, function5, function6, null, z5, z4, z3, c2403l, c17253l, c1351l, c15578l, c6956l, (i5 & 112) | (i8 & 57344) | (i8 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), i10);
            interfaceC11780l2 = c17253l;
        } else {
            c6956l.m2124else();
            interfaceC11780l2 = interfaceC11780l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final C10754l c10754l3 = c10754l2;
            c4224lAds.amazon = new Function2() { // from class: lَۢؐ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    this.f21608l.mopub(str, function2, z, z2, c10754l3, c2403l, z3, function3, function4, function5, function6, c1351l, interfaceC11780l2, c15578l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0164  */
    /* JADX WARN: Code duplicated, block: B:110:0x0167  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172  */
    /* JADX WARN: Code duplicated, block: B:114:0x0175  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118  */
    public void purchase(final boolean z, final boolean z2, final C2403l c2403l, InterfaceC17242l interfaceC17242l, final C1351l c1351l, final InterfaceC6347l interfaceC6347l, float f, float f2, C6956l c6956l, final int i, final int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        boolean z3;
        boolean z4;
        final float f5;
        final float f6;
        final InterfaceC17242l interfaceC17242l3;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        float f7;
        final float f8;
        final float f9;
        boolean z5;
        Object objM2132native;
        C6257l c6257l;
        final InterfaceC17807l interfaceC17807lRemoteconfig;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objM2132native2;
        int i6;
        InterfaceC5428l interfaceC5428l;
        InterfaceC17242l interfaceC17242lPremium;
        int i7;
        c6956l.m2133new(1035477640);
        int i8 = (c6956l.mopub(z) ? 4 : 2) | i | (c6956l.mopub(z2) ? 32 : 16) | (c6956l.billing(c2403l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i8 |= c6956l.billing(interfaceC17242l2) ? 2048 : 1024;
            }
            if (c6956l.billing(c1351l)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            int i10 = i8 | i3;
            if (c6956l.billing(interfaceC6347l)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i5 = i10 | i4;
            if ((i & 1572864) == 0) {
                f3 = f;
                if ((i2 & 64) == 0 || !c6956l.crashlytics(f3)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i5 |= i7;
            } else {
                f3 = f;
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i11 = c6956l.crashlytics(f4) ? 8388608 : 4194304;
                    i5 |= i11;
                } else {
                    f4 = f2;
                }
                i5 |= i11;
            } else {
                f4 = f2;
            }
            z3 = true;
            if ((i5 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c6956l.m2127for(i5 & 1, z4)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i9 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                        f7 = 2.0f;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                        f4 = 1.0f;
                    }
                    interfaceC17242l2 = interfaceC17242l4;
                    f8 = f4;
                    f9 = f7;
                } else {
                    c6956l.m2124else();
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                    }
                    f8 = f4;
                    f9 = f3;
                }
                c6956l.adcel();
                if ((i5 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objM2132native = c6956l.m2132native();
                Object obj = C1867l.yandex;
                if (z5 || objM2132native == obj) {
                    objM2132native = new C6257l(c2403l);
                    c6956l.m2147try(objM2132native);
                }
                c6257l = (C6257l) objM2132native;
                interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 5);
                boolean z9 = ((((i5 & 458752) ^ 196608) <= 131072 && c6956l.billing(interfaceC6347l)) || (i5 & 196608) == 131072) | ((((57344 & i5) ^ 24576) <= 16384 && c6956l.billing(c1351l)) || (i5 & 24576) == 16384);
                if ((i5 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z10 = z9 | z6;
                if ((i5 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zAdmob = z10 | z7 | ((((29360128 & i5) ^ 12582912) <= 8388608 && c6956l.crashlytics(f8)) || (i5 & 12582912) == 8388608) | c6956l.admob(interfaceC17807lRemoteconfig);
                if ((((3670016 & i5) ^ 1572864) > 1048576 || !c6956l.crashlytics(f9)) && (i5 & 1572864) != 1048576) {
                }
                z8 = zAdmob | z3;
                objM2132native2 = c6956l.m2132native();
                if (!z8 || objM2132native2 == obj) {
                    i6 = 0;
                    Object obj2 = new InterfaceC5428l() { // from class: lْٜؕ
                        @Override // defpackage.InterfaceC5428l
                        public final void yandex(C6943l c6943l) {
                            InterfaceC17807l interfaceC17807l = interfaceC17807lRemoteconfig;
                            float f10 = f9;
                            InterfaceC1489l interfaceC1489l = c6943l.f14565l;
                            InterfaceC1489l interfaceC1489l2 = c6943l.f14556l;
                            C1280l c1280l = C1280l.yandex;
                            if (interfaceC1489l == c1280l) {
                                if ((c6943l.f14568l & 8) != 0) {
                                    C16977l c16977l = c6943l.f14558l;
                                    if (c16977l == null || (interfaceC1489l = (InterfaceC1489l) c16977l.loadAd(53)) == null) {
                                        interfaceC1489l = AbstractC18011l.yandex;
                                    }
                                } else {
                                    interfaceC1489l = null;
                                }
                            }
                            if (interfaceC1489l2 == c1280l) {
                                if ((c6943l.f14568l & 8) != 0) {
                                    C16977l c16977l2 = c6943l.f14559l;
                                    if (c16977l2 == null || (interfaceC1489l2 = (InterfaceC1489l) c16977l2.loadAd(53)) == null) {
                                        interfaceC1489l2 = AbstractC18011l.yandex;
                                    }
                                } else {
                                    interfaceC1489l2 = null;
                                }
                            }
                            c6943l.f14568l = (interfaceC1489l == null || interfaceC1489l2 == null) ? c6943l.f14568l & (-9) : c6943l.f14568l | 8;
                            c6943l.billing(53, interfaceC1489l, interfaceC1489l2);
                            C0580l c0580l = c6943l.f14557l;
                            if (c0580l != null) {
                                c0580l.loadAd |= 8;
                                c0580l.inmobi = interfaceC6347l;
                            }
                            C1351l c1351l2 = c1351l;
                            boolean z11 = z;
                            boolean z12 = z2;
                            c6943l.yandex(c1351l2.yandex(z11, z12, false));
                            AbstractC6725l.yandex(c6943l, f8, c1351l2.amazon(z11, z12, false));
                            if ((c6943l.f14560l.f1577l.crashlytics.admob() & 4) != 0) {
                                InterfaceC1489l interfaceC1489l3 = c6943l.f14565l;
                                InterfaceC1489l interfaceC1489l4 = c6943l.f14556l;
                                try {
                                    c6943l.f14565l = interfaceC17807l;
                                    c6943l.f14556l = interfaceC17807l;
                                    c6943l.yandex(c1351l2.yandex(z11, z12, true));
                                    AbstractC6725l.yandex(c6943l, f10, c1351l2.amazon(z11, z12, true));
                                    Unit unit = Unit.INSTANCE;
                                    c6943l.f14565l = interfaceC1489l3;
                                    c6943l.f14556l = interfaceC1489l4;
                                    Unit unit2 = Unit.INSTANCE;
                                } catch (Throwable th) {
                                    c6943l.f14565l = interfaceC1489l3;
                                    c6943l.f14556l = interfaceC1489l4;
                                    throw th;
                                }
                            }
                        }
                    };
                    c6956l.m2147try(obj2);
                    objM2132native2 = obj2;
                } else {
                    i6 = 0;
                }
                interfaceC5428l = (InterfaceC5428l) objM2132native2;
                if (interfaceC5428l == C3332l.yandex) {
                    interfaceC17242lPremium = interfaceC17242l2;
                } else {
                    interfaceC17242lPremium = interfaceC17242l2.premium(new C2510l(c6257l, interfaceC5428l)).premium(C0879l.f2532l);
                }
                AbstractC9383l.yandex(interfaceC17242lPremium, c6956l, i6);
                f5 = f8;
                f6 = f9;
            } else {
                c6956l.m2124else();
                f5 = f4;
                f6 = f3;
            }
            interfaceC17242l3 = interfaceC17242l2;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lْۧۛ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        this.f26955l.purchase(z, z2, c2403l, interfaceC17242l3, c1351l, interfaceC6347l, f6, f5, (C6956l) obj3, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i8 |= 3072;
        interfaceC17242l2 = interfaceC17242l;
        if (c6956l.billing(c1351l)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i12 = i8 | i3;
        if (c6956l.billing(interfaceC6347l)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        i5 = i12 | i4;
        if ((i & 1572864) == 0) {
            f3 = f;
            if ((i2 & 64) == 0) {
                i7 = 524288;
            } else {
                i7 = 524288;
            }
            i5 |= i7;
        } else {
            f3 = f;
        }
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                if (c6956l.crashlytics(f4)) {
                }
                i5 |= i11;
            } else {
                f4 = f2;
            }
            i5 |= i11;
        } else {
            f4 = f2;
        }
        z3 = true;
        if ((i5 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c6956l.m2127for(i5 & 1, z4)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    i5 &= -29360129;
                    f4 = 1.0f;
                }
                interfaceC17242l2 = interfaceC17242l4;
                f8 = f4;
                f9 = f7;
            } else {
                if (i9 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    i5 &= -29360129;
                    f4 = 1.0f;
                }
                interfaceC17242l2 = interfaceC17242l4;
                f8 = f4;
                f9 = f7;
            }
            c6956l.adcel();
            if ((i5 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            objM2132native = c6956l.m2132native();
            Object obj3 = C1867l.yandex;
            if (z5) {
                objM2132native = new C6257l(c2403l);
                c6956l.m2147try(objM2132native);
            } else {
                objM2132native = new C6257l(c2403l);
                c6956l.m2147try(objM2132native);
            }
            c6257l = (C6257l) objM2132native;
            interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 5);
            boolean z11 = ((((i5 & 458752) ^ 196608) <= 131072 && c6956l.billing(interfaceC6347l)) || (i5 & 196608) == 131072) | ((((57344 & i5) ^ 24576) <= 16384 && c6956l.billing(c1351l)) || (i5 & 24576) == 16384);
            if ((i5 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            if ((i5 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean zAdmob2 = z12 | z7 | ((((29360128 & i5) ^ 12582912) <= 8388608 && c6956l.crashlytics(f8)) || (i5 & 12582912) == 8388608) | c6956l.admob(interfaceC17807lRemoteconfig);
            z3 = ((3670016 & i5) ^ 1572864) > 1048576 ? false : false;
            z8 = zAdmob2 | z3;
            objM2132native2 = c6956l.m2132native();
            if (z8) {
                i6 = 0;
                Object obj4 = new InterfaceC5428l() { // from class: lْٜؕ
                    @Override // defpackage.InterfaceC5428l
                    public final void yandex(C6943l c6943l) {
                        InterfaceC17807l interfaceC17807l = interfaceC17807lRemoteconfig;
                        float f10 = f9;
                        InterfaceC1489l interfaceC1489l = c6943l.f14565l;
                        InterfaceC1489l interfaceC1489l2 = c6943l.f14556l;
                        C1280l c1280l = C1280l.yandex;
                        if (interfaceC1489l == c1280l) {
                            if ((c6943l.f14568l & 8) != 0) {
                                C16977l c16977l = c6943l.f14558l;
                                if (c16977l == null || (interfaceC1489l = (InterfaceC1489l) c16977l.loadAd(53)) == null) {
                                    interfaceC1489l = AbstractC18011l.yandex;
                                }
                            } else {
                                interfaceC1489l = null;
                            }
                        }
                        if (interfaceC1489l2 == c1280l) {
                            if ((c6943l.f14568l & 8) != 0) {
                                C16977l c16977l2 = c6943l.f14559l;
                                if (c16977l2 == null || (interfaceC1489l2 = (InterfaceC1489l) c16977l2.loadAd(53)) == null) {
                                    interfaceC1489l2 = AbstractC18011l.yandex;
                                }
                            } else {
                                interfaceC1489l2 = null;
                            }
                        }
                        c6943l.f14568l = (interfaceC1489l == null || interfaceC1489l2 == null) ? c6943l.f14568l & (-9) : c6943l.f14568l | 8;
                        c6943l.billing(53, interfaceC1489l, interfaceC1489l2);
                        C0580l c0580l = c6943l.f14557l;
                        if (c0580l != null) {
                            c0580l.loadAd |= 8;
                            c0580l.inmobi = interfaceC6347l;
                        }
                        C1351l c1351l2 = c1351l;
                        boolean z13 = z;
                        boolean z14 = z2;
                        c6943l.yandex(c1351l2.yandex(z13, z14, false));
                        AbstractC6725l.yandex(c6943l, f8, c1351l2.amazon(z13, z14, false));
                        if ((c6943l.f14560l.f1577l.crashlytics.admob() & 4) != 0) {
                            InterfaceC1489l interfaceC1489l3 = c6943l.f14565l;
                            InterfaceC1489l interfaceC1489l4 = c6943l.f14556l;
                            try {
                                c6943l.f14565l = interfaceC17807l;
                                c6943l.f14556l = interfaceC17807l;
                                c6943l.yandex(c1351l2.yandex(z13, z14, true));
                                AbstractC6725l.yandex(c6943l, f10, c1351l2.amazon(z13, z14, true));
                                Unit unit = Unit.INSTANCE;
                                c6943l.f14565l = interfaceC1489l3;
                                c6943l.f14556l = interfaceC1489l4;
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th) {
                                c6943l.f14565l = interfaceC1489l3;
                                c6943l.f14556l = interfaceC1489l4;
                                throw th;
                            }
                        }
                    }
                };
                c6956l.m2147try(obj4);
                objM2132native2 = obj4;
            } else {
                i6 = 0;
                Object obj5 = new InterfaceC5428l() { // from class: lْٜؕ
                    @Override // defpackage.InterfaceC5428l
                    public final void yandex(C6943l c6943l) {
                        InterfaceC17807l interfaceC17807l = interfaceC17807lRemoteconfig;
                        float f10 = f9;
                        InterfaceC1489l interfaceC1489l = c6943l.f14565l;
                        InterfaceC1489l interfaceC1489l2 = c6943l.f14556l;
                        C1280l c1280l = C1280l.yandex;
                        if (interfaceC1489l == c1280l) {
                            if ((c6943l.f14568l & 8) != 0) {
                                C16977l c16977l = c6943l.f14558l;
                                if (c16977l == null || (interfaceC1489l = (InterfaceC1489l) c16977l.loadAd(53)) == null) {
                                    interfaceC1489l = AbstractC18011l.yandex;
                                }
                            } else {
                                interfaceC1489l = null;
                            }
                        }
                        if (interfaceC1489l2 == c1280l) {
                            if ((c6943l.f14568l & 8) != 0) {
                                C16977l c16977l2 = c6943l.f14559l;
                                if (c16977l2 == null || (interfaceC1489l2 = (InterfaceC1489l) c16977l2.loadAd(53)) == null) {
                                    interfaceC1489l2 = AbstractC18011l.yandex;
                                }
                            } else {
                                interfaceC1489l2 = null;
                            }
                        }
                        c6943l.f14568l = (interfaceC1489l == null || interfaceC1489l2 == null) ? c6943l.f14568l & (-9) : c6943l.f14568l | 8;
                        c6943l.billing(53, interfaceC1489l, interfaceC1489l2);
                        C0580l c0580l = c6943l.f14557l;
                        if (c0580l != null) {
                            c0580l.loadAd |= 8;
                            c0580l.inmobi = interfaceC6347l;
                        }
                        C1351l c1351l2 = c1351l;
                        boolean z13 = z;
                        boolean z14 = z2;
                        c6943l.yandex(c1351l2.yandex(z13, z14, false));
                        AbstractC6725l.yandex(c6943l, f8, c1351l2.amazon(z13, z14, false));
                        if ((c6943l.f14560l.f1577l.crashlytics.admob() & 4) != 0) {
                            InterfaceC1489l interfaceC1489l3 = c6943l.f14565l;
                            InterfaceC1489l interfaceC1489l4 = c6943l.f14556l;
                            try {
                                c6943l.f14565l = interfaceC17807l;
                                c6943l.f14556l = interfaceC17807l;
                                c6943l.yandex(c1351l2.yandex(z13, z14, true));
                                AbstractC6725l.yandex(c6943l, f10, c1351l2.amazon(z13, z14, true));
                                Unit unit = Unit.INSTANCE;
                                c6943l.f14565l = interfaceC1489l3;
                                c6943l.f14556l = interfaceC1489l4;
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th) {
                                c6943l.f14565l = interfaceC1489l3;
                                c6943l.f14556l = interfaceC1489l4;
                                throw th;
                            }
                        }
                    }
                };
                c6956l.m2147try(obj5);
                objM2132native2 = obj5;
            }
            interfaceC5428l = (InterfaceC5428l) objM2132native2;
            if (interfaceC5428l == C3332l.yandex) {
                interfaceC17242lPremium = interfaceC17242l2;
            } else {
                interfaceC17242lPremium = interfaceC17242l2.premium(new C2510l(c6257l, interfaceC5428l)).premium(C0879l.f2532l);
            }
            AbstractC9383l.yandex(interfaceC17242lPremium, c6956l, i6);
            f5 = f8;
            f6 = f9;
        } else {
            c6956l.m2124else();
            f5 = f4;
            f6 = f3;
        }
        interfaceC17242l3 = interfaceC17242l2;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lْۧۛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    this.f26955l.purchase(z, z2, c2403l, interfaceC17242l3, c1351l, interfaceC6347l, f6, f5, (C6956l) obj6, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public C11197l startapp(InterfaceC5014l interfaceC5014l) {
        return new C11197l((AbstractC1132l) interfaceC5014l);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C13819l c13819l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C7619l c7619l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C8425l c8425l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C2022l c2022l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f22380l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C13819l) {
                    c13819l = (C13819l) abstractC0283l;
                    int i2 = c13819l.f26947l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13819l.f26947l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13819l = new C13819l(this, abstractC0283l);
                    }
                } else {
                    c13819l = new C13819l(this, abstractC0283l);
                }
                Object objYandex = c13819l.f26948l;
                int i3 = c13819l.f26947l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C15767l.class)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c13819l.f26947l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c13819l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C7619l) {
                    c7619l = (C7619l) abstractC0283l;
                    int i4 = c7619l.f15683l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c7619l.f15683l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c7619l = new C7619l(this, abstractC0283l);
                    }
                } else {
                    c7619l = new C7619l(this, abstractC0283l);
                }
                Object objYandex2 = c7619l.f15684l;
                int i5 = c7619l.f15683l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.loadAd(C11979l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C6388l.class)))));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c7619l.f15683l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c7619l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 15:
                if (abstractC0283l instanceof C8425l) {
                    c8425l = (C8425l) abstractC0283l;
                    int i6 = c8425l.f17432l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8425l.f17432l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8425l = new C8425l(this, abstractC0283l);
                    }
                } else {
                    c8425l = new C8425l(this, abstractC0283l);
                }
                Object objYandex3 = c8425l.f17433l;
                int i7 = c8425l.f17432l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C14580l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c8425l.f17432l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c8425l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C2022l) {
                    c2022l = (C2022l) abstractC0283l;
                    int i8 = c2022l.f4547l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c2022l.f4547l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c2022l = new C2022l(this, abstractC0283l);
                    }
                } else {
                    c2022l = new C2022l(this, abstractC0283l);
                }
                Object objYandex4 = c2022l.f4548l;
                int i9 = c2022l.f4547l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(objYandex4);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex4);
                C14249l c14249lLoadAd4 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l4 = C0861l.crashlytics;
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C5926l.class)));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c2022l.f4547l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c2022l);
                if (objYandex4 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex4 != null) {
                    return (C0951l) objYandex4;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f22380l) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object vip(C2540l c2540l, AbstractC0283l abstractC0283l) {
        C2511l c2511l;
        C13698l c13698l;
        Object objApplovin;
        if (abstractC0283l instanceof C2511l) {
            c2511l = (C2511l) abstractC0283l;
            int i = c2511l.f5310l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2511l.f5310l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2511l = new C2511l(this, abstractC0283l);
            }
        } else {
            c2511l = new C2511l(this, abstractC0283l);
        }
        Object obj = c2511l.f5311l;
        int i2 = c2511l.f5310l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                if (!AbstractC8576l.yandex(c2540l.f5529l, "open.vkx.app") || c2540l.yandex().isEmpty() || !AbstractC8576l.yandex(AbstractC16901l.m4214continue(c2540l.yandex()), "iac") || !c2540l.f5524l.contains("a")) {
                    throw new IllegalArgumentException("Verification failed: should be done before creating client");
                }
                String strSignatures = c2540l.f5524l.signatures("a");
                if (strSignatures != null) {
                    C3844l c3844lYandex = AbstractC3670l.yandex(strSignatures);
                    C0017l c0017l = C8592l.f17707l;
                    c0017l.getClass();
                    C8592l c8592l = (C8592l) c0017l.loadAd(new C2881l(c3844lYandex.subscription(), c3844lYandex.purchase()));
                    if (c8592l != null) {
                        int i3 = c8592l.f17709l;
                        StringBuilder sb = new StringBuilder();
                        sb.append((i3 >> 24) & 255);
                        sb.append('.');
                        sb.append((i3 >> 16) & 255);
                        sb.append('.');
                        sb.append((i3 >> 8) & 255);
                        sb.append('.');
                        sb.append(i3 & 255);
                        c13698l = new C13698l(sb.toString(), c8592l.f17708l);
                        c2511l.f5312l = c13698l;
                        c2511l.f5310l = 1;
                        objApplovin = c13698l.applovin(c2511l);
                        EnumC9342l enumC9342l = EnumC9342l.f19165l;
                        if (objApplovin == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                }
                throw new IllegalStateException("Protobuf is null");
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c13698l = c2511l.f5312l;
            AbstractC2829l.crashlytics(obj);
            objApplovin = ((C1171l) obj).f3160l;
            AbstractC2829l.crashlytics(objApplovin);
            C10542l c10542l = (C10542l) objApplovin;
            C13654l c13654l = c10542l.f21451l;
            if (c13654l != null) {
                return new C5327l(c13698l, c13654l, c10542l.f21452l);
            }
            throw new IllegalStateException("Device info is not defined");
        } catch (Throwable th) {
            return new C18435l(th);
        }
    }

    @Override // defpackage.InterfaceC4374l
    public byte[] yandex(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
