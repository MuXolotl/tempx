package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: renamed from: lؑۦٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C0710l implements InterfaceC7723l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final SQLiteProgram f2198l;

    public C0710l(SQLiteProgram sQLiteProgram) {
        this.f2198l = sQLiteProgram;
    }

    @Override // defpackage.InterfaceC7723l
    public final void applovin(int i, String str) {
        this.f2198l.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2198l.close();
    }

    @Override // defpackage.InterfaceC7723l
    public final void firebase(int i, long j) {
        this.f2198l.bindLong(i, j);
    }

    @Override // defpackage.InterfaceC7723l
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void mo669l(double d, int i) {
        this.f2198l.bindDouble(i, d);
    }

    @Override // defpackage.InterfaceC7723l
    public final void metrica(int i) {
        this.f2198l.bindNull(i);
    }

    @Override // defpackage.InterfaceC7723l
    public final void smaato(int i, byte[] bArr) {
        this.f2198l.bindBlob(i, bArr);
    }
}
