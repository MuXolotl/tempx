package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: renamed from: lّٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13957l extends Paint {
    public final /* synthetic */ int yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13957l(PorterDuff.Mode mode) {
        super(1);
        this.yandex = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.yandex) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(AbstractC7484l.crashlytics(i));
                } else {
                    setColor((AbstractC7484l.crashlytics(i) << 24) | (getColor() & 16777215));
                }
                break;
            default:
                super.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.yandex) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13957l(int i, int i2) {
        super(i);
        this.yandex = i2;
    }

    private final void yandex(LocaleList localeList) {
    }
}
