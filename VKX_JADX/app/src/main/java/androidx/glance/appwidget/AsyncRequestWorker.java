package androidx.glance.appwidget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC11463l;
import defpackage.AbstractC11990l;
import defpackage.AbstractC17278l;
import defpackage.AbstractC1872l;
import defpackage.C11208l;
import defpackage.C12086l;
import defpackage.C16552l;
import defpackage.C2975l;
import defpackage.C6541l;
import defpackage.InterfaceC14029l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/glance/appwidget/AsyncRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance-appwidget"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AsyncRequestWorker extends CoroutineWorker {
    public final C11208l admob;
    public final C2975l mopub;

    public AsyncRequestWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C16552l c16552l = AbstractC11463l.yandex;
        this.mopub = AbstractC17278l.yandex;
        Object obj = workerParameters.loadAd.yandex.get("request");
        byte[] bArr = null;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    C6541l.subs("null cannot be cast to non-null type kotlin.Byte");
                    throw null;
                }
                bArr2[i] = ((Byte) obj2).byteValue();
            }
            bArr = bArr2;
        }
        this.admob = C11208l.m3052throws(bArr);
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: amazon */
    public final AbstractC1872l getIsPro() {
        return this.mopub;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object crashlytics(InterfaceC14029l interfaceC14029l) {
        return AbstractC11990l.admob(new C12086l(this, null, 29), interfaceC14029l);
    }
}
