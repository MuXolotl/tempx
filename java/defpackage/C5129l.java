package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: lْؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5129l implements InterfaceC11497l {
    @Override // defpackage.InterfaceC11497l
    public final Uri amazon(File file, String str, String str2) {
        return Uri.fromFile(file);
    }

    @Override // defpackage.InterfaceC11497l
    public final void crashlytics(File file, String str, String str2) {
        String[] list;
        do {
            if (file != null) {
                file.delete();
            }
            file = file != null ? file.getParentFile() : null;
            if (file == null || !file.isDirectory() || (list = file.list()) == null) {
                return;
            }
        } while (list.length == 0);
    }

    @Override // defpackage.InterfaceC11497l
    public final boolean loadAd(String str, String str2) {
        return new File(str, str2).exists();
    }

    @Override // defpackage.InterfaceC11497l
    public final File yandex(String str, String str2) {
        File file = new File(str, str2);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file;
    }
}
