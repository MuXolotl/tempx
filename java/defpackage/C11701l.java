package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: lًًِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11701l implements InterfaceC14033l {
    @Override // defpackage.InterfaceC14033l
    public final OutputStream amazon(Uri uri) throws IOException {
        File fileIsPro = C9552l.isPro(uri);
        AbstractC5578l.crashlytics(fileIsPro);
        return new C17407l(new FileOutputStream(fileIsPro), fileIsPro);
    }

    @Override // defpackage.InterfaceC14033l
    public final void billing(Uri uri, Uri uri2) throws IOException {
        File fileIsPro = C9552l.isPro(uri);
        File fileIsPro2 = C9552l.isPro(uri2);
        AbstractC5578l.crashlytics(fileIsPro2);
        if (!fileIsPro.renameTo(fileIsPro2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.InterfaceC14033l
    public final File crashlytics(Uri uri) {
        return C9552l.isPro(uri);
    }

    @Override // defpackage.InterfaceC14033l
    public final boolean loadAd(Uri uri) {
        return C9552l.isPro(uri).exists();
    }

    @Override // defpackage.InterfaceC14033l
    public final String mopub() {
        return "file";
    }

    @Override // defpackage.InterfaceC14033l
    public final void purchase(Uri uri) throws IOException {
        File fileIsPro = C9552l.isPro(uri);
        if (fileIsPro.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileIsPro.delete()) {
            return;
        }
        if (!fileIsPro.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.InterfaceC14033l
    public final C2279l yandex(Uri uri) throws C8413l {
        File fileIsPro = C9552l.isPro(uri);
        return new C2279l(new FileInputStream(fileIsPro), fileIsPro);
    }
}
