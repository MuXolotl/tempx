package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7730l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16223l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16224l;

    public /* synthetic */ C7730l(int i, Object obj) {
        this.f16224l = i;
        this.f16223l = obj;
    }

    private final Object billing() {
        C16248l c16248l = (C16248l) this.f16223l;
        long jLongValue = ((Number) c16248l.f31798l.invoke()).longValue();
        C17078l c17078l = new C17078l();
        C17078l c17078l2 = new C17078l();
        synchronized (c16248l.f31801l) {
            c17078l.f33243l = jLongValue - c16248l.f31802l;
            c17078l2.f33243l = 1000000000 / ((long) c16248l.f31800l);
            Unit unit = Unit.INSTANCE;
        }
        AbstractC10999l.mopub(c16248l.f31799l, null, 0, new C11287l(c17078l, c17078l2, c16248l, jLongValue, (InterfaceC14029l) null), 3);
        return Unit.INSTANCE;
    }

    private final Object yandex() {
        InterfaceC15829l interfaceC15829l;
        C12183l c12183l = (C12183l) this.f16223l;
        synchronized (C12183l.amazon) {
            try {
                interfaceC15829l = C12183l.billing;
                if (interfaceC15829l == null) {
                    File fileAmazon = AbstractC2632l.amazon(c12183l.yandex, "GlanceAppWidgetManager".concat(".preferences_pb"));
                    if (!fileAmazon.exists()) {
                        fileAmazon = null;
                    }
                    if (fileAmazon != null) {
                        fileAmazon.delete();
                    }
                    Context context = c12183l.yandex;
                    C6286l c6286l = C12183l.purchase;
                    InterfaceC13922l interfaceC13922l = C3067l.yandex[0];
                    interfaceC15829l = (InterfaceC15829l) c6286l.yandex(context);
                    C12183l.billing = interfaceC15829l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC15829l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bitmap.Config config;
        int largeMemoryClass;
        String str;
        int i = 2;
        InterfaceC14029l interfaceC14029l = null;
        switch (this.f16224l) {
            case 0:
                C10086l c10086l = ((C16854l) this.f16223l).f32886l;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 1:
                C10086l c10086l2 = ((C0996l) this.f16223l).f2744l;
                c10086l2.setValue(Boolean.valueOf(!((Boolean) c10086l2.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 2:
                File file = (File) this.f16223l;
                synchronized (C15395l.purchase) {
                    C15395l.amazon.remove(file.getAbsolutePath());
                }
                return Unit.INSTANCE;
            case 3:
                C1611l c1611l = (C1611l) this.f16223l;
                C14785l c14785l = c1611l.f3926l;
                String str2 = c1611l.f3928l;
                C10894l c10894l = (str2 == null || !c1611l.f3931l) ? new C10894l(c1611l.f3929l, c1611l.f3928l, new C7972l(12), c14785l, c1611l.f3930l) : new C10894l(c1611l.f3929l, new File(c1611l.f3929l.getNoBackupFilesDir(), str2).getAbsolutePath(), new C7972l(12), c14785l, c1611l.f3930l);
                c10894l.setWriteAheadLoggingEnabled(c1611l.f3927l);
                return c10894l;
            case 4:
                C0690l c0690l = (C0690l) this.f16223l;
                InterfaceC7204l interfaceC7204l = c0690l.yandex;
                C15106l c15106l = c0690l.loadAd;
                InterfaceC7204l interfaceC7204lAmazon = AbstractC7837l.amazon(interfaceC7204l, true);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(interfaceC7204lAmazon.mo2151l().mo713l());
                    AbstractC1214l.yandex(interfaceC7204lAmazon, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        C8339l.smaato("Failed to decode GIF.");
                        return null;
                    }
                    if (movieDecodeStream.isOpaque() && ((Boolean) AbstractC0532l.amazon(c15106l, AbstractC10413l.mopub)).booleanValue()) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = AbstractC5941l.m1911throws(AbstractC10413l.loadAd(c15106l)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) AbstractC0532l.amazon(c15106l, AbstractC10413l.loadAd);
                    }
                    C2803l c2803l = new C2803l(movieDecodeStream, config, c15106l.crashlytics);
                    C16543l c16543l = AbstractC11114l.yandex;
                    if (((Number) AbstractC0532l.amazon(c15106l, c16543l)).intValue() != -2) {
                        int iIntValue = ((Number) AbstractC0532l.amazon(c15106l, c16543l)).intValue();
                        if (iIntValue < -1) {
                            C10754l.metrica(AbstractC0653l.vip(iIntValue, "Invalid repeatCount: "));
                            return null;
                        }
                        c2803l.f6108l = iIntValue;
                    }
                    Function0 function0 = (Function0) AbstractC0532l.amazon(c15106l, AbstractC11114l.crashlytics);
                    Function0 function1 = (Function0) AbstractC0532l.amazon(c15106l, AbstractC11114l.amazon);
                    if (function0 != null || function1 != null) {
                        c2803l.f6111l.add(new C8459l(function0, function1));
                    }
                    if (AbstractC0532l.amazon(c15106l, AbstractC11114l.loadAd) != null) {
                        C18725l.loadAd();
                        return null;
                    }
                    c2803l.f6118l = null;
                    c2803l.f6107l = 1;
                    c2803l.f6102l = false;
                    c2803l.invalidateSelf();
                    return new C9969l(AbstractC3230l.crashlytics(c2803l), false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1214l.yandex(interfaceC7204lAmazon, th);
                        throw th2;
                    }
                }
            case 5:
                return yandex();
            case 6:
                return new C6917l((C11183l) this.f16223l);
            case 7:
                C16604l c16604l = (C16604l) this.f16223l;
                boolean zIsEmpty = c16604l.f32583l.purchase.isEmpty();
                C7504l c7504l = c16604l.f32582l;
                if (zIsEmpty) {
                    if (c7504l != null) {
                        c7504l.ads(null);
                    }
                    c16604l.f32582l = null;
                } else if (c7504l == null || !c7504l.mopub()) {
                    c16604l.f32582l = c16604l.m4187l();
                }
                return Unit.INSTANCE;
            case 8:
                C16942l c16942l = (C16942l) this.f16223l;
                c16942l.f5081l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05vWVhRPQ==", 2), 2), Charset.defaultCharset()))));
                c16942l.purchase();
                return Unit.INSTANCE;
            case 9:
                C8050l c8050l = (C8050l) this.f16223l;
                c8050l.getClass();
                try {
                    c8050l.f16777l.ads(2, 0, false);
                    break;
                } catch (IOException e) {
                    c8050l.yandex(2, 2, e);
                }
                return Unit.INSTANCE;
            case 10:
                Context context = (Context) ((C11644l) this.f16223l).f23358l;
                double d = 0.2d;
                try {
                    if (((ActivityManager) context.getSystemService(ActivityManager.class)).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    C8339l.metrica("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                C14785l c14785l2 = new C14785l((byte) 0, 19);
                try {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                return new C16554l(new C8043l((long) (d * ((long) largeMemoryClass) * 1048576), c14785l2), c14785l2);
            case 11:
                C14476l c14476l = (C14476l) this.f16223l;
                C8188l c8188l = c14476l.f28344l;
                C18508l c18508l = c8188l.f17084l;
                EnumC13595l enumC13595l = c18508l != null ? c18508l.f36134l : null;
                int i2 = enumC13595l == null ? -1 : AbstractC9756l.yandex[enumC13595l.ordinal()];
                if (i2 == -1) {
                    c14476l.purchase();
                } else if (i2 == 1) {
                    c14476l.purchase();
                    Activity activity = c14476l.f5081l;
                    C18508l c18508l2 = c8188l.f17084l;
                    if (c18508l2 == null || (str = c18508l2.f36135l) == null) {
                        return Unit.INSTANCE;
                    }
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } else {
                    if (i2 != 2) {
                        C18725l.billing();
                        return null;
                    }
                    c14476l.purchase();
                    ((AppActivity) c14476l.f5081l).license(new C7679l());
                }
                return Unit.INSTANCE;
            case 12:
                return (InputMethodManager) ((View) ((C10023l) this.f16223l).f20419l).getContext().getSystemService("input_method");
            case 13:
                return billing();
            case 14:
                WorkDatabase_Impl workDatabase_Impl = ((C15813l) this.f16223l).yandex;
                return Boolean.valueOf(!workDatabase_Impl.subs() || workDatabase_Impl.smaato());
            case 15:
                Object obj = ((AbstractC11726l) this.f16223l).f23464l;
                InterfaceC6679l interfaceC6679l = obj instanceof InterfaceC6679l ? (InterfaceC6679l) obj : null;
                if (interfaceC6679l != null) {
                    return interfaceC6679l.remoteconfig();
                }
                return null;
            case 16:
                C5280l c5280l = ((C12660l) this.f16223l).isPro;
                if (c5280l != null) {
                    AbstractC2697l.firebase(c5280l);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return Integer.valueOf(((C5866l) this.f16223l).admob().vip);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC3803l.yandex(((C15243l) this.f16223l).isVip());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new BaseInputConnection(((C10585l) this.f16223l).yandex, false);
            case 20:
                return new C12772l((Integer) this.f16223l);
            case 21:
                ((C1059l) this.f16223l).m4125private(new C11148l());
                return Unit.INSTANCE;
            case 22:
                C4817l c4817l = (C4817l) this.f16223l;
                c4817l.f9864l = null;
                c4817l.isVip().onBackPressed();
                return Unit.INSTANCE;
            case 23:
                return (C9554l) this.f16223l;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return (InterfaceC1982l) this.f16223l;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractActivityC2025l abstractActivityC2025l = (AbstractActivityC2025l) this.f16223l;
                AppActivity appActivity = C8183l.loadAd;
                if (!AbstractC2812l.advert(appActivity)) {
                    appActivity = null;
                }
                if (appActivity != null) {
                    AbstractC9033l.crashlytics(appActivity, new C8912l(abstractActivityC2025l, interfaceC14029l, 13));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC8533l interfaceC8533l = (InterfaceC8533l) this.f16223l;
                if (interfaceC8533l != null) {
                    ((C4666l) interfaceC8533l).loadAd();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return AbstractC3803l.yandex(((C14084l) this.f16223l).isVip());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC9033l.crashlytics((AppActivity) ((C5636l) this.f16223l).isVip(), new C18160l(i, interfaceC14029l, 10));
                return Unit.INSTANCE;
            default:
                C10244l.purchase.loadAd(new C5108l((C2391l) this.f16223l));
                return Unit.INSTANCE;
        }
    }
}
