package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.AbstractC15781l;
import defpackage.AbstractC1619l;
import defpackage.AbstractC2021l;
import defpackage.C0233l;
import defpackage.C0480l;
import defpackage.C10154l;
import defpackage.C13432l;
import defpackage.C14513l;
import defpackage.C4199l;
import defpackage.C4279l;
import defpackage.C7392l;
import defpackage.C8125l;
import defpackage.C9280l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final C0233l crashlytics() {
        C13432l c13432lCrashlytics = C13432l.crashlytics(this.yandex);
        WorkDatabase workDatabase = c13432lCrashlytics.crashlytics;
        C9280l c9280lSignature = workDatabase.Signature();
        C10154l c10154lSubscription = workDatabase.subscription();
        C0480l c0480lLicense = workDatabase.license();
        C7392l c7392lAds = workDatabase.ads();
        c13432lCrashlytics.loadAd.amazon.getClass();
        List list = (List) AbstractC2021l.purchase(c9280lSignature.yandex, true, false, new C4199l(System.currentTimeMillis() - 86400000, 12));
        AbstractC15781l abstractC15781l = c9280lSignature.yandex;
        List list2 = (List) AbstractC2021l.purchase(abstractC15781l, true, false, new C8125l(14));
        List list3 = (List) AbstractC2021l.purchase(abstractC15781l, true, false, new C8125l(18));
        if (!list.isEmpty()) {
            C14513l c14513lTapsense = C14513l.tapsense();
            String str = AbstractC1619l.yandex;
            c14513lTapsense.isVip(str, "Recently completed work:\n\n");
            C14513l.tapsense().isVip(str, AbstractC1619l.yandex(c10154lSubscription, c0480lLicense, c7392lAds, list));
        }
        if (!list2.isEmpty()) {
            C14513l c14513lTapsense2 = C14513l.tapsense();
            String str2 = AbstractC1619l.yandex;
            c14513lTapsense2.isVip(str2, "Running work:\n\n");
            C14513l.tapsense().isVip(str2, AbstractC1619l.yandex(c10154lSubscription, c0480lLicense, c7392lAds, list2));
        }
        if (!list3.isEmpty()) {
            C14513l c14513lTapsense3 = C14513l.tapsense();
            String str3 = AbstractC1619l.yandex;
            c14513lTapsense3.isVip(str3, "Enqueued work:\n\n");
            C14513l.tapsense().isVip(str3, AbstractC1619l.yandex(c10154lSubscription, c0480lLicense, c7392lAds, list3));
        }
        return new C0233l(C4279l.loadAd);
    }
}
