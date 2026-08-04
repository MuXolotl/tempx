package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؒٞۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1225l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7044l f3263l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3264l;

    public /* synthetic */ C1225l(C7044l c7044l, int i) {
        this.f3264l = i;
        this.f3263l = c7044l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f3264l;
        C7044l c7044l = this.f3263l;
        switch (i) {
            case 0:
                c7044l.m4125private(new C9270l());
                return Unit.INSTANCE;
            case 1:
                ((AppActivity) c7044l.isVip()).f36637l.yandex();
                return Unit.INSTANCE;
            default:
                return AbstractC8016l.crashlytics(c7044l.f34617l);
        }
    }
}
