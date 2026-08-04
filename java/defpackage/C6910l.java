package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.util.Log;
import java.io.File;
import java.security.Security;
import java.util.Map;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.Conscrypt;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؙۧۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6910l implements InterfaceC17639l {
    public static final C6910l yandex = new C6910l();

    @Override // defpackage.InterfaceC17639l
    public final void yandex(Context context) {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = (VKXApplication) context;
        VKXApplication.f36631l = vKXApplication;
        System.loadLibrary("vkx");
        Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
        Security.insertProviderAt(new BouncyCastleProvider(), 1);
        Security.insertProviderAt(Conscrypt.newProvider(), 2);
        VKXApplication.f36630l = (ConnectivityManager) vKXApplication.getApplicationContext().getSystemService("connectivity");
        C15589l c15589l = C5013l.yandex;
        Context applicationContext = vKXApplication.getApplicationContext();
        File externalFilesDir = vKXApplication.getApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = new File(vKXApplication.getApplicationContext().getFilesDir(), "OCBugReporting");
        }
        String packageName = vKXApplication.getApplicationContext().getPackageName();
        C10568l c10568l = EnumC1496l.f3745l;
        C15589l c15589l2 = new C15589l(packageName, 16);
        boolean z = C7181l.purchase.crashlytics(vKXApplication.getApplicationContext(), C13268l.yandex) == 0;
        try {
            C5013l.yandex = c15589l2;
            C5013l.loadAd = C5013l.yandex(applicationContext, z);
            String str = C14025l.f27330l;
            C5013l.crashlytics = C6162l.ads(externalFilesDir);
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: lًۣٗ
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) throws Throwable {
                    C15589l c15589l3 = C5013l.yandex;
                    C5013l.purchase(C5013l.crashlytics(thread, th, EnumC4900l.Crash, C14054l.f27396l));
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        } catch (Exception e) {
            Log.e("OcCrashReporting", "[VK X] Crash reporting install failure: " + e.getMessage());
            e.printStackTrace();
        }
        C5013l.amazon.add(new C6757l());
        Context applicationContext2 = vKXApplication.getApplicationContext();
        AbstractC3957l.amazon = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0);
        AbstractC3957l.purchase = vKXApplication.getApplicationContext().getSharedPreferences("user", 0);
        vKXApplication.getApplicationContext().getSharedPreferences("op_widgets", 0);
        vKXApplication.getApplicationContext().getSharedPreferences("op_proxy", 0);
        AbstractC3957l.billing = vKXApplication.getApplicationContext().getSharedPreferences("op_fallback", 0);
        AbstractC13273l.billing = vKXApplication.getApplicationContext().getSharedPreferences("op_prefs", 0);
        C11897l c11897l = AbstractC14085l.yandex;
        if (!((Boolean) c11897l.yandex()).booleanValue()) {
            SharedPreferences sharedPreferences = AbstractC3957l.amazon;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            Object it = ((C4617l) AbstractC14085l.loadAd.entrySet()).iterator();
            while (((AbstractC15951l) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C0437l) it).next();
                if (sharedPreferences.contains((String) entry.getKey())) {
                    ((AbstractC2277l) entry.getValue()).loadAd(Boolean.valueOf(sharedPreferences.getBoolean((String) entry.getKey(), false)));
                }
            }
            c11897l.loadAd(Boolean.TRUE);
        }
        VKXApplication.Companion companion2 = VKXApplication.f36628l;
        VKXApplication.f36627l = new C1424l(context, 20);
        SharedPreferences sharedPreferences2 = AbstractC3957l.amazon;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = null;
        }
        if (sharedPreferences2.getLong("oc_resets_in", 0L) <= System.currentTimeMillis()) {
            C15589l c15589l3 = C5013l.yandex;
            try {
                C14025l c14025l = C5013l.crashlytics;
                if (c14025l != null) {
                    C12382l c12382l = AbstractC5921l.f12465l;
                    c12382l.ads(c14025l);
                    c12382l.mopub(c14025l);
                }
            } catch (Throwable unused) {
            }
            SharedPreferences sharedPreferences3 = AbstractC3957l.amazon;
            SharedPreferences.Editor editorEdit = (sharedPreferences3 != null ? sharedPreferences3 : null).edit();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C6760l c6760l = C9658l.f19699l;
            editorEdit.putLong("oc_resets_in", C9658l.amazon(AbstractC15918l.tapsense(7, EnumC16636l.DAYS)) + jCurrentTimeMillis).apply();
        }
    }
}
