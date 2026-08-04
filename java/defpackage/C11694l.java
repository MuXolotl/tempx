package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: renamed from: lِؚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11694l extends AbstractC10618l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final String[] f23442l = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f23443l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C13978l f23444l;

    public C11694l(C17417l c17417l) {
        super(c17417l);
        this.f23444l = new C13978l(this, ((C17417l) this.f833l).f33936l);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
  0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final void m3208l() {
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        if (!this.f23443l && c17417l.f33936l.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM3210l = m3210l();
                        if (sQLiteDatabaseM3210l == null) {
                            this.f23443l = true;
                            return;
                        }
                        sQLiteDatabaseM3210l.beginTransaction();
                        sQLiteDatabaseM3210l.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM3210l.setTransactionSuccessful();
                        sQLiteDatabaseM3210l.endTransaction();
                        sQLiteDatabaseM3210l.close();
                        return;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteFullException e) {
                        C8118l c8118l = c17417l.f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16908l.loadAd(e, "Error deleting app launch break from local database");
                        this.f23443l = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.loadAd(e2, "Error deleting app launch break from local database");
                    this.f23443l = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            C8118l c8118l3 = c17417l.f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16910l.yandex("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m3209l() {
        int iDelete;
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        try {
            SQLiteDatabase sQLiteDatabaseM3210l = m3210l();
            if (sQLiteDatabaseM3210l == null || (iDelete = sQLiteDatabaseM3210l.delete("messages", null, null)) <= 0) {
                return;
            }
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.loadAd(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final SQLiteDatabase m3210l() {
        if (this.f23443l) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f23444l.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f23443l = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final boolean m3211l(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseM3210l;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        boolean z3 = false;
        z3 = false;
        if (!this.f23443l) {
            C5051l c5051l = c17417l.f33945l;
            C8118l c8118l = c17417l.f33950l;
            C3032l c3032l = AbstractC5981l.f12688l;
            Cursor cursor = null;
            cursor = null;
            C10462l c10462lM2820l = c5051l.m1682l(null, c3032l) ? c17417l.remoteconfig().m2820l(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (c17417l.f33945l.m1682l(null, c3032l) && c10462lM2820l != null) {
                contentValues.put("app_version", c10462lM2820l.f21288l);
                contentValues.put("app_version_int", Long.valueOf(c10462lM2820l.f21302l));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseM3210l = m3210l();
                    if (sQLiteDatabaseM3210l == null) {
                        this.f23443l = true;
                    } else {
                        try {
                            sQLiteDatabaseM3210l.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM3210l.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        z = z3 ? 1 : 0;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM3210l != null) {
                                            sQLiteDatabaseM3210l.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        z = z3 ? 1 : 0;
                                        C17417l.admob(c8118l);
                                        c8118l.f16908l.loadAd(e, "Error writing entry; local database full");
                                        this.f23443l = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM3210l != null) {
                                            sQLiteDatabaseM3210l.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        z = z3 ? 1 : 0;
                                        z2 = true;
                                        if (sQLiteDatabaseM3210l != null) {
                                            sQLiteDatabaseM3210l.endTransaction();
                                        }
                                        C17417l.admob(c8118l);
                                        c8118l.f16908l.loadAd(e, "Error writing entry to local database");
                                        this.f23443l = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM3210l != null) {
                                            sQLiteDatabaseM3210l.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseM3210l != null) {
                                        sQLiteDatabaseM3210l.close();
                                    }
                                    throw th;
                                }
                            }
                            if (j >= 100000) {
                                C17417l.admob(c8118l);
                                c8118l.f16908l.yandex("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseM3210l.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    C17417l.admob(c8118l);
                                    C14906l c14906l = c8118l.f16908l;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                c14906l.amazon("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                C17417l.admob(c8118l);
                                                c8118l.f16908l.loadAd(e, "Error writing entry; local database full");
                                                this.f23443l = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM3210l != null) {
                                                    sQLiteDatabaseM3210l.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseM3210l != null) {
                                                    sQLiteDatabaseM3210l.endTransaction();
                                                }
                                                C17417l.admob(c8118l);
                                                c8118l.f16908l.loadAd(e, "Error writing entry to local database");
                                                this.f23443l = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM3210l != null) {
                                                    sQLiteDatabaseM3210l.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteFullException e5) {
                                            e = e5;
                                            C17417l.admob(c8118l);
                                            c8118l.f16908l.loadAd(e, "Error writing entry; local database full");
                                            this.f23443l = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM3210l != null) {
                                                sQLiteDatabaseM3210l.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            z2 = true;
                                            if (sQLiteDatabaseM3210l != null && sQLiteDatabaseM3210l.inTransaction()) {
                                                sQLiteDatabaseM3210l.endTransaction();
                                            }
                                            C17417l.admob(c8118l);
                                            c8118l.f16908l.loadAd(e, "Error writing entry to local database");
                                            this.f23443l = z2;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM3210l != null) {
                                                sQLiteDatabaseM3210l.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM3210l != null) {
                                            sQLiteDatabaseM3210l.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseM3210l.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM3210l.setTransactionSuccessful();
                            sQLiteDatabaseM3210l.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM3210l.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM3210l = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM3210l = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseM3210l = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseM3210l = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            C17417l.admob(c8118l);
            c8118l.f16911l.yandex("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }

    @Override // defpackage.AbstractC10618l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final boolean mo1234l() {
        return false;
    }
}
