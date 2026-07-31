package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lًٝٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8149l implements ListenableFuture {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f17029l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1090l f17030l = new C1090l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8421l f17031l;

    public C8149l(C8421l c8421l) {
        this.f17031l = c8421l;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.f17030l.cancel(z)) {
            return false;
        }
        this.f17031l.ads(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws Throwable {
        Object obj = this.f17030l.get();
        if (obj instanceof C3725l) {
            throw new CancellationException().initCause(((C3725l) obj).yandex);
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        boolean z;
        if (this.f17030l.f5919l instanceof C17783l) {
            return true;
        }
        if (this.f17030l.isDone() && !this.f17029l) {
            try {
                z = AbstractC11342l.billing(this.f17030l) instanceof C3725l;
            } catch (CancellationException unused) {
                z = true;
            } catch (ExecutionException unused2) {
                this.f17029l = true;
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17030l.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        C1090l c1090l = this.f17030l;
        if (c1090l.isDone()) {
            try {
                Object objBilling = AbstractC11342l.billing(c1090l);
                if (objBilling instanceof C3725l) {
                    sb.append("CANCELLED, cause=[" + ((C3725l) objBilling).yandex + ']');
                } else {
                    sb.append("SUCCESS, result=[" + objBilling + ']');
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + ']');
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + c1090l + ']');
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void yandex(Runnable runnable, Executor executor) {
        this.f17030l.yandex(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws Throwable {
        Object obj = this.f17030l.get(j, timeUnit);
        if (obj instanceof C3725l) {
            throw new CancellationException().initCause(((C3725l) obj).yandex);
        }
        return obj;
    }
}
