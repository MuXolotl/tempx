package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًًؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7692l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C1693l f16144l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1693l f16145l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C1693l f16146l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C1693l f16147l;

    public C7692l(C1693l c1693l, C1693l c1693l2, C1693l c1693l3, C1693l c1693l4) {
        this.f16146l = c1693l;
        this.f16145l = c1693l2;
        this.f16144l = c1693l3;
        this.f16147l = c1693l4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1693l c1693l = new C1693l(this.f16146l + "[index]", 5);
        C1693l c1693lCrashlytics = c1693l.crashlytics("url");
        C3768l c3768l = new C3768l(c1693l, this.f16147l, 21);
        ArrayList arrayList = ((C10238l) obj).yandex;
        int i = 29;
        C5501l c5501l = new C5501l(i, c1693lCrashlytics);
        C10238l c10238l = new C10238l();
        c3768l.invoke(c10238l);
        arrayList.add(new C2494l(c5501l, c10238l.yandex, i));
        C1693l c1693l2 = this.f16145l;
        int i2 = 27;
        arrayList.add(new C13568l(c1693l2, new C13568l(c1693l2, new C14513l(1, 22, (byte) 0), 26), i2));
        C14513l c14513l = new C14513l(1, 22, (byte) 0);
        C1693l c1693l3 = this.f16144l;
        arrayList.add(new C13568l(c1693l3, new C18396l(c1693l3, c14513l, i), i2));
        return Unit.INSTANCE;
    }
}
