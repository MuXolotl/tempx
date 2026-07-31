package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: lُؚِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10894l extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ int f22017l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14785l f22018l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f22019l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C7972l f22020l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f22021l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f22022l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f22023l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C11387l f22024l;

    public C10894l(Context context, String str, final C7972l c7972l, final C14785l c14785l, boolean z) {
        super(context, str, null, c14785l.f28908l, new DatabaseErrorHandler(c14785l, c7972l) { // from class: lٖٗؔ
            public final /* synthetic */ C7972l yandex;

            {
                this.yandex = c7972l;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = C10894l.f22017l;
                C7972l c7972l2 = this.yandex;
                C11442l c11442l = (C11442l) c7972l2.f16631l;
                if (c11442l == null || !AbstractC8576l.yandex(c11442l.f23028l, sQLiteDatabase)) {
                    c11442l = new C11442l(sQLiteDatabase);
                    c7972l2.f16631l = c11442l;
                }
                SQLiteDatabase sQLiteDatabase2 = c11442l.f23028l;
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c11442l + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C14785l.remoteconfig(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c11442l.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            C14785l.remoteconfig((String) ((Pair) it.next()).second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            C14785l.remoteconfig(path2);
                        }
                    }
                }
            }
        });
        this.f22021l = context;
        this.f22020l = c7972l;
        this.f22018l = c14785l;
        this.f22023l = z;
        this.f22024l = new C11387l(context.getCacheDir(), str == null ? UUID.randomUUID().toString() : str, false);
    }

    public final C11442l billing(SQLiteDatabase sQLiteDatabase) {
        C7972l c7972l = this.f22020l;
        C11442l c11442l = (C11442l) c7972l.f16631l;
        if (c11442l != null && AbstractC8576l.yandex(c11442l.f23028l, sQLiteDatabase)) {
            return c11442l;
        }
        C11442l c11442l2 = new C11442l(sQLiteDatabase);
        c7972l.f16631l = c11442l2;
        return c11442l2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C11387l c11387l = this.f22024l;
        try {
            c11387l.yandex(c11387l.yandex);
            super.close();
            this.f22020l.f16631l = null;
            this.f22019l = false;
        } finally {
            c11387l.loadAd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.sqlite.SQLiteDatabase] */
    public final SQLiteDatabase mopub(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f22019l;
        Context context = this.f22021l;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return z ? getWritableDatabase() : getReadableDatabase();
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                this = z ? getWritableDatabase() : getReadableDatabase();
                return this;
            } catch (Throwable th) {
                th = th;
                if (th instanceof C16204l) {
                    C16204l c16204l = (C16204l) th;
                    int iInmobi = AbstractC5020l.inmobi(c16204l.f31704l);
                    th = c16204l.f31703l;
                    if (iInmobi == 0 || iInmobi == 1 || iInmobi == 2 || iInmobi == 3) {
                        throw th;
                    }
                    if (iInmobi != 4) {
                        C18725l.billing();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f22023l) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z ? this.getWritableDatabase() : this.getReadableDatabase();
                } catch (C16204l e) {
                    throw e.f31703l;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.f22022l;
        C14785l c14785l = this.f22018l;
        if (!z && c14785l.f28908l != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            billing(sQLiteDatabase);
            c14785l.getClass();
        } catch (Throwable th) {
            throw new C16204l(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            ((C3512l) this.f22018l.f28907l).amazon(new C15802l(billing(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new C16204l(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f22022l = true;
        try {
            this.f22018l.license(billing(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C16204l(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f22022l) {
            try {
                C14785l c14785l = this.f22018l;
                C11442l c11442lBilling = billing(sQLiteDatabase);
                C3512l c3512l = (C3512l) c14785l.f28907l;
                c3512l.billing(new C15802l(c11442lBilling));
                c3512l.mopub = c11442lBilling;
            } catch (Throwable th) {
                throw new C16204l(5, th);
            }
        }
        this.f22019l = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f22022l = true;
        try {
            this.f22018l.license(billing(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C16204l(3, th);
        }
    }

    public final C11442l yandex(boolean z) {
        C11387l c11387l = this.f22024l;
        try {
            c11387l.yandex((this.f22019l || getDatabaseName() == null) ? false : true);
            this.f22022l = false;
            SQLiteDatabase sQLiteDatabaseMopub = mopub(z);
            if (!this.f22022l) {
                return billing(sQLiteDatabaseMopub);
            }
            close();
            return yandex(z);
        } finally {
            c11387l.loadAd();
        }
    }
}
