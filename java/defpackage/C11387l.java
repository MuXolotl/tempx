package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: lُ۠ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11387l {
    public static final HashMap purchase = new HashMap();
    public FileChannel amazon;
    public final Lock crashlytics;
    public final File loadAd;
    public final boolean yandex;

    public C11387l(File file, String str, boolean z) {
        Lock lock;
        this.yandex = z;
        this.loadAd = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = purchase;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.crashlytics = lock;
    }

    public final void loadAd() {
        try {
            FileChannel fileChannel = this.amazon;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.crashlytics.unlock();
    }

    public final void yandex(boolean z) {
        this.crashlytics.lock();
        if (z) {
            File file = this.loadAd;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.amazon = channel;
            } catch (IOException e) {
                this.amazon = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }
}
