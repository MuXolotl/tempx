package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* JADX INFO: renamed from: lُۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11442l implements Closeable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final SQLiteDatabase f23028l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final String[] f23025l = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final String[] f23024l = new String[0];

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final InterfaceC1220l f23027l = AbstractC9968l.crashlytics(3, new C8241l(3));

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final InterfaceC1220l f23026l = AbstractC9968l.crashlytics(3, new C8241l(4));

    public C11442l(SQLiteDatabase sQLiteDatabase) {
        this.f23028l = sQLiteDatabase;
    }

    public final void adcel(String str) {
        this.f23028l.execSQL(str);
    }

    public final void ads(Object[] objArr) {
        this.f23028l.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final void billing() {
        this.f23028l.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23028l.close();
    }

    public final boolean isVip() {
        return this.f23028l.inTransaction();
    }

    public final C8008l mopub(String str) {
        return new C8008l(this.f23028l.compileStatement(str));
    }

    public final void signatures() {
        this.f23028l.setTransactionSuccessful();
    }

    public final void vip() {
        this.f23028l.endTransaction();
    }

    public final void yandex() {
        this.f23028l.beginTransaction();
    }
}
