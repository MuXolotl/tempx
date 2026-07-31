package androidx.work;

import android.content.Context;
import defpackage.AbstractC11064l;
import defpackage.AbstractC16137l;
import defpackage.C0233l;
import defpackage.C13932l;
import defpackage.C15263l;
import defpackage.C15687l;
import defpackage.C16565l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Llٖٟؒ;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends AbstractC16137l {
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract C0233l crashlytics();

    @Override // defpackage.AbstractC16137l
    public final C16565l loadAd() {
        return AbstractC11064l.purchase(new C15263l(this.loadAd.amazon, new C13932l(16, this), 26));
    }

    @Override // defpackage.AbstractC16137l
    public final C16565l yandex() {
        return AbstractC11064l.purchase(new C15263l(this.loadAd.amazon, new C15687l(this), 26));
    }
}
