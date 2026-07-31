package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lْۢٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13745l implements ListenableFuture {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f26834l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ArrayList f26835l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ArrayList f26836l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C16565l f26837l = AbstractC11064l.purchase(new C5501l(15, this));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AtomicInteger f26838l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C5807l f26839l;

    public C13745l(ArrayList arrayList, boolean z, ExecutorC12908l executorC12908l) {
        this.f26836l = arrayList;
        this.f26835l = new ArrayList(arrayList.size());
        this.f26834l = z;
        this.f26838l = new AtomicInteger(arrayList.size());
        yandex(new RunnableC5360l(13, this), AbstractC12272l.yandex());
        if (this.f26836l.isEmpty()) {
            this.f26839l.loadAd(new ArrayList(this.f26835l));
            return;
        }
        for (int i = 0; i < this.f26836l.size(); i++) {
            this.f26835l.add(null);
        }
        ArrayList arrayList2 = this.f26836l;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i2);
            listenableFuture.yandex(new RunnableC16824l(this, i2, listenableFuture), executorC12908l);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.f26836l;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(z);
            }
        }
        return this.f26837l.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<ListenableFuture> arrayList = this.f26836l;
        if (arrayList != null && !isDone()) {
            loop0: for (ListenableFuture listenableFuture : arrayList) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f26834l) {
                            return (List) this.f26837l.f32512l.get();
                        }
                    }
                }
            }
        }
        return (List) this.f26837l.f32512l.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26837l.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26837l.f32512l.isDone();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        this.f26837l.f32512l.yandex(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.f26837l.f32512l.get(j, timeUnit);
    }
}
