package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؙُ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6390l implements InterfaceC2140l, InterfaceC12350l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f13370l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13371l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13372l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f13373l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f13374l;

    public /* synthetic */ C6390l(C7644l c7644l, Iterable iterable, C4330l c4330l, long j) {
        this.f13372l = 2;
        this.f13371l = c7644l;
        this.f13373l = iterable;
        this.f13374l = c4330l;
        this.f13370l = j;
    }

    @Override // defpackage.InterfaceC12350l
    public Object purchase() {
        C7644l c7644l = (C7644l) this.f13371l;
        Iterable iterable = (Iterable) this.f13373l;
        C4330l c4330l = (C4330l) this.f13374l;
        C16163l c16163l = (C16163l) c7644l.f15734l;
        c16163l.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(C16163l.isVip(iterable));
            SQLiteDatabase sQLiteDatabaseYandex = c16163l.yandex();
            sQLiteDatabaseYandex.beginTransaction();
            try {
                sQLiteDatabaseYandex.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseYandex.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c16163l.adcel(cursorRawQuery.getInt(0), EnumC4628l.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseYandex.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseYandex.setTransactionSuccessful();
                sQLiteDatabaseYandex.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseYandex.endTransaction();
                throw th2;
            }
        }
        c16163l.mopub(new C9435l(((InterfaceC4701l) c7644l.f15735l).admob() + this.f13370l, c4330l));
        return null;
    }

    @Override // defpackage.InterfaceC2140l
    public ScheduledFuture yandex(C5138l c5138l) {
        int i = this.f13372l;
        Object obj = this.f13374l;
        long j = this.f13370l;
        Object obj2 = this.f13373l;
        ScheduledExecutorServiceC6423l scheduledExecutorServiceC6423l = (ScheduledExecutorServiceC6423l) this.f13371l;
        switch (i) {
            case 0:
                return scheduledExecutorServiceC6423l.f13443l.schedule(new RunnableC7816l(scheduledExecutorServiceC6423l, (Runnable) obj2, c5138l, 1), j, (TimeUnit) obj);
            default:
                return scheduledExecutorServiceC6423l.f13443l.schedule(new CallableC7505l(scheduledExecutorServiceC6423l, (Callable) obj2, c5138l, 0), j, (TimeUnit) obj);
        }
    }

    public /* synthetic */ C6390l(ScheduledExecutorServiceC6423l scheduledExecutorServiceC6423l, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f13372l = i;
        this.f13371l = scheduledExecutorServiceC6423l;
        this.f13373l = obj;
        this.f13370l = j;
        this.f13374l = timeUnit;
    }
}
