package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِۦٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12250l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C12250l f24307l = new C12250l(1, AbstractC13106l.class, "printError", "printError(Ljava/lang/Exception;)V", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        if (AbstractC13106l.yandex) {
            try {
                String message = exc.getMessage();
                if (message == null) {
                    message = "An occurred in Decompose";
                }
                Log.e("Decompose", message, exc);
            } catch (Exception unused) {
                AbstractC13106l.yandex = false;
            }
        }
        return Unit.INSTANCE;
    }
}
