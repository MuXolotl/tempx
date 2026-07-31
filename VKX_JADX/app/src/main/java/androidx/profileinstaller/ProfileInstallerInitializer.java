package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.C16936l;
import defpackage.InterfaceC13497l;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC13497l {
    @Override // defpackage.InterfaceC13497l
    public final List loadAd() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.InterfaceC13497l
    public final Object yandex(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C16936l(8);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: lؔٛۙ
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC13950l.isPro(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC10205l(applicationContext, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new C16936l(8);
    }
}
