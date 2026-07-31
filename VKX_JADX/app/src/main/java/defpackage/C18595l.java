package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.ImageView;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C18595l implements InterfaceC5457l, InterfaceC11227l, InterfaceC9746l, InterfaceC11795l, InterfaceC14606l, InterfaceC12873l, InterfaceC6128l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static ServiceConnectionC4922l f36312l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static volatile C18595l f36314l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f36316l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f36317l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36318l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final int[] f36313l = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Object f36315l = new Object();

    public C18595l(int i) {
        this.f36318l = i;
        int i2 = 17;
        boolean z = false;
        switch (i) {
            case 6:
                this.f36317l = new Rect();
                this.f36316l = new Rect();
                break;
            case 9:
                this.f36316l = C11533l.class.getDeclaredMethod("yandex", LayoutInflater.class, ViewGroup.class, Boolean.TYPE);
                break;
            case 11:
                this.f36317l = C5746l.f12138l;
                this.f36316l = C14054l.f27396l;
                break;
            case 22:
                this.f36317l = new AtomicReference(C5113l.f11111l);
                this.f36316l = new C10111l(i2, z);
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.f36317l = new Object();
                this.f36316l = new ArrayList();
                break;
            default:
                this.f36317l = new String[]{"Blues", "Classic Rock", FrameBodyTXXX.COUNTRY, "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "Acapella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "JPop", "SynthPop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big Beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio Theatre", "Neue Deutsche Welle", "Podcast", "Indie Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
                break;
        }
    }

    public static C18595l ads() {
        if (f36314l == null) {
            synchronized (C18595l.class) {
                try {
                    if (f36314l == null) {
                        f36314l = new C18595l(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36314l;
    }

    public static C3823l billing(Context context, Intent intent, boolean z) {
        ServiceConnectionC4922l serviceConnectionC4922l;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f36315l) {
            try {
                if (f36312l == null) {
                    f36312l = new ServiceConnectionC4922l(context);
                }
                serviceConnectionC4922l = f36312l;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return serviceConnectionC4922l.loadAd(intent).mopub(new ExecutorC11374l(2), new C8876l(20));
        }
        if (C12014l.ad().appmetrica(context)) {
            AbstractC3105l.subs(context, serviceConnectionC4922l, intent);
        } else {
            serviceConnectionC4922l.loadAd(intent);
        }
        return AbstractC4311l.mopub(-1);
    }

    public static AbstractC6475l remoteconfig(C7819l c7819l) {
        InterfaceC3710l interfaceC3710l = c7819l.crashlytics;
        Object context = interfaceC3710l instanceof C2672l ? ((C2672l) interfaceC3710l).f5804l.getContext() : c7819l.yandex;
        while (!(context instanceof InterfaceC3177l)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((InterfaceC3177l) context).loadAd();
    }

    public static boolean subscription(C7819l c7819l, Bitmap.Config config) {
        if (!AbstractC5941l.m1911throws(config)) {
            return true;
        }
        if (!((Boolean) AbstractC0532l.crashlytics(c7819l, AbstractC10413l.billing)).booleanValue()) {
            return false;
        }
        InterfaceC3710l interfaceC3710l = c7819l.crashlytics;
        if (!(interfaceC3710l instanceof C2672l)) {
            return true;
        }
        ImageView imageView = ((C2672l) interfaceC3710l).f5804l;
        return !imageView.isAttachedToWindow() || imageView.isHardwareAccelerated();
    }

    public Unit Signature(String str, CameraDevice.StateCallback stateCallback) {
        C11969l c11969l = (C11969l) this.f36316l;
        CameraManager cameraManager = (CameraManager) ((InterfaceC15897l) this.f36317l).get();
        try {
            Trace.beginSection(((Object) C10160l.loadAd(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC13950l.m3827throw(cameraManager, str, (Executor) c11969l.admob.getValue(), stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, c11969l.yandex());
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    public ListenableFuture ad(InterfaceC9526l interfaceC9526l, Executor executor) {
        executor.getClass();
        ExecutorC5263l executorC5263l = new ExecutorC5263l(EnumC7860l.f16398l);
        executorC5263l.f11349l = executor;
        executorC5263l.f11350l = this;
        C3797l c3797l = new C3797l(executorC5263l, interfaceC9526l, 20);
        C1090l c1090l = new C1090l();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.f36317l).getAndSet(c1090l);
        RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l();
        runnableFutureC13286l.f26066l = new C16753l(runnableFutureC13286l, c3797l);
        listenableFuture.yandex(runnableFutureC13286l, executorC5263l);
        ListenableFuture listenableFutureBilling = AbstractC7151l.billing(runnableFutureC13286l);
        RunnableC0295l runnableC0295l = new RunnableC0295l(runnableFutureC13286l, c1090l, listenableFuture, listenableFutureBilling, executorC5263l, 3);
        EnumC1535l enumC1535l = EnumC1535l.f3808l;
        listenableFutureBilling.yandex(runnableC0295l, enumC1535l);
        runnableFutureC13286l.yandex(runnableC0295l, enumC1535l);
        return listenableFutureBilling;
    }

    public Integer adcel(String str) {
        if (((TreeMap) this.f36316l) == null) {
            synchronized (this) {
                try {
                    if (((TreeMap) this.f36316l) == null) {
                        this.f36316l = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                        int length = ((String[]) this.f36317l).length;
                        for (int i = 0; i < length; i++) {
                            String str2 = ((String[]) this.f36317l)[i];
                            if (str2 == null) {
                                str2 = "";
                            }
                            ((TreeMap) this.f36316l).put(str2, Integer.valueOf(i));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (Integer) ((TreeMap) this.f36316l).get(str);
    }

    @Override // defpackage.InterfaceC11795l
    public boolean admob(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        int i = this.f36318l;
        byte[] bArrLicense = AbstractC14024l.license(bArr);
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                BigInteger bigInteger3 = new BigInteger(1, bArrLicense);
                BigInteger bigInteger4 = ((AbstractC2017l) this.f36317l).f4542l.f16362l;
                BigInteger bigInteger5 = InterfaceC11695l.startapp;
                if (bigInteger.compareTo(bigInteger5) < 0 || bigInteger.compareTo(bigInteger4) >= 0 || bigInteger2.compareTo(bigInteger5) < 0 || bigInteger2.compareTo(bigInteger4) >= 0) {
                    return false;
                }
                BigInteger bigIntegerIsPro = AbstractC16784l.isPro(bigInteger4, bigInteger3);
                BigInteger bigIntegerMod = bigInteger2.multiply(bigIntegerIsPro).mod(bigInteger4);
                BigInteger bigIntegerMod2 = bigInteger4.subtract(bigInteger).multiply(bigIntegerIsPro).mod(bigInteger4);
                AbstractC2017l abstractC2017l = (AbstractC2017l) this.f36317l;
                AbstractC8859l abstractC8859lStartapp = AbstractC6974l.ads(abstractC2017l.f4542l.f16358l, bigIntegerMod, ((C4148l) abstractC2017l).f8515l, bigIntegerMod2).startapp();
                if (abstractC8859lStartapp.smaato()) {
                    return false;
                }
                abstractC8859lStartapp.loadAd();
                return abstractC8859lStartapp.loadAd.signatures().mod(bigInteger4).equals(bigInteger);
            default:
                BigInteger bigInteger6 = new BigInteger(1, bArrLicense);
                C0277l c0277l = (C0277l) ((AbstractC7940l) this.f36317l).f16541l;
                BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
                if (bigIntegerValueOf.compareTo(bigInteger) >= 0) {
                    return false;
                }
                BigInteger bigInteger7 = c0277l.f1276l;
                BigInteger bigInteger8 = c0277l.f1277l;
                if (bigInteger7.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || bigInteger7.compareTo(bigInteger2) <= 0) {
                    return false;
                }
                BigInteger bigIntegerModPow = bigInteger6.modPow(bigInteger7.subtract(new BigInteger("2")), bigInteger7);
                return c0277l.f1275l.modPow(bigInteger2.multiply(bigIntegerModPow).mod(bigInteger7), bigInteger8).multiply(((C9669l) ((AbstractC7940l) this.f36317l)).f19749l.modPow(bigInteger7.subtract(bigInteger).multiply(bigIntegerModPow).mod(bigInteger7), bigInteger8)).mod(bigInteger8).mod(bigInteger7).equals(bigInteger);
        }
    }

    public Drawable advert(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f36316l) == null) {
                this.f36316l = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = advert(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        ((C18676l) this.f36316l).smaato.vip.remove((C14722l) this.f36317l);
    }

    @Override // defpackage.InterfaceC11795l
    public BigInteger[] crashlytics(byte[] bArr) {
        BigInteger bigInteger;
        BigInteger bigIntegerCrashlytics;
        int i = this.f36318l;
        int i2 = 0;
        byte[] bArrLicense = AbstractC14024l.license(bArr);
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                BigInteger bigInteger2 = new BigInteger(1, bArrLicense);
                AbstractC2017l abstractC2017l = (AbstractC2017l) this.f36317l;
                C7838l c7838l = abstractC2017l.f4542l;
                BigInteger bigInteger3 = c7838l.f16362l;
                BigInteger bigInteger4 = ((C8374l) abstractC2017l).f17335l;
                C16732l c16732l = new C16732l(i2);
                while (true) {
                    BigInteger bigIntegerCrashlytics2 = AbstractC16784l.crashlytics(bigInteger3.bitLength(), (SecureRandom) this.f36316l);
                    BigInteger bigInteger5 = InterfaceC11695l.metrica;
                    if (!bigIntegerCrashlytics2.equals(bigInteger5)) {
                        AbstractC8859l abstractC8859lStartapp = c16732l.loadAd(c7838l.f16358l, bigIntegerCrashlytics2).startapp();
                        abstractC8859lStartapp.loadAd();
                        BigInteger bigIntegerMod = abstractC8859lStartapp.loadAd.signatures().mod(bigInteger3);
                        if (bigIntegerMod.equals(bigInteger5)) {
                            continue;
                        } else {
                            BigInteger bigIntegerMod2 = bigIntegerCrashlytics2.multiply(bigInteger2).add(bigInteger4.multiply(bigIntegerMod)).mod(bigInteger3);
                            if (!bigIntegerMod2.equals(bigInteger5)) {
                                return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                            }
                        }
                    }
                }
                break;
            default:
                BigInteger bigInteger6 = new BigInteger(1, bArrLicense);
                C0277l c0277l = (C0277l) ((AbstractC7940l) this.f36317l).f16541l;
                do {
                    bigInteger = c0277l.f1276l;
                    bigIntegerCrashlytics = AbstractC16784l.crashlytics(bigInteger.bitLength(), (SecureRandom) this.f36316l);
                } while (bigIntegerCrashlytics.compareTo(bigInteger) >= 0);
                BigInteger bigIntegerMod3 = c0277l.f1275l.modPow(bigIntegerCrashlytics, c0277l.f1277l).mod(bigInteger);
                return new BigInteger[]{bigIntegerMod3, bigIntegerCrashlytics.multiply(bigInteger6).add(((C4598l) ((AbstractC7940l) this.f36317l)).f9336l.multiply(bigIntegerMod3)).mod(bigInteger)};
        }
    }

    public void firebase(C9294l c9294l) {
        synchronized (c9294l) {
        }
        Handler handler = (Handler) this.f36317l;
        if (handler != null) {
            handler.post(new RunnableC7302l(this, c9294l, 0));
        }
    }

    @Override // defpackage.InterfaceC11795l
    public BigInteger getOrder() {
        int i = this.f36318l;
        Object obj = this.f36317l;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((AbstractC2017l) obj).f4542l.f16362l;
            default:
                return ((C0277l) ((AbstractC7940l) obj).f16541l).f1276l;
        }
    }

    @Override // defpackage.InterfaceC5457l
    public String getValue(int i) {
        String str;
        return (mo1044goto(i) && (str = ((String[]) this.f36317l)[i]) != null) ? str : "";
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto */
    public boolean mo1044goto(int i) {
        return i >= 0 && i < ((String[]) this.f36317l).length;
    }

    @Override // defpackage.InterfaceC11795l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        SecureRandom secureRandomLoadAd = null;
        switch (this.f36318l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (z) {
                    if (interfaceC9719l instanceof C6114l) {
                        C6114l c6114l = (C6114l) interfaceC9719l;
                        secureRandomLoadAd = c6114l.f12904l;
                        interfaceC9719l = c6114l.f12903l;
                    }
                    this.f36317l = (C8374l) interfaceC9719l;
                    if (secureRandomLoadAd == null) {
                        secureRandomLoadAd = AbstractC8776l.loadAd();
                    } else {
                        ThreadLocal threadLocal = AbstractC8776l.yandex;
                    }
                } else {
                    this.f36317l = (C4148l) interfaceC9719l;
                }
                this.f36316l = secureRandomLoadAd;
                AbstractC1497l.amazon("ECGOST3410", (AbstractC2017l) this.f36317l, z);
                AbstractC8776l.yandex();
                break;
            default:
                if (z) {
                    if (interfaceC9719l instanceof C6114l) {
                        C6114l c6114l2 = (C6114l) interfaceC9719l;
                        secureRandomLoadAd = c6114l2.f12904l;
                        interfaceC9719l = c6114l2.f12903l;
                    }
                    this.f36317l = (C4598l) interfaceC9719l;
                    if (secureRandomLoadAd == null) {
                        secureRandomLoadAd = AbstractC8776l.loadAd();
                    } else {
                        ThreadLocal threadLocal2 = AbstractC8776l.yandex;
                    }
                } else {
                    this.f36317l = (C9669l) interfaceC9719l;
                }
                this.f36316l = secureRandomLoadAd;
                AbstractC16336l.purchase(((C0277l) ((AbstractC7940l) this.f36317l).f16541l).f1277l);
                ((C5911l) AbstractC8776l.purchase.get()).getClass();
                break;
        }
    }

    @Override // defpackage.InterfaceC6128l
    public void isPro(int i, AbstractC0958l abstractC0958l, C2667l c2667l) {
        synchronized (this.f36317l) {
            ((ArrayList) this.f36316l).add(new C3100l(i, abstractC0958l, c2667l));
        }
    }

    public C15106l isVip(C15106l c15106l) {
        C3548l c3548l;
        boolean z;
        C3548l c3548l2 = c15106l.isPro;
        C16543l c16543l = AbstractC10413l.loadAd;
        if (!AbstractC5941l.m1911throws((Bitmap.Config) AbstractC0532l.amazon(c15106l, c16543l)) || ((InterfaceC12841l) this.f36316l).mopub()) {
            c3548l = c3548l2;
            z = false;
        } else {
            c3548l2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(c3548l2.yandex);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMap.put(c16543l, config);
            } else {
                linkedHashMap.remove(c16543l);
            }
            C3548l c3548l3 = new C3548l(AbstractC18296l.subs(linkedHashMap));
            z = true;
            c3548l = c3548l3;
        }
        return z ? new C15106l(c15106l.yandex, c15106l.loadAd, c15106l.crashlytics, c15106l.amazon, c15106l.purchase, c15106l.billing, c15106l.mopub, c15106l.admob, c15106l.subs, c3548l) : c15106l;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:8:0x004b  */
    public C15106l license(C7819l c7819l, C9192l c9192l) {
        boolean z;
        Context context;
        C9192l c9192l2;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        Context context2 = c7819l.yandex;
        int i = c7819l.subscription;
        int i2 = c7819l.tapsense;
        AbstractC5921l abstractC5921l = c7819l.billing;
        int i3 = c7819l.firebase;
        int i4 = c7819l.smaato;
        int i5 = c7819l.remoteconfig;
        C16543l c16543l = AbstractC10413l.loadAd;
        Bitmap.Config config = (Bitmap.Config) AbstractC0532l.crashlytics(c7819l, c16543l);
        C16543l c16543l2 = AbstractC10413l.mopub;
        boolean zBooleanValue = ((Boolean) AbstractC0532l.crashlytics(c7819l, c16543l2)).booleanValue();
        C16543l c16543l3 = AbstractC12872l.yandex;
        if (((List) AbstractC0532l.crashlytics(c7819l, c16543l3)).isEmpty()) {
            z = true;
        } else {
            if (AbstractC8669l.subscription((Bitmap.Config) AbstractC0532l.crashlytics(c7819l, c16543l), AbstractC4032l.yandex)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (AbstractC5941l.m1911throws((Bitmap.Config) AbstractC0532l.crashlytics(c7819l, c16543l))) {
            if (subscription(c7819l, (Bitmap.Config) AbstractC0532l.crashlytics(c7819l, c16543l))) {
                context = context2;
                c9192l2 = c9192l;
                if (((InterfaceC12841l) this.f36316l).yandex(c9192l2)) {
                }
                if (z || !z2) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue || !((List) AbstractC0532l.crashlytics(c7819l, c16543l3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                linkedHashMap = new LinkedHashMap(AbstractC8676l.metrica(c7819l.pro.vip.yandex, c7819l.Signature.yandex));
                if (config != ((Bitmap.Config) AbstractC0532l.crashlytics(c7819l, c16543l))) {
                    if (config != null) {
                        linkedHashMap.put(c16543l, config);
                    } else {
                        linkedHashMap.remove(c16543l);
                    }
                }
                if (z3 != ((Boolean) AbstractC0532l.crashlytics(c7819l, c16543l2)).booleanValue()) {
                    linkedHashMap.put(c16543l2, Boolean.valueOf(z3));
                }
                return new C15106l(context, c9192l2, i, i2, null, abstractC5921l, i3, i4, i5, new C3548l(AbstractC18296l.subs(linkedHashMap)));
            }
            context = context2;
            c9192l2 = c9192l;
            z2 = false;
            if (z) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z3 = false;
            } else {
                z3 = false;
            }
            linkedHashMap = new LinkedHashMap(AbstractC8676l.metrica(c7819l.pro.vip.yandex, c7819l.Signature.yandex));
            if (config != ((Bitmap.Config) AbstractC0532l.crashlytics(c7819l, c16543l))) {
                if (config != null) {
                    linkedHashMap.put(c16543l, config);
                } else {
                    linkedHashMap.remove(c16543l);
                }
            }
            if (z3 != ((Boolean) AbstractC0532l.crashlytics(c7819l, c16543l2)).booleanValue()) {
                linkedHashMap.put(c16543l2, Boolean.valueOf(z3));
            }
            return new C15106l(context, c9192l2, i, i2, null, abstractC5921l, i3, i4, i5, new C3548l(AbstractC18296l.subs(linkedHashMap)));
        }
        context = context2;
        c9192l2 = c9192l;
        z2 = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z3 = false;
        } else {
            z3 = false;
        }
        linkedHashMap = new LinkedHashMap(AbstractC8676l.metrica(c7819l.pro.vip.yandex, c7819l.Signature.yandex));
        if (config != ((Bitmap.Config) AbstractC0532l.crashlytics(c7819l, c16543l))) {
            if (config != null) {
                linkedHashMap.put(c16543l, config);
            } else {
                linkedHashMap.remove(c16543l);
            }
        }
        if (z3 != ((Boolean) AbstractC0532l.crashlytics(c7819l, c16543l2)).booleanValue()) {
            linkedHashMap.put(c16543l2, Boolean.valueOf(z3));
        }
        return new C15106l(context, c9192l2, i, i2, null, abstractC5921l, i3, i4, i5, new C3548l(AbstractC18296l.subs(linkedHashMap)));
    }

    public C0639l loadAd(List list) {
        InterfaceC3442l interfaceC3442l = null;
        try {
            int size = list.size();
            int i = 0;
            InterfaceC3442l interfaceC3442l2 = null;
            while (i < size) {
                try {
                    InterfaceC3442l interfaceC3442l3 = (InterfaceC3442l) list.get(i);
                    try {
                        interfaceC3442l3.yandex((C7221l) this.f36316l);
                        i++;
                        interfaceC3442l2 = interfaceC3442l3;
                    } catch (Exception e) {
                        e = e;
                        interfaceC3442l = interfaceC3442l3;
                        StringBuilder sb = new StringBuilder();
                        int iPremium = ((C11522l) ((C7221l) this.f36316l).f15053l).premium();
                        C12814l c12814lSubs = ((C7221l) this.f36316l).subs();
                        C7221l c7221l = (C7221l) this.f36316l;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + iPremium + ", composition=" + c12814lSubs + ", selection=" + C12814l.isPro(AbstractC2296l.loadAd(c7221l.f15049l, c7221l.f15048l)) + "):");
                        sb.append('\n');
                        AbstractC16901l.m4216else(list, sb, "\n", null, null, new C15079l(interfaceC3442l, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    interfaceC3442l = interfaceC3442l2;
                }
            }
            C7221l c7221l2 = (C7221l) this.f36316l;
            c7221l2.getClass();
            C3625l c3625l = new C3625l(((C11522l) c7221l2.f15053l).toString());
            C7221l c7221l3 = (C7221l) this.f36316l;
            long jLoadAd = AbstractC2296l.loadAd(c7221l3.f15049l, c7221l3.f15048l);
            C12814l c12814l = C12814l.admob(((C0639l) this.f36317l).loadAd) ? null : new C12814l(jLoadAd);
            C0639l c0639l = new C0639l(c3625l, c12814l != null ? c12814l.yandex : AbstractC2296l.loadAd(C12814l.billing(jLoadAd), C12814l.mopub(jLoadAd)), ((C7221l) this.f36316l).subs());
            this.f36317l = c0639l;
            return c0639l;
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // defpackage.InterfaceC6128l
    public void metrica(AbstractC0958l abstractC0958l) {
        synchronized (this.f36317l) {
            Iterator it = ((ArrayList) this.f36316l).iterator();
            while (it.hasNext()) {
                if (AbstractC8576l.yandex(((C3100l) it.next()).loadAd, abstractC0958l)) {
                    abstractC0958l.yandex();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        C7025l c7025l = ((C18676l) this.f36316l).smaato;
        c7025l.vip.remove((C14722l) this.f36317l);
        if (!(th instanceof MediaCodec.CodecException)) {
            c7025l.yandex(0, th.getMessage(), th);
        } else {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            c7025l.yandex(1, codecException.getMessage(), codecException);
        }
    }

    public C3823l pro(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f36317l;
        ExecutorC11374l executorC11374l = (ExecutorC11374l) this.f36316l;
        boolean z = AbstractC12300l.subs() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? AbstractC4311l.purchase(executorC11374l, new CallableC4082l(context, intent, 2)).admob(executorC11374l, new C17221l(context, intent, z2)) : billing(context, intent, z2);
    }

    @Override // defpackage.InterfaceC12873l
    public InterfaceC6646l purchase(C9887l c9887l, C16272l c16272l) {
        return new C10023l((Object) ((InterfaceC12873l) this.f36317l).purchase(c9887l, c16272l), this.f36316l, false);
    }

    @Override // defpackage.InterfaceC12873l
    public InterfaceC6646l smaato() {
        return new C10023l((Object) ((InterfaceC12873l) this.f36317l).smaato(), this.f36316l, false);
    }

    public InterfaceC14833l startapp(Object... objArr) {
        Constructor constructorYandex;
        synchronized (((AtomicBoolean) this.f36316l)) {
            try {
                if (!((AtomicBoolean) this.f36316l).get()) {
                    try {
                        constructorYandex = ((InterfaceC5515l) this.f36317l).yandex();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f36316l).set(true);
                        constructorYandex = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorYandex = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorYandex == null) {
            return null;
        }
        try {
            return (InterfaceC14833l) constructorYandex.newInstance(objArr);
        } catch (Exception e2) {
            C4875l.remoteconfig("Unexpected error creating extractor", e2);
            return null;
        }
    }

    @Override // defpackage.InterfaceC6128l
    public void subs() {
        synchronized (this.f36317l) {
            try {
                for (C3100l c3100l : (ArrayList) this.f36316l) {
                    c3100l.crashlytics.billing(c3100l.yandex, null);
                    c3100l.loadAd.yandex();
                }
                ((ArrayList) this.f36316l).clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void tapsense(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.f36317l;
        C12418l c12418lPro = C12418l.pro(absSeekBar.getContext(), attributeSet, f36313l, i);
        Drawable drawableSubscription = c12418lPro.subscription(0);
        if (drawableSubscription != null) {
            if (drawableSubscription instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableSubscription;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableAdvert = advert(animationDrawable.getFrame(i2), true);
                    drawableAdvert.setLevel(ModuleDescriptor.MODULE_VERSION);
                    animationDrawable2.addFrame(drawableAdvert, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(ModuleDescriptor.MODULE_VERSION);
                drawableSubscription = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableSubscription);
        }
        Drawable drawableSubscription2 = c12418lPro.subscription(1);
        if (drawableSubscription2 != null) {
            absSeekBar.setProgressDrawable(advert(drawableSubscription2, false));
        }
        c12418lPro.advert();
    }

    @Override // defpackage.InterfaceC9746l
    public C3823l vip(Object obj) {
        Boolean bool = (Boolean) obj;
        C17503l c17503l = (C17503l) this.f36316l;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            C16557l c16557l = c17503l.loadAd;
            if (zBooleanValue) {
                ((C2350l) c16557l.f32505l).amazon(null);
                return ((C3823l) this.f36317l).remoteconfig((ExecutorC4850l) c17503l.purchase.f1958l, new C3585l(9, this));
            }
            c16557l.getClass();
            C8339l.smaato("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        C12714l c12714l = c17503l.mopub;
        Iterator it = C12714l.startapp(((File) c12714l.f25072l).listFiles(C17503l.ads)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        C12714l c12714l2 = ((C17093l) c17503l.remoteconfig.f25074l).loadAd;
        C17093l.yandex(C12714l.startapp(((File) c12714l2.f25076l).listFiles()));
        C17093l.yandex(C12714l.startapp(((File) c12714l2.f25078l).listFiles()));
        C17093l.yandex(C12714l.startapp(((File) c12714l2.f25073l).listFiles()));
        c17503l.adcel.amazon(null);
        return AbstractC4311l.mopub(null);
    }

    @Override // defpackage.InterfaceC11227l
    public Object yandex(InterfaceC1388l interfaceC1388l, ArrayList arrayList) {
        Object c18435l;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f36316l;
        Class clsMo1730private = ((InterfaceC13937l) interfaceC1388l).mo1730private();
        Object c5756l = concurrentHashMap.get(clsMo1730private);
        if (c5756l == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsMo1730private, (c5756l = new C5756l()))) != null) {
            c5756l = objPutIfAbsent;
        }
        C5756l c5756l2 = (C5756l) c5756l;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C7425l((InterfaceC13012l) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c5756l2.yandex;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                c18435l = (InterfaceC16588l) ((Function2) this.f36317l).invoke(interfaceC1388l, arrayList);
            } catch (Throwable th) {
                c18435l = new C18435l(th);
            }
            C1171l c1171l = new C1171l(c18435l);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, c1171l);
            obj = objPutIfAbsent2 == null ? c1171l : objPutIfAbsent2;
        }
        return ((C1171l) obj).f3160l;
    }

    public /* synthetic */ C18595l(Object obj, Object obj2, int i) {
        this.f36318l = i;
        this.f36317l = obj;
        this.f36316l = obj2;
    }

    public /* synthetic */ C18595l(Object obj, Object obj2, boolean z, int i) {
        this.f36318l = i;
        this.f36316l = obj;
        this.f36317l = obj2;
    }

    public C18595l(C13177l c13177l) {
        Object c14706l;
        this.f36318l = 4;
        this.f36317l = c13177l;
        int i = Build.VERSION.SDK_INT;
        int i2 = 2;
        if (i < 26) {
            boolean z = AbstractC2593l.yandex;
        } else {
            if (!AbstractC2593l.yandex) {
                if (i != 26 && i != 27) {
                    c14706l = new C14706l(true, i2);
                } else {
                    c14706l = new C10819l(5);
                }
            }
            this.f36316l = c14706l;
        }
        c14706l = new C14706l(false, i2);
        this.f36316l = c14706l;
    }

    public C18595l(AbsSeekBar absSeekBar) {
        this.f36318l = 1;
        this.f36317l = absSeekBar;
    }

    public C18595l(Context context) {
        this.f36318l = 2;
        this.f36317l = context;
        this.f36316l = new ExecutorC11374l(2);
    }

    public /* synthetic */ C18595l(int i, boolean z) {
        this.f36318l = i;
    }

    public C18595l(C10023l c10023l) {
        this.f36318l = 17;
        Context context = (Context) c10023l.f20419l;
        int iMopub = AbstractC2632l.mopub(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iMopub != 0) {
            this.f36317l = "Unity";
            String string = context.getResources().getString(iMopub);
            this.f36316l = string;
            String strStartapp = AbstractC14814l.startapp("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strStartapp, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f36317l = "Flutter";
                this.f36316l = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f36317l = null;
        this.f36316l = null;
    }

    public C18595l(C1424l c1424l, HashMap map, HashMap map2) {
        this.f36318l = 3;
        this.f36317l = c1424l;
        this.f36316l = map;
    }

    public C18595l(Function2 function2) {
        this.f36318l = 13;
        this.f36317l = function2;
        this.f36316l = new ConcurrentHashMap();
    }

    public C18595l(ArrayList arrayList, ArrayList arrayList2) {
        this.f36318l = 27;
        int size = arrayList.size();
        this.f36317l = new int[size];
        this.f36316l = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f36317l)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f36316l)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C18595l(int i, int i2) {
        this.f36318l = 27;
        this.f36317l = new int[]{i, i2};
        this.f36316l = new float[]{0.0f, 1.0f};
    }

    public C18595l(int i, int i2, int i3) {
        this.f36318l = 27;
        this.f36317l = new int[]{i, i2, i3};
        this.f36316l = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C18595l(InterfaceC5515l interfaceC5515l) {
        this.f36318l = 16;
        this.f36317l = interfaceC5515l;
        this.f36316l = new AtomicBoolean(false);
    }
}
