package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘِۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11670l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6935l f23384l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23385l;

    public /* synthetic */ C11670l(C6935l c6935l, int i) {
        this.f23385l = i;
        this.f23384l = c6935l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f23385l;
        C6935l c6935l = this.f23384l;
        switch (i) {
            case 0:
                c6935l.yandex = -(((int) (((C4999l) obj).yandex & 4294967295L)) - c6935l.amazon.admob());
                break;
            default:
                c6935l.crashlytics(((Number) ((C14734l) obj).purchase.getValue()).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
