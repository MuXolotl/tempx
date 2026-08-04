package defpackage;

import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؙِٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC12010l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23935l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23936l;

    public /* synthetic */ ExecutorC12010l(int i, Object obj) {
        this.f23936l = i;
        this.f23935l = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f23936l;
        Object obj = this.f23935l;
        switch (i) {
            case 0:
                ((C1080l) obj).m797private(runnable);
                break;
            case 1:
                ((C14500l) obj).amazon(runnable);
                break;
            case 2:
                AbstractC15323l.m3966final(((C6845l) obj).f14306l, runnable);
                break;
            case 3:
                AbstractC15323l.m3966final(((C9716l) obj).f19809l, runnable);
                break;
            case 4:
                ((View) obj).postOnAnimation(runnable);
                break;
            default:
                C14338l c14338l = (C14338l) obj;
                c14338l.loadAd.execute(new RunnableC10311l(c14338l, runnable, 17));
                break;
        }
    }
}
