package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙۤۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6861l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f14349l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8050l f14350l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14351l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f14352l;

    public /* synthetic */ C6861l(C8050l c8050l, int i, int i2, int i3) {
        this.f14351l = i3;
        this.f14350l = c8050l;
        this.f14349l = i;
        this.f14352l = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f14351l;
        int i2 = this.f14352l;
        int i3 = this.f14349l;
        C8050l c8050l = this.f14350l;
        switch (i) {
            case 0:
                try {
                    c8050l.f16777l.isVip(i3, i2);
                } catch (IOException e) {
                    c8050l.yandex(2, 2, e);
                }
                break;
            default:
                try {
                    c8050l.f16777l.ads(i3, i2, true);
                } catch (IOException e2) {
                    c8050l.yandex(2, 2, e2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
