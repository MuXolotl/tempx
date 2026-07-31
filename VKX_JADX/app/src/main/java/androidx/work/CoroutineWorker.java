package androidx.work;

import android.content.Context;
import defpackage.AbstractC10586l;
import defpackage.AbstractC11174l;
import defpackage.AbstractC16137l;
import defpackage.AbstractC1872l;
import defpackage.AbstractC2021l;
import defpackage.AbstractC8576l;
import defpackage.C0462l;
import defpackage.C16565l;
import defpackage.C17676l;
import defpackage.C18280l;
import defpackage.InterfaceC14029l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Llٖٟؒ;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "l٘ۡۢ", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends AbstractC16137l {
    public final C18280l billing;
    public final WorkerParameters purchase;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.purchase = workerParameters;
        this.billing = C18280l.f35776l;
    }

    /* JADX INFO: renamed from: amazon */
    public AbstractC1872l getIsPro() {
        return this.billing;
    }

    public abstract Object crashlytics(InterfaceC14029l interfaceC14029l);

    @Override // defpackage.AbstractC16137l
    public final C16565l loadAd() {
        return AbstractC2021l.amazon((!AbstractC8576l.yandex(getIsPro(), C18280l.f35776l) ? getIsPro() : this.purchase.purchase).mo246l(AbstractC11174l.yandex()), new C17676l(this, null, 1));
    }

    @Override // defpackage.AbstractC16137l
    public final C16565l yandex() {
        AbstractC1872l isPro = getIsPro();
        C0462l c0462lYandex = AbstractC11174l.yandex();
        isPro.getClass();
        return AbstractC2021l.amazon(AbstractC10586l.billing(isPro, c0462lYandex), new C17676l(this, null, 0));
    }
}
