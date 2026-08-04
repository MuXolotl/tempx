package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؔۤۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3020l {
    public final C8688l loadAd = new C8688l(new C10740l(2, this));
    public final Context yandex;

    public C3020l(VKXApplication vKXApplication) {
        this.yandex = vKXApplication;
    }

    public final int loadAd(float f) {
        int iYandex = yandex(7);
        int iYandex2 = yandex(1);
        Handler handler = AbstractC13209l.yandex;
        float f2 = (int) (f * 100.0f);
        float f3 = 100.0f - f2;
        return Color.argb((int) Math.floor(((Color.alpha(iYandex2) / 100.0f) * f2) + ((Color.alpha(iYandex) / 100.0f) * f3)), (int) Math.floor(((Color.red(iYandex2) / 100.0f) * f2) + ((Color.red(iYandex) / 100.0f) * f3)), (int) Math.floor(((Color.green(iYandex2) / 100.0f) * f2) + ((Color.green(iYandex) / 100.0f) * f3)), (int) Math.floor(((Color.blue(iYandex2) / 100.0f) * f2) + ((Color.blue(iYandex) / 100.0f) * f3)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final int yandex(int i) {
        int i2;
        C8288l c8288l = (C8288l) this.loadAd.getValue();
        if (AbstractC8317l.startapp) {
            switch (i) {
                case 1:
                    i2 = R.color.system_accent1_200;
                    break;
                case 2:
                    i2 = R.color.system_accent1_800;
                    break;
                case 3:
                    i2 = R.color.system_accent2_200;
                    break;
                case 4:
                    i2 = R.color.system_accent2_800;
                    break;
                case 5:
                    i2 = R.color.system_accent2_700;
                    break;
                case 6:
                    i2 = R.color.system_accent2_100;
                    break;
                case 7:
                    i2 = R.color.system_neutral1_900;
                    break;
                case 8:
                    i2 = R.color.system_neutral1_100;
                    break;
                case 9:
                    i2 = R.color.system_neutral2_700;
                    break;
                case 10:
                    i2 = R.color.system_neutral2_200;
                    break;
                default:
                    throw null;
            }
        } else {
            switch (i) {
                case 1:
                    i2 = R.color.system_accent1_600;
                    break;
                case 2:
                    i2 = R.color.system_accent1_0;
                    break;
                case 3:
                    i2 = R.color.system_accent2_600;
                    break;
                case 4:
                    i2 = R.color.system_accent2_0;
                    break;
                case 5:
                    i2 = R.color.system_accent2_100;
                    break;
                case 6:
                    i2 = R.color.system_accent2_900;
                    break;
                case 7:
                    i2 = R.color.system_neutral1_10;
                    break;
                case 8:
                    i2 = R.color.system_neutral1_900;
                    break;
                case 9:
                    i2 = R.color.system_neutral2_100;
                    break;
                case 10:
                    i2 = R.color.system_neutral2_700;
                    break;
                default:
                    throw null;
            }
        }
        return AbstractC14093l.subs(c8288l.getColor(i2), 255);
    }
}
