package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003e */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onCreate() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            r1 = 14
            if (r0 == 0) goto L45
            android.content.Context r2 = r0.getApplicationContext()
            if (r2 == 0) goto L43
            lَؘُ r0 = defpackage.C10111l.ads(r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.Object r2 = r0.f20589l
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = "Startup"
            android.os.Trace.beginSection(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37 java.lang.Throwable -> L3e
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37 java.lang.Throwable -> L3e
            r3.<init>(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37 java.lang.Throwable -> L3e
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37 java.lang.Throwable -> L3e
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r4 = r4.getProviderInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37 java.lang.Throwable -> L3e
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37 java.lang.Throwable -> L3e
            r0.metrica(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37 java.lang.Throwable -> L3e
            android.os.Trace.endSection()
            goto L43
        L37:
            r4 = move-exception
            lؙٓ۟ r0 = new lؙٓ۟     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        L43:
            r4 = 1
            return r4
        L45:
            lؙٓ۟ r4 = new lؙٓ۟
            java.lang.String r0 = "Context cannot be null"
            r2 = 0
            r4.<init>(r0, r1, r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.startup.InitializationProvider.onCreate():boolean");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
