package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7787l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18014l f16313l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16314l;

    public /* synthetic */ C7787l(C18014l c18014l, int i) {
        this.f16314l = i;
        this.f16313l = c18014l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f16314l;
        C18014l c18014l = this.f16313l;
        switch (i) {
            case 0:
                c18014l.m4125private(new C9270l());
                return Unit.INSTANCE;
            case 1:
                ((AppActivity) c18014l.isVip()).f36637l.yandex();
                return Unit.INSTANCE;
            default:
                return AbstractC8016l.crashlytics(c18014l.f34617l);
        }
    }
}
