package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lؓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1977l implements InterfaceC12350l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16163l f4490l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4491l;

    public /* synthetic */ C1977l(C16163l c16163l, int i) {
        this.f4491l = i;
        this.f4490l = c16163l;
    }

    @Override // defpackage.InterfaceC12350l
    public final Object purchase() {
        int i = this.f4491l;
        C16163l c16163l = this.f4490l;
        boolean z = false;
        switch (i) {
            case 0:
                c16163l.getClass();
                int i2 = C8724l.purchase;
                C12014l c12014l = new C12014l(7, z);
                c12014l.f23940l = null;
                c12014l.f23944l = new ArrayList();
                c12014l.f23943l = null;
                c12014l.f23941l = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseYandex = c16163l.yandex();
                sQLiteDatabaseYandex.beginTransaction();
                try {
                    C8724l c8724l = (C8724l) C16163l.signatures(sQLiteDatabaseYandex.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C17706l(c16163l, map, c12014l, 18));
                    sQLiteDatabaseYandex.setTransactionSuccessful();
                    return c8724l;
                } finally {
                    sQLiteDatabaseYandex.endTransaction();
                }
            default:
                long jAdmob = c16163l.f31659l.admob() - c16163l.f31662l.amazon;
                SQLiteDatabase sQLiteDatabaseYandex2 = c16163l.yandex();
                sQLiteDatabaseYandex2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jAdmob)};
                    Cursor cursorRawQuery = sQLiteDatabaseYandex2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c16163l.adcel(cursorRawQuery.getInt(0), EnumC4628l.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseYandex2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseYandex2.setTransactionSuccessful();
                    sQLiteDatabaseYandex2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseYandex2.endTransaction();
                    throw th2;
                }
        }
    }
}
