package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٍَۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10205l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f20798l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20799l;

    public /* synthetic */ RunnableC10205l(Context context, int i) {
        this.f20799l = i;
        this.f20798l = context;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C2462l c2462l;
        int i = this.f20799l;
        Context context = this.f20798l;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            Object objCrashlytics = AbstractC10242l.crashlytics();
                            if (objCrashlytics != null) {
                                c2462l = new C2462l(new C15621l(AbstractC3962l.yandex(objCrashlytics)));
                            } else {
                                c2462l = C2462l.loadAd;
                            }
                        } else {
                            c2462l = AbstractC10242l.f20857l;
                            if (c2462l == null) {
                                c2462l = C2462l.loadAd;
                            }
                        }
                        if (c2462l.yandex.isEmpty()) {
                            String strIsPro = AbstractC5573l.isPro(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                AbstractC3962l.loadAd(systemService, AbstractC2292l.yandex(strIsPro));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC10242l.f20865l = true;
                break;
            case 1:
                AbstractC10242l.metrica(context);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC10205l(context, 3));
                break;
            default:
                AbstractC4732l.loadAd(context, new ExecutorC11374l(2), AbstractC4732l.yandex, false);
                break;
        }
    }
}
