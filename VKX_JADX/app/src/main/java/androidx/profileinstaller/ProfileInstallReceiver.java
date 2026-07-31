package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.AbstractC11965l;
import defpackage.AbstractC4732l;
import defpackage.AbstractC7252l;
import defpackage.C10685l;
import defpackage.ExecutorC11374l;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        File codeCacheDir;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC4732l.loadAd(context, new ExecutorC11374l(2), new C10685l(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C10685l c10685l = new C10685l(this);
                try {
                    AbstractC4732l.yandex(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c10685l.tapsense(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    c10685l.tapsense(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C10685l c10685l2 = new C10685l(this);
            int iMyPid = Process.myPid();
            if (Build.VERSION.SDK_INT < 24) {
                c10685l2.tapsense(13, null);
                return;
            } else {
                Process.sendSignal(iMyPid, 10);
                c10685l2.tapsense(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C10685l c10685l3 = new C10685l(this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            if (!"SAVE_PROFILE".equals(string2)) {
                c10685l3.tapsense(16, null);
                return;
            }
            int i = extras.getInt("EXTRA_PID", Process.myPid());
            if (Build.VERSION.SDK_INT < 24) {
                c10685l3.tapsense(13, null);
                return;
            } else {
                Process.sendSignal(i, 10);
                c10685l3.tapsense(12, null);
                return;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            codeCacheDir = AbstractC11965l.mopub(context).getCacheDir();
        } else if (i2 >= 24) {
            codeCacheDir = AbstractC11965l.mopub(context).getCodeCacheDir();
        } else {
            codeCacheDir = i2 == 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (AbstractC7252l.amazon(codeCacheDir)) {
            c10685l3.tapsense(14, null);
        } else {
            c10685l3.tapsense(15, null);
        }
    }
}
