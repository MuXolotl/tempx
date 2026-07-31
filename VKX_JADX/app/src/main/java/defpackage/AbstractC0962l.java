package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.isPro;

/* JADX INFO: renamed from: lَؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0962l {
    public final Object crashlytics;
    public final Object loadAd;
    public int yandex;

    public AbstractC0962l(isPro ispro) {
        this.yandex = RecyclerView.UNDEFINED_DURATION;
        this.crashlytics = new Rect();
        this.loadAd = ispro;
    }

    public static AbstractC0962l yandex(isPro ispro, int i) {
        if (i == 0) {
            return new C6234l(ispro, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new C6234l(ispro, i2);
        }
        C8339l.metrica("invalid orientation");
        return null;
    }

    public abstract int admob();

    public abstract int amazon(View view);

    public abstract int billing();

    public abstract int crashlytics(View view);

    public abstract int firebase();

    public abstract int isPro();

    public abstract int loadAd(View view);

    public abstract void metrica(int i);

    public abstract int mopub();

    public abstract int purchase(View view);

    public abstract int remoteconfig(View view);

    public abstract int smaato();

    public abstract int subs();

    public abstract int vip(View view);

    public AbstractC0962l(InterfaceC17172l interfaceC17172l) {
        this.yandex = 0;
        this.crashlytics = new C10201l();
        this.loadAd = interfaceC17172l;
    }
}
