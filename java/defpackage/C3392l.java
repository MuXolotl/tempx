package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.Window;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3392l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f7238l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7239l;

    public /* synthetic */ C3392l(Context context, int i) {
        this.f7239l = i;
        this.f7238l = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        int i = this.f7239l;
        Context context = this.f7238l;
        switch (i) {
            case 0:
                Activity activityIsPro = AbstractC11028l.isPro(context);
                if (activityIsPro == null || (window = activityIsPro.getWindow()) == null) {
                    return new C2714l(0);
                }
                window.addFlags(128);
                return new C9582l(0, window);
            case 1:
                Activity activityIsPro2 = AbstractC11028l.isPro(context);
                if (activityIsPro2 == null) {
                    return new C2714l(1);
                }
                int requestedOrientation = activityIsPro2.getRequestedOrientation();
                activityIsPro2.setRequestedOrientation(1);
                return new C9353l(activityIsPro2, requestedOrientation);
            default:
                return BitmapFactory.decodeResource(context.getApplicationContext().getResources(), ((Integer) obj).intValue());
        }
    }
}
