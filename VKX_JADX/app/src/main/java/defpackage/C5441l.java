package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘؕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5441l extends AbstractC15114l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public String[] f11664l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte[][] f11665l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long[] f11666l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int[] f11667l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Cursor f11668l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public double[] f11669l;

    public static void vip(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            AbstractC13628l.smaato(25, "column index out of range");
            throw null;
        }
    }

    public final Cursor adcel() {
        Cursor cursor = this.f11668l;
        if (cursor != null) {
            return cursor;
        }
        AbstractC13628l.smaato(21, "no row");
        throw null;
    }

    public final void billing(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.f11667l;
        if (iArr.length < i3) {
            this.f11667l = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.f11666l;
            if (jArr.length < i3) {
                this.f11666l = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f11669l;
            if (dArr.length < i3) {
                this.f11669l = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f11664l;
            if (strArr.length < i3) {
                this.f11664l = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f11665l;
        if (bArr.length < i3) {
            this.f11665l = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f29650l) {
            yandex();
            this.f11667l = new int[0];
            this.f11666l = new long[0];
            this.f11669l = new double[0];
            this.f11664l = new String[0];
            this.f11665l = new byte[0][];
            reset();
        }
        this.f29650l = true;
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: final */
    public final void mo824final(int i, String str) {
        yandex();
        billing(3, i);
        this.f11667l[i] = 3;
        this.f11664l[i] = str;
    }

    @Override // defpackage.InterfaceC14742l
    public final void firebase(int i, long j) {
        yandex();
        billing(1, i);
        this.f11667l[i] = 1;
        this.f11666l[i] = j;
    }

    @Override // defpackage.InterfaceC14742l
    public final byte[] getBlob(int i) {
        yandex();
        Cursor cursorAdcel = adcel();
        vip(cursorAdcel, i);
        return cursorAdcel.getBlob(i);
    }

    @Override // defpackage.InterfaceC14742l
    public final int getColumnCount() {
        yandex();
        mopub();
        Cursor cursor = this.f11668l;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC14742l
    public final String getColumnName(int i) {
        yandex();
        mopub();
        Cursor cursor = this.f11668l;
        if (cursor != null) {
            vip(cursor, i);
            return cursor.getColumnName(i);
        }
        C8339l.smaato("Required value was null.");
        return null;
    }

    @Override // defpackage.InterfaceC14742l
    public final long getLong(int i) {
        yandex();
        Cursor cursorAdcel = adcel();
        vip(cursorAdcel, i);
        return cursorAdcel.getLong(i);
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: implements */
    public final String mo826implements(int i) {
        yandex();
        Cursor cursorAdcel = adcel();
        vip(cursorAdcel, i);
        return cursorAdcel.getString(i);
    }

    @Override // defpackage.InterfaceC14742l
    public final boolean isNull(int i) {
        yandex();
        Cursor cursorAdcel = adcel();
        vip(cursorAdcel, i);
        return cursorAdcel.isNull(i);
    }

    @Override // defpackage.InterfaceC14742l
    /* JADX INFO: renamed from: lؙ۟ٙ */
    public final boolean mo827l() {
        yandex();
        mopub();
        Cursor cursor = this.f11668l;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        C8339l.smaato("Required value was null.");
        return false;
    }

    @Override // defpackage.InterfaceC14742l
    public final void metrica(int i) {
        yandex();
        billing(5, i);
        this.f11667l[i] = 5;
    }

    public final void mopub() {
        if (this.f11668l == null) {
            C3316l c3316l = new C3316l(23, this);
            C11442l c11442l = this.f29652l;
            c11442l.getClass();
            final C4508l c4508l = new C4508l(5, c3316l);
            this.f11668l = c11442l.f23028l.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: lُۣۜ
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) c4508l.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((C5441l) c3316l.f7072l).f29651l, C11442l.f23024l, null);
        }
    }

    @Override // defpackage.InterfaceC14742l
    public final void reset() {
        yandex();
        Cursor cursor = this.f11668l;
        if (cursor != null) {
            cursor.close();
        }
        this.f11668l = null;
    }

    @Override // defpackage.InterfaceC14742l
    public final void smaato(int i, byte[] bArr) {
        yandex();
        billing(4, i);
        this.f11667l[i] = 4;
        this.f11665l[i] = bArr;
    }
}
