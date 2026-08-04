package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import com.google.android.renderscript.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٓؖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13932l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f27222l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27223l;

    public /* synthetic */ C13932l(int i, Object obj) {
        this.f27223l = i;
        this.f27222l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x021f  */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x021f, please report this as an issue */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f27223l;
        boolean z = false;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 1;
        Object obj = this.f27222l;
        switch (i) {
            case 0:
                C13550l c13550l = (C13550l) obj;
                AbstractC10999l.mopub(c13550l.crashlytics, null, 0, new C15352l((String) c13550l.billing.admob(), c13550l, interfaceC14029l, 24), 3);
                return Unit.INSTANCE;
            case 1:
                return Integer.valueOf(((AbstractC7095l) ((C1639l) obj).yandex).pro());
            case 2:
                return new C14378l(1, ((C8585l) obj).billing);
            case 3:
                return Boolean.valueOf(((C5849l) ((C3316l) obj).f7072l).yandex().yandex(UltraWideFlashCaptureUnderexposureQuirk.class));
            case 4:
                VKXApplication.Companion companion = VKXApplication.f36628l;
                C12382l c12382l = AbstractC5921l.f12465l;
                String str = C14025l.f27330l;
                File cacheDir = ((VKXApplication) obj).getApplicationContext().getCacheDir();
                cacheDir.mkdirs();
                Unit unit = Unit.INSTANCE;
                File file = new File("image_cache");
                if (AbstractC17948l.amazon(file.getPath()) <= 0) {
                    String string = cacheDir.toString();
                    if (string.length() == 0) {
                        file = new File(string + file);
                    } else {
                        char c = File.separatorChar;
                        if (AbstractC12024l.m3344synchronized(string, c)) {
                            file = new File(string + file);
                        } else {
                            file = new File(string + c + file);
                        }
                    }
                }
                return new C6109l(100663296L, c12382l, C6162l.ads(file));
            case 5:
                float f = ((C14473l) obj).crashlytics;
                if (f == 1.0f) {
                    Toolkit toolkit = Toolkit.yandex;
                    return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                }
                float f2 = 1.0f - f;
                float f3 = 0.213f * f2;
                float f4 = 0.715f * f2;
                float f5 = f2 * 0.072f;
                return new float[]{f3 + f, f3, f3, 0.0f, f4, f4 + f, f4, 0.0f, f5, f5, f + f5, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            case 6:
                ((View) obj).invalidate();
                return Unit.INSTANCE;
            case 7:
                AbstractC8189l.purchase(new C16534l(((C5218l) obj).f11302l, 8));
                return Unit.INSTANCE;
            case 8:
                C10086l c10086l = (C10086l) obj;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 9:
                ((C0858l) obj).f2514l.crashlytics(true);
                return Unit.INSTANCE;
            case 10:
                C17398l c17398l = (C17398l) obj;
                if (AbstractC14770l.isPro(c17398l.f33899l)) {
                    return null;
                }
                long j = c17398l.f33899l.amazon;
                C16287l.yandex.getClass();
                if (j != C16287l.crashlytics()) {
                    return null;
                }
                AudioPlaylist audioPlaylist = c17398l.f33899l;
                if (audioPlaylist.subscription == null && audioPlaylist.tapsense == null) {
                    return new C8195l(EnumC12456l.f24588l, new C4449l(c17398l, i2));
                }
                return null;
            case 11:
                C12772l c12772l = new C12772l(((C18046l) ((InterfaceC0564l) obj)).yandex, 13);
                C8688l c8688l = C10328l.purchase;
                c12772l.loadAd = AbstractC10409l.crashlytics().amazon.ads();
                return c12772l;
            case 12:
                WebView webView = (WebView) obj;
                if (webView != null) {
                    webView.goBack();
                }
                return Unit.INSTANCE;
            case 13:
                return (AbstractC2737l) ((C6576l) obj).loadAd.getValue();
            case 14:
                C5934l c5934l = (C5934l) obj;
                String str2 = AbstractC12635l.yandex;
                C13432l c13432l = c5934l.yandex;
                HashSet hashSet = new HashSet();
                hashSet.addAll(c5934l.purchase);
                HashSet hashSetLoadAd = C5934l.loadAd(c5934l);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.removeAll(c5934l.purchase);
                    } else if (hashSetLoadAd.contains((String) it.next())) {
                        z = true;
                    }
                }
                if (z) {
                    C18262l.firebase(c5934l, ")", "WorkContinuation has cycles (");
                    return null;
                }
                WorkDatabase workDatabase = c13432l.crashlytics;
                C12211l c12211l = c13432l.loadAd;
                workDatabase.loadAd();
                try {
                    AbstractC9168l.crashlytics(workDatabase, c12211l, c5934l);
                    boolean zYandex = AbstractC12635l.yandex(c5934l);
                    workDatabase.vip();
                    workDatabase.firebase();
                    if (zYandex) {
                        AbstractC3387l.loadAd(c12211l, c13432l.crashlytics, c13432l.purchase);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    workDatabase.firebase();
                    throw th;
                }
            case 15:
                C13432l c13432l2 = (C13432l) obj;
                WorkDatabase workDatabase2 = c13432l2.crashlytics;
                Context context = c13432l2.yandex;
                String str3 = C9133l.f18776l;
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC2691l.yandex(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListBilling = C9133l.billing(context, jobScheduler);
                if (arrayListBilling != null && !arrayListBilling.isEmpty()) {
                    Iterator it2 = arrayListBilling.iterator();
                    while (it2.hasNext()) {
                        C9133l.yandex(jobScheduler, ((JobInfo) it2.next()).getId());
                    }
                }
                ((Number) AbstractC2021l.purchase(workDatabase2.Signature().yandex, false, true, new C8125l(19))).intValue();
                AbstractC3387l.loadAd(c13432l2.loadAd, workDatabase2, c13432l2.purchase);
                return Unit.INSTANCE;
            case 16:
                return ((Worker) obj).crashlytics();
            default:
                Object objCrashlytics = ((C10861l) ((C16424l) obj).yandex).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (objCrashlytics != null) {
                    return (StreamConfigurationMap) objCrashlytics;
                }
                C8339l.smaato("Required value was null.");
                return null;
        }
    }
}
