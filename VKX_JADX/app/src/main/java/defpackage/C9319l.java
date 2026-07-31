package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍّؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9319l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18439l f19129l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19130l;

    public /* synthetic */ C9319l(C18439l c18439l, int i) {
        this.f19130l = i;
        this.f19129l = c18439l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19130l;
        C18439l c18439l = this.f19129l;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = c18439l.yandex;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0037l(2, function0));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ActionMode actionMode = c18439l.admob;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.INSTANCE;
            case 2:
                ActionMode actionMode2 = c18439l.admob;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return Unit.INSTANCE;
            default:
                c18439l.purchase.amazon();
                return new C9582l(4, c18439l);
        }
    }
}
