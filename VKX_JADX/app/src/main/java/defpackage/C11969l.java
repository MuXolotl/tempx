package defpackage;

import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11969l {
    public final C8688l admob;
    public final AbstractC1872l amazon;
    public final AbstractC1872l billing;
    public final AbstractC1872l crashlytics;
    public final InterfaceC2262l loadAd;
    public final C8688l mopub;
    public final Executor purchase;
    public final InterfaceC2262l yandex;

    public C11969l(InterfaceC2262l interfaceC2262l, InterfaceC2262l interfaceC2262l2, AbstractC1872l abstractC1872l, AbstractC1872l abstractC1872l2, Executor executor, AbstractC1872l abstractC1872l3, Function0 function0, C18324l c18324l) {
        this.yandex = interfaceC2262l;
        this.loadAd = interfaceC2262l2;
        this.crashlytics = abstractC1872l;
        this.amazon = abstractC1872l2;
        this.purchase = executor;
        this.billing = abstractC1872l3;
        this.mopub = new C8688l(new C5583l(12, function0));
        this.admob = new C8688l(new C5767l(27, c18324l));
    }

    public final Object loadAd(long j, Function1 function1) {
        try {
            return AbstractC10999l.subs(this.crashlytics, new C10118l(this, function1, j, null));
        } catch (InterruptedException e) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
            return null;
        }
    }

    public final Handler yandex() {
        return (Handler) this.mopub.getValue();
    }
}
