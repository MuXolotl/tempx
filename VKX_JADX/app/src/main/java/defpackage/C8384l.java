package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lًۤ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8384l {
    public static final Uri mopub = Uri.parse("content://androidx.car.app.connection");
    public final C13773l amazon;
    public final AtomicBoolean billing;
    public final Executor crashlytics;
    public final RunnableC15296l loadAd;
    public final AtomicBoolean purchase;
    public final Context yandex;

    public C8384l(Context context, RunnableC15296l runnableC15296l) {
        this.yandex = context.getApplicationContext();
        this.loadAd = runnableC15296l;
        Executor executorFirebase = AbstractC2991l.firebase();
        this.crashlytics = executorFirebase;
        this.amazon = new C13773l(0, this);
        this.purchase = new AtomicBoolean();
        this.billing = new AtomicBoolean();
        executorFirebase.execute(new RunnableC7852l(this, 1));
    }

    public static /* synthetic */ void yandex(C8384l c8384l) {
        C13773l c13773l = c8384l.amazon;
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        Context context = c8384l.yandex;
        if (i >= 33) {
            context.registerReceiver(c13773l, intentFilter, 2);
        } else {
            context.registerReceiver(c13773l, intentFilter);
        }
        c8384l.loadAd();
    }

    public final void loadAd() {
        AtomicBoolean atomicBoolean = this.purchase;
        boolean z = atomicBoolean.get();
        boolean z2 = false;
        try {
            Cursor cursorQuery = this.yandex.getContentResolver().query(mopub, new String[]{"CarConnectionState"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("CarConnectionState");
                    if (columnIndex != -1 && cursorQuery.moveToNext()) {
                        boolean z3 = cursorQuery.getInt(columnIndex) != 0;
                        cursorQuery.close();
                        z2 = z3;
                    } else {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
        }
        atomicBoolean.set(z2);
        if (z == z2 || this.billing.get()) {
            return;
        }
        this.loadAd.run();
    }
}
