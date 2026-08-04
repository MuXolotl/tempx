package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙُٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13984l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11941l f27285l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27286l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13984l(C11941l c11941l, int i) {
        super(1);
        this.f27286l = i;
        this.f27285l = c11941l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f27286l;
        C11941l c11941l = this.f27285l;
        switch (i) {
            case 0:
                c11941l.adcel(((InterfaceC18212l) obj).pro());
                break;
            case 1:
                c11941l.m3295setPopupContentSizefhxjrPA(new C4999l(((C4999l) obj).yandex));
                c11941l.ads();
                break;
            case 2:
                c11941l.f23785l = (C0616l) obj;
                break;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = c11941l.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = c11941l.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0037l(6, function0));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
