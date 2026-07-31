package androidx.car.app;

import defpackage.AbstractC6475l;
import defpackage.C5268l;
import defpackage.EnumC8981l;
import defpackage.InterfaceC17155l;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ subs this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ AbstractC6475l val$lifecycle;
    final /* synthetic */ InterfaceC17155l val$listener;

    public CarContext$1(subs subsVar, AbstractC6475l abstractC6475l, Executor executor, InterfaceC17155l interfaceC17155l) {
        this.this$0 = subsVar;
        this.val$lifecycle = abstractC6475l;
        this.val$executor = executor;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (((C5268l) this.val$lifecycle).subs.yandex(EnumC8981l.f18520l)) {
            this.val$executor.execute(new admob(Arrays.asList(strArr), Arrays.asList(strArr2), 1));
        }
    }
}
