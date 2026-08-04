package defpackage;

import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18439l implements InterfaceC6474l {
    public ActionMode admob;
    public final Function0 crashlytics;
    public Runnable isPro;
    public final Function1 loadAd;
    public RunnableC10613l subs;
    public final View yandex;
    public final C16801l amazon = new C16801l();
    public final C0298l purchase = new C0298l(new C9319l(this, 0));
    public final C9319l billing = new C9319l(this, 1);
    public final C9319l mopub = new C9319l(this, 2);

    public C18439l(View view, Function1 function1, Function0 function0) {
        this.yandex = view;
        this.loadAd = function1;
        this.crashlytics = function0;
    }

    @Override // defpackage.InterfaceC6474l
    public final Object yandex(InterfaceC15209l interfaceC15209l, AbstractC5563l abstractC5563l) {
        Object objLoadAd = C16801l.loadAd(this.amazon, new C6208l(this, interfaceC15209l, null, 1), abstractC5563l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }
}
