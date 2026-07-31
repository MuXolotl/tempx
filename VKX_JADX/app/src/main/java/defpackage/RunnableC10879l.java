package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lؘُۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10879l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC14330l f21993l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1090l f21994l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21995l;

    public /* synthetic */ RunnableC10879l(C1090l c1090l, AbstractC14330l abstractC14330l, int i) {
        this.f21995l = i;
        this.f21994l = c1090l;
        this.f21993l = abstractC14330l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f21995l;
        AbstractC14330l abstractC14330l = this.f21993l;
        C1090l c1090l = this.f21994l;
        switch (i) {
            case 0:
                try {
                    abstractC14330l.billing((C11119l) c1090l.get());
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    AbstractC6427l.metrica("MLSLegacyStub", "Library operation failed", e);
                    abstractC14330l.billing(null);
                }
                break;
            default:
                try {
                    List list = (List) c1090l.get();
                    abstractC14330l.billing(list == null ? null : AbstractC8672l.mopub(list));
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    AbstractC6427l.metrica("MLSLegacyStub", "Library operation failed", e2);
                    abstractC14330l.billing(null);
                    return;
                }
                break;
        }
    }
}
