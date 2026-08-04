package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.widget.Toast;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15638l {
    public static final DecimalFormat yandex;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        yandex = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }

    public static String loadAd(int i) {
        StringBuilder sb = new StringBuilder();
        C2491l c2491l = C2491l.yandex;
        c2491l.getClass();
        C8634l c8634l = C2491l.mopub;
        InterfaceC13922l interfaceC13922l = C2491l.loadAd[2];
        if (((Boolean) c8634l.pro(c2491l)).booleanValue()) {
            return String.valueOf(i);
        }
        DecimalFormat decimalFormat = yandex;
        if (i >= 1000000) {
            sb.append(decimalFormat.format(i / 1000000.0f));
            sb.append("M");
            return sb.toString();
        }
        if (i < 1000) {
            return String.valueOf(i);
        }
        sb.append(decimalFormat.format(i / 1000.0f));
        sb.append("K");
        return sb.toString();
    }

    public static void yandex(String str) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        ((ClipboardManager) vKXApplication.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("VKXClipboard", str));
        if (Build.VERSION.SDK_INT < 33) {
            VKXApplication vKXApplication2 = VKXApplication.f36631l;
            Toast.makeText(vKXApplication2 != null ? vKXApplication2 : null, "Скопировано!", 0).show();
        }
    }
}
