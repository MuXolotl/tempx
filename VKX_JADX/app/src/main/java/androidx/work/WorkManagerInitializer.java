package androidx.work;

import android.content.Context;
import defpackage.AbstractC9151l;
import defpackage.C12211l;
import defpackage.C13432l;
import defpackage.C14513l;
import defpackage.InterfaceC13497l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC13497l {
    public static final String yandex = C14513l.applovin("WrkMgrInitializer");

    @Override // defpackage.InterfaceC13497l
    public final List loadAd() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.InterfaceC13497l
    public final Object yandex(Context context) {
        C14513l.tapsense().vip(yandex, "Initializing WorkManager with default configuration.");
        C12211l c12211l = new C12211l();
        synchronized (C13432l.remoteconfig) {
            try {
                C13432l c13432l = C13432l.firebase;
                if (c13432l != null && C13432l.smaato != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c13432l == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (C13432l.smaato == null) {
                        C13432l.smaato = AbstractC9151l.billing(applicationContext, c12211l);
                    }
                    C13432l.firebase = C13432l.smaato;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C13432l.crashlytics(context);
    }
}
