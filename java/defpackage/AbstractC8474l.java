package defpackage;

import java.io.File;
import java.util.LinkedHashMap;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8474l {
    public static final LinkedHashMap loadAd;
    public static final File yandex;

    static {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        File file = new File(vKXApplication.getDir("devdb", 0), "OnDevice_Catalog.dat");
        yandex = file;
        loadAd = new LinkedHashMap();
        if (!file.exists()) {
            file.createNewFile();
        }
        AbstractC2030l.smaato(file, new C1306l(18));
    }
}
