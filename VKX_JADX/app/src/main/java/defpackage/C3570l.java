package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕۗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3570l implements InterfaceC0914l {
    public final C8688l amazon;
    public final C13568l crashlytics;
    public final C8688l loadAd;
    public final C8688l yandex;

    public C3570l(Function0 function0) {
        C6573l c6573l = new C6573l(16);
        C6849l c6849l = C6849l.f14310l;
        C6573l c6573l2 = new C6573l(17);
        this.yandex = new C8688l(function0);
        this.loadAd = new C8688l(c6573l);
        C13568l c13568l = new C13568l(17);
        c13568l.f26581l = c6849l;
        c13568l.f26580l = C6928l.f14500l;
        this.crashlytics = c13568l;
        this.amazon = new C8688l(c6573l2);
    }

    @Override // defpackage.InterfaceC0914l
    public final InterfaceC14142l yandex(Object obj, C15106l c15106l, C13177l c13177l) {
        C16060l c16060l = (C16060l) obj;
        if (!AbstractC8576l.yandex(c16060l.crashlytics, "http") && !AbstractC8576l.yandex(c16060l.crashlytics, "https")) {
            return null;
        }
        String str = c16060l.yandex;
        C8688l c8688l = this.yandex;
        C8688l c8688l2 = new C8688l(new C10740l(7, c13177l));
        C8688l c8688l3 = this.loadAd;
        C13568l c13568l = this.crashlytics;
        Context context = c15106l.yandex;
        Object obj2 = c13568l.f26580l;
        C6928l c6928l = C6928l.f14500l;
        if (obj2 == c6928l) {
            synchronized (c13568l) {
                obj2 = c13568l.f26580l;
                if (obj2 == c6928l) {
                    Object objInvoke = ((Function1) c13568l.f26581l).invoke(context);
                    c13568l.f26580l = objInvoke;
                    c13568l.f26581l = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new C13920l(str, c15106l, c8688l, c8688l2, c8688l3, new C10933l(obj2), this.amazon);
    }
}
