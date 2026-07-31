package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: renamed from: lًۧۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8434l extends View {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ RunnableC0295l f17443l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8434l(RunnableC0295l runnableC0295l, Context context) {
        super(context);
        this.f17443l = runnableC0295l;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        this.f17443l.run();
    }
}
