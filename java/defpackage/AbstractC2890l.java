package defpackage;

import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؔۚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2890l {
    public static String[] yandex() {
        ArrayList arrayList = new ArrayList();
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        for (File file : vKXApplication.getExternalFilesDirs(null)) {
            if (file != null) {
                String path = file.getPath();
                if (Environment.isExternalStorageRemovable(file)) {
                    arrayList.add(path);
                }
            }
        }
        if (arrayList.isEmpty()) {
            String str = "";
            try {
                Process processStart = new ProcessBuilder(new String[0]).command("mount | grep /dev/block/vold").redirectErrorStream(true).start();
                processStart.waitFor();
                InputStream inputStream = processStart.getInputStream();
                byte[] bArr = new byte[1024];
                while (inputStream.read(bArr) != -1) {
                    str = str + new String(bArr);
                }
                inputStream.close();
            } catch (Exception e) {
                if (!(e instanceof IOException)) {
                    e.printStackTrace();
                }
            }
            if (!str.trim().isEmpty()) {
                for (String str2 : str.split("\n")) {
                    arrayList.add(str2.split(" ")[2]);
                }
            }
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (!((String) arrayList.get(i)).split("/Android")[0].toLowerCase().matches(".*[0-9a-f]{4}[-][0-9a-f]{4}")) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        String[] strArr = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = (String) arrayList.get(i2);
        }
        return strArr;
    }
}
