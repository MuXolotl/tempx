package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌؓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8520l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0311l f17615l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17616l;

    public /* synthetic */ C8520l(C0311l c0311l, int i) {
        this.f17616l = i;
        this.f17615l = c0311l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f17616l;
        C0311l c0311l = this.f17615l;
        switch (i) {
            case 0:
                c0311l.m423import(!((Boolean) c0311l.f1358l.getValue()).booleanValue());
                break;
            case 1:
                c0311l.f1358l.setValue(Boolean.TRUE);
                C10892l.yandex.yandex(true);
                break;
            case 2:
                c0311l.f1358l.setValue(Boolean.FALSE);
                C10892l.yandex.yandex(false);
                break;
            default:
                c0311l.f1358l.setValue(Boolean.FALSE);
                C10892l.yandex.yandex(false);
                break;
        }
        return Unit.INSTANCE;
    }
}
