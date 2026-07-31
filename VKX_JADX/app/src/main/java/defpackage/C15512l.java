package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15512l {
    public Uri amazon;
    public Context crashlytics;
    public final /* synthetic */ int loadAd;
    public final C15512l yandex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15512l(C15512l c15512l, Context context, Uri uri) {
        this(c15512l, (byte) 0);
        this.loadAd = 1;
        this.crashlytics = context;
        this.amazon = uri;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[LOOP:1: B:27:0x0075->B:29:0x0078, LOOP_END] */
    public final C15512l[] amazon() {
        Uri[] uriArr;
        C15512l[] c15512lArr;
        switch (this.loadAd) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.crashlytics;
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = this.amazon;
                Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
                ArrayList arrayList = new ArrayList();
                Cursor cursorQuery = null;
                try {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
                            }
                            try {
                                AbstractC9361l.applovin(cursorQuery);
                            } catch (RuntimeException e) {
                                throw e;
                            }
                            break;
                        } catch (Throwable th) {
                            if (cursorQuery == null) {
                                throw th;
                            }
                            try {
                                AbstractC9361l.applovin(cursorQuery);
                                throw th;
                            } catch (RuntimeException e2) {
                                throw e2;
                            } catch (Exception unused) {
                                throw th;
                            }
                        }
                    } catch (Exception e3) {
                        Log.w("DocumentFile", "Failed query: " + e3);
                        if (cursorQuery != null) {
                            try {
                                AbstractC9361l.applovin(cursorQuery);
                            } catch (RuntimeException e4) {
                                throw e4;
                            }
                            break;
                        }
                        uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                        c15512lArr = new C15512l[uriArr.length];
                        for (int i = 0; i < uriArr.length; i++) {
                            c15512lArr[i] = new C15512l(this, context, uriArr[i]);
                        }
                        return c15512lArr;
                    }
                    break;
                } catch (Exception unused2) {
                }
                uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                c15512lArr = new C15512l[uriArr.length];
                while (i < uriArr.length) {
                    c15512lArr[i] = new C15512l(this, context, uriArr[i]);
                }
                return c15512lArr;
        }
    }

    public final Uri crashlytics() {
        switch (this.loadAd) {
            case 0:
                break;
        }
        return this.amazon;
    }

    public final String loadAd() {
        switch (this.loadAd) {
            case 0:
                break;
        }
        return AbstractC9334l.admob(this.crashlytics, this.amazon, "_display_name");
    }

    public final boolean yandex() {
        switch (this.loadAd) {
            case 0:
                break;
        }
        return AbstractC9334l.purchase(this.crashlytics, this.amazon);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15512l(C15512l c15512l) {
        this(c15512l, (byte) 0);
        this.loadAd = 0;
    }

    public C15512l(C15512l c15512l, byte b) {
        this.yandex = c15512l;
    }
}
