package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: lّْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13070l implements InterfaceC11497l {
    public final Context yandex;

    public C13070l(Context context) {
        this.yandex = context;
    }

    @Override // defpackage.InterfaceC11497l
    public final Uri amazon(File file, String str, String str2) throws IOException {
        C15512l c15512l;
        Uri uriCreateDocument;
        C15512l c15512l2;
        Uri uriCreateDocument2;
        Uri uri = Uri.parse(str);
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
        Context context = this.yandex;
        C15512l c15512l3 = new C15512l(null, context, uriBuildDocumentUriUsingTree);
        List listM3338public = AbstractC12024l.m3338public(str2, new String[]{"/"}, 6);
        int size = listM3338public.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (c15512l3 != null && i2 != AbstractC14055l.smaato(listM3338public)) {
                String str3 = (String) listM3338public.get(i2);
                C15512l[] c15512lArrAmazon = c15512l3.amazon();
                int length = c15512lArrAmazon.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        c15512l2 = c15512lArrAmazon[i3];
                        if (!AbstractC16648l.license(str3, c15512l2.loadAd(), true)) {
                            i3++;
                        }
                    } else {
                        c15512l2 = null;
                    }
                }
                if (c15512l2 == null) {
                    String str4 = (String) listM3338public.get(i2);
                    switch (c15512l3.loadAd) {
                        case 0:
                            throw new UnsupportedOperationException();
                        default:
                            Context context2 = c15512l3.crashlytics;
                            try {
                                uriCreateDocument2 = DocumentsContract.createDocument(context2.getContentResolver(), c15512l3.amazon, "vnd.android.document/directory", str4);
                            } catch (Exception unused) {
                                uriCreateDocument2 = null;
                            }
                            c15512l2 = uriCreateDocument2 != null ? new C15512l(c15512l3, context2, uriCreateDocument2) : null;
                            break;
                    }
                }
                c15512l3 = c15512l2;
            }
        }
        if (c15512l3 == null) {
            C10754l.metrica(AbstractC14814l.adcel("Couldn't create a directory for root=", str, " and path=", str2));
            return null;
        }
        String str5 = (String) AbstractC16901l.m4214continue(listM3338public);
        C15512l[] c15512lArrAmazon2 = c15512l3.amazon();
        int length2 = c15512lArrAmazon2.length;
        while (true) {
            if (i < length2) {
                c15512l = c15512lArrAmazon2[i];
                if (!AbstractC16648l.license(str5, c15512l.loadAd(), true)) {
                    i++;
                }
            } else {
                c15512l = null;
            }
        }
        if (c15512l == null) {
            String str6 = (String) AbstractC16901l.m4214continue(listM3338public);
            switch (c15512l3.loadAd) {
                case 0:
                    throw new UnsupportedOperationException();
                default:
                    Context context3 = c15512l3.crashlytics;
                    try {
                        uriCreateDocument = DocumentsContract.createDocument(context3.getContentResolver(), c15512l3.amazon, "application/ytkameme", str6);
                    } catch (Exception unused2) {
                        uriCreateDocument = null;
                    }
                    c15512l = uriCreateDocument != null ? new C15512l(c15512l3, context3, uriCreateDocument) : null;
                    break;
            }
        }
        if (c15512l == null) {
            StringBuilder sbLicense = AbstractC14814l.license("Couldn't create a file for root=", str, ", path=", str2, " and directory=");
            sbLicense.append(c15512l3.crashlytics());
            throw new IllegalArgumentException(sbLicense.toString().toString());
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(c15512l.crashlytics(), "w");
        if (outputStreamOpenOutputStream == null) {
            StringBuilder sbLicense2 = AbstractC14814l.license("Couldn't create a file for root=", str, ", path=", str2, ", directory=");
            sbLicense2.append(c15512l3.crashlytics());
            sbLicense2.append(" and file=");
            sbLicense2.append(c15512l.crashlytics());
            throw new IllegalArgumentException(sbLicense2.toString().toString());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                AbstractC11036l.purchase(fileInputStream, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
                fileInputStream.close();
                file.delete();
                return c15512l.crashlytics();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(outputStreamOpenOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC7876l.loadAd(fileInputStream, th3);
                throw th4;
            }
        }
    }

    @Override // defpackage.InterfaceC11497l
    public final void crashlytics(File file, String str, String str2) {
        boolean zEquals;
        file.delete();
        C15512l c15512lPurchase = purchase(str, str2);
        do {
            switch (c15512lPurchase.loadAd) {
                case 0:
                    DocumentsContract.deleteDocument(c15512lPurchase.crashlytics.getContentResolver(), c15512lPurchase.amazon);
                    break;
                default:
                    try {
                        DocumentsContract.deleteDocument(c15512lPurchase.crashlytics.getContentResolver(), c15512lPurchase.amazon);
                    } catch (Exception unused) {
                    }
                    break;
            }
            c15512lPurchase = c15512lPurchase.yandex;
            if (c15512lPurchase == null) {
                return;
            }
            switch (c15512lPurchase.loadAd) {
                case 0:
                    zEquals = "vnd.android.document/directory".equals(AbstractC9334l.admob(c15512lPurchase.crashlytics, c15512lPurchase.amazon, "mime_type"));
                    break;
                default:
                    zEquals = "vnd.android.document/directory".equals(AbstractC9334l.admob(c15512lPurchase.crashlytics, c15512lPurchase.amazon, "mime_type"));
                    break;
            }
            if (!zEquals) {
                return;
            }
        } while (c15512lPurchase.amazon().length == 0);
    }

    @Override // defpackage.InterfaceC11497l
    public final boolean loadAd(String str, String str2) {
        return purchase(str, str2).yandex();
    }

    public final C15512l purchase(String str, String str2) {
        Uri uri = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentsContract.getTreeDocumentId(uri));
        if (AbstractC12024l.m3320else(str) != '/') {
            str2 = AbstractC14814l.startapp("/", str2);
        }
        sb.append(str2);
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, sb.toString());
        C15512l c15512l = new C15512l(null);
        c15512l.crashlytics = this.yandex;
        c15512l.amazon = uriBuildDocumentUriUsingTree;
        return c15512l;
    }

    @Override // defpackage.InterfaceC11497l
    public final File yandex(String str, String str2) {
        File file = new File(this.yandex.getFilesDir(), "saf_tempFile.".concat(AbstractC12024l.m3348transient('.', str2, "")));
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file;
    }
}
