package defpackage;

import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: lٗٚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17231l {
    public static final String yandex;

    static {
        int i = AbstractC13223l.yandex;
        File file = new File(".");
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        yandex = file.getCanonicalFile().toString();
    }
}
