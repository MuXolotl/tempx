package defpackage;

import android.os.ConditionVariable;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lّ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12889l extends Thread {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f25344l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f25345l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25346l = 2;

    public C12889l(C13802l c13802l) {
        super("KtorShutdownHook");
        this.f25345l = c13802l;
        this.f25344l = new AtomicBoolean(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f25346l) {
            case 0:
                if (((AtomicBoolean) this.f25344l).compareAndSet(true, false)) {
                    ((C13802l) this.f25345l).invoke();
                    return;
                }
                return;
            case 1:
                synchronized (((C12220l) this.f25344l)) {
                    ((ConditionVariable) this.f25345l).open();
                    C12220l.yandex((C12220l) this.f25344l);
                    ((C12220l) this.f25344l).loadAd.getClass();
                    break;
                }
                return;
            default:
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.f25344l;
                InputStream inputStream = (InputStream) this.f25345l;
                byte[] bArr = new byte[1024];
                while (true) {
                    try {
                        try {
                            int i = inputStream.read(bArr);
                            if (i > 0) {
                                autoCloseOutputStream.write(bArr, 0, i);
                            } else {
                                autoCloseOutputStream.flush();
                                inputStream.close();
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                            inputStream.close();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        try {
                            autoCloseOutputStream.close();
                            Unit unit3 = Unit.INSTANCE;
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            inputStream.close();
                            Unit unit4 = Unit.INSTANCE;
                            break;
                        } catch (Throwable unused2) {
                        }
                        try {
                            autoCloseOutputStream.close();
                            Unit unit5 = Unit.INSTANCE;
                            throw th;
                        } catch (Throwable unused3) {
                            throw th;
                        }
                    }
                }
        }
    }

    public C12889l(InputStream inputStream, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream) {
        super("MS => PFD TransferThread");
        this.f25345l = inputStream;
        this.f25344l = autoCloseOutputStream;
        setDaemon(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12889l(C12220l c12220l, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f25344l = c12220l;
        this.f25345l = conditionVariable;
    }
}
