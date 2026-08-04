package defpackage;

import android.widget.PopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَؔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10063l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C10038l f20537l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f20538l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20539l;

    public /* synthetic */ C10063l(Function0 function0, C10038l c10038l, int i) {
        this.f20539l = i;
        this.f20538l = function0;
        this.f20537l = c10038l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f20539l;
        C10038l c10038l = this.f20537l;
        Function0 function0 = this.f20538l;
        switch (i) {
            case 0:
                function0.invoke();
                PopupWindow popupWindow = (PopupWindow) c10038l.f20465l;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                break;
            default:
                function0.invoke();
                PopupWindow popupWindow2 = (PopupWindow) c10038l.f20465l;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
