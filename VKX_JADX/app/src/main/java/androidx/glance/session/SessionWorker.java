package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC11463l;
import defpackage.AbstractC1585l;
import defpackage.AbstractC17278l;
import defpackage.AbstractC1753l;
import defpackage.AbstractC1872l;
import defpackage.C15428l;
import defpackage.C16552l;
import defpackage.C4279l;
import defpackage.C8339l;
import defpackage.InterfaceC15745l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Llٕ٘ؓ;", "sessionManager", "Llّٕؔ;", "timeouts", "Llُٖؓ;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Llٕ٘ؓ;Llّٕؔ;Llُٖؓ;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionWorker extends CoroutineWorker {
    public final InterfaceC15745l admob;
    public final String firebase;
    public final AbstractC1872l isPro;
    public final WorkerParameters mopub;
    public final C15428l subs;

    public SessionWorker(Context context, WorkerParameters workerParameters, InterfaceC15745l interfaceC15745l, C15428l c15428l, AbstractC1872l abstractC1872l) {
        super(context, workerParameters);
        this.mopub = workerParameters;
        this.admob = interfaceC15745l;
        this.subs = c15428l;
        this.isPro = abstractC1872l;
        C4279l c4279l = this.loadAd.loadAd;
        interfaceC15745l.getClass();
        Object obj = c4279l.yandex.get("KEY");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            this.firebase = str;
        } else {
            C8339l.smaato("SessionWorker must be started with a key");
            throw null;
        }
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: amazon, reason: from getter */
    public final AbstractC1872l getIsPro() {
        return this.isPro;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #0 {all -> 0x004f, blocks: (B:40:0x00b8, B:43:0x00d2, B:51:0x00f1, B:54:0x010a, B:15:0x004a, B:22:0x0060), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a A[Catch: all -> 0x004f, PHI: r1 r8 r12
  0x010a: PHI (r1v10 int) = (r1v9 int), (r1v11 int) binds: [B:15:0x004a, B:52:0x0107] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r8v6 lَُؖ) = (r8v5 lَُؖ), (r8v11 lَُؖ) binds: [B:15:0x004a, B:52:0x0107] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r12v16 java.lang.Object) = (r12v2 java.lang.Object), (r12v21 java.lang.Object) binds: [B:15:0x004a, B:52:0x0107] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x004f, blocks: (B:40:0x00b8, B:43:0x00d2, B:51:0x00f1, B:54:0x010a, B:15:0x004a, B:22:0x0060), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r12 == r7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        r8 = r12;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object crashlytics(defpackage.InterfaceC14029l r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.crashlytics(lٌؚٓ):java.lang.Object");
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, AbstractC1585l.yandex, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, InterfaceC15745l interfaceC15745l, C15428l c15428l, AbstractC1872l abstractC1872l, int i, AbstractC1753l abstractC1753l) {
        InterfaceC15745l interfaceC15745l2 = (i & 4) != 0 ? AbstractC1585l.yandex : interfaceC15745l;
        C15428l c15428l2 = (i & 8) != 0 ? new C15428l() : c15428l;
        if ((i & 16) != 0) {
            C16552l c16552l = AbstractC11463l.yandex;
            abstractC1872l = AbstractC17278l.yandex;
        }
        this(context, workerParameters, interfaceC15745l2, c15428l2, abstractC1872l);
    }
}
