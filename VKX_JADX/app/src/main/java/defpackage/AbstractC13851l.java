package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓؐ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13851l {
    public final Context loadAd;
    public Object purchase;
    public final C3307l yandex;
    public final Object crashlytics = new Object();
    public final LinkedHashSet amazon = new LinkedHashSet();

    public AbstractC13851l(Context context, C3307l c3307l) {
        this.yandex = c3307l;
        this.loadAd = context.getApplicationContext();
    }

    public abstract void amazon();

    public abstract void crashlytics();

    public final void loadAd(Object obj) {
        synchronized (this.crashlytics) {
            Object obj2 = this.purchase;
            if (obj2 == null || !obj2.equals(obj)) {
                this.purchase = obj;
                this.yandex.amazon.execute(new RunnableC7762l(AbstractC16901l.m4213const(this.amazon), this, 26));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public abstract Object yandex();
}
