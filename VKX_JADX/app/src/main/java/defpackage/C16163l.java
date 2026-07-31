package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: lٖؔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16163l implements Closeable {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C7017l f31657l = new C7017l("proto");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC4701l f31658l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC4701l f31659l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6377l f31660l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC15897l f31661l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C17964l f31662l;

    public C16163l(InterfaceC4701l interfaceC4701l, InterfaceC4701l interfaceC4701l2, C17964l c17964l, C6377l c6377l, InterfaceC15897l interfaceC15897l) {
        this.f31660l = c6377l;
        this.f31659l = interfaceC4701l;
        this.f31658l = interfaceC4701l2;
        this.f31662l = c17964l;
        this.f31661l = interfaceC15897l;
    }

    public static Long billing(SQLiteDatabase sQLiteDatabase, C4330l c4330l) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c4330l.yandex, String.valueOf(AbstractC8542l.yandex(c4330l.crashlytics))));
        byte[] bArr = c4330l.loadAd;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String isVip(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C6468l) it.next()).yandex);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object signatures(Cursor cursor, InterfaceC0407l interfaceC0407l) {
        try {
            return interfaceC0407l.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final void adcel(long j, EnumC4628l enumC4628l, String str) {
        mopub(new C8000l(j, str, enumC4628l));
    }

    public final Object ads(InterfaceC12350l interfaceC12350l) {
        SQLiteDatabase sQLiteDatabaseYandex = yandex();
        InterfaceC4701l interfaceC4701l = this.f31658l;
        long jAdmob = interfaceC4701l.admob();
        while (true) {
            try {
                sQLiteDatabaseYandex.beginTransaction();
                try {
                    Object objPurchase = interfaceC12350l.purchase();
                    sQLiteDatabaseYandex.setTransactionSuccessful();
                    return objPurchase;
                } finally {
                    sQLiteDatabaseYandex.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC4701l.admob() >= ((long) this.f31662l.crashlytics) + jAdmob) {
                    throw new C1325l("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31660l.close();
    }

    public final Object mopub(InterfaceC0407l interfaceC0407l) {
        SQLiteDatabase sQLiteDatabaseYandex = yandex();
        sQLiteDatabaseYandex.beginTransaction();
        try {
            Object objApply = interfaceC0407l.apply(sQLiteDatabaseYandex);
            sQLiteDatabaseYandex.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseYandex.endTransaction();
        }
    }

    public final ArrayList vip(SQLiteDatabase sQLiteDatabase, C4330l c4330l, int i) {
        ArrayList arrayList = new ArrayList();
        Long lBilling = billing(sQLiteDatabase, c4330l);
        if (lBilling == null) {
            return arrayList;
        }
        signatures(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lBilling.toString()}, null, null, null, String.valueOf(i)), new C17706l(this, arrayList, c4330l, 17));
        return arrayList;
    }

    public final SQLiteDatabase yandex() {
        C6377l c6377l = this.f31660l;
        Objects.requireNonNull(c6377l);
        InterfaceC4701l interfaceC4701l = this.f31658l;
        long jAdmob = interfaceC4701l.admob();
        while (true) {
            try {
                return c6377l.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC4701l.admob() >= ((long) this.f31662l.crashlytics) + jAdmob) {
                    throw new C1325l("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
