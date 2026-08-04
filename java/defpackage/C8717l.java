package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8717l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5475l f17932l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Activity f17933l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17934l;

    public /* synthetic */ C8717l(Activity activity, InterfaceC5475l interfaceC5475l, int i) {
        this.f17934l = i;
        this.f17933l = activity;
        this.f17932l = interfaceC5475l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f17934l;
        InterfaceC5475l interfaceC5475l = this.f17932l;
        Activity activity = this.f17933l;
        switch (i) {
            case 0:
                if (activity != null) {
                    Throwable th = interfaceC5475l instanceof C10488l ? ((C10488l) interfaceC5475l).yandex : interfaceC5475l instanceof C13974l ? ((C13974l) interfaceC5475l).yandex : null;
                    if (th != null) {
                        new C3492l(th).Signature(activity);
                    }
                }
                break;
            default:
                if (activity != null) {
                    new C3492l(((C3022l) interfaceC5475l).yandex).Signature(activity);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
