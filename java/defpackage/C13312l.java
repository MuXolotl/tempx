package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: lِْۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13312l {
    public final AbstractC13851l amazon;
    public final C14062l crashlytics;
    public final AbstractC13851l loadAd;
    public final AbstractC13851l purchase;
    public final Context yandex;

    public C13312l(Context context, C3307l c3307l) {
        AbstractC13851l c9733l;
        C14062l c14062l = new C14062l(context.getApplicationContext(), c3307l, 0);
        C14062l c14062l2 = new C14062l(context.getApplicationContext(), c3307l, 1);
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            Context applicationContext = context.getApplicationContext();
            String str = AbstractC14602l.yandex;
            c9733l = i >= 24 ? new C9733l(applicationContext, c3307l) : new C14960l(applicationContext, c3307l);
        } else {
            c9733l = null;
        }
        C14062l c14062l3 = new C14062l(context.getApplicationContext(), c3307l, 2);
        this.yandex = context;
        this.loadAd = c14062l;
        this.crashlytics = c14062l2;
        this.amazon = c9733l;
        this.purchase = c14062l3;
    }
}
