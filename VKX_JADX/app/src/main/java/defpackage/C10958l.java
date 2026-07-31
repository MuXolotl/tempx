package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: lَُۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10958l extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f22090l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f22091l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f22092l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C17923l f22093l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10958l(C17923l c17923l, Callable callable, boolean z) {
        super(callable);
        this.f22093l = c17923l;
        long andIncrement = C17923l.f34891l.getAndIncrement();
        this.f22092l = andIncrement;
        this.f22090l = "Task exception on worker thread";
        this.f22091l = z;
        if (andIncrement == Long.MAX_VALUE) {
            C8118l c8118l = ((C17417l) c17923l.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C10958l c10958l = (C10958l) obj;
        boolean z = c10958l.f22091l;
        boolean z2 = this.f22091l;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = c10958l.f22092l;
        long j2 = this.f22092l;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        C8118l c8118l = ((C17417l) this.f22093l.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16909l.loadAd(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        C8118l c8118l = ((C17417l) this.f22093l.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16908l.loadAd(th, this.f22090l);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10958l(C17923l c17923l, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f22093l = c17923l;
        long andIncrement = C17923l.f34891l.getAndIncrement();
        this.f22092l = andIncrement;
        this.f22090l = str;
        this.f22091l = z;
        if (andIncrement == Long.MAX_VALUE) {
            C8118l c8118l = ((C17417l) c17923l.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Tasks index overflow");
        }
    }
}
