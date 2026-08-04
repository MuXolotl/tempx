package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: lؗۦّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5286l extends AbstractC15422l {
    public final /* synthetic */ AbstractC15422l firebase;
    public final /* synthetic */ ThreadPoolExecutor smaato;

    public C5286l(AbstractC15422l abstractC15422l, ThreadPoolExecutor threadPoolExecutor) {
        this.firebase = abstractC15422l;
        this.smaato = threadPoolExecutor;
    }

    @Override // defpackage.AbstractC15422l
    public final void billing(C12014l c12014l) {
        ThreadPoolExecutor threadPoolExecutor = this.smaato;
        try {
            this.firebase.billing(c12014l);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.AbstractC15422l
    public final void purchase(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.smaato;
        try {
            this.firebase.purchase(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
