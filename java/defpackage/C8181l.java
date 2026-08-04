package defpackage;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lًٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8181l {
    public static final C0022l mopub = new C0022l("SessionTransController", null);
    public C17667l billing;
    public boolean purchase;
    public final C12100l yandex;
    public final Set loadAd = DesugarCollections.synchronizedSet(new HashSet());
    public final HandlerC4052l crashlytics = new HandlerC4052l(Looper.getMainLooper(), 6);
    public final RunnableC5033l amazon = new RunnableC5033l(this, 1);

    public C8181l(C12100l c12100l) {
        this.yandex = c12100l;
    }

    public final void yandex() {
        HandlerC4052l handlerC4052l = this.crashlytics;
        AbstractC1051l.subs(handlerC4052l);
        RunnableC5033l runnableC5033l = this.amazon;
        AbstractC1051l.subs(runnableC5033l);
        handlerC4052l.removeCallbacks(runnableC5033l);
    }
}
