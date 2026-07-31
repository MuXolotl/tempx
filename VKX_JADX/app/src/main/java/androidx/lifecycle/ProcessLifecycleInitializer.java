package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.AbstractC13448l;
import defpackage.C10111l;
import defpackage.C10339l;
import defpackage.C10854l;
import defpackage.C13261l;
import defpackage.C2580l;
import defpackage.C8339l;
import defpackage.EnumC14812l;
import defpackage.InterfaceC13497l;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Llْٛٗ;", "Llؕؕٚ;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements InterfaceC13497l {
    @Override // defpackage.InterfaceC13497l
    public final List loadAd() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC13497l
    public final Object yandex(Context context) {
        if (!((HashSet) C10111l.ads(context).f20586l).contains(ProcessLifecycleInitializer.class)) {
            C8339l.smaato("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!AbstractC13448l.yandex.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C13261l());
        }
        C10854l c10854l = C10854l.f21938l;
        c10854l.getClass();
        c10854l.f21944l = new Handler();
        c10854l.f21946l.purchase(EnumC14812l.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C10339l(c10854l));
        return c10854l;
    }
}
