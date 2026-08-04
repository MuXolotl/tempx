package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: lًٌٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8000l implements InterfaceC2785l, InterfaceC11724l, InterfaceC0407l, InterfaceC12350l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f16665l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16666l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ long f16667l;

    public /* synthetic */ C8000l(long j, Object obj, Object obj2) {
        this.f16666l = obj;
        this.f16665l = obj2;
        this.f16667l = j;
    }

    @Override // defpackage.InterfaceC0407l
    public Object apply(Object obj) {
        String str = (String) this.f16666l;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC4628l) this.f16665l).f9411l;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f16667l;
            if (z) {
                sQLiteDatabase.execSQL(AbstractC2812l.subscription(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        C13208l c13208l = (C13208l) this.f16666l;
        interfaceC4725l.Signature(c13208l.crashlytics, i, ((C2427l) this.f16665l).crashlytics(c13208l.m3611l(), true), this.f16667l);
    }

    @Override // defpackage.InterfaceC2785l
    public void loadAd(InterfaceC15189l interfaceC15189l) {
        ((C5976l) interfaceC15189l.get()).amazon((String) this.f16666l, this.f16667l, (C11024l) this.f16665l);
    }

    @Override // defpackage.InterfaceC12350l
    public Object purchase() {
        C7644l c7644l = (C7644l) this.f16666l;
        C4330l c4330l = (C4330l) this.f16665l;
        C16163l c16163l = (C16163l) c7644l.f15734l;
        long jAdmob = ((InterfaceC4701l) c7644l.f15735l).admob() + this.f16667l;
        c16163l.getClass();
        c16163l.mopub(new C9435l(jAdmob, c4330l));
        return null;
    }

    public /* synthetic */ C8000l(String str, long j, C11024l c11024l) {
        this.f16666l = str;
        this.f16667l = j;
        this.f16665l = c11024l;
    }
}
