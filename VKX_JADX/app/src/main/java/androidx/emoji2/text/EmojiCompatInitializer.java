package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.AbstractC6475l;
import defpackage.C10111l;
import defpackage.C12304l;
import defpackage.C3585l;
import defpackage.C4437l;
import defpackage.C9412l;
import defpackage.InterfaceC13497l;
import defpackage.InterfaceC3177l;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC13497l {
    public final void crashlytics(Context context) {
        Object objAdcel;
        C10111l c10111lAds = C10111l.ads(context);
        c10111lAds.getClass();
        synchronized (C10111l.f20581l) {
            try {
                objAdcel = ((HashMap) c10111lAds.f20587l).get(ProcessLifecycleInitializer.class);
                if (objAdcel == null) {
                    objAdcel = c10111lAds.adcel(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC6475l abstractC6475lLoadAd = ((InterfaceC3177l) objAdcel).loadAd();
        abstractC6475lLoadAd.yandex(new C4437l(this, abstractC6475lLoadAd));
    }

    @Override // defpackage.InterfaceC13497l
    public final List loadAd() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.InterfaceC13497l
    public final Object yandex(Context context) {
        C9412l c9412l = new C9412l(new C3585l(context));
        c9412l.yandex = 1;
        if (C12304l.firebase == null) {
            synchronized (C12304l.isPro) {
                try {
                    if (C12304l.firebase == null) {
                        C12304l.firebase = new C12304l(c9412l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        crashlytics(context);
        return Boolean.TRUE;
    }
}
